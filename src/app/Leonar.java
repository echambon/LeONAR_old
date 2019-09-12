package app;

import com.fazecast.jSerialComm.*;

public class Leonar {

	public static void main(String[] args) {
		System.out.println("Program Started!!!");
		SerialPort[] comPorts = SerialPort.getCommPorts();
		if(comPorts.length > 0) {
			SerialPort comPort = comPorts[0];
			comPort.openPort();
			try {
			   while (true)
			   {
			      while (comPort.bytesAvailable() == 0)
			         Thread.sleep(20);

			      byte[] readBuffer = new byte[comPort.bytesAvailable()];
			      int numRead = comPort.readBytes(readBuffer, readBuffer.length);
			      System.out.println("Read " + numRead + " bytes.");
			   }
			} catch (Exception e) { e.printStackTrace(); }
			comPort.closePort();
		} else {
			System.out.println("No COM port found, connect receiver and restart");
		}
			
		System.out.println("Program Finished Sucessfully");
	}

}
