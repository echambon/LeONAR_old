/**
 * 
 */
package gnss;

/**
 * @author Emmanuel
 *
 */
public class Coordinate {

	private int 				Degree;
	private float 				Minute;
	private CardinalDirection 	Cardinal;
	
	/**
	 * Default constructor
	 */
	public Coordinate() {
		this.Degree 	= 0;
		this.Minute 	= 0.0f;
		this.Cardinal 	= CardinalDirection.North;
	}
	
	/**
	 * Detailed constructor
	 */
	public Coordinate(int degree, float minute, CardinalDirection cardinal) {
		this.Degree 	= degree;
		this.Minute 	= minute;
		this.Cardinal 	= cardinal;
	}

	/**
	 * Getters
	 */
	public int getCoordinateDegree() 					{ return this.Degree; }
	public float getCoordinateMinute() 					{ return this.Minute; }
	public CardinalDirection getCoordinateCardinal() 	{ return this.Cardinal; }
}
