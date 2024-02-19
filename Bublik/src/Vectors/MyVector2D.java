package Vectors;

public class MyVector2D{
    public float x;
    public float y;

    public MyVector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public double norm(){
        return (Math.sqrt(this.x * this.x + this.y * this.y));
    }
}
