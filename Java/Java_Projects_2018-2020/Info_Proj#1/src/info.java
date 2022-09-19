import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class info {

	public static float countCharactersMap(StringBuilder br,int count) // counts the frequency of each character in test.txt
	{
		
		float div = 0;
		
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for(int i = 0; i < ((CharSequence) br).length(); i++){
        	
            char c = ((CharSequence) br).charAt(i);
           
            if(((c == ' ') || (c == '\t')))
            {
                continue;
            }
            
            if(charMap.containsKey(c))
            {
               charMap.put(c, charMap.get(c) + 1);
            }
            
            else
            {
                // If new character put that character in the map
                // with the value as 1
               charMap.put(c, 1);
            }
        }
        
        // Displaying the map values
        Set<Map.Entry<Character, Integer>> numSet = charMap.entrySet();
        
        int i = 0;
        
        for(Map.Entry<Character, Integer> m : numSet)
        {
        	div = m.getValue() / count;
            System.out.print("P(x(" + i + "):" + m.getKey() + " - " + div);
            i = i + 1;
        }
        
        for(Map.Entry<Character, Integer> m : numSet)
        {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
        
        return div;
		
   }

  public static void main(String args[]) throws IOException
  {
	  
	  // first task of exercise
	  
	  BufferedReader reader = null;
	  StringBuilder sb = new StringBuilder();
	  
	  int count_of_chars = 0;
	  int count_of_lines = 0;
	  int count_of_words = 0;

      try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\κωστας κ\\Desktop\\test.txt")))
      {
    	  
    	  System.out.append("\n");

          // read line by line
          String currentline;
          while ((currentline = br.readLine()) != null) 
          {
              sb.append(currentline);
              
          }
          
          sb.append(System.lineSeparator());

      } 
      
      catch (IOException e) 
      {
          System.err.format("IOException: %s%n", e);
      }

      System.out.println("\t\t\t\t\t\t\t\t\t<<The current text>>\n");
      System.out.print(sb);
      
      try
      {
          //Creating BufferedReader object
           
          reader = new BufferedReader(new FileReader("C:\\\\Users\\\\κωστας κ\\\\Desktop\\\\test.txt"));
           
          //Reading the first line into currentLine
           
          String current = reader.readLine();
           
          while (current != null)
          {
               
              count_of_lines = count_of_lines + 1;
               
              String[] words = current.split(" ");
              count_of_words = count_of_words + words.length;
               
              for (String word : words)
              {
                  count_of_chars = count_of_chars + word.length();
              }
               
              current = reader.readLine();
          }
           
           
          System.out.println("The total number of characters in the file is:" + count_of_chars);
           
      } 
      
      catch (IOException e) 
      {
          e.printStackTrace();
      }
      
      finally
      {
          try
          {
              reader.close();           
          }
          catch (IOException e) 
          {
              e.printStackTrace();
          }
      }
      
      System.out.println();
      
      info.countCharactersMap(sb,count_of_chars); // frequency of letters and symbols
      
      
      
      
       
  }

  
      
 }
