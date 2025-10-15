package Strings;

public class GoalParserString {
    public static void main(String[] args) {
            String str = "G()()()()(al)";
            String ans = interpret(str);
        System.out.println(ans);
    }

    static String interpret(String command) {
          return command.replace("()", "o").replace("(al)", "al");
    }
}
