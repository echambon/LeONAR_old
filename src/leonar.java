import gnu.io.*;
import gnss.*;
import java.util.Enumeration;

public class leonar {

	public static void main(String[] args) {
		// debug Position
		Position test = new Position();
		//Position test2 = new Position(2.0f, CardinalDirection.South, 4.5f, CardinalDirection.West);
		
		// debug COM
		System.out.println("Program Started!!!");
		
		CommPortIdentifier serialPortId;
		
		Enumeration enumComm;
		
		enumComm = CommPortIdentifier.getPortIdentifiers();
		
		while(enumComm.hasMoreElements())
		{
			serialPortId = (CommPortIdentifier)enumComm.nextElement();
			if(serialPortId.getPortType() == CommPortIdentifier.PORT_SERIAL)
			{
				System.out.println(serialPortId.getName());
			}
		}
		
		System.out.println("Program Finished Sucessfully");
	}

}
