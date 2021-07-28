public class ReverseAString {

    public static String reverse(String str){
        int len = str.length();
        char arr[] = new char[len];

        for(int i=0;i<len;i++){
            arr[i]=str.charAt(len-i-1);
        }
        String result = new String(arr);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverse("Bhanu"));
    }
}
