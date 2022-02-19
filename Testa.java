
package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Testa {

 
    public static void main(String[] args) {
        // Vamos instanciar os objetos da classe Carro
        // Como cria um objeto
        //tipo_objeto nome-objeto = new tipo_objet0
        
        Carro obj1 = new Carro();
        obj1.modelo = JOptionPane.showInputDialog("Informe o modelo: ");
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade: "));
        int resp = JOptionPane.showConfirmDialog(null, "Criar carro com motor ligado:" );
        obj1.motor = (resp == JOptionPane.OK_OPTION);
       
        
        obj1.mostrar();
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(80);
        obj1.mostrar();
        obj1.frear(20);
        obj1.mostrar();
        obj1.desligar();
        obj1.mostrar();
        
        
        Carro obj2 = new Carro();
        obj2.ano = 2012;
        obj2.modelo = "Palio";
        obj2.motor = false;
      
        obj2.velocidade = 0;
    }
}
