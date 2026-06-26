package Recursion;

import LinkedList.BaiscLinkedList;

import java.util.HashSet;
import java.util.Set;

public class LetterTilesPossibles {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }

    public static int numTilePossibilities(String tiles) {
        boolean [] used = new boolean[tiles.length()];
        Set<String> set = new HashSet<>();
        BackTrack(tiles,"",used,set);
        return set.size()-1;
    }


    /*
    Input: tiles = "AAB"
    Output: 8
    Explanation: The possible sequences are
    "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
    */
    public static void BackTrack(String tiles, String p,boolean[] used,Set<String> set){
        set.add(p);
        System.out.println(set);
        for (int i=0; i<tiles.length(); i++){
            if(!used[i]) {
                used[i] = true;
                BackTrack(tiles,p+tiles.charAt(i),used,set);
                used[i] = false;
            };
        }
    }
}
