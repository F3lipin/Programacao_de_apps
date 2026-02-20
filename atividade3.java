import java.util.Scanner;

//3.Faça um algoritmo que leia 2 valores numéricos e um símbolo. Caso o símbolo seja um dos
//relacionados abaixo efetue a operação correspondente com os valores.
//a. “+” operação de soma
//b. “-” operação de subtração
//c. “*” operação de multiplicação
//d. “/” operação de divisão
//e. “**” exponencial

//se o denominador for zero,informara o usuário que a divisãonãopodeserfeita.Seosímbolofordiferentedesse
//cita dos acima,escreva“Impossível realizaraoperação”.Parasairdoprogramadeveserdigitadoapalavra“EXIT”.
 /**
 * @param args
 */
public static void main(String args []) {
 Scanner sc = new Scanner(System.in);
 double valor1 = 0;
 double valor2 = 0;

 String op = "";

 System.out.println("Informe o Primeiro Valor: ");
    valor1 = sc.nextInt();
 System.out.println("Informe o Segundo Valor: ");
    valor2 = sc.nextInt();



 System.out.println("Selecione a operação: (+; -; *; /; **) ");
    op = sc.next();
    switch(op){
        case "+":
            System.out.println("Soma: "+(valor1 + valor2));
            break;
        case "-":
            System.out.println("Subtração: "+(valor1-valor2));
            break;
        case "*":
            System.out.println("Multiplicação: "+(valor1*valor2));
            break;
            case "/":
                if(valor2 != 0){
                 System.out.println("Divisão: "+(valor1/valor2));
                }
                if(valor2 == 0){
                    System.out.println("Divisão impossível");   
                } 
                break;   
        case "**":
            System.out.println("Potenciação: "+Math.pow(valor1, valor2));
                break;
        default:
            System.out.println("Impossível realizar operação!");
                break;                    
        case "EXIT":
            System.out.println("Saindo...");
            return;
        }

 
 
 
}
 
