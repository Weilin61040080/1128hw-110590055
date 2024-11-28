public class p6 
{
    public static void main(String[] args) 
    {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
    }
}


class Car 
{
    private int num;
    private double gas;

    public Car() 
    {
        num = 0;
        gas = 0.0;
        System.out.println("made a car");
    }

    public Car(int n, double g) 
    {
        num = n;
        gas = g;
        System.out.println("set number " + num + ",set gas " + gas);
    }

    public void setCar(int n, double g) 
    {
        num = n;
        gas = g;
        System.out.println("set number " + num + ",set gas " + gas);
    }

    public void show()
    {
        System.out.println("number is " + num);
        System.out.println("gas is " + gas);
    }
}

class RacingCar extends Car 
{
    private int course;

    public RacingCar() 
    {
        course = 0;
        System.out.println("made a racingcar");
    }

    public RacingCar(int n, double g, int c) 
    {
        super(n, g);
        course = c;
        System.out.println("made " + course + " racingcar");
    }

    public void setCourse(int c) 
    {
        course = c;
        System.out.println("set racingcar course " + course);
    }
}
