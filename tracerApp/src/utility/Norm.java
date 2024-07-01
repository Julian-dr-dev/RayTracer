package utility;

public class Norm {

    public double x, y, z;

    public Norm() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        
    }

    public Norm(double x, double y, double z)
    {
        this.x = x;
        this.y = y; 
        this.z = z;
    }

    public Norm(Norm nor)
    {
        x = nor.x;
        y = nor.y;
        z = nor.z;
    }


    public double dot(Norm nor)
    {
        return x*nor.x + y*nor.y + z*nor.z;
    }

    public void normalize()
    {
        double magnitude = Math.sqrt(x*x + y*y + z*z);
        x /= magnitude;
        y /= magnitude;
        z /= magnitude;
    }

}
