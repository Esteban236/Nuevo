package clases;

public class Carro {

    //atributos

    String Marca;
    String Modelo;
    int km;

    //Metodos

    public static void main (String [] args){

        Carro carro1 = new Carro();

        carro1.Marca = "Audi";
        carro1.Modelo= "RMG";
        carro1.km = 0 ;


        System.out.println("Marca es:"+carro1.Marca);
    }

}
