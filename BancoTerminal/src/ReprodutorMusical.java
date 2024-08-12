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

    public void ligar(String numero){
        System.out.println("ligar " + numero +" " + ReprodutorMusical.class);
    }

    public void atender(){
        System.out.println("atender " + ReprodutorMusical.class);
    }

    public void iniciarCorreioVoz(){
        System.out.println("iniciarCorreioVoz " + ReprodutorMusical.class);
    }

    public void exibirPagina(String url){
        System.out.println("exibirPagina: " + url +" " + ReprodutorMusical.class);
    }

    public void adicionarNovaAba(){
        System.out.println("adicionarNovaAba " + ReprodutorMusical.class);
    }

    public void atualizarPagina(){
        System.out.println("atualizarPagina " + ReprodutorMusical.class);
    }
}
