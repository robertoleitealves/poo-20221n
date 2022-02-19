package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Carro {
    //declaração de variáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor;
    
    
    //métodos construtores
    
    Carro(){
        
    }
    
    Carro(String md, int an, float ve, boolean mt){
        modelo = md;
        ano = an;
        velocidade = ve;
        motor = mt;
        
    }
    
    // métodos
    void ligar(){
        motor = true;
    }
    
    void desligar(){
        motor = false;
    }
    
    void acelerar(float x){
        velocidade += x;
    }
    
    void frear(float x){
        velocidade -= x;
    }
   
    
    
    void mostrar(){
        JOptionPane.showMessageDialog(null, "Modelo: "+ modelo +    
                            " Ano: " + ano + " Velocidade: " + velocidade +
                            " Motor: " + motor);
    }

   
}
    

