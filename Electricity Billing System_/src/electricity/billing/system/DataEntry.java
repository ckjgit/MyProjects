
package electricity.billing.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DataEntry extends javax.swing.JFrame {

    
    public DataEntry()
    {
        initComponents();
        setTitle("Data Entry");
        
        
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
                MDCN.addItem(str4);
                DDCN.addItem(str4);
                MGCN.addItem(str4);
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

        DataEntry = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ConsumerNumber = new javax.swing.JTextField();
        AreaCode = new javax.swing.JComboBox();
        MeterReaderCode = new javax.swing.JComboBox();
        Tariff = new javax.swing.JComboBox();
        Phase = new javax.swing.JComboBox();
        PostNumber = new javax.swing.JTextField();
        ConnectedLoad = new javax.swing.JTextField();
        TariffID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ConsumerName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        Date = new javax.swing.JComboBox();
        Month = new javax.swing.JComboBox();
        Year = new javax.swing.JComboBox();
        jButton13 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        MDCN = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        MGCN = new javax.swing.JComboBox();
        jTextField21 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        DDCN = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DataEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataEntryMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("CONSUMER DETAILS");

        jLabel2.setText("Consumer Number");

        jLabel3.setText("Area Code");

        jLabel4.setText("Meter Reader Code");

        jLabel5.setText("Tariff");

        jLabel6.setText("Phase");

        jLabel7.setText("Post Number");

        jLabel8.setText("Connected Load");

        jLabel9.setText("Tariff ID");

        AreaCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "1321", "1322", "1324", "1328", "1359", "1356", "1345", "2341", "1090", "1909", "1999" }));

        MeterReaderCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Code 0", "Code 1", "Code 2", "Code 3", "Code 4", "Code 5", "Code 6", "Code 7", "Code 8", "Code 9", "Code 10", "Code 11" }));

        Tariff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "23.50", "25.30", "29.50", "33.20", "24.21", "31.33", "11.50" }));

        Phase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "1", "2", "3", "4" }));
        Phase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhaseActionPerformed(evt);
            }
        });

        ConnectedLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectedLoadActionPerformed(evt);
            }
        });

        jLabel10.setText("Consumer Name");

        jLabel11.setText("Address");

        jLabel12.setText("Date Of Connection");

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ConsumerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsumerNameActionPerformed(evt);
            }
        });

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        Date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        Year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel40.setText("N B :: For Edit, First Enter Consumer And Press Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsumerNumber)
                            .addComponent(AreaCode, 0, 132, Short.MAX_VALUE)
                            .addComponent(MeterReaderCode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tariff, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Phase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PostNumber)
                            .addComponent(ConnectedLoad)
                            .addComponent(TariffID))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConsumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ConsumerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(ConsumerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(AreaCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MeterReaderCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tariff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Phase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PostNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConnectedLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TariffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addContainerGap())
        );

        DataEntry.addTab("Consumer Details", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 102));
        jLabel13.setText("METER DETAILS");

        jLabel14.setText("Consumer Number");

        jLabel15.setText("Meter Number");

        jLabel16.setText("No of Digits");

        jLabel17.setText("Initial Reading");

        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton14.setText("Update");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel41.setText("NB :: For Edit Consumer Number Choosen First");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MDCN, 0, 131, Short.MAX_VALUE)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41)))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(MDCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton14)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(32, 32, 32))
        );

        DataEntry.addTab("Meter Details", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel30.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 102, 51));
        jLabel30.setText("MINIMUM GUARENTEE");

        jLabel31.setText("Consumer No.");

        jLabel32.setText("Area Code");

        MGCN.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        MGCN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MGCNFocusLost(evt);
            }
        });

        jLabel33.setText("Meter Reader Code");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jLabel34.setText("Amount");

        jLabel35.setText("Instalment Amt.");

        jLabel36.setText("MG ends as on");

        jLabel37.setText("LEMG");

        jLabel38.setText("SCMG");

        jLabel39.setText("Line Rent");

        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Edit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Cancel");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton16.setText("Insert");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel43.setText("NB :: For Edit Consumer Number Choosen First");

        jLabel44.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel44.setText("NB : For Edit , Consumer Number Choosen First");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel37)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MGCN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel38))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)
                                            .addComponent(jButton10))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField23)
                                                .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField24)
                                                .addComponent(jTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))))
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel39))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField25)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton16)
                        .addGap(269, 269, 269)
                        .addComponent(jButton12))
                    .addComponent(jLabel44))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(MGCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton16))
                .addGap(24, 24, 24)
                .addComponent(jLabel44))
        );

        DataEntry.addTab("Minimum Gaurentee", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("DEPOSIT DETAILS");

        jLabel19.setText("Consumer No.");

        jLabel20.setText("Cash Deposit");

        jLabel21.setText("A C D");

        jLabel22.setText("OYEC Amount");

        jLabel23.setText("Total no of instalments");

        jLabel24.setText("OYEC Instalment ends on the month");

        DDCN.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        DDCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDCNActionPerformed(evt);
            }
        });

        jLabel25.setText("Receipt no");

        jLabel26.setText("Receipt no");

        jLabel27.setText("Instalment Amt.");

        jLabel28.setText("Paid Instalments");

        jLabel29.setText("Balance Instalments ");

        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Edit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Cancel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton15.setText("Insert");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel42.setText("NB :: For Edit Consumer Number Choosen First");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel19)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDCN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton15)
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))
                                .addComponent(jButton7)
                                .addGap(62, 62, 62)
                                .addComponent(jButton9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                    .addComponent(jTextField16))
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                                        .addComponent(jTextField18))))))
                                    .addComponent(jLabel29))))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DDCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26))
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton15))
                .addContainerGap())
        );

        DataEntry.addTab("Deposit Details", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DataEntry)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DataEntry)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st3=con2.createStatement();
            
            String str2=ConsumerNumber.getText();
            String str="SELECT CONSUMERNO FROM CONSUMER11 WHERE CONSUMERNO='"+str2+"'   ";
            
            ResultSet rs4=st3.executeQuery(str);
            String s4=null;
            while(rs4.next()!=false)
            {
                s4=rs4.getString(1);
                System.out.println(s4);
            }
            if(str2.equals(s4))
            {
                JOptionPane.showMessageDialog(null,"Same Consumer Number Exists");
            }
            else
            {
                                        if(ConsumerNumber.getText()==null || AreaCode.getSelectedItem()=="select"||Phase.getSelectedItem()=="select" ||PostNumber.getText()==null
                                ||  ConsumerName.getText()==null||MeterReaderCode.getSelectedItem()=="select"||Address.getText()==null
                                || Tariff.getSelectedItem()=="select"||ConnectedLoad.getText()==null|| TariffID.getText()==null
                                || Date.getSelectedItem()=="Date" || Month.getSelectedItem()=="Month" || Year.getSelectedItem()=="Year")
                        {JOptionPane.showMessageDialog(null,"Please Enter Valid Data in Appropriate Field");}
                        else
                        {
                            try
                            {


                                String  VConsumerno=ConsumerNumber.getText();
                                String VAreaCode01=(String) AreaCode.getSelectedItem();
                                String VPhase=(String)this.Phase.getSelectedItem();
                                String VPostNumber=this.PostNumber.getText();
                                String VCname=ConsumerName.getText();
                                String VMRcode=(String)MeterReaderCode.getSelectedItem();
                                String VAddress=this.Address.getText();
                                String VTariff=(String)this.Tariff.getSelectedItem();
                                String VCLoad=ConnectedLoad.getText();
                                String VTariffID=this.TariffID.getText();
                                String VDateofconnection1=(String) Date.getSelectedItem();
                                String VDateofconnection2=(String)Month.getSelectedItem();
                                String VDateofconnection3=(String)Year.getSelectedItem();

                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");                                                                                        


                                Statement st=con.createStatement();
                                String q=" INSERT INTO CONSUMER11 VALUES ('"+VConsumerno+"', '"+VCname+"','"+VAreaCode01+"','"+VMRcode+"','"+VAddress+"', '"+VTariff+"', '"+VPhase+"','"+VPostNumber+"', '"+VCLoad+"','"+VTariffID+"', '"+VDateofconnection1+"','"+VDateofconnection2+"','"+VDateofconnection3+"' ) ";
                                int k=st.executeUpdate(q);

                                System.out.println(VConsumerno);
                                System.out.println(k);
                                if(k>=1)


                                    JOptionPane.showMessageDialog(null,"Record Inserted");

                                else
                                    JOptionPane.showMessageDialog(null,"Record Not Inserted");
                                
                                
                                ConsumerNumber.setText("");
                               AreaCode.setSelectedIndex(-1);
                                Tariff.setSelectedIndex(-1);
                                Phase.setSelectedIndex(-1);
                                PostNumber.setText("");
                                ConnectedLoad.setText("");
                                TariffID.setText("");
                                ConsumerName.setText("");
                                Address.setText("");
                                Date.setSelectedIndex(-1);
                                Month.setSelectedIndex(-1);
                                Year.setSelectedIndex(-1);
                                MeterReaderCode.setSelectedIndex(-1);
                               // System.out.println( AreaCode.setSelectedIndex(1));


                                con.close();
                                st.close();

                            }

                            catch(Exception ex)
                            {
                                Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        }
            
            
            

        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }

                                
           
                      
            
            
            
            
                      
      
        
      
        
        
        
     
           
                
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     
    //if(ConsumerNumber.getText().equals(null))
    //{
        //JOptionPane.showMessageDialog(null," Enter Consumer Number For Edit Purpose "+"\n"+"Then Press Edit");
      //  
    //    System.out.println(ConsumerNumber.getText());
       try {
                String cn=ConsumerNumber.getText();
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
                
                Statement st2=con2.createStatement();
                String ss="SELECT * FROM CONSUMER11 WHERE CONSUMERNO='"+cn+"'  ";
                
                ResultSet rs2=st2.executeQuery(ss);
                
                while(rs2.next()!=false)
                {
                    String cno=rs2.getString(1);
                    String cnm=rs2.getString(2);
                    String ac=rs2.getString(3);
                    String mrc=rs2.getString(4);
                    String addr=rs2.getString(5);
                    String tarf=rs2.getString(6);
                    String phs=rs2.getString(7);
                    String pstno=rs2.getString(8);
                    String cld=rs2.getString(9);
                    String tarfid=rs2.getString(10);
                    String day=rs2.getString(11);
                    String month=rs2.getString(12);
                    String year=rs2.getString(13);
                    
                    ConsumerNumber.setText(cno);
                    PostNumber.setText(pstno);
                    ConsumerName.setText(cnm);
                    Address.setText(addr);
                    ConnectedLoad.setText(cld);
                    TariffID.setText(tarfid);
                    AreaCode.addItem(ac);
                    
                    
                }
                con2.close();
                st2.close();
                rs2.close();
                
            } catch (Exception ex) {
                Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
            }
   // }
   // else
    //{
    //    JOptionPane.showMessageDialog(null," oooooooooooook");
      //  System.out.println(ConsumerNumber.getText());
    //}
       
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

    private void ConsumerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsumerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumerNameActionPerformed

    private void DDCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DDCNActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void ConnectedLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectedLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConnectedLoadActionPerformed

    private void PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhaseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        OfficeAdministration oa=new OfficeAdministration();
        oa.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        try {
            
            
                        String  VConsumerno=ConsumerNumber.getText();
                        String VAreaCode01=(String) AreaCode.getSelectedItem();
                        String VPhase=(String)this.Phase.getSelectedItem();
                        String VPostNumber=this.PostNumber.getText();
                        String VCname=ConsumerName.getText();
                        String VMRcode=(String)MeterReaderCode.getSelectedItem();
                        String VAddress=this.Address.getText();
                        String VTariff=(String)this.Tariff.getSelectedItem();
                        String VCLoad=ConnectedLoad.getText();
                        String VTariffID=this.TariffID.getText();
                        String VDateofconnection1=(String) Date.getSelectedItem();
                        String VDateofconnection2=(String)Month.getSelectedItem();
                        String VDateofconnection3=(String)Year.getSelectedItem();
                        
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
                        Statement st3=con3.createStatement();
            
            String ss1="UPDATE CONSUMER11 SET   CONSUMERNO='"+VConsumerno+"' ,CNAME='"+VCname+"' ,AREACODE ='"+VAreaCode01+"' ,MRCODE='"+VMRcode+"' , ADDRESS='"+VAddress+"' , TARIFF='"+VTariff+"' , PHASE='"+VPhase+"' , POSTNUMBER='"+VPostNumber+"' , CLOAD='"+VCLoad+"' , TARIFFID='"+VTariffID+"' , DATEOFCONNECTION1='"+VDateofconnection1+"' , DATEOFCONNECTION2='"+VDateofconnection2+"' , DATEOFCONNECTION3='"+VDateofconnection3+"' where consumerno='"+VConsumerno+"'    ";
            
            int i=st3.executeUpdate(ss1);
            
            if(i>=1)
                JOptionPane.showMessageDialog(null, "Data Updated");
            else
                JOptionPane.showMessageDialog(null, "Data not Inserted");
            
            st3.close();
            con3.close();
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        try {
            String s22=(String) MDCN.getSelectedItem();
            String s21=jTextField6.getText();
            String s23=jTextField7.getText();
            String s24=jTextField8.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con6=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st6=con6.createStatement();
            
            String str6="UPDATE METERDETAILS SET  METERNO='"+s21+"', NOOFDIGITS='"+s23+"', INITIALREADING='"+s24+"'    where consumerno='"+s22+"'     ";
            int b1=st6.executeUpdate(str6);
            if(b1>=1)
                JOptionPane.showMessageDialog(null, "Data Updated");
            else
                JOptionPane.showMessageDialog(null, "Data not Inserted");
            
            con6.close();
            st6.close();
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void DataEntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataEntryMouseClicked

       
        
        
        
    }//GEN-LAST:event_DataEntryMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        try {
            
           String  V2consumerno=(String) MDCN.getSelectedItem();
           String meterno=jTextField6.getText();
           String noofdigits=jTextField7.getText();
           String initialreading=jTextField8.getText();
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
           Statement st4=con4.createStatement();
            String s5="INSERT INTO METERDETAILS VALUES ('"+V2consumerno+"', '"+meterno+"', '"+noofdigits+"', '"+initialreading+"')";
            
            int k5=st4.executeUpdate(s5);
            if(k5>=1)
                JOptionPane.showMessageDialog(null," Data Inserted");
            else
                JOptionPane.showMessageDialog(null, "Data Not Inserted");
            
            MDCN.setSelectedIndex(-1);
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            
            con4.close();
            st4.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con5=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st5=con5.createStatement();
            
            String s55=(String) MDCN.getSelectedItem();
            String s5="SELECT * FROM METERDETAILS WHERE CONSUMERNO='"+s55+"' ";
            ResultSet rs5=st5.executeQuery(s5);
            while(rs5.next()!=false)
            {
                String s11=rs5.getString(1);
                String s12=rs5.getString(2);
                String s13=rs5.getString(3);
                String s14=rs5.getString(4);
                
                jTextField6.setText(s12);
                jTextField7.setText(s13);
                jTextField8.setText(s14);
            }
           con5.close();
           st5.close(); 
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        OfficeAdministration of2=new OfficeAdministration();
        of2.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try {
            String ConsumerNo1=(String)DDCN.getSelectedItem();
            String CashDeposits=jTextField9.getText();
            String Acd=jTextField10.getText();
            String OyecAmount=jTextField11.getText();
            String TotalNoOfInstalments=jTextField12.getText();
            String OyecIEOTM=jTextField13.getText();
            String ReceiptNo1=jTextField14.getText();
            String ReceiptNo2=jTextField16.getText();
            String InstalmentAmt=jTextField18.getText();
            String PaidInstalments=jTextField19.getText();
            String BalanceInstalments=jTextField20.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con6=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st6=con6.createStatement();
            
            String str6="UPDATE DEPOSITDETAILS SET CASHDEPOSIT='"+CashDeposits+"', ACD='"+Acd+"', OYECAMOUNT='"+OyecAmount+"', TOTALNOOFINSTALMENTS='"+TotalNoOfInstalments+"',OYECIEOTM='"+OyecIEOTM+"', RECEIPTNO1='"+ReceiptNo1+"', RECEIPTNO2='"+ReceiptNo2+"', INSTALMENTAMT='"+InstalmentAmt+"', PAIDINSTRUMENT='"+PaidInstalments+"', BALANCEINSTALMENTS='"+BalanceInstalments+"'    where consumerno='"+ConsumerNo1+"'     ";
            int b1=st6.executeUpdate(str6);
            if(b1>=1)
                JOptionPane.showMessageDialog(null, "Data Updated");
            else
                JOptionPane.showMessageDialog(null, "Data not Inserted");
            
            con6.close();
            st6.close();  
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        if(DDCN.getSelectedItem().equals("select")|| jTextField9.getText().equals("") || jTextField10.getText().equals("") 
                || jTextField11.getText().equals("") || jTextField12.getText().equals("") 
                || jTextField13.getText().equals("") || jTextField14.getText().equals("") 
                || jTextField16.getText().equals("") || jTextField18.getText().equals("") 
                || jTextField19.getText().equals("") || jTextField20.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null," Enter Correct Data In Appropriare Field");
        }
        else
        {
            try {
            String ConsumerNo1=(String)DDCN.getSelectedItem();
            String CashDeposits=jTextField9.getText();
            String Acd=jTextField10.getText();
            String OyecAmount=jTextField11.getText();
            String TotalNoOfInstalments=jTextField12.getText();
            String OyecIEOTM=jTextField13.getText();
            String ReceiptNo1=jTextField14.getText();
            String ReceiptNo2=jTextField16.getText();
            String InstalmentAmt=jTextField18.getText();
            String PaidInstalments=jTextField19.getText();
            String BalanceInstalments=jTextField20.getText();
            
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con7=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st7=con7.createStatement();
            String s7="INSERT INTO DEPOSITDETAILS VALUES ('"+ConsumerNo1+"','"+CashDeposits+"', '"+Acd+"', '"+OyecAmount+"', '"+TotalNoOfInstalments+"', '"+OyecIEOTM+"', '"+ReceiptNo1+"', '"+ReceiptNo2+"', '"+InstalmentAmt+"', '"+PaidInstalments+"', '"+BalanceInstalments+"'   )   ";
            
            int i7=st7.executeUpdate(s7);
            if(i7>=1)
                JOptionPane.showMessageDialog(null,"Data Inserted");
            else
                JOptionPane.showMessageDialog(null,"Data Not Inserted");
            
            DDCN.setSelectedIndex(-1);
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            jTextField14.setText("");
            jTextField16.setText("");
            jTextField18.setText("");
            jTextField19.setText("");
            jTextField20.setText("");
            
            st7.close();
            con7.close();
            
        }
           catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try {
            String ss8=(String)DDCN.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con8=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st8=con8.createStatement();
            Statement st88=con8.createStatement();
            
            String str8="SELECT * FROM DEPOSITDETAILS WHERE CONSUMERNO='"+ss8+"' ";
            String str88=" SELECT CONSUMERNO FROM DEPOSITDETAILS WHERE CONSUMERNO='"+ss8+"' ";
            
            ResultSet rs88=st88.executeQuery(str88);
            ResultSet rs8=st8.executeQuery(str8);
            
           
            String ss18=null;
            while(rs88.next()!=false)
            {
                ss18=rs88.getString("CONSUMERNO");
                System.out.println("CN"+ss18);
                System.out.println(ss8);
            }
            
            if(ss8.equals(ss18))
            {
                        while(rs8.next()!=false)
                   {
                      jTextField9.setText(rs8.getString(2));
                       jTextField10.setText(rs8.getString(3));
                        jTextField11.setText(rs8.getString(4));
                         jTextField12.setText(rs8.getString(5));
                          jTextField13.setText(rs8.getString(6));
                           jTextField14.setText(rs8.getString(7));
                            jTextField16.setText(rs8.getString(8));
                             jTextField18.setText(rs8.getString(9));
                              jTextField19.setText(rs8.getString(10));
                               jTextField20.setText(rs8.getString(11));


                   }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Consumer Number Details Not Found");
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField13.setText("");
                    jTextField14.setText("");
                    jTextField16.setText("");
                    jTextField18.setText("");
                    jTextField19.setText("");
                    jTextField20.setText("");
            
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
       
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     
        OfficeAdministration of2=new OfficeAdministration();
        of2.show();
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con8=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st8=con8.createStatement();
             String s1=(String)MGCN.getSelectedItem();
            String s2=jTextField21.getText();
            String s3=jTextField22.getText();
            String s4=jTextField23.getText();
            String s5=jTextField24.getText();
            String s6=jTextField25.getText();
            String s7=jTextField26.getText();
            String s8=jTextField27.getText();
            String s9=jTextField28.getText();
            String s10=jTextField29.getText();
            
            String s11="INSERT INTO MINIMUMGAURENTEE01 VALUES ('"+s1+"', '"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"', '"+s9+"', '"+s10+"')       ";
            int k=st8.executeUpdate(s11);
            if(k>=1)
                JOptionPane.showMessageDialog(null,"Data Inserted");
            else
                JOptionPane.showMessageDialog(null,"Data Not Inserted");
            MGCN.setSelectedIndex(-1);
            jTextField21.setText("");
            jTextField22.setText("");
            jTextField23.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
            jTextField29.setText("");
            con8.close();
            st8.close();
           
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void MGCNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MGCNFocusLost

        try {
            String s2=(String)MGCN.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st=con.createStatement(); 
            String s1="SELECT * FROM CONSUMER11 WHERE CONSUMERNO='"+s2+"' ";
            ResultSet rs=st.executeQuery(s1);
            while(rs.next()!=false)
            {
               jTextField21.setText(rs.getString("AREACODE"));
                jTextField22.setText(rs.getString("MRCODE"));
            }
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_MGCNFocusLost

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try {
            String s1=(String)MGCN.getSelectedItem();
            String s2=jTextField21.getText();
            String s3=jTextField22.getText();
            String s4=jTextField23.getText();
            String s5=jTextField24.getText();
            String s6=jTextField25.getText();
            String s7=jTextField26.getText();
            String s8=jTextField27.getText();
            String s9=jTextField28.getText();
            String s10=jTextField29.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            
            Statement st=con.createStatement();
            
            String s="UPDATE MINIMUMGAURENTEE01 SET AREACODE='"+s2+"', MRCODE='"+s3+"', LEMGAMT='"+s4+"', SCMGAMT='"+s5+"', LINERENTAMT='"+s6+"', LEMGIAMT='"+s7+"', SCMGIAMT='"+s8+"', LINERENTIAMT='"+s9+"', MGENDSASON='"+s10+"'  where consumerno='"+s1+"'    ";
            int k=st.executeUpdate(s);
            if(k>=1)
                JOptionPane.showMessageDialog(null,"Data Updated");
            else
                JOptionPane.showMessageDialog(null,"Data Not Updated");
            MGCN.setSelectedIndex(-1);
            jTextField21.setText("");
            jTextField22.setText("");
            jTextField23.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
            jTextField29.setText("");
            con.close();
            st.close();
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        OfficeAdministration o=new OfficeAdministration();
        o.show();
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        try {
            String ss8=(String)MGCN.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con8=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Ckj123@0909");
            Statement st8=con8.createStatement();
            Statement st88=con8.createStatement();
            
            String str8="SELECT * FROM MINIMUMGAURENTEE01 WHERE CONSUMERNO='"+ss8+"' ";
            String str88=" SELECT CONSUMERNO FROM MINIMUMGAURENTEE01 WHERE CONSUMERNO='"+ss8+"' ";
            
            ResultSet rs88=st88.executeQuery(str88);
            ResultSet rs8=st8.executeQuery(str8);
            
           System.out.println("vvvvvvv");
            String s=null;
            while(rs88.next()!=false)
            {
                s=rs88.getString("CONSUMERNO");
                System.out.println("CN"+s);
                System.out.println(ss8);
            }
            if(ss8.equals(s))
            {
                   
                    
                    while(rs8.next()!=false)
                    {
                       // jTextField21.setText(rs8.getString(2));
                       // jTextField22.setText(rs8.getString(3));
                        jTextField23.setText(rs8.getString(4));
                        jTextField24.setText(rs8.getString(5));
                        jTextField25.setText(rs8.getString(6));
                        jTextField26.setText(rs8.getString(7));
                        jTextField27.setText(rs8.getString(8));
                        jTextField28.setText(rs8.getString(9));
                        jTextField29.setText(rs8.getString(10));
                    }
            }
            else
                JOptionPane.showMessageDialog(null,"Consumer Number Details Not Found ");   
            
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(DataEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

   
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
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
         
        //d.setTitle("Data View");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEntry().setVisible(true);
                //new DataEntry().setTitle("Data View");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JComboBox AreaCode;
    private javax.swing.JTextField ConnectedLoad;
    private javax.swing.JTextField ConsumerName;
    private javax.swing.JTextField ConsumerNumber;
    private javax.swing.JComboBox DDCN;
    private javax.swing.JTabbedPane DataEntry;
    private javax.swing.JComboBox Date;
    private javax.swing.JComboBox MDCN;
    private javax.swing.JComboBox MGCN;
    private javax.swing.JComboBox MeterReaderCode;
    private javax.swing.JComboBox Month;
    private javax.swing.JComboBox Phase;
    private javax.swing.JTextField PostNumber;
    private javax.swing.JComboBox Tariff;
    private javax.swing.JTextField TariffID;
    private javax.swing.JComboBox Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
