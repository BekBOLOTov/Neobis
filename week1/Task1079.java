import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        int a, b, c;
        int n;
        n = scanner.nextInt();
        while(n > 0) {
            n--;
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            z = scanner.nextDouble();
            a = (int)(x * 20);
            b = (int)(y * 30);
            c = (int)(z * 50);
            System.out.println((Math.round((a + b + c) / 10.0)) / 10.0);
        }
    }
 
}