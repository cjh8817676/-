package test_p7;


public class test_p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//��car1�ܼƫإߪ���
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Car car2;   
		car2 = new Car();//��car1�ܼƫإߪ���
		
		car2.num = 4321;
		car2.gas = 30.5;
		
		System.out.println("�����O"+car1.num);
		System.out.println("�T�o�q�O"+car1.gas);
		
		System.out.println("�����O"+car2.num);
		System.out.println("�T�o�q�O"+car2.gas);
	}

}

class Car
{
	//Car ���O
	int num;
	double gas;
}