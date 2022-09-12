import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = (scanner.nextDouble());
        double b = (scanner.nextDouble());
        double c = (scanner.nextDouble());
        double tmp;

        if(a <= b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        
        if(a <= c) {
            tmp = a;
            a = c;
            c = tmp;
        }
        
        if(b <= c) {
            tmp = b;
            b = c;
            c = tmp;
        }
        if(a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }
        if(a * a == b * b + c * c) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if(a * a > b * b + c * c) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if(a == b || b == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}