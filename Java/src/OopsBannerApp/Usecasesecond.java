package OopsBannerApp;

public class Usecasesecond {
    public static  void useCase2(){
        String[] lines = {
                "    *****        *****       ******      *****  ",
                "  *       *    *        *    *     **   **        ",
                " *         * *           *   *      **  *        ",
                "*         * *            *   ******     *****  ",
                " *         *  *         *    *               *",
                "  *       *   *        *     *                **",
                "    *****        *****       *          *****  "
        };

        // Use a loop to print each line of the banner to create the
        // visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        useCase2();
    }
}
