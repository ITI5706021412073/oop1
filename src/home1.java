import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class home1 {
	
	int Sec,Min,Hour,Day;
	public void getData()
	{
		Sec = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Sec","Input",JOptionPane.QUESTION_MESSAGE));
	}
	public void Calc()
	{
		Min = Sec / 60;
		Sec = Sec % 60;
		
		Hour = Min / 60;
		Min = Min % 60;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
