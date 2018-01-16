package robor.forestfireboundaries;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sun.istack.internal.Nullable;

import java.io.IOException;
import java.io.OutputStream;

public class SerialCommunication implements SerialPortDataListener {

    private static final char CR = (char) 0x0D;

    private static final int BAUD_RATE = 115200;
    private static final int DATA_BITS = 8;
    private static final int STOP_BITS = 1;
    private static final int PARITY = SerialPort.NO_PARITY;
    private static final int FLOW_CONTROL = SerialPort.FLOW_CONTROL_DISABLED;

    private SerialPort serialPort = null;

    public SerialCommunication(String portName) {
        serialPort = SerialPort.getCommPort(portName);
        serialPort.setComPortParameters(BAUD_RATE, DATA_BITS, STOP_BITS, PARITY);
        serialPort.setFlowControl(FLOW_CONTROL);
        serialPort.addDataListener(this);
    }

    public void write(String command) throws IOException {
        serialPort.getOutputStream().write((command + CR).getBytes());
        serialPort.getOutputStream().flush();
    }

    public void write(byte[] bytes) throws IOException {
        serialPort.getOutputStream().write(bytes);
        serialPort.getOutputStream().flush();
    }

    public void open() {
        if(serialPort.openPort()) {
            System.out.println("Port " + serialPort.getSystemPortName() + " is now open.");
        } else {
            System.out.println("Port " + serialPort.getSystemPortName() + " could not be opened.");
        }
    }

    public void close() {
        if(serialPort.closePort()) {
            System.out.println("Port " + serialPort.getSystemPortName() + " is now closed.");
        } else {
            System.out.println("Port " + serialPort.getSystemPortName() + " could not be closed.");
        }
    }

    @Override
    public int getListeningEvents() {
        return SerialPort.LISTENING_EVENT_DATA_AVAILABLE | SerialPort.LISTENING_EVENT_DATA_WRITTEN;
    }

    @Override
    public void serialEvent(SerialPortEvent event) {
        switch(event.getEventType()) {
            case SerialPort.LISTENING_EVENT_DATA_AVAILABLE:
                byte[] data = new byte[serialPort.bytesAvailable()];
                int bytesRead = serialPort.readBytes(data, data.length);

                System.out.print(new String(data, 0, bytesRead));

                break;
            case SerialPort.LISTENING_EVENT_DATA_WRITTEN:
                break;
        }
    }

    public OutputStream getOutputStream() {
        return serialPort.getOutputStream();
    }
}
