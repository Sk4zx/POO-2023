package atividade3;

import java.util.ArrayList;
import java.util.List;


class Inventario {
    public List<Item> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        itens.add(new Item(nome, quantidade));
    }

    public void removerItem(String nome) {
        Item itemParaRemover = null;
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
        }
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    public void listarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }
}