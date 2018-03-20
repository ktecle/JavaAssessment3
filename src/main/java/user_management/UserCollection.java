package user_management;

import user_management.security.UserAuthenticationFailedException;
import user_management.validation.EmailNotAvailableException;
import user_management.validation.InvalidEmailException;
import user_management.validation.PasswordTooSimpleException;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCollection extends ArrayList<User>{

    public User findById(int id) {
        for(int i=0;i<this.size();i++){
            if(this.get(i).getId()==id){
                return this.get(i);
            }
        }
        return null;
    }

    public User findByEmail(String email) {
        for(int i=0;i<this.size();i++){
            if(this.get(i).getEmail().equals(email)){
                return this.get(i);
            }
        }
        return null;
    }

    public User attemptLogin(String email, String password) throws UserAuthenticationFailedException{
        User user = findByEmail(email);

            if(user.getEmail()==null || !(user.getPassword().matches(password))){
                throw new UserAuthenticationFailedException();
            }

        return user;
    }
    Pattern validEmailPattern = Pattern.compile("([\\w\\.-]+@[\\w\\.-]+\\.[\\w]+)");
    public boolean verifyEmailValidity(String email){
        Matcher regexMatcher = validEmailPattern.matcher(email);
        boolean validity= regexMatcher.find();
        return validity;
    }
    Pattern validPasswordPattern = Pattern.compile("(?<=([Pp][Aa][Ss][Ww][Oo][Rr][Dd][^A-Za-z])).*?(?=[^A-Za-z0])");
    public boolean verifyPasswordValidity(String password){
        Matcher regexMatcher = validPasswordPattern.matcher(password);
        boolean validity = regexMatcher.find();
        return validity;
    }

    public int createUser(String name, String email, String password) throws EmailNotAvailableException,
                            InvalidEmailException,PasswordTooSimpleException {
        User newUser;
        int startId =1;
        newUser =findById(startId);
        if(newUser!=null){
            newUser = new User(startId,name,email,password);
            startId++;
        }


        if(!verifyEmailValidity(email)){
            throw new InvalidEmailException();
        }else if (!verifyPasswordValidity(password)){
            throw new PasswordTooSimpleException();
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

    public Integer findId(String user) {
        Pattern namePattern = Pattern.compile("(?<=([Ii][Dd])).*?(?=[^A-Za-z0])");
        Matcher regexMatcher = namePattern.matcher(user);
        Integer id = Integer.parseInt(regexMatcher.group());
        return id;
    }



}
