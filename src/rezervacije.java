
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class rezervacije extends javax.swing.JFrame {

    /**
     * Creates new form rezervacije
     */
    public rezervacije() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clo.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 40, 30));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel1.setText("REZERVACIJE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nepotvrđene rezervacije");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jTable2.setForeground(new java.awt.Color(0, 153, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Smjestaj", "Lokacija", "Korisnik", "Datum dolaska", "Datum odlaska", "Broj osoba"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 153, 0));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 660, 140));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Potvrđene rezervacije");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jTable3.setForeground(new java.awt.Color(204, 51, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Smjestaj", "Lokacija", "Korisnik", "Datum dolaska", "Datum odlaska", "Broj osoba"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(204, 51, 0));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 660, 150));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/strelica.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 37));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/z9FxcE.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 898, 601));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(null, "Da li stvarno želite izaći?","Izaberite",JOptionPane.YES_NO_OPTION);
       if(a==0)
               System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs1 = Select.getData("Select rezervacija.id_rezervacija, smjestaj.vrsta_smjestaja, smjestaj.lokacija, korisnik.username, rezervacija.check_in, rezervacija.check_out, rezervacija.br_osoba from rezervacija join smjestaj on rezervacija.id_smjestaj = smjestaj.id_smjestaj join korisnik on rezervacija.id_korisnik = korisnik.id_korisnik where rezervacija.potvrda = '1' and smjestaj.id_izdavac = " + Podaci.getId());
        DefaultTableModel table1 = (DefaultTableModel)jTable2.getModel();
        
        try {
         
            while (rs1.next()) {
                table1.addRow(new Object[]{
                    rs1.getString(1),
                    rs1.getString(2),
                    rs1.getString(3),
                    rs1.getString(4),
                    rs1.getDate(5),
                    rs1.getDate(6),
                    rs1.getString(7)});
            }
            
            rs1.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        ResultSet rs2 = Select.getData("Select rezervacija.id_rezervacija, smjestaj.vrsta_smjestaja, smjestaj.lokacija, korisnik.username, rezervacija.check_in, rezervacija.check_out, rezervacija.br_osoba from rezervacija join smjestaj on rezervacija.id_smjestaj = smjestaj.id_smjestaj join korisnik on rezervacija.id_korisnik = korisnik.id_korisnik where rezervacija.potvrda = '0' and smjestaj.id_izdavac = " + Podaci.getId());
        DefaultTableModel table2 = (DefaultTableModel)jTable3.getModel();
        
        try {
         
            while (rs2.next()) {
                table2.addRow(new Object[]{
                    rs2.getString(1),
                    rs2.getString(2),
                    rs2.getString(3),
                    rs2.getString(4),
                    rs2.getDate(5),
                    rs2.getDate(6),
                    rs2.getString(7)});
            }
    
            rs2.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new izdavac().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static int id_korisnik = -1;

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int index = jTable3.getSelectedRow();
       
        TableModel table = jTable3.getModel();
       
        String id = table.getValueAt(index,0).toString();
        ResultSet rs = Select.getData("Select id_korisnik from rezervacija where id_rezervacija = " + id);
        
        try {
            if(rs.next()) {
                id_korisnik = rs.getInt(1);
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        double cijena = 0;
        //System.out.println("id korisnik " + id_korisnik + "\n id izdavac " + id);
        
        try {
            int a = JOptionPane.showConfirmDialog(null, "Zelite li potvrditi rezervaciju?", "Da", JOptionPane.YES_NO_OPTION);
            if(a == 0) {
                
                ResultSet cijenaSql = Select.getData("Select DATEDIFF(rezervacija.check_out, rezervacija.check_in), smjestaj.cijena from rezervacija join smjestaj on smjestaj.id_smjestaj = rezervacija.id_smjestaj where id_rezervacija = " + id);
                
                try {
                    if(cijenaSql.next()) {
                        //System.out.println(cijenaSql.getString(1) + " * " + cijenaSql.getString(2));
                        cijena = cijenaSql.getDouble(1) * cijenaSql.getDouble(2);
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                
                if (cijena <= Podaci.getBalans(id_korisnik)) {
                
                    Podaci.skiniNovacSaRacuna(id_korisnik, cijena);
                    InsertUpdateDelete.setData("update rezervacija set potvrda = '1' where id_rezervacija = '" + id + "'", "Rezervacija potvrdjena!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Rezervacija ne moze biti potvrdjena jer korisnik nema dovoljno sredstava!");
                }
                System.out.println(cijena);
                new rezervacije().setVisible(true);
                this.setVisible(false);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int index = jTable2.getSelectedRow();
        TableModel table = jTable2.getModel();
       
        String id = table.getValueAt(index,0).toString();
        String poruka = "Zao nam je, Vasu rezervaciju smo morali otkazati. Obrazlozenje: \n";
        
        ResultSet rs = Select.getData("Select id_korisnik from rezervacija where id_rezervacija = " + id);
        
        try {
            if(rs.next()) {
                id_korisnik = rs.getInt(1);
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        double cijena = 0;
        
        try {
            int a = JOptionPane.showConfirmDialog(null, "Zelite li otkazati rezervaciju?", "Da", JOptionPane.YES_NO_OPTION);
            if(a == 0) {
                String razlog = JOptionPane.showInputDialog("Obrazlozite korisniku zasto otkazujete rezervaciju.");
                InsertUpdateDelete.setData("update rezervacija set potvrda = '0' where id_rezervacija = '" + id + "'", "Rezervacija otkazana!");
                poruka = poruka + razlog;
                InsertUpdateDelete.setData("insert into poruka (id_izdavac, id_korisnik, id_rezervacija, poruka) values ('" + Podaci.getId() + "', '" + id_korisnik + "', '" + id + "', '" + poruka + "')", "");
                ResultSet cijenaSql = Select.getData("Select DATEDIFF(rezervacija.check_out, rezervacija.check_in), smjestaj.cijena from rezervacija join smjestaj on smjestaj.id_smjestaj = rezervacija.id_smjestaj where id_rezervacija = " + id);
                
                try {
                    if(cijenaSql.next()) {
                        //System.out.println(cijenaSql.getString(1) + " * " + cijenaSql.getString(2));
                        cijena = cijenaSql.getDouble(1) * cijenaSql.getDouble(2);
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                
                
                
                Podaci.vratiNovac(id_korisnik, cijena);
                
                new rezervacije().setVisible(true);
                this.setVisible(false);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(rezervacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rezervacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rezervacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rezervacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rezervacije().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
