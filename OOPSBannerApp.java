import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to load character patterns
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Function to render banner
    public static void renderBanner(String word) {

        word = word.toUpperCase();
        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("        ");
                }
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        loadPatterns();           // Load all patterns
        renderBanner("OOPS");     // Render banner
    }
}