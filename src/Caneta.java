public class Caneta {
    String cor;
     String modelo;
     float ponta;
     int carga;
     boolean tampada;

    void status()
    {
        System.out.println(" o modelo é " + this.modelo + "\n");
        System.out.print("caneta de cor " + this.cor );
        System.out.print("e esta tampada " + this.tampada + "\n");
        System.out.println("a ponta é " + this.ponta + "\n");
        System.out.println("a cagar da caneta é de " + this.carga);

    }
    void rebiscar()
    {
        if (tampada)
        {
            System.out.println("não pode escrever com a tampada ");
        } else
            {
                System.out.println(" escrever");
            }
    }

    void setTampada()
   {
       this.tampada = true;
   }

   void setDestampada()
   {
       this.tampada = false;
   }

}