package robor.forestfireboundaries;

import robor.forestfireboundaries.protobuf.HeaderProtos;
import robor.forestfireboundaries.protobuf.HotspotDataProtos;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final String PORT = "COM4";

    public static void main(String[] args) throws IOException, InterruptedException {
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
                    Date date = new Date();
                    DateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
                    String dateString = sdf.format(date);
                    String startTime = sdf.format(date);

                    for (int i = 0; i < 1000; i++) {
                        date = new Date();
                        dateString = sdf.format(date);
                        System.out.println("" + i + " " + dateString);
                        sendHotspotMessage(52.2275864,6.6932629, 500.234, serialCommunication.getOutputStream());
                        Thread.sleep(100);
                    }

                    System.out.println("\nStartTime: " + startTime
                            + "\nEndTime: " + dateString);
                    break;
                default:
                    //serialCommunication.write(input);
                    break;
            }
        }
        serialCommunication.close();
    }

    private static void sendHotspotMessage(double latitude, double longitude, double temperature, OutputStream outputStream) {
        HotspotDataProtos.Hotspot hotspot = HotspotDataProtos.Hotspot.newBuilder()
                .setLatitude(latitude)
                .setLongitude(longitude)
                .setTemperature(temperature)
                .build();
        HeaderProtos.Header header = HeaderProtos.Header.newBuilder()
                .setMessageId(HotspotDataProtos.Hotspot.getDescriptor().getName().hashCode())
                .setMessageLength(hotspot.getSerializedSize())
                .build();
        try {
            header.writeTo(outputStream);
            hotspot.writeTo(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
