package AccessControl;


import jdk.jfr.StackTrace;

@StackTrace
class Connection {
    private static int count = 0;
    private Connection() { System.out.println("Connection()");}
    // Allow creation via static method:
    static Connection makeConnection() {
        count++;
        return new Connection();
    }
    public static int howMany() { return count; }
    public String toString() {
        return ("Connection " + count);
    }
}

public class ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];
    static {
        for(Connection x : ca)
            x = Connection.makeConnection();
    }
    public static Connection getConnection() {
        if(howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(howManyLeft);
        getConnection();
        System.out.println(getConnection());
        System.out.println(howManyLeft);
    }
}
