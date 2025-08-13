import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double y = 0;
        int n;

        System.out.print("Valor de n --> ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                y = y - (double)1 / i;
            }
            else{
                y = y + (double)1 / i;
            }
        }
        System.out.println("O valor é: "+y);

    }
}
