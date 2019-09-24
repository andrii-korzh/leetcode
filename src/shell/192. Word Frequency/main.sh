# Read from the file file.txt and output all valid phone numbers to stdout.
cat words.txt | sed 's/ /\n/g;' | sed '/^\s*$/D' | sort | uniq -c | sort -nr | awk '{print $2 " " $1}'

# sed - Replaces all spaces with new lines
#sed - deletes all whitespace-only lines
#sort - sorts all the words
#uniq -c - removes the duplicates and prefixes the frequency of each word.
#sort -nr - sorts the input based on the frequency (-r is for descending order)
#awk '{print $2 " " $1} - reverses the ordering of frequency and word in a line