package edu.ub.prog2.CabezasRodrigoNunezJosep.vista;

import edu.ub.prog2.CabezasRodrigoNunezJosep.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public final class AplicacioUB4 extends javax.swing.JFrame {
    
    private final Controlador controlador;
    FrmGestioReproductor repro;
    FrmAfegirFitxerMultimedia fitxer;
    FrmNouAlbum album;
    
    public AplicacioUB4() {
        initComponents();
        setVisible(true);
        this.controlador=new Controlador();
        this.repro=new FrmGestioReproductor(this,controlador);
        this.fitxer=new FrmAfegirFitxerMultimedia(this,controlador);
        this.album=new FrmNouAlbum(this,controlador);
        listAlbum.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        listCarpeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ompleBiblio();
        opcionsComboBox();
    }
    
    protected void ompleBiblio(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        List<String> llista=controlador.mostrarCamins();
        for(int i=0;i<llista.size();i++){
            model.addElement(llista.get(i));
        }
        listCarpeta.setModel(model);
    }
    
    protected void ompleAlbum(){
        try {
            DefaultListModel model = new DefaultListModel();
            model.clear();
            List<String> llista=controlador.mostrarCaminsAlbum(selecAlbum.getSelectedItem().toString().substring(4));
            for(int i=0;i<llista.size();i++){
                model.addElement(llista.get(i));
            }
            listAlbum.setModel(model);
        } catch (Exception ignored) {            
            //JOptionPane.showMessageDialog(rootPane, ex.getMessage());    
        }
    }
    
    protected void opcionsComboBox(){
        List<String> llista=controlador.mostrarLlistatAlbums();
        String[] items = new String[llista.size()];
        for(int i=0;i<llista.size();i++){
            items[i]=llista.get(i);
        }
        DefaultComboBoxModel opcions = new DefaultComboBoxModel(items);
        selecAlbum.setModel(opcions);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCarpeta = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAlbum = new javax.swing.JList<>();
        selecAlbum = new javax.swing.JComboBox<>();
        btnNewAlbum = new javax.swing.JButton();
        btnNoAlbum = new javax.swing.JButton();
        btnReproAlbum = new javax.swing.JButton();
        btnAfegir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReproBiblio = new javax.swing.JButton();
        btnReproFitxer = new javax.swing.JButton();
        btnAfegirAlbum = new javax.swing.JButton();
        txtBiblio = new javax.swing.JLabel();
        btnEliminarAlbum = new javax.swing.JButton();
        btnReproGestor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btCarregar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btGuardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca de fitxers multimèdia");

        listCarpeta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listCarpeta);

        listAlbum.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(listAlbum);

        selecAlbum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        selecAlbum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Àlbums" }));
        selecAlbum.setToolTipText("Selecciona un àlbum...");
        selecAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecAlbumActionPerformed(evt);
            }
        });

        btnNewAlbum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNewAlbum.setText("Crear àlbum");
        btnNewAlbum.setToolTipText("Crea un nou àlbum");
        btnNewAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAlbumActionPerformed(evt);
            }
        });

        btnNoAlbum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNoAlbum.setText("Eliminar àlbum");
        btnNoAlbum.setToolTipText("Elimina l'àlbum seleccionat");
        btnNoAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoAlbumActionPerformed(evt);
            }
        });

        btnReproAlbum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReproAlbum.setText("Reproduir àlbum");
        btnReproAlbum.setToolTipText("Reprodueix l'àlbum seleccionat");
        btnReproAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproAlbumActionPerformed(evt);
            }
        });

        btnAfegir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAfegir.setText("Afegir fitxer");
        btnAfegir.setToolTipText("Afegeix un nou fitxer a la biblioteca");
        btnAfegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar fitxer");
        btnEliminar.setToolTipText("Elimina un dels fitxers de la biblioteca");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnReproBiblio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReproBiblio.setText("Reproduir biblioteca");
        btnReproBiblio.setToolTipText("Reprodueix la biblioteca de fitxers sencera");
        btnReproBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproBiblioActionPerformed(evt);
            }
        });

        btnReproFitxer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReproFitxer.setText("Reproduir fitxer");
        btnReproFitxer.setToolTipText("Reprodueix un únic fitxer");
        btnReproFitxer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproFitxerActionPerformed(evt);
            }
        });

        btnAfegirAlbum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAfegirAlbum.setText("Afegir fitxer a l'àlbum");
        btnAfegirAlbum.setToolTipText("Afegeix un fitxer a l'àlbum seleccionat");
        btnAfegirAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirAlbumActionPerformed(evt);
            }
        });

        txtBiblio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBiblio.setText("Biblioteca:");

        btnEliminarAlbum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarAlbum.setText("Eliminar fitxer de l'àlbum");
        btnEliminarAlbum.setToolTipText("Elimina un dels fitxers de l'àlbum seleccionat");
        btnEliminarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlbumActionPerformed(evt);
            }
        });

        btnReproGestor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReproGestor.setText("Reproducció en curs");
        btnReproGestor.setToolTipText("Gestiona la reproducció en curs");
        btnReproGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproGestorActionPerformed(evt);
            }
        });

        btCarregar.setText("Dades");
        btCarregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setText("Carregar");
        jMenuItem1.setToolTipText("Carregar dades del disc");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btCarregar.add(jMenuItem1);

        btGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        btGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setToolTipText("Guardar dades al disc");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        btCarregar.add(btGuardar);

        jMenuBar1.add(btCarregar);

        jMenu2.setText("Ajuda");
        jMenu2.setToolTipText("Informació sobre l'aplicació.");
        jMenu2.setActionCommand("Sobre");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btInfo.setText("Informació");
        btInfo.setActionCommand("btInfo");
        btInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoActionPerformed(evt);
            }
        });
        jMenu2.add(btInfo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAfegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAfegirAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReproBiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReproFitxer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBiblio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarAlbum)
                            .addComponent(btnReproAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReproGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(selecAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBiblio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewAlbum)
                        .addGap(18, 18, 18)
                        .addComponent(btnNoAlbum)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAlbum)
                        .addGap(18, 18, 18)
                        .addComponent(btnReproAlbum)
                        .addGap(18, 18, 18)
                        .addComponent(btnReproGestor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAfegir)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAfegirAlbum)
                        .addGap(18, 18, 18)
                        .addComponent(btnReproBiblio)
                        .addGap(18, 18, 18)
                        .addComponent(btnReproFitxer))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReproAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproAlbumActionPerformed
        try {
            if(!(selecAlbum.getSelectedItem().toString().equals("No hi ha cap àlbum"))){
                controlador.reproduirCarpeta(selecAlbum.getSelectedItem().toString().substring(4));            
            }
        } catch (AplicacioException ex) {            
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());    
        }
    }//GEN-LAST:event_btnReproAlbumActionPerformed

    private void btnEliminarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlbumActionPerformed
        if (listAlbum.getSelectedIndex()>=0){
            int[] asd = listAlbum.getSelectedIndices();
            for(int i : asd){
                controlador.esborrarFitxer(selecAlbum.getSelectedItem().toString().substring(4),i);
                ompleBiblio();
                ompleAlbum();
                /*
                Cada vegada que elimina un fitxer, s'avançen tots una posició
                endavant, per tant cal decremenetar els seguënts índexs seleccionats
                per tal de que s'eliminin correctament.
                */
                for(int s = 0; s < asd.length; s++){
                    asd[s] = asd[s] - 1;
                }
            }
            JOptionPane.showMessageDialog(null, String.valueOf(asd.length) +  " fitxers eliminats correctament del àlbum.", "Operació completada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarAlbumActionPerformed

    private void btnReproGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproGestorActionPerformed
        repro.pack();
        repro.setVisible(true);
    }//GEN-LAST:event_btnReproGestorActionPerformed

    private void btnAfegirAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirAlbumActionPerformed
        if((listCarpeta.getSelectedIndex()>=0)&&(!(selecAlbum.getSelectedItem().toString().equals("No hi ha cap àlbum")))){
            int i = 0;
            /*
            Permet afegir més d'un fitxer alhora a un àlbum.
            */
            int[] asd = listCarpeta.getSelectedIndices();
            while(i < listCarpeta.getSelectedIndices().length){
                try {
                    controlador.afegirFitxer(selecAlbum.getSelectedItem().toString().substring(4),asd[i]);
                    i++;
                } catch (AplicacioException ex) {
                    Logger.getLogger(AplicacioUB4.class.getName()).log(Level.SEVERE, null, ex);
                }
                ompleAlbum();    
            }
        }        
    }//GEN-LAST:event_btnAfegirAlbumActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (listCarpeta.getSelectedIndex()>=0){
            int[] asd = listCarpeta.getSelectedIndices();
            for(int i : asd){
                controlador.esborrarFitxer(i);
                ompleBiblio();
                ompleAlbum();
                /*
                Cada vegada que elimina un fitxer, s'avançen tots una posició
                endavant, per tant cal decremenetar els seguënts índexs seleccionats
                per tal de que s'eliminin correctament.
                */
                for(int s = 0; s < asd.length; s++){
                    asd[s] = asd[s] - 1;
                }
            }
            JOptionPane.showMessageDialog(null, String.valueOf(asd.length) +  " fitxers eliminats correctament de la biblioteca.", "Operació completada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReproBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproBiblioActionPerformed
        try {
            controlador.reproduirCarpeta();
        } catch (AplicacioException ex) {            
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());    
        }
    }//GEN-LAST:event_btnReproBiblioActionPerformed

    private void btnReproFitxerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproFitxerActionPerformed
        try {
            if (listCarpeta.getSelectedIndex()>=0){
                controlador.reproduirFitxer(listCarpeta.getSelectedIndex());
            }
        } catch (AplicacioException ex) {            
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());    
        }
    }//GEN-LAST:event_btnReproFitxerActionPerformed

    private void btnNoAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoAlbumActionPerformed
        if(!(selecAlbum.getSelectedItem().toString().equals("No hi ha cap àlbum"))){
            controlador.esborrarAlbum(selecAlbum.getSelectedItem().toString().substring(4));            
        }
        opcionsComboBox();
        if(!(selecAlbum.getSelectedItem().toString().equals("No hi ha cap àlbum"))){
            ompleAlbum();           
        }
    }//GEN-LAST:event_btnNoAlbumActionPerformed

    private void selecAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecAlbumActionPerformed
        ompleAlbum();
    }//GEN-LAST:event_selecAlbumActionPerformed

    private void btnAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirActionPerformed
        fitxer.pack();
        fitxer.setVisible(true);
    }//GEN-LAST:event_btnAfegirActionPerformed

    private void btnNewAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAlbumActionPerformed
        album.pack();
        album.setVisible(true);
    }//GEN-LAST:event_btnNewAlbumActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser cercador2 = new javax.swing.JFileChooser();
        cercador2.showOpenDialog(this);
        try {
            this.controlador.carregarDadesDisc(cercador2.getSelectedFile().getAbsolutePath());
            ompleBiblio();
            ompleAlbum();
        } catch (AplicacioException ex) {
            Logger.getLogger(AplicacioUB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        JFileChooser cercador = new javax.swing.JFileChooser();
        cercador.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        cercador.showOpenDialog(this);
        try {
            this.controlador.guardarDadesDisc(cercador.getSelectedFile().getAbsolutePath());
        } catch (AplicacioException ex) {
            Logger.getLogger(AplicacioUB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
        JOptionPane.showMessageDialog(null, "Versió:    1.0 [08/06/2018] \nFet per:\n               Josep Núñez Riba\n               Rodrigo Cabezas Quirós", "Informació del reproductor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btCarregar;
    private javax.swing.JMenuItem btGuardar;
    private javax.swing.JMenuItem btInfo;
    private javax.swing.JButton btnAfegir;
    private javax.swing.JButton btnAfegirAlbum;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarAlbum;
    private javax.swing.JButton btnNewAlbum;
    private javax.swing.JButton btnNoAlbum;
    private javax.swing.JButton btnReproAlbum;
    private javax.swing.JButton btnReproBiblio;
    private javax.swing.JButton btnReproFitxer;
    private javax.swing.JButton btnReproGestor;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listAlbum;
    private javax.swing.JList<String> listCarpeta;
    private javax.swing.JComboBox<String> selecAlbum;
    private javax.swing.JLabel txtBiblio;
    // End of variables declaration//GEN-END:variables
}