package task2;

import java.util.*;

interface contactHandler
{
    void showAll(Hashtable contact);
    void search(Hashtable contact);
}
class ContactBook implements contactHandler
{
    public void showAll(Hashtable contact)
    {
        Set<String> show = contact.keySet();
        Iterator<String> itr = show.iterator();
        while(itr.hasNext())
        {
            String key=itr.next();
            System.out.println(key +"->"+contact.get(key));
            System.out.println(" ");
        }
    }
    public void search(Hashtable contact)
    {
        System.out.println("Enter the contact to search");
        String name;
        Scanner nameSearch =new Scanner(System.in);
        name = nameSearch.nextLine();
        Set<String> show = contact.keySet();
        Iterator<String> itr = show.iterator();
        while(itr.hasNext())
        {
            String key=itr.next();
            if(key.toLowerCase().equals(name))
            {
                System.out.println(key +"->"+contact.get(key));
                break;
            }
            if(!itr.hasNext())
            {
                System.out.println("Contact doesn't exist\n");
            }
        }
    }
}

public class Contacts
{
    String conExit;
    public void phoneContact()
    {
        Hashtable<String,String> contact = new Hashtable<>();
        contact.put("Alan","9873664646");
        contact.put("Alex","9735363237");
        contact.put("Amal","9348234234");
        contact.put("Akil","9348234234");
        do {

            System.out.println("1. Show all contacts");
            System.out.println("2. Search for contact\n");
            contactHandler conObj = new ContactBook();
            Scanner find = new Scanner(System.in);
            int choice = find.nextInt();
            switch (choice)
            {
                case 1:
                    conObj.showAll(contact);
                    break;
                case 2:
                    conObj.search(contact);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println("Exit Contacts? y/n\n");
            Scanner conScan = new Scanner(System.in);
            conExit = conScan.nextLine();
        }while(conExit.equals("n"));

    }

}
