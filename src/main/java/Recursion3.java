public class Recursion3 {
    /**
     * Write a recursive function that takes a number ‘n’
     * and returns the nth number of the Fibonacci number.
     */
    static int c;
    static int fibbonacci(int n){
         if (c == n) return n;
        System.out.println(c);
        return fibbonacci(n);

    }

    public static void main(String[] args) {

    }
}
