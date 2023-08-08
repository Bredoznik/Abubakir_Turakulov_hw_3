public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.0, 1.0, -6.0, 3.0, -2.0, 1.0, -9.0, 4.0, -2.5, 7.0, -8.0, 6.0, -1.0, 5.0, -3.0};
        double positive = 0;
        int count = 0;
        boolean negative = false;
        for (double number : numbers) {
            if (negative && number > 0) {
                positive += number;
                count++;
            } else if (number < 0) {
                negative = true;
            }
        }
        double avg = (positive / count);
        System.out.println("Среднее положительное число: " + avg);
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            double number2 = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = number2;
        }
        for (double number : numbers)
            System.out.print(" " + number + " ");
    }
}