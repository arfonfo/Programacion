
package com.arfonfo.escuela.frames.asignaturas;

import com.arfonfo.dao.mysql.DAOException;
import com.arfonfo.escuela.Asignatura;
import com.arfonfo.escuela.dao.AsignaturaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AsignaturasTableModel extends AbstractTableModel{
    
    private AsignaturaDAO dao;
    private List<Asignatura> asignaturas;
    
    public AsignaturasTableModel(AsignaturaDAO dao){
        this.dao = dao;
        this.asignaturas = new ArrayList<>();
    }
    
    public void update() throws DAOException{
        asignaturas = dao.obtenerTodos();
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0){
            return "Identificador";
        } else {
            return "Nombre de la asignatura";
        }
    }

    @Override
    public int getRowCount() {
        return this.asignaturas.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Asignatura a = asignaturas.get(rowIndex);
        if(columnIndex == 0){
            return a.getId();
        } else {
            return a.getNombre();
        }
    }
    
}
