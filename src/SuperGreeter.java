import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = scanner.next();
        sg.name(name);

        System.out.println("How old are u?");
        int age = scanner.nextInt();
        sg.age(age);


    }
    public void start() {
        System.out.println("Det virker!");
    }

    public void name(String name) {
        System.out.println("Hello " + name + "\nNice to meet you :)");
    }

    public void age(int age) {
        System.out.println("You are " + age + " years old. Congratz! ");
        System.out.println("Test");
    }



}
