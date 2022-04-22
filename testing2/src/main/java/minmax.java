public class minmax {

    static double[] minMax(double arr[]){
        double[] result = new double[2];
        double min = arr[0], max = arr[0];
        for (int i=0 ; i < arr.length; i++){
            if (arr[i]< min)
                min = arr[i];
            if (arr[i]> max)
                max = arr[i];
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String args[]){

    }
}
