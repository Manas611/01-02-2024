public class DistinctSubstring {
    public static void main(String[] args) {
        String s = "xxxyyz";
        int n = s.length();

        int[] arr = new int[26];

        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i) - 'a']++;
        }

        int cnt = 0;

        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
                cnt = cnt + (arr[i]-1); 
        }

        System.out.println(cnt);
    }
}
