package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student a = new Student("21034569","John",67);
        Student b = new Student("23245432","Ayanda",98);
        Student c = new Student("214354233","Khaya",76);

        MyStack aStack = new MyStack();

        aStack.push(a);
        aStack.push(b);
        aStack.push(c);

        System.out.println("Printing MyStack Values:");
        System.out.println(aStack.pop());
        System.out.println(aStack.pop());
        System.out.println(aStack.pop());

    }
}
