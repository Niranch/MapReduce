# MapReduceBabyName
Mapreduce code to process and extract big data NationalNames dataset. 
The mapper file contains code to extracts names that start will letter G, extracts names that contains red, extracts names that contains two vowels, extracts names with no vowel.
There is no need for a reducer since we are only extracting the names. The number of reducer configuration setting is set to zero in the driver class.
