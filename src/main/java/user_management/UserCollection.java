package user_management;

import user_management.validation.EmailNotAvailableException;
import user_management.validation.InvalidEmailException;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCollection {

    ArrayList<User>listOfUsers = new ArrayList<>();

    public User findById(int id) {
        for(User user: listOfUsers){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User findByEmail(String email) {
        for(User user: listOfUsers){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public User attemptLogin(String email, String password) {
        for(User user: listOfUsers){
            if(user.getEmail().equals(email)&& user.getPassword().equals(password)&&
                    (user.getPassword().hashCode()==password.hashCode())){
                return user;
            }
        }
        return null;
    }

    public int createUser(String name, String email, String password) throws EmailNotAvailableException, InvalidEmailException {
        User newUser;
        for(User user : listOfUsers){
            if(user.getEmail().equals(email)){
                throw new EmailNotAvailableException();
            }else if((email.contains("!#$%^&*()<>?"))||!isSubstring(email,name)) {
                throw new InvalidEmailException();
            }else{
                int newId = listOfUsers.size()+1;
               newUser  = new User(newId,name,email,password);
                listOfUsers.add(newUser);
                return newUser.getId();
            }
        }
        return 0;

    }
    public boolean isSubstring(String str1,String str2){
        return str1.indexOf(str2)>=0;
    }


    public String findName(String user){
        Pattern namePattern = Pattern.compile("(?<=([Nn][Aa][Mm][Ee][^A-Za-z])).*?(?=[^A-Za-z0])");
        Matcher regexMatcher = namePattern.matcher(user);
        String name = regexMatcher.group();
        return name;
    }
    public String findEmail(String user){
            Pattern namePattern = Pattern.compile("([\\w\\.-]+@[\\w\\.-]+\\.[\\w]+)");
            Matcher regexMatcher = namePattern.matcher(user);
            String email = regexMatcher.group();
            return email;
    }
    public Integer findId(String user) {
        Pattern namePattern = Pattern.compile("(?<=([Ii][Dd])).*?(?=[^A-Za-z0])");
        Matcher regexMatcher = namePattern.matcher(user);
        Integer id = Integer.parseInt(regexMatcher.group());
        return id;
    }
    public String findPassword(String user){
        Pattern namePattern = Pattern.compile("(?<=([Pp][Aa][Ss][Ww][Oo][Rr][Dd][^A-Za-z])).*?(?=[^A-Za-z0])");
        Matcher regexMatcher = namePattern.matcher(user);
        String password = regexMatcher.group();
        return password;
    }

    public User parseStringIntoUser(String user){
        String name = findName(user);
        String email = findEmail(user);
        String password = findPassword(user);
        Integer id = findId(user);

        return new User(id,name,email,password);
    }


}
