
/**
 *En Examen guardamos los fatos del examen y las funciones que nos ayudarán a corregirlo 
 * y evaluarlo
 * @author Patri
 */
public class Examen {

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
    public Pregunta[] getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     *
     * @param listaPreguntas
     */
    public void setListaPreguntas(Pregunta[] listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    private String descripcion;

    private Pregunta[] listaPreguntas;

    /**
     *
     */
    public void calificar() {
    }

    /**
     *
     */
    public void elegirPreguntas() {
    }

    /**
     *
     */
    public void ordenarPreguntas() {
    }
}
