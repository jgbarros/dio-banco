public class NavegadorInternet implements iPhone {
    public void exibirPagina(String url){
        System.out.println("exibirPagina: " + url +" " + NavegadorInternet.class);
    }

    public void adicionarNovaAba(){
        System.out.println("adicionarNovaAba " + NavegadorInternet.class);
    }

    public void atualizarPagina(){
        System.out.println("atualizarPagina " + NavegadorInternet.class);
    }

    @Override
    public void iniciarAplicativo() {
        System.out.println("iniciarAplicativo " + NavegadorInternet.class);
    }
}
