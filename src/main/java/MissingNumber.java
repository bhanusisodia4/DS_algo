public class MissingNumber {

    public static int missingNumber(int arr[]){
        int len = arr.length;
        int i=0;
        int count=1;
        while (arr[i]==count){
                count= count +1;
                i++;
            }
        return i+1;
        }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10,12};
        System.out.println(missingNumber(arr));
    }
    }

