import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vsp
 */
public class CUSTOMER_UPDATE extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public CUSTOMER_UPDATE() {
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

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ADD2 = new javax.swing.JTextField();
        FNAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LNAME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EI = new javax.swing.JTextField();
        N = new javax.swing.JLabel();
        ADD3 = new javax.swing.JTextField();
        GEN = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ADD1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("UPDATE YOUR DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(30, 390, 260, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL_ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(300, 360, 72, 17);
        jPanel2.add(ADD2);
        ADD2.setBounds(500, 280, 210, 30);

        FNAME.setEditable(false);
        jPanel2.add(FNAME);
        FNAME.setBounds(500, 50, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LAST NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(290, 100, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADRESS line2");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(280, 280, 100, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADDRESS line3");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(270, 320, 103, 17);

        LNAME.setEditable(false);
        jPanel2.add(LNAME);
        LNAME.setBounds(500, 100, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENDER");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(310, 150, 60, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FIRST NAME");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(290, 50, 90, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 204));
        jLabel11.setText("UPDATE CUSTOMER'S DETAILS");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 10, 390, 30);
        jPanel2.add(EI);
        EI.setBounds(500, 360, 210, 30);

        N.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        N.setForeground(new java.awt.Color(0, 204, 0));
        jPanel2.add(N);
        N.setBounds(520, 10, 170, 30);
        jPanel2.add(ADD3);
        ADD3.setBounds(500, 320, 210, 30);
        jPanel2.add(GEN);
        GEN.setBounds(500, 150, 210, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 51));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(350, 390, 100, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT NUMBER");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(240, 200, 140, 17);
        jPanel2.add(CN);
        CN.setBounds(500, 200, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADDRESS line1");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(270, 240, 110, 17);
        jPanel2.add(ADD1);
        ADD1.setBounds(500, 240, 210, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("VIEW CUST_ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 60, 140, 25);

        jList1.setModel(new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 100, 200);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("SELECT YOUR CUST_ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 350, 160, 20);

        x.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.jpg"))); // NOI18N
        jPanel2.add(x);
        x.setBounds(0, 0, 730, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DefaultListModel model = (DefaultListModel) jList1.getModel();
            Class.forName("java.sql.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projectas", "root", "modi");
            Statement stmt = (Statement) con.createStatement();
            String q1 = "select * from orders;";
            ResultSet rs = stmt.executeQuery(q1);
            while (rs.next()) {
                String ci = rs.getString("cust_id");
                model.addElement(ci);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         try
        {
           Class.forName("java.sql.Driver");
            java.sql.Connection con=(java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/projectas","root","modi");
            java.sql.Statement stmt=(java.sql.Statement) con.createStatement();
            String st=(String)jList1.getSelectedValue();
            String query="select * from CUSTOMER where cust_id='"+(st)+"';";
            ResultSet rs=stmt.executeQuery(query);

           while(rs.next())
            {                          
                String fname=rs.getString("first_name");FNAME.setText(fname);                
                String lname=rs.getString("last_name");LNAME.setText(lname);                
                String add1=rs.getString("adr_line1");ADD1.setText(add1);
                String add2=rs.getString("adr_line2");ADD2.setText(add2);
                String add3=rs.getString("adr_line3");ADD3.setText(add3);                
                String ei=rs.getString("email_id");EI.setText(ei);
                String gen=rs.getString("gender");GEN.setText(gen);
                String cn=rs.getString("contact_no");CN.setText(cn);
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        } 
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try
        {
           Class.forName("java.sql.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectas","root","modi");
            java.sql.Statement stmt=con.createStatement();
            String st=(String)jList1.getSelectedValue();
            String fname=FNAME.getText();
            String lname=LNAME.getText();
            String gen=GEN.getText();
            String cn=CN.getText();
            String add1=ADD1.getText();
            String add2=ADD2.getText();
            String add3=ADD3.getText();
            String ei=EI.getText();
            String query="update customer set first_name='"+(fname)+"',last_name='"+(lname)+"',gender='"+(gen)+"',contact_no='"+(cn)+"',adr_line1='"+(add1)+"',adr_line2='"+(add2)+"' ,adr_line3='"+(add3)+"',email_id='"+(ei)+"'where cust_id='"+(st)+"';";
            int i=JOptionPane.showConfirmDialog(this,"are you sure you want to update this record",null ,JOptionPane.YES_NO_CANCEL_OPTION);
            if(i==0)
            {
               stmt.executeUpdate(query);
               JOptionPane.showMessageDialog(this,"RECORD UPDATED");
               
            }
            if(i==1)
            {
                JOptionPane.showMessageDialog(this,"RECORD NOT UPDATED");
            }
            else
            {
                
            }
        }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this,e.getMessage());
         }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new customer_page().show();
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try
{   

    Class.forName("java.sql.Driver");
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectas","root","modi");
java.sql.Statement stmt=con.createStatement();
String q1="select first_name from customer where log='y';";
ResultSet rs=stmt.executeQuery(q1);
rs.next();
String n=rs.getString("first_name");
N.setText("HI"+" "+n.toUpperCase()+"....");
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
            java.util.logging.Logger.getLogger(CUSTOMER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CUSTOMER_UPDATE().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD1;
    private javax.swing.JTextField ADD2;
    private javax.swing.JTextField ADD3;
    private javax.swing.JTextField CN;
    private javax.swing.JTextField EI;
    private javax.swing.JTextField FNAME;
    private javax.swing.JTextField GEN;
    private javax.swing.JTextField LNAME;
    private javax.swing.JLabel N;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}