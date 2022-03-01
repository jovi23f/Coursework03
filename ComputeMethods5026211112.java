import java.util.Random;
public class ComputeMethods5026211112{
   public double fToC (double degreesF) {
   double celcius;
   celcius = 5/9.0 * (degreesF-32);
   return celcius;
   }
   
   public double hypotenuse(int a, int b) {
   double c;
   c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
   return c;
   }

   public int roll(){
   Random randomDice = new Random();
   
   int dice1 = randomDice.nextInt(6)+ 1;
   int dice2 = randomDice.nextInt(6)+ 1;
   return dice1+dice2;
   }
}