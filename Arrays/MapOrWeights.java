package Arrays;

public class MapOrWeights {
    public static void main(String[] args) {
        System.out.println(mapWordWeights(new String[]{"abcd","def","xyz"},new int []{5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2}));
    }

    static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str = new StringBuilder();
        for(int i=0;  i < words.length; i++){
            int ind = 0;
            for(int j=0; j<words[i].length(); j++){
                int temp = words[i].charAt(j);
                int index = 26 - (122 - temp);
                ind += weights[index-1];
            }
            ind = ind % 26;
            ind = 26 - ind;
            ind = 97 + ind - 1;
            char ch = (char) ind;
            str.append(ch);
        }
        return String.valueOf(str);
    }
}
