package academy.belhard;
import academy.belhard.entity.User;


public class Main {

    public static void main(String[] args) {
        User user1 = new User("John", "Doe", "jhon@example.com", "qwerty");

        System.out.println(user1.getFullInfo());
        System.out.println(user1.isPasswordCorrect("123456"));
        System.out.println(user1.isPasswordCorrect("qwerty"));
    }
}
