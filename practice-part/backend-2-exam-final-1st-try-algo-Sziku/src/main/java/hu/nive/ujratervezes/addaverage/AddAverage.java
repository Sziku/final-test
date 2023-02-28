package hu.nive.ujratervezes.addaverage;

import java.util.Arrays;

public class AddAverage {

    public int[] addAverage(int[] numbers, int n) {
        if(numbers == null){
            throw new IllegalArgumentException();
        } else if(numbers.length == 0){
            return new int[0];
        } else if ( n < 1) {
            throw new IllegalArgumentException();
        }

        int average = 0;
        for (int number : numbers){
            average += number;
        }

        average = average / numbers.length;

        for(int i = n - 1; i< numbers.length;){
            int tmp = numbers[i];
            numbers[i] = tmp*average;
            i = i + n;
        }
        return numbers;
    }

    public static void main(String[] args) {
    }
}
