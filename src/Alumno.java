
/**
 * @author Patri
 * En esta clase hemos definido todos los atributos de la clase Alumno,
donde se recopulan los datos de este para poder realizar diferentes funciones
 */

public class Alumno extends Persona {

    /**
     *
     * @return
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     *
     * @param notaMedia
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     *
     * @return
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }

    private double notaMedia;

    private Modulo[] matricula;

    /**
     *
     */
    public void emitirCertificado() {
    }

    /**
     *
     * @return
     */
    public double calcularMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     */
    public void matricular() {
    }
}
