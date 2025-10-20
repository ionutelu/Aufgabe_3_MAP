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
}
