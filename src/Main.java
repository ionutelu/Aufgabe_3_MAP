public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] number1 = {1, 9, 6, 5, 7, 3, 7, 9};
        int[] number2 = {8, 0, 3, 4, 2, 6, 2, 1};
        for(int digit : calculator.summedArrays(number1, number2)){
            System.out.print(digit + " ");
        }
    }
}
