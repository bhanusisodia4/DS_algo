public class DuplicateChar {

    public static int duplicateCharCount(String str, char ch){
        int len = str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==ch) count = count+1;
        }
        return count-1;
    }

    public static void main(String[] args) {
        System.out.println("the Number of duplicate char in String: "+duplicateCharCount("Hellllo",'l'));
    }
}
