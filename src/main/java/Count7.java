public class Count7 {
    /**
     *
     Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     so for example 717 yields 2. (no loops).
     Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

     count7(717) → 2
     count7(7) → 1
     count7(123) → 0
     */
    public static int count7(int n){
        if(n==0) return n;
        int target,count = 0;
        target = n % 10;
        if(target==7) {
            count++;
            return count + count7(n / 10);
        }
        return count7(n/10);
    }

    public static void main(String[] args) {
        System.out.println(count7(7));
    }
}
