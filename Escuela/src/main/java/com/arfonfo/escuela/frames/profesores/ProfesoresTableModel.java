
package com.arfonfo.escuela.frames.profesores;

import com.arfonfo.dao.mysql.DAOException;
import com.arfonfo.escuela.Profesor;
import com.arfonfo.escuela.dao.ProfesorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alfon
 */
public class ProfesoresTableModel extends AbstractTableModel{

    private ProfesorDAO dao;
    
    private List<Profesor> profesores = new ArrayList<>();
    
    public ProfesoresTableModel(ProfesorDAO dao){
        this.dao = dao;
    }
    
    
    public void updateModel() throws DAOException{
        profesores = dao.obtenerTodos();
    }
    
    @Override
    public int getRowCount() {
        return profesores.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Profesor prof = profesores.get(rowIndex);
        switch(columnIndex){
            case 0 : return prof.getId();
            case 1 : return prof.getApellidos();
            case 2 : return prof.getNombre();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID";
            case 1: return "Apellidos";
            case 2: return "Nombre";
            default: return null;
        }
    }
    
    
    
}
