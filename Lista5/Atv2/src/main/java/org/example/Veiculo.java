package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Veiculo {
    private String placa;
    private LocalDateTime horaEntradra;
    private  LocalDateTime horaSaida;

    public Veiculo() {
    }

    public Veiculo(String placa, LocalDateTime horaEntradra) {
        this.placa = placa;
        this.horaEntradra = horaEntradra;
    }

    public void calcularTarifa(float horas){

    }
}
