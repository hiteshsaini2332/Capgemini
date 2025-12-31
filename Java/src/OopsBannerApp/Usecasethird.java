package OopsBannerApp;

public class Usecasethird {
    public static  void useCase3(){
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " +P[i] + "  " + S[i]);
        }

//         for (String line : banner) {
//             System.out.println(line);
//         }

    }
    public static String[] buildO() {
        return new String[]{
                "    *****    ",
                "  *       *  ",
                " *         * ",
                "*           *",
                " *         * ",
                "  *       *  ",
                "    *****    "
        };
    }
    public static String[] buildP() {
        return new String[]{
                " ******  ",
                "*       *",
                "*       *",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }
    public static String[] buildS() {
        return new String[]{
                "  *****  ",
                "*        ",
                "*        ",
                "  *****  ",
                "        *",
                "        *",
                "  *****  "
        };
    }

    public static void main(String[] args) {
        useCase3();
    }
}
