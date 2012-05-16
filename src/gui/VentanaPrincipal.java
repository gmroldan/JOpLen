/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package gui;

import gui.acercaDe.AcercaDeDialog;
import gui.alfabeto.nuevoAlfabetoDialog;
import gui.lenguaje.nuevoLenguajeDialog;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import operacioneslenguajes.Alfabeto;
import operacioneslenguajes.Entorno;
import operacioneslenguajes.Lenguaje;

public class VentanaPrincipal extends javax.swing.JFrame {    
    Entorno e=new Entorno();
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelAlfabeto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        boxLenguaje1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        boxLenguaje2 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        boxOperaciones = new javax.swing.JComboBox();
        botonEvaluar = new javax.swing.JButton();
        textPotencia = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textResultado = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        opcionGuardar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opcionSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opcionNuevoAlfabeto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        opcionNuevoLenguaje = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcionAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOpLen - Operaciones con Lenguajes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alfabeto"));

        jLabel1.setText("Σ =");

        labelAlfabeto.setText("{No se ingresó ningún alfabeto}");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAlfabeto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelAlfabeto))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lenguajes"));

        boxLenguaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLenguaje1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(3);
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxLenguaje1, 0, 248, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxLenguaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        boxLenguaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLenguaje2ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(3);
        jTextArea2.setRows(3);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxLenguaje2, 0, 249, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxLenguaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        boxOperaciones.setMaximumRowCount(9);
        boxOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unión", "Diferencia", "Intersección", "Complemento", "Producto", "Potenciación", "Estrella de Kleene", "Estrella Positiva", "Inversa" }));
        boxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOperacionesActionPerformed(evt);
            }
        });

        botonEvaluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/operation.png"))); // NOI18N
        botonEvaluar.setText("Evaluar");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluarActionPerformed(evt);
            }
        });

        textPotencia.setToolTipText("Ingrese aquí el exponente para la potencia");
        textPotencia.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxOperaciones, 0, 164, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(textPotencia))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(boxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(botonEvaluar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación de Lenguajes"));

        textResultado.setColumns(20);
        textResultado.setRows(5);
        jScrollPane3.setViewportView(textResultado);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/open.png"))); // NOI18N
        jMenuItem3.setText("Abrir");
        jMenu1.add(jMenuItem3);

        opcionGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        opcionGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/save.png"))); // NOI18N
        opcionGuardar.setText("Guardar");
        opcionGuardar.setToolTipText("Guarda el alfabeto y los lenguajes en un archivo de texto");
        opcionGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(opcionGuardar);
        jMenu1.add(jSeparator2);

        opcionSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/close.png"))); // NOI18N
        opcionSalir.setText("Salir");
        opcionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opcionSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Alfabeto");

        opcionNuevoAlfabeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opcionNuevoAlfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/math.png"))); // NOI18N
        opcionNuevoAlfabeto.setText("Nuevo Alfabeto");
        opcionNuevoAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionNuevoAlfabetoActionPerformed(evt);
            }
        });
        jMenu3.add(opcionNuevoAlfabeto);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Lenguaje");

        opcionNuevoLenguaje.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        opcionNuevoLenguaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/new.png"))); // NOI18N
        opcionNuevoLenguaje.setText("Nuevo Lenguaje");
        opcionNuevoLenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionNuevoLenguajeActionPerformed(evt);
            }
        });
        jMenu4.add(opcionNuevoLenguaje);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ayuda");

        opcionAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/about.png"))); // NOI18N
        opcionAcercaDe.setText("Acerca de");
        opcionAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(opcionAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAcercaDeActionPerformed
        // TODO add your handling code here:
        new AcercaDeDialog(this, true).setVisible(true);
    }//GEN-LAST:event_opcionAcercaDeActionPerformed

    private void opcionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionSalirActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", null, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_opcionSalirActionPerformed

    private void opcionNuevoAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionNuevoAlfabetoActionPerformed
        // TODO add your handling code here:
        Alfabeto a=new nuevoAlfabetoDialog(this, true).getAlfabeto();
        if(nuevoAlfabetoDialog.isEstado()){
            e.agregarAlfabeto(a);
            labelAlfabeto.setText(Entorno.getAlfabeto().getSimbolos().toString());
        }        
    }//GEN-LAST:event_opcionNuevoAlfabetoActionPerformed

    private void opcionNuevoLenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionNuevoLenguajeActionPerformed
        // TODO add your handling code here:
        Lenguaje lenguaje;
        if(Entorno.getAlfabeto()!=null){
           lenguaje=new nuevoLenguajeDialog(this, true).getLenguaje();
           if(nuevoLenguajeDialog.isEstado()){
               e.agregarLenguaje(lenguaje);
               actualizarComboBoxsLenguajes(boxLenguaje1);
               actualizarComboBoxsLenguajes(boxLenguaje2);
           }           
        }           
        else
            JOptionPane.showMessageDialog(this, "Debe ingresar un alfabeto", "Error", JOptionPane.ERROR_MESSAGE);        
    }//GEN-LAST:event_opcionNuevoLenguajeActionPerformed

    private void boxLenguaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLenguaje1ActionPerformed
        // TODO add your handling code here:    
        mostrarLenguaje(boxLenguaje1,jTextArea1);
    }//GEN-LAST:event_boxLenguaje1ActionPerformed

    private void boxLenguaje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLenguaje2ActionPerformed
        // TODO add your handling code here:
        mostrarLenguaje(boxLenguaje2,jTextArea2);
    }//GEN-LAST:event_boxLenguaje2ActionPerformed

    private void botonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluarActionPerformed
        // TODO add your handling code here:
        try{
            String len1=boxLenguaje1.getSelectedItem().toString();
            String len2=boxLenguaje2.getSelectedItem().toString();            
            String potencia=textPotencia.getText();            
            switch(getOperacion()){
                case 0:
                    textResultado.setText(len1+" ∪ "+len2+" = "+e.union(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString());
                    break;
                case 1:
                    textResultado.setText(len1+" - "+len2+" = "+e.diferencia(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString());
                    break;
                case 2:
                    textResultado.setText(len1+" ∩ "+len2+" ="+e.interseccion(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString());
                    break;
                case 3:
                    textResultado.setText("∼"+len1+" = "+e.complemento(e.buscarLenguaje(len1)));
                    break;
                case 4:
                    textResultado.setText(len1+" . "+len2+" = "+e.producto(e.buscarLenguaje(len1), e.buscarLenguaje(len2)).getPalabras().toString());
                    break;
                case 5:
                    if(Integer.parseInt(potencia)>=0)
                        textResultado.setText(len1+" a la "+potencia+" = "+e.potenciacion(e.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString());
                    else
                        JOptionPane.showMessageDialog(this, "Esta opereción solo acepta potencias mayores o iguales a 0(cero)", null, JOptionPane.ERROR_MESSAGE);
                    break;
                case 6:
                    if(Integer.parseInt(potencia)>=0)
                        textResultado.setText(len1+" Estrella de Kleene en potencia "+potencia+" = "+e.estrella("kleene", e.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString());
                    else
                        JOptionPane.showMessageDialog(this, "Esta opereción solo acepta potencias mayores o iguales a 0(cero)", null, JOptionPane.ERROR_MESSAGE);
                    break;
                case 7:
                    if(Integer.parseInt(potencia)>=1)
                        textResultado.setText(len1+" Estrella Positiva en potencia "+potencia+" = "+e.estrella("", e.buscarLenguaje(len1), Integer.parseInt(potencia)).getPalabras().toString());
                    else
                        JOptionPane.showMessageDialog(this, "Esta opereción solo acepta potencias mayores o iguales a 1(uno)", null, JOptionPane.ERROR_MESSAGE);
                    break;
                case 8:
                    textResultado.setText(len1+" inversa = "+e.inversa(e.buscarLenguaje(len1)).getPalabras().toString());
                    break;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "No se puedo realizar ninguna operación", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_botonEvaluarActionPerformed

    private void boxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOperacionesActionPerformed
        // TODO add your handling code here:        
        String operacion=boxOperaciones.getSelectedItem().toString();
        if( "Complemento".equals(operacion) || "Potenciación".equals(operacion) || "Estrella de Kleene".equals(operacion) || "Inversa".equals(operacion) || "Estrella Positiva".equals(operacion)){
            boxLenguaje2.setEnabled(false);
            jTextArea2.setEnabled(false);
            if("Potenciación".equals(operacion) || "Estrella de Kleene".equals(operacion) || "Estrella Positiva".equals(operacion))
                textPotencia.setEnabled(true);
            else
                textPotencia.setEnabled(false);
        }
        else{
            boxLenguaje2.setEnabled(true);
            jTextArea2.setEnabled(true);
            textPotencia.setEnabled(false);
        }            
    }//GEN-LAST:event_boxOperacionesActionPerformed

    private void opcionGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionGuardarActionPerformed
        // TODO add your handling code here:
        try{
            e.guardar();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "No se pudo guardar el proyecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_opcionGuardarActionPerformed

    public void actualizarComboBoxsLenguajes(JComboBox comboBox){
        String[] items = new String[Entorno.getLenguajes().size()];
        int i=0;
        for(Lenguaje l:Entorno.getLenguajes()){
            items[i]=l.getNombre();
            i++;            
        }                
        DefaultComboBoxModel modelo=new DefaultComboBoxModel(items);
        comboBox.setModel(modelo);        
    }
    
    public void mostrarLenguaje(JComboBox comboBox,JTextArea textArea){        
        for(Lenguaje l:Entorno.getLenguajes()){
            if(comboBox.getSelectedItem()==l.getNombre())
                textArea.setText(l.getPalabras().toString());
        }
    }
    
    public int getOperacion(){        
        return boxOperaciones.getSelectedIndex();
    }
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JComboBox boxLenguaje1;
    private javax.swing.JComboBox boxLenguaje2;
    private javax.swing.JComboBox boxOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelAlfabeto;
    private javax.swing.JMenuItem opcionAcercaDe;
    private javax.swing.JMenuItem opcionGuardar;
    private javax.swing.JMenuItem opcionNuevoAlfabeto;
    private javax.swing.JMenuItem opcionNuevoLenguaje;
    private javax.swing.JMenuItem opcionSalir;
    private javax.swing.JTextField textPotencia;
    private javax.swing.JTextArea textResultado;
    // End of variables declaration//GEN-END:variables
}
