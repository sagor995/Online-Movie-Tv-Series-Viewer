/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.movie.tv.show;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class MoviePage extends javax.swing.JFrame {
    ContentDatabaseHandler db;
    ResultSet info;
    /**
     * Creates new form MoviePage
     */
    public MoviePage(int id) {
        initComponents();
        LookAndFeel();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        db = new ContentDatabaseHandler();
        db.connectDatabase();
        
        String query = "SELECT * FROM content WHERE id="+id;
        info = db.getContent(query);
        
        try{
            while(info.next()){
                 java.sql.Blob img = info.getBlob("covers");
                InputStream in = img.getBinaryStream();  
                BufferedImage image = ImageIO.read(in);
                
                Image imge = image.getScaledInstance(movieCover.getWidth(), movieCover.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon image1 = new ImageIcon(imge);
                        movieCover.setIcon(image1);
                
                String name = info.getString("name");
                MovieTitleLabel.setText(name);
                
                String genre = info.getString("genre");
                GenreLabel.setText(genre);
                
                String release_date = info.getString("release_date");
                ReleaseDateLabel.setText(release_date);
                
                String language = info.getString("language");
                LanguageLabel.setText(language);
                
                String cast = "Starring:\n"+info.getString("cast");
                CastTextArea.setText(cast);
                
                String synopsis = "Synopsis:\n"+info.getString("synopsis");
                SynopsisTextArea.setText(synopsis);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        query = "SELECT * FROM content_movie WHERE content_id="+id;
        info = db.getContent(query);
        
        try{
            while(info.next()){
                String director = "Directed by:\n"+info.getString("directed_by");
                DirectorTextArea.setText(director);
                
                String runtime = info.getString("runtime")+" min.";
                RuntimeLabel.setText(runtime);
            }
        }catch(Exception e){
            e.printStackTrace();
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

        TopSectionMoviePage = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        MainSectionMoviePage = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        GenreLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CastTextArea = new javax.swing.JTextArea();
        LanguageLabel = new javax.swing.JLabel();
        ReleaseDateLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SynopsisTextArea = new javax.swing.JTextArea();
        RuntimeLabel = new javax.swing.JLabel();
        PlayButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DirectorTextArea = new javax.swing.JTextArea();
        MovieTitleLabel = new javax.swing.JLabel();
        movieCover = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        adminPanelClose2 = new javax.swing.JLabel();
        adminPanelMin2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TopSectionMoviePage.setBackground(new java.awt.Color(51, 153, 0));
        TopSectionMoviePage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        HomeButton.setBackground(new java.awt.Color(0, 102, 204));
        HomeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopSectionMoviePageLayout = new javax.swing.GroupLayout(TopSectionMoviePage);
        TopSectionMoviePage.setLayout(TopSectionMoviePageLayout);
        TopSectionMoviePageLayout.setHorizontalGroup(
            TopSectionMoviePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopSectionMoviePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopSectionMoviePageLayout.setVerticalGroup(
            TopSectionMoviePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopSectionMoviePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainSectionMoviePage.setBackground(new java.awt.Color(153, 153, 255));
        MainSectionMoviePage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(914, 858));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(895, 856));

        GenreLabel.setBackground(new java.awt.Color(255, 255, 255));
        GenreLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        GenreLabel.setText("Genre");
        GenreLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        GenreLabel.setOpaque(true);

        CastTextArea.setEditable(false);
        CastTextArea.setColumns(15);
        CastTextArea.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        CastTextArea.setRows(5);
        CastTextArea.setText("Starring");
        CastTextArea.setAutoscrolls(false);
        CastTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CastTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(CastTextArea);

        LanguageLabel.setBackground(new java.awt.Color(255, 255, 255));
        LanguageLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        LanguageLabel.setText("Language");
        LanguageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LanguageLabel.setOpaque(true);

        ReleaseDateLabel.setBackground(new java.awt.Color(255, 255, 255));
        ReleaseDateLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        ReleaseDateLabel.setText("Release Date");
        ReleaseDateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ReleaseDateLabel.setOpaque(true);

        SynopsisTextArea.setEditable(false);
        SynopsisTextArea.setColumns(15);
        SynopsisTextArea.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        SynopsisTextArea.setRows(5);
        SynopsisTextArea.setText("Synopsis");
        SynopsisTextArea.setAutoscrolls(false);
        SynopsisTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(SynopsisTextArea);

        RuntimeLabel.setBackground(new java.awt.Color(255, 255, 255));
        RuntimeLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        RuntimeLabel.setText("Runtime");
        RuntimeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        RuntimeLabel.setOpaque(true);

        PlayButton.setBackground(new java.awt.Color(204, 51, 0));
        PlayButton.setText("Play");

        DirectorTextArea.setEditable(false);
        DirectorTextArea.setColumns(15);
        DirectorTextArea.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        DirectorTextArea.setRows(5);
        DirectorTextArea.setText("Directed by");
        DirectorTextArea.setAutoscrolls(false);
        DirectorTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DirectorTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(DirectorTextArea);

        MovieTitleLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        MovieTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        MovieTitleLabel.setText("Movie Title");

        movieCover.setBackground(new java.awt.Color(255, 255, 255));
        movieCover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PlayButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(movieCover, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ReleaseDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(GenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RuntimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LanguageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3))
                            .addGap(17, 17, 17)))
                    .addComponent(MovieTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MovieTitleLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RuntimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LanguageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReleaseDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(movieCover, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout MainSectionMoviePageLayout = new javax.swing.GroupLayout(MainSectionMoviePage);
        MainSectionMoviePage.setLayout(MainSectionMoviePageLayout);
        MainSectionMoviePageLayout.setHorizontalGroup(
            MainSectionMoviePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainSectionMoviePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainSectionMoviePageLayout.setVerticalGroup(
            MainSectionMoviePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainSectionMoviePageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(822, 822, 822))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setForeground(new java.awt.Color(0, 102, 255));

        adminPanelClose2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminPanelClose2.setForeground(new java.awt.Color(255, 255, 255));
        adminPanelClose2.setText("X");
        adminPanelClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminPanelClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPanelClose2MouseClicked(evt);
            }
        });

        adminPanelMin2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminPanelMin2.setForeground(new java.awt.Color(255, 255, 255));
        adminPanelMin2.setText("_");
        adminPanelMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminPanelMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPanelMin2MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/movie/tv/show/images/i.png"))); // NOI18N
        jLabel8.setText("Tube");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(359, 359, 359)
                .addComponent(adminPanelMin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminPanelClose2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(adminPanelMin2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPanelClose2)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopSectionMoviePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainSectionMoviePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TopSectionMoviePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainSectionMoviePage, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        HomePage h = new HomePage();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
         h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void adminPanelClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelClose2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_adminPanelClose2MouseClicked

    private void adminPanelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelMin2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_adminPanelMin2MouseClicked

    /**
     * @param args the command line arguments
     */
    public void LookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CastTextArea;
    private javax.swing.JTextArea DirectorTextArea;
    private javax.swing.JLabel GenreLabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel LanguageLabel;
    private javax.swing.JPanel MainSectionMoviePage;
    private javax.swing.JLabel MovieTitleLabel;
    private javax.swing.JButton PlayButton;
    private javax.swing.JLabel ReleaseDateLabel;
    private javax.swing.JLabel RuntimeLabel;
    private javax.swing.JTextArea SynopsisTextArea;
    private javax.swing.JPanel TopSectionMoviePage;
    private javax.swing.JLabel adminPanelClose;
    private javax.swing.JLabel adminPanelClose2;
    private javax.swing.JLabel adminPanelMin;
    private javax.swing.JLabel adminPanelMin2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel movieCover;
    // End of variables declaration//GEN-END:variables
}