import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import java.util.logging.Logger;

public class NameMapper extends MapReduceBase implements
    Mapper<LongWritable, Text, Text, NullWritable> {
	//Logger maplog = Logger.getLogger(NameMapper.class.getName());
	 
  @Override
  
  public void map(LongWritable key, Text value,
      OutputCollector<Text, NullWritable> output, Reporter reporter)
      throws IOException {
    String s = value.toString();
    String words[] = s.split(",");
    /*Getting names containing syllable "red"*/
      
    /*	if(words[1].contains("red"))
    		output.collect(new Text(words[1]),NullWritable.get());
   	*/
   /*Getting names without any vowels*/
   /* String vowels="aAeEiIoOuU";
    int vowelCount=0;
    CharacterIterator it= new StringCharacterIterator(words[1]);
    while(it.current()!=CharacterIterator.DONE)
    {
    	if(!(vowels.indexOf(it.current()) == -1))
    	{
    		vowelCount+=1;//Increment vowel count for every vowel found
    	}
    	it.next();
    }
    if(vowelCount==0)//If no vowel found
    {    	
    	output.collect(new Text(words[1]),NullWritable.get());
    }
    */
    
    
    /*Getting names that starts with letter "G"*/
    /*String mykey= Character.toString(words[1].charAt(0));
    //maplog.info("key: " + mykey+" "+words[1]);
    if(mykey.equalsIgnoreCase("G"))
    {    	
    	output.collect(new Text(words[1]),NullWritable.get());
    }*/
    
    
    /* Getting names with 2 vowelCount */
    String vowels="aAeEiIoOuU";
    int vowelCount=0;
    CharacterIterator it= new StringCharacterIterator(words[1]);
    while(it.current()!=CharacterIterator.DONE)
    {
    	if(!(vowels.indexOf(it.current()) == -1))
    	{
    		vowelCount+=1;
    	}
    	it.next();
    }
    if(vowelCount==2)
    {    	
    	output.collect(new Text(words[1]),NullWritable.get());
    }
    
       
     
   
    //*OriginalProgram*/
    /*for (String word : s.split("\\W+")) {
      if (word.length() > 0) {
        output.collect(new Text(word), new IntWritable(1));
      }
    }*/
    
 
    
  }
}
