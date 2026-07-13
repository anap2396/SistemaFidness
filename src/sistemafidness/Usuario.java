package sistemafidness;

public class Usuario {

    private String nombreCompleto;
    private String nombreUsuario;
    private String contrasenha;

    public Usuario(String nombreCompleto, String nombreUsuario, String contrasenha) {
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
    
    @Override
    public String toString() {
        return nombreUsuario;
    }
}    

