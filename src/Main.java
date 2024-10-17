import java.util.ArrayList; 

public class Main 
{
    public static void main (String[] args)
    {
        ArrayList<String> ex1 = new ArrayList<String>(); 
        ex1.add("an"); 
        ex1.add("band");
        ex1.add("band"); 
        ex1.add("abandon");  
        WordChecker ex1Insta = new WordChecker(ex1);
        System.out.println(ex1Insta.isWordChain()); 
        ArrayList<String> ex2 = new ArrayList<String>(); 
        ex2.add("to");
        ex2.add("too"); 
        ex2.add("stool"); 
        ex2.add("tools");  
        WordChecker ex2Insta = new WordChecker(ex2); 
        System.out.println(ex2Insta.isWordChain());
        ArrayList<String> ex3 = new ArrayList<String>(); 
        ex3.add("catch");
        ex3.add("bobcat"); 
        ex3.add("catchacat"); 
        ex3.add("cat");
        ex3.add("at"); 
        WordChecker ex3Insta = new WordChecker(ex3); 
        System.out.println(ex3Insta.createList("cat"));
        System.out.println(ex3Insta.createList("catch"));
        System.out.println(ex3Insta.createList("dog"));
    }    

}
