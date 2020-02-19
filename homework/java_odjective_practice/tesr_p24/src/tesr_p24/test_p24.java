package tesr_p24;

public class test_p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		//傳送不同引數會有不同的效果
		//運算子多載
		car1.setCar(1234,20.5);
		car1.show();
		System.out.println(" ");
		car1.setCar(2345);
		car1.show();
		System.out.println(" ");
		car1.setCar(30.5);
		car1.show();
		System.out.println(" ");
	}

}
class Car
{
	//Car 類別
	private int num;  //外部無法直接存取　
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("將車號設為:"+ num);
	}
	public void setCar(double g)
	{
		gas = g;
		System.out.println("將汽油量設為:"+ gas);
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+ num);
		System.out.println("將汽油量設為:"+ gas);
	}
	public void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
	}
}