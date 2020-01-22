package Conexion;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {

    static ResultSet rs;
    CallableStatement procedimiento;
    Conexion DB = new Conexion();

    public void cerrarconexion() {
        try {
            rs.close();
            procedimiento.close();
            DB.Conexion1().close();
        } catch (SQLException e) {
        }

    }

    //----------------------Pagina de Inicio------------------------------------------
    public CallableStatement sp_SelectConsultaAvis0sConcocatorias(int seleccion) throws SQLException {
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaAvisos (" + seleccion + ")}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        return procedimiento;
    }

///-----------------------Pagina de la Coordinacion Nacional------------------------
    public CallableStatement sp_SelectConsultaDirectorio(int area) throws SQLException {
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaDirectorio (" + area + ")}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        return procedimiento;
    }

    public CallableStatement sp_SelectConsultaCatalogoArea() throws SQLException {
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectCountCatalogoArea ()}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        return procedimiento;
    }
//------------------Pagina de Oferta Edicativa---------------------------

    public CallableStatement sp_SelectConsultaCatalogoPrograma() throws SQLException {
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaCatalogoPrograma ()}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        return procedimiento;
    }

    public CallableStatement sp_SelectConsultaOfertaEducativa(int programa) throws SQLException {
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaOfertaEducativa (" + programa + ")}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        return procedimiento;
    }
//------------------------Pagina de Colegios en los estados---------------------------

    public CallableStatement sp_SelectConsultaColegiosenlosEstados() throws SQLException {
        try {
            procedimiento = DB.Conexion1().prepareCall("{call sp_SelectConsultaColegiosenlosEstados ()}");
            rs = procedimiento.executeQuery();
        } catch (SQLException e) {
        }
        return procedimiento;
    }

}
