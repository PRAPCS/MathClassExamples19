
public class Main
{
   public static void main (String[] args)
   {

       double num1 = 5.2;
       double num2 = -10.5;
       int num3 = 2;
       double num4;

       num4 = Math.abs(num2);
       System.out.println(num4);
       System.out.println(Math.abs(-123456));

       num4 = Math.pow(num1,num3);
       System.out.println(num4);
       System.out.println(Math.pow(2,8));

       System.out.println(Math.sqrt(9));

       num4 = Math.random(); // 0.0 to less than 1.0
       System.out.println("================Random Number Below=========================");
       System.out.println(num4);
       num4 = Math.random()*20;//0.0 to less than 20.0
       System.out.println(num4);
       num3 = (int)(Math.random()*20);//0 to 19
       System.out.println(num3);
       num3 = (int)(Math.random()*20)+1;//1 to 20
       System.out.println(num3);
    }
}
