public class Palindrome {

    public static boolean isPalindrome(String str){
        int len = str.length();
        int r=0;

        for(int i=0;i<len;i++){
            r= len-i-1;
            if(str.charAt(i)!=str.charAt(r))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("AAAqA"));
    }
}
//NAMAN
