package Sorting;

import java.util.Arrays;

public class MinimumNumberOfMovesForSeate {
    public static void main(String[] args) {

    }

    static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int counts = 0;
        for(int i=0; i<seats.length; i++){
            counts += Math.abs(seats[i] - students[i]);
        }
        return counts;
    }
}
