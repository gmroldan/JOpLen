/* 
 *  Copyright (C) 2012  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package joplen.gui;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import joplen.model.Language;
import joplen.model.OperationType;
import joplen.controller.JOpLenController;
import joplen.exceptions.JOpLenException;
import joplen.gui.dialogs.NewAlphabetDialog;
import joplen.gui.dialogs.NewLanguageDialog;
import joplen.gui.dialogs.AboutDialog;

public class MainWindow extends javax.swing.JFrame {        
    private final JOpLenController controller;
    
    public MainWindow() {
        this.controller = JOpLenController.getInstance();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelAlphabet = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        boxLanguage1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLanguage1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        boxLanguage2 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaLanguage2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        boxOperations = new javax.swing.JComboBox(OperationType.values());
        btnResolve = new javax.swing.JButton();
        textExponent = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        optionOpen = new javax.swing.JMenuItem();
        optionSave = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        optionQuit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        optionNewAlphabet = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        optionNewLanguage = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        optionAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOpLen - Operaciones con Lenguajes");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alfabeto"));

        jLabel1.setText("Σ =");

        labelAlphabet.setText("{No se ingresó ningún alfabeto}");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAlphabet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelAlphabet))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lenguajes"));

        boxLanguage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLanguage1ActionPerformed(evt);
            }
        });

        txtAreaLanguage1.setColumns(3);
        txtAreaLanguage1.setRows(3);
        jScrollPane1.setViewportView(txtAreaLanguage1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxLanguage1, 0, 248, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxLanguage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        boxLanguage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLanguage2ActionPerformed(evt);
            }
        });

        txtAreaLanguage2.setColumns(3);
        txtAreaLanguage2.setRows(3);
        jScrollPane2.setViewportView(txtAreaLanguage2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxLanguage2, 0, 249, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxLanguage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        boxOperations.setMaximumRowCount(9);
        boxOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOperationsActionPerformed(evt);
            }
        });

        btnResolve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/operation.png"))); // NOI18N
        btnResolve.setText("Evaluar");
        btnResolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolveActionPerformed(evt);
            }
        });

        textExponent.setToolTipText("Ingrese aquí el exponente para la potencia");
        textExponent.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxOperations, 0, 176, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResolve, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(textExponent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(boxOperations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textExponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnResolve)
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
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación de Lenguajes"));

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane3.setViewportView(txtResult);

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

        optionOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        optionOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/open.png"))); // NOI18N
        optionOpen.setText("Abrir");
        optionOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionOpenActionPerformed(evt);
            }
        });
        jMenu1.add(optionOpen);

        optionSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        optionSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/save.png"))); // NOI18N
        optionSave.setText("Guardar");
        optionSave.setToolTipText("Guarda el alfabeto y los lenguajes en un archivo de texto");
        optionSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSaveActionPerformed(evt);
            }
        });
        jMenu1.add(optionSave);
        jMenu1.add(jSeparator2);

        optionQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/close.png"))); // NOI18N
        optionQuit.setText("Salir");
        optionQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionQuitActionPerformed(evt);
            }
        });
        jMenu1.add(optionQuit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Alfabeto");

        optionNewAlphabet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        optionNewAlphabet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/math.png"))); // NOI18N
        optionNewAlphabet.setText("Nuevo Alfabeto");
        optionNewAlphabet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionNewAlphabetActionPerformed(evt);
            }
        });
        jMenu3.add(optionNewAlphabet);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Lenguaje");

        optionNewLanguage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        optionNewLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/new.png"))); // NOI18N
        optionNewLanguage.setText("Nuevo Lenguaje");
        optionNewLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionNewLanguageActionPerformed(evt);
            }
        });
        jMenu4.add(optionNewLanguage);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ayuda");

        optionAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joplen/gui/icons/about.png"))); // NOI18N
        optionAbout.setText("Acerca de");
        optionAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAboutActionPerformed(evt);
            }
        });
        jMenu2.add(optionAbout);

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

        setSize(new java.awt.Dimension(805, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void optionAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAboutActionPerformed
        new AboutDialog(this, true).setVisible(true);
    }//GEN-LAST:event_optionAboutActionPerformed

    private void optionQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionQuitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_optionQuitActionPerformed

    private void optionNewAlphabetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionNewAlphabetActionPerformed
        try {
            NewAlphabetDialog dialog = new NewAlphabetDialog(this, true);
            if (dialog.isStatus()) {
                controller.newAlphabet(dialog.getSymbols());
                labelAlphabet.setText(controller.getAlphabet().toString());
            }
        } catch (JOpLenException ex) {
            showErrorMessage(ex.getMessage());
        }
    }//GEN-LAST:event_optionNewAlphabetActionPerformed

    private void optionNewLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionNewLanguageActionPerformed
        try {
            if (controller.getAlphabet() == null) {
                throw new JOpLenException("Primero debe ingresar un alfabeto");
            }
            
            NewLanguageDialog dialog = new NewLanguageDialog(this, true);
            if (dialog.isStatus()) {
                try {
                    controller.newLanguage(dialog.getWords());
                    updateComboBoxsLanguages();
                } catch (JOpLenException ex) {
                    showErrorMessage(ex.getMessage());
                }
            }            
        } catch(JOpLenException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), null, JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_optionNewLanguageActionPerformed

    private void boxLanguage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLanguage1ActionPerformed
        showLanguage(boxLanguage1, txtAreaLanguage1);
    }//GEN-LAST:event_boxLanguage1ActionPerformed

    private void boxLanguage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLanguage2ActionPerformed
        showLanguage(boxLanguage2, txtAreaLanguage2);
    }//GEN-LAST:event_boxLanguage2ActionPerformed

    private void btnResolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolveActionPerformed
        try{
            String language1 = boxLanguage1.getSelectedItem().toString();            
            String language2 = null;
            String exponent = null;
            
            if (boxLanguage2.isEnabled()) {
                language2 = boxLanguage2.getSelectedItem().toString();
            }
            
            if (textExponent.isEnabled()) {
                exponent = textExponent.getText();
            }
            
            txtResult.setText(controller.resolve(language1, language2, exponent, getOperation()));
        } catch(Exception ex) {
            showErrorMessage("No se pudo realizar ninguna operación");
        }        
    }//GEN-LAST:event_btnResolveActionPerformed

    private void boxOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOperationsActionPerformed
        OperationType operationType = this.getOperation();
        
        if (OperationType.COMPLEMENT.equals(operationType)
                || OperationType.EXPONENTIATION.equals(operationType)
                || OperationType.KLEENE_STAR.equals(operationType)
                || OperationType.REVERSE.equals(operationType)
                || OperationType.POSITIVE_STAR.equals(operationType)) {
            
            boxLanguage2.setEnabled(false);
            txtAreaLanguage2.setEnabled(false);
            
            if (OperationType.EXPONENTIATION.equals(operationType)
                    || OperationType.KLEENE_STAR.equals(operationType)
                    || OperationType.POSITIVE_STAR.equals(operationType)) {
                
                textExponent.setEnabled(true);
                
            } else {
                textExponent.setEnabled(false);
            }
            
        } else {
            boxLanguage2.setEnabled(true);
            txtAreaLanguage2.setEnabled(true);
            textExponent.setEnabled(false);
        }            
    }//GEN-LAST:event_boxOperationsActionPerformed

    private void optionSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSaveActionPerformed
        try {
            final JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int returnVal = fileChooser.showSaveDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                this.controller.saveProject(selectedFile);
                JOptionPane.showMessageDialog(this, "El proyecto se guardó con éxito", null, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (JOpLenException ex) {
            showErrorMessage(ex.getMessage());
        }
    }//GEN-LAST:event_optionSaveActionPerformed

    private void optionOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionOpenActionPerformed
        try {
            final JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int returnVal = fileChooser.showOpenDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                this.controller.openProject(selectedFile);
                this.labelAlphabet.setText(controller.getAlphabet().toString());
                this.updateComboBoxsLanguages();
            }            
        } catch (JOpLenException ex) {
            showErrorMessage(ex.getMessage());
        }        
    }//GEN-LAST:event_optionOpenActionPerformed

    private void updateComboBoxsLanguages() {
        Object[] languages = controller.getLanguages();
        String[] items = new String[languages.length];
        int i = 0;
        for(Object object: languages){
            items[i] = ((Language) object).getName();
            i++;            
        }
        boxLanguage1.setModel(new DefaultComboBoxModel(items));        
        boxLanguage2.setModel(new DefaultComboBoxModel(items));
    }
    
    private void showLanguage(JComboBox comboBox, JTextArea textArea) {        
        Object[] languages = controller.getLanguages();
        for(Object object: languages) {
            if(comboBox.getSelectedItem() == ((Language) object).getName()) {
                textArea.setText(((Language) object).toString());
            }
        }
    }
    
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private OperationType getOperation(){        
        return (OperationType) boxOperations.getSelectedItem();
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxLanguage1;
    private javax.swing.JComboBox boxLanguage2;
    private javax.swing.JComboBox boxOperations;
    private javax.swing.JButton btnResolve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JLabel labelAlphabet;
    private javax.swing.JMenuItem optionAbout;
    private javax.swing.JMenuItem optionNewAlphabet;
    private javax.swing.JMenuItem optionNewLanguage;
    private javax.swing.JMenuItem optionOpen;
    private javax.swing.JMenuItem optionQuit;
    private javax.swing.JMenuItem optionSave;
    private javax.swing.JTextField textExponent;
    private javax.swing.JTextArea txtAreaLanguage1;
    private javax.swing.JTextArea txtAreaLanguage2;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
 
}
