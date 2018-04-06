public class Electrodomesticos {
     protected double PrecioBase = 100;
    protected String color = "blanco";
    protected char ConsumoE = 'A';
    protected int Peso = 5;
    char[] ACon = {'A','B','C','D','E','F'};
    String[] AColo = {"blaco","negro","rojo","azul","gris"};

    public Electrodomesticos() {
    }
    public Electrodomesticos(double precio, int peso){
        this.Peso = peso;
        this.PrecioBase = precio;
    }
    public Electrodomesticos(double precio,String Color, char Consumo, int peso){
        this.ConsumoE = Consumo;
        this.Peso = peso;
        this.PrecioBase = precio;
        this.color = Color;
    }

    public void setPrecioBase(double PrecioBase) {
        this.PrecioBase = PrecioBase;
    }


    public double getPrecioBase() {
        return PrecioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoE() {
        return ConsumoE;
    }

    public int getPeso() {
        return Peso;
    }

    public  void comprobarConsumoEnergetico(char letra){
        char Buena = 'F';
        for (int i=0; i<ACon.length; i++){
            if(ACon[i] == letra){
                Buena = ACon[i];
            }
        }
        this.ConsumoE = Buena;
        System.out.println("Consumo "+ ConsumoE);
    }

    public void comprobarColor(String color){
        String Orinigal = "blanco";
        for(int i= 0; i<AColo.length;i++){
            if(color.equalsIgnoreCase(AColo[i])){
                Orinigal = AColo[i];
            }
        }
        this.color = Orinigal;
    }
    public void precioFinalP(){
        double Total = 0;
        switch (this.ConsumoE){
            case 'A':
                Total = 100;
                break;
            case 'B':
                Total = 80;
                break;
            case 'C':
                Total = 60;
                break;
            case 'D':
                Total = 50;
                break;
            case 'E':
                Total = 30;
                break;
            case 'F':
                Total = 10;
                break;
        }

        if(Peso<=19 && Peso >0 ){
            Total = Total +10;
        }else if(Peso >=20 && Peso <=49){
            Total = Total + 50 ;
        }else if(Peso >=50 && Peso <= 79){
            Total = Total + 80;
        }else if (Peso >= 80 ){
            Total = Total + 100;
        }
        this.PrecioBase = this.PrecioBase + Total;
    }
}
