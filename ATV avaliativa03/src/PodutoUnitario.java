import java.util.Comparator;

public class PodutoUnitario extends Produto implements IProduto {

    private int quantidadeEstoque;

    public PodutoUnitario(int codigo, String nome, double preco, int quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calcularValorEmEstoque(){
        return getPreco() * this.quantidadeEstoque;
    }

    public void adicionarEstoque(int estoque){
        this.quantidadeEstoque = this.quantidadeEstoque+estoque;
    }

    public void vender(int qtd){
        if (this.quantidadeEstoque - qtd >=0){
            this.quantidadeEstoque = this.quantidadeEstoque-qtd;
        }
        else
            System.out.println("Sem estoque para essa venda");

    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


}
