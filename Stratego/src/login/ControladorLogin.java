
package login;

import login.Persona;

public class ControladorLogin {

    private Persona[] arregloPersonas;
    private int tamaño;

    public ControladorLogin() {
        arregloPersonas = new Persona[10]; // Tamaño inicial del arreglo
        tamaño = 0;
    }
    public Persona buscarPersona(String nombreUser) {
        for (int i = 0; i < tamaño; i++) {
            Persona persona = arregloPersonas[i];
            if (persona != null) {
                if (persona.getNombreUser().equals(nombreUser)) {
                    return persona;
                
                }
            }
        }
        return null;
    }

    public boolean agregarPersona(Persona persona) {
        Persona aux = buscarPersona(persona.getNombreUser());
        if (aux == null) {
            if (tamaño < arregloPersonas.length) {
                arregloPersonas[tamaño] = persona;
                tamaño++;
                return true;
            }
        }
        return false;
    }
}