package Assignment4;




public class ExceptionsExample {

    public static void main(String[] args) {
        try {
        	
            handleExceptions();
            
        } catch (NullPointerException e) {
        	
            System.out.println("Caught a NullPointerException: " + e.getMessage());
            
        } catch (ArithmeticException e) {
        	
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
            
        } catch (CustomException e) {
        	
            System.out.println("Caught a CustomException: " + e.getMessage());
            
        } catch (Exception e) {
        	
            System.out.println("Caught a general exception: " + e.getMessage());
            
        }
    }

    public static void handleExceptions() throws CustomException {
        String str = null;
        int num = 10;
        int divisor = 0;

       
        if (str.equals("test")) {
            System.out.println("This won't be printed.");
        }

     
        int result = num / divisor;

        // CustomException
        if (num > 5) {
            throw new CustomException("Number is greater than 5");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
