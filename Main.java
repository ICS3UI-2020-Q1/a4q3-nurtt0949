import java.util.Scanner;

/**
 *Calculate sum from 1 to users number
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner
    Scanner input = new Scanner(System.in);
   //ask user for an integer to count down 
    System.out.println("Please enter an integer to count down to from");
    //declare a variable
    int integer = input.nextInt();
    //declare a variable to keep track of what number we are on
    int count = 1;
    //accumulator to add the count into it
    int total = 0;
    while(count <= integer){
    
    //add the numbers as we go into total
    total = total + count;
    //add 1 to our count to increase it 
    count = count + 1;
    }
    //print total on the screen
    System.out.println("The sum from 1 - " + integer + " is " + total);


  
    
    

		
     }
}  
  
