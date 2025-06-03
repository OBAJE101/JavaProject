public abstract class User implements  Authenticable{

    private String email;
    private String password;

    @Override
    public boolean authenticate(String email, String password){
        return false;
    }

    @Override
    public String otp(){
        return null;
    }

    @Override
    public String passKey(){
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    abstract String getPermissions();

}
