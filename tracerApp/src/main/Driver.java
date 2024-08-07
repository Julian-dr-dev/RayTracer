package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class Driver {

    public static void main(String[] args)
    {
        long start = System.nanoTime();

        Random rando = new Random();


        int width = 1600;
        int height = 900; 

        File image = new File("image.png");

        BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);



        for (int y = 0; y< height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                buffer.setRGB(x, y, rando.nextInt());
            }
        }

        try {
            ImageIO.write(buffer, "PNG", image);
        } catch (Exception e) {
            System.out.println("could not write image.");

            System.exit(1);

        }
        long end = System.nanoTime();

        System.out.println("Loop time: " + (end - start) / 1000000000.0F);
    }
}
