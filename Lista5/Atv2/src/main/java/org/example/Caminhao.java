package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Caminhao extends  Veiculo{
    private float tarifa;

    public Caminhao() {

    }

    public Caminhao(String placa, LocalDateTime horaEntradra, float tarifa) {
        super(placa, horaEntradra);
        this.tarifa = tarifa;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public void calcularTarifa(float horas){

    }
}
