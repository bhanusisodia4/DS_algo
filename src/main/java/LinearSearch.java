public class LinearSearch {

    public static boolean linearSearch(int arr[],int target){
        if(arr.length==0) return false;

        for(int i=0;i<arr.length;i++){
            if (arr[i]== target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,44,33,22,11};
        int target=33;
        System.out.println(linearSearch(arr,3));
    }
}
