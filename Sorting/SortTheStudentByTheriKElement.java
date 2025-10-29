package Sorting;

import java.util.Arrays;

public class SortTheStudentByTheriKElement {
    public static void main(String[] args) {
        int [] [] score = {{64766,11978,20502,21365,79611,36797,58431,89540,59373,25955},{51305,66104,88468,5333,17233,32521,14087,42738,46669,65662},{93306,92793,54009,9715,24354,24895,20069,93332,73836,64359},{23358,84599,4675,20979,76889,34630,64098,23468,71448,17848}};
        int  k =5;
        int [] [] ans = sortTheStudents(score,k);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0; i<score.length; i++){
            for(int j=1; j<score.length; j++){
                if(score[j][k] > score[j-1][k]){
                    int [] temp = score[j-1];
                    score[j-1] = score[j];
                    score[j] = temp;
                }
            }
        }
        return score;
    }
}
