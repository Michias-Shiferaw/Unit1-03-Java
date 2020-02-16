/**
 * Class Einstein
 */
public class Einstein {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a mass (kg).");
      //place the user's input in a specified variable
      double mass1 = input.nextDouble();

     System.out.println("Please enter a mass (kg).");
     //input
     Scanner wordScanner = new Scanner(System.in);
     //final double mass1 = wordScanner.nextDouble();
     double speedOfLight = (299792458);
     
     //process
     final double energy1 = (mass1 * speedOfLight * speedOfLight);
     final double kilotonE = energy1 * 0.00000000000023901;
     
     //output
     System.out.println("This mass releases " + energy1 + "J of energy.");
     System.out.println( " " + mass1 + "kg can also be equivalent to" + kilotonE + "kt bombs.") ;
  }
  
}
