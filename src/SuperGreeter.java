import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = scanner.next();



    }
    public void start(){
        System.out.println("Det virker!");
    }



}
