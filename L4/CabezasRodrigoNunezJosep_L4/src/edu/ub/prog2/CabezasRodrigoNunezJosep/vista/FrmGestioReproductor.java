package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;

import edu.ub.prog2.CabezasRodrigoNunezJosep.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import javax.swing.JOptionPane;

public class FrmGestioReproductor extends javax.swing.JDialog {

    private Controlador controlador;
    private AplicacioUB4 parent;

    public FrmGestioReproductor(AplicacioUB4 parent,Controlador controlador) {
        super(parent);
        this.controlador = controlador;
        this.parent=parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPlay = new javax.swing.JButton();
        btPause = new javax.swing.JButton();
        btSkip = new javax.swing.JButton();
        btStop = new javax.swing.JButton();
        btRandom = new javax.swing.JToggleButton();
        btLoop = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestor de la reproducció en curs");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/icons8-play-50.png"))); // NOI18N
        btPlay.setToolTipText("Reprén la reproducció pausada o aturada");
        btPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlay(evt);
            }
        });

        btPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/icons8-pause-50.png"))); // NOI18N
        btPause.setToolTipText("Pausa la reproducció actual");
        btPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPauseActionPerformed(evt);
            }
        });

        btSkip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/icons8-end-50.png"))); // NOI18N
        btSkip.setToolTipText("Salta al següent fitxer");
        btSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSkipActionPerformed(evt);
            }
        });

        btStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/icons8-stop-50.png"))); // NOI18N
        btStop.setToolTipText("Atura la reproducció actual");
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        btRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/icons8-shuffle-50.png"))); // NOI18N
        btRandom.setToolTipText("Commuta l'aleatorietat de la reproducció");
        btRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRandomActionPerformed(evt);
            }
        });

        btLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/CabezasRodrigoNunezJosep/vista/media controls/icons8-repeat-50.png"))); // NOI18N
        btLoop.setToolTipText("Commuta la continuïtat de la reproducció");
        btLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPause, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btStop, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btStop, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(btSkip, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addComponent(btRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPlay(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlay
        try {
            this.controlador.reemprenReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btPlay

    private void btPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPauseActionPerformed
        try {
            this.controlador.pausaReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btPauseActionPerformed

    private void btSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSkipActionPerformed
        try {
            this.controlador.saltaReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btSkipActionPerformed

    private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed
        try {
            this.controlador.aturaReproduccio();
        } catch (AplicacioException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btStopActionPerformed

    private void btRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRandomActionPerformed
        this.controlador.setAleatori(btRandom.isSelected());
    }//GEN-LAST:event_btRandomActionPerformed

    private void btLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoopActionPerformed
        this.controlador.setContinu(btLoop.isSelected());
    }//GEN-LAST:event_btLoopActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        //parent.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btLoop;
    private javax.swing.JButton btPause;
    private javax.swing.JButton btPlay;
    private javax.swing.JToggleButton btRandom;
    private javax.swing.JButton btSkip;
    private javax.swing.JButton btStop;
    // End of variables declaration//GEN-END:variables
}
