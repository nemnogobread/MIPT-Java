package Java.Transport;

public abstract class Transport 
{
    protected float[] speed;
    protected int weight;
    protected float[] coordinates;
    protected String color;
    protected Engine engine = new Engine();

    public Transport() {}

    public Transport(float[] speed, int weight, float[] coordinates, String color)
    {
        this.speed = speed;
        this.weight = weight;
        this.coordinates = coordinates;
        this.color = color;
    }

    public void setValues(float[] speed, int weight, float[] coordinates, String color)
    {
        this.speed = speed;
        this.weight = weight;
        this.coordinates = coordinates;
        this.color = color;
    }

    public void getValues()
    {
        String coord = "x: " + coordinates[0] + "\ty: " + coordinates[1] + "\tz: " + coordinates[2] + "\n" ;
        String sp = "Vx: " + speed[0] + "\tVy: " + speed[1] + "\tVz: " + speed[2] + "\n" ;
        System.out.println("weight: " + weight + "\tcolor: " + color + "\n" + coord + sp);
    }

    public void drive(int time)
    {
        for (int i = 0; i < 3; i++)
        {
            double dist = this.speed[i] * time;
            this.coordinates[i] += dist;
            this.engine.mileage += dist;
            this.engine.fuel -= dist * 0.00000001 * weight;
        }
    }

    public abstract void stop();

    class Engine
    {
        private boolean serviceable;
        private long mileage;
        private double fuel;

        public void setValues(boolean serviceable, long mileage, double fuel)
        {
            this.serviceable = serviceable;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public void getValues()
        {
            String temp;
            if (serviceable)
                temp = "engine is serciceable\n";
            else
                temp = "engine is not serciceable\n";
            System.out.println("engine has mileage: " + mileage + "km; " + fuel + " litrs of fuel left; " + temp);
        }
    }
}
