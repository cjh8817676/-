package test_p7;


public class test_p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//給car1變數建立物件
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Car car2;   
		car2 = new Car();//給car1變數建立物件
		
		car2.num = 4321;
		car2.gas = 30.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
		
		System.out.println("車號是"+car2.num);
		System.out.println("汽油量是"+car2.gas);
	}

}

class Car
{
	//Car 類別
	int num;
	double gas;
}