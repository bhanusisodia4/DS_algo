public class SumDigits {
    /**
     *
     Given a non-negative int n, return the sum of its digits recursively (no loops).
     Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

     sumDigits(126) → 9
     sumDigits(49) → 13
     sumDigits(12) → 3
     */

    public static int sumDigits(int n){
        if(n<10) return n;
        int sum;
        sum = n%10;
        return sum +sumDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println("the sum of digit is:"+sumDigits(126));
    }
}
