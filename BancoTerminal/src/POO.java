public class POO {
    
    public static void main(String[] args) throws Exception {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.ligar("100");
        reprodutorMusical.selecionarMusica("Patience");
        reprodutorMusical.tocar();
    }
}
