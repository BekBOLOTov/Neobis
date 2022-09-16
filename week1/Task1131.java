import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i = 0, g = 0, d = 0, c = 0;
        while(true) {
            c++;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a > b) i++;
            if(a < b) g++;
            if(a == b) d++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            int t = scanner.nextInt();
            if(t != 1)
            break;
        }
        System.out.println("" + c + " grenais");
        System.out.println("Inter:" + i);
        System.out.println("Gremio:" + g);
        System.out.println("Empates:" + d);
        if(i == g) {
            System.out.println("Não houve vencedor");
        }
        if(i > g) {
            System.out.println("Inter venceu mais");
        }
        if(i < g) {
            System.out.println("Gremio venceu mais");
        }
    }
 
}