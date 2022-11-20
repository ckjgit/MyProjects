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
public class TarrifChange extends javax.swing.JFrame {

    /**
     * Creates new form TarrifChange
     */
    public TarrifChange() {
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
                System.out.println(str4);
                consumernumber.addItem(str4);
                
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        consumernumber = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        areacode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tariffid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        presenttariff = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tariffchangedto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        finalreading = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        UPDATE_ = new javax.swing.JButton();
        EDIT_ = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        INSERT_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("CHANGE OF TARIFF");

        jLabel2.setText("CONSUMER NUMBER");

        jLabel3.setText("AREA CODE");

        jLabel4.setText("Tariff ID");

        jLabel5.setText("Present Tarrif");

        jLabel6.setText("Tariff Changed To");

        jLabel7.setText("Final Reading");

        jLabel8.setText("Date Of Change");

        note.setColumns(20);
        note.setRows(5);
        jScrollPane1.setViewportView(note);

        jLabel9.setText("Note : ");

        UPDATE_.setText("UPDATE");
        UPDATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_ActionPerformed(evt);
            }
        });

        EDIT_.setText("EDIT");
        EDIT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Load");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        INSERT_.setText("INSERT");
        INSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERT_ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setText("NB :: For Edit, Consumer Choosen First.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton4)
                                            .addComponent(consumernumber, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel3)
                                        .addGap(45, 45, 45)
                                        .addComponent(areacode, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tariffid)
                                    .addComponent(presenttariff)
                                    .addComponent(tariffchangedto)
                                    .addComponent(finalreading, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(INSERT_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EDIT_)
                        .addGap(18, 18, 18)
                        .addComponent(UPDATE_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(consumernumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(areacode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tariffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(presenttariff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tariffchangedto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(finalreading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSERT_)
                    .addComponent(EDIT_)
                    .addComponent(UPDATE_)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(0, 31, Short.MAX_VALUE))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         try {
            String s2=(String)consumernumber.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st=con.createStatement();
            String s1="SELECT * FROM CONSUMER11 WHERE CONSUMERNO='"+s2+"' ";
            ResultSet rs=st.executeQuery(s1);
            
            Statement st2=con.createStatement();
            String s3="SELECT CONSUMERNO FROM CONSUMER11 WHERE CONSUMERNO='"+s2+"'  ";
            ResultSet rs2=st2.executeQuery(s3);
            String s4=null;
            while(rs2.next()!=false)
            {
                s4=rs2.getString(1);
            }
            
            if(s4.equals(s2))
            {
                while(rs.next()!=false)
                {

                    areacode.setText(rs.getString("AREACODE"));
                    tariffid.setText(rs.getString("TARIFFID"));
                    

                }
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Consumer Number Details Not Found");
               areacode.setText("");
               tariffid.setText("");
               
               
            }
                
                
            
            
             con.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void INSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERT_ActionPerformed

        try {
            
           String  V2consumerno=(String) consumernumber.getSelectedItem();
           String ac=areacode.getText();
           String ti=tariffid.getText();
           String pt=presenttariff.getText();
           String tct=tariffchangedto.getText();
           String fr=finalreading.getText();
           String day01=day.getText();
           String month01=month.getText();
           String year01=year.getText();
           String notes=note.getText();
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
           Statement st4=con4.createStatement();
            String s5="INSERT INTO TARIFFCHANGE01 VALUES ('"+V2consumerno+"', '"+ac+"', '"+ti+"', '"+pt+"', '"+tct+"', '"+fr+"', '"+day01+"', '"+month01+"', '"+year01+"', '"+notes+"')";
            
            int k5=st4.executeUpdate(s5);
            if(k5>=1)
                JOptionPane.showMessageDialog(null," Data Inserted");
            else
                JOptionPane.showMessageDialog(null, "Data Not Inserted");
            
            consumernumber.setSelectedIndex(-1);
            areacode.setText("");
            areacode.setText("");
            tariffid.setText("");
            presenttariff.setText("");
            tariffchangedto.setText("");
            finalreading.setText("");
            day.setText("");
            month.setText("");
            year.setText("");
            note.setText("");
            
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_INSERT_ActionPerformed

    private void EDIT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_ActionPerformed

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con5=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st5=con5.createStatement();
            String s55=(String) consumernumber.getSelectedItem();
            ResultSet rs2=st5.executeQuery("select consumerno from tariffchange01 where consumerno='"+s55+"' ");
            String cn01=null;
            while(rs2.next()!=false)
            {
                cn01=rs2.getString(1);
            }
            
            if(s55.equals(cn01))
            {
                    String s56=(String) consumernumber.getSelectedItem();

                String s5="SELECT * FROM tariffchange01 WHERE CONSUMERNO='"+s56+"' ";
                ResultSet rs5=st5.executeQuery(s5);
                while(rs5.next()!=false)
                {


                    areacode.setText(rs5.getString("areacode"));

                    tariffid.setText(rs5.getString("tariffid"));
                    presenttariff.setText(rs5.getString("presenttariff"));
                    tariffchangedto.setText(rs5.getString("tariffchangedto"));
                    finalreading.setText(rs5.getString("finalreading"));

                    day.setText(rs5.getString(7));
                    month.setText(rs5.getString(8));
                    year.setText(rs5.getString(9));
                    note.setText(rs5.getString(10));
                    
                    
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Consumer Details Not Exists...");
                
                 consumernumber.setSelectedIndex(-1);
            areacode.setText("");
            areacode.setText("");
            tariffid.setText("");
            presenttariff.setText("");
            tariffchangedto.setText("");
            finalreading.setText("");
            day.setText("");
            month.setText("");
            year.setText("");
            note.setText("");
            }
            
             
            
            
           con5.close();
           st5.close(); 
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_EDIT_ActionPerformed

    private void UPDATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_ActionPerformed

        
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
             Statement st3=con3.createStatement();
                   String s55=(String) consumernumber.getSelectedItem();
                   ResultSet rs2=st3.executeQuery("select consumerno from tariffchange01 where consumerno='"+s55+"' ");
                   String cn01=null;
                   while(rs2.next()!=false)
                   {
                       cn01=rs2.getString(1);
                   }

                   
                   if(s55.equals(cn01))
                   {
                        String  V2consumerno=(String) consumernumber.getSelectedItem();
                        String ac=areacode.getText();
                        String ti=tariffid.getText();
                        String pt=presenttariff.getText();
                        String tct=tariffchangedto.getText();
                        String fr=finalreading.getText();
                        String day01=day.getText();
                        String month01=month.getText();
                        String year01=year.getText();
                        String notes=note.getText();
                        
               
            
                        String ss1="UPDATE tariffchange01 SET   CONSUMERNO='"+V2consumerno+"' ,AREACODE='"+ac+"' ,TARIFFID ='"+ti+"' ,PRESENTTARIFF='"+pt+"' , TARIFFCHANGEDTO='"+tct+"' , FINALREADING='"+fr+"' , DAY='"+day01+"' , MONTH='"+month01+"' , YEAR='"+year01+"' , NOTE='"+notes+"'  ";

                        int i=st3.executeUpdate(ss1);

                        if(i>=1)
                            JOptionPane.showMessageDialog(null, "Data Updated");
                        else
                            JOptionPane.showMessageDialog(null, "Data not Updated");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "Consumer does not Exists..");
                        consumernumber.setSelectedIndex(-1);
                        areacode.setText("");
                        areacode.setText("");
                        tariffid.setText("");
                        presenttariff.setText("");
                        tariffchangedto.setText("");
                        finalreading.setText("");
                        day.setText("");
                        month.setText("");
                        year.setText("");
                        note.setText("");
                   }
            
                   
            
            st3.close();
            con3.close();
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_UPDATE_ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        OfficeAdministration o=new OfficeAdministration();
        o.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TarrifChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarrifChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarrifChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarrifChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarrifChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDIT_;
    private javax.swing.JButton INSERT_;
    private javax.swing.JButton UPDATE_;
    private javax.swing.JTextField areacode;
    private javax.swing.JComboBox consumernumber;
    private javax.swing.JTextField day;
    private javax.swing.JTextField finalreading;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField month;
    private javax.swing.JTextArea note;
    private javax.swing.JTextField presenttariff;
    private javax.swing.JTextField tariffchangedto;
    private javax.swing.JTextField tariffid;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
