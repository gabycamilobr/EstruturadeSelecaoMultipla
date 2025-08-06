/* programa em java para ler um valor inteiro. Se o valor for par imprimir uma mensagem informando e tbm impirimir o dobro do número. Se o valor forimpar imprimir uma msg e tbm o triplo do numero*/

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Valor --> ");
        valor = sc.nextInt();

        switch(valor % 2){
            case 0 -> {
                System.out.println("Par");
                System.out.println(2*valor);
            }
            case 1 -> {
                System.out.println("Impar");
                System.out.println(3*valor);
            }
        }
    }
}
