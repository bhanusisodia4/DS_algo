public class RemoveChar {

    public static void removeChar(String str, char ch){
        int len = str.length();
        char arr[] = new char[len];
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=ch)
                arr[i]=str.charAt(i);
            }
        String result = new String(arr);
        System.out.println(result);
        }


    public static void main(String[] args) {
        removeChar("naman",'a');
    }
}
