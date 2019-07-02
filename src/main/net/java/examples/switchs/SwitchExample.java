package main.net.java.examples.switchs;


public class SwitchExample {

    private PortType replaceSimpleSwitch(int port) {
        PortType type;
        switch (port) {
            case 20:
                type = PortType.FTP;
                break;;
            case 80:
            case 8080:
                type = PortType.HTTP;
                break;
            case 27017:
                type = PortType.DATABASE;
            default:
                type = PortType.UNKNOWN;
        }
        return type;
    }

    private PortType newSwitch(int port) {
        PortType type = switch (port) {
            case 20 -> PortType.FTP;
            case 80, 8080 -> PortType.HTTP;
            case 27017 -> PortType.DATABASE;
            default -> PortType.UNKNOWN;
        };
        return type;
    }
}

enum PortType {

    FTP,
    HTTP,
    DATABASE,
    UNKNOWN;

}