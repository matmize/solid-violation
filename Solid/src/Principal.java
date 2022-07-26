import java.util.ArrayList;
import java.util.List;

public class Principal {

    static List<TipoEnvio> enviosExistentes;

    public static void main (String[] args){
        enviosExistentes = new ArrayList<>();
        enviosExistentes.add(new EnvioMunicipal());
        enviosExistentes.add(new EnvioIntermunicipal());
        enviosExistentes.add(new EnvioInternacional());

        Envio envioValidar = new Envio(municipal);
        String tipoEnvio = identificarEnvio(envioValidar);
    }

    private static String identificarEnvio (Envio envioValidar){
        for (TipoEnvio envio : enviosExistentes){
            if(envio.reconocerEnvio(envioValidar)){
                return envio.obtenerEnvio();
            }
        }
        return null;
    }
}
