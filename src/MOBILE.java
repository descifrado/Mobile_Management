/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MOBILE.java
 *
 * Created on Jun 7, 2016, 11:30:08 AM
 */

/**
 *
 * @author ACER
 */
public class MOBILE extends javax.swing.JFrame {

    /** Creates new form MOBILE */
    public MOBILE() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nsi = new javax.swing.JLabel();
        P = new javax.swing.JCheckBox();
        B = new javax.swing.JCheckBox();
        O = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        nsi2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("FILTER ACCORDING TO:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 270, 230, 22);

        filter.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        filter.setText("FILTER");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });
        jPanel1.add(filter);
        filter.setBounds(50, 350, 120, 29);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 370, 120, 29);
        jPanel1.add(nsi);
        nsi.setBounds(210, 10, 280, 170);

        buttonGroup1.add(P);
        P.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        P.setText("PRICE");
        jPanel1.add(P);
        P.setBounds(320, 270, 71, 25);

        buttonGroup1.add(B);
        B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B.setText("BRAND");
        jPanel1.add(B);
        B.setBounds(630, 270, 81, 25);

        buttonGroup1.add(O);
        O.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        O.setText("OS");
        jPanel1.add(O);
        O.setBounds(500, 270, 60, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("FIND RIGHT MOBILE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 210, 270, 29);
        jPanel1.add(nsi2);
        nsi2.setBounds(490, 10, 210, 170);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jTextField1.setText("NEW IN STOCK");
        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 50, 150, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
       new PRICEFILTER().show();
       this.dispose();
    }//GEN-LAST:event_filterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 new customer_page().show();
 this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOBILE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox B;
    private javax.swing.JCheckBox O;
    private javax.swing.JCheckBox P;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton filter;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nsi;
    private javax.swing.JLabel nsi2;
    // End of variables declaration//GEN-END:variables

}
