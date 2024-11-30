public abstract class Pessoa {
    protected int id;
    protected String nome; 
    protected String email;

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract void exibirInformacoes(); 
}
