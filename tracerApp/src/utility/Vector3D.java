package utility;


public class Vector3D {

    public double x, y, z;

    public Vector3D() {
        x = 0.0;
        y = 0.0;
        z = 0.0; 

    }


    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z; 
        
    }


    public Vector3D(Vector3D vec) {
        x = vec.x;
        y = vec.y;
        z = vec.z; 
        
    }


    public Vector3D add(Vector3D vec)
    {
        return new Vector3D(x+vec.x, y+vec.y, z+vec.z);
    } 


    public Vector3D sub(Vector3D vec)
    {
        return new Vector3D(x-vec.x, y-vec.y, z-vec.z);
    } 

    public double dot(PointTRED pnt)
    {
        return x*pnt.x + y*pnt.x + z*pnt.z;
    } 

    public double dot(Vector3D vec)
    {
        return x*vec.x + y*vec.x + z*vec.z;
    } 

    public double dot(Norm nor)
    {
        return x *nor.x + y*nor.y + z*nor.z;
    }

    public void normalize()
    {
        double magnitude = Math.sqrt(x*x + y*y + z*z);
        x /= magnitude;
        y /= magnitude;
        z /= magnitude;
    }



}
