/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Guilherme Muniz
 */
 import javax.swing.JOptionPane;
import main.Pessoa;


public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        Pessoa pessoa = new Pessoa();
      
        
        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa:"));
        
        pessoa.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf da pessoa:")));
        
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa ")));
        
        pessoa.setRg(Integer.parseInt(JOptionPane.showInputDialog("Informe o rg da pessoa:")));
        
        
        
        
        JOptionPane.showMessageDialog(null, "Seu nome eh : " + pessoa.getNome()+"\n"
                                             +"Seu cpf eh : " + pessoa.getCpf() + "\n"
                                             + "Sua idade eh :"+ pessoa.getIdade() + "\n"
                                             + "Seu rg eh: "+ pessoa.getRg()   );
     
    }
    
}
