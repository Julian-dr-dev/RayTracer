package geometry;

import utility.PointTRED;
import utility.Color;
import utility.Ray;

public class Sphere {
    public PointTRED center; 
    public double radius;
    public Color color;

    public Sphere(PointTRED center, double radius, Color color)
    {
        this.center = new PointTRED(center);
        this.radius = radius;
        this.color = new Color(color);

    }

    public double hit(Ray ray)
    {
        double a = ray.direction.dot(ray.direction);
        
         
    }

}
