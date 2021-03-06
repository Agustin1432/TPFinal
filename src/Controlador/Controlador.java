/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Clases.*;
import ClasesDAO.*;
import interDAO.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;


public class Controlador {
   FileInputStream entrada;
   FileOutputStream salida;
   File archivo;
   private final mysqllocadordao locadordao = new mysqllocadordao();
   private final mysqlinmuebledao inmuebledao = new mysqlinmuebledao();
   private final mysqllocatariodao locatariodao= new mysqllocatariodao();
   private final mysqlgarantedao garantedao= new mysqlgarantedao();
   private final mysqlserviciodao serviciodao= new mysqlserviciodao();
   private final mysqlcontratodao contratodao= new mysqlcontratodao();
   private final mysqlcronogramadao cronogramadao= new mysqlcronogramadao();

    public Controlador() {
    }

    public byte[]AbrirAImagen(File archivo ){
    byte[] bytesImg= new byte[1024*1000];
    try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
    }
    return bytesImg;
    }
    
    
    public void InsertarLocador(Locador a) {
		locadordao.insertar(a);
	}
    public Locador BuscarPorDni(double a){
        Locador lectura = locadordao.obtenerpordni(a);
        return lectura;
    }
    public void ActualizarLocador(Locador a) {
                locadordao.modificar(a);
	}
    public void EliminarLocador(Locador a) {
                locadordao.eliminar(a);
	}
    public Locador ObtenerLocador(Long a){
        Locador lectura = locadordao.obtener(a);
        return lectura;
    }
    
 
    
    public void InsertarLocatoria(Locatario g) {
		locatariodao.insertar(g);
    }
    public void ActualizarLocatoria(Locatario g) {
                locatariodao.modificar(g);
	}
    public void EliminarLocatoria(Locatario g) {
                locatariodao.eliminar(g);
	}
    public Locatario ObtenerLocatario(Long a){
        Locatario lectura = locatariodao.obtener(a);
        return lectura;
    }
   
    
    
    public void InsertarGarante(Garante g) {
		garantedao.insertar(g);
    }
    public void ActualizarGarante(Garante g) {
                garantedao.modificar(g);
    }
    public void EliminarGarante(Garante g) {
                garantedao.eliminar(g);
	}
    public Garante ObtenerGarante(Long a){
        Garante lectura = garantedao.obtener(a);
        return lectura;
    }
    
    
    public void InsertarInmueble(Inmueble g) {
		inmuebledao.insertar(g);
    }
    public void ActualizarInmueble(Inmueble g) {
                inmuebledao.modificar(g);
    }
    public void EliminarInmueble(Inmueble g) {
                inmuebledao.eliminar(g);
	}
    public List<Inmueble> ObtenerInmueble(String a){
        List <Inmueble> inmuebles =inmuebledao.obtener(a);
        return inmuebles;
    }
    
    public Inmueble ObtenerInmuebleID(Long a){
        Inmueble lectura = inmuebledao.obtener(a);
        return lectura;
    }

    public void InsertarServicio(Servicio g) {
		serviciodao.insertar(g);
    }
    public void ActualizarServicio(Servicio g) {
                serviciodao.modificar(g);
	}
    public void EliminarServicio(Servicio g) {
                serviciodao.eliminar(g);
	}
    public Servicio ObtenerServicio(Long a){
        Servicio lectura = serviciodao.obtener(a);
        return lectura;
    }
    
    public List <Servicio> obtenerTodosLosServicios(){
        List <Servicio> servicios =serviciodao.obtenerTodos();
        return servicios;
    }
    
    
    public void InsertarContrato(Contrato g) {
		contratodao.insertar(g);
    }
    public void ActualizarServicio(Contrato g) {
                contratodao.modificar(g);
	}
    public void EliminarContrato(Contrato g) {
                contratodao.eliminar(g);
	}
    public Contrato ObtenerContrato(Long a){
        Contrato lectura = contratodao.obtener(a);
        return lectura;
    }
    

    public void InsertarCronograma(Cronograma a) {
		cronogramadao.insertar(a);
	}
}
