package Day_13.stack;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        Stack<Boolean> boolStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        Stack<Double> doubleStack = new Stack<>();


        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int top_elem=st.peek();
        System.out.println("Top element: " + top_elem); // Output: 40

        int removed_elem=st.pop();
        System.out.println("Removed element: " + removed_elem); // Output: 40

        int size=st.size();
        System.out.println("Size of stack: " + size); // Output: 3

        System.out.println("The stack is empty or not: "+st.isEmpty()); // Output: false
        
        while(st.size()>0)
        {
            int popped=st.pop();
            System.out.println("Removed element: " + popped);
        }
        System.out.println("The stack is empty or not: "+st.isEmpty()); // Output: true

        System.out.println(st.pop()); // Output: 30
        System.out.println(st.pop()); // Output: 20
        System.out.println(st.pop()); // Output: 10
    }
}
