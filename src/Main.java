public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] number1 = {9, 9, 9, 9, 9, 9, 9, 9,9,9,9,9,9,9,9,9};
        int[] number2 = {9, 9, 9, 9, 9, 9, 9, 9,9,9,9,9,9,9,9,9};
        int[] number3 = {2,3,6,0,0,0,0,0,0};
        int[] number4 = {4,3,6,0,0,7,0,3,1};

        for(int digit : calculator.summedArrays(number1, number2)){
            System.out.print(digit + " ");
        }
        System.out.println();
        for(int digit : calculator.multipliedArray(number3, 9)){
            System.out.print(digit + " ");
        }
        System.out.println();
        for(int digit : calculator.differenceArrays(number1, number2)){
            System.out.print(digit + " ");
        }
        System.out.println();
        for(int digit : calculator.divideArray(number4, 6)){
            System.out.print(digit + " ");
        }
    }
}
