public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int check = x;
        int temp =0;
        while(x>0){
            temp = temp*10+(x%10);
            x=x/10;
        }
        if(check==temp) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(  isPalindrome(121));
    }
}
