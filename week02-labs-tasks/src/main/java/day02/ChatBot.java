
package day02;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a nevet: ");
        String inputName = scanner.nextLine();

        User user = new User ("Bill", 12, "bill@gmail.com");

        System.out.println(user.greetingSomebody(inputName));
    }
}













