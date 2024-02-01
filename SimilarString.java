public class SimilarString {
    public static void main(String[] args) {
        String A = "aabbbb";
        String B = "bbaabb";

        int n = A.length();
        int m = B.length();

        if(n!=m)
        {
            System.out.println("No");
        }

        String A1 = A.substring(0, n/2);
        String A2 = A.substring(n/2, n);
        
        String B1 = B.substring(0, m/2);
        String B2 = B.substring(m/2, m);

        System.out.println(A1 + " " + A2 +" "+B1+" "+B2);

        if((A1.equals(B1) || A1.equals(B2)) && (A2.equals(B1) || A2.equals(B2)))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        // System.out.println(B2);

    }
}
