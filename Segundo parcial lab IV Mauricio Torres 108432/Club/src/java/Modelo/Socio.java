
package Modelo;


public class Socio {
    private int IdSocio;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Telefono;
    private Sexo sexo; 

    public Socio(){}

    public Socio(int IdSocio, String Nombre, String Apellido, int Edad, int Telefono, Sexo sexo) {
        this.IdSocio = IdSocio;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.sexo = sexo;
    }

    public int getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(int IdSocio) {
        this.IdSocio = IdSocio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    public String getNombreCompleto()
    {
        return Nombre + " " + Apellido;
    }

    @Override
    public String toString() {
        return "Nombre:  " + Nombre + "Apellido: " + Apellido + "Edad: " + Edad + "Telefono: " + Telefono + "Sexo: " + sexo.getNombre();
    }
    
    
           
}
