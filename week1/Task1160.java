import java.util.*;
import java.lang.Math.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0) {
            t--;
            int a, b;
            double c, d;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextDouble();
            d = scanner.nextDouble();
            c += 100;
            d += 100;
            c /= 100;
            d /= 100;
            int counter = 0;
            while(a <= b) {
                if(counter > 105) break;
                a = (int)Math.floor((double)a * c);
                b = (int)Math.floor((double)b * d);
                counter++;
            }
            if(counter > 100) {
                System.out.println("Mais de 1 seculo.");
            }
            else {
                System.out.println("" + counter + " anos.");
            }
        }
    }
 
}