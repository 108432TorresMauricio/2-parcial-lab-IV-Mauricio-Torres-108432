
package Modelo;


public class Actividad {
    
    private int IdActividad;
    private String Descpricion;

    public Actividad(int IdActividad, String Descpricion) {
        this.IdActividad = IdActividad;
        this.Descpricion = Descpricion;
    }

    public int getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(int IdActividad) {
        this.IdActividad = IdActividad;
    }

    public String getDescpricion() {
        return Descpricion;
    }

    public void setDescpricion(String Descpricion) {
        this.Descpricion = Descpricion;
    }

    @Override
    public String toString() {
        return "Actividad{" + "IdActividad=" + IdActividad + ", Descpricion=" + Descpricion + '}';
    }
    
    
    
}
