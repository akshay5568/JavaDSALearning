package Recursion;

public class PunishmentNumber {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(9));
    }


    public static int punishmentNumber(int n) {
        int count = 0;
//            for (int i=1; i<=n; i++){
//                String up = String.valueOf(i * i);
//                if (punishmentNumberBack(up,0,0,i)){
//                    count += i * i;
//                }
//            }
        if (punishmentNumberBack("1296",0,0,36)) System.out.println(36);
        return count;
    }



    //The main key idea in this problem was we were creating new num for every new  recursion call,
    // but when time comes to backtrack we were calculation with previous num.

    public static boolean punishmentNumberBack(String up, int sum,int start,int n) {
        if (up.length() == start) {
            return sum == n;
        }
        int num = 0;
        for (int i=start; i<up.length(); i++){
            num = num * 10 + (up.charAt(i) - '0');
            if (punishmentNumberBack(up,sum+num,i+1,n)) return true;
        }
        return false;
    }

    /*
input: n = 37
Output: 1478
Explanation: There are exactly 4 integers i in the range [1, 37] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1.
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 + 1.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 + 0.
- 36 since 36 * 36 = 1296 and 1296 can be partitioned into 1 + 29 + 6.
Hence, the punishment number of 37 is 1 + 81 + 100 + 1296 = 1478
    */


}
