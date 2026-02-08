package regex;

public class ValidateIP {
    public static boolean isValidIPv4(String ip) {
        String segment = "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)";
        String regex = "^(" + segment + "\\.){3}" + segment + "$";
        return ip.matches(regex);
    }

     static void main(String[] args) {
        String[] testIPs = {
                "192.168.1.1",
                "255.255.255.255",
                "0.0.0.0",
                "256.1.1.1",
                "192.168.1",
                "192.168.01.1",
                "abc.def.ghi.jkl"
        };

        for (String ip : testIPs) {
            System.out.println(ip + " → " +
                    (isValidIPv4(ip) ? "Valid" : "Invalid"));
        }
    }
}
