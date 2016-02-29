import java.io.*;
import javax.swing.*;

import java.util.*;
public class home3 
{
	int [][] Sec3,Sec4,Sec5;
	String[][] Sum;
	int a=0;
	Random rand = new Random();
public String OOPSec3()
	{
		String n1;
		Sec3 = new int[40][5];
		Sum = new String[40][2];
		
		n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\tPoint\n";
		for(int i=0;i<Sec3.length;i++)
		{
			n1 = n1+(i+1)+"\t";
			for(int j=0;j<Sec3[0].length;j++)
			{
				if(j <2)
				{
					Sec3[i][j] = rand.nextInt(31);
				}
				else if(j == 2)
				{
					Sec3[i][j] = rand.nextInt(16);
				}
				else if(j == 3)
				{
					Sec3[i][j] = rand.nextInt(21);
				}
				else
				{
					Sec3[i][j] = rand.nextInt(6);
				}
				a = a + Sec3[i][j];
				n1 = n1 + Sec3[i][j]+"\t";
			}
			n1=n1+"\n";
			Sum[i][0] = Integer.toString(a);
			a = 0;
		}
		return n1;
	}
public String OOPSec4()
	{
		String n1;
		Sec4 = new int[20][4];
		Sum = new String[20][2];
		
		n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\n";
		for(int i=0;i<Sec4.length;i++)
		{
			n1 = n1+(i+1)+"\t";
			for(int j=0;j<Sec4[0].length;j++)
			{
				if(j<2)
				{
					Sec4[i][j] = rand.nextInt(31);
				}
				else
				{
					Sec4[i][j] = rand.nextInt(21);
				}
				a = a + Sec4[i][j];
				n1 = n1 + Sec4[i][j]+"\t";
			}
			n1=n1+"\n";
			Sum[i][0] = Integer.toString(a);
			a = 0;
			
		}
		return n1;
	}
public String OOPSec5()
	{
		
		String n1;
		Sec5 = new int[50][6];
		Sum = new String[50][2];
		
		n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\tTest\tPoint\n";
		for(int i=0;i<Sec5.length;i++)
		{
			n1 = n1+(i+1)+"\t";
			for(int j=0;j<Sec5[0].length;j++)
			{
				if(j<2)
				{
					Sec5[i][j] = rand.nextInt(31);
				}
				else if(j == 2)
				{
					Sec5[i][j] = rand.nextInt(16);
				}
				else if(j < 5)
				{
					Sec5[i][j] = rand.nextInt(11);
				}
				else
				{
					Sec5[i][j] = rand.nextInt(6);
				}
				a = a + Sec5[i][j];
				n1 = n1 + Sec5[i][j]+"\t";
			}
			n1=n1+"\n";
			Sum[i][0] = Integer.toString(a);
			a = 0;
		}
		return n1;
	}
public void Calc()
	{
		int b=0;
		for(int i=0;i<Sum.length;i++)
		{
			b = Integer.parseInt(Sum[i][0]);
			for(int j=1;j == 1;j++)
			{
				if(b >=80 && b<=100)
				{
					Sum[i][j] = "A";
				}
				else if(b >=75 && b<=79)
				{
					Sum[i][j] = "B+";
				}
				else if(b >=70 && b<=74)
				{
					Sum[i][j] = "B";
				}
				else if(b >=65 && b<=69)
				{
					Sum[i][j] = "C+";
				}
				else if(b >=60 && b<=64)
				{
					Sum[i][j] = "C";
				}
				else if(b >=55 && b<=59)
				{
					Sum[i][j] = "D+";
				}
				else if(b >=50 && b<=54)
				{
					Sum[i][j] = "D";
				}
				else if(b >=0 && b<= 49)
				{
					Sum[i][j] = "F";
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Error","MEssage",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		}
		
	}
	
}
