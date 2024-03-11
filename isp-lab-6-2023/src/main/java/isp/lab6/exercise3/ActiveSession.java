package isp.lab6.exercise3;

public class ActiveSession {
    private double username;
    private HashMap<String Integer> shoppingChart = new HashMap<>();

    public ActiveSession(double username, HashMap<String integer) {

        this.username = username;
        Integer = integer;
    }

    public String toString() {
        return "ActiveSession{" +
                "username=" + username +
                ", Integer=" + Integer +
                '}';
    }

    public double getUsername() {
        return username;
    }

    public void setUsername(double username) {
        this.username = username;
    }

    public HashMap<String getInteger() {
        return Integer;
    }

    public void setInteger(HashMap<String integer) {
        Integer = integer;
    }
}
