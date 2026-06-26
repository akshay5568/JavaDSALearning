package Twopointer;

import java.util.Arrays;

public class MaximumNumberPlayerMatchingTrainers {
    public static void main(String[] args) {

    }

    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int maxCount = 0;
        int r =0;
        int l =0;
        while(l < players.length && r < trainers.length){
            if(players[l] <= trainers[r]){
                maxCount++;
            }else{
                for(int i=r; i<trainers.length; i++){
                    if(players[l] <= trainers[i]){
                        r = i+1;
                        maxCount++;
                        break;
                    }
                }
                l++;
                continue;
            }
            r++;
            l++;
        }
        return maxCount;
    }
}
