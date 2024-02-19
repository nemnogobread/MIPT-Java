import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import Vectors.MyVector2D;
import Vectors.MyVector3D;

import static Vectors.MyVector3D.ball;

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
        char[] gradient = {':', '/', '(', 'l', '1', 'z', '4', 'H', '9', 'W', '8', '$', '@'};
        int gradientSize = 13;
        float windowAspect = (float) width / (float) hight;
        float pixelAspect = 0.5f;

        for (int t = 0; t < 10000; t++)
        {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < hight; j++) {
                    float x = ((float) i / width * 2.0f - 1.0f) ;
                    float y = -((float) j / hight * 2.0f - 1.0f);
                    x *= windowAspect * pixelAspect;
                    MyVector2D point = new MyVector2D(x, y);
                    MyVector3D camera = new MyVector3D((float)Math.sin(t*0.002f)*0.4f, (float)Math.cos(t*0.002f)*0.4f, 5);
                    MyVector3D lightDiraction = new MyVector3D(point.x - camera.x, point.y - camera.y , -camera.z);
                    double cosinus = lightDiraction.cosinus(ball(point, 0.9f));
                    if (cosinus < 0){
                        double brightness = -cosinus;
                        int posInGradient =  (int) Math.round(brightness * (gradientSize));
                        if (posInGradient > gradientSize - 1){
                            posInGradient = gradientSize - 1;
                        }
                        charArray[j][i] = gradient[posInGradient];
                    } else {
                        charArray[j][i] = '.';
                    }

                }
            }

            String consolResult = formation(charArray);
            System.out.println(consolResult);
        }
    }
}