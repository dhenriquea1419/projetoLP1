package LojaVirtual;

import LojaVirtual.modelo.*;
import LojaVirtual.servico.GerenciadorProduto;

public class Main {
    public static void main(String[] args) {
        GerenciadorProduto gerenciadorProduto = new Gerenciador

        Produto p1 = new Produto(1, "Teclado", 50.0, 10);
        Produto p2 = new Produto(2, "Mouse", 30.0, 15);

        gerenciadorProduto.adicionarProduto(p1);
        gerenciadorProduto.adicionarProduto(p2);

        System.out.println("Lista de produtos disponíveis:");
        gerenciadorProduto.listarProdutos();

        Cliente cliente = new Cliente(1, "João Silva", "joao@email.com");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        Pedido pedido = new Pedido(cliente, carrinho);
        pedido.finalizarPedido();
    }
}
