public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 3;

        int result = aritmetica.sumar(1,2);
        int result2 = aritmetica.sumarAtributosDeClase();

        System.out.println("Resutlado:  " + result);
        System.out.println("Resutlado:  " + result2);


        //Creation of second object aritmetica
        Aritmetica aritmetica2 = new Aritmetica(4,2);

        System.out.println("resultado 2 = " + aritmetica2.sumarAtributosDeClase());

        int operandoA = 6;
        int operandoB = 2;

        //Creamos un objeto de la clase aritmetica enviando argumentos

        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //imprimimos los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimoss el resultado de la suma

        System.out.println("\nResultado suma: " + objeto1.sumarAtributosDeClase())  ;

        //Imprimimos el resultado de la resta
        System.out.println("\nResultado resta: " + objeto1.restar());

        //Imprimimos el resultado de la multiplicacion
        System.out.println("\nResultado de la multiplicacion: " + objeto1.multiplicar());


        //Imprimimos el resultado de la division
        System.out.println("\nResultado de la multiplicacion: " + objeto1.dividir());

    }


}

