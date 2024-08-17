
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author TharuL
 */
public class CashierDashboard extends javax.swing.JFrame {

    /**
     * Creates new form CashierDashboard
     */
    public double tprice;
    public double Total;
    public int Amount;
    public CashierDashboard() {
        initComponents();
        try {
            showmovies();
        } catch (SQLException ex) {
            Logger.getLogger(CashierDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showmovies() throws SQLException{
    try{
    DefaultTableModel tblModel = (DefaultTableModel)table2.getModel();
    tblModel.setRowCount(0);
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineclick","root","root");
    Statement stmt = con.createStatement();
    String sql = "SELECT * FROM movies";
    ResultSet rs = stmt.executeQuery(sql);
    
    while(rs.next()){
    String MovieID  = rs.getString("MovieID");
    String MovieName = rs.getString("MovieName");
    String Genre = rs.getString("Genre");
    String Dimension = rs.getString("Dimension");
    String ShowTimes = rs.getString("ShowTimes");
    String TicketPrice = rs.getString("TicketPrice");
    String tbData[]= {MovieID,MovieName,Genre,Dimension,ShowTimes,TicketPrice};
    tblModel.addRow(tbData);
    }
    
    }   catch (ClassNotFoundException ex) {
           System.out.println(ex);
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

        text = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        moviename = new javax.swing.JTextField();
        movieid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        showtime = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dimen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        bg4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 255, 51));
        text.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 1, 60)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("Cashier Dashboard");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 640, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill Preview");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 220, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 40));

        cid.setBackground(new java.awt.Color(255, 255, 255));
        cid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Movie Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, 40));

        moviename.setBackground(new java.awt.Color(255, 255, 255));
        moviename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moviename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movienameActionPerformed(evt);
            }
        });
        getContentPane().add(moviename, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 360, 30));

        movieid.setBackground(new java.awt.Color(255, 255, 255));
        movieid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(movieid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 360, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ticket Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Genre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, 40));

        amount.setBackground(new java.awt.Color(255, 255, 255));
        amount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 120, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 40));

        cno.setBackground(new java.awt.Color(255, 255, 255));
        cno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });
        getContentPane().add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 220, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Show Times");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 220, 40));

        genre.setBackground(new java.awt.Color(255, 255, 255));
        genre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 360, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Amount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 80, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 130, 40));

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 360, 40));

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 130, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Movie ID", "Movie Name", "Genre", "Dimension", "Show Times", "Ticket Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 790, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Available  Movies");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 220, 40));

        book.setBackground(new java.awt.Color(255, 0, 0));
        book.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("BOOK");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
        });
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 450, 170, 50));

        jButton8.setBackground(new java.awt.Color(255, 0, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("CALCULATE BILL");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 280, 40));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("NEW");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 550, 170, 50));

        showtime.setBackground(new java.awt.Color(255, 255, 255));
        showtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 360, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dimension (2D / 3D)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 220, 40));

        dimen.setBackground(new java.awt.Color(255, 255, 255));
        dimen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(dimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 90, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 580, 310));

        jButton3.setBackground(new java.awt.Color(153, 0, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 650, 170, 60));

        bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cashier.png"))); // NOI18N
        getContentPane().add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movienameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movienameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movienameActionPerformed

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
DefaultTableModel tblModel = (DefaultTableModel)table2.getModel();
      int selectedRowIndex = table2.getSelectedRow();
      
        movieid.setText(tblModel.getValueAt(selectedRowIndex, 0).toString());
        moviename.setText(tblModel.getValueAt(selectedRowIndex, 1).toString());
        genre.setText(tblModel.getValueAt(selectedRowIndex, 2).toString());
        dimen.setText(tblModel.getValueAt(selectedRowIndex, 3).toString());
        showtime.setText(tblModel.getValueAt(selectedRowIndex, 4).toString());
        price.setText(tblModel.getValueAt(selectedRowIndex, 5).toString()); 
        
// TODO add your handling code here:
    }//GEN-LAST:event_table2MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        tprice =  Double.parseDouble(price.getText());
        Amount = Integer.parseInt(amount.getText());
        
        Total = tprice * Amount;
        total.setText(String.valueOf(Total));
    }//GEN-LAST:event_jButton8MouseClicked

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        // TODO add your handling code here:
    String customerId = cid.getText();
    String contactNumber = cno.getText();
    String movieId = movieid.getText();
    String movieName = moviename.getText();
    String genreText = genre.getText();
    String dimension = dimen.getText();
    String showTime = showtime.getText();
    String ticketPrice = price.getText();
    String ticketAmount = amount.getText();
    String totalPrice = total.getText();

    // Create a formatted bill preview
    String billPreview = "---------------------------------\n" +
                         "            Bill Preview        \n" +
                         "---------------------------------\n" +
                         "Customer ID: " + customerId + "\n" +
                         "Contact Number: " + contactNumber + "\n" +
                         "Movie ID: " + movieId + "\n" +
                         "Movie Name: " + movieName + "\n" +
                         "Genre: " + genreText + "\n" +
                         "Dimension: " + dimension + "\n" +
                         "Show Time: " + showTime + "\n" +
                         "Ticket Price: " + ticketPrice + "\n" +
                         "Amount: " + ticketAmount + "\n" +
                         "Total Price: " + totalPrice + "\n" +
                         "---------------------------------\n";

    // Display the bill preview in the JTextArea
    jTextArea1.setText(billPreview);
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineclick","root","root");
         Statement stmt = con.createStatement();
         String sql = "INSERT INTO billsummary VALUES ('"+customerId+"','"+contactNumber+"','"+movieId+"','"+movieName+"','"+tprice+"','"+Amount+"','"+Total+"')";
         int rs = stmt.executeUpdate(sql);
         if(rs > 0) {
                JOptionPane.showMessageDialog(this, "ticket booked success!!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to book movie !!.");
            }
        
        }catch(Exception ex){
        System.out.println(ex);
        }
    }//GEN-LAST:event_bookMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        CashierDashboard info = new CashierDashboard();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Login info = new Login();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JLabel bg4;
    private javax.swing.JButton book;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cno;
    private javax.swing.JTextField dimen;
    private javax.swing.JTextField genre;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField movieid;
    private javax.swing.JTextField moviename;
    private javax.swing.JTextField price;
    private javax.swing.JTextField showtime;
    private javax.swing.JTable table2;
    private javax.swing.JLabel text;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}