
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prasetya
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    int hariawalint, hariakhirint, hargatotal, totalhari;
    String id, petugas, nopol, jenis_kendaraan, tanggal_masuk, tanggal_keluar, harga;
    String totalharistr;

    public main() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        welcomeuser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfpetugas2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfnopol = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbjeniskendaraan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tftglmasuk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tftglkeluar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        maintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Kendaraan", "No Polisi", "Jenis Kendaraan", "Tanggal Masuk", "Tanggal Keluar", "Harga", "Petugas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(maintable);
        if (maintable.getColumnModel().getColumnCount() > 0) {
            maintable.getColumnModel().getColumn(0).setResizable(false);
            maintable.getColumnModel().getColumn(1).setResizable(false);
            maintable.getColumnModel().getColumn(2).setResizable(false);
            maintable.getColumnModel().getColumn(3).setResizable(false);
            maintable.getColumnModel().getColumn(4).setResizable(false);
            maintable.getColumnModel().getColumn(5).setResizable(false);
            maintable.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(390, 0, 643, 490);

        jPanel8.setBackground(new java.awt.Color(244, 143, 177));
        jPanel8.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome User :");
        jPanel8.add(jLabel4);
        jLabel4.setBounds(870, 11, 212, 35);

        welcomeuser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        welcomeuser.setForeground(new java.awt.Color(255, 255, 255));
        welcomeuser.setText("Klik ReFresh Untuk melihat user");
        jPanel8.add(welcomeuser);
        welcomeuser.setBounds(870, 52, 348, 29);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(1163, 0, 368, 92);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setForeground(new java.awt.Color(0, 102, 102));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FORM DATA KENDARAAN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 0, 360, 46);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Petugas");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(70, 10, 58, 19);

        tfpetugas2.setEditable(false);
        tfpetugas2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        tfpetugas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpetugas2ActionPerformed(evt);
            }
        });
        jPanel6.add(tfpetugas2);
        tfpetugas2.setBounds(10, 30, 148, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nomor Polisi");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(70, 70, 90, 19);

        tfnopol.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel6.add(tfnopol);
        tfnopol.setBounds(10, 100, 148, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jenis Kendaraan");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(40, 130, 118, 19);

        cbjeniskendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sepeda Motor", "Sepeda Onthel", "Mobil" }));
        jPanel6.add(cbjeniskendaraan);
        cbjeniskendaraan.setBounds(10, 160, 148, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Masuk");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(50, 200, 106, 19);
        jPanel6.add(tftglmasuk);
        tftglmasuk.setBounds(10, 220, 148, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Keluar");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(50, 260, 105, 19);

        tftglkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftglkeluarActionPerformed(evt);
            }
        });
        jPanel6.add(tftglkeluar);
        tftglkeluar.setBounds(10, 290, 148, 20);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Print");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(10, 340, 100, 33);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ReFresh");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(120, 340, 111, 33);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(250, 340, 100, 33);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(10, 390, 100, 33);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(120, 390, 110, 33);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7);
        jButton7.setBounds(250, 390, 100, 33);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(10, 50, 360, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1050, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tftglkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftglkeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftglkeluarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int harga = 3000;
        String hariawal = tftglmasuk.getText();
        String hariakhir = tftglkeluar.getText();

        hariawalint = Integer.parseInt(hariawal);
        hariakhirint = Integer.parseInt(hariakhir);

        totalhari = hariakhirint - hariawalint;
        hargatotal = totalhari * harga;
        String hargafinal = Integer.toString(hargatotal);

        String combobox = cbjeniskendaraan.getSelectedItem().toString();

        if ("".equals(tfnopol.getText()) || "".equals(tfpetugas2.getText()) || "".equals(tftglkeluar.getText()) || "".equals(tftglmasuk.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {

            String SQL = "insert into  tb_transaksi (petugas,nopol,jenis_kendaraan,tanggal_masuk,tanggal_keluar,harga) "
                    + "VALUES('" + tfpetugas2.getText() + "','" + tfnopol.getText() + "',"
                    + "'" + combobox + "','" + tftglmasuk.getText() + "','" + tftglkeluar.getText() + "','" + hargafinal + "')";
            int status = connectionDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfpetugas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpetugas2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfpetugas2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tfnopol.setText("");
        tftglkeluar.setText("");
        tftglmasuk.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int baris = maintable.getSelectedRow();
        if (baris != -1) {
            String nopol = maintable.getValueAt(baris, 1).toString();
            String SQL = "DELETE FROM tb_transaksi WHERE nopol='" + nopol + "'";
            int status = connectionDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus :(", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus ", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Untuk Dihapus :)", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        selectData();
        String SQL = "SELECT * FROM tb_user";
        ResultSet rs = connectionDB.executeQuery(SQL);
        try {
            while (rs.next()) {
                String namauser = rs.getString(2);
                welcomeuser.setText(namauser);
                tfpetugas2.setText(namauser);
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        int baris = maintable.getSelectedRow();
        if (baris != -1) {
            String nopol = maintable.getValueAt(baris, 1).toString();
            String SQL = "SELECT * FROM tb_transaksi WHERE nopol = '" + nopol + "'";
            ResultSet rs = connectionDB.executeQuery(SQL);
            try {
                while (rs.next()) {
                    id = rs.getString(1);
                    petugas = rs.getString(2);
                    jenis_kendaraan = rs.getString(4);
                    tanggal_masuk = rs.getString(5);
                    tanggal_keluar = rs.getString(6);
                    harga = rs.getString(7);
                    int totalhariint,tglmsk,tglklr;
                    tglmsk = Integer.parseInt(tanggal_masuk);
                    tglklr = Integer.parseInt(tanggal_keluar);
                    totalhariint = tglklr-tglmsk;
                    totalharistr = Integer.toString(totalhariint);
                }
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showConfirmDialog(null, "Id Kendaraan : " + id + "\n" + "Petugas : " + petugas + "\n" + "Nomor Polisi : " + nopol + "\n" + "Jenis Kendaraan : " + jenis_kendaraan + "\n" + "Tanggal Masuk : " + tanggal_masuk + "\n" + "Tanggal Keluar : " + tanggal_keluar + "\n" + "Total Hari : " + totalharistr + "\n" + "Total Harga : " + harga + "\n", "Rekapan Parkir", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Untuk Dilihat :)", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String halouser = login.useraktif;
        welcomeuser.setText(halouser);
        tfpetugas2.setText(halouser);
        selectData();
    }//GEN-LAST:event_formWindowOpened

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbjeniskendaraan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable maintable;
    private javax.swing.JTextField tfnopol;
    private javax.swing.JTextField tfpetugas2;
    private javax.swing.JTextField tftglkeluar;
    private javax.swing.JTextField tftglmasuk;
    private javax.swing.JLabel welcomeuser;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"IDKendaraan", "NoPolisi", "JenisKendaraan", "TanggalMasuk", "TanggalKeluar", "Harga", "Petugas"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_transaksi";
        ResultSet rs = connectionDB.executeQuery(SQL);
        try {
            while (rs.next()) {
                String IDKendaraan = rs.getString(1);
                String NoPolisi = rs.getString(3);
                String JenisKendaraan = rs.getString(4);
                String TanggalMasuk = rs.getString(5);
                String TanggalKeluar = rs.getString(6);
                String Harga = rs.getString(7);
                String Petugas = rs.getString(2);
                String data[] = {IDKendaraan, NoPolisi, JenisKendaraan, TanggalMasuk, TanggalKeluar, Harga, Petugas};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        maintable.setModel(dtm);
    }
}
