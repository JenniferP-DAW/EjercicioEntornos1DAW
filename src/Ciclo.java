
/**
 *
 * @author Patri
 * Aquí recopilamos los datos de los ciclos
 */
public class Ciclo {

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
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public int getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *
     * @return
     */
    public Competencia[] getListaCompetencias() {
        return listaCompetencias;
    }

    /**
     *
     * @param listaCompetencias
     */
    public void setListaCompetencias(Competencia[] listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }

    private String nombre;

    private String descripcion;

    private int numHoras;

    private int year;

    private Competencia[] listaCompetencias;
}
