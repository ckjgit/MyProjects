
package electricity.billing.system;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class BillDetails extends javax.swing.JFrame {
    
    double d1 = 0;
    
    public BillDetails()
    { 
        initComponents();
        setTitle("Bill Details");
        
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
                consumer_number.addItem(str4);
                
            }
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        dutytogovt.setEditable(false);
        meterrent.setEditable(false);
        reconfee.setEditable(false);
        subsidy.setEditable(false);
        
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillDetailsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        areacode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        consumer_number = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        meterreadercode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        previousreading = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        presentreading = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        unitsconsumed = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        demandid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fixedcharge = new javax.swing.JTextField();
        energycharge = new javax.swing.JTextField();
        dutytogovt = new javax.swing.JTextField();
        meterrent = new javax.swing.JTextField();
        reconfee = new javax.swing.JTextField();
        demandfor = new javax.swing.JTextField();
        subsidy = new javax.swing.JTextField();
        advancepaid = new javax.swing.JTextField();
        previousarrears = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        interestonod = new javax.swing.JTextField();
        netamountpaid = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        billdate = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        duedate = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        disconnectiondate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cashpaid = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        balanceadjustable = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BillDetailsPanel.setBackground(new java.awt.Color(153, 255, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("BILL DETAILS ENTRY");

        jLabel2.setText("Consumer Number");

        areacode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areacodeActionPerformed(evt);
            }
        });

        jLabel3.setText("Area Code");

        consumer_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                consumer_numberFocusLost(evt);
            }
        });

        jLabel4.setText("Meter Reader Code");

        jLabel5.setText("Previous Reading");

        previousreading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousreadingActionPerformed(evt);
            }
        });

        jLabel6.setText("Present Reading");

        presentreading.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                presentreadingFocusLost(evt);
            }
        });

        jLabel7.setText("Units Consumed");

        unitsconsumed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsconsumedActionPerformed(evt);
            }
        });

        jLabel8.setText("Demand ID");

        jLabel9.setText("Fixed Charge");

        jLabel10.setText("Energy Charge");

        jLabel11.setText("DUTY TO GOVT:");

        jLabel12.setText("Re con: fee");

        jLabel13.setText("Meter Rent");

        jLabel14.setText("Demand for...");

        jLabel15.setText("Subsidy");

        jLabel16.setText("Advance Paid");

        jLabel17.setText("Previous arrears");

        jLabel18.setText("Total");

        jLabel19.setText("Interest on OD");

        jLabel20.setText("NET AMOUNT TO PAID");

        fixedcharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedchargeActionPerformed(evt);
            }
        });

        subsidy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsidyActionPerformed(evt);
            }
        });

        advancepaid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                advancepaidFocusGained(evt);
            }
        });

        previousarrears.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                previousarrearsFocusLost(evt);
            }
        });
        previousarrears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousarrearsActionPerformed(evt);
            }
        });

        jLabel21.setText("Bill Date");

        jLabel22.setText("Due Date");

        jLabel23.setText("Disconnection Date");

        jLabel24.setText("Cash Paid");

        jLabel25.setText("Balance Adjustable");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Generate Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel26.setText("( dd/mm/yyyy )");

        jLabel27.setText("( dd/mm/yyyy )");

        jLabel28.setText("( dd/mm/yyyy )");

        javax.swing.GroupLayout BillDetailsPanelLayout = new javax.swing.GroupLayout(BillDetailsPanel);
        BillDetailsPanel.setLayout(BillDetailsPanelLayout);
        BillDetailsPanelLayout.setHorizontalGroup(
            BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BillDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(demandid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(consumer_number, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(areacode, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(meterreadercode)
                                    .addComponent(previousreading)
                                    .addComponent(presentreading)
                                    .addComponent(unitsconsumed)))))
                    .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton2)))
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fixedcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(energycharge)
                                .addComponent(dutytogovt)
                                .addComponent(demandfor)
                                .addComponent(advancepaid)
                                .addComponent(previousarrears)
                                .addComponent(total)
                                .addComponent(interestonod)
                                .addComponent(netamountpaid, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(reconfee)
                                .addComponent(meterrent)
                                .addComponent(subsidy)))
                        .addGap(18, 18, 18)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(billdate)
                            .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26))
                            .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addComponent(duedate)
                            .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28))
                            .addComponent(disconnectiondate)
                            .addComponent(jLabel24)
                            .addComponent(cashpaid)
                            .addComponent(jLabel25)
                            .addComponent(balanceadjustable))
                        .addContainerGap())
                    .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BillDetailsPanelLayout.setVerticalGroup(
            BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(consumer_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel26)
                    .addComponent(fixedcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton2))
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(energycharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dutytogovt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(meterrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(reconfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(demandfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(subsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(advancepaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(previousarrears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(billdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel27))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel28))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(disconnectiondate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cashpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(balanceadjustable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BillDetailsPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areacode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meterreadercode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousreading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presentreading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitsconsumed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(demandid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(interestonod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netamountpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28)
                .addGroup(BillDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(145, 145, 145))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BillDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areacodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areacodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areacodeActionPerformed

    private void previousarrearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousarrearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousarrearsActionPerformed

    private void fixedchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixedchargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fixedchargeActionPerformed

    private void previousreadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousreadingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousreadingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
          try {
            String s2=(String)consumer_number.getSelectedItem();
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
                    meterreadercode.setText(rs.getString("MRCODE"));
                   

                }
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Consumer Number Details Not Found");
               areacode.setText("");
               meterreadercode.setText("");
               previousreading.setText("");
               
               
            }
                
                
            
            
             con.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void presentreadingFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_presentreadingFocusLost

         String s1=previousreading.getText();
        double prv=Double.parseDouble(s1);
        String s2=presentreading.getText();
        double prs=Double.parseDouble(s2);
        double uc=prs-prv;
        String s3=Double.toString(uc);
        unitsconsumed.setText(s3);
           //energy charge
        double d2 = 0;   //fixed charge
   
        if(uc<=50)
        { d1=uc*3; d2=3.0;}
        else if(uc>50 && uc<=200)
        {d1=uc*4.80; d2=4.80;}
        else if(uc>200 && uc<=400)
        {d1=uc*5.80;d2=5.80;}
        else if(uc>400)
        {d1=uc*6.20; d2=6.20;}
        
        String s4=Double.toString(d2);
        String s5=Double.toString(d1);
        fixedcharge.setText(s4);
        energycharge.setText(s5);
        
         dutytogovt.setText("4.25");
        meterrent.setText("50.31");
        reconfee.setText("0.26");
        subsidy.setText("2.50");
       
        
       
    }//GEN-LAST:event_presentreadingFocusLost

    private void subsidyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsidyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subsidyActionPerformed

    private void previousarrearsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_previousarrearsFocusLost
     try{
          
         
        double dutytogovt01=Double.parseDouble(dutytogovt.getText());
        double meterrent01=Double.parseDouble(meterrent.getText());
        double reconfee01=Double.parseDouble(reconfee.getText());
        double demandfor01=Double.parseDouble(demandfor.getText());
        double subsidy01=Double.parseDouble(subsidy.getText());
        double advancepaid01=Double.parseDouble(advancepaid.getText());
        double previousarrears01=Double.parseDouble(previousarrears.getText());
        //double interestonod01=Double.parseDouble(interestonod.getText());
        
        
        
        double total01=0;
        double billamount=(d1+dutytogovt01+meterrent01+reconfee01+previousarrears01)-subsidy01;
        total01=billamount-advancepaid01;
        String total02=Double.toString(total01);
        total.setText(total02);
        interestonod.setText("2.83");
        double amttopaid=total01+2.83;
        netamountpaid.setText(Double.toString(amttopaid));
     }
     catch(Exception ex2)
     {
          Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex2);
          JOptionPane.showMessageDialog(null,"Please Enter Correct Data in Appropriate Field");
     }
        
    }//GEN-LAST:event_previousarrearsFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        OfficeAdministration o=new OfficeAdministration();
        o.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unitsconsumedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsconsumedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsconsumedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // JPanel panelToPrint = null;
       
       // printRecord(panelToPrint);
    //---------------------------------------------------------------
        
         try {
            
           String  V2consumerno=(String)consumer_number.getSelectedItem();
           String area_code=areacode.getText();
           String meter_reader_code=meterreadercode.getText();
           String previous_reading=previousreading.getText();
           String present_reading=presentreading.getText();
           String units_consumed=unitsconsumed.getText();
           String demand_id=demandid.getText();
           String fixed_charge=fixedcharge.getText();
           String energy_charge=energycharge.getText();
           String duty_to_govt=dutytogovt.getText();
           String meter_rent=meterrent.getText();
           String re_con_fee=reconfee.getText();
           String demand_for=demandfor.getText();
           String subsidy01=subsidy.getText();
           String advance_paid=advancepaid.getText();
           String previous_arrears=previousarrears.getText();
           String total01=total.getText();
           String interest_on_od=interestonod.getText();
           String net_amount_to_paid=netamountpaid.getText();
           String bill_date=billdate.getText();
           String due_date=duedate.getText();
           String disconnection_date=disconnectiondate.getText();
           String cash_paid=cashpaid.getText();
           String balance_adjustable=balanceadjustable.getText();
           
           
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
           Statement st4=con4.createStatement();
            String s5="INSERT INTO BILLDETAILS VALUES ('"+V2consumerno+"', '"+area_code+"', '"+meter_reader_code+"', '"+previous_reading+"', '"+present_reading+"', '"+units_consumed+"', '"+demand_id+"', '"+fixed_charge+"', '"+energy_charge+"', '"+duty_to_govt+"', '"+meter_rent+"', '"+re_con_fee+"', '"+demand_for+"', '"+subsidy01+"', '"+advance_paid+"', '"+previous_arrears+"', '"+total01+"', '"+interest_on_od+"', '"+net_amount_to_paid+"', '"+bill_date+"', '"+due_date+"', '"+disconnection_date+"', '"+cash_paid+"', '"+balance_adjustable+"')";
            
            int k5=st4.executeUpdate(s5);
            if(k5>=1)
                JOptionPane.showMessageDialog(null,"Bill Generated..");
            else
                JOptionPane.showMessageDialog(null, "Bill Not Generated..");
            
            consumer_number.setSelectedIndex(-1);
            areacode.setText("");
            meterreadercode.setText("");
            previousreading.setText("");
            presentreading.setText("");
            unitsconsumed.setText("");
            demandid.setText("");fixedcharge.setText("");
            energycharge.setText("");
            dutytogovt.setText("");
            meterrent.setText("");
            reconfee.setText("");
            demandfor.setText("");
            subsidy.setText("");
            advancepaid.setText("");
            previousarrears.setText("");
            total.setText("");
            interestonod.setText("");
            netamountpaid.setText("");
            billdate.setText("");
            duedate.setText("");
            disconnectiondate.setText("");
            cashpaid.setText("");
            balanceadjustable.setText("");
            
            
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void consumer_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consumer_numberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_consumer_numberFocusLost

    private void advancepaidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_advancepaidFocusGained

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st4=con4.createStatement();
            ResultSet rs=st4.executeQuery("select total from advance_payment01 where consumerno='"+consumer_number.getSelectedItem()+"'   ");
            while(rs.next()!=false)
            {
                //advancepaid.setText(rs.getString("total"));
                
                String s1=rs.getString("total");
                if(s1.equals(null))
                {JOptionPane.showMessageDialog(null, "Advance Payment Not Done...");
                    advancepaid.setText("NA");
                }
                else
                    advancepaid.setText(rs.getString("total"));
            }
        } catch (Exception ex) {
            Logger.getLogger(BillDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_advancepaidFocusGained

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
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillDetails().setVisible(true);
            }
        });
    }

    private void printRecord(JPanel panel1)
    {
        //create PrinterJob here
        PrinterJob pj=PrinterJob.getPrinterJob();
        //set PrinterJob Name
        pj.setJobName("Print Record");
        
        pj.setPrintable(new Printable() {

            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                 //To change body of generated methods, choose Tools | Templates.
                if(pageIndex>0)
                            return Printable.NO_SUCH_PAGE;
                        
                        Graphics2D graphics2D=(Graphics2D)graphics;
                        
                        graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                        
                        graphics2D.scale(0.5,0.5);
                        
                        BillDetailsPanel.print(graphics2D);
                        
                        return Printable.PAGE_EXISTS;
            }
        });
                
                    
      boolean returningResult=pj.printDialog();
      if(returningResult)
      {
          try{
              pj.print();
          }
          catch(PrinterException pe)
          {JOptionPane.showMessageDialog(this,"Print Error : "+pe.getMessage());}
      }
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillDetailsPanel;
    private javax.swing.JTextField advancepaid;
    private javax.swing.JTextField areacode;
    private javax.swing.JTextField balanceadjustable;
    private javax.swing.JTextField billdate;
    private javax.swing.JTextField cashpaid;
    private javax.swing.JComboBox consumer_number;
    private javax.swing.JTextField demandfor;
    private javax.swing.JTextField demandid;
    private javax.swing.JTextField disconnectiondate;
    private javax.swing.JTextField duedate;
    private javax.swing.JTextField dutytogovt;
    private javax.swing.JTextField energycharge;
    private javax.swing.JTextField fixedcharge;
    private javax.swing.JTextField interestonod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField meterreadercode;
    private javax.swing.JTextField meterrent;
    private javax.swing.JTextField netamountpaid;
    private javax.swing.JTextField presentreading;
    private javax.swing.JTextField previousarrears;
    private javax.swing.JTextField previousreading;
    private javax.swing.JTextField reconfee;
    private javax.swing.JTextField subsidy;
    private javax.swing.JTextField total;
    private javax.swing.JTextField unitsconsumed;
    // End of variables declaration//GEN-END:variables
}
