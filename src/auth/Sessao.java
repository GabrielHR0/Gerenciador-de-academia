package auth;

import java.time.LocalDate;

public class Sessao {
    
    private Integer usuarioLogadoId;
    private LocalDate dataInicioDeSecao;
    private LocalDate dataFimDeSecao;

    public Sessao(Integer usuarioLogadoId) {
        this.dataInicioDeSecao = LocalDate.now();
        this.usuarioLogadoId = usuarioLogadoId;
    }

    public Sessao(Integer usuarioLogadoId, LocalDate dataInicioDeSecao, LocalDate dataFimDeSecao) {
        this.usuarioLogadoId = usuarioLogadoId;
        this.dataInicioDeSecao = dataInicioDeSecao;
        this.dataFimDeSecao = dataFimDeSecao;
    }
    
    public Integer getUsuarioLogadoId() {
        return usuarioLogadoId;
    }

    public void setUsuarioLogadoId(Integer usuarioLogadoId) {
        this.usuarioLogadoId = usuarioLogadoId;
    }

    public LocalDate getDataInicioDeSecao() {
        return dataInicioDeSecao;
    }

    public void setDataInicioDeSecao(LocalDate dataInicioDeSecao) {
        this.dataInicioDeSecao = dataInicioDeSecao;
    }

    public LocalDate getDataFimDeSecao() {
        return dataFimDeSecao;
    }

    public void setDataFimDeSecao(LocalDate dataFimDeSecao) {
        this.dataFimDeSecao = dataFimDeSecao;
    }

}
