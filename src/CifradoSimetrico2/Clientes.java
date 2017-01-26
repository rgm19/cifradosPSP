/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CifradoSimetrico2;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author ruben
 */
public class Clientes {
     private int id_cli;
    private String nombre;
    private BufferedReader entrada;
    private PrintWriter salida;
    private String pass;
    
      public Clientes(String n, int i, BufferedReader a, PrintWriter b, String pass){
      nombre=n;
      id_cli=i;
      entrada=a;
      salida=b;
      this.pass=pass;
   }
    
    Clientes(int id_cli, String nombre){
        this.id_cli=id_cli;
        this.nombre=nombre;
    }
    //--------------------------------------------------------------------------

    /**
     * @return the id_cli
     */
    public int getId_cli() {
        return id_cli;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the entrada
     */
    public BufferedReader getEntrada() {
        return entrada;
    }

    /**
     * @return the salida
     */
    public PrintWriter getSalida() {
        return salida;
    }
    //--------------------------------------------------------------------------

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(BufferedReader entrada) {
        this.entrada = entrada;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(PrintWriter salida) {
        this.salida = salida;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
