package code.cap5;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adiciona(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
}
