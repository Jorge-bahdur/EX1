public class App {
    public static void main(String[] args) throws Exception {
        Navegador navegador = new Navegador();

        navegador.visitarPagina("www.google.com", "Google");
        navegador.visitarPagina("www.facebook.com", "Facebook");

        System.out.println("Página atual: " + navegador.paginaAtual().getTitulo());

        navegador.voltarPagina();
        System.out.println("Página atual depois de voltar: " + navegador.paginaAtual().getTitulo());
    }
}
