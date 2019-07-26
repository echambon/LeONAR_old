package gnss;

public class Speed {

	private float Norm;
	private float Direction;

	/**
	 * Default constructor
	 */
	public Speed() {
		this.Norm 		= 0.0f;
		this.Direction 	= 0.0f; // North
	}

	/**
	 * Detailed constructor
	 */
	public Speed(float norm, float direction) {
		this.Norm 		= norm;
		this.Direction 	= direction;
	}
	
	/** 
	 * Getters
	 */
	public float getNorm() 		{ return this.Norm; }
	public float getDirection() { return this.Direction; }
}
