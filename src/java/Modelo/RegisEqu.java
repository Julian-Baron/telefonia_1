package Modelo;

public class RegisEqu {
    private int equiserial;
    private String lineanumerolinea;
    private String equmarca;
    private String equdescripcion;
    private String equestado;

    public RegisEqu(int equiserial, String lineanumerolinea, String equmarca, String equdescripcion, String equestado) {
        this.equiserial = equiserial;
        this.lineanumerolinea = lineanumerolinea;
        this.equmarca = equmarca;
        this.equdescripcion = equdescripcion;
        this.equestado = equestado;
    }

    public RegisEqu() {
    }

    public int getEquiserial() {
        return equiserial;
    }

    public void setEquiserial(int equiserial) {
        this.equiserial = equiserial;
    }

    public String getLineanumerolinea() {
        return lineanumerolinea;
    }

    public void setLineanumerolinea(String lineanumerolinea) {
        this.lineanumerolinea = lineanumerolinea;
    }

    public String getEqumarca() {
        return equmarca;
    }

    public void setEqumarca(String equmarca) {
        this.equmarca = equmarca;
    }

    public String getEqudescripcion() {
        return equdescripcion;
    }

    public void setEqudescripcion(String equdescripcion) {
        this.equdescripcion = equdescripcion;
    }

    public String getEquestado() {
        return equestado;
    }

    public void setEquestado(String equestado) {
        this.equestado = equestado;
    }
    
}