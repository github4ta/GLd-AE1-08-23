package by.itacademy;

public class AndreiUnuchakCalculator {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    private static int sum(int num1, int... numN) {
        int sum = num1;
        for (int i : numN) {
            sum += i;
        }
        return sum;
    }
}
