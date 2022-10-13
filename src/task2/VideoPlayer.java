package task2;

abstract public class VideoPlayer
{
    abstract void start();
    abstract void stop();
    public final void video()
    {
        start();
        stop();
    }
}
class FootballVideo extends VideoPlayer
{
    public void start()
    {
        System.out.println("Playing Football Video");
        System.out.println("F O O T B A L L");
    }
    public void stop()
    {
        System.out.println(" ");
        System.out.println("Video Ended\n");
    }
}
class CricketVideo extends VideoPlayer
{
    public void start()
    {
        System.out.println("Playing Cricket Video");
        System.out.println("C R I C K E T");
    }
    public void stop()
    {
        System.out.println(" ");
        System.out.println("Video Ended\n");
    }
}
