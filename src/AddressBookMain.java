import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    private ArrayList<contact> person; // An array of Contacts - each stores info for one friend

    public AddressBookMain() {
        person = new ArrayList<contact>();
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(contact c) {
        person.add(c);
    }
    public static void menu()
    {
        System.out.println("Add a new contact to your address book.");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        AddressBookMain obj = new AddressBookMain();
        menu();

        System.out.println("Enter First Name:");
        String fName = inp.next();
        System.out.println("Enter Last NAme");
        String lName = inp.next();
        System.out.println("Enter  phone number.");
        int number = inp.nextInt();
        System.out.println("Enter The City");
        String city = inp.next();
        System.out.println("Enter The State");
        String state = inp.next();
        System.out.println("Enter the pin code");
        int pinCode = inp.nextInt();
        obj.addContact(new contact(fName, lName, number, city, state, pinCode));

    }
}
