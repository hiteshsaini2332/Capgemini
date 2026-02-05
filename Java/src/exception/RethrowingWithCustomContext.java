package exception;

class TranscationException extends Exception
{
    public TranscationException(String message)
    {
        super(message);
    }
}
class Transaction{
    public void processTransaction(double amount) throws TranscationException
    {
        try{
            if(amount<=0){
                throw new IllegalArgumentException("Invalid Amount");
            }
        }
        catch (Exception e)
        {
            throw new TranscationException("Transaction not processed");
        }

    }
}
public class RethrowingWithCustomContext {
    static void main() {
        Transaction service = new Transaction();

        try {
            service.processTransaction( -500);
        } catch (TranscationException e) {
            System.out.println("Transaction error occurred:");
            System.out.println(e.getMessage());

            // Optional: inspect original cause
        }
    }
}
