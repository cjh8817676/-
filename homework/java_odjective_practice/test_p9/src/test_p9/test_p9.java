package test_p9;


public class test_p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//��car1�ܼƫإߪ���
		
		car1.num = 1234;
		car1.gas = 20.5;
	
	}

}

class Car
{
	//Car ���O
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}