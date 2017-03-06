/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Encapsulamiento.Area;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author RICHAR
 */
public interface InterfaceDaoArea {
    
    public boolean insert(Area area,Connection conexion)throws Exception;
    public Area getByIdArea(String idArea,Connection conexion)throws Exception;
    public List<Area> getAll(Connection conexion)throws Exception;
    public boolean update(Area area,Connection conexion)throws Exception;
    public boolean delete(String idArea,Connection conexion)throws Exception;    
}
