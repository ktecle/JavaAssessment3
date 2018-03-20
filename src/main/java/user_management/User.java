package user_management;

import user_management.security.Password;

public class User {
    private String name;
    private String email;
    private Password password;
    private int id;

    public User(int id, String name,String email,String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = new Password(password);
    }

    @Override
    public String toString() {

        return this.name +" - " + this.email;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(Password password){
        this.password = password;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public Password getPassword(){
        return this.password;
    }
    public int getId(){
        return this.id;
    }


}
