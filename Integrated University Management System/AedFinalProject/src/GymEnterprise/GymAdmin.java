/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GymEnterprise;

import Pharmacy.model.MedicineModel;
import gym.gymmodel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import main.signUp;
/**
 *
 * @author Team NYAM
 */
public class GymAdmin extends javax.swing.JFrame {

    /**
     * Creates new form GymAdmin
     */
    public GymAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEmailID = new javax.swing.JLabel();
        jButtonDELETE = new javax.swing.JButton();
        jButtonUPDATE = new javax.swing.JButton();
        jLabelTITLEGYM = new javax.swing.JLabel();
        gendertext = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gymtable = new javax.swing.JTable();
        jLabelID = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        agetext = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        phonetext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        idtext = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jButtonADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmailID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelEmailID.setText("EMAIL ID:");
        jLabelEmailID.setOpaque(true);
        getContentPane().add(jLabelEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        jButtonDELETE.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDELETE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonDELETE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDELETE.setText("DELETE");
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 710, -1, -1));

        jButtonUPDATE.setBackground(new java.awt.Color(0, 0, 0));
        jButtonUPDATE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonUPDATE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUPDATE.setText("UPDATE");
        jButtonUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUPDATEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 710, -1, -1));

        jLabelTITLEGYM.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTITLEGYM.setText("MANAGE GYM MEMBER");
        jLabelTITLEGYM.setOpaque(true);
        getContentPane().add(jLabelTITLEGYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        gendertext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gendertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertextActionPerformed(evt);
            }
        });
        getContentPane().add(gendertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 110, 20));

        Gymtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Phone", "Age", "Email ID"
            }
        ));
        Gymtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GymtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Gymtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 631, 285));

        jLabelID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelID.setText("ID:");
        jLabelID.setOpaque(true);
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabelAge.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelAge.setText("AGE:");
        jLabelAge.setOpaque(true);
        getContentPane().add(jLabelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });
        getContentPane().add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 110, -1));

        jLabelName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelName.setText("NAME:");
        jLabelName.setOpaque(true);
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabelPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPhone.setText("PHONE:");
        jLabelPhone.setOpaque(true);
        getContentPane().add(jLabelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));
        getContentPane().add(agetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 107, -1));

        jLabelGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelGender.setText("GENDER:");
        jLabelGender.setOpaque(true);
        getContentPane().add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));
        getContentPane().add(phonetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 107, -1));
        getContentPane().add(nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 107, -1));

        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });
        getContentPane().add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 107, -1));

        buttonCancel.setBackground(new java.awt.Color(0, 0, 0));
        buttonCancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancel.setText("LOGOUT");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 30));

        buttonSearch.setBackground(new java.awt.Color(0, 0, 0));
        buttonSearch.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearch.setText("VIEW");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 710, -1, -1));

        buttonAdd.setBackground(new java.awt.Color(0, 0, 0));
        buttonAdd.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setText("ADD");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 710, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GymEnterprise/gym background.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1350, 1060));

        jLabelAddress.setBackground(new java.awt.Color(204, 0, 51));
        jLabelAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabelAddress.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddress.setText("Address:");
        jLabelAddress.setOpaque(true);
        getContentPane().add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jButtonADD.setText("ADD");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 290, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 1480, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gendertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertextActionPerformed

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel medModel = (DefaultTableModel)Gymtable.getModel();
        medModel.setRowCount(0);

        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "Masters@23");
            java.sql.Statement statement = connection.createStatement();
            String getgymQuery = "SELECT * FROM universitysystem.gym";
            System.out.println(getgymQuery);
            java.sql.ResultSet medData = statement.executeQuery(getgymQuery);

            while(medData.next()){
                String Id = medData.getString("ID");
                String medName = medData.getString("name");
                String gender = medData.getString("gender");
                String phone = medData.getString("phone");
                String age = medData.getString("age");
                String EmailID = medData.getString("email_id");

                String tbData[] = {Id,medName,gender, phone, age,EmailID};

                medModel.addRow(tbData);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void GymtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GymtableMouseClicked
        // TODO add your handling code here:
        
        
        DefaultTableModel tb1Model = (DefaultTableModel)Gymtable.getModel();
        
        String tb1ID = tb1Model.getValueAt(Gymtable.getSelectedRow(),0).toString();
        String tb1name = tb1Model.getValueAt(Gymtable.getSelectedRow(),1).toString();
        String tb1gender = tb1Model.getValueAt(Gymtable.getSelectedRow(),2).toString();
        String tb1phone = tb1Model.getValueAt(Gymtable.getSelectedRow(),3).toString();
        String tb1age = tb1Model.getValueAt(Gymtable.getSelectedRow(),4).toString();
        String tb1emailid = tb1Model.getValueAt(Gymtable.getSelectedRow(),5).toString();

        

       
        
       gendertext.setSelectedItem(tb1gender);
        nametext.setText(tb1name);
        phonetext.setText(tb1phone);
        idtext.setText(tb1ID);
        emailtext.setText(tb1emailid);
        agetext.setText(tb1age);
    }//GEN-LAST:event_GymtableMouseClicked

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        signUp su = new signUp();
        setVisible(false);
        su.setVisible(true);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void jButtonUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUPDATEActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel tb1Model = (DefaultTableModel)Gymtable.getModel();
        if(Gymtable.getSelectedRowCount()==1){
            
        int id =Integer.parseInt(idtext.getText());
        String name = nametext.getText();
        String phone = phonetext.getText();
        String email = emailtext.getText();
        String age = agetext.getText();
       // String gender = gendertext.getText();
       // String email = emailtext.getText();
        
        
        String gender = (String) gendertext.getSelectedItem().toString();
        
        gymmodel gymmodel = new gymmodel(id, name,gender,phone,age,email);
        gymmodel.updateMember();  
        
        tb1Model.setValueAt(id,Gymtable.getSelectedRow(), 0);
        tb1Model.setValueAt(name,Gymtable.getSelectedRow(), 1);
        tb1Model.setValueAt(gender,Gymtable.getSelectedRow(), 2); 
        tb1Model.setValueAt(phone,Gymtable.getSelectedRow(), 3); 
        tb1Model.setValueAt(age,Gymtable.getSelectedRow(), 4); 
        tb1Model.setValueAt(email,Gymtable.getSelectedRow(),5); 
  
        }
        else{
            if(Gymtable.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Select a Row");
            } 
        }
        
    }//GEN-LAST:event_jButtonUPDATEActionPerformed

    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)Gymtable.getModel();
        if(Gymtable.getSelectedRowCount()==1){
        int id = Integer.parseInt(idtext.getText());
        String name = nametext.getText();
        String phone = phonetext.getText();
        String email = emailtext.getText();
        String age = agetext.getText();
        
        String gender = (String) gendertext.getSelectedItem().toString();
        gymmodel gymmodel = new gymmodel(id, name, gender, phone, age,email);
        gymmodel.deleteMember();
        
        tb1Model.removeRow(Gymtable.getSelectedRow());
        
        idtext.setText("");
        nametext.setText("");
        phonetext.setText("");
        emailtext.setText("");
        agetext.setText("");
        gendertext.setSelectedItem("");
        
        }
        
        else{
            if(Gymtable.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Select a Row");
            } 
        }
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(idtext.getText());
        String name = nametext.getText();
        String phone = phonetext.getText();
        String email = emailtext.getText();
        String age = agetext.getText();
        String gender = (String) gendertext.getSelectedItem().toString();
        if(name.isEmpty()||phone.isEmpty()||email.isEmpty()||phone.isEmpty()||email.isEmpty()||age.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Details!");
        }
        else{
            gymmodel gymmodel = new gymmodel(id, name, gender, phone, age,email);
            gymmodel.insertMember();
        }
    }//GEN-LAST:event_buttonAddActionPerformed

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
            java.util.logging.Logger.getLogger(GymAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GymAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GymAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GymAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GymAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Gymtable;
    private javax.swing.JTextField agetext;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JTextField emailtext;
    private javax.swing.JComboBox<String> gendertext;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonUPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelTITLEGYM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField phonetext;
    // End of variables declaration//GEN-END:variables
}
