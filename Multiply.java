public class Multiply {
    public static void main(String[] args) {

    String num1 = "129";
    String num2 = "344";

    int n = num1.length();
    int m = num2.length();

    int n_i1 = 0, m_i2 = 0;

    int[] res = new int[n+m];

    for(int i=n-1;i>=0;i--)
    {
        int n1 = num1.charAt(i)-'0';
        int carry = 0;
        m_i2 = 0;

        for(int j=m-1;j>=0;j--)
        {
            int m2 = num2.charAt(j) - '0';
            int sum = n1*m2 + res[n_i1 + m_i2] + carry;

            carry = sum/10;
            res[n_i1 + m_i2] = sum%10;
            m_i2++;
        }
        if (carry > 0)
            res[n_i1 + m_i2] += carry;
        n_i1++;
    }

    // String st = "";
    int i = res.length-1;
    while(i>=0 && res[i] == 0)
        i--;

    String s = "";
     
    while (i >= 0)
        s += (res[i--]);
    System.out.println(s);




    }
}
