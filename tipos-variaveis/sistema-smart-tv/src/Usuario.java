public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.ligada);
        
        smartTv.ligar();
        System.out.println(smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(65);
        System.out.println(smartTv.canal);


    }
}
