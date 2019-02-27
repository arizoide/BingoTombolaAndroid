package uc.senac.br.bingotombola.entities;

import java.util.ArrayList;

public class Cartela {
    private Integer id;
    private ArrayList<Integer> numerosCartela;

    public Cartela(ArrayList<Integer> numerosCartela) {
        this.numerosCartela = numerosCartela;
    }

    public Cartela() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Integer> getNumerosCartela() {
        return numerosCartela;
    }

    public void setNumerosCartela(ArrayList<Integer> numerosCartela) {
        this.numerosCartela = numerosCartela;
    }

    @Override
    public String toString() {
        return "Cartela{" +
                "id=" + id +
                ", numerosCartela=" + numerosCartela +
                '}';
    }
}
