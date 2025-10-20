import static java.lang.Math.abs;

public class Calculator {
    public int[] summedArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + 1];
        result[0] = 0;
        for(int i = 0; i < array1.length; i++){
            result[i+1] = array1[i] + array2[i];
        }
        for(int j = array1.length; j > 0; j--){
            result[j-1] = result[j - 1] + result[j] / 10;
            result[j] = result[j] % 10;
        }

        return result;
    }

    public int[] multipliedArray(int[] array1, int digit) {
        int[] result = new int[array1.length + 1];
        result[0] = 0;
        for(int i = 0; i < array1.length; i++){
            result[i+1] = array1[i] * digit;
        }
        for(int j = array1.length; j > 0; j--){
            result[j-1] = result[j - 1] + result[j] / 10;
            result[j] = result[j] % 10;
        }
        return result;
    }

    public int[] differenceArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            result[i] = abs(array1[i] - array2[i]);
        }
        return result;
    }

    public int[] divideArray(int[] array1, int digit) {
        int[] result = new int[array1.length];
        for(int i = 0; i < array1.length - 1; i++){
            result[i] = array1[i] / digit;
            array1[i+1] = array1[i+1] + (array1[i] % digit) * 10;
        }
        result[array1.length - 1] = array1[array1.length - 1] / digit;
        return result;
    }
}
