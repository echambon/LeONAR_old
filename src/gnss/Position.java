/**
 * 
 */
package gnss;

/**
 * @author Emmanuel
 *
 */
public class Position {

	private Coordinate 	Latitude;
	private Coordinate 	Longitude;
	private float 		Altitude;
	
	/**
	 * Default constructor
	 */
	public Position() {
		this.Latitude 	= new Coordinate(0,0.0f,CardinalDirection.North);
		this.Longitude 	= new Coordinate(0,0.0f,CardinalDirection.East);
		this.Altitude 	= 0.0f;
	}
	
	/**
	 * Detailed constructor
	 */
	public Position(Coordinate latitude, Coordinate longitude, float altitude) {
		this.Latitude 	= latitude;
		this.Longitude 	= longitude;
		this.Altitude	= altitude;
	}

	/**
	 * Getters
	 */
	public Coordinate 	getLatitude() 	{ return this.Latitude; }
	public Coordinate 	getLongitude() 	{ return this.Longitude; }
	public float 		getAltitude() 	{ return this.Altitude; }
}
