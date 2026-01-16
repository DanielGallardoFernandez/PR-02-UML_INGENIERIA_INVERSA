package pr02;
import java.util.ArrayList;
import java.util.List;
public class Telefono {
    private String numero;
    private TipoTelefono tipo;

    public Telefono(String numero, TipoTelefono tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.tipo + ": " + this.numero;
    }
}