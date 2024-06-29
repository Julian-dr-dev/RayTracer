package main;

public class Driver {

    public static void main(String[] args)
    {
        long start = System.nanoTime();


        int width = 640;
        int height = 480; 


        for (int y = 0; y< height; y++)
        {
            for (int x = 0; x < width; x++)
            {

            }
        }

        long end = System.nanoTime();

        System.out.println("Loop time: " + (end - start) / 1000000000.0F);
    }
}
