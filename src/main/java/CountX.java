public class CountX {
    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

     * countX() → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     */

    public static int countX(String str,int i,int count){
        if(str.length()==i) return count;
        if(str.charAt(i)=='x') {
            i++;
            count++;
            return countX(str,i,count);
        }
        i++;
        return countX(str,i,count);

    }

    public static void main(String[] args) {
        System.out.println( countX("xxxxaaxx",0,0));
    }

}
