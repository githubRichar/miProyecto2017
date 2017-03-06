/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import Dao.DaoArea;
import javax.ejb.Stateless;
import Encapsulamiento.Area;
import PaqueteConexion.jdbcConexion;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author RICHAR
 */
@Stateless
public class EjbArea {

    private Area area;
    List<Area> listaArea;
    private Connection conexion;
    private final DaoArea daoArea;

    public EjbArea() {
        area = new Area();
        daoArea = new DaoArea();
    }

    public boolean insert() {
        boolean valorRetorno;
        try {
            conexion = jdbcConexion.conexion();
            valorRetorno = daoArea.insert(area, conexion);
            conexion.close();
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return valorRetorno;
    }

    public boolean listarArea() {
        boolean valorRetorno;
        try {
            conexion = jdbcConexion.conexion();
            listaArea = daoArea.getAll(conexion);
            conexion.close();
            valorRetorno = true;
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return valorRetorno;
    }

    public boolean leerPorIdArea(String idArea) {
        boolean valorRetorno;
        try {
            conexion = jdbcConexion.conexion();
            area = daoArea.getByIdArea(idArea, conexion);
            conexion.close();
            valorRetorno = true;
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return valorRetorno;
    }
    
    public boolean actualizarArea(){
     boolean valorRetorno;
        try {
            conexion = jdbcConexion.conexion();
            daoArea.update(area, conexion);
            conexion.close();
            valorRetorno = true;
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return valorRetorno;
    }

    public boolean borrarArea(String idArea){
     boolean valorRetorno;
        try {
            conexion = jdbcConexion.conexion();
            daoArea.delete(idArea, conexion);
            conexion.close();
            valorRetorno = true;
        } catch (Exception ex) {
            valorRetorno = false;
        }
        return valorRetorno;
    }
    
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Area> getListaArea() {
        return listaArea;
    }

    public void setListaArea(List<Area> listaArea) {
        this.listaArea = listaArea;
    }

}
