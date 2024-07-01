package utility;

public class PointTRED {

    public double x, y, z;

    public PointTRED() 
    {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }


    public PointTRED(double x, double y, double z)
    {
        this.x = x;
        this.y = y; 
        this.z = z;
    }

    public PointTRED(PointTRED pnt)
    {
        x = pnt.x;
        y = pnt.y;
        z = pnt.z;


    }




    public PointTRED add(PointTRED point)
    {
        return new PointTRED(x+point.x, y+point.y, z+point.z);

    }


    public PointTRED sub(PointTRED point)
    {
        return new PointTRED(x-point.x, y-point.y, z-point.z);

    }






}
