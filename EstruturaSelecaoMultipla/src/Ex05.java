/* programa em java para ler um valor inteiro. Se o valor for par imprimir uma mensagem informando e tbm impirimir o dobro do número. Se o valor forimpar imprimir uma msg e tbm o triplo do numero*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, resultado;

        System.out.print("Valor --> ");
        valor = sc.nextInt();

        resultado = switch(valor % 2) {
            case 0 -> {
                System.out.println("Par");
                yield 2*valor;

            }
            default -> {
                System.out.println("Impar");
                yield 3 * valor;
            }
        };

    }
}
