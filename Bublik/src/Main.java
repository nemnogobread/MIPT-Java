import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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
        float windowAspect = (float) widht / hight;
        float pixelAspect = 0.5f;
        char[][] charArray = new char [hight][widht];

        for (int t = 0; t < 5000; t++)
        {
            for (int i = 0; i < hight; i++) {
                for (int j = 0; j < widht; j++) {
                    float x = ((float) j / widht * 2.0f - 1.0f);
                    float y = -((float) i / hight * 2.0f - 1.0f);
                    x *= windowAspect * pixelAspect;
                    if (Math.pow(x - Math.sin(0.002f * t), 2) + Math.pow(y, 2) <= 0.5f) {
                        charArray[i][j] = '@';
                    } else if ((i == 0 && j == 0 ) || (i == hight - 1 && j == widht - 1 )) {
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