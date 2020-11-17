/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jenkins.projetogc.Carro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leide
 */
public class TesteCarro { 
        public TesteCarro(){
            
        }
      
     @Test
     public void ComparaCarros_Sucesso(){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro instance = new Carro();
        carro1.setMarca("Renault");
        carro1.setModelo("Duster");
        carro2.setMarca("Renault");
        carro2.setModelo("Duster");

        assertEquals(0,instance.comparaModelo(carro1,carro2)); //0 para verdadeiro
     }
     
     @Test
     public void ComparaCarros_Falha(){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro instance = new Carro();
        carro1.setMarca("Renault");
        carro1.setModelo("Duster");
        carro2.setMarca("Renault");
        carro2.setModelo("Captur");

        assertEquals(1,instance.comparaModelo(carro1,carro2)); //1 para falso
     }
}
