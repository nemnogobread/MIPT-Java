package Java.Transport;

public class Car extends Transport
{
    public Car(float[] speed, int weight, float[] coordinates, String color)
    {
        super(speed, weight, coordinates, color);
    }

    @Override
    public void stop() 
    {
        for (int  i = 0; i < 3; i++)
        {
            coordinates[i] += speed[i] * 0.001 * weight;
            speed[i] = 0;
        }    
        
    }
}
