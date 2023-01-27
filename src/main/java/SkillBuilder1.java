import java.util.Scanner;


/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        String userName = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double math_Expression = ((4.0/3.0)*Math.pow(2.0,(Math.sqrt(5.0)/Math.pow( spice, 3.0))));
        System.out.println("Well "+userName+", the spice value resulted in "+math_Expression);
        //System.out.printf("And the converted value is %.2f\n", math_Expression);
        System.out.println("And the converted value is " + String.format("%.2f", math_Expression));


    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;

        double wallWidth;

        double wallArea;

        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
       // final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
         wallArea = (int)(wallHeight*wallWidth);
        System.out.println("Wall area: "+wallArea+" square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;

        System.out.println("Paint needed:" + String.format("%.2f", gallonsPaintNeeded)+  "gallons");
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
           //double gallon_Needed = 0.0;
           cansNeeded = (int)Math.ceil(gallonsPaintNeeded);
           System.out.println("Cans needed: "+ cansNeeded+" can(s)");
    }
}
