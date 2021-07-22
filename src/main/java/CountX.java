public class CountX {
    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     */
    static int i;
    public static int countX(String str){
        int count = 0;
        int len = str.length();
        while(i<len) {
            if (str.charAt(i) == 'x') {
                count++;
                i++;
                return count +countX(str);
            }
            i++;
            return count+countX(str);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countX("bhqnu"));
    }
}
