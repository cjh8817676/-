package test_p27;


public class test_p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		// �إ߷s����N�|�I�s�غc�l
		car1 = new Car();//�I�s�S���Ѽƪ��غc��
		
		car1.show();
		
		Car car2;
		car2 = new Car(1234,25.0);//�I�s��ӰѼƪ��غc��
		
		car2.show();
	}

}
class Car
{
	//Car ���O
	private int num;  //�~���L�k�����s���@
	private double gas;
	
	//�B��l�h��
	public Car()  //�Q�I�s���غc���]�غc�l�^
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car(int n, double g)  //�Q�I�s���غc���]�غc�l�^
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F����"+num+"�T�o�q��"+gas+"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O:"+ this.num);
		System.out.println("�T���o�q:"+ this.gas);
	}
}