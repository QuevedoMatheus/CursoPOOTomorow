package org.example;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga>vagas = new ArrayList<>();
    private ArrayList<Veiculo>veiculos = new ArrayList<>();

    private ArrayList<Registro> registros = new ArrayList<>();

    public void registrarEntradaCarro(Veiculo veiculo){
        veiculos.add(veiculo);
    }


}
