
package com.arfonfo.escuela.frames;

import com.arfonfo.dao.mysql.DAOException;
import com.arfonfo.dao.mysql.MySQLDaoManager;
import com.arfonfo.escuela.Alumno;
import com.arfonfo.escuela.dao.DAOManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arfon
 */
public class ListaAlumnosFrame extends javax.swing.JFrame {

    private DAOManager manager;
    
    private AlumnosTableModel model;
    
    public ListaAlumnosFrame(DAOManager manager) throws DAOException{
        initComponents();
        this.manager = manager; 
        this.model = new AlumnosTableModel(manager.getAlumnoDAO());
        this.model.updateModel();
        this.tabla.setModel(model);
        this.tabla.getSelectionModel().addListSelectionListener(e -> {
            boolean seleccionValida = (tabla.getSelectedRow() != -1);
            editar.setEnabled(seleccionValida);
            borrar.setEnabled(seleccionValida);
        });
        editar.setEnabled(false);
        borrar.setEnabled(false);
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar = new javax.swing.JToolBar();
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
        detalle = new com.arfonfo.escuela.frames.DetalleAlumnoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolbar.setRollover(true);

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-48.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setFocusable(false);
        nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        toolbar.add(nuevo);
        toolbar.add(jSeparator1);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-48.png"))); // NOI18N
        editar.setText("Editar");
        editar.setFocusable(false);
        editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        toolbar.add(editar);

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-48.png"))); // NOI18N
        borrar.setText("Borrar");
        borrar.setFocusable(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        toolbar.add(borrar);
        toolbar.add(jSeparator2);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save-48.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setFocusable(false);
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        toolbar.add(guardar);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel-48.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setFocusable(false);
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        toolbar.add(cancelar);

        getContentPane().add(toolbar, java.awt.BorderLayout.PAGE_START);

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
        detalle.setAlumno(null);
        detalle.loadData();
        detalle.setEditable(true);
        guardar.setEnabled(true);
        cancelar.setEnabled(true);
    }//GEN-LAST:event_nuevoActionPerformed

    
    private Alumno getAlumnoSeleccionado() throws DAOException{
        Long id = (Long) tabla.getValueAt(tabla.getSelectedRow(), 0);
        return manager.getAlumnoDAO().obtener(id);
    }
        
    
    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            Alumno alumno = getAlumnoSeleccionado();
            detalle.setAlumno(alumno);
            detalle.setEditable(true);
            detalle.loadData();
            guardar.setEnabled(true);
            cancelar.setEnabled(true);
        } catch (DAOException ex) {
            Logger.getLogger(ListaAlumnosFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        detalle.setAlumno(null);
        detalle.setEditable(false);
        detalle.loadData();
        tabla.clearSelection();
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            detalle.saveData();
            Alumno alu = detalle.getAlumno();
            if(alu.getId() == null){
                manager.getAlumnoDAO().insertar(alu);
            } else {
                manager.getAlumnoDAO().modificar(alu);
            }
            detalle.setAlumno(null);
            detalle.setEditable(false);
            detalle.loadData();
            tabla.clearSelection();
            guardar.setEnabled(false);
            cancelar.setEnabled(false);
            
            model.updateModel();
            // Este método le dice al listener de la tabla que ha cambiado el valor
            model.fireTableDataChanged();
         } catch (DAOException | ParseException ex) {
            Logger.getLogger(ListaAlumnosFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quieres borrar este alumno?", 
                "Borrar alumno", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            try {
                Alumno alumno = getAlumnoSeleccionado();
                manager.getAlumnoDAO().eliminar(alumno);
                model.updateModel();
                model.fireTableDataChanged();
            } catch (DAOException ex) {
                Logger.getLogger(ListaAlumnosFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        DAOManager manager = new MySQLDaoManager("localhost", "root", "", "escuela");
         java.awt.EventQueue.invokeLater(() -> {
            try {
                new ListaAlumnosFrame(manager).setVisible(true);
            } catch (DAOException ex) {
                System.out.println("Error de SQL" + ex.toString());
             }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private com.arfonfo.escuela.frames.DetalleAlumnoPanel detalle;
    private javax.swing.JButton editar;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tabla;
    private javax.swing.JToolBar toolbar;
    // End of variables declaration//GEN-END:variables
}
