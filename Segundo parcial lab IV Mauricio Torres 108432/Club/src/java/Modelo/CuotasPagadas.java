
package Modelo;


public class CuotasPagadas {
    
    private int IdCoutasPagadas;
    private int Mes;
    private int Año;
    private int IdSocio;
    private double Precio;

    public CuotasPagadas(int IdCoutasPagadas, int Mes, int Año, int IdSocio, double Precio) {
        this.IdCoutasPagadas = IdCoutasPagadas;
        this.Mes = Mes;
        this.Año = Año;
        this.IdSocio = IdSocio;
        this.Precio = Precio;
    }

    public int getIdCoutasPagadas() {
        return IdCoutasPagadas;
    }

    public void setIdCoutasPagadas(int IdCoutasPagadas) {
        this.IdCoutasPagadas = IdCoutasPagadas;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(int IdSocio) {
        this.IdSocio = IdSocio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "CuotasPagadas{" + "IdCoutasPagadas=" + IdCoutasPagadas + ", Mes=" + Mes + ", A\u00f1o=" + Año + ", IdSocio=" + IdSocio + ", Precio=" + Precio + '}';
    }
    
    
    
    
}
