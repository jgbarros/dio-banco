public class ReprodutorMusical implements iPhone {
    public void tocar(){
        System.out.println("tocar " + ReprodutorMusical.class);
    }

    public void pausar(){
        System.out.println("pausar " + ReprodutorMusical.class);
    }

    public void selecionarMusica(String musica){
        System.out.println("selecionarMusica " + musica +" " + ReprodutorMusical.class);
    }

    @Override
    public void iniciarAplicativo() {
        System.out.println("iniciarAplicativo " + ReprodutorMusical.class);
    }
}
