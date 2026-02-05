package exception;

import java.util.HashSet;
import java.util.Set;

class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(String message)
    {
        super(message);
    }
}
class  UserNotFoundException extends Exception
{
    public UserNotFoundException(String message)
    {
        super(message);
    }
}
public class UserService {
    private static Set<String> users = new HashSet<>();

    public void registerUser(String name)throws  UserAlreadyExistException
    {
        if(users.contains(name)){
            throw new UserAlreadyExistException("User " +name+" Already Exists");
        }
        else{
            users.add(name);
            System.out.println("User Registered Successfully");
        }
    }
    public void checkUserExistence(String name) throws UserNotFoundException
    {
        if(!users.contains(name))
        {
            throw new UserNotFoundException("User Not Found");
        }
        else{
            System.out.println("User Found");
        }
    }

    static void main() {
        UserService userService = new UserService();

        try {
            userService.registerUser("alice");
            userService.registerUser("alice"); // will throw exception
        } catch (UserAlreadyExistException e) {
            System.out.println("Registration error: " + e.getMessage());
        }

        try {
            userService.checkUserExistence("bob"); // will throw exception
        } catch (UserNotFoundException e) {
            System.out.println("Lookup error: " + e.getMessage());
        }
    }
}
