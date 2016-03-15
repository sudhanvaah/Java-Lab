import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Prime extends JPanel implements ActionListener
{
	JLabel l1,l2;
	JTextField t;
	JComboBox<Integer> c;
	JButton b;
	boolean isPrime(int a)
	{
		if(a==2)
			return true;
		for(int i=2;i<=a/2;i++)
		{
			if((a%i)==0)
				return false;
		}
		return true;
	}
	Prime()
	{
		l1=new JLabel("How many primes?");
		l2=new JLabel("Primes are");
		t=new JTextField(10);
		c=new JComboBox<Integer>();
		b=new JButton("Clickme");
		b.addActionListener(this);
		setLayout(null);
		add(l1);
		l1.setBounds(100, 100, 140, 20);
		l2.setBounds(100, 130, 200, 20);
		t.setBounds(250, 100, 140, 20);
		c.setBounds(250, 130, 140, 20);
		b.setBounds(250, 200, 100, 20);
		add(t);add(l2);add(c);add(b);
	}
	public void actionPerformed(ActionEvent arg0) {
		int a,l=1;
		if(arg0.getSource()==b)
		{
			c.removeAllItems();
			a=Integer.parseInt(t.getText());
			for(int i=0;i<a;i++)
			{
				for(int j=l+1;;j++)
				{
					if(isPrime(j))
					{
						l=j;
						c.addItem(j);
						break;
					}
				}
			}
		}
		
	}
	public static void main(String ar[])
	{
		JFrame frame=new JFrame("Prime");
		frame.getContentPane().add(new Prime());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.setVisible(true);
	}
}
