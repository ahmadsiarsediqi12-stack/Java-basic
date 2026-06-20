import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewStringSplit {

    public static String[] split(String s, String regex) {
        ArrayList<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        int lastEnd = 0;
        while (matcher.find()) {
            if (matcher.start() > lastEnd) {
                result.add(s.substring(lastEnd, matcher.start()));
            }
            result.add(matcher.group());
            lastEnd = matcher.end();
        }

        if (lastEnd < s.length()) {
            result.add(s.substring(lastEnd));
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] result1 = split("ab#12#453", "#");
        for (String s : result1) {
            System.out.println(s);
        }

        System.out.println("---");

        String[] result2 = split("a?b?gf#e", "[?#]");
        for (String s : result2) {
            System.out.println(s);
        }
    }
}
