import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<String> responses = new ArrayList<>();

        Scanner key = new Scanner(System.in);

        System.out.print("Did you call the victim? ");
        responses.add(key.next().toLowerCase());
        System.out.print("Were you at the crime scene? ");
        responses.add(key.next().toLowerCase());
        System.out.print("Do you live near the victim? ");
        responses.add(key.next().toLowerCase());
        System.out.print("Did it owe the victim? ");
        responses.add(key.next().toLowerCase());
        System.out.print("Have you ever worked with the victim? ");
        responses.add(key.next().toLowerCase());
        System.out.println();

        int count = 0;
        Iterator<String> counter = responses.iterator();
        while (counter.hasNext()) {
            String response = counter.next();
            if (response.contains("y")) {
                count++;
            }
        }

        switch (count){
            case 2:
                System.out.println("-- Suspect --");
                break;
            case 3:
            case 4:
                System.out.println("-- Accomplice --");
                break;
            case 5:
                System.out.println("-- Assassin --");
                break;
            default:
                System.out.println("-- Innocent --");
        }




    }
}
