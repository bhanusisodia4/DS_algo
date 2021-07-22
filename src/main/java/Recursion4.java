public class Recursion4 {
    /**
     * Write a recursive function that takes a list of numbers
     * as an input and returns the product of all the numbers in the list.
     */
    static int len;
    static int productNo(int arr[]){
        if (arr.length==0) return 0;
        return arr[len]* productNo(arr);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4};
        System.out.println("The product of no in the list is:"+productNo(arr));
    }
}
// 2,3,4,1,2
