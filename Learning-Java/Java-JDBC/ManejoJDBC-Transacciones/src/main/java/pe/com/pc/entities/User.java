package pe.com.pc.entities;

public class User {
    private int idUsuario;
    private String usuario;
    private String password;

    public User() {
    }

    public User(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public User(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public User(int idPersona, String usuario, String password) {
        this.idUsuario = idPersona;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
