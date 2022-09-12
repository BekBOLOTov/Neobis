import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float t = scanner.nextFloat();
        int n = (int)(t * 100f);
        System.out.println("NOTAS:");
        System.out.println("" + (n / 10000) + " nota(s) de R$ 100.00");
        while(n >= 10000) {
            n -= 10000;
        }
        System.out.println("" + (n / 5000) + " nota(s) de R$ 50.00");
        while(n >= 5000) {
            n -= 5000;
        }
        System.out.println("" + (n / 2000) + " nota(s) de R$ 20.00");
        while(n >= 2000) {
            n -= 2000;
        }
        System.out.println("" + (n / 1000) + " nota(s) de R$ 10.00");
        while(n >= 1000) {
            n -= 1000;
        }
        System.out.println("" + (n / 500) + " nota(s) de R$ 5.00");
        while(n >= 500) {
            n -= 500;
        }
        System.out.println("" + (n / 200) + " nota(s) de R$ 2.00");
        while(n >= 200) {
            n -= 200;
        }
        System.out.println("MOEDAS:");
        System.out.println("" + (n / 100) + " moeda(s) de R$ 1.00");
        while(n >= 100) {
            n -= 100;
        }
        System.out.println("" + (n / 50) + " moeda(s) de R$ 0.50");
        while(n >= 50) {
            n -= 50;
        }
        System.out.println("" + (n / 25) + " moeda(s) de R$ 0.25");
        while(n >= 25) {
            n -= 25;
        }
        System.out.println("" + (n / 10) + " moeda(s) de R$ 0.10");
        while(n >= 10) {
            n -= 10;
        }
        System.out.println("" + n / 5 + " moeda(s) de R$ 0.05");
        while(n >= 5) {
            n -= 5;
        }
        System.out.println("" + n + " moeda(s) de R$ 0.01");
    }
}