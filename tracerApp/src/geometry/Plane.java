package geometry;


import utility.Norm;
import utility.Color;
import utility.PointTRED;
import utility.Ray;


public class Plane extends GeometricObj
{
    PointTRED point;
    Norm nor;

    //(p-a) * n = 0


    public Plane(PointTRED point, Norm nor, Color color)
    {
        this.point = new PointTRED(point);
        this.nor = new Norm(nor);
        this.color = new Color(color);
    }

    public double hit(Ray ray)
    {

         

        double t = point.sub(ray.origin).dot(nor)/ray.direction.dot(nor);

        if (t > 10E-9)
        {
            return t;
        }
        else
        {
            return 0.0;
        }

        

    }
}
