package Modelo;
public class SocioActividades {
    
    private int IdSocio;
    private int IdActividad;
    private int habilitado;

    public SocioActividades(int IdSocio, int IdActividad, int habilitado) {
        this.IdSocio = IdSocio;
        this.IdActividad = IdActividad;
        this.habilitado = habilitado;
    }

    public int getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(int IdSocio) {
        this.IdSocio = IdSocio;
    }

    public int getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(int IdActividad) {
        this.IdActividad = IdActividad;
    }

    public int getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(int habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "SocioActividades{" + "IdSocio=" + IdSocio + ", IdActividad=" + IdActividad + ", habilitado=" + habilitado + '}';
    }
    
    
    
           
    
}
