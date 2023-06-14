import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie einen Farbcode ein (z.B FF00FF):) ");
        String user_input_farbe  = scanner.next();

        String rotHex = user_input_farbe.substring(0, 2);
        int rotDez = Integer.parseInt(rotHex, 16);
        System.out.println("Rotwert: " + rotDez);

        String gruenHex = user_input_farbe.substring(2, 4);
        int gruenDez = Integer.parseInt(gruenHex, 16);
        System.out.println("Grünwert: " + gruenDez);

        String blauHex = user_input_farbe.substring(4, 6);
        int blauDez = Integer.parseInt(blauHex, 16);
        System.out.println("Blauwert: " + blauDez);

    }
}