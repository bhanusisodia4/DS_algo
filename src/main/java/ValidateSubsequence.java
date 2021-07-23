import java.util.Arrays;

public class ValidateSubsequence {

    public static boolean valSubsequence(int arr[], int seq[]){
        if(arr.length==0 || seq.length==0) return false;

        int check[] = new int[seq.length];
        int k=0;

        for (int i=0; i< arr.length;i++){
            for(int j=0;j<seq.length;j++){
                if(seq[j]==arr[i]){
                    check[k]=arr[i];
                    k++;
                }
            }
        }

        if (Arrays.equals(seq,check)) return true;
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={5,1,22,25,6,-1,8,10,30};
        int seq[] = {1,6,-1,10};
        System.out.println(valSubsequence(arr,seq));
    }

}
