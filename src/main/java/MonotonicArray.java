public class MonotonicArray {

    public static boolean isMonotonicArray(int arr[]) {
        if (arr.length == 0 || arr.length == 1) return true;
        int i = 0, count = 0;
        if (arr[i] > arr[i + 1]) {
            for (i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    count++;
                }
            }
            if (count == arr.length - 1) return true;
                return false;
            }
         else if (arr[i] < arr[i + 1]) {
            for (i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i + 1]) {
                    count++;
                }
            }
                if (count == arr.length - 1) return true;
                return false;
            }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-1,-5,-10,-110,-1102,-1};
        System.out.println(isMonotonicArray(arr));
    }
}
