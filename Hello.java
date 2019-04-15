import java.util.Arrays;

/*
 * First Java program to say Hello
 */

 public class Hello{
   public static void main(String[] args){
      System.out.println("Hello, World!");
      int[] jerome = {1, 3};
      int[] bjerome = new int[2];
      int[] cjerome = new int[]{1,2};
      int sum = 0;
      String jeromeString = Arrays.toString(jerome[0,1]);
      System.out.println(jerome);
      System.out.println(jeromeString);
      System.out.println(jerome.length);
      for(int i=0; i<jerome.length;i++){
        sum += jerome[i];
      }
      System.out.println(sum);

   }
 }
