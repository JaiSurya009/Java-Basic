class copy_arr{
    static void print(int a[][]){
        for(int i =0;i<2;i++){
            for(int p=0;p<2;p++){
                System.out.print(k[i][p]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int k[][] = {{1,2},{3,4}};
        int copyto[][] = new int[2][2];
        System.arraycopy(k,0,copyto,0,2);
        System.out.println(Integer.valueof(copyto));
    }
}