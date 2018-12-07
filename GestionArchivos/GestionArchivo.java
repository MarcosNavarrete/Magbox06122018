/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;

import Datos.Cliente;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*; 


public class GestionArchivo {
    public void guardaArchivosCliente(Cliente cliente){
        try{
            File f = new File("Datos_Cliente.txt");
            FileWriter fw;
            BufferedWriter bw;
           
            if(f.exists()){
                 fw = new FileWriter(f,true);
                 bw = new BufferedWriter(fw);
                 bw.newLine();
                 bw.write(cliente.getRut()+";"+cliente.getNombre()+";"+cliente.getContacto());//escribir en el archivo
              
                
            }else {
                 fw = new FileWriter(f);
                 bw = new BufferedWriter(fw);
                 bw.write(cliente.getRut()+";"+cliente.getNombre()+";"+cliente.getContacto());
                
            }
            
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println("ERROR");
        }
   }
   public void mostrar() {
       try{
            File f = new File("Datos_Cliente.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                         String[] cont = linea.split(";");
                         Cliente cliente= new Cliente(cont[0],cont[1],cont[2]);
                         cliente.mostrarCliente();
                         System.out.println("--------------------------");     
                }
            }else {
                System.out.println("No hay pedidos existentes");
            }
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
}
