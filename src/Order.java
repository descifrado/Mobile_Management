
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vsp
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form cart
     */
    public Order() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        P = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        A = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        MI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Q = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 20, 150, 150);

        jLabel2.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PHONALISE ORDER!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 460, 50);

        jLabel4.setText("CUSTOMER ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 80, 80, 14);
        jPanel1.add(CI);
        CI.setBounds(199, 80, 170, 30);

        jLabel8.setText("PRICE");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 270, 30, 14);
        jPanel1.add(P);
        P.setBounds(200, 270, 170, 30);

        jLabel9.setText("AMOUNT");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 350, 50, 14);
        jPanel1.add(A);
        A.setBounds(200, 350, 170, 30);

        jButton1.setText("ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 400, 67, 23);

        jButton2.setText("BACK");
        jPanel1.add(jButton2);
        jButton2.setBounds(560, 400, 59, 23);

        jButton3.setText("CALCULATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(100, 400, 150, 23);

        jLabel5.setText("MODEL ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 130, 48, 14);

        jLabel10.setText("DISCOUNT");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 310, 60, 14);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 310, 170, 30);
        jPanel1.add(MI);
        MI.setBounds(200, 130, 170, 30);

        jLabel6.setText("PRODUCT NAME");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 180, 90, 14);
        jPanel1.add(MN);
        MN.setBounds(200, 180, 170, 30);

        jLabel7.setText("QUANTITY");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 230, 51, 14);
        jPanel1.add(Q);
        Q.setBounds(200, 230, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
         {           
           Class.forName("java.sql.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectas","root","modi");
           Statement stmt=con.createStatement();
           String query="select model_id from model where mlog='y';";
           ResultSet rs=stmt.executeQuery(query);
        rs.next();
        MI.setText(rs.getString("model_id"));
         String q1="select model_id,brand,model_name,price from model where mlog='y';";
         ResultSet rs1=stmt.executeQuery(query);
        while(rs1.next())
        {
        MI.setText(rs1.getString("model_id"));
        P.setText(rs1.getString("price"));
        String b=rs1.getString("brand");
        String mn=rs1.getString("model_name");
        String pn=b+" "+mn;
        MN.setText(pn);
        }
        }
           catch(Exception e)
 {
     JOptionPane.showMessageDialog(this, e.getMessage());
 }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Order().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField CI;
    private javax.swing.JTextField MI;
    private javax.swing.JTextField MN;
    private javax.swing.JTextField P;
    private javax.swing.JTextField Q;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
