/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Encapsulamiento.Area;
import Interface.InterfaceDaoArea;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RICHAR
 */
public class DaoArea implements InterfaceDaoArea {

    @Override
    public boolean insert(Area area, Connection conexion) throws Exception {
        Statement statement;
        statement = conexion.createStatement();
        String query = "insert into area(area_nombre,area_descripcion) values('" + area.getArea_nombre() + "','" + area.getArea_descripcion() + "');";
        statement.execute(query);
        statement.close();
        return true;
    }

    @Override
    public Area getByIdArea(String idArea, Connection conexion) throws Exception {
        Area area = null;

        Statement statement;
        ResultSet resultset;
        String query = "select * from area where area_id='" + idArea + "'";

        statement = conexion.createStatement();
        resultset = statement.executeQuery(query);

        if (resultset.next()) {

            area = new Area();
            area.setArea_id(resultset.getInt("area_id"));
            area.setArea_nombre(resultset.getString("area_nombre"));
            area.setArea_descripcion(resultset.getString("area_descripcion"));
        }
        resultset.close();
        statement.close();

        return area;
    }

    @Override
    public List<Area> getAll(Connection conexion) throws Exception {
        List<Area> listaArea = new ArrayList<Area>();

        Statement statement;
        ResultSet resultset;
        String query = "select * from area";

        statement = conexion.createStatement();
        resultset = statement.executeQuery(query);

        Area area;
        while (resultset.next()) {

            area = new Area();
            area.setArea_id(resultset.getInt("area_id"));
            area.setArea_nombre(resultset.getString("area_nombre"));
            area.setArea_descripcion(resultset.getString("area_descripcion"));

            listaArea.add(area);
        }
        resultset.close();
        statement.close();

        return listaArea;
    }

    @Override
    public boolean update(Area area, Connection conexion) throws Exception {
        Statement statement;
        String query = "update area set area_nombre='" + area.getArea_nombre() + "',area_descripcion='" + area.getArea_descripcion() + "' where area_id='" + area.getArea_id() + "';";
        statement = conexion.createStatement();
        statement.execute(query);
        statement.close();
        return true;
    }

    @Override
    public boolean delete(String idArea, Connection conexion) throws Exception {
        Statement statement;
        String query = "delete from area where area_id='" + idArea + "'";
        statement = conexion.createStatement();
        statement.execute(query);
        statement.close();
        return true;
    }

}
