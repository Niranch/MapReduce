import java.io.IOException;
import java.util.logging.Logger;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class NameReducer extends MapReduceBase implements
    Reducer<Text, IntWritable,Text, NullWritable> {

  @Override
  public void reduce(Text key, Iterator<IntWritable> values,
      OutputCollector<Text, NullWritable> output, Reporter reporter)
      throws IOException {
    
      output.collect(key, NullWritable.get());
      
   
    
  
  }
}
