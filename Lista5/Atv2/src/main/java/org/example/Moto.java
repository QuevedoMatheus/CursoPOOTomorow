package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Moto extends Veiculo{
    private float tarifa;

    public Moto() {
    }

    public Moto(String placa, LocalDateTime horaEntradra, float tarifa) {
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
