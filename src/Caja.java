public class Caja {
    double large, width, height;

    public Caja(){

    }

    public Caja(double large, double width, double height){

        this.large = large;
        this.width = width;
        this.height = height;

    }

    public double calculateVolume(){
        return this.height * this.width * this.large;
    }
}
