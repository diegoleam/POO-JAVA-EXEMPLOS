

package projeto.fabricadecarro;

import java.util.Scanner;
public class Fabricadecarro {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("DIGITE A COR DO CARRO");
        String cor = scanner.nextLine();
        
        System.out.println("DIGITE O MODELO DO CARRO");
        String modelo = scanner.nextLine();
        
        System.out.println("DIGITE O MODELO DO CARRO");
        int ano = scanner.nextInt();
        
        
        Carro carro1 = new Carro(cor,modelo,ano);
       
         

        // Exibindo as informações do carro
        carro1.info();
        carro1.vistoria();
        
        
    }
}
