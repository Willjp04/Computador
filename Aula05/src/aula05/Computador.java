/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author PORTOMASTER
 */
public class Computador {
    public String marca;
    public String processador;
    public String perifericos;
    int memoria;
    String SO;
    boolean ligado;
    public void status() {
        System.out.println("Marca " + this.marca);
        System.out.println("Processador " + this.processador);
        System.out.println("Perifericos " + this.perifericos);
        System.out.println("SO " + this.SO);
       
       }
    public void ligado(){
        this.ligado = true;
       }
    public void desligado(){
        this.ligado = false;
        
    }
    public void ligar(){
        if (this.ligado == true) {
        System.out.println("O COMPUTADOR ESTÁ LIGADO");
    } else {
            System.out.println("O COMPUTADOR ESTÁ DESLIGADO");
        }
    
}
    
   
    
    
}
