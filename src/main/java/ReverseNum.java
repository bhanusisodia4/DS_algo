public class ReverseNum {
  //1453
    public static void reverseNum(int n){
        if (n<10) {
            System.out.println(n);
            return;
        }

        else{
            System.out.print(n%10);
            reverseNum(n/10);
        }
    }

    public static void main(String[] args) {
        reverseNum(231425);
    }
}
