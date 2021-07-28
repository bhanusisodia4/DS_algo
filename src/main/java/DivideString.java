import java.util.LinkedList;
import java.util.StringTokenizer;

public class DivideString {
    //to divide a String from space" " give

    public static void divideString(String str){
        int len = str.length();
        int i=0;
        String arr[] = new String[len];
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            arr[i]= st.nextToken();
            i++;
        }
        for(i= arr.length-1;i>=0;i--) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        divideString("Bhanu Sisodia");
    }
}
