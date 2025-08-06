import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.println("Valor inteiro e positivo --> ");
        valor = sc.nextInt();
        if(valor <= 0){
            System.out.println("O valor deve ser inteiro e positivo");
        }
        else {
            for(int cont = 1; cont <= valor; cont++){
               if (valor % cont == 0){
                   System.out.println(cont + " ");
               }
            }
        }
    }
}
