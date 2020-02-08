package com.epam.task1;
import java.util.Scanner;
public class Main 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("Enter the number of Chocolates: ");
        int n=sc.nextInt();
        int c[]=new int[n];
        int x[]=new int[n];
        Chocolates ob[]=new Chocolates[n];
        for(i=0;i<n;i++)
        {
        	System.out.println("Chocolate["+(i+1)+"]:");
            ob[i]= new Chocolates();
            ob[i].collect();
            c[i]=ob[i].get_weight();
            sum=sum+ob[i].get_weight();
        }
        int temp=0;
        System.out.println("Sorted weight of Chocolates in gift:");
        for(i=1;i<n;i++)
        {
            temp=c[i];
            x[i]=c[i];
            for(j=i-1;j>=0&&c[j]>temp;j--)
            {
                c[j+1]=c[j];
            }
            c[j+1]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number of Sweets: ");
        int m=sc.nextInt();
        
        Sweets ob1[]=new Sweets[m];
        for(i=0;i<m;i++)
        {
        	System.out.println("Sweets["+(i+1)+"]:");
            ob1[i]=new Sweets();
            ob1[i].collect();
            sum=sum+ob1[i].get_w();
        }
        System.out.println("Enter the range for checking Candies:");
        System.out.print("Enter the lower limit: ");
        int low=sc.nextInt();
        System.out.println("Enter the higher limit: ");
        int high=sc.nextInt();
        boolean check=true;
        for(i=0;i<n;i++)
        {
            if(low<=x[i] && x[i]<=high)
            {
            	System.out.println("Chocolate["+(i+1)+"] is a Candy");
            	check=false;
            }
        }
        if(check)
        {
        	System.out.println("There is no Candy!");
        }
        System.out.println("Total weight of the Gift: "+sum);
    }
}
