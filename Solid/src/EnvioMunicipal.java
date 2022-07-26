public class EnvioMunicipal implements TipoEnvio {
    @Override
    public Boolean reconocerEnvio(Envio envio){
        return envio.tipo == municipal;
    }

    @Override
    public String obtenerEnvio() {
        return municipal;
    }

}
