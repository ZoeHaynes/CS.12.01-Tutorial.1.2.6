public class Mountain {

    /** @param array an array of positive integer values

     @param stop the last index to check
     Precondition: 0 <= stop < array.length
     @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     false otherwise
     */

    public static boolean isIncreasing(int[] array, int stop) {
        boolean isIncreasing = false;
        for(int j = 0; j<stop; j++){
            if(array[j]<array[j+1]){
                isIncreasing = true;
            }
            else{
                return false;
            }
        }
        return isIncreasing;

    }

    /** @param array an array of positive integer values

     @param start the first index to check
     Precondition: 0 <= start < array.length - 1
     @return true if for each j such that start <= j < array.length - 1,
     array[j] > array[j + 1];
     false otherwise
     */

    public static boolean isDecreasing(int[] array, int start) {
        boolean isDecreasing = false;
        for(int j = start; j<array.length-1; j++){
            if(array[j]>array[j+1]){
                isDecreasing = true;
            }
            else{
                return false;
            }
        }

        return isDecreasing;

    }

    public static int getPeakIndex(int[] array) {
        for(int i = 1; i<array.length-1;i++){
            if(array[i-1]<array[i] && array[i]>array[i+1]){
                return i;
            }
        }
        return -1;

    }

    public static boolean isMountain(int[] array) {
        int peak = getPeakIndex(array);
        if(peak==-1){return false;}
        if(isIncreasing(array,peak) && isDecreasing(array,peak)){
            return true;
        }

        return false;
    }

}
