package state;

abstract public class Estado {

    public Telefono telefono;

    public Estado(Telefono telefono) {
        this.telefono = telefono;
    }

    abstract public String desbloquear();
    abstract public String abrirCamara();

    abstract public String tomarFoto();
}