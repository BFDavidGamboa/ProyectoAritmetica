// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Aritmetica {

    int a;
    int b;
    public Aritmetica(){

        System.out.println("Ejecutando constructor vacio");
    }

    public Aritmetica(int arg1, int arg2) {

        this.a = arg1;
        this.b = arg2;
    }
   public int sumar(int a, int b){
       int result = a + b;
       return result;
   }

   public int sumarAtributosDeClase(){
         return this.a +this.b;
   }

    public int restar(){
        return this.a - this.b;
    }

    public int multiplicar(){
        return this.a * this.b;
    }

    public int dividir(){
        return this.a / this.b;
    }

}