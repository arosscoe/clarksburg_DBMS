package clarksburgdbms.actionforms.search;

import clarksburgdbms.Main;
import clarksburgdbms.choiceforms.Search;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quentin
 */
public class SearchStudent extends javax.swing.JFrame {

    Connection connection;
    
    public SearchStudent() {
        initComponents();
        
        String url = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/cpetza1db";
        String username = "cpetza1";
        String password = "COSC*l1j11";
        
        try {
            connection = DriverManager.getConnection(url, username, password); 
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,  ex.toString());
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SearchField = new javax.swing.JFormattedTextField();
        HomeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        Search2Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setText("Search Student");

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        Search2Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Search2Button.setText("Search");
        Search2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ButtonActionPerformed(evt);
            }
        });

        studentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First", "Middle", "Last", "ASA SSN", "Attendance SSN", "Address", "Parent Contact", "DOB", "Ethnicity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable1);

        studentTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Commuter Type", "Attendance", "Emergency Contact", "Education Plan", "Homeroom", "Phone", "Medical Info", "Guardian SSN", "Grade Report ID", "Principal SSN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(studentTable2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Student ID OR First Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(Search2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HomeButton)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(Search2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
      
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new Search().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void Search2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ButtonActionPerformed
        try {
            String Query = "USE cpetza1db";  // Select the database
            Statement stmt = connection.createStatement();
            stmt.execute(Query);
            String query1 = "SELECT STUDENT_ID, FNAME, MNAME, LNAME,"
                    + " STU_ASA_SSN, STU_ATTEN_SEC_SSN, ADDRESS, PARENTAL_CONTACT, DOB,"
                    + " ETHNICITY FROM STUDENT WHERE STUDENT_ID = '" + SearchField.getText() + "' OR FNAME = '" + SearchField.getText() + "'";
//            String query1 = "SELECT STUDENT_ID, FNAME, MNAME, LNAME, STU_ASA_SSN, STU_ATTEN_SEC_SSN,"
//                    + "ADDRESS, PARENTAL_CONTACT, DOB, ETHNICITY FROM STUDENT WHERE SSN = '" + SearchField.getText() + "'"
//                    + " OR FNAME = '" + SearchField.getText() + "'";
            PreparedStatement pstmt = connection.prepareStatement(query1);
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel)studentTable1.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                    rs.getString(8), rs.getString(9), rs.getString(10)});
            }
            String query2 = "SELECT COMMUTER_TYPE, ATTENDENCE, EMERGENCY_CONTECT, EDUCATION_PLAN,"
                    + " HOMEROOM_NO, PHONE_NO, MEDICAL_INFORMATION, STU_GUARDIAN_SSN, STU_GRADE_ID,"
                    + " STU_P_SSN FROM STUDENT WHERE STUDENT_ID = '" + SearchField.getText() + "' OR FNAME = '" + SearchField.getText() + "'";
            PreparedStatement pstmt2 = connection.prepareStatement(query2);
            ResultSet rs2 = pstmt2.executeQuery();
            DefaultTableModel model2 = (DefaultTableModel)studentTable2.getModel();
            model2.setRowCount(0);
            while(rs2.next()){
                model2.addRow(new String[]{rs2.getString(1), rs2.getString(2),
                    rs2.getString(3), rs2.getString(4), rs2.getString(5), rs2.getString(6), rs2.getString(7),
                    rs2.getString(8), rs2.getString(9), rs2.getString(10)});
            }
        } catch(SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }//GEN-LAST:event_Search2ButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton Search2Button;
    private javax.swing.JFormattedTextField SearchField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable studentTable1;
    private javax.swing.JTable studentTable2;
    // End of variables declaration//GEN-END:variables
}
