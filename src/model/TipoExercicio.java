package model;

public class TipoExercicio {
    
    private String nome;
    private String grupoMuscular;

    public TipoExercicio(String nome, String grupoMuscular){
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGrupoMuscular() {
        return grupoMuscular;
    }
    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

}
