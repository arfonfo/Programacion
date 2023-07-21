
package com.arfonfo.escuela.frames.asignaturas;

import com.arfonfo.escuela.Asignatura;

/**
 *
 * @author alfon
 */
public class DetalleAsignaturaPanel extends javax.swing.JPanel {

    private boolean editable;
    private Asignatura asignatura;
    
    
    public DetalleAsignaturaPanel() {
        initComponents();
    }

    public void setAsignatura(Asignatura a){
        this.asignatura = a ;
    }
    
    public Asignatura getAsignatura(){
        return this.asignatura;
    }
    
    public void setEditable(boolean editable){
         this.editable = editable;
         this.nombre.setEditable(editable);
         this.profesor.setEnabled(editable); 
    }
    
    public boolean isEditable(){
        return this.editable;
    }
    
    public void loadData(){
        if(asignatura == null) {
            asignatura = new Asignatura("", 0L);
        }
        nombre.setText(asignatura.getNombre());
        nombre.requestFocus();
    }
    
    public void saveData(){
        if(asignatura == null) {
            asignatura = new Asignatura("", 0L);
        }
        asignatura.setNombre(asignatura.getNombre());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        profesor = new javax.swing.JComboBox<>();

        jLabel1.setText("Asignatura:");

        jLabel2.setText("Profesor:");

        profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> profesor;
    // End of variables declaration//GEN-END:variables
}
