import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class home2 {
	int A,E,I,O,U;
	public String getData()
	{
		String name = JOptionPane.showInputDialog(null,"Enter name ","InputData",JOptionPane.QUESTION_MESSAGE);
		name = name.toUpperCase();
		return name;
	}
	public void Calc(String name)
	{
		A=E=I=O=U=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) == 'A')
			{
				A=A+1;
			}
			else if(name.charAt(i) == 'E')
			{
				E=E+1;
			}
			else if(name.charAt(i) == 'I')
			{
				I=I+1;
			}
			else if(name.charAt(i) == 'O')
			{
				O=O+1;
			}
			else if(name.charAt(i) == 'U')
			{
				U=U+1;
			}
		}
	}
	public void Print()
	{
		JOptionPane.showMessageDialog(null,"Have\n"+"A : "+A+"\nE : "+E+"\nI : "+I+"\nO : "+O+"\nU : "+U,"Message",JOptionPane.PLAIN_MESSAGE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		home2 ts2 = new home2();
		name = ts2.getData();
		ts2.Calc(name);
		ts2.Print();
	}

}
