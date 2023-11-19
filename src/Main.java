import java.awt.print.Printable;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.info();

        User user1 = new User() {
            @Override
            public void info() {
                System.out.println("Кот");
            }
        };

        user1.info();

    }
}
class  User{

    public void info() {
        System.out.println("собака");
    }
}