import jssc.SerialPort;
import jssc.SerialPortException;

public class tester {

    public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("COM6");

        try {
            serialPort.openPort();

            serialPort.setParams(SerialPort.BAUDRATE_9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE,
                    true, false);

            serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN
                    | SerialPort.FLOWCONTROL_RTSCTS_OUT);

            System.out.println("Angle: " + serialPort.readString());
            System.out.println("String sent: " + serialPort.writeString("20"));

            serialPort.closePort();
        } catch (SerialPortException ex) {
            System.out.println("There is an error on writing string to port: " + ex);
        }
    }
}
