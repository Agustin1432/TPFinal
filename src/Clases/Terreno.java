/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class Terreno extends Inmueble {

    public Terreno(String localidad, String direccion, String tamanio, ArrayList<Locador> locador) {
        super(localidad, direccion, tamanio, locador);
    }

    public Terreno() {
    }
    
    
}
