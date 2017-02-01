/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CifradoGrafico;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ruben
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public VentanaPrincipal() {
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

        rbtngroup_red = new javax.swing.ButtonGroup();
        text_rutaArchivo = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        label_archivo = new javax.swing.JLabel();
        label_sevidor = new javax.swing.JLabel();
        text_servidor = new javax.swing.JTextField();
        rbtn_local = new javax.swing.JRadioButton();
        rbtn_remota = new javax.swing.JRadioButton();
        btn_enviar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        label_pass = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_rutaArchivo.setEditable(false);

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        label_archivo.setText("Ruta del Archivo:");

        label_sevidor.setText("Servidor:");

        rbtngroup_red.add(rbtn_local);
        rbtn_local.setText("Red Local");
        rbtn_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_localActionPerformed(evt);
            }
        });

        rbtngroup_red.add(rbtn_remota);
        rbtn_remota.setText("Red Remota");

        btn_enviar.setText("ENVIAR");

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        label_pass.setText("Contraseña:");

        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_archivo)
                    .addComponent(label_sevidor)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_rutaArchivo)
                            .addComponent(text_servidor)
                            .addComponent(label_pass)
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn_local)
                            .addComponent(btn_buscar)
                            .addComponent(rbtn_remota)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(label_archivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_sevidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_local))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_remota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enviar)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        
       BuscadorFichero buscador = new BuscadorFichero();    
       JFileChooser fc=new JFileChooser();
       
       fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //Creamos el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        //Le indicamos el filtro
        fc.setFileFilter(filtro);
       
       //guardamos la seleccion de fichero
       int seleccion=fc.showOpenDialog(buscador);
       
       if(seleccion==JFileChooser.APPROVE_OPTION){

	//Seleccionamos el fichero
	File fichero=fc.getSelectedFile();

	//Ecribe la ruta del fichero seleccionado en el campo de texto
	text_rutaArchivo.setText(fichero.getAbsolutePath());
       
       }
       
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void rbtn_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_localActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel label_archivo;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_sevidor;
    private javax.swing.JRadioButton rbtn_local;
    private javax.swing.JRadioButton rbtn_remota;
    private javax.swing.ButtonGroup rbtngroup_red;
    private javax.swing.JTextField text_rutaArchivo;
    private javax.swing.JTextField text_servidor;
    private javax.swing.JTextField txt_pass;
    // End of variables declaration//GEN-END:variables
}