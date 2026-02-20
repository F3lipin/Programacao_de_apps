
import java.util.Scanner;

//2.Ler 4 números inteiros (usando vetor) e calcular a soma dos que forem par, trate os
//possíveis erros.
 public static void main(String args []) {
    int [] vetor = new int [4];
    Scanner sc = new Scanner(System.in);
     int i = 0;
     int soma = 0;
    while(i<4){
       
        int valor = 0;
        System.out.println("Digite o Valor "+i);
    try{
        valor = sc.nextInt();
        vetor[i] = valor;
        if(vetor[i] % 2 == 0){
        soma += vetor[i];
        
        }i++;
       
    } catch (Exception e) {
        System.out.println("Digite um número");
        sc.next();
    }
}
System.out.println("Soma: "+ soma);
}
