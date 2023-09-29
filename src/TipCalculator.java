import java.util.Scanner;

public class TipCalculator {
private double bill;
private double tip;
private int ppl;
private double totalTipAmt;
public double billWithTip;
private double billPerPerson;
private double eachPersonTipAmt;
private double totalPerPerson;
    public TipCalculator(double bill, double tip, int ppl) {
    this.bill = bill;
    this.tip = tip;
    this.ppl = ppl;
    }
    public void calc2() {
        totalTipAmt = (bill*(tip/100));
        billWithTip = (totalTipAmt+bill);
        billPerPerson = (bill/ppl); //no tip
        eachPersonTipAmt = (billPerPerson*(tip/100));
        totalPerPerson = (eachPersonTipAmt*ppl);
    }

    public void printPls() {
        System.out.println();
        System.out.println("Your total tip amount is: $" + (double) Math.round(totalTipAmt*100)/100);
        System.out.println("Your total bill including tip is: $" + (double) Math.round(billWithTip*100)/100);
        System.out.println("Your total tip per person is: $" + (double) Math.round(eachPersonTipAmt*100)/100);
        System.out.println("Your total per person is $" + (double) Math.round(totalPerPerson*100)/100);
    }
}
