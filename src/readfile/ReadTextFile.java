package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/is/IdeaProjects/Project1/eat-java-coding-exam/src/readfile/file-data");

        BufferedReader br = new BufferedReader(fr);
        String str = " ";

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

    }

}
