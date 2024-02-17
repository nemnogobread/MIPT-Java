package Vectors;

public class MyVector2D{
    public float x;
    public float y;

    public MyVector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public double norm(MyVector2D uv){
        return (Math.sqrt(uv.x * uv.x + uv.y + uv.y));
    }
}
