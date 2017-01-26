package CifradoSimetrico2;

import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author ruben las pruebas del GITHUB
 */
public class Principal {
    static int puerto=15000, max=5;
    public static void main(String[]args){
        int clientes=1;
       ArrayList<Clientes> usuarios = new ArrayList<Clientes>();
        
        try(ServerSocket servidor = new ServerSocket(puerto,max);){
            System.out.println("Servidor esperando clientes..."); 
            
           while(true){ 
            HiloCifradoServidor hser = new HiloCifradoServidor(servidor.accept(),clientes, usuarios);
            Thread hilo1 = new Thread(hser);
            hilo1.setName("Conexion de cliente: "+clientes);
            hilo1.start();
            clientes++;
           }
            
        }catch(Exception e){
           System.err.println(" Error al INICIALIZAR servidor, mensaje de error: " + e.getMessage());
        }
    }
}
