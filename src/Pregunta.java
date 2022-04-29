
/**
 *Parecida a la clase examen, pero esta es por pregunta indivualmente
 * @author Patri
 */
public class Pregunta {

    /**
     *
     * @return
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     *
     * @param enunciado
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     *
     * @return
     */
    public String[] getRespuesta() {
        return respuesta;
    }

    /**
     *
     * @param respuesta
     */
    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    /**
     *
     * @return
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     *
     * @param respuestaValida
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    private String enunciado;

    private String[] respuesta;

    private int respuestaValida;
}
