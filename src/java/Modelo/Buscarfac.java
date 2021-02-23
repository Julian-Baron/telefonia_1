package Modelo;

public class Buscarfac {
    private int facnumero;
    private String linumerolinea;
    private int fecfechaemision;
    private double facvalor;

    public Buscarfac(String linumerolinea) {
        this.linumerolinea = linumerolinea;
    }

    public Buscarfac(int facnumero) {
        this.facnumero = facnumero;
    }

    public Buscarfac() {
    }

    public Buscarfac(int facnumero, String linumerolinea, int fecfechaemision, double facvalor) {
        this.facnumero = facnumero;
        this.linumerolinea = linumerolinea;
        this.fecfechaemision = fecfechaemision;
        this.facvalor = facvalor;
    }

    public int getFacnumero() {
        return facnumero;
    }

    public void setFacnumero(int facnumero) {
        this.facnumero = facnumero;
    }

    public String getLinumerolinea() {
        return linumerolinea;
    }

    public void setLinumerolinea(String linumerolinea) {
        this.linumerolinea = linumerolinea;
    }

    public int getFecfechaemision() {
        return fecfechaemision;
    }

    public void setFecfechaemision(int fecfechaemision) {
        this.fecfechaemision = fecfechaemision;
    }

    public double getFacvalor() {
        return facvalor;
    }

    public void setFacvalor(double facvalor) {
        this.facvalor = facvalor;
    }
    
}