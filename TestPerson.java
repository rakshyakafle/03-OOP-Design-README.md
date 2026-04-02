// Rakshya Kafle
// Advance Java
// TestPerson

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Basic Person
        System.out.print("Enter first name: ");
        String fn = input.nextLine();
        System.out.print("Enter last name: ");
        String ln = input.nextLine();
        Person p1 = new Person(fn, ln);
        System.out.println(p1.toString() + "\n");

        // 2. RegisteredPerson
        System.out.print("Enter Gov ID: ");
        String gid = input.nextLine();
        RegisteredPerson rp1 = new RegisteredPerson(fn, ln, gid);
        System.out.println(rp1.toString() + "\n");

        // 3. OCCCPerson
        System.out.print("Enter Student ID: ");
        String sid = input.nextLine();
        OCCCPerson op1 = new OCCCPerson(fn, ln, gid, sid);
        System.out.println(op1.toString() + "\n");

        // 4. Create RegisteredPerson from existing Person
        System.out.print("Enter a new Gov ID for the first person: ");
        String newGid = input.nextLine();
        RegisteredPerson rp2 = new RegisteredPerson(p1, newGid);
        System.out.println(rp2.toString() + "\n");

        // 5. Create OCCCPerson from newly-created RegisteredPerson
        System.out.print("Enter a new Student ID for that registered person: ");
        String newSid = input.nextLine();
        OCCCPerson op2 = new OCCCPerson(rp2, newSid);
        System.out.println(op2.toString());

        // FIX: Close the scanner to prevent resource leaks
        input.close();
    }
}