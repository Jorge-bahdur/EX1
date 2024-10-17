import java.util.Stack;
public class Navegador {
    
    private Stack <Pagina> historico = new Stack<>();
        
    public void visitarPagina(String url, String titulo){
        Pagina pagina = new Pagina(url, titulo);
        historico.push(pagina);
    }

    public Pagina paginaAtual(){
        return historico.isEmpty() ? null : historico.peek();
    }

    public Pagina voltarPagina(){
        if(historico.isEmpty()){
            historico.pop();
        }
        return paginaAtual();
    }

    public boolean historicoVazio(){
        return historico.isEmpty();
    }
}
