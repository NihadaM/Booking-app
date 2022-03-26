
import java.awt.Image;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ImageIcon;
import project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihada
 */
public class prikaz_smjestaja extends javax.swing.JFrame {

    /**
     * Creates new form prikaz_smjestaja
     */
    public prikaz_smjestaja() {
        initComponents();
         pokazi_smjestaj();
    }
    public static int ID = 0;
  
    int i=0,brojac=0,j=0;
    ArrayList<Smjestaj> listasm= filter.smjestaji;
       

    public void pokazi_smjestaj(){
    
        DefaultTableModel model= (DefaultTableModel)jTable_smjestaj.getModel();
    model.setRowCount(0);
    jTable_smjestaj.setRowHeight(120);
    Object[] row = new Object[15];
    //i=i+pomak;
    if(listasm.size()!=0){
    for(;i<listasm.size();i++) {
        if( brojac < 5 && listasm.get(i).getstatus() == true){
            brojac++;
            row[0]=listasm.get(i).getid_smjestaj();
            row[1]=listasm.get(i).getvrsta_smjestaja();
            row[2]=listasm.get(i).getvelicina();
            row[3]=listasm.get(i).getparking();
            row[4]=listasm.get(i).getwifi();
            row[5]=listasm.get(i).getbalkon();
            row[6]=listasm.get(i).getbazen();
            row[7]=listasm.get(i).getkucni_ljubimci();
            row[8]=listasm.get(i).getrostilj();
            row[9]=listasm.get(i).getsprat();
            row[10]=listasm.get(i).getid_izdavac();
            row[11]=listasm.get(i).getkapacitet();
            row[12]=listasm.get(i).getcijena();
            row[13]=listasm.get(i).getlokacija();
            row[14]=listasm.get(i).getocjena();
            model.addRow(row);
        }  else {
            break;
        }
    }
    } else {
    JOptionPane.showMessageDialog(null, "Nema rezultata pretrage.");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_smjestaj = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_smjestaj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID smještaja", "Vrsta smještaja", "Veličina", "Parking", "Wifi", "Balkon", "Bazen", "Kućni ljubimci", "Roštilj", "Sprat", "Kapacitet", "Cijena", "Lokacija", "Slika", "Ocjena"
            }
        ));
        jTable_smjestaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_smjestajMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_smjestaj);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1267, 360));

        jButton1.setText("Sljedeća stranica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1199, 568, 135, 38));

        jButton2.setText("Vratite se na početak");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 568, 142, 39));

        jButton4.setText("Vratite se na pretraživanje");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 576, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jButton5.setText("Prikažite sliku");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 130, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 439, 220, 168));

        jLabel2.setText("Unesite id smještaja kojem ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        jLabel3.setText("želite vidjeti sliku:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(i > listasm.size()){
        }
        else {
        brojac=0;
        j=0;
        pokazi_smjestaj();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        i=0;
        brojac=0;
        pokazi_smjestaj();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        filter.smjestaji.clear();
        setVisible(false);
        new filter().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable_smjestajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_smjestajMouseClicked
        // TODO add your handling code here:
         int index = jTable_smjestaj.getSelectedRow();
       
        TableModel table = jTable_smjestaj.getModel();
       
       String id = table.getValueAt(index,0).toString();
        ID = Integer.parseInt(id);
        
        if (Podaci.getKorisnik() != "") {
        
            try {
                int a = JOptionPane.showConfirmDialog(null, "Želite li izvršiti rezervaciju?", "Da", JOptionPane.YES_NO_OPTION);
                if(a == 0) {
                    new rezervisanje().setVisible(true);
                    this.setVisible(false);
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        }
        else {
            JOptionPane.showMessageDialog(null, "Niste prijavljeni!");
        }
    }//GEN-LAST:event_jTable_smjestajMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        filter.smjestaji.clear();
        if (Podaci.getKorisnik() != "") {
            new home().setVisible(true);
            this.setVisible(false);
        }
        else {
            new gost().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
        ResultSet rs=Select.getData("select * from smjestaj where id_smjestaj = '"+jTextField1.getText()+"'");
        if(rs.next()) {
        byte[] img= rs.getBytes("slika");
        ImageIcon image = new ImageIcon(img);
        Image im= image.getImage();
        Image myImg = im.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage=new ImageIcon(myImg);
        jLabel1.setIcon(newImage);
        }
        } catch (Exception e) {
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown
   
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
            java.util.logging.Logger.getLogger(prikaz_smjestaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prikaz_smjestaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prikaz_smjestaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prikaz_smjestaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prikaz_smjestaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_smjestaj;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}