public class CountChar {
//bhaabhhhu;
    public static void countChar(String str){
        int len = str.length();
        int count=0;
        for(int i=0; i< len; i++){
            for (int j=0; j< len; j++){
                if(str.charAt(i)==str.charAt(j)){
                    count = count+1;
                }
            }
            System.out.println("the character "+str.charAt(i)+" Occured "+count);
            count =0;
        }
    }

    public static void main(String[] args) {
        countChar("bhaanu");
    }
}
