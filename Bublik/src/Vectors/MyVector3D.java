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

    public double scalarProduct(MyVector3D other){
        return (this.x * other.x + this.y * other.y + this.z * other.z);
    }

    public double norm(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double cosinus(MyVector3D other){
        double norm1 = this.norm();
        double norm2 = other.norm();
        double scal = this.scalarProduct(other);

        return (scal/(norm1 * norm2));
    }

    public static MyVector3D ball(MyVector2D point, float Radius){
        float temp = Radius * Radius - point.x * point.x - point.y * point.y;
        MyVector3D pointOnSphere = new MyVector3D(point, 0);
        if (temp <= 0){
            return pointOnSphere;
        }
        float z = (float) Math.sqrt(temp);
        pointOnSphere.z = z;
        return pointOnSphere;
    }
}
