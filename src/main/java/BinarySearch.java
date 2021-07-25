public class BinarySearch {

    public static int binarySearch(int arr[],int target,int low, int high){
        if (arr.length==0) return -1;
        if(arr[low]==target ) return low;
        if (arr[high]==target) return high;
        int mid = low+high/2;

        if(target==arr[mid]) return mid;

        else if(target < arr[mid]){
            high=mid-1;
            low=low;
            return binarySearch(arr,target,low,high);
        }
        else if(target>arr[mid]) {
            low = mid+1;
            high =high;
            return binarySearch(arr, target, low, high);
        }
        else return -1;


    }

    public static void main(String[] args) {
        int arr[]={1,32,45,62,74,83,97,188,190};
        int low =0;
        int high =arr.length-1;
        System.out.println(binarySearch(arr,83,low,high));
    }

}
