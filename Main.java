/**
 *Returns the last digit of a number
 * @author Jackson 
 */
public class Main {

  public static int firstDigit(int num){
    //calculating the last digit
    int lastNum = num % 10;
    //returning the answer
    return lastNum;

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //
    int lastNum = firstDigit(3572);
    //print answer
    System.out.println(lastNum);
  }
}
