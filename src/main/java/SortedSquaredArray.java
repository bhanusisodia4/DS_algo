public class SortedSquaredArray {

    public static void sortedSquared(int arr[]) {
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] * arr[i];
            arr[i] = temp[i];
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        sortedSquared(arr);
    }
}




