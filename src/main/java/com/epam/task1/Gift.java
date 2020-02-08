package com.epam.task1;
import java.util.Scanner;
public class Gift {
	int weight=0;
    public void collect()
    {
        
        System.out.print("Enter your gift weight: ");
        Scanner s=new Scanner(System.in);
        weight=s.nextInt();
        
    }
    public int total()
    {
        return weight;
    }

}
