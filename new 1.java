import java.util.Scanner;
public class Testme {
	public static void main(String[] args) {
		

double pound = .4536;
double ounce = 28.5;
double foot = .3048;
double mile = 1.61;
Scanner scan = new Scanner(System.in);

System.out.print("Which system are you converting from Metric or Imperial? ");
String USAunits = scan.next();

if(USAunits.equals("Metric")) {
System.out.print("what conversion would you like :");
String units = scan.next();
System.out.print("Amount: ");
int amount = scan.nextInt();
if(units.equals("pound")) {
	double poundc = pound*amount;
System.out.println("The amount you recieve in pounds is : " + poundc);	
} // end of if pound
/////////////////////////////////////////////////// this will convert the amount into pounds
if(units.equals("ounce")) {
	double ouncec = ounce*amount;
System.out.println("The amount you recieve in ounces is : " + ouncec);
		} // end of if ounce
/////////////////////////////////////////////////// this will convert the amount into ounces
if(units.equals("foot")) {
	double footc = foot*amount;
System.out.println("The amount you recieve in foot is : " + footc);
}
/////////////////////////////////////////////////// this will convert the amount into foot
if(units.equals("mile")) {
	double milec = mile*amount;
System.out.println("The amount you recieve in mile is : " + milec);
		} // end of if mile
////////////////////////////////////////////////// this will convert the amount into mile
	} // end of metric if
if (USAunits.equals("Imperial")) {
	System.out.print("what conversion would you like :");
	String units = scan.next();
	System.out.print("Amount of conversion: ");
	int amount = scan.nextInt();
	if(units.equals("pound")) {
		double poundc = pound/amount;
	System.out.println("The amount you recieve in pounds is : " + poundc);	
	} // end of if pound
	/////////////////////////////////////////////////// this will convert the amount into pounds
	if(units.equals("ounce")) {
		double ouncec = ounce/amount;
	System.out.println("The amount you recieve in ounces is : " + ouncec);
			} // end of if ounce
	/////////////////////////////////////////////////// this will convert the amount into ounces
	if(units.equals("foot")) {
		double footc = foot/amount;
	System.out.println("The amount you recieve in foot is : " + footc);
	}
	/////////////////////////////////////////////////// this will convert the amount into foot
	if(units.equals("mile")) {
		double milec = mile/amount;
	System.out.println("The amount you recieve in mile is : " + milec);
			} // end of if mile
} // end of if SI
	} // end of public static void 
} // end of public class