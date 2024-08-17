
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
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public String id;
    public AdminDashboard() {
        initComponents();
        try {
            showmovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel5 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        movieid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dimen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showtime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bg3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 255, 51));
        text.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 1, 60)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("Admin Dashboard");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 640, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 120, 40));

        genre.setBackground(new java.awt.Color(255, 255, 255));
        genre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Movie ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, 40));

        movieid.setBackground(new java.awt.Color(255, 255, 255));
        movieid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(movieid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 190, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Show Times");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 120, 40));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 350, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Movie Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, 40));

        dimen.setBackground(new java.awt.Color(255, 255, 255));
        dimen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(dimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 120, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dimension (2D / 3D)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 190, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ticket Price (Rs.)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 160, 40));

        showtime.setBackground(new java.awt.Color(255, 255, 255));
        showtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtimeActionPerformed(evt);
            }
        });
        getContentPane().add(showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 200, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 750, 340));

        update.setBackground(new java.awt.Color(255, 0, 0));
        update.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, 120, 50));

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, 120, 50));

        Add.setBackground(new java.awt.Color(255, 0, 0));
        Add.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("ADD");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 120, 50));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 60));

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 150, 40));

        jLabel1.setBackground(new java.awt.Color(51, 0, 0));
        jLabel1.setFont(new java.awt.Font("Nadall", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cine Click ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 400, 110));

        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/admin.png"))); // NOI18N
        getContentPane().add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showtimeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineclick","root","root");
         Statement stmt = con.createStatement();
         String sql = "INSERT INTO movies VALUES ('"+movieid.getText()+"','"+name.getText()+"','"+genre.getText()+"','"+dimen.getText()+"','"+showtime.getText()+"','"+price.getText()+"')";
         int rs = stmt.executeUpdate(sql);
         if(rs > 0) {
                JOptionPane.showMessageDialog(this, "Movie Added success!!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to Add movie!!.");
            }
        
        }catch(Exception ex){
        System.out.println(ex);
        }finally{
                     try {
            showmovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        movieid.setText("");
        name.setText("");
        genre.setText("");
        dimen.setText("");
        showtime.setText("");
        price.setText("");
        }
    }//GEN-LAST:event_AddMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)table2.getModel();
      int selectedRowIndex = table2.getSelectedRow();
      id =tblModel.getValueAt(selectedRowIndex, 0).toString();
        movieid.setText(tblModel.getValueAt(selectedRowIndex, 0).toString());
        name.setText(tblModel.getValueAt(selectedRowIndex, 1).toString());
        genre.setText(tblModel.getValueAt(selectedRowIndex, 2).toString());
        dimen.setText(tblModel.getValueAt(selectedRowIndex, 3).toString());
        showtime.setText(tblModel.getValueAt(selectedRowIndex, 4).toString());
        price.setText(tblModel.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_table2MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineclick","root","root");

         Statement stmt = con.createStatement();
         String sql = "UPDATE movies SET MovieID = '" + movieid.getText() + "', MovieName = '" + name.getText().toString() + "',Genre = '" + genre.getText().toString() + "',Dimension = '" + dimen.getText().toString() + "',ShowTimes ='"+showtime.getText()+"',TicketPrice = '"+price.getText()+"'  WHERE MovieID = '" + id + "'";
         int rs = stmt.executeUpdate(sql);
         if(rs > 0) {
                JOptionPane.showMessageDialog(this, "movie updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update movie.");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
        movieid.setText("");
        name.setText("");
        genre.setText("");
        dimen.setText("");
        showtime.setText("");
        price.setText("");
         try {
            showmovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
        
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineclick","root","root");

         Statement stmt = con.createStatement();
         String sql = "DELETE FROM movies WHERE MovieID= '"+id+"' ";
         int rs = stmt.executeUpdate(sql);
         if(rs > 0) {
                JOptionPane.showMessageDialog(this, "movie updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update movie.");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
        movieid.setText("");
        name.setText("");
        genre.setText("");
        dimen.setText("");
        showtime.setText("");
        price.setText("");
         try {
            showmovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_deleteMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Home info = new Home();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel bg3;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dimen;
    private javax.swing.JTextField genre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField movieid;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField showtime;
    private javax.swing.JTable table2;
    private javax.swing.JLabel text;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
