public class PrintSSQ {

    static void PrintSSQ(String s, String currAns) { // s = "abc", currAns = ""
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0); // a
        String remString = s.substring(1); // bc

        // Curr char --> chooses to be a part of currAns
        PrintSSQ(remString, currAns + curr); // bc, a, // add curr

        // curr char --> does not choose to be a part of currAns
        PrintSSQ(remString, currAns); // do not add curr

    }

    public static void main(String[] args) {
        PrintSSQ("abc", "");
    }
}
