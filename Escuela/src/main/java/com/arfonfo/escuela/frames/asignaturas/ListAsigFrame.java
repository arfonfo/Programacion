
package com.arfonfo.escuela.frames.asignaturas;

import com.arfonfo.dao.mysql.DAOException;
import com.arfonfo.dao.mysql.MySQLDaoManager;
import com.arfonfo.escuela.Asignatura;
import com.arfonfo.escuela.dao.DAOManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alfon
 */
public class ListAsigFrame extends javax.swing.JFrame {

    private DAOManager manager;
    
    private AsignaturasTableModel modelo;    
    
    public ListAsigFrame(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        this.modelo = new AsignaturasTableModel(manager.getAsignaturaDAO());
        this.tabla.setModel(modelo);
        updateTable();
        this.detalle.setEditable(false);
        this.detalle.setAsignatura(null);
        activarBotonesCRUD(false);
        activarBotonesGuardar(false);
        
        tabla.getSelectionModel().addListSelectionListener(e -> {
            boolean valida = tabla.getSelectedRow() != -1;
            activarBotonesCRUD(valida);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        nuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        editar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        detalle = new com.arfonfo.escuela.frames.asignaturas.DetalleAsignaturaPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorderPainted(false);

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-48.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setBorderPainted(false);
        nuevo.setContentAreaFilled(false);
        nuevo.setFocusable(false);
        nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(nuevo);
        jToolBar1.add(jSeparator1);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-48.png"))); // NOI18N
        editar.setText("Editar");
        editar.setBorderPainted(false);
        editar.setContentAreaFilled(false);
        editar.setEnabled(false);
        editar.setFocusable(false);
        editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jToolBar1.add(editar);

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-48.png"))); // NOI18N
        borrar.setText("Borrar");
        borrar.setBorderPainted(false);
        borrar.setContentAreaFilled(false);
        borrar.setEnabled(false);
        borrar.setFocusable(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jToolBar1.add(borrar);
        jToolBar1.add(jSeparator2);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save-48.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setEnabled(false);
        guardar.setFocusable(false);
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(guardar);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel-48.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setEnabled(false);
        cancelar.setFocusable(false);
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(cancelar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jPanel1.add(detalle, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        activarBotonesGuardar(true);
        detalle.setEditable(true);
        detalle.setAsignatura(null);
        detalle.loadData();
    }//GEN-LAST:event_nuevoActionPerformed

    Asignatura obtenerAsignaturaSeleccionada() throws DAOException{
        long identificador = (long ) tabla.getValueAt(tabla.getSelectedRow(), 0);
        return manager.getAsignaturaDAO().obtener(identificador);
    }
    
    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            activarBotonesGuardar(true);
            detalle.setEditable(true);
            detalle.setAsignatura(obtenerAsignaturaSeleccionada());
            detalle.loadData();
        } catch (DAOException ex) {
            Logger.getLogger(ListAsigFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quieres borrar esta asignatura?", 
                "Borrar asignatura", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            try {
                Asignatura a = obtenerAsignaturaSeleccionada();
                manager.getAsignaturaDAO().eliminar(a);
                updateTable();
                activarBotonesCRUD(false);
            } catch (DAOException ex) {
                Logger.getLogger(ListAsigFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
      detalle.saveData();
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        detalle.setAsignatura(null);
        detalle.setEditable(false);
        detalle.loadData();
        activarBotonesCRUD(false);
        activarBotonesGuardar(false);
        // De esta manera quitamos todas las selecciones de la tabla si estamos editando un registro que ya existe 
        tabla.clearSelection();
    }//GEN-LAST:event_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
       java.awt.EventQueue.invokeLater(() -> {
            try {
                DAOManager manager = new MySQLDaoManager("localhost", "root", "", "escuela");
                new ListAsigFrame(manager).setVisible(true);
            } catch (SQLException | DAOException ex) {
                System.out.println("Error de SQL" + ex.toString());
             }
        });
    }
    
    void activarBotonesCRUD(boolean activo){
        this.borrar.setEnabled(activo);
        this.editar.setEnabled(activo);
    }
    
    void activarBotonesGuardar(boolean activo){
        this.guardar.setEnabled(activo);
        this.cancelar.setEnabled(activo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private com.arfonfo.escuela.frames.asignaturas.DetalleAsignaturaPanel detalle;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void updateTable() throws DAOException {
        this.modelo.update();
        this.modelo.fireTableDataChanged();
    }
}
