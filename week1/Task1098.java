import java.util.*;
import java.lang.Math.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i <= 20; i += 2) {
            for(int j = 1; j <= 3; j++) {
                if(i % 10 == 0) {
                    System.out.println("I=" + (i / 10) + " J=" + (i / 10 + j));
                }
                else {
                    System.out.println("I=" + (i / 10.0) + " J=" + (i / 10.0 + j));
                }
            }
        }
    }
 
}