import java.util.Comparator;

public class ComparaPorCodigo implements Comparator<Produto> {


    @Override
    public int compare(Produto o1, Produto o2) {
        if (o1.getCodigo()< o2.getCodigo())
            return 1;
        return -1;

    }
}
