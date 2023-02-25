import java.util.Random;

public class Dice {


//1. Create a class named **Dice** that has 3 private instance variables:


  private int sideFacingUp;
  private final int sides;
  private final Random randomGenerator;

  //2. Create a Dice **constructor** that takes an integer parameter **sides**, assigns it to the instance variable
  // **sides**, and initializes an instance of the **Random** class.
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

  // 3. Add two methods to the Dice class


//    * Method 1 should be named **roll** and should use **randomGenerator** to generate a random
//    number between 1 and **sides**, and assign that number to the instance variable
//    **sideFacingUp**
    public void roll() {
        this.sideFacingUp = this.randomGenerator.nextInt(this.sides)+1;
    }


//            * Method 2 should be named **view** and should simply return the value stored in the instance variable **sideFacingUp**
    public int view(){
        return this.sideFacingUp;
    }
}
