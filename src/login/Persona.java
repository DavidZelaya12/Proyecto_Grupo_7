
package login;

public class Persona {

    /*
      aquí implementamos los atributos para la clase persona que seria los
      siguiente nombre, documento, nombre de usuario, y la contraseña
     */
    private String nombre;
    private String documento;
    private String nombreUser;
    private String contrasena;

    public Persona(String nombre, String documento, String nombreUser, String contrasena) {
        this.nombre = nombre;
        this.documento = documento;
        this.nombreUser = nombreUser;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
