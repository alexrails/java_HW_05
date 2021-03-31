package academy.belhard.entity;

public class User extends Person{
    private final String email;
    private final String password;

    public User(String firstName, String lastName, String email, String password){
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo(){
        return "Name: " + this.getFullName() + "\n" + "Email: " + this.email;
    }
    public boolean isPasswordCorrect(String passwordExample){
        return this.password.equals(passwordExample);
    }
}
