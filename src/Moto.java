public class Moto implements Veiculo{

    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear(){
        System.out.println("A moto está freando");
    }

    public void acidenteDeMoto(){
        System.out.println("A moto sofreu um acidente =(");
    }
}
