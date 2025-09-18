package Jobsheet03.User_Constructor;

public class User {
    public String username;
    public String email;
    public String password;
    public String name;

    public void displayInfo(){
        System.out.println("\nUsername    : " + this.username);
        System.out.println("Email       : " + this.email);
        System.out.println("Password    : " + this.password);
        System.out.println("Name        : " + this.name);
        System.out.println("============================");
    }
    
    public User (String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "polinema123";
    }
}


