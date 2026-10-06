import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib deinen Namen ein!");
        String s = scanner.nextLine();
        System.out.println("Hallo" + s + "!");


        scanner.close();
    }
    
}
