/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo_Java;

import Conexion.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CECYTE
 */
public class Modelo_ConsultaColegioenlosEstados {
 
    Consultas m = new Consultas();
     ResultSet rs;

    private String director;
    private String estado;
    private String direccion;
    private String telefono;
    
    public Modelo_ConsultaColegioenlosEstados() { }
    public Modelo_ConsultaColegioenlosEstados(String estado, String director, String direccion, String telefono) {
        this.estado = estado;
        this.director = director;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getDirector() {
        return this.director;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }
    
    public ArrayList<Modelo_ConsultaColegioenlosEstados> getSelectConsultaColegiosenlosEstados() throws SQLException {
        ArrayList<Modelo_ConsultaColegioenlosEstados> getColegios = new ArrayList<>();
        try {
            rs = m.sp_SelectConsultaColegiosenlosEstados().executeQuery();
            while (rs.next()) {getColegios.add(new Modelo_ConsultaColegioenlosEstados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));}
        } catch (SQLException e) {
        } finally {
            m.cerrarconexion();
        }
        return getColegios;
    }
    
    
    
}
