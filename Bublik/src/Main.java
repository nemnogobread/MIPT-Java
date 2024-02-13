import java.util.Arrays;

public class Main {
    public static String[] formation(char[][] array){
        String[] result = new String[30];
        for (int i = 0; i < 30; i++){
            String formattedString = Arrays.toString(array[i])
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .replace(" ", "")
                    .trim();
            result[i] = formattedString;
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] charArray = new char [30][120];
        for (int i = 0; i < 30; i++){
            for (int j = 0; j < 120; j++) {
                if (Math.pow(i-15, 2) + Math.pow((j-60)/2 ,2) <= 100){
                    charArray[i][j] = '@' ;
                }
                else {
                    charArray[i][j] = '.' ;
                }
            }
        }

        String[] consolResult = formation(charArray);

        for (int i = 0; i < 30; i++){
            System.out.println(String.format("%s", consolResult[i]));
        }
    }
}