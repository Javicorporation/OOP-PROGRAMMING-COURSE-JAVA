package principio;

public class LibroPersonaDTO {

    private String apellidos;
    private String titulo;
    private int paginas;
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public LibroPersonaDTO(String apellidos, String titulo, int paginas) {
        super();
        this.apellidos = apellidos;
        this.titulo = titulo;
        this.paginas = paginas;
    }
}
