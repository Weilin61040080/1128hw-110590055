public class p38 
{
	public static void main(String[] args) 
	{
		IVehicle[] ivc;
		ivc = new IVehicle[2];

		ivc[0] = new Car(1234, 20.5);

		ivc[1] = new Plane(232);

		for (int i = 0; i < ivc.length; i++) 
		{
			ivc[i].show();
		}
	}
}

interface IVehicle 
{
	int weight = 1000;
	void show();
}

class Car implements IVehicle 
{
	private int num;
	private double gas;

	public Car(int n, double g) 
	{
		num = n;
		gas = g;
        System.out.println("set number " + num + ",set gas " + gas);
	}

	public void show() 
	{
		System.out.println("number is " + num);
		System.out.println("gas is  " + gas);
	}
}

class Plane implements IVehicle {
	private int flight;

	public Plane(int f) {
		flight = f;
		System.out.println("made a  " + flight + " schedule plane");
	}

	public void show() {
		System.out.println("The flight schedule is " + flight);
	}
}
