import java.util.ArrayList;
import java.util.List;

import java.lang.String;
import java.util.Arrays;
import org.apache.commons.lang3.RandomStringUtils;

public class LongestCommonPrefix {
    public static String Findlcp(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String lcp = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String currentword = strs[i];
            int j = 0;

            while (j < currentword.length() && j < lcp.length() && currentword.charAt(j) == lcp.charAt(j)) {
                j++;
            }
            if (j == 0)
                return "";
            lcp = currentword.substring(0, j);
        }


        return lcp;
    }
    private static List<String> genRandomString(int size) {
        List<String> randomstring = new ArrayList<String>();
        String prefix = "abb";
        String genString = "";
        for (int i = 0; i < 20; i++) {
            genString = prefix + RandomStringUtils.randomAlphabetic(10);
            randomstring.add(genString);
        }
        System.out.println(randomstring);
        return randomstring;
    }

    public static void main(String[] args) {
        long startTime=System.nanoTime();
        String[] strs = genRandomString(10).toArray(new String[0]);
        String result = Findlcp(strs);

        System.out.println(result);
        long endTime=System.nanoTime();
        long TotalTime=endTime-startTime;
        System.out.println("\nexecutiontime:"+TotalTime/10000);

    }

}