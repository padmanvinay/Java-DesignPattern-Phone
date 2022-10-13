package task2;

import java.util.Scanner;

interface CameraFunctions
{
    void capture();
}
class RealCamera implements CameraFunctions
{
    public void capture()
    {
        System.out.println("Press X to capture picture\n");
        Scanner camscan = new Scanner(System.in);
        String cam =camscan.nextLine();
        if(cam.equals("x"))
        {
            System.out.println("Picture captured , displaying picture\n");
            System.out.println("XXXXXXXXXXXXXXXXX");
            System.out.println("YYYYYYYYYYYYYYYYY");
            System.out.println("ZZZZZZZZZZZZZZZZZ\n");
        }
        else
        {
            System.out.println("Wrong button !! Camera Crashed");
            System.out.println("\n");
        }
    }
}
public class Camera implements CameraFunctions
{
    private RealCamera cam = new RealCamera();
    public void capture()
    {
        cam.capture();
    }
}
