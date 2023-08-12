import java.util.Scanner;
public class PruebaCaja {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter height, width and large:");


        System.out.println("Enter height in cm: ");
        double height = myObj.nextDouble();

        System.out.println("Enter width in cm: ");
        double width = myObj.nextDouble();

        System.out.println("Enter large in cm: ");
        double large = myObj.nextDouble();

        Caja caja = new Caja(large,width,height);


        double volume = caja.calculateVolume();
        System.out.println("Se calculo el volumen de la caja V= " + volume + " cm3");

    }

}


