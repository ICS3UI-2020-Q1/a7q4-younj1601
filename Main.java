/**
 *Returns the last digit of a number
 * @author Jackson 
 */
public class Main {

  public static int lastDigit(int num){
    //check if it is negative then change it
    if(num < 0){
      num = num*-1;
    }
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
    int lastNum = lastDigit(-3572);
    //print answer
    System.out.println(lastNum);
  }
}
