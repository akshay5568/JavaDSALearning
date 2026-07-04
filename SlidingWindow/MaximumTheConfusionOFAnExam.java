package SlidingWindow;

public class MaximumTheConfusionOFAnExam {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("TFFT",1));
    }

    static int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(
                helper(answerKey, k, 'T'),
                helper(answerKey, k, 'F')
        );
    }

    static int helper(String answerKey, int k, char target) {
        int l = 0;
        int maxLength = 0;
        int changes = 0;

        for (int r = 0; r < answerKey.length(); r++) {

            if (answerKey.charAt(r) != target)
                changes++;

            while (changes > k) {
                if (answerKey.charAt(l) != target)
                    changes--;
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
