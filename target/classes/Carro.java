/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins.projetogc;

/**
 *
 * @author leide
 */
public class Carro {
    private String marca;
    private String cor;
    private String modelo;
    private double capcombustivel;
    private double consumocombustivel;
 
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String novamarca) {
        this.marca = novamarca;
    }
    
    public void setModelo(String novomodelo) {
        this.modelo = novomodelo;
    }
    
    public int comparaModelo(Carro c1, Carro c2){
        if(c1.modelo.equals(c2.modelo)){
            System.out.println("Ambos os carros são do modelo: "+c1.modelo);
            return 0;
        }else{
             System.out.println("Modelos difentes: um é do : " +c1.modelo+ "E outro do modelo :"+c2.modelo);
             return 1;
        }
    }
    public int comparaMarca(Carro c1, Carro c2){
        if(c1.marca.equals(c2.marca)){
            System.out.println("Ambos os carros são da marca: "+c1.marca);
            return 0;
        }else{
             System.out.println("Marcas difentes: um é da : " +c1.marca+ "E outro da : "+c2.marca);
             return 1;
        }
    }
     
}
