public class leapyr_or_not{
    public static void main(String[] args){
        int y = 2000;
        if(y % 4== 0 && y % 100 == 0 && y  % 400 == 0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a  leap year");
        }
    }
}