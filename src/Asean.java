
import java.net.URL;
import javax.swing.ImageIcon;


public class Asean extends javax.swing.JFrame {
    int  NumMusic=0;
    public Asean() {
        initComponents();
        
        URL url=getClass().getResource("/Project/1.png");
        ImageIcon icon=new ImageIcon(url);
        this.setIconImage(icon.getImage());
    //    this.setIconImage(new ImageIcon(getClass().getResource("/Project/1.png")).getImage());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Thailand = new javax.swing.JButton();
        Malaysia = new javax.swing.JButton();
        Cambodia = new javax.swing.JButton();
        Singapore = new javax.swing.JButton();
        Vietnam = new javax.swing.JButton();
        Brunei = new javax.swing.JButton();
        laos = new javax.swing.JButton();
        Philippines = new javax.swing.JButton();
        Indonesia = new javax.swing.JButton();
        Myanmar = new javax.swing.JButton();
        MusicThai = new javax.swing.JButton();
        MusicEnglish = new javax.swing.JButton();
        Home2 = new javax.swing.JButton();
        MThai = new javax.swing.JButton();
        MCombodia = new javax.swing.JButton();
        MMalaysia = new javax.swing.JButton();
        MSingapore = new javax.swing.JButton();
        MVietnam = new javax.swing.JButton();
        MBrunei = new javax.swing.JButton();
        MLaos = new javax.swing.JButton();
        MPhilippine = new javax.swing.JButton();
        MIndonesia = new javax.swing.JButton();
        MMyanmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1a.jpg"))); // NOI18N
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 70, 70));

        Thailand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1c.jpg"))); // NOI18N
        Thailand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThailandActionPerformed(evt);
            }
        });
        getContentPane().add(Thailand, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 160));

        Malaysia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1ca.jpg"))); // NOI18N
        Malaysia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalaysiaActionPerformed(evt);
            }
        });
        getContentPane().add(Malaysia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 200, 160));

        Cambodia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1cb.jpg"))); // NOI18N
        Cambodia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambodiaActionPerformed(evt);
            }
        });
        getContentPane().add(Cambodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 200, 140));

        Singapore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1cc.jpg"))); // NOI18N
        Singapore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingaporeActionPerformed(evt);
            }
        });
        getContentPane().add(Singapore, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 150));

        Vietnam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1cd.jpg"))); // NOI18N
        Vietnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VietnamActionPerformed(evt);
            }
        });
        getContentPane().add(Vietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 190, 150));

        Brunei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1ch.jpg"))); // NOI18N
        Brunei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BruneiActionPerformed(evt);
            }
        });
        getContentPane().add(Brunei, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 161, 200, 150));

        laos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1ce.jpg"))); // NOI18N
        laos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laosActionPerformed(evt);
            }
        });
        getContentPane().add(laos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 161, 200, 150));

        Philippines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1ci.jpg"))); // NOI18N
        Philippines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhilippinesActionPerformed(evt);
            }
        });
        getContentPane().add(Philippines, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 200, 150));

        Indonesia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1cj.jpg"))); // NOI18N
        Indonesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndonesiaActionPerformed(evt);
            }
        });
        getContentPane().add(Indonesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 200, 150));

        Myanmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1ck.jpg"))); // NOI18N
        Myanmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyanmarActionPerformed(evt);
            }
        });
        getContentPane().add(Myanmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 190, 140));

        MusicThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1a.png"))); // NOI18N
        MusicThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicThaiActionPerformed(evt);
            }
        });
        getContentPane().add(MusicThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, 70));

        MusicEnglish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1aa.png"))); // NOI18N
        MusicEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicEnglishActionPerformed(evt);
            }
        });
        getContentPane().add(MusicEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 70, 70));

        Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/1aa.jpg"))); // NOI18N
        Home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home2ActionPerformed(evt);
            }
        });
        getContentPane().add(Home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 70, 70));

        MThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MThai.png"))); // NOI18N
        MThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MThaiActionPerformed(evt);
            }
        });
        getContentPane().add(MThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 40));

        MCombodia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MCombodia.png"))); // NOI18N
        MCombodia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCombodiaActionPerformed(evt);
            }
        });
        getContentPane().add(MCombodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 60, 40));

        MMalaysia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MMalaysia.png"))); // NOI18N
        MMalaysia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMalaysiaActionPerformed(evt);
            }
        });
        getContentPane().add(MMalaysia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, 40));

        MSingapore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MSingapore.png"))); // NOI18N
        MSingapore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSingaporeActionPerformed(evt);
            }
        });
        getContentPane().add(MSingapore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 40));

        MVietnam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MVietnam.png"))); // NOI18N
        MVietnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MVietnamActionPerformed(evt);
            }
        });
        getContentPane().add(MVietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 60, 40));

        MBrunei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MBrunei.png"))); // NOI18N
        MBrunei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBruneiActionPerformed(evt);
            }
        });
        getContentPane().add(MBrunei, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 40));

        MLaos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MLaos.png"))); // NOI18N
        MLaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLaosActionPerformed(evt);
            }
        });
        getContentPane().add(MLaos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 40));

        MPhilippine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MPhilippine.png"))); // NOI18N
        MPhilippine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPhilippineActionPerformed(evt);
            }
        });
        getContentPane().add(MPhilippine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 60, 40));

        MIndonesia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MIndonesia.png"))); // NOI18N
        MIndonesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIndonesiaActionPerformed(evt);
            }
        });
        getContentPane().add(MIndonesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 60, 40));

        MMyanmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/thai/MMyanmar.png"))); // NOI18N
        MMyanmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMyanmarActionPerformed(evt);
            }
        });
        getContentPane().add(MMyanmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/2(1).jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home h = new Home();
        h.show();
        this.hide();  // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void ThailandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThailandActionPerformed
       Thai t = new Thai();
        t.show();
        this.hide();
    }//GEN-LAST:event_ThailandActionPerformed

    private void MalaysiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalaysiaActionPerformed
        Malay t = new Malay();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_MalaysiaActionPerformed

    private void CambodiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambodiaActionPerformed
        Cambodia t = new Cambodia();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_CambodiaActionPerformed

    private void SingaporeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingaporeActionPerformed
        Singapore t = new Singapore();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_SingaporeActionPerformed

    private void VietnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VietnamActionPerformed
       Vietnam t = new Vietnam();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_VietnamActionPerformed

    private void BruneiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BruneiActionPerformed
        Brunei t = new Brunei();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_BruneiActionPerformed

    private void laosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laosActionPerformed
         Laos t = new Laos();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_laosActionPerformed

    private void PhilippinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhilippinesActionPerformed
         Philippines t = new Philippines();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_PhilippinesActionPerformed

    private void IndonesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndonesiaActionPerformed
         Indonesia t = new Indonesia();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_IndonesiaActionPerformed

    private void MyanmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyanmarActionPerformed
         Myanmar t = new Myanmar();
        t.show();
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_MyanmarActionPerformed

    private void MusicEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicEnglishActionPerformed
         if( NumMusic==0 ){
MusicAsean.PlayMusicEnglish();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0;
} // TODO add your handling code here:
    }//GEN-LAST:event_MusicEnglishActionPerformed

    private void MusicThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicThaiActionPerformed
        if( NumMusic==0 ){
MusicAsean.PlayMusicThai();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0;
}  // TODO add your handling code here:
    }//GEN-LAST:event_MusicThaiActionPerformed

    private void Home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home2ActionPerformed
       Home h = new Home();
        h.show();
        this.hide(); // TODO add your handling code here:
    }//GEN-LAST:event_Home2ActionPerformed

    private void MThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MThaiActionPerformed
       if( NumMusic==0 ){
MusicAsean.PlayMThai();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0;
} // TODO add your handling code here:
    }//GEN-LAST:event_MThaiActionPerformed

    private void MBruneiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBruneiActionPerformed
         if( NumMusic==0 ){
MusicAsean.PlayMBrunei();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0;// TODO add your handling code here:
    }//GEN-LAST:event_MBruneiActionPerformed
    }
    private void MCombodiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCombodiaActionPerformed
        if( NumMusic==0 ){
MusicAsean.PlayMCambodia();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; // TODO add your handling code here:
    }//GEN-LAST:event_MCombodiaActionPerformed
    }
    private void MMalaysiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMalaysiaActionPerformed
        if( NumMusic==0 ){
MusicAsean.PlayMMalaysia();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; // TODO add your handling code here:
    }//GEN-LAST:event_MMalaysiaActionPerformed
    }
    private void MSingaporeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSingaporeActionPerformed
       if( NumMusic==0 ){
MusicAsean.PlayMSingapore();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; 
    }//GEN-LAST:event_MSingaporeActionPerformed
    }
    private void MVietnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MVietnamActionPerformed
      if( NumMusic==0 ){
MusicAsean.PlayMVietnam();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; 
    }                                          
     // TODO add your handling code here:
    }//GEN-LAST:event_MVietnamActionPerformed

    private void MLaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLaosActionPerformed
       if( NumMusic==0 ){
MusicAsean.PlayMLaos();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; 
    }        // TODO add your handling code here:
    }//GEN-LAST:event_MLaosActionPerformed

    private void MPhilippineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPhilippineActionPerformed
        if( NumMusic==0 ){
MusicAsean.PlayMPhilippines();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; 
    }       // TODO add your handling code here:
    }//GEN-LAST:event_MPhilippineActionPerformed

    private void MIndonesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIndonesiaActionPerformed
      if( NumMusic==0 ){
MusicAsean.PlayMIndonesia();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; 
    }         // TODO add your handling code here:
    }//GEN-LAST:event_MIndonesiaActionPerformed

    private void MMyanmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMyanmarActionPerformed
        if( NumMusic==0 ){
MusicAsean.PlayMMyanmar();
NumMusic= 1;
} else{
MusicAsean.stopMusic();
NumMusic=0; 
    }       // TODO add your handling code here:
    }//GEN-LAST:event_MMyanmarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Asean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asean().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brunei;
    private javax.swing.JButton Cambodia;
    private javax.swing.JButton Home;
    private javax.swing.JButton Home2;
    private javax.swing.JButton Indonesia;
    private javax.swing.JButton MBrunei;
    private javax.swing.JButton MCombodia;
    private javax.swing.JButton MIndonesia;
    private javax.swing.JButton MLaos;
    private javax.swing.JButton MMalaysia;
    private javax.swing.JButton MMyanmar;
    private javax.swing.JButton MPhilippine;
    private javax.swing.JButton MSingapore;
    private javax.swing.JButton MThai;
    private javax.swing.JButton MVietnam;
    private javax.swing.JButton Malaysia;
    private javax.swing.JButton MusicEnglish;
    private javax.swing.JButton MusicThai;
    private javax.swing.JButton Myanmar;
    private javax.swing.JButton Philippines;
    private javax.swing.JButton Singapore;
    private javax.swing.JButton Thailand;
    private javax.swing.JButton Vietnam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton laos;
    // End of variables declaration//GEN-END:variables
}
