package 연습문제.회사에있는사람;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> s = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name, command;
            name = st.nextToken();
            command = st.nextToken();
            if (command.equals("enter")) {
                s.add(name);
            } else {
                s.remove(name);
            }
        }
        Stack<String> st = new Stack<>();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            st.push(iter.next());
        }
        while (!st.empty()) {
            System.out.println(st.peek());
            st.pop(); }
        br.close();
    }
}



