public class KthSmallestNoProb4 {

    public static int kthSmallestNo(int arr[], int k){
        int len = arr.length;

        for(int i=0;i<len;i++){

            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr[k-1];
    }


    public static void main(String[] args) {
        int arr[] ={7,10,4,3,20,15};
        System.out.println("the Kth smallest no in array is:"+kthSmallestNo(arr,3));
    }
}
