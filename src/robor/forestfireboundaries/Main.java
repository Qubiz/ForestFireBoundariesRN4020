package robor.forestfireboundaries;

import robor.forestfireboundaries.protobuf.HotspotDataProtos;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String PORT = "COM7";

    public static void main(String[] args) throws IOException {
        SerialCommunication serialCommunication = new SerialCommunication(PORT);
        serialCommunication.open();

        Scanner scanner = new Scanner(System.in);
        String input = "";

        loop:
        while (true) {
            input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "stop":
                    break loop;
                case "send":
                    HotspotDataProtos.Hotspot hotspot = HotspotDataProtos.Hotspot
                            .newBuilder()
                            .setLatitude(1)
                            .setLongitude(1)
                            .setTemperature(1)
                            .build();
                    //char[] start = {0xAA,0xAA};
                    //int length = hotspot.toByteArray().length + 2;
                    //start[1] = (char) length;
                    //serialCommunication.write(new String(start).getBytes());
                    serialCommunication.write(new byte[] {0});
                    hotspot.writeTo(serialCommunication.getOutputStream());
                    //serialCommunication.write("");
                    //hotspot.writeTo(serialCommunication.getOutputStream());
                    break;
                default:
                    serialCommunication.write(input);
                    break;
            }
        }

        serialCommunication.close();
    }
}
