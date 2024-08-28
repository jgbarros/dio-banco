public class AparelhoTelefonico implements iPhone {
    public void ligar(String numero){
        System.out.println("ligar " + numero +" " + AparelhoTelefonico.class);
    }

    public void atender(){
        System.out.println("atender " + AparelhoTelefonico.class);
    }

    public void iniciarCorreioVoz(){
        System.out.println("iniciarCorreioVoz " + AparelhoTelefonico.class);
    }

    @Override
    public void iniciarAplicativo() {
        System.out.println("iniciarAplicativo " + AparelhoTelefonico.class);
    }
}
