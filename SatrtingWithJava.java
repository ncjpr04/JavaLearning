
import java.util.*;

// public class SatrtingWithJava {
//     public static void main(String[] args) {
//       System.out.print("Hello World");
//       System.out.println("Hello World");
//       System.out.println("Hello World\n");
//     }
// }
public class SatrtingWithJava {

    public static void main(String[] args) {
        // int a = 25;
        // int b = 10;
        // int sum = a + b;
        // int diff = a - b;
        // int mul = a*b;
        // System.out.println("sum:" + sum);
        // System.out.println("diff:" + diff);
        // System.out.println("mul:" + mul);
        System.out.println("enter age");
        try (Scanner sc = new Scanner(System.in)) {
            // int String = sc.nextInt();
            int first= sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            int sum = first + second + third;
            System.out.println(sum);
        }
    }
}
