package Arrays;

public class AltitudeBiker {
    public static void main(String[] args) {
        int [] nums = {-5,1,5,0,-7};
        int ans = altitude(nums);
        System.out.println(ans);
    }

    static int altitude(int [] nums){
          int index = 0;
          int higestAltitude = index;
          for (int i=0; i<nums.length; i++){
              index += nums[i];
              higestAltitude = Math.max(higestAltitude,index);
          }
          return higestAltitude;
    }
}
