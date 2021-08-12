public class StackUsingArray {

 static class Stack{
     int len = 2;
     int top;
     int arr[] = new int[len];


     Stack(){
         top =-1;
     }

     boolean isEmpty(){
         if (top==-1) return true;
         return false;
     }

    void push(int x){
         if(top >= len-1){
             System.out.println("Stack OverFlow");
             return;
         }
         top++;
         arr[top] = x;
     }

     int pop(){
         if(top==-1){
             System.out.println("Stack underflow");
         }
         int value = arr[top];
         top--;
         return value;
     }

     int peek(){
         if(top ==-1){
             System.out.println("Stack is empty");
             return -1;
         }
         return arr[top];
     }

     void print(){
         for (int i=top; i>=0;i--){
             System.out.println(arr[i]);
         }
     }


 }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(20);
        st.push(300);
        st.push(10);
        System.out.println(st.peek());
        System.out.println("calling pop");
        st.pop();
        st.print();
        st.pop();
        st.pop();

    }



}
