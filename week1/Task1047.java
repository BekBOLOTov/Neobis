import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt() * 60 + scanner.nextInt();
        b = scanner.nextInt() * 60 + scanner.nextInt();
        if(a < b) {
            System.out.println("O JOGO DUROU " + (b - a) / 60 + " HORA(S) E " + (b - a) % 60 + " MINUTO(S)");
        }
        else {
            System.out.println("O JOGO DUROU " + (1440 + b - a) / 60 + " HORA(S) E " + (1440 + b - a) % 60 + " MINUTO(S)");
        }
        
    }
 
}