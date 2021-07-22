public class Recursion2 {
/**
 * Write a recursive function that takes
 * a number as an input and returns the factorial of that number.
 */
static int fact(int n){
    if (n==0 || n==1) return n;
    return n * fact(n-1);
}

    public static void main(String[] args) {
        System.out.println("The factorial of number is: "+fact(0));
    }
}
