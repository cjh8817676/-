package test_p51;
import java.io.*;
public class test_p51 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Car[] car1;////Car[]���A�P�ܼƪ��}�C�@�ŧi
		car1 = new Car[3];  //�ŧi����Car���O���A���}�C����
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i] = new Car(); //�u���إߢ��Ӫ���
		}
		
		car1[0].setCar(1234, 20.5);
		car1[1].setCar(2347, 30.5);
		car1[2].setCar(3456, 40.5);
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}

}
class Car
{
	private int num;  
	private double gas;
	
	public Car()  //�غc�l
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F����"+num+"�T�o�q��"+gas+"�����l");
	}	
	public void show()
	{
		System.out.println("�����O:"+ this.num);
		System.out.println("�T���o�q:"+ this.gas);
	}
}