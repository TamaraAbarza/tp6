/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import dir.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AgregarClienteView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarCliente
     */
    public AgregarClienteView() {
        initComponents();
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelDomicilio = new javax.swing.JLabel();
        jbtNuevo = new javax.swing.JButton();
        jbtGuardar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtCiudad = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dni: ");

        jPanel2.setBackground(new java.awt.Color(162, 179, 139));

        jLabel1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR CLIENTES");

        jLabelDni.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabelDni.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDni.setText("Dni: ");

        jLabelNombre.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido:");

        jLabelCiudad.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabelCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCiudad.setText("Ciudad:");

        jLabelDomicilio.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabelDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDomicilio.setText("Domicilio:");

        jbtNuevo.setBackground(new java.awt.Color(36, 61, 37));
        jbtNuevo.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        jbtNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbtNuevo.setText("Nuevo");
        jbtNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNuevoActionPerformed(evt);
            }
        });

        jbtGuardar.setBackground(new java.awt.Color(36, 61, 37));
        jbtGuardar.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        jbtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtGuardar.setText("Guardar");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });

        jbtSalir.setBackground(new java.awt.Color(36, 61, 37));
        jbtSalir.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        jbtSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jtDni.setBackground(new java.awt.Color(228, 233, 190));
        jtDni.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtDni.setForeground(new java.awt.Color(0, 51, 51));
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(228, 233, 190));
        jtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(0, 51, 51));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtCiudad.setBackground(new java.awt.Color(228, 233, 190));
        jtCiudad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtCiudad.setForeground(new java.awt.Color(0, 51, 51));
        jtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCiudadKeyTyped(evt);
            }
        });

        jtApellido.setBackground(new java.awt.Color(228, 233, 190));
        jtApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(0, 51, 51));
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtTelefono.setBackground(new java.awt.Color(228, 233, 190));
        jtTelefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtTelefono.setForeground(new java.awt.Color(0, 51, 51));
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jLabelTelefono.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setText("Teléfono");

        jtDomicilio.setBackground(new java.awt.Color(228, 233, 190));
        jtDomicilio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtDomicilio.setForeground(new java.awt.Color(0, 51, 51));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(71, 71, 71))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jbtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(jbtGuardar)
                                    .addGap(33, 33, 33)
                                    .addComponent(jbtSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jtTelefono))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(jtCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombre)
                                    .addComponent(jtDni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNuevo)
                    .addComponent(jbtGuardar)
                    .addComponent(jbtSalir))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed

        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        String ciudad = jtCiudad.getText();
        String domicilio = jtDomicilio.getText();
        Long dni = Long.parseLong(jtDni.getText());
        Long telefono = Long.parseLong(jtTelefono.getText());
        Cliente clienteNuevo = new Cliente(nombre, apellido, dni, ciudad, domicilio);
        boolean exito = MenuView.directorio.agregarCliente(telefono, clienteNuevo);
        if (exito) {
            JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Este nro de telefono ya existe, no se pudo agregar");
        }

    }//GEN-LAST:event_jbtGuardarActionPerformed

    private void jbtNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_jbtNuevoActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
         //CONTROLO QUE SOLO SE INGRESEN NUMEROS
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
         //CONTROLO QUE SOLO SE INGRESEN NUMEROS
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        //CONTROLO QUE SOLO SE INGRESEN CARACTERES SIN NUMEROS
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z' ) && (c < 'A' || c > 'Z') && (c!= ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
         //CONTROLO QUE SOLO SE INGRESEN CARACTERES SIN NUMEROS
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z' ) && (c < 'A' || c > 'Z') && (c!= ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCiudadKeyTyped
        //CONTROLO QUE SOLO SE INGRESEN CARACTERES SIN NUMEROS
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z' ) && (c < 'A' || c > 'Z') && (c!= ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtCiudadKeyTyped

    private void limpiar() {
        jtNombre.setText("");
        jtCiudad.setText("");
        jtApellido.setText("");
        jtTelefono.setText("");
        jtDomicilio.setText("");
        jtDni.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelDomicilio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JButton jbtNuevo;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}