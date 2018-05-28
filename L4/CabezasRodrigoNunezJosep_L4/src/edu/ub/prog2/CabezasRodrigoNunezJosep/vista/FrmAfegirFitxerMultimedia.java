package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;

import edu.ub.prog2.CabezasRodrigoNunezJosep.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrmAfegirFitxerMultimedia extends javax.swing.JDialog {

    private final Controlador controlador;
    private final AplicacioUB4 parent;
    
    public FrmAfegirFitxerMultimedia(AplicacioUB4 parent, Controlador controlador) {
        super(parent);
        this.controlador = controlador;
        this.parent=parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImatge = new javax.swing.JLabel();
        selectImatge = new javax.swing.JButton();
        txtImatge = new javax.swing.JTextField();
        btnAfegir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSelecciona = new javax.swing.JButton();
        selecTipus = new javax.swing.JComboBox<>();
        lblCami = new javax.swing.JLabel();
        txtFitxer = new javax.swing.JTextField();
        lblTipus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Afegeix un nou fitxer multimèdia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblImatge.setText("Camí de la imatge");

        selectImatge.setText("...");
        selectImatge.setToolTipText("Selecciona...");
        selectImatge.setEnabled(false);
        selectImatge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImatgeActionPerformed(evt);
            }
        });

        txtImatge.setEnabled(false);

        btnAfegir.setText("Afegir");
        btnAfegir.setToolTipText("Afegeix el fitxer a la biblioteca");
        btnAfegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela i tanca la finestra");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecciona.setText("...");
        btnSelecciona.setToolTipText("Selecciona...");
        btnSelecciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionaActionPerformed(evt);
            }
        });

        selecTipus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Video", "Audio" }));
        selecTipus.setToolTipText("Selecciona el tipus de fitxer...");
        selecTipus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecTipusActionPerformed(evt);
            }
        });

        lblCami.setText("Camí del fitxer");

        lblTipus.setText("Tipus:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImatge)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblCami)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFitxer)
                            .addComponent(txtImatge))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectImatge)
                            .addComponent(btnSelecciona)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(lblTipus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCami)
                    .addComponent(txtFitxer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecciona))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblImatge)
                        .addComponent(txtImatge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectImatge))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipus)
                    .addComponent(selecTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectImatgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImatgeActionPerformed
        JFileChooser cercador = new javax.swing.JFileChooser();
        cercador.showOpenDialog(this);
        File file = cercador.getSelectedFile();
        txtImatge.setText(file.getAbsolutePath());
    }//GEN-LAST:event_selectImatgeActionPerformed

    private void btnAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirActionPerformed
        switch(this.selecTipus.getSelectedIndex()){
            case 0:
            {
                try {
                    //Vídeo
                    this.controlador.afegirVideo(txtFitxer.getText(), "", "", 3.f, 25, 25, 24.f);
                } catch (AplicacioException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
            break;
            case 1:
            {
                try {
                    //Audio
                    this.controlador.afegirAudio(txtFitxer.getText(), txtImatge.getText(), "", "", 3.f, 52);
                } catch (AplicacioException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
            break;
        }
        this.parent.ompleBiblio();
        JOptionPane.showMessageDialog(rootPane, "Fitxer afegit amb èxit.");
    }//GEN-LAST:event_btnAfegirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionaActionPerformed
        JFileChooser cercador = new javax.swing.JFileChooser();
        cercador.showOpenDialog(this);
        File file = cercador.getSelectedFile();
        txtFitxer.setText(file.getAbsolutePath());
    }//GEN-LAST:event_btnSeleccionaActionPerformed

    private void selecTipusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecTipusActionPerformed
        switch(this.selecTipus.getSelectedIndex()){
            case 0:
            this.txtImatge.setEnabled(false);
            this.selectImatge.setEnabled(false);
            break;
            case 1:
            this.txtImatge.setEnabled(true);
            this.selectImatge.setEnabled(true);
            break;
        }
    }//GEN-LAST:event_selecTipusActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.txtFitxer.setText("");
        this.txtImatge.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfegir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecciona;
    private javax.swing.JLabel lblCami;
    private javax.swing.JLabel lblImatge;
    private javax.swing.JLabel lblTipus;
    private javax.swing.JComboBox<String> selecTipus;
    private javax.swing.JButton selectImatge;
    private javax.swing.JTextField txtFitxer;
    private javax.swing.JTextField txtImatge;
    // End of variables declaration//GEN-END:variables
}
