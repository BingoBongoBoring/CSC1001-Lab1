import java.nio.charset.StandardCharsets;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String decryptorA(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static String decryptorB(String s) {
        return s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
    }

    public static String decryptorC(String s) {
        return s.charAt(s.length() - 3) + s.substring(0, s.length() - 3);
    }

    public static String decryptorD(String s) {
        int i = Math.floorDiv(s.length(), 2);
        return s.substring(0, i) + s.charAt(s.length() - 1) + s.substring(i, s.length() - 1);
    }

    public static String decryptorLA(String s) {
        int i = Math.ceilDiv(s.length(), 2);
        return s.substring(i, s.length()) + (new StringBuilder(s.substring(0, i))).reverse();
    }

    public static String decryptorLB(String s) {
        StringBuilder r = new StringBuilder();
        char[] a = new char[s.length()];
        s.getChars(0, s.length(), a, 0);
        for (char b : a) {
            switch (b) {
            case 'a': r.append("u"); break;
            case 'o': r.append("i"); break;
            case 'e': r.append("a"); break;
            case 'u': r.append("o"); break;
            case 'i': r.append("e"); break;
            default: r.append(b); break;
            }
        }
        return r.toString();
    }

    // add six to a number
    public static int addSix(int a){
        return a + 6;
    }

    public static int addSeventeen(int a) {
        return a + 17;
    }

    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + Main.addSix(i));
        }
    }
}
