
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.Podaci;
import project.Select;
import project.Smjestaj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihada
 */
public class filter extends javax.swing.JFrame {

    /**
     * Creates new form filter
     */
    public filter() {
        initComponents();
    }
public static ArrayList<Smjestaj> smjestaji = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("PRETRAGA SMJE??TAJA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 313, 75));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Lokacija:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Kapacitet:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cijena od:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 110, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("do:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 90, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 153, 0));
        jCheckBox1.setText("Parking");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 153, 0));
        jCheckBox2.setText("Wifi");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 153, 0));
        jCheckBox3.setText("Bazen");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(204, 153, 0));
        jCheckBox4.setText("Ku??ni ljubimci");
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Pretra??i");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 130, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Odustani");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Pretra??i samo po ocjeni:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 110, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String vrsta_smjestaja, cijenamin,cijenamax, lokacija, kapacitet, kucni_ljubimci, bazen, wifi, parking, ocjena;
        lokacija = jTextField1.getText();
        kapacitet = jTextField2.getText();
        cijenamin = jTextField3.getText();
        cijenamax = jTextField4.getText();
        ocjena = jTextField6.getText();
        
        if (jCheckBox1.isSelected())
            parking = "1";
        else parking = "0";
        
        if (jCheckBox3.isSelected())
            bazen = "1";
        else bazen = "0";
        
         if (jCheckBox2.isSelected())
            wifi = "1";
        else wifi = "0";
        
        if (jCheckBox4.isSelected())
            kucni_ljubimci = "1";
        else kucni_ljubimci = "0";
         ResultSet rs=Select.getData("select * from smjestaj");
              Smjestaj sm;
        if(!lokacija.equals("")) {
            try {
                 while(rs.next()) {
                 if(rs.getString(14).toLowerCase().equals(lokacija.toLowerCase())) {
                     sm = new Smjestaj(rs.getInt("id_smjestaj"),rs.getBoolean("parking"),rs.getBoolean("bazen"),
                             rs.getBoolean("kucni_ljubimci"),rs.getBoolean("wifi"), rs.getBoolean("balkon"),rs.getBoolean("rostilj"),
                             rs.getInt("sprat"),rs.getInt("id_izdavac"),rs.getInt("kapacitet"),rs.getBoolean("status"),
                             rs.getString("vrsta_smjestaja"),rs.getString("velicina"),rs.getString("lokacija"),rs.getDouble("cijena"), rs.getDouble("ocjena"));
                     smjestaji.add(sm);
                 }
                 }
            }
            catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
            }
        } else if(!kapacitet.equals("")) {
            try {
                 while(rs.next()) {
                 if(Integer.parseInt(rs.getString(12)) >= Integer.parseInt(kapacitet)) {
                     sm = new Smjestaj(rs.getInt("id_smjestaj"),rs.getBoolean("parking"),rs.getBoolean("bazen"),
                             rs.getBoolean("kucni_ljubimci"),rs.getBoolean("wifi"), rs.getBoolean("balkon"),rs.getBoolean("rostilj"),
                             rs.getInt("sprat"),rs.getInt("id_izdavac"),rs.getInt("kapacitet"),rs.getBoolean("status"),
                             rs.getString("vrsta_smjestaja"),rs.getString("velicina"),rs.getString("lokacija"),rs.getDouble("cijena"), rs.getDouble("ocjena"));
                     smjestaji.add(sm);
                 }
                 }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else if(!cijenamax.equals("") & !cijenamin.equals("")) {
            try {
                 while(rs.next()) {
                 if(Double.parseDouble(rs.getString(13))<=Double.parseDouble(cijenamax) & Double.parseDouble(rs.getString(13))>=Double.parseDouble(cijenamin)) {
                     sm = new Smjestaj(rs.getInt("id_smjestaj"),rs.getBoolean("parking"),rs.getBoolean("bazen"),
                             rs.getBoolean("kucni_ljubimci"),rs.getBoolean("wifi"), rs.getBoolean("balkon"),rs.getBoolean("rostilj"),
                             rs.getInt("sprat"),rs.getInt("id_izdavac"),rs.getInt("kapacitet"),rs.getBoolean("status"),
                             rs.getString("vrsta_smjestaja"),rs.getString("velicina"),rs.getString("lokacija"),rs.getDouble("cijena"), rs.getDouble("ocjena"));
                     smjestaji.add(sm);
                 }
                 }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else if(!ocjena.equals("")) {
            try {
                 while(rs.next()) {
                 if(rs.getDouble(16)>=Double.parseDouble(ocjena)) {
                     sm = new Smjestaj(rs.getInt("id_smjestaj"),rs.getBoolean("parking"),rs.getBoolean("bazen"),
                             rs.getBoolean("kucni_ljubimci"),rs.getBoolean("wifi"), rs.getBoolean("balkon"),rs.getBoolean("rostilj"),
                             rs.getInt("sprat"),rs.getInt("id_izdavac"),rs.getInt("kapacitet"),rs.getBoolean("status"),
                             rs.getString("vrsta_smjestaja"),rs.getString("velicina"),rs.getString("lokacija"),rs.getDouble("cijena"), rs.getDouble("ocjena"));
                     smjestaji.add(sm);
                 }
                 }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else if (lokacija.equals("") & kapacitet.equals("") & cijenamax.equals("") & cijenamin.equals("")  ) {
            JOptionPane.showMessageDialog(null, "Potrebno upisati neki podatak za izvr??avanje pretrage.");
        } else {
            try {
                 while(rs.next()) {
                 if(rs.getString(14).toLowerCase().equals(lokacija.toLowerCase()) & Integer.parseInt(rs.getString(12)) >= Integer.parseInt(kapacitet) & rs.getString(4).equals(parking) & rs.getString(5).equals(wifi) & rs.getString(7).equals(bazen) & rs.getString(8).equals(kucni_ljubimci) & Double.parseDouble(rs.getString(13))<=Double.parseDouble(cijenamax) & Double.parseDouble(rs.getString(13))>=Double.parseDouble(cijenamin)) {
                     sm = new Smjestaj(rs.getInt("id_smjestaj"),rs.getBoolean("parking"),rs.getBoolean("bazen"),
                             rs.getBoolean("kucni_ljubimci"),rs.getBoolean("wifi"), rs.getBoolean("balkon"),rs.getBoolean("rostilj"),
                             rs.getInt("sprat"),rs.getInt("id_izdavac"),rs.getInt("kapacitet"),rs.getBoolean("status"),
                             rs.getString("vrsta_smjestaja"),rs.getString("velicina"),rs.getString("lokacija"),rs.getDouble("cijena"), rs.getDouble("ocjena"));
                     smjestaji.add(sm);
                 }
                 }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
         setVisible(false);
         new prikaz_smjestaja().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Podaci.getKorisnik() != "") {
            new home().setVisible(true);
            this.setVisible(false);
        }
        else {
            new gost().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
