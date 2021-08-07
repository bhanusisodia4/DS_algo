public class CountPairWithSum {

    public static int countPairWithGivenSum(int arr[], int k){
        int len = arr.length;
        int count =0;
        for(int i=0; i<len-1;i++){
            for(int j=i+1; j< len;j++){
                if (arr[i]+arr[j]==k){
                    count = count+1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,5,7,1,0,6,3,4,3};
        System.out.println("the number of pair are:"+countPairWithGivenSum(arr,6));
    }
}
