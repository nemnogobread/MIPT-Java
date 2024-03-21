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

    public static double scalarProduct(MyVector3D vec1, MyVector3D vec2){
        return (vec1.x * vec2.x + vec1.y * vec2.y + vec1.z * vec2.z);
    }

    public double norm(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public static double cosinus(MyVector3D vec1, MyVector3D vec2){
        double norm1 = vec1.norm();
        double norm2 = vec2.norm();
        double scal = scalarProduct(vec1, vec2);
        return (scal / (norm1 * norm2));
    }

    public static double reflection(MyVector3D lightDiraction, MyVector3D point, MyVector3D cameraPosition, float R){
        float dist = (float) Math.sqrt(point.x * point.x + point.y * point.y);
        MyVector2D Radius = new MyVector2D(point.x * R / dist, point.y * R / dist);
        MyVector3D bublikNormal = new MyVector3D(point.x - Radius.x, point.y - Radius.y, point.z);
        MyVector3D cameraDiraction = new MyVector3D(point.x - cameraPosition.x, point.y - cameraPosition.y, point.z - cameraPosition.z);
        double cosFallAngle = -cosinus(lightDiraction, point);
        double cosFallTwoAngle = 2 * cosFallAngle * cosFallAngle - 1;
        double sinFallTwoAngle = Math.sqrt(1 - cosFallTwoAngle * cosFallTwoAngle);
        double coslightCameraAngle = cosinus(lightDiraction, cameraDiraction);
        double sinlightCameraAngle = Math.sqrt(1 - coslightCameraAngle * coslightCameraAngle);
        double result = coslightCameraAngle * cosFallTwoAngle + sinlightCameraAngle * sinFallTwoAngle;
        return result;
    }

    public static MyVector3D bublik(MyVector2D point, float R, float r){
        MyVector3D pointOnBublik = new MyVector3D(point.x, point.y, 0);
        float temp = (float) (r * r  - Math.pow(R - (float)Math.sqrt(point.x*point.x + point.y*point.y), 2));
        if (temp <= 0){
            return pointOnBublik;
        }
        float z = (float) Math.sqrt(temp);
        pointOnBublik.z = z;
        return pointOnBublik;
    }

    public static MyVector3D ball(MyVector2D point, float R){
        float temp = R * R - point.x * point.x - point.y * point.y;
        MyVector3D pointOnSphere = new MyVector3D(point, 0);
        if (temp <= 0){
            return pointOnSphere;
        }
        float z = (float) Math.sqrt(temp);
        pointOnSphere.z = z;
        return pointOnSphere;
    }
}
