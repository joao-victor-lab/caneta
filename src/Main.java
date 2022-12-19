public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.setDestampada();
        c1.cor = "blue";
        c1.modelo = "bic";
        c1.carga = 45;
        c1.ponta = 1.4f;
        c1.status();
        c1.rebiscar();

    }

}
