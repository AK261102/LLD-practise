package ASHISH_CODE_HIMSELF.Payment_Processing_Practise;

public class Main {
    public static void main(String[] args) {
        DeliveryfeeCalculator calcular = new DeliveryfeeCalculator();
        calcular.registerStrategies(new Standard_Delivery());
        System.out.println(calcular.calculateFee(6, 10, "Standard"));
    }
}
