/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author RICHAR
 */
public class Area {
    
    private int area_id;
    private String area_nombre;
    private String area_descripcion;
    
    public Area(){}

    public Area(int area_id, String area_nombre, String area_descripcion) {
        this.area_id = area_id;
        this.area_nombre = area_nombre;
        this.area_descripcion = area_descripcion;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getArea_nombre() {
        return area_nombre;
    }

    public void setArea_nombre(String area_nombre) {
        this.area_nombre = area_nombre;
    }

    public String getArea_descripcion() {
        return area_descripcion;
    }

    public void setArea_descripcion(String area_descripcion) {
        this.area_descripcion = area_descripcion;
    }
    
}
