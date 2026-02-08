package regex;

public class ValidateLicencePlate {
    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return plate.matches(regex);
    }

     static void main(String[] args) {
        String[] testPlates = {
                "AB1234",
                "A12345",
                "ab1234",
                "ABC123",
                "AB12C4"
        };

        for (String plate : testPlates) {
            System.out.println(plate + " → " +
                    (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
