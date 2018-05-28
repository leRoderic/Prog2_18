package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;

import edu.ub.prog2.CabezasRodrigoNunezJosep.controlador.Controlador;
import javax.swing.JOptionPane;

public class FrmNouAlbum extends javax.swing.JDialog {
    
    private final Controlador controlador;
    private final AplicacioUB4 parent;
    
    public FrmNouAlbum(AplicacioUB4 parent, Controlador controlador) {
        super(parent);
        this.controlador = controlador;
        this.parent=parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmount = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        lblNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crea un nou àlbum");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblAmount.setText("Capacitat");

        btnCrear.setText("Crear");
        btnCrear.setToolTipText("Crea el nou àlbum");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela i tanca la finestra");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblNom.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblNom.setText("Nom");

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setToolTipText("Augmenta la capacitat");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setToolTipText("Disminueix la capacitat");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        lblNum.setBackground(new java.awt.Color(255, 255, 255));
        lblNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNum.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblNom)
                        .addGap(35, 35, 35)
                        .addComponent(txtNom)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAmount)
                                .addGap(70, 70, 70)
                                .addComponent(lblNum)
                                .addGap(41, 41, 41))
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (this.controlador.existeixAlbum(txtNom.getText())){
            JOptionPane.showMessageDialog(rootPane, "Ja existeix un àlbum amb aquest nom!");
        }else if(txtNom.getText().equals("")){        
        }else{
            this.controlador.afegirAlbum(txtNom.getText(),Integer.parseInt(lblNum.getText()));
            this.parent.opcionsComboBox();
            JOptionPane.showMessageDialog(rootPane, "Àlbum '"+txtNom.getText()+"' creat.");
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        int value = Integer.parseInt(lblNum.getText());
        value++;
        lblNum.setText(""+value);
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        int value = Integer.parseInt(lblNum.getText());
        if (value>1){
            value--;
            lblNum.setText(""+value);        
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.txtNom.setText("");
        this.lblNum.setText("10");
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNum;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}