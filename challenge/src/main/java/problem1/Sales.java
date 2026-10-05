package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of salespersons: ");
        Scanner scan = new Scanner(System.in);
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max=Integer.MIN_VALUE;
        int idx=0;
        int min=Integer.MAX_VALUE;
        int idx1=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(max<sales[i]){
                max=sales[i];
                idx=i+1;
            }
            if(min>sales[i]){
                min=sales[i];
                idx1=i+1;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        double avg=(double) sum/sales.length;
        System.out.println("Average sales: "+avg);
        System.out.println("Salesperson "+idx+" had the highest sale with $"+max+".");
        System.out.println("Salesperson "+idx1+" had the lowest sale with $"+min+".");
        System.out.println("Enter a value: ");
        double val=scan.nextDouble();
        int tmp=0;
        for(int i=0;i<sales.length;i++){
            if(sales[i]>val){
                System.out.println("Salesperson "+(i+1)+" exceeded the amount "+val+" with $"+sales[i]+".");
                tmp=tmp+1;
            }
        }
        System.out.println("The number of salespersons who exceeded that amount is: "+tmp);

    }
}