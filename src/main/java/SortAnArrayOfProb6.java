public class SortAnArrayOfProb6 {
    //sort an array of 0's,1's and 2's
    //0,2,2,1,1
    public static void sortAnArray(int arr[]){
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[i]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
                else if(arr[i]==arr[j]){
                    continue;
                }
            }
        }
        for(int i: arr){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {0,3,3,1,1};
        sortAnArray(arr);
    }
}
