import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.InsertUpdateDelete;
import project.Podaci;
import project.Select;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class signupkorisnik extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signupkorisnik() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        Ime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(196, 196, 188));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clo.jpg"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 40, 30));

        jLabel1.setBackground(new java.awt.Color(196, 196, 188));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("KORISNIK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, 20));

        jTextField1.setBackground(new java.awt.Color(196, 196, 188));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 180, 20));

        jTextField2.setBackground(new java.awt.Color(196, 196, 188));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 180, 20));

        jPasswordField1.setBackground(new java.awt.Color(196, 196, 188));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 180, 20));

        Ime.setBackground(new java.awt.Color(196, 196, 188));
        Ime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ime.setText("Ime:");
        getContentPane().add(Ime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 20));

        jLabel5.setBackground(new java.awt.Color(196, 196, 188));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, 20));

        jLabel6.setBackground(new java.awt.Color(196, 196, 188));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, 20));

        jLabel7.setBackground(new java.awt.Color(196, 196, 188));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Adresa:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 20));

        jTextField4.setBackground(new java.awt.Color(196, 196, 188));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 180, 20));

        jButton2.setBackground(new java.awt.Color(196, 196, 188));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Registrujte se");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 130, 30));

        jButton3.setBackground(new java.awt.Color(196, 196, 188));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Prijava");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 90, 30));

        jLabel9.setBackground(new java.awt.Color(196, 196, 188));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Prezime:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, 20));

        jLabel4.setBackground(new java.awt.Color(196, 196, 188));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Pol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 40, 20));

        jComboBox2.setBackground(new java.awt.Color(196, 196, 188));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "Z" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 80, 20));

        jTextField5.setBackground(new java.awt.Color(196, 196, 188));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 180, 20));

        jTextField6.setBackground(new java.awt.Color(196, 196, 188));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 180, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Username:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, 20));

        jTextField3.setBackground(new java.awt.Color(196, 196, 188));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 180, 20));

        jLabel10.setBackground(new java.awt.Color(196, 196, 188));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Broj telefona:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pozadinasign.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a;
       a = JOptionPane.showConfirmDialog(null,"Da li zaista ??elite da zatvorite aplikaciju?","Izaberite", JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int check = 0;
        String username=jTextField2.getText();
        String password=jPasswordField1.getText();
        String ime=jTextField5.getText();
        String prezime=jTextField6.getText();
        String adresa=jTextField4.getText();
        String email=jTextField1.getText();
        String broj_tel= jTextField3.getText();
        String pol=(String)jComboBox2.getSelectedItem();
        if(username.equals("")||password.equals("")||ime.equals("")||prezime.equals("")|| email.equals("")|| adresa.equals("")|| pol.equals(""))
          
            JOptionPane.showMessageDialog(null,"Dopunite sva polja"); 
        
        else 
        {  
            String Query;
            ResultSet rs1=Select.getData("select * from korisnik where email='"+email+"' or username ='"+username+"'");
            ResultSet rs2=Select.getData("select * from izdavac where email='"+email+"' or username ='"+username+"'");
             try 
                {
                    if(rs1.next())
                    {    
                    String usernamePool, emailPool;   
                 usernamePool = rs1.getString("username");
                 emailPool = rs1.getString("email");
                
                   if (usernamePool.equals(jTextField2.getText())) {
                    JOptionPane.showMessageDialog(null, "Username se ve?? koristi", "Error", JOptionPane.ERROR_MESSAGE);
                     }
            
                    if (emailPool.equals(jTextField1.getText())) {
                    JOptionPane.showMessageDialog(null, "Email se ve?? koristi", "Error", JOptionPane.ERROR_MESSAGE);
                }
                            } else if(rs2.next())
                    {    
                    String usernamePool, emailPool;   
                 usernamePool = rs2.getString("username");
                 emailPool = rs2.getString("email");
                
                   if (usernamePool.equals(jTextField2.getText())) {
                    JOptionPane.showMessageDialog(null, "Username se ve?? koristi", "Error", JOptionPane.ERROR_MESSAGE);
                     }
            
                    if (emailPool.equals(jTextField1.getText())) {
                    JOptionPane.showMessageDialog(null, "Email se ve?? koristi", "Error", JOptionPane.ERROR_MESSAGE);
                }
                            }
                            else {
                    
                        try {
                            Query="insert into korisnik (username, password, ime, prezime, adresa, email, broj_tel, pol, status) values ('"+username+"','"+password+"','"+ime+"','"+prezime+"','"+adresa+"','"+email+"','"+broj_tel+"','"+pol+"','0')";
        InsertUpdateDelete.setData("insert into korisnik (username, password, ime, prezime, adresa, email, broj_tel, pol, status) values ('"+username+"','"+password+"','"+ime+"','"+prezime+"','"+adresa+"','"+email+"','"+broj_tel+"','"+pol+"','0')", "Uspje??no ste registrovani" );
                        } catch(Exception e) {
                        JOptionPane.showMessageDialog(null,e);
                        }
         setVisible(false);
        new login().setVisible(true);   
                    }
                    }
        
                catch(Exception e) 
                {
                    JOptionPane.showMessageDialog(null,e);
                }
              }             

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO addyour handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(signupkorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupkorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupkorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupkorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupkorisnik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
