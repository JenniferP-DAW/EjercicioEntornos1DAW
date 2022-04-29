
/**
 *En modulo se describen los datos de cada asignatura ya que tienen que durar un tiempo
 * determinado
 * @author Patri
 */
public class Modulo {

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getContenidos() {
        return contenidos;
    }

    /**
     *
     * @param contenidos
     */
    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
    }

    /**
     *
     * @return
     */
    public int getNumHoras() {
        return numHoras;
    }

    /**
     *
     * @param numHoras
     */
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    /**
     *
     * @return
     */
    public Alumno[] getAlumnado() {
        return alumnado;
    }

    /**
     *
     * @param alumnado
     */
    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     *
     * @return
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     *
     * @param claustro
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     *
     * @return
     */
    public Examen getPruebaExamen() {
        return pruebaExamen;
    }

    /**
     *
     * @param pruebaExamen
     */
    public void setPruebaExamen(Examen pruebaExamen) {
        this.pruebaExamen = pruebaExamen;
    }

    /**
     *
     * @return
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     *
     * @param pruebaTarea
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }

    private String nombre;

    private String contenidos;

    private int numHoras;

    private Alumno[] alumnado;

    private Profesor[] claustro;

    private Examen pruebaExamen;

    private Tarea pruebaTarea;

    /**
     *
     */
    public void matricularAlumno() {
    }

    /**
     *
     */
    public void contratarProfesor() {
    }

    /**
     *
     */
    public void evaluarAlumno() {
    }
}
