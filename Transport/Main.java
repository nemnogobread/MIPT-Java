package Java.Transport;

public class Main 
{
    public static void main(String[] args)
    {
        Car cadilac = new Car(new float[] {1, 0, 2}, 1000, new float[] {0, 0, 0}, "black");
        Truck kamaz = new Truck(new float[] {2, 1, 0}, 2500, new float[] {0, 0, 0}, "orange", false);
        cadilac.engine.setValues(true, 1000, 10);
        kamaz.engine.setValues(true, 8400, 200);

        cadilac.getValues();
        cadilac.drive(10);
        cadilac.getValues();

        kamaz.getValues();
        kamaz.engine.getValues();
        kamaz.drive(10);
        kamaz.getValues();
        kamaz.stop();
        kamaz.getValues();
        kamaz.engine.getValues();
    }
}
