public class evenOdd {

    static String isEven(float x){
        if(((int)x - x) != 0 || x<0)
            return "please enter a positive integers only";
        else if ( x % 2 ==0)
            return "even";
        return "odd";
    }

    public static void main(String args[]){

    }
}
