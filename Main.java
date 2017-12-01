import java.sql.*;
import javax.swing.table.*;

public class Main extends javax.swing.JFrame {

    static Connection con = null;
    //DefaultTableModel model;  //set the global doesn't work for sorting.

    public Main() {

        connection();
        
        initComponents();
        
        show_student_table();
        show_teacher_table();
        show_report_table();
        show_medication_table();
        show_guardian_table();
        show_community_table();
        show_homeroom_table();
        
        sort_student_table();
        sort_teacher_table();
        sort_report_table();
        sort_medication_table();
        sort_guardian_table();
        sort_community_table();
        sort_homeroom_table();
        
    }
    
    private static void connection(){    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkim58","root","rk123123");           
            if(con!=null)
                System.out.println("mysql is connected");
        } catch(ClassNotFoundException e){
            System.out.println("jdbc driver not found");
        } catch(SQLException e){
            e.printStackTrace();
        } 
    }
    
    public void show_student_table(){
        
        Statement st = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try{
            st = con.createStatement();
            rs = st.executeQuery("select * from student");
            
            while(rs.next()){
                String S_ID = rs.getString(1);
                String F_Name = rs.getString(2);
                String L_Name = rs.getString(3);
                String DOB = rs.getString(4);
                String Room_No = rs.getString(5);
                
                Object[] content = {S_ID, F_Name, L_Name, DOB, Room_No};   
                
                model.addRow(content);
            }
            
        } catch(Exception e){ 
            e.printStackTrace();
        }    
    }
    
    public void show_teacher_table(){
        
        Statement st = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        try{
            st = con.createStatement();
            rs = st.executeQuery("select * from teacher");
            
            while(rs.next()){
                String T_ID = rs.getString(1);
                String F_Name = rs.getString(2);
                String L_Name = rs.getString(3);
                String Subject = rs.getString(4);
                
                Object[] content = {T_ID, F_Name, L_Name, Subject};
                
                model.addRow(content);                      
            }
            
        } catch(Exception e){ 
            e.printStackTrace();
        }    
    }
    
    public void show_report_table(){
        
    }
    
    public void show_medication_table(){
        
    }
    
    public void show_guardian_table(){
        
    }
    
    public void show_community_table(){
        
    }
    
    public void show_homeroom_table(){
        
    }
    
    public void sort_student_table(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(sorter);
    }
    
    public void sort_teacher_table(){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        jTable2.setRowSorter(sorter);
    }
    
    public void sort_report_table(){
        
    }
    
    public void sort_medication_table(){
        
    }
    
    public void sort_guardian_table(){
        
    }
    
    public void sort_community_table(){
        
    }
    
    public void sort_homeroom_table(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        S_ID_FIELD = new javax.swing.JTextField();
        S_ID_SEARCH = new javax.swing.JButton();
        S_ID_REFRESH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        T_ID_FIELD = new javax.swing.JTextField();
        T_ID_SEARCH = new javax.swing.JButton();
        T_ID_REFRESH = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        F_S_ID_FIELD = new javax.swing.JTextField();
        F_T_ID_FIELD = new javax.swing.JTextField();
        F_TIME_FIELD = new javax.swing.JTextField();
        F_DATE_FIELD = new javax.swing.JTextField();
        REPORT_SEARCH = new javax.swing.JButton();
        REPORT_REFRESH = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Student ID:");

        S_ID_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_ID_FIELDActionPerformed(evt);
            }
        });

        S_ID_SEARCH.setText("Search");
        S_ID_SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_ID_SEARCHActionPerformed(evt);
            }
        });

        S_ID_REFRESH.setText("Refresh");
        S_ID_REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_ID_REFRESHActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Date of Birth", "Room Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S_ID_SEARCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S_ID_REFRESH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(234, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(S_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_ID_SEARCH)
                    .addComponent(S_ID_REFRESH)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "First Name", "Last Name", "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText("Teacher ID:");

        T_ID_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_ID_FIELDActionPerformed(evt);
            }
        });

        T_ID_SEARCH.setText("Search");
        T_ID_SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_ID_SEARCHActionPerformed(evt);
            }
        });

        T_ID_REFRESH.setText("Refresh");
        T_ID_REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_ID_REFRESHActionPerformed(evt);
            }
        });

        jButton2.setText("Add");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_ID_SEARCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_ID_REFRESH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(T_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(T_ID_SEARCH))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(T_ID_REFRESH)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Teacher", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Student ID:");

        jLabel5.setText("Teacher ID:");

        jLabel6.setText("Time_In:");

        jLabel7.setText("Date:");

        F_S_ID_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_S_ID_FIELDActionPerformed(evt);
            }
        });

        F_TIME_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_TIME_FIELDActionPerformed(evt);
            }
        });

        REPORT_SEARCH.setText("Search");
        REPORT_SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORT_SEARCHActionPerformed(evt);
            }
        });

        REPORT_REFRESH.setText("Refresh");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Teacher ID", "Time In", "Time Out", "Date", "Description", "Response", "Type", "Debrief"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton3.setText("Add");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F_S_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F_T_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F_TIME_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F_DATE_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REPORT_SEARCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REPORT_REFRESH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 17, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(F_S_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_T_ID_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_TIME_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_DATE_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPORT_SEARCH)
                    .addComponent(REPORT_REFRESH)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Focus Report", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Student ID:");

        jLabel9.setText("Pill ID:");

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Refresh");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pill ID", "Student ID", "Clinical Name", "Brand Name", "Dosage", "Side Effects", "ADM HS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(152, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medication", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("First Name:");

        jLabel11.setText("Student ID:");

        jButton6.setText("Search");

        jButton7.setText("Refresh");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Student ID", "Relationship", "Phone", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(114, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Guardian", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Community", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Homeroom", jPanel7);

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 48)); // NOI18N
        jLabel2.setText("Crossroads Center DBMS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void S_ID_SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_SEARCHActionPerformed
     
        Statement st = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try{
            st = con.createStatement();
            rs = st.executeQuery("select * from student where S_ID like'%"+S_ID_FIELD.getText()+"%'");
 
            while(rs.next()){
                String S_ID = rs.getString(1);
                String F_Name = rs.getString(2);
                String L_Name = rs.getString(3);
                String DOB = rs.getString(4);
                String Room_No = rs.getString(5);
                
                Object[] content = {S_ID, F_Name, L_Name, DOB, Room_No};
                model.addRow(content);                      
            }    
        } catch(Exception e){ 
            e.printStackTrace();
        }    
    }//GEN-LAST:event_S_ID_SEARCHActionPerformed

    private void S_ID_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_ID_FIELDActionPerformed

    private void T_ID_SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_ID_SEARCHActionPerformed
        
        Statement st = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        try{
            st = con.createStatement();
            rs = st.executeQuery("select * from teacher where T_ID like'%"+T_ID_FIELD.getText()+"%'");
 
            while(rs.next()){
                String T_ID = rs.getString(1);
                String F_Name = rs.getString(2);
                String L_Name = rs.getString(3);
                String Subject = rs.getString(4);
                
                Object[] content = {T_ID, F_Name, L_Name, Subject};
                model.addRow(content);                      
            }    
        } catch(Exception e){ 
            e.printStackTrace();
        }  
        
    }//GEN-LAST:event_T_ID_SEARCHActionPerformed

    private void T_ID_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_ID_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_ID_FIELDActionPerformed

    private void S_ID_REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_REFRESHActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        show_student_table();
        jTable1.getRowSorter().setSortKeys(null); //restore the original row order
    }//GEN-LAST:event_S_ID_REFRESHActionPerformed

    private void T_ID_REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_ID_REFRESHActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        show_teacher_table();
        jTable2.getRowSorter().setSortKeys(null); //restore the original row order
    }//GEN-LAST:event_T_ID_REFRESHActionPerformed

    private void F_TIME_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_TIME_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_TIME_FIELDActionPerformed

    private void REPORT_SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORT_SEARCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPORT_SEARCHActionPerformed

    private void F_S_ID_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_S_ID_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_S_ID_FIELDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F_DATE_FIELD;
    private javax.swing.JTextField F_S_ID_FIELD;
    private javax.swing.JTextField F_TIME_FIELD;
    private javax.swing.JTextField F_T_ID_FIELD;
    private javax.swing.JButton REPORT_REFRESH;
    private javax.swing.JButton REPORT_SEARCH;
    private javax.swing.JTextField S_ID_FIELD;
    private javax.swing.JButton S_ID_REFRESH;
    private javax.swing.JButton S_ID_SEARCH;
    private javax.swing.JTextField T_ID_FIELD;
    private javax.swing.JButton T_ID_REFRESH;
    private javax.swing.JButton T_ID_SEARCH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
