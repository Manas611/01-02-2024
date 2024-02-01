import java.util.*;

public class TotalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 1;

        // 1B or 1C
        c = c + 2*n;

        // 2C
        c = c + (n)*(n-1)/2;

        // 1B and 1C
        c = c + n*(n-1);

        // 2C and B
        c = c + ((n)*(n-1)*(n-2))/2;

        System.out.println(c);
    }
}
