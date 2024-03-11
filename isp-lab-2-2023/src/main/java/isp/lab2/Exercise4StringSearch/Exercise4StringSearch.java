package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.List;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        List<String> resultList = new ArrayList<String>();
        String[] inputArray = input.split(",");
        for (String str : inputArray) {
            if (str.contains(substring)) {
                resultList.add(str);
            }
        }
        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
