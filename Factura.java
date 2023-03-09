
public class Factura {
    private int consumokWh;

    public int getConsumokWh() {
        return consumokWh;
    }

    public void setConsumokWh(int consumokWh) {
        this.consumokWh = consumokWh;
    }

    public int calcularPrezokWh(){
        int prezokWh=0;
        if (consumokWh<=300){
            prezokWh=9;
        }else if(consumokWh<=600){
            prezokWh=8;
        }else if(consumokWh<=1000){
            prezokWh=6;
        }else if (consumokWh<=2000){
            prezokWh=5;
        }
        return prezokWh;
    }
}