package klasevich.tanya.task4.entity;

import java.util.Arrays;

public class RowOfNumbers {
    public static int quantity = 4;
    private int[] numbers = new int[quantity];

    public RowOfNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RowOfNumbers{");
        sb.append("numbers=").append(Arrays.toString(numbers));
        sb.append('}');
        return sb.toString();
    }
}
