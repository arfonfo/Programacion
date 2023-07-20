
package com.arfonfo.escuela.frames.profesores;

import com.arfonfo.dao.mysql.DAOException;
import com.arfonfo.dao.mysql.MySQLDaoManager;
import com.arfonfo.escuela.Profesor;
import com.arfonfo.escuela.dao.DAOManager;
import com.arfonfo.escuela.frames.alumnos.ListaAlumnosFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alfon
 */
public class ListProfesoresFrame extends javax.swing.JFrame {

    private ProfesoresTableModel modelo;
    
    private DAOManager manager;

    public ListProfesoresFrame(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
        this.modelo = new ProfesoresTableModel(manager.getProfesorDAO());
        this.tabla.setModel(modelo);
        actualizarTabla();
        tabla.getSelectionModel().addListSelectionListener(e ->{
            boolean valido = (tabla.getSelectedRow() != -1);
            editar.setEnabled(valido);
            borrar.setEnabled(valido);  
            
        });
    }
    
    final void actualizarTabla() throws DAOException{
        progreso.setText("Actualizando datos... ");
        this.modelo.updateModel();
        this.modelo.fireTableDataChanged();
        progreso.setText(modelo.getRowCount() + " profesores visibles.");
    }
    
    Profesor obtenerProfesores() throws DAOException{
        Long id = (Long) modelo.getValueAt(tabla.getSelectedRow(), 0);
        return manager.getProfesorDAO().obtener(id);
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
        progreso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        detalle = new com.arfonfo.escuela.frames.profesores.DetalleProfesorPanel();

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

        progreso.setText("Progreso");
        progreso.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        getContentPane().add(progreso, java.awt.BorderLayout.PAGE_END);

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

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        getContentPane().add(detalle, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        detalle.setProfesor(null);
        detalle.setEditable(true);
        detalle.loadData();
        guardar.setEnabled(true);
        cancelar.setEnabled(true); 
    }//GEN-LAST:event_nuevoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            detalle.setProfesor(obtenerProfesores());
            detalle.setEditable(true);
            detalle.loadData();
            guardar.setEnabled(true);
            cancelar.setEnabled(true);
        } catch(DAOException ex){
            System.out.println("Error al obtener el Profesor" + ex.getMessage() );
        }
     }//GEN-LAST:event_editarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quieres borrar este profesor?", 
                "Borrar profesor", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            try {
                Profesor profesor =  obtenerProfesores();
                manager.getProfesorDAO().eliminar(profesor);
                actualizarTabla();
                tabla.clearSelection();
                editar.setEnabled(false);
                borrar.setEnabled(false);
                guardar.setEnabled(false);
                cancelar.setEnabled(false);
            } catch (DAOException ex) {
                Logger.getLogger(ListaAlumnosFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    }//GEN-LAST:event_borrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        detalle.setProfesor(null);
        detalle.setEditable(false);
        detalle.loadData();
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try{
            detalle.saveData();
            Profesor datosProfesor = detalle.getProfesor();
            if(datosProfesor.getId() == null){
                manager.getProfesorDAO().insertar(datosProfesor);
            } else {
                manager.getProfesorDAO().modificar(datosProfesor);
            }
            actualizarTabla();
            detalle.setProfesor(null);
            detalle.setEditable(false);
            detalle.loadData();
            guardar.setEnabled(false);
            cancelar.setEnabled(false);
        } catch(DAOException ex){
            System.out.println("Error a la hora de modificar los datos" + ex.toString());
        }
    }//GEN-LAST:event_guardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException{
         java.awt.EventQueue.invokeLater(() -> {
            try {
                DAOManager manager = new MySQLDaoManager("localhost", "root", "", "escuela");
                new ListProfesoresFrame(manager).setVisible(true);
            } catch (SQLException | DAOException ex) {
                System.out.println("Error de SQL" + ex.toString());
             }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private com.arfonfo.escuela.frames.profesores.DetalleProfesorPanel detalle;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton nuevo;
    private javax.swing.JLabel progreso;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
