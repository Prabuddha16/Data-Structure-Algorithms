package Stack.Stack.DeleteMiddleOfStack;

import java.util.Stack;

public class Main {
    public void deleteMid(Stack<Integer> s, int sizeOfStack){
        int middle = sizeOfStack/2;
        if(s.isEmpty()) return ;
        deleteMiddle( s, middle);
    }

    public void deleteMiddle(Stack<Integer> s, int middle ){
        if( middle == 0 ) {
            s.pop();
            return ;
        }

        int temp = s.pop();
        deleteMiddle(s, middle-1 );
        s.push(temp);
        return ;
    }
}
