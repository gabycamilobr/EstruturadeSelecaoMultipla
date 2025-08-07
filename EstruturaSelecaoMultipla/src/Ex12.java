import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDeProdutos,opcao;
        double preco, totalDaCompra = 0;

        System.out.println("Qual o total de produtos?");
        totalDeProdutos = sc.nextInt();

        for(int cont = 1; cont <= totalDeProdutos; cont++){
            System.out.print("Preço do produto" +cont+ "--> R$ ");
            preco = sc.nextDouble();
            totalDaCompra = totalDaCompra + preco;
        }
        System.out.println();
        System.out.println("Total da compra --> R$ " + totalDaCompra);
        System.out.println("Digite 1 para pagamento à vista ou 2 para parcelado --> ");
        opcao = sc.nextInt();
        switch (opcao){
            case 1 -> totalDaCompra = totalDaCompra * 0.90;
            case 2 -> totalDaCompra = totalDaCompra * 1.155;
        }
        System.out.println("Valor total a pagar --> R$ " + totalDaCompra);

    }
}
