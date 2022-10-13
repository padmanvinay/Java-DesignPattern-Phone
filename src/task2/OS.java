package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class OS
{
    /* OPENS CALCULATOR */
    public void calcOpener()
    {
        System.out.println(" ");
        System.out.println("\tCALCULATOR");
        System.out.println("1. Type 'add' for Addition");
        System.out.println("2. Type 'sub' for Subtraction");
        System.out.println("3. Type 'mul' for Multiplication");
        System.out.println("4. Type 'div' for Division\n");
        System.out.println("Enter your choice\n");
        String ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.nextLine().toLowerCase();
        if(!ch.equals("add") && !ch.equals("sub") &&!ch.equals("mul") &&!ch.equals("div") )
        {
            System.out.println("Operation doesn't exist");
        }
        else
        {
            System.out.println("Enter First number");
            int num1 = scan.nextInt();
            System.out.println("Enter Second number");
            int num2 = scan.nextInt();
            Calculator casio = new Calculator();
            CalculationHandler casioV2 = casio.getCalc(ch);
            casioV2.calculations(num1, num2);
        }
    }

    /* OPENS CONTACT*/

    public void contactOpener()
    {
        System.out.println("\t  Contacts");
        Contacts contact = new Contacts();
        contact.phoneContact();
    }

    /* OPENS USERDETAILS */

    public void detailsOpener()
    {
        System.out.println("Enter Details \nName\nAge\nCompany\nYear of Birth\n");
        System.out.println("Enter User details\n");
        Scanner formScan = new Scanner(System.in);
        ArrayList<UserDetails> forms = new ArrayList<>();
        UserDetails formVin = new UserBuilder().setName(formScan.nextLine()).setAge(formScan.nextInt()).
                setCompany(formScan.next()).setBirthYear(formScan.nextInt()).getNotepad();
        forms.add(formVin);
//        UserDetails formVinay = new UserBuilder().setAge(22).setBirthYear(2000).setName("vinay").getNotepad();
//        forms.add(formVinay);
        System.out.println("\tDisplaying Entered Details\n");
        for(UserDetails nf:forms)
        {
            System.out.println(nf);
        }
        System.out.println("\n");
    }

    /* OPENS VIDEOPLAYER */


    public void VPOpener()
    {
        System.out.println("Choose the video you want to play" + "\n" +
                "1 - for football " + "\n" + "2 - for cricket");
        Scanner vidscan = new Scanner(System.in);
        System.out.println("Enter our choice");
        int vidstr;
        VideoPlayer vid;
        vidstr = vidscan.nextInt();
        switch (vidstr) {
            case 1:
                vid = new FootballVideo();
                vid.video();
                break;
            case 2:
                vid = new CricketVideo();
                vid.video();
                break;
            default:
                System.out.println("Wrong choice!!");
        }
    }

    /* OPENS CAMERA */

    public void camOpener()
    {
        CameraFunctions photo = new Camera();
        photo.capture();
    }
}
