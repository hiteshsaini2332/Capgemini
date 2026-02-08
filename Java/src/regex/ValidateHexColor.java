package regex;

public class ValidateHexColor {

    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }

     static void main(String[] args) {
        String[] testColors = {
                "#FFA500",
                "#ff4500",
                "#123",
                "#ZZZZZZ",
                "FFA500"
        };

        for (String color : testColors) {
            System.out.println(color + " → " +
                    (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}
