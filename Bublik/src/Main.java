import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import Vectors.MyVector2D;
import Vectors.MyVector3D;

public class Main {

    public class Globals {
        public static int hight = 29;
        public static int widht = 120;
    }

    public static String formation(char[][] array){
        int hight = Globals.hight;
        int widht = Globals.widht;
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
        int widht = Globals.widht;
        char[][] charArray = new char [widht][hight];
        char[] gradient = {'.', ':', '/', ',', '(', 'l', '1', 'z', '4', 'H', '9', 'W', '8', '$', '@'};
        float windowAspect = (float) widht / hight;
        float pixelAspect = 0.5f;

        for (int t = 0; t < 10000; t++)
        {
            for (int i = 0; i < widht; i++) {
                for (int j = 0; j < hight; j++) {
                    float x = ((float) i / hight * 2.0f - 1.0f) ;
                    float y = -((float) j / widht * 2.0f - 1.0f);
                    MyVector2D uv = new MyVector2D(x, y);
                    x *= windowAspect * pixelAspect;
                    if (Math.pow(x, 2) + Math.pow(y, 2) <= 0.5){
                        charArray[i][j] = '@';
                    } else {
                        charArray[i][j] = '.';
                    }
                }
            }

            String consolResult = formation(charArray);

            System.out.println(String.format("%s", consolResult));
            //TimeUnit.SECONDS.sleep(1);
        }
    }
}