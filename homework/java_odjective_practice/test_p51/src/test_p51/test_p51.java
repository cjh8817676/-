package test_p51;
import java.io.*;
public class test_p51 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Car[] car1;////Car[]型態與變數的陣列　宣告
		car1 = new Car[3];  //宣告３個Car類別型態的陣列元素
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i] = new Car(); //真正建立３個物件
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
	
	public Car()  //建構子
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車為"+num+"汽油量為"+gas+"的車子");
	}	
	public void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
	}
}