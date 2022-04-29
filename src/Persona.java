
/**
 * La clase persona nos guardará los datos personales de todos los profesores y alumnos del centro
 * @author Patri
 */
public class Persona {

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @param tlf
     */
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    /**
     *
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return
     */
    public String getTlf() {
        return tlf;
    }

    /**
     *
     * @return
     */
    public String getAlias() {
        return alias;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    private String nombre;

    private String apellidos;

    private String direccion;

    private String tlf;

    private String alias;

    private String email;
}
