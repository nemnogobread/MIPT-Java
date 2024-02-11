package Java.Transport;

public class Truck extends Transport
{
    private boolean loaded;

    public Truck(float[] speed, int weight, float[] coordinates, String color)
    {
        super(speed, weight, coordinates, color);
    }

    public Truck(float[] speed, int weight, float[] coordinates, String color, boolean loaded)
    {
        this.speed = speed;
        this.weight = weight;
        this.coordinates = coordinates;
        this.color = color;
        this.loaded = loaded;
    }

    @Override
    public void getValues()
    {
        super.getValues();
        if (loaded)
            System.out.println("Грузовик загружен\n");
        else 
            System.out.println("Грузовик не загружен\n");
    }

    @Override
    public void stop() 
    {
        for (int  i = 0; i < 3; i++)
        {
            coordinates[i] += speed[i] * 0.003 * weight;
            speed[i] = 0;
        }    
    }
}
