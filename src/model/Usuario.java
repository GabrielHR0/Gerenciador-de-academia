package model;

public class Usuario{
    
    private Integer id;
    private String email;
    private String senha;

    private Integer id_Pessoa;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }


    //getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getId_Pessoa() {
        return id_Pessoa;
    }
    
    public void setId_Pessoa(int id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", id_Pessoa=" + id_Pessoa +
                '}';
    }
}