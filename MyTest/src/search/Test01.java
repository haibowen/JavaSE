package search;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Test01 {

    public static void main(String[] args) {

        ST<String ,Integer> st;
        st=new ST<String, Integer>();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key=StdIn.readString();
            st.put(key,i);


        }
        for (String s:st.keys())
            StdOut.println(s+""+st.get(s));

    }

}
