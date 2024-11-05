import classes.*;

public class Main {
    public static void main(String[] args) {

        String[] testIP= {
                "127.0.0.1",
                "255.255.255.255",
                "130.6.7.8",
                "256.100.50.25",
                "abc.def.gha.bcd",
                "001.010.100.200"
        };

ValidstorIP cop = new ValidstorIP();

        for (String ip : testIP) {
            System.out.println(ip + " " + cop.isValidIP(ip));
        }
    }
}