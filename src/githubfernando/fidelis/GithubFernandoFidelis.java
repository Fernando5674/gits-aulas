/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubfernando.fidelis;

/**
 *
 * @author IFSC
 */
public class GithubFernandoFidelis {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
 /*   
 Scanner leia = new Scanner(System.in);
 String.out.println("Entre com seu nome");
 String nome = leia.nextLine();
 System.out.println(nome+"bem vindo ao GitHub");
 */ 
 String nome = JOptionPane.showInputDialog(null,"digite seu nome: ");
 JOptionPane.showMessageDialog
         (null, nome+"seja bem vindo ao GitHub");
 System.exit(0);
 
  

 
        
    }
    
}
