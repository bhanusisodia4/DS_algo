public class Triangle {
    /**
     *
     We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
     the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
     the total number of blocks in such a triangle with the given number of rows.
     */

    public static int triangle(int row){
    if (row==0) return 0;
    return row +triangle(row-1);
    }

    public static void main(String[] args) {
        System.out.println("Total number of blocks are :"+triangle(3));
    }


}
