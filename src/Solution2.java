public class Solution2 {
    public static String longestPalindrome(String s) {
        int len = s.length();
        String result = "";
        for(int i = 0 ;i < len  ; i++){
            String tmp1 = findPalindrome(s,i,i);
            if(tmp1.length() > result.length()){
                System.out.println(i);
                System.out.println(tmp1);
                result = tmp1;
            }


            tmp1 = findPalindrome(s,i,i+1);
            if(tmp1.length() > result.length()){
                System.out.println(tmp1);
                result = tmp1;
            }

        }


        return result;
    }
    public static boolean isPalindrome(String s){
        int len = s. length();
        int start = 0;
        int end = len -1;
        while(start <= len / 2){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static String findPalindrome(String s,int low,int high){


        while(low >= 0 && high <= s.length()-1 && s.charAt(low ) == s.charAt(high)){
               if(low == 0 || high == s.length()-1){
                   return s.substring(low ,high + 1);
               }
               low --;
               high ++;
        }

        return s.substring(low + 1,high);



    }
    public static void main(String[] Args){
        String s = "abbbabbbaabcbaaa";

        System.out.println(s.substring(0,2));

System.out.print(longestPalindrome(s));
    }
}
