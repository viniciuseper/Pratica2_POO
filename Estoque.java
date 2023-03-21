package br.com.estoque;
public class Estoque {
    private int codProduto, qtdAtual, qtdMinima;
    private String nome;

    // QUANDO SE CRIA MAIS DE UM CONSTRUTOR NO CÓDIGO, ISSO SE CHAMA POLIMORFISMO.
    public Estoque() {// CONSTRUTOR VAZIO
    }
    public Estoque(int codProduto/*VARIÁVEL*/, int qtdAtual, int qtdMinima, String nome) { // CONSTRUTOR COM ATRIBUTOS
        this.codProduto/*ATRIBUTO DA CLASSE*/ = codProduto/*VARIÁVEL*/;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        this.nome = nome;
        // this. = modificador que indica que a variável é da classe
    }
    public Estoque (int cod, String produto){
        this.codProduto = cod;
        this.nome = produto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void darBaixa(int qtd){
        if (qtd <= qtdAtual)
            qtdAtual = qtdAtual - qtd; // qtdeAtual -= qtd;

        else
            System.out.println("Estoque insuficiente para baixa."); // NÃO É UMA BOA PRÁTICA BACKEND

    }
    public String mostra(){
        return "Produto: " + this.nome /* getNome()*/ + "\nQtde. Mínima: " + this.qtdMinima + "\nQtde. Atual: " + this.qtdAtual;
        // FAZER USANDO OS GETS nos exercícios
        // no Main colocar Sout mostra()
    }

    public boolean precisaRepor(){
        if (getQtdAtual() <= getQtdMinima())
            return true;

        else
            return false;

    }

}