package model;

public class Exercicio {
    
    private TipoExercicio tipoExercicio;
    private int repeticoes;
    private int series;
    private Integer exercicioId;

    public Exercicio(TipoExercicio tipoExercicio, int repeticoes, int series){
        this.tipoExercicio = tipoExercicio;
        this.repeticoes = repeticoes;
        this.series = series;
    }

    public TipoExercicio getTipoExercicio() {
        return tipoExercicio;
    }

    public void setTipoExercicio(TipoExercicio tipoExercicio) {
        this.tipoExercicio = tipoExercicio;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Integer getId() {
        return exercicioId;
    }

    public void setId(Integer id) {
        this.exercicioId = id;
    }

    
}
