package uia.ingenieriaSoftware.Modelo;

import uia.ingenieriaSoftware.Modelo.Item;

import java.time.*;


public class SoliciitudMaterial extends Item {
    private String Solicitante;
    private String idSolicitante;
    private LocalDate dateTime;
    private String estatus;

    public SoliciitudMaterial(String nombre, Integer cantidad, String id, String solicitante, String idSolicitante, LocalDate dateTime, String estatus) {
        super(nombre, cantidad, id);
        Solicitante = solicitante;
        this.idSolicitante = idSolicitante;
        this.dateTime = dateTime;
        this.estatus = estatus;
    }

    public SoliciitudMaterial() {
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String solicitante) {
        Solicitante = solicitante;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setLocalDate(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return super.toString() +"SoliciitudMaterial{" +
                "Solicitante='" + Solicitante + '\'' +
                ", idSolicitante='" + idSolicitante + '\'' +
                ", dateTime=" + dateTime +
                ", estatus='" + estatus + '\'' +
                '}';
    }
}
