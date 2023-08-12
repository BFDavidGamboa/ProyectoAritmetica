import java.util.Scanner;
public class PruebaCaja {

    public static void main(String[] args) {
        Caja caja = new Caja();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter height, width and large:");

        System.out.println("Enter height: ");
        caja.height = myObj.nextDouble();

        System.out.println("Enter width: ");
        caja.width = myObj.nextDouble();

        System.out.println("Enter large: ");
        caja.large = myObj.nextDouble();

        double volume = caja.calculateVolume();
        System.out.println("Se calculo el volumen de la caja " + volume);

    }

}


