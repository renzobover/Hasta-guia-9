/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashMap;

/**
 *
 * @author Damian
 */
public class Producto {
    private HashMap<String, Double> mapaProductoAtributo;

    public Producto() {
    }

    public Producto(HashMap<String, Double> mapaProductoAtributo) {
        this.mapaProductoAtributo = mapaProductoAtributo;
    }

    public HashMap<String, Double> getMapaProductoAtributo() {
        return mapaProductoAtributo;
    }

    public void setMapaProductoAtributo(HashMap<String, Double> mapaProductoAtributo) {
        this.mapaProductoAtributo = mapaProductoAtributo;
    }

    @Override
    public String toString() {
        return "Producto{" + mapaProductoAtributo + "}";
    }
    
    
    
}
