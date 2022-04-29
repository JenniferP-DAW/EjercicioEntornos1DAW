
/**
 *En los datos del profesor se especifican datos más allá de sus personales, como a que clases
 * va a impartir
 * @author Patri
 */
public class Profesor extends Persona {

    /**
     *
     * @return
     */
    public String getNRP() {
        return NRP;
    }

    /**
     *
     * @param NRP
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     *
     * @return
     */
    public Modulo[] getImparteAsig() {
        return imparteAsig;
    }

    /**
     *
     * @param imparteAsig
     */
    public void setImparteAsig(Modulo[] imparteAsig) {
        this.imparteAsig = imparteAsig;
    }

    private String NRP;

    private Modulo[] imparteAsig;

    /**
     *
     */
    public void anadirModulo() {
    }

    /**
     *
     */
    public void setNRP() {
    }
}
