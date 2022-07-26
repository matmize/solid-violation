public class EnvioInternacional implements TipoEnvio {
    @Override
    public Boolean reconocerEnvio(Envio envio){
        boolean b = envio.tipo == internacional;
        return b;
    }

    @Override
    public String obtenerEnvio() {
        String internacional;
        return internacional;
    }
}
