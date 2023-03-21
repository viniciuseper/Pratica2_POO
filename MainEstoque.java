package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {

        // OBJETO COM O CONSTRUTOR VAZIO
        //Estoque e1 = new Estoque();

        //e1.setNome("Caneta");
        //e1.setQtdAtual(10);
        //e1.setQtdMinima(5);

        //System.out.println(e1.mostra());

        Estoque e2 = new Estoque(1,20,1,"Caderno");

        e2.darBaixa(10);
        System.out.println("Estoque atual: " + e2.getQtdAtual());
        e2.darBaixa(30);
        System.out.println(e2.precisaRepor());
    }
}