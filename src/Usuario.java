public class Usuario {
    private String correo;
    private String password;
    
    public Usuario(){
    }
    
    public Usuario(String correo, String password){
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
