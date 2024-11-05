package classes;

public class ValidstorIP {
        // Регулярное выражение для проверки IP-адреса
        private static final String IP_REGEX =
                "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        public static boolean isValidIP(String ip) {
            return ip.matches(IP_REGEX);
        }

}
