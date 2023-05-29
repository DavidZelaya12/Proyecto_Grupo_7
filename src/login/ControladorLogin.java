
package login;

import java.util.ArrayList;
import login.Persona;

public class ControladorLogin {

    private ArrayList<Persona> listaPersona;

    public ControladorLogin() {
        listaPersona = new ArrayList<>();
    }
    
    /*
     @param nombreUser
     @return en este método estamos buscando en las listas de persona si ya
     hay un usuario con ese mismo nombre de usuario
     */

    public Persona buscarPersona(String nombreUser) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Persona persona = listaPersona.get(i);
            if (persona != null) {
                if (persona.getNombreUser().equals(nombreUser)) {
                    return persona;
                }

            }
        }
        return null;
    }

    public boolean agregraPersona(Persona persona) {
        Persona aux = buscarPersona(persona.getNombreUser());
        if (aux == null) {
            listaPersona.add(persona);
            return true;
        }
        return false;
    }

}
