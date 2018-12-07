/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author WINDOWS 10
 */
public class Usuario {
    private String nombre = "MAG";
	private String clave = "123";
	
        public Usuario(){
        nombre = "MAG";
        clave = "123";
        
}
        public void ingresarNombre(String nombre){
           while(nombre != this.nombre){
                System.out.println("nombre mal ingresado");
                Main main = new Main();
                main.ingresar();
            }
            
        }
            public void ingresarContraseña( String contra){
                if(contra != this.clave){
                    System.out.println("clave mal ingresada");
                Main main = new Main();
                main.ingresar();
                }else{                
                }
            }
}
