package geometry;
import utility.Ray;
import utility.Color;
public abstract class GeometricObj 
{
    public Color color;

    public abstract double hit(Ray ray);
}
