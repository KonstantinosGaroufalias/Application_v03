package com.ihusr.application;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Map;

public class Api
{
    private static HttpURLConnection connection;
    public Api()
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=41.088904%2C23.546338&radius=2000&type=restaurant&key=AIzaSyDK4M6soWgedHy4r6Cf_mLd1lyn2WbRpB8")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
    public static void main(String args[]) throws IOException, ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(".idea//httpRequests//cafe_serres.json"));
        JSONArray jsonArray = (JSONArray) jsonObject.get("results");


        String[] shopNames = new String[18];
        String[] shopOpening = new String[18];
        Double[] shopRate = new Double[18];
        int shopID = 0;

        for(int i=0;i<jsonArray.size();i++)
        {

            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);

            String name = (String) jsonObject1.get("name");
            System.out.println("Name: " + name);

            Map<Object, Object> opening_hours = (Map<Object, Object>) jsonObject1.get("opening_hours");
            opening_hours.forEach((key, value) -> System.out.println(key + ": " + value));

            String business_status = (String) jsonObject1.get("business_status");
            System.out.println("Buissness status:"+business_status);

            double rating = (double) jsonObject1.get("rating");
            System.out.println("Rating:"+rating);

            String vicinity= (String) jsonObject1.get("vicinity");
            System.out.println("Vicinity: " + vicinity);

            shopID++;
            System.out.println(shopID);

            shopNames[i] = name;
            shopRate[i] = rating;
            shopOpening[i] = opening_hours.toString();

            addShopToDatabase(shopID,name, opening_hours.toString(), business_status,rating,vicinity);

        }




    }

    public static Shop addShopToDatabase(Integer shopID,String name, String open_now, String business_status, double rating, String vicinity)
    {

        Shop shop = null;
        final String DB_URL = "jdbc:mysql://localhost/testing?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO shops (ID,name, open_now, business_status, rating, vicinity) " +
                    "VALUES (?,?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,shopID);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, open_now);
            preparedStatement.setString(4, business_status);
            preparedStatement.setDouble(5, rating);
            preparedStatement.setString(6, vicinity);

            //Inserting rows into the table
            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0){
                shop = new Shop();
                shop.ID = shopID;
                shop.name = name;
                shop.open_now = open_now;
                shop.business_status = business_status;
                shop.rating = (float) rating;
                shop.vicinity = vicinity;
            }
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return shop;
    }
}

