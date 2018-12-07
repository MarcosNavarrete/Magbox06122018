/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Cotizacion {
    private String fecha;
	private String descripcion;
	private Servicio servicio;
	private Cliente cliente;
        
        
        public Cotizacion(String rut, String nombre, String contacto){
        Scanner sc = new Scanner(System.in);
            System.out.println("ingrese descripcion de la cotizacion"); // ESTO SE TIENE QUE MODIFICAR PORQUE QUEDO FEO
        descripcion = sc.nextLine() + "rut :" + rut + "nombre :" + nombre + "contacto :" + contacto;
        pedirServicio(); 
        }
       
        public void pedirServicio(){
            Validar val = new Validar();
            System.out.println("ingrese tipo servicio");
           System.out.println("1 : Mantencion"); 
           System.out.println("2 : Reparacion");
           System.out.println("3 : Venta de producto");
           int eleccion = 0;
            do{
            eleccion= val.validacion();
            }while(eleccion>3 || eleccion < 1);
            servicios(eleccion);
        } // menu que muestra los tipos de servicios disponibles
        
        public void servicios(int eleccion){
        if(eleccion == 1){
            this.servicio = servicio.MANTENCION;
        }else if(eleccion == 2){
            this.servicio = servicio.REPARACION;
        }else{
            this.servicio = servicio.PRODUCTO; 
        }
        } // metodo para definir el tipo de servicio
	
        public void setFecha(String fecha) { 
		this.fecha = fecha;
	}
}
