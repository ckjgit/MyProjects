/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ACD extends javax.swing.JFrame {

    /**
     * Creates new form ACD
     */
    public ACD() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st4=con4.createStatement();
            String s4="SELECT CONSUMERNO FROM CONSUMER11";
            
            ResultSet rs4=st4.executeQuery(s4);
            while(rs4.next()!=false)
            {
                String str4=rs4.getString("CONSUMERNO");
                consumer_number.addItem(str4);
                
                
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        area_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        consumer_number = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        meter_reader_code = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cd_required = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cd_amount_available = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        acd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("A C D");

        jLabel2.setText("Consumer Number");

        area_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_codeActionPerformed(evt);
            }
        });

        jLabel3.setText("Area code");

        consumer_number.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        consumer_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                consumer_numberFocusLost(evt);
            }
        });

        jLabel4.setText("Metre Reader Code");

        jLabel5.setText("C D Required");

        jLabel6.setText("C D Amount Available");

        jLabel7.setText("A C D");

        jLabel8.setText("Issue ACD Notice");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        EDIT.setText("Edit");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        jLabel9.setText("NOTE : For Edit Consumer Number Choosen First");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(area_code)
                                    .addComponent(consumer_number, 0, 128, Short.MAX_VALUE)
                                    .addComponent(meter_reader_code)
                                    .addComponent(cd_required)))
                            .addComponent(cd_amount_available)
                            .addComponent(acd)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EDIT)))))
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(consumer_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(area_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meter_reader_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_required, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_amount_available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(73, 73, 73)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(EDIT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void area_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_codeActionPerformed

    private void consumer_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consumer_numberFocusLost
        
        
       String cn=(String)consumer_number.getSelectedItem();
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st4=con4.createStatement();
            String s4="SELECT ACD FROM DEPOSITDETAILS WHERE CONSUMERNO='"+cn+"' ";
            
            ResultSet rs4=st4.executeQuery(s4);
            while(rs4.next()!=false)
            {
                
                acd.setText(rs4.getString("ACD"));
              
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st4=con4.createStatement();
            String s4="SELECT CD_AMOUNT_AVAILABLE FROM CDADJUSTMENT02 WHERE CONSUMERNO='"+cn+"' ";
            
            ResultSet rs4=st4.executeQuery(s4);
            while(rs4.next()!=false)
            {
                
                cd_amount_available.setText(rs4.getString("CD_AMOUNT_AVAILABLE"));
              
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
            try {
            	Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st4=con4.createStatement();
            String s4="SELECT * FROM CONSUMER11";
            
            ResultSet rs4=st4.executeQuery(s4);
            while(rs4.next()!=false)
            {
               
                area_code.setText(rs4.getString("AREACODE"));
                meter_reader_code.setText(rs4.getString("MRCODE"));
                
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_consumer_numberFocusLost

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed

        
       try {
            String ss8=(String)consumer_number.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con8=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st8=con8.createStatement();
            Statement st88=con8.createStatement();
            
            String str8="SELECT * FROM ACD WHERE CONSUMERNO='"+ss8+"' ";
            String str88=" SELECT CONSUMERNO FROM ACD WHERE CONSUMERNO='"+ss8+"' ";
            
            ResultSet rs88=st88.executeQuery(str88);
            ResultSet rs8=st8.executeQuery(str8);
            
           
            String ss18=null;
            while(rs88.next()!=false)
            {
                ss18=rs88.getString("CONSUMERNO");
                //System.out.println("CN"+ss18);
               // System.out.println(ss8);
            }
            
            if(ss8.equals(ss18))
            {
                        while(rs8.next()!=false)
                   {
                      area_code.setText(rs8.getString(2));
                       meter_reader_code.setText(rs8.getString(3));
                        cd_required.setText(rs8.getString(4));
                         cd_amount_available.setText(rs8.getString(5));
                          acd.setText(rs8.getString(6));
                          


                   }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Consumer Number Details Not Found");
                   
            
            }  
           
             con8.close();
            st8.close();
            st88.close();
            rs8.close();
            rs88.close();
        }
        
        catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
             //JOptionPane.showMessageDialog(null,"Consumer Number Details Not Found");
        }

    }//GEN-LAST:event_EDITActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(consumer_number.getSelectedItem().equals("select")|| area_code.getText().equals("")  
                || meter_reader_code.getText().equals("") || cd_required.getText().equals("") 
                || cd_amount_available.getText().equals("") || acd.getText().equals("") 
                )
        {
            JOptionPane.showMessageDialog(null," Enter Correct Data In Appropriare Field");
        }
        else
        {
            try {
            String ConsumerNo1=(String)consumer_number.getSelectedItem();
            String CashDeposits=area_code.getText();
            String Acd=meter_reader_code.getText();
            String OyecAmount=cd_required.getText();
            String TotalNoOfInstalments=cd_amount_available.getText();
            String OyecIEOTM=acd.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con7=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st7=con7.createStatement();
            String s7="INSERT INTO ACD VALUES ('"+ConsumerNo1+"','"+CashDeposits+"', '"+Acd+"', '"+OyecAmount+"', '"+TotalNoOfInstalments+"', '"+OyecIEOTM+"')   ";
            
            int i7=st7.executeUpdate(s7);
            if(i7>=1)
                JOptionPane.showMessageDialog(null,"ACD Notice Issued..");
            else
                JOptionPane.showMessageDialog(null,"ACD Notice Not Issued..");
            
           consumer_number.setSelectedIndex(-1);
            area_code.setText("");
            meter_reader_code.setText("");
            cd_required.setText("");
            cd_amount_available.setText("");
            acd.setText("");
            
            
            st7.close();
            con7.close();
            
        }
           catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
       }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        OfficeAdministration o=new OfficeAdministration();
        o.show();dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ACD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDIT;
    private javax.swing.JTextField acd;
    private javax.swing.JTextField area_code;
    private javax.swing.JTextField cd_amount_available;
    private javax.swing.JTextField cd_required;
    private javax.swing.JComboBox consumer_number;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField meter_reader_code;
    // End of variables declaration//GEN-END:variables
}
