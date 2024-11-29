package LojaVirtual.modelo;

import LojaVirtual.util.StatusPedido;

public class Pedido implements Pagamento {
    private Cliente cliente;
    private Carrinho carrinho;
    private StatusPedido status;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.status = StatusPedido.PENDENTE;
    }

    public void finalizarPedido() {
        processarPagamento(carrinho.calcularTotal());
        this.status = StatusPedido.PROCESSANDO;
        System.out.println("Pedido finalizado com sucesso para " + cliente.getNome());
        System.out.println("Status do pedido: " + status);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + "...");
        this.status = StatusPedido.ENVIADO;
    }
}
