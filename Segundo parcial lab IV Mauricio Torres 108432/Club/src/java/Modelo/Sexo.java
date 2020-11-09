
package Modelo;

public class Sexo {
    private int IdSexo;
    private String Nombre;

    public Sexo(int IdSexo, String Nombre) {
        this.IdSexo = IdSexo;
        this.Nombre = Nombre;
    }
    

    public int getIdSexo() {
        return IdSexo;
    }

    public void setIdSexo(int IdSexo) {
        this.IdSexo = IdSexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    @Override
    public String toString() {
        return Nombre ;
    }
    
    
    
}
