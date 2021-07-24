public class StrDIst {
    /**
     *
     Given a string and a non-empty substring sub, compute recursively
     the largest substring which starts and ends with sub and return its length.
     strDist("catcowcat", "cat") → 9
     strDist("catcowcat", "cow") → 3
     strDist("cccatcowcatxx", "cat") → 9
     */

    public static int strDist(String str, String sub){
        if (str.length()==0 || sub.length()==0) return 0;
        if (str.length()==sub.length() && str.contains(sub)) return str.length();
        int start=0, end=0;
        if(str.contains(sub)){
           start= str.indexOf(sub);
           end = str.lastIndexOf(sub);
        }
        if(start==end) return start;
        else  return end+sub.length() -start;

    }

    public static void main(String[] args) {
        System.out.println(strDist("hiHellohihihi","hi"));
    }

}
