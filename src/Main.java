import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the total bill: ");
        String a = s.nextLine();
        double bill = Double.parseDouble(a);
        System.out.println("What tip percent would you live to give: ");
        String b = s.nextLine();
        double tip = Double.parseDouble(b);
        System.out.println("How many people are in the party: ");
        String c = s.nextLine();
        int ppl = Integer.parseInt(c);
        TipCalculator one = new TipCalculator(bill, tip, ppl);
        one.calc2();
        one.printPls();
    }
}