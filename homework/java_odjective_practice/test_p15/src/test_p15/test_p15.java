package test_p15;


public class test_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//��car1�ܼƫإߪ���
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,gasoline);
	}

}
class Car
{
	//Car ���O
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�������]��:"+num+"�T�o�q���]��:"+gas);
	}
	void showcar()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q" + gas);
		
	}
}