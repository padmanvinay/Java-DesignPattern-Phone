package task2;


import java.util.Scanner;

public class Phone
{
    public static void main(String[] args)
    {
        int choice;
        String exit;
        String calcExit;
        String camexit;
        String vpExit;
        do
        {
            System.out.println("\tPhone\n");
            System.out.println("1 : Calculator");
            System.out.println("2 : Camera");
            System.out.println("3 : Video Player");
            System.out.println("4 : NotePad");
            System.out.println("5 : Contacts\n");
            System.out.println("Choose which app you want to open: ");
            Scanner app = new Scanner(System.in);
            choice = app.nextInt();
            switch (choice)
            {
                case 1:
                    do
                    {
                        OS openCal = new OS();
                        openCal.calcOpener();

                        System.out.println("Do u want to exit calculator? y/n\n");
                        Scanner calcScan = new Scanner(System.in);
                        calcExit = calcScan.nextLine();

                    }while(calcExit.equals("n"));
                        break;
                case 2:
                    do
                    {
                        OS openCam = new OS();
                        openCam.camOpener();

                        System.out.println("Do u wanna exit camera?y/n\n");
                        Scanner exitcam = new Scanner(System.in);
                        camexit = exitcam.nextLine();

                    }while((camexit.equals("n")));
                    break;
                case 3:
                    do
                    {
                        OS vpOpen = new OS();
                        vpOpen.VPOpener();

                        System.out.println("Do u wanna exit video player? y/n\n");
                        Scanner exitvp  = new Scanner(System.in);
                        vpExit = exitvp.nextLine();

                    }while(vpExit.equals("n"));
                    break;

                case 4:

                        OS openDet = new OS();
                        openDet.detailsOpener();
                        break;
                case 5:

                        OS openCon = new OS();
                        openCon.contactOpener();
                        break;

            }
            System.out.println("Do you want to exit from phone? y/n \n");
            Scanner scanexit = new Scanner(System.in);
            exit = scanexit.nextLine();
            System.out.println("\n\n");
        } while (exit.equals("n"));
        System.out.println("Closing .......");

   }
}

