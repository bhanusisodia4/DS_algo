public class Recursion1 {
    /**
     * Write a recursive function that takes a number and returns
     * the sum of all the numbers from zero to that number.
     */
    static int sum(int n)  {
        if(n==0 || n==1) return n;
        return n+ sum(n - 1);
    }

    public static void main(String[] args)  {
        System.out.println(sum(0));
    }
}
