package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> str = new ArrayList<>();
        List<String> a = new ArrayList<>();
        a.add("phone"); a.add("blue"); a.add("pixel");
        str.add(a);
        List<String> b = new ArrayList<>();
        b.add("computer"); b.add("silver"); b.add("lenovo");
        str.add(b);
        List<String> c = new ArrayList<>();
        c.add("phone"); c.add("gold"); c.add("iphone");

        System.out.println(countMatches(str,"color","silver"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("type"); arr.add("color"); arr.add("name");

        int indexKey = arr.indexOf(ruleKey);

        int ans = 0;
        for(int i =0; i<items.size(); i++){
            for(int j=0; j<items.get(i).size(); j++){
                if(j == indexKey && Objects.equals(ruleValue, items.get(i).get(j))) ans++;
            }
        }
        return ans;
    }
}
