import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;



/* Name: Hanaka Johnson
 * Overview: Create a program that uses random number generation to roll two different dies. 
 * Input: Number of sides for dice 1 and 2, 
 * Output: Number for first, second and third roll, sum of rolls, average of rolls.
 * Variables:dice1, dice2, d1roll1, d2roll2, d1roll2, d2roll2, d1roll3, d2roll3, 
 */

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Random generator = new Random ();
int dice1=0;
int dice2=0;

double average;
Scanner scan= new Scanner(System.in);
System.out.println("How many sides does die 1 have? ");
dice1= scan.nextInt();


System.out.println("How many sides does die 2 have? ");
dice2= scan.nextInt();

int d1roll1= 0;
int d2roll1= 0;
int d1roll2= 0;
int d2roll2=0;
int d1roll3= 0;
int d2roll3= 0;


d1roll1 = generator.nextInt(dice1)+ 1;

System.out.println("Die 1 first roll= "+ d1roll1);

d2roll1 = generator.nextInt(dice2) + 1;
System.out.println("Die 2 first roll= "+ d2roll1);

d1roll2 = generator.nextInt(dice1)+ 1;
System.out.println("Die 1 second roll: "+ d1roll2);

d2roll2 = generator.nextInt(dice2)+1;
System.out.println("Die 2 second roll: "+ d2roll2);

d1roll3 = generator.nextInt(dice1)+1;
System.out.println("Die 1 third roll: "+ d1roll3);

d2roll3 = generator.nextInt(dice2)+1;
System.out.println("Die 2 third roll: "+ d2roll3);

DecimalFormat fmt = new DecimalFormat("0.##");
NumberFormat decimalfmt = new DecimalFormat("0.##");
int total1= d1roll1+ d1roll2+ d1roll3; 
int average1 = (d1roll1+d1roll2+d1roll3)/3;
System.out.println("Die 1 rolled a total of "+ total1 + " and rolled "+ decimalfmt.format(average1) + " on average.");

int total2 = d2roll1+ d2roll2+ d2roll3;
int average2 = d2roll1+ d2roll2+ d2roll3;
System.out.println("Die 2 rolled a total of "+ total2 + " and rolled "+ decimalfmt.format(average2) +" on average.");



	}

}
