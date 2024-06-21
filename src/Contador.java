

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        
        Scanner terminal = new Scanner(System.in);

        System.out.println(("\nDigite o primeiro parâmetro: "));
        int paramentoUm = terminal.nextInt();

        System.out.println("\nDigite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        
        try{
            contar (paramentoUm,parametroDois);
        } 
        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } 
         
    }   
    

    static void contar (int paramentoUm, int parametroDois) throws ParametrosInvalidosException {
        
        if(paramentoUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        //int contagem = paramentoUm - parametroDois;
        for(int i=paramentoUm; i<=parametroDois; i++){
            System.out.println("Imprimindo o numero "+i);
        }
    }
   
}
class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String message){super(message);}
}

