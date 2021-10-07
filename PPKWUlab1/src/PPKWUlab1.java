
import java.util.Scanner;


public class PPKWUlab1 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Wprowadz ciąg znaków do odwrócenia:");
        String str = scaner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb.toString());
    }
    
}
