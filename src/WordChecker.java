import java.util.ArrayList; 

public class WordChecker {

    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> list)
    {
        wordList = list; 
    }

    public boolean isWordChain() 
    {
        String previousWord = ""; 
        for (int counter = 0; wordList.size() > counter; counter++)
        {
            if (counter>0){
                previousWord = wordList.get(counter-1); 
            }
            String currentWord = wordList.get(counter); 
            if (currentWord.contains(previousWord) == false)
            {
                return false; 
            }
        }

        return true; 
    }


    public ArrayList<String> createList(String target) {
        ArrayList<String> temp = new ArrayList<>(); 
        for (int counter2 = 0; wordList.size() > counter2; counter2++){
            String word = wordList.get(counter2); 
            String beginWord = ""; 
            if (word.length()>target.length()){
                beginWord = word.substring(0,target.length()); 
            }
            if (beginWord.equals(target) || word.equals(target)){
                String tempWord = word.substring(target.length(), word.length()); 
                if (word.equals(target)){
                    temp.add("");
                }
                else {
                    temp.add(tempWord); 
                }
            }
        }
        return temp; 
    }
}