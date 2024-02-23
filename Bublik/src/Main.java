import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import Vectors.MyVector2D;
import Vectors.MyVector3D;

import static Vectors.MyVector3D.*;

public class Main {

    public class Globals {
        public static int hight = 29;
        public static int width = 120;
    }

    public static String formation(char[][] array){
        int hight = Globals.hight;
        int widht = Globals.width;
        String result = "";

        for (int i = 0; i < hight; i++){
            String formattedString = Arrays.toString(array[i])
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .replace(" ", "")
                    .trim();
            result += formattedString;
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        int hight = Globals.hight;
        int width = Globals.width;
        char[][] charArray = new char [hight][width];
        char[] gradient1 = {':', '/', '(', 'z', 'l', '1', '4', 'H', '9', 'W', '8', '$', '@'};
        int gradient1Size = 13;
        float windowAspect = (float) width / (float) hight;
        float pixelAspect = 0.5f;
        MyVector3D cameraPosition = new MyVector3D(0, 0, 5);
        float Radius = 0.9f;

        for (int t = 0; t < 10000; t++)
        {
            MyVector3D lightDiraction = new MyVector3D(0 , (float)Math.sin(0.001f * t)*1, -(float)Math.cos(0.001f * t)*1);
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < hight; j++) {
                    float x = ((float) i / width * 2.0f - 1.0f) ;
                    float y = -((float) j / hight * 2.0f - 1.0f);
                    x *= windowAspect * pixelAspect;
                    MyVector2D point = new MyVector2D(x, y);

                    if (Radius * Radius - point.x * point.x - point.y * point.y > 0){
                        MyVector3D positivePoint = ball(point, 0.9f);
                        MyVector3D nevativePoint = new MyVector3D(positivePoint.x, positivePoint.y, -positivePoint.z);
                        double cosinus = reflection(lightDiraction, positivePoint, cameraPosition);

                        if (cosinus > 0) {
                            int posInGradient = (int) Math.round(cosinus * (gradient1Size));
                            posInGradient = Math.max(Math.min(posInGradient, gradient1Size - 1), 0);
                            charArray[j][i] = gradient1[posInGradient];
                        }
                        else{
                            charArray[j][i] = '.';
                        }
                    }
                    else{
                        charArray[j][i] = '.';
                    }
                }
            }

            String consolResult = formation(charArray);
            System.out.println(consolResult);
        }
    }
}