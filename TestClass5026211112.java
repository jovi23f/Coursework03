public class TestClass5026211112{
   public static void main (String[] args) {
   file1 product= new file1();

   double temp = product.fToC(100);
   System.out.println("100F= " +temp+ "C");

   double hypo = product.hypotenuse(7,8);
   System.out.println("Panjang hypotenusenya adalah "+hypo);

   int dice = product.roll();
   System.out.println("Jumlah nilai dari kedua dadu tersebut yaitu "+dice);
   }

}