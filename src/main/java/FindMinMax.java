public class FindMinMax {
//using selection sort. time complexity = O(n^2)
    public static void minMaxElement(int arr[]){
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

        System.out.println("min"+arr[0]+" "+arr[len-1]);
        }





    public static void main(String[] args) {

        int arr[] ={6,33,56,235,67,2,4};
        minMaxElement(arr);
    }
}
