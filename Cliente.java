package LojaVirtual.modelo;

public class Cliente extends Pessoa {

    public Cliente(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}');
    }
}
