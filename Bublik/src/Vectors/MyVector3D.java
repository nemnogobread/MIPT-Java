package Vectors;

public class MyVector3D {
    public float x;
    public float y;
    public float z;

    public MyVector3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MyVector3D(MyVector2D uv, float z){
        this.x = uv.x;
        this.y = uv.y;
        this.z = z;
    }

    public double norm(MyVector2D uv){
        return (Math.sqrt(uv.x * uv.x + uv.y + uv.y));
    }
}
