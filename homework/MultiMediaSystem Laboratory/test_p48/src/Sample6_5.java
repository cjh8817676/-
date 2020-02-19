
public class Sample6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("1號車");
		car1.start();
		
		try
		{
			
			car1.join();
		}
		
		catch(InterruptedException w)
		{
			System.out.println("等待當中");
		}
	}

}
class Car extends Thread{
	private String name;
	
	public Car(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行"+ name + "的處裡工作");
		}
		
	}

}