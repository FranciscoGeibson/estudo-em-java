/*  a += b; mesma coisa que   a = a + b;
    a -= b; mesma coisa que   a = a - b;
    a *= b; mesma coisa que   a = a * b;
    a /= b; mesma coisa que   a = a / b;
    a %= b; mesma coisa que   a = a % b; 
    */
import java.util.Scanner;
public class operadorDeAtribuicao {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int minutos = sc.nextInt();

    double conta = 50.0;
    if (minutos > 100){
        conta += (minutos - 100) * 2.0;
        //conta = conta + (minutos - 100) * 2.0;
        
    }
    System.out.printf("valor da conta = R$ %.2f%n", conta);
    sc.close();
}
}
