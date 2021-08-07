public class FindTheFrequencyProb5 {

    public static int findTheFrequency(int arr[],int x){
        int len = arr.length;
        int freq =0;

        for(int i=0; i<len;i++){
            if(arr[i]==x){
                freq= freq+1;
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int arr[]= {1,34,34,1,2,1,4,5,1,1};
        System.out.println("The frequency of element in array is:"+findTheFrequency(arr,1));
    }
}
