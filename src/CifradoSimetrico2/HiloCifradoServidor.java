/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CifradoSimetrico2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class HiloCifradoServidor implements Runnable{
    
    private Socket miCon;
    private int id_cli;
    private String pass_cli;
    private Clientes cli;
    private BufferedReader IN;
    private PrintWriter OUT;
    private ArrayList<Clientes> listaUsuarios;
    boolean bandera=true;
    MessageDigest md = null;
    
    
    
    HiloCifradoServidor(Socket miCon, int id_cli, ArrayList<Clientes> c){
        this.miCon=miCon;
        this.id_cli=id_cli;
        listaUsuarios=c;

    }
    
    
    
   //--------------------------------------------------------------------------- 
    @Override
    public void run(){
        String cad="";
        
       
        try(
                
                BufferedReader in=new BufferedReader(new InputStreamReader(miCon.getInputStream()));
                PrintWriter out = new PrintWriter(miCon.getOutputStream(), true);
                
            ){
                IN=in;
                OUT=out;
            
                OUT.println(">Conectado al Servidor, id_cli=" + id_cli + ", \"quit\" o \"exit\" para salir");
                while(bandera){
                    cad=IN.readLine();
                    //mostrar(cad, id_cli);
                    //cifrarMensaje(cad);
                    System.out.println("[cli (" + id_cli + ")]>" + cad);
                    if(cad.trim().equalsIgnoreCase("quit")||cad.trim().equalsIgnoreCase("exit")){break;}
                }
        
        }catch(IOException e){
            System.err.println(">Error al inicializar Cliente id=" + id_cli + ", mensaje: " + e.getMessage());
            listaUsuarios.remove(cli);
        }catch(NullPointerException ex){
            System.err.println("Se cerro la CONEXION del cliente: " + id_cli + ", inesperadamente");
            listaUsuarios.remove(cli);
        }finally{
            if(bandera){
            System.out.println("Se cerro la CONEXION del cliente: " + id_cli );
            listaUsuarios.remove(cli);
            }
        }
    
    }
//------------------------------------------------------------------------------

    String generarPass(){
        String p="";
        int vuelta=0;
        
        while(vuelta<=10){
                //1ºvuelta simbolo
                
                //2ºvuelta numero
                
                //3º numeros restantes
        }

        
        return  p;  
    }
//------------------------------------------------------------------------------
public void generarCliente(){
        String nombre="Cliente["+id_cli+"]", pass;      
        pass = generarPass();
        cli= new Clientes(nombre, id_cli, IN, OUT, pass);
        listaUsuarios.add(cli);
    }    
    
}
