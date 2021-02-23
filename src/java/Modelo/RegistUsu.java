package Modelo;

public class RegistUsu {
   /* private int perid;*/
    private String pernom;
    private String perape;
    private int telfijo;
    private String perfecha;
    private int percedula;
    private String imagen;
    
    public RegistUsu(String pernom, String perape, int telfijo, String perfecha, int percedula) {
        /*this.perid= perid;*/
        this.pernom = pernom;
        this.perape = perape;
        this.telfijo = telfijo;
        this.perfecha = perfecha;
        this.percedula = percedula;
    }

    public RegistUsu(String pernom, String perape, int telfijo, String perfecha, int percedula, String imagen) {
        this.pernom = pernom;
        this.perape = perape;
        this.telfijo = telfijo;
        this.perfecha = perfecha;
        this.percedula = percedula;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    public RegistUsu() {
    }

   /* public int getPerid() {
        return perid;
    }*/

    /*public void setPerid(int perid) {
        this.perid = perid;
    }*/

    public String getPernom() {
        return pernom;
    }

    public void setPernom(String pernom) {
        this.pernom = pernom;
    }

    public String getPerape() {
        return perape;
    }

    public void setPerape(String perape) {
        this.perape = perape;
    }

    public int getTelfijo() {
        return telfijo;
    }

    public void setTelfijo(int telfijo) {
        this.telfijo = telfijo;
    }

    public String getPerfecha() {
        return perfecha;
    }

    public void setPerfecha(String perfecha) {
        this.perfecha = perfecha;
    }

    public int getPercedula() {
        return percedula;
    }

    public void setPercedula(int percedula) {
        this.percedula = percedula;
    }
    
}
