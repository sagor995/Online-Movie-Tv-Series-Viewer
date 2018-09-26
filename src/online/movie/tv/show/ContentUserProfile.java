/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.movie.tv.show;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sagor Ahamed
 */
public class ContentUserProfile extends javax.swing.JFrame {
    
    String coverFileName;
    File file;
    FileInputStream fileInputStream;
    int coverlength;
    /**
     * Creates new form AdminPanel
     */
    public ContentUserProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
        showUSerDetails();
    }
    
    public void showUSerDetails(){
        
        
        try {
            ContentDatabaseHandler db=new ContentDatabaseHandler();
        db.connectDatabase();
        ResultSet resultSet = db.showUserDetails(UserLogin.usrname);
        
        while (resultSet.next()) {
           int id = resultSet.getInt("id");
           String name = resultSet.getString("uname");
           String email = resultSet.getString("email");
           String mobile = resultSet.getString("mobile");
           String password = resultSet.getString("password");
           String country = resultSet.getString("country");
           String gender = resultSet.getString("Gender");
           
           userProfileId.setText(""+id);
           userProfileName.setText(name);
           userProfileEmail.setText(email);
           userProfileMobile.setText(mobile);
           userProfilePassword.setText(password);
           userProfileCountry.setText(country);
           userProfileGender.setText(gender);
           
           updateUserProfileId.setText(userProfileId.getText());
           updateUserProfileName.setText(userProfileName.getText());
           updateUserProfileEmail.setText(userProfileEmail.getText());
           updateUSerProfileMobile.setText(userProfileMobile.getText());
           
            if (userProfileGender.getText().toString().equals("M")) {
                updateUSerProfileGender.setSelectedItem("Male");
            }else{
                updateUSerProfileGender.setSelectedItem("Female");
            }
          
           updateUserProfilePass.setText(userProfilePassword.getText());
           updateUserProfileCountry.setText(userProfileCountry.getText());
            
        }
        } catch (Exception e) {
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
        adminPanelClose = new javax.swing.JLabel();
        adminPanelMin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userProfileNameClose = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        userProfileUpdate = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userProfileName = new javax.swing.JLabel();
        userProfileEmail = new javax.swing.JLabel();
        userProfileMobile = new javax.swing.JLabel();
        userProfilePassword = new javax.swing.JLabel();
        userProfileCountry = new javax.swing.JLabel();
        userProfileGender = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        updateUserProfileName = new javax.swing.JTextField();
        updateUserProfileEmail = new javax.swing.JTextField();
        updateUSerProfileMobile = new javax.swing.JTextField();
        updateUserProfilePass = new javax.swing.JTextField();
        updateUserProfileCountry = new javax.swing.JTextField();
        updateUSerProfileGender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        userProfileId = new javax.swing.JLabel();
        updateUserProfileId = new javax.swing.JTextField();

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

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/i.png"))); // NOI18N
        jLabel6.setText("Tube");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminPanelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPanelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(adminPanelMin)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPanelClose)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        userProfileNameClose.setBackground(new java.awt.Color(255, 255, 255));
        userProfileNameClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userProfileNameClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/back.png"))); // NOI18N
        userProfileNameClose.setText("Back");
        userProfileNameClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileNameCloseActionPerformed(evt);
            }
        });

        userProfileUpdate.setBackground(new java.awt.Color(255, 255, 255));
        userProfileUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userProfileUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/Update.png"))); // NOI18N
        userProfileUpdate.setText("Update");
        userProfileUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileUpdateActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/i.png"))); // NOI18N
        jLabel8.setText("User Profile");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password:");

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mobile:");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email:");

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender:");

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Country:");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Name:");

        userProfileName.setBackground(new java.awt.Color(102, 102, 102));
        userProfileName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfileName.setForeground(new java.awt.Color(255, 255, 255));
        userProfileName.setText("User Name:");

        userProfileEmail.setBackground(new java.awt.Color(102, 102, 102));
        userProfileEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfileEmail.setForeground(new java.awt.Color(255, 255, 255));
        userProfileEmail.setText("User Name:");

        userProfileMobile.setBackground(new java.awt.Color(102, 102, 102));
        userProfileMobile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfileMobile.setForeground(new java.awt.Color(255, 255, 255));
        userProfileMobile.setText("User Name:");

        userProfilePassword.setBackground(new java.awt.Color(102, 102, 102));
        userProfilePassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfilePassword.setForeground(new java.awt.Color(255, 255, 255));
        userProfilePassword.setText("User Name:");

        userProfileCountry.setBackground(new java.awt.Color(102, 102, 102));
        userProfileCountry.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfileCountry.setForeground(new java.awt.Color(255, 255, 255));
        userProfileCountry.setText("User Name:");

        userProfileGender.setBackground(new java.awt.Color(102, 102, 102));
        userProfileGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfileGender.setForeground(new java.awt.Color(255, 255, 255));
        userProfileGender.setText("User Name:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        updateUserProfileName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        updateUserProfileEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        updateUSerProfileMobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateUSerProfileMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateUSerProfileMobileKeyPressed(evt);
            }
        });

        updateUserProfilePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        updateUserProfileCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        updateUSerProfileGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateUSerProfileGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id:");

        userProfileId.setBackground(new java.awt.Color(102, 102, 102));
        userProfileId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userProfileId.setForeground(new java.awt.Color(255, 255, 255));
        userProfileId.setText("User Name:");

        updateUserProfileId.setEditable(false);
        updateUserProfileId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userProfileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userProfileEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userProfileMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userProfilePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userProfileCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userProfileGender, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(userProfileId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateUserProfileName)
                    .addComponent(updateUserProfileEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(updateUSerProfileMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(updateUserProfilePass, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(updateUserProfileCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(updateUSerProfileGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateUserProfileId))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(userProfileId))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userProfileName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(userProfileEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(userProfileMobile))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(userProfilePassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(userProfileCountry))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(userProfileGender))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(updateUserProfileId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(updateUserProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateUserProfileEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateUSerProfileMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateUserProfilePass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateUserProfileCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateUSerProfileGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(userProfileUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userProfileNameClose, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userProfileUpdate)
                    .addComponent(userProfileNameClose))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void userProfileNameCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileNameCloseActionPerformed
            HomePage page = new HomePage();
           page.setVisible(true);
            page.pack();
            page.setLocationRelativeTo(null);
            page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_userProfileNameCloseActionPerformed

    private void userProfileUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileUpdateActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do You want to update Data", "Confirm",
                                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                    if (response == JOptionPane.NO_OPTION) {
                                     // System.out.println("No button clicked");
                                        
                                     
                                    } else if (response == JOptionPane.YES_OPTION) {
                                     // System.out.println("Yes button clicked");
                                     if(!Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", updateUserProfileEmail.getText())){
                                         JOptionPane.showMessageDialog(this, "Invalid Email!");   
                                     }else{
                                     try{
                                            char gender = ((updateUSerProfileGender.getSelectedIndex()==0)?'M':'F');

                                                    ContentDatabaseHandler db = new ContentDatabaseHandler();
                                                    db.connectDatabase();


                                                    db.updateUserData(Integer.valueOf(updateUserProfileId.getText()),updateUserProfileName.getText(), updateUserProfileEmail.getText(), updateUSerProfileMobile.getText(), updateUserProfilePass.getText(), updateUserProfileCountry.getText(),gender);

                                                JOptionPane.showMessageDialog(this, "Updated!!!");          
                                        }catch(Exception e){
                                        }
                                     
                                     HomePage page = new HomePage();
                                        page.setVisible(true);
                                         page.pack();
                                         page.setLocationRelativeTo(null);
                                         page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                         this.dispose();
                                     
                                     }
                                    } else if (response == JOptionPane.CLOSED_OPTION) {
                                    }
      
    }//GEN-LAST:event_userProfileUpdateActionPerformed

    private void updateUSerProfileMobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateUSerProfileMobileKeyPressed
       String mobile=updateUSerProfileMobile.getText();
        if (mobile.charAt(0)=='0' && mobile.charAt(1)=='1' && mobile.length()==11 && mobile.matches("[0-9]+")) {
            
        }else if (!(mobile.charAt(0)=='0' && mobile.charAt(1)=='1')) {
            JOptionPane.showMessageDialog(this,"Mobile number must be start with 0 and 1");
            updateUSerProfileMobile.setText("");
        } else if (!(mobile.length()==11)) {
            JOptionPane.showMessageDialog(this,"Mobile number must be 11 digit");
            updateUSerProfileMobile.setText("");
        }else{
            JOptionPane.showMessageDialog(this,"Invalid mobile Number");
            updateUSerProfileMobile.setText("");
        }
    }//GEN-LAST:event_updateUSerProfileMobileKeyPressed

//    public ImageIcon ResizeImage(String ImagePath)
//    {
//        ImageIcon MyImage = new ImageIcon(ImagePath);
//        Image img = MyImage.getImage();
//        Image newImg = img.getScaledInstance(movieCoverImg.getWidth(), movieCoverImg.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImg);
//        return image;
//    }
    
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
            java.util.logging.Logger.getLogger(ContentUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContentUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContentUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContentUserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ContentUserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminPanelClose;
    private javax.swing.JLabel adminPanelMin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> updateUSerProfileGender;
    private javax.swing.JTextField updateUSerProfileMobile;
    private javax.swing.JTextField updateUserProfileCountry;
    private javax.swing.JTextField updateUserProfileEmail;
    private javax.swing.JTextField updateUserProfileId;
    private javax.swing.JTextField updateUserProfileName;
    private javax.swing.JTextField updateUserProfilePass;
    private javax.swing.JLabel userProfileCountry;
    private javax.swing.JLabel userProfileEmail;
    private javax.swing.JLabel userProfileGender;
    private javax.swing.JLabel userProfileId;
    private javax.swing.JLabel userProfileMobile;
    private javax.swing.JLabel userProfileName;
    private javax.swing.JButton userProfileNameClose;
    private javax.swing.JLabel userProfilePassword;
    private javax.swing.JButton userProfileUpdate;
    // End of variables declaration//GEN-END:variables
}