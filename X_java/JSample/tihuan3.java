package JSample;

public class tihuan3 {

    public static void main(String[] args)
    {

        String[] words = new String[]{"apple", "banana", "cherry"};
        for (int i = 0; i < words.length; i++) {
        if (words[i].equals("banana")) {
        words[i] = "pear";
        // 放在里面只打印一次
        // System.out.println(words[i]);
        }
        // 放到外面循环打印
        System.out.println(words[i]);
        // System.out.println();
        // System.out.println();
        }

     String[] words2 = {"dog", "cat", "bird","dog","dog","dog","dog","dog"};
     String searchWord = "dog";
     String replaceWord = "puppy";

     for (int z = 0; z < words2.length; z++) {
        if (words2[z].equals(searchWord)) 
        {
            words2[z] = replaceWord;
            // System.out.println(words2[z]);
        }
        System.out.println(words2[z]);
     }
     



    }
    


}