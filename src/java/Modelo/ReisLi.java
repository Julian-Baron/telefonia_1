package Modelo;

public class ReisLi {
    private int linumerolinea;
    private int perid;
    private String linestado;

    public ReisLi() {
    }

    public ReisLi(int linumerolinea, int perid, String linestado) {
        this.linumerolinea = linumerolinea;
        this.perid = perid;
        this.linestado = linestado;
    }

    public int getLinumerolinea() {
        return linumerolinea;
    }

    public void setLinumerolinea(int linumerolinea) {
        this.linumerolinea = linumerolinea;
    }

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public String getLinestado() {
        return linestado;
    }

    public void setLinestado(String linestado) {
        this.linestado = linestado;
    }
    
}