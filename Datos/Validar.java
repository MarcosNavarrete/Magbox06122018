/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Validar {
    public boolean validarTexto(String texto) {
		boolean validacion = false;
        try {
            if(texto.matches("^[A-zZ-a]$")){ // exprecion regular para validar textos 
            validacion = true;
         }
        }catch (java.lang.NumberFormatException e){
        }catch (Exception e){
        }
        return validacion;
	}

	public boolean validarNombre(String nombre) {
		  boolean validacion = false;
                    try {
                        if (nombre.matches("^[A-Z]{1}[a-z]*$")){   // exprecion regular para validar nombre
                            validacion = true;
                        }
                    }catch(java.lang.NumberFormatException e) {
                    }catch (Exception e){
                    }
                    return validacion; 
	}
        
        public boolean validarContacto(String contacto) {
		  boolean validacion = false;
                    try {
                        if (contacto.matches("^[9]{1}[0-9]{8}$")){   // exprecion regular para validar nombre
                            validacion = true;
                        }
                    }catch(java.lang.NumberFormatException e) {
                    }catch (Exception e){
                    }
                    return validacion; 
	}
        public   boolean validarRut (String rut ) {
        boolean validacion = false;

        try {
            if(rut.matches("^[0-9]{1,2}.[0-9]{3}.[0-9]{3}-(k|[0-9]{1})$")){ // exprecion regular para validar el rut 
                validacion = true;
            }
        }catch(java.lang.NumberFormatException e){
        }catch (Exception e){
        }
       return validacion; 
}
        
        public int validacion(){
        int dato=0;
        boolean error;
        do{
            try{
               error = false;
               Scanner teclado = new Scanner(System.in);
               dato = teclado.nextInt(); 
            }catch(InputMismatchException e){
               System.out.println("Numero ingresado no es valido, intente nuevamente ");  
               error = true;
               
            }
        }while(error);
        return dato;     
        }     
    
}
