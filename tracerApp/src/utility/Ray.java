 package utility;


public class Ray 
{
    public PointTRED origin;
    public Vector3D direction;


    public Ray(PointTRED origin, Vector3D direction)
    {
        this.origin = new PointTRED(origin);
        this.direction = new Vector3D(direction);
    }
}
