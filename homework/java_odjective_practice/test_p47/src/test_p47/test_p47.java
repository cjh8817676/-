package test_p47;
import java.io.*;

public class test_p47 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1����";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
		
	}

}
class Car
{
	private int num;  
	private double gas;
	private String name;
	
	public Car()  //�غc�l
	{
		num = 0;
		gas = 0.0;
		name = "�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F����"+num+"�T�o�q��"+gas+"�����l");
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("�N���W�אּ"+name);
	}
	
	public void show()
	{
		System.out.println("�����O:"+ this.num);
		System.out.println("�T���o�q:"+ this.gas);
		System.out.println("���W��"+name);
	}
}