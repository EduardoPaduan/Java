import java.util.Comparator;

public class ProdutoFracionado extends Produto implements IProduto{
    private double quantidadeEstoque;

    public ProdutoFracionado(int codigo, String nome, double preco, double quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorEmEstoque(){
        return getPreco() * this.quantidadeEstoque;
    }

    public void adicionarEstoque(double estoque){
        this.quantidadeEstoque = this.quantidadeEstoque + estoque;
    }

    public void vender(double qtd){
        if (this.quantidadeEstoque - qtd >=0){
            this.quantidadeEstoque = this.quantidadeEstoque-qtd;
        }
        else
            System.out.println("Sem estoque para essa venda");
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


}
