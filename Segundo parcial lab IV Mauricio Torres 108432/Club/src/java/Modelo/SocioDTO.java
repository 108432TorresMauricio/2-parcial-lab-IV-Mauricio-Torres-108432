
package Modelo;

import java.util.ArrayList;


public class SocioDTO {
    
    public Socio socio;
    public ArrayList<Sexo> listaSociosexo; 

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public ArrayList<Sexo> getListaSociosexo() {
        return listaSociosexo;
    }

    public void setListaSociosexo(ArrayList<Sexo> listaSociosexo) {
        this.listaSociosexo = listaSociosexo;
    }
    
    
    
    
}
