/**
 * 
 */
package com;

/*import gnu.io.*;
import java.io.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Enumeration;*/

/**
 * This class provides the utilities to communicate via USB port (with GPS receiver for example ...)
 * Inspired from http://www.snip2code.com/Snippet/1044/Java--read-from-USB-using-RXTX-library
 * @author Emmanuel
 *
 */
public class Communicator { // implements SerialPortEventListener

//	private 	InputStream 				inputStream; 			// Stream for the storage of incoming data
//	private 	OutputStream 				outputStream; 			// Stream for the dispatching of data
//	private 	final int 					PORT_TIMEOUT = 2000; 	// Timeout of the USB port
//	private 	SerialPort 					serialPort; 			// Representation of the serial port used for the communication
//	private 	String 						portString; 			// String representation of the serial port used for the communication
//	private 	int 						baudRate; 				// Serial port baud rate
//	protected 	LinkedBlockingQueue<Byte> 	receivedBytes; 			// Buffer that stores the received bytes from the media
//	
//	/**
//	 * Builds a new manager for the communication via USB port.
//	 * @exception IOException if an error occurred during the opening of the USB port
//	 * @param port: place the right COM port here, OS dependent
//	 */
//	public Communicator(String port, int baudRate) throws IOException {
//		receivedBytes = new LinkedBlockingQueue<Byte>(100000);
//		this.portString = port;
//		
//		//Check that the USB port exists and is recognized:
//		Enumeration<?> portList = CommPortIdentifier.getPortIdentifiers();
//		boolean portFound = false;
//		CommPortIdentifier portId = null;
//		while (portList.hasMoreElements()) {
//			portId = (CommPortIdentifier) portList.nextElement();
//		    if(portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
//		    	// System.out.println(portId.getName());
//				if(portId.getName().equals(this.portString)) {
//					System.out.println("Found port: " + this.portString);
//				    portFound = true;
//				    break;
//				} 
//		    } 
//		} 
//	
//		if(!portFound) 
//		    throw new IOException("port " + this.portString + " not found.");
//		
//		try {
//			System.out.println("USB port opening...");
//		    this.serialPort = (SerialPort)portId.open("Communicator", PORT_TIMEOUT);
//		    System.out.println("USB port opened");
//		    
//		    this.inputStream 	= this.serialPort.getInputStream();
//		    this.outputStream 	= this.serialPort.getOutputStream();
//		    
//		    //this.serialPort.addEventListener(this);
//			//this.serialPort.notifyOnDataAvailable(true);
//			//#==================================================================#
//			// WARNING! - DO NOT SET THE FOLLOWING PROPERTY WITH RXTX LIBRARY, IT
//			// 			  CAUSES A PROGRAM LOCK:
//			// 	serialPort.notifyOnOutputEmpty(true);
//			//#==================================================================#
//			    	
//		    //wait for a while to leave the time to javax.comm to
//		    //correctly configure the port:
//		    Thread.sleep(1000);
//		    
//			this.baudRate = baudRate;
//			this.serialPort.setSerialPortParams(this.baudRate, 
//	    		SerialPort.DATABITS_8, 
//	    		SerialPort.STOPBITS_1, 
//				SerialPort.PARITY_NONE);
//		    
//			//this.serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
//			(new Thread(new SerialReader(this.inputStream))).start();
//			
//		    System.out.println("setted SerialPortParams");
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			throw new IOException(e.getMessage());
//		}
//	}
//	
//	/**
//	 * Closes streams and serial port properly
//	 */
//	public void closeUSB() {
//		//close the streams for serial port:
//		try {
//			this.inputStream.close();
//			this.outputStream.close();
//			this.serialPort.close();
//			System.out.println("USB port closed");
//		} catch (IOException e) {
//			System.err.println("Cannot close streams:" + e.getMessage());
//		}
//	}
//	
//	/**
//	 * Listener for USB events
//	 * @param event new event occurred on the USB port
//	 */	
//	//@Override
//	/*public void serialEvent(SerialPortEvent event) {
//		switch (event.getEventType()) {
//		
//		case SerialPortEvent.BI:
//		case SerialPortEvent.OE:
//		case SerialPortEvent.FE:
//		case SerialPortEvent.PE:
//		case SerialPortEvent.CD:
//		case SerialPortEvent.CTS:
//		case SerialPortEvent.DSR:
//		case SerialPortEvent.RI:
//		case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
//			//nothing to do...
//		    break;
//
//		case SerialPortEvent.DATA_AVAILABLE:
//			byte received = -1;
//			do {
//				try {
//					received = (byte)this.inputStream.read();
//				} catch (IOException e) {
//					System.err.println("Error reading USB:" + e.getMessage());
//				}
//			
//				synchronized (receivedBytes) {
//					try {
//						this.receivedBytes.add(received);
//					} catch (IllegalStateException ew) {
//						System.err.println(ew.getMessage());
//						this.receivedBytes.poll();
//						this.receivedBytes.add(received);
//					}
//				}
//			} while(received != -1);
//
//		    break;
//		}
//	}*/

}
