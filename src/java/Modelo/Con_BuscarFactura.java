
package Modelo;


public class Con_BuscarFactura {
    private String lineanumero;
    private  String fecha_emision;
    private double factura;
    private int Factura_numero;
    private  String nombre;
    private  String apellido;
    private  String Cedula;
    private int Telefono_fijo;
    
   
    
    public Con_BuscarFactura() {
    }

    public Con_BuscarFactura(int Factura_numero) {
        this.Factura_numero = Factura_numero;
    }

    

    public String getLineanumero() {
        return lineanumero;
    }

    public void setLineanumero(String lineanumero) {
        this.lineanumero = lineanumero;
    }

    public Con_BuscarFactura(String lineanumero, String fecha_emision, double factura) {
        this.lineanumero = lineanumero;
        this.fecha_emision = fecha_emision;
        this.factura = factura;
    }

    
    

    public Con_BuscarFactura(int Factura_numero, String nombre, String apellido, String Cedula, int Telefono_fijo, String fecha_emision, double factura) {
        this.Factura_numero = Factura_numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
        this.Telefono_fijo = Telefono_fijo;
        this.fecha_emision = fecha_emision;
        this.factura = factura;
    }

    public Con_BuscarFactura(String Cedula, String fecha_emision) {
        this.Cedula = Cedula;
        this.fecha_emision = fecha_emision;
    }

    public int getFactura_numero() {
        return Factura_numero;
    }

    public void setFactura_numero(int Factura_numero) {
        this.Factura_numero = Factura_numero;
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
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono_fijo() {
        return Telefono_fijo;
    }

    public void setTelefono_fijo(int Telefono_fijo) {
        this.Telefono_fijo = Telefono_fijo;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public double getFactura() {
        return factura;
    }

    public void setFactura(double factura) {
        this.factura = factura;
    }

    
    
    
    
    
}
