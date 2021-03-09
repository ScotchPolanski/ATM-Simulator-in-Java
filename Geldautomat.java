import java.util.Scanner;

public class Geldautomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PIN: ");
        int pin = 1234;
        int pin1 = scanner.nextInt();
        if (pin == pin1)
        {
        System.out.println("Ihr Guthaben beträgt 136.34 Euro");
        System.out.println("Wieviel Geld wollen Sie abheben?");
        int abheben = scanner.nextInt();
        if (abheben > 137)
        {
            System.out.println("Keine Auszahlung! Dieser Betrag übersteigt Ihr Guthaben.");
        }
        else
        {
            System.out.println("Es werden " +abheben+" Euro ausgezahlt");
        }
        }
        if (pin1 != pin)
        {
            System.out.println("Falscher Pin");
            
        }
    }
}