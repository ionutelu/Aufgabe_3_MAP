public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] number1 = {9, 9, 9, 9, 9, 9, 9, 9};
        int[] number2 = {9, 9, 9, 9, 9, 9, 9, 9};
        for(int digit : calculator.summedArrays(number1, number2)){
            System.out.print(digit + " ");
        }
        System.out.println();
        for(int digit : calculator.multipliedArray(number1, 9)){
            System.out.print(digit + " ");
        }
    }
}
