package pckg_VJ_Z1_bezGUIa;



import pckg_VJ_Z1_bezGUIa.calculationStrats.AdditionStrat;
import pckg_VJ_Z1_bezGUIa.calculationStrats.DivisionStrat;
import pckg_VJ_Z1_bezGUIa.calculationStrats.MultiplicationStrat;
import pckg_VJ_Z1_bezGUIa.calculationStrats.SubtractionStrat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static Scanner sc;
    private static double fstNum;
    private static double sndNum;

    public static void main(String[] args) {

        AdditionStrat additionStrategy = new AdditionStrat();
        SubtractionStrat subtractionStrategy = new SubtractionStrat();
        MultiplicationStrat multiplicationStrategy = new MultiplicationStrat();
        DivisionStrat divisionStrategy = new DivisionStrat();

        boolean flag = true;
        while(flag) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter the first number: ");
                fstNum = sc.nextDouble();
                System.out.println("Enter the second number: ");
                sndNum = sc.nextDouble();
                System.out.println("Enter the operation: ");
                sc.nextLine();
                String operation = sc.nextLine().trim().toLowerCase();
                switch (operation) {
                    case "addition":
                        additionStrategy.performCalculation(fstNum, sndNum);
                        break;
                    case "subtraction":
                        subtractionStrategy.performCalculation(fstNum, sndNum);
                        break;
                    case "multiplication":
                        multiplicationStrategy.performCalculation(fstNum, sndNum);
                        break;
                    case "division":
                        divisionStrategy.performCalculation(fstNum, sndNum);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        break;
                }
            } catch (ArithmeticException are) {
                System.out.println("Please enter a valid number.");
            }catch (InputMismatchException ime){
                System.out.println("Please enter numbers and letters appropriately!");
            }finally {
                System.out.println("Would you like to continue? (y/n)");
                sc.nextLine();
                String choice = sc.nextLine().trim().toLowerCase();
                if (!choice.equals("y")) {
                    flag = false;
                }
            }
        }
    }
}
