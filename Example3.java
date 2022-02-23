import java.util.Scanner;
public class Example3{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double units,gst,bill,finalbill;
      System.out.println("Enter the number of units :");
      units=sc.nextFloat();
      bill=(units*34.50);
      gst=(bill*18)/100;
      finalbill=bill+gst;
      System.out.println("Enter the Final bill"+finalbill);
    }
}