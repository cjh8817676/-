package test_p31;

public class test_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car.showSum();//�����إߪ���Y�i�I�s���O��k
		
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		car2 = new Car();
		car2.setCar(4567, 30.5);
	}

}
class Car
{
public static int sum = 0;//���O�ܼ�(static������r)

	private int num;  //�~���L�k�����s���@
	private double gas;
	
	public Car()  //�]�غc�l�^
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F����"+num+"�T�o�q��"+gas+"�����l");
	}
	
	public static void showSum()//���O��k
	{
		System.out.println("���l�@��"+ sum + "�x");
	}
	
	public void show()
	{
		System.out.println("�����O:"+ this.num);
		System.out.println("�T���o�q:"+ this.gas);
	}
}