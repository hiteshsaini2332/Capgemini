package exception;
class CustomException extends Exception
{
    public  CustomException(String message)
    {
        super(message);
    }
}
public class CheckedAndUnchecked {
    public void processData(String data) throws CustomException {

        // Unchecked exception
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }

        // Checked exception
        if (data.isEmpty()) {
            throw new CustomException("Data cannot be empty");
        }

        System.out.println("Processing data: " + data);
    }

    static void main() {
        CheckedAndUnchecked processor = new CheckedAndUnchecked();

        try {
//            processor.processData(null);
            processor.processData("");
        }
        catch (CustomException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}
