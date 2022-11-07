/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ihusr.application;

import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
/**
 *
 * @author theod
 */
public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        andressIcon = new javax.swing.JLabel();
        phoneIcon = new javax.swing.JLabel();
        userNameIcon = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1098, 603));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 48, 116));
        jLabel10.setText("Welcome Adventurer.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(159, 159, 159));
        jLabel8.setText("Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 389, -1));

        jTextField1.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 390, 40));

        jSeparator6.setBackground(new java.awt.Color(88, 101, 242));
        jSeparator6.setForeground(new java.awt.Color(88, 101, 242));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 420, 7));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(159, 159, 159));
        jLabel2.setText("ENROL TO THE APP NOW!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(159, 159, 159));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 389, -1));

        jSeparator7.setBackground(new java.awt.Color(88, 101, 242));
        jSeparator7.setForeground(new java.awt.Color(88, 101, 242));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 420, 7));

        jTextField2.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 390, 40));

        jTextField3.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 300, 180, 40));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(159, 159, 159));
        jLabel12.setText("Mobile Phone");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 207, -1));

        jSeparator8.setBackground(new java.awt.Color(88, 101, 242));
        jSeparator8.setForeground(new java.awt.Color(88, 101, 242));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 207, 20));

        jTextField4.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 170, 40));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(159, 159, 159));
        jLabel13.setText("Adress");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 207, -1));

        jSeparator9.setBackground(new java.awt.Color(88, 101, 242));
        jSeparator9.setForeground(new java.awt.Color(88, 101, 242));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 207, 20));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(159, 159, 159));
        jLabel15.setText("Password");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 420, -1));

        jPasswordField1.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 390, 40));

        jSeparator2.setBackground(new java.awt.Color(88, 101, 242));
        jSeparator2.setForeground(new java.awt.Color(88, 101, 242));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 420, 7));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(159, 159, 159));
        jLabel3.setText("Already a member ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        jButton1.setForeground(new java.awt.Color(88, 101, 242));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Please enter or fields.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 316, -1));

        jPanel2.setBackground(new java.awt.Color(88, 101, 242));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("             Register");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("gui/registerImage.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 500, 580));

        andressIcon.setIcon(new javax.swing.ImageIcon("gui/adressIcon.png")); // NOI18N
        jPanel1.add(andressIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 60, 40));

        phoneIcon.setIcon(new javax.swing.ImageIcon("gui/phoneIcon.png")); // NOI18N
        jPanel1.add(phoneIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 40));

        userNameIcon.setIcon(new javax.swing.ImageIcon("gui/userIcon.png")); // NOI18N
        jPanel1.add(userNameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 40));

        emailIcon.setIcon(new javax.swing.ImageIcon("gui/emailIcon.png")); // NOI18N
        jPanel1.add(emailIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 40));

        passwordIcon.setIcon(new javax.swing.ImageIcon("gui/passwordIcon.png")); // NOI18N
        jPanel1.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 50, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon("gui/newCloseBlue.png")); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon("gui/newMinimizeBlue.png")); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginForm loginForm = new LoginForm();
        loginForm.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        //TODO : Fix the if statement for the user's registration
        registerUser();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(126, 137, 250));

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(88, 101, 242));

    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(HomeForm.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    public static  User user;
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    private void registerUser() {

        int errorFlag=0;
        String name = jTextField2.getText();
        String email = jTextField1.getText();

        if (isValid(email))
            System.out.println(email+ "is a valid email");
        else
            System.out.println(email+ " is not a valid email");
            errorFlag=1;

        //SHOW EMAIL ERROR MESSAGE
        //jLabelEmailErrorMessage......isvisible

        String phone = jTextField3.getText();
        //CHECK PHONE
        if(phone.length() != 10)
            System.out.println(phone+ " is not a valid phone number");
            errorFlag=1;
        //jLabelPhoneErrorMessage......is visible



        String address = jTextField4.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        //String confirmPassword = String.valueOf(pfConfirmpassword.getPassword());

        if(name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()){
            jLabel1.setVisible(true);
        }

        if(name.isEmpty() && email.isEmpty() && phone.isEmpty() && address.isEmpty() && password.isEmpty())
        {
            jLabel1.setVisible(true);
        }

        user = addUserToDatabase(name, email, phone, address, password);
        if (user != null && errorFlag == 0){
            LoginForm loginForm = new LoginForm();
            loginForm.show();
            dispose();
        }
        else{
            jLabel1.setVisible(true);
        }
    }

    private User addUserToDatabase(String name, String email, String phone, String address, String password) {
        User user = null;
        final String DB_URL = "jdbc:mysql://localhost/testing?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users (name, email, phone, address, password) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password);

            //Inserting rows into the table
            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0){
                user = new User();
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.address = address;
                user.password = password;
            }
            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return user;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel andressIcon;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JLabel phoneIcon;
    private javax.swing.JLabel userNameIcon;
    // End of variables declaration//GEN-END:variables
}