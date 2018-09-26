/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.movie.tv.show;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sagor Ahamed
 */
public class UserList extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public UserList() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        AdminDatabaseHandler db = new AdminDatabaseHandler();
                 db.connectDatabase();
                 db.showUserDetails(userData,"");
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
        adminPanelClose = new javax.swing.JLabel();
        adminPanelMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userListUpdate = new javax.swing.JButton();
        userListSearchValue = new javax.swing.JTextField();
        adminListSearch = new javax.swing.JButton();
        userListBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userData = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        userListUName = new javax.swing.JTextField();
        userListMobileNo = new javax.swing.JTextField();
        userListEmail = new javax.swing.JTextField();
        userListCountry = new javax.swing.JTextField();
        userListGender = new javax.swing.JComboBox<>();
        userListPAssword = new javax.swing.JPasswordField();
        userListID = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        userListDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        adminPanelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminPanelClose.setForeground(new java.awt.Color(255, 255, 255));
        adminPanelClose.setText("X");
        adminPanelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminPanelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPanelCloseMouseClicked(evt);
            }
        });

        adminPanelMin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminPanelMin.setForeground(new java.awt.Color(255, 255, 255));
        adminPanelMin.setText("_");
        adminPanelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminPanelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPanelMinMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/i.png"))); // NOI18N
        jLabel1.setText("Tube");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminPanelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPanelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPanelClose)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(adminPanelMin)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        userListUpdate.setBackground(new java.awt.Color(255, 255, 255));
        userListUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userListUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/Update.png"))); // NOI18N
        userListUpdate.setText("Update");
        userListUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListUpdateActionPerformed(evt);
            }
        });

        userListSearchValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userListSearchValue.setToolTipText("");
        userListSearchValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userListSearchValueKeyTyped(evt);
            }
        });

        adminListSearch.setBackground(new java.awt.Color(51, 51, 51));
        adminListSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminListSearch.setForeground(new java.awt.Color(255, 255, 255));
        adminListSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/search.png"))); // NOI18N
        adminListSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminListSearchActionPerformed(evt);
            }
        });

        userListBack.setBackground(new java.awt.Color(255, 255, 255));
        userListBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userListBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/back.png"))); // NOI18N
        userListBack.setText("Back");
        userListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListBackActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(User List)");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        userData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User Name", "Email", "Mobile", "Password", "Country", "Gender"
            }
        ));
        userData.setGridColor(new java.awt.Color(255, 255, 255));
        userData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userData);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("User Name:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Email:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Password:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Country:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Mobile No:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Gender:");

        userListUName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        userListMobileNo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userListMobileNo.setToolTipText("+88017XXXXXXX");

        userListEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userListEmail.setToolTipText("someone@mail.com");

        userListCountry.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        userListGender.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userListGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        userListGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userListGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListGenderActionPerformed(evt);
            }
        });

        userListPAssword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        userListID.setEditable(false);
        userListID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("ID:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Manage Details");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel26)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21)
                                .addComponent(userListUName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userListEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userListMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addComponent(userListPAssword, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25)
                            .addComponent(userListCountry)
                            .addComponent(userListGender, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userListID, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListUName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListPAssword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userListCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        userListDelete.setBackground(new java.awt.Color(255, 255, 255));
        userListDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userListDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/delete.png"))); // NOI18N
        userListDelete.setText("Delete");
        userListDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userListSearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminListSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userListUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(userListDelete)
                                .addGap(296, 296, 296)
                                .addComponent(userListBack)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userListSearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminListSearch)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userListBack)
                    .addComponent(userListUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userListDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminPanelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelMinMouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_adminPanelMinMouseClicked

    private void adminPanelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_adminPanelCloseMouseClicked

    private void userListUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userListUpdateActionPerformed

    private void adminListSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminListSearchActionPerformed
       AdminDatabaseHandler db = new AdminDatabaseHandler();
                 db.connectDatabase();
                 userData.setModel(new DefaultTableModel(null, new Object[]{"ID","User Name","Email","Mobile","Password","Country","Gender"}));
                 db.showUserDetails(userData, userListSearchValue.getText());
    }//GEN-LAST:event_adminListSearchActionPerformed

    private void userListBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListBackActionPerformed
        
         AdminSettings settings = new AdminSettings();
            settings.setVisible(true);
            settings.pack();
            settings.setLocationRelativeTo(null);
            settings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_userListBackActionPerformed

    private void userListGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userListGenderActionPerformed

    private void userListDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListDeleteActionPerformed
        
        if (userListID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
        }else{
        AdminDatabaseHandler db = new AdminDatabaseHandler();
                    db.connectDatabase(); 
                     db.deleteUserData(Integer.valueOf(userListID.getText()));
                     JOptionPane.showMessageDialog(this, "User Data Deleted");
                     
                     //After data updated table will be refreshed
//                        this.setVisible(false); //this will close frame i.e. NewJFrame
//                        new UserList().setVisible(true);
                db.showUserDetails(userData, "");
                userData.setModel(new DefaultTableModel(null, new Object[]{"ID","User Name","Email","Mobile","Password","Country","Gender"}));
                 db.showUserDetails(userData, userListSearchValue.getText());
                 userListID.setText("");
                 userListUName.setText("");
                 userListEmail.setText("");
                 userListEmail.setText("");
                 userListMobileNo.setText("");
                 userListPAssword.setText("");
                 userListCountry.setText("");
                 userListGender.setSelectedItem("Male");
    }
        
    }//GEN-LAST:event_userListDeleteActionPerformed

    private void userDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userDataMouseClicked
        int rowIndex=userData.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) userData.getModel();
        
        userListUName.setText(model.getValueAt(rowIndex, 1).toString());
        userListEmail.setText(model.getValueAt(rowIndex, 2).toString());
        userListMobileNo.setText(model.getValueAt(rowIndex, 3).toString());
        userListPAssword.setText(model.getValueAt(rowIndex, 4).toString());
        userListCountry.setText(model.getValueAt(rowIndex, 5).toString());
        if (model.getValueAt(rowIndex, 6).toString().equals("M")) {
            userListGender.setSelectedItem("Male");
        }else{
             userListGender.setSelectedItem("Female");
        }
        
        //userListGender.setText(model.getValueAt(rowIndex, 0));
        userListID.setText(model.getValueAt(rowIndex, 0).toString());
    }//GEN-LAST:event_userDataMouseClicked

    private void userListSearchValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userListSearchValueKeyTyped
        AdminDatabaseHandler db = new AdminDatabaseHandler();
                 db.connectDatabase();
                 userData.setModel(new DefaultTableModel(null, new Object[]{"ID","User Name","Email","Mobile","Password","Country","Gender"}));
                 db.showAdminDetails(userData, userListSearchValue.getText());
    }//GEN-LAST:event_userListSearchValueKeyTyped

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
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new UserList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminListSearch;
    private javax.swing.JLabel adminPanelClose;
    private javax.swing.JLabel adminPanelMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable userData;
    private javax.swing.JButton userListBack;
    private javax.swing.JTextField userListCountry;
    private javax.swing.JButton userListDelete;
    private javax.swing.JTextField userListEmail;
    private javax.swing.JComboBox<String> userListGender;
    private javax.swing.JTextField userListID;
    private javax.swing.JTextField userListMobileNo;
    private javax.swing.JPasswordField userListPAssword;
    private javax.swing.JTextField userListSearchValue;
    private javax.swing.JTextField userListUName;
    private javax.swing.JButton userListUpdate;
    // End of variables declaration//GEN-END:variables
}
