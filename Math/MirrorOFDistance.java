package Math;

public class MirrorOFDistance {
    public static void main(String[] args) {

    }

    static int mirrorDistance(int n) {
        StringBuilder st = new StringBuilder(String.valueOf(n));
        st.reverse();
        return Math.abs(n - Integer.parseInt(String.valueOf(st)));

    }
}
