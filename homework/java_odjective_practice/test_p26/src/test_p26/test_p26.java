package test_p26;

public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();// �إ߷s����N�|�I�s�غc�l
		
		car1.show();
	}

}
class Car
{
	//Car ���O
	private int num;  //�~���L�k�����s���@
	private double gas;
	
	public Car()  //�Q�I�s���غc���]�غc�l�^
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void show()
	{
		System.out.println("�����O:"+ this.num);
		System.out.println("�T���o�q:"+ this.gas);
	}
}