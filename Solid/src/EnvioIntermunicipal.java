public class EnvioIntermunicipal implements TipoEnvio {
    @Override
    public Boolean reconocerEnvio(Envio envio){
        boolean b = envio.tipo == intermunicipal;
        return b;
    }

    @Override
    public String obtenerEnvio() {
        return intermunicipal;
    }
}
