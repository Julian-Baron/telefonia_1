
package Modelo;


public class Con_tabla_linea {
    private String perid;
    private String nombre;
    private String apellido;
    private String cedula;
    private String linea;
    public Con_tabla_linea() {
    }

    public Con_tabla_linea(String perid, String nombre, String apellido, String cedula, String linea) {
        this.perid = perid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    

    

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
