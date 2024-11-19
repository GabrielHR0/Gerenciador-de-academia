package auth;

import java.time.LocalDate;

import controller.UsuarioController;
import model.Usuario;

public class GerenciarSessao {
    
    private Sessao sessaoAtual;
    private static GerenciarSessao instancia;

    private GerenciarSessao(){
    }

    public static GerenciarSessao getInstancia(){

        if(instancia == null){
            instancia = new GerenciarSessao();
        }
        return instancia;
    }

    public void iniciarSessao(Integer id){

        if(this.sessaoAtual != null){
            throw new IllegalStateException("Já existe uma sessão ativa.");
        }
        
        Sessao novaSessao = new Sessao(id);
        this.sessaoAtual = novaSessao;
    }

    public void encerrarSessao(){
        if(this.sessaoAtual==null){
            throw new IllegalStateException("Nenhuma sessão iniciada.");
        }
        this.sessaoAtual.setDataFimDeSecao(LocalDate.now());
        this.sessaoAtual = null;
    }

    public boolean isUsuarioLogado(){
        return this.sessaoAtual!=null;
    }

    public Integer getUsuarioLogadoId(){
        return this.sessaoAtual.getUsuarioLogadoId();
    }

    public Usuario getUsuarioLogado(Integer id){
        return UsuarioController.getInstancia().buscarPorId(getUsuarioLogadoId());
    }

    public Sessao getSessaoAtual() {
        return sessaoAtual;
    }

    public void setSessaoAtual(Sessao sessaoAtual) {
        this.sessaoAtual = sessaoAtual;
    }



}
