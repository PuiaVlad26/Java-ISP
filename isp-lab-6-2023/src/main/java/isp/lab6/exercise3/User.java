package isp.lab6.exercise3;

public class User {
    private double username;
    private  double password;

    public User(double username, double password) {
        this.username = username;
        this.password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "username=" + username +
                ", password=" + password +
                '}';
    }

    public double getUsername() {
        return username;
    }

    public void setUsername(double username) {
        this.username = username;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        User user = (User) object;
        return java.lang.Double.compare(user.username, username) == 0 && java.lang.Double.compare(user.password, password) == 0;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), username, password);
    }
}
