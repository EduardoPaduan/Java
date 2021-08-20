import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        double totalMercado=0;
        List<Produto> lista = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#,##0.00");

        Produto p1 = new PodutoUnitario(1112,"Detergente",2.29,100);
        lista.add(p1);
        Produto p2 = new PodutoUnitario(1020,"Sabão em pó",11.49,100);
        lista.add(p2);
        Produto p3 = new PodutoUnitario(3699,"Bolacha",3.50,100);
        lista.add(p3);
        Produto p4 = new ProdutoFracionado(188,"Laranja",5.25,100);
        lista.add(p4);
        Produto p5 = new ProdutoFracionado(999,"Maçã",2.75,100);
        lista.add(p5);
        Produto p6 = new ProdutoFracionado(333,"Carne",39.90,100);
        lista.add(p6);

        System.out.println("\nTotal do estoque: \n"+p1.toString()+"\nValor total: "+p1.calcularValorEmEstoque());
        System.out.println("\nTotal do estoque: \n"+p2.toString()+"\nValor total: "+p2.calcularValorEmEstoque());
        System.out.println("\nTotal do estoque: \n"+p3.toString()+"\nValor total: "+p3.calcularValorEmEstoque());
        System.out.println("\nTotal do estoque: \n"+p4.toString()+"\nValor total: "+p4.calcularValorEmEstoque());
        System.out.println("\nTotal do estoque: \n"+p5.toString()+"\nValor total: "+p5.calcularValorEmEstoque());
        System.out.println("\nTotal do estoque: \n"+p6.toString()+"\nValor total: "+p6.calcularValorEmEstoque());

        Collections.sort(lista);

        for (Produto aux: lista){
            totalMercado = totalMercado + aux.calcularValorEmEstoque();
        }
         System.out.printf("\nValor do estoque total do mercado é: R$ %s", df.format(totalMercado));

    }
}
