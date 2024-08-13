import DS.LinkedStack;
import DS.Pile;
import DS.Stack;
import DS.LinkedStack.*;
import DS.Node;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Main {
    public static boolean isOperatore(char op){
        switch (op){
            case '+':
            case'-':
            case '*':
            case '/':
            case'(':
            case')':
                return true;

        }
        return false;
    }

    public static int operatorePower(char item){
        if(item=='*' || item =='/') return 2;
        else if (item=='-' || item =='+') return 1;
        else if(item=='(' || item ==')') return 3;
        else return 0;
    }
    public static void main(String[] args) {
//        BinaryTree.Element[] BST = new BinaryTree.Element[1];
//
//        BinaryTree.insertElementRecursive(BST, 5);
//        BinaryTree.insertElementRecursive(BST, 3);
//        BinaryTree.insertElementRecursive(BST, 7);
//        BinaryTree.insertElementRecursive(BST, 1);
//        BinaryTree.insertElementRecursive(BST, 4);
//        BinaryTree.insertElementRecursive(BST, 6);
//        BinaryTree.insertElementRecursive(BST, 10);
//
//        System.out.println("Affichage des elements:");
//        BinaryTree.prefixe(BST[0]);
//        System.out.println();
//
//        System.out.println("Le nombre des elements est: " + BinaryTree.elementCounter(BST[0]));
//
//        System.out.println("+++Les feuilles dans cet Arbre+++");
//        BinaryTree.displayLeafs(BST[0]);
//        System.out.println();
//
//        System.out.println("Hauteur de l'Arbre est: " + BinaryTree.heightArbre(BST[0]));
//
//        System.out.println("---------------------------");
//        System.out.println("---------------------------");
//
//        Pile.printHello();

//        Stack<String> firstStack=new Stack(10);
//        firstStack.push("Mennoun");
//        firstStack.push("Abdelfatah");
//        firstStack.push("Here");
//        firstStack.push("Moulshe");
//        firstStack.push("Hello");
//        firstStack.push("Now");
//        firstStack.push("10");
//        firstStack.push("Good");
//        System.out.println(firstStack.isEmpty());
//        firstStack.printElements();
//        LinkedStack stack = new LinkedStack(); // Create a LinkedStack with the root node
//        BiPredicate<Character, Character> isPair = (left, right) -> {
//            if (left == '{' && right == '}') return true;
//            else if (left == '(' && right == ')') return true;
//            else if (left == '[' && right == ']') return true;
//            return false;
//        };
//        // Push additional nodes onto the stack
//        String kewordTest="{6+1*(8+6)})";
//        for(int i=0;i<kewordTest.length();i++){
//            if(kewordTest.charAt(i)=='{' || kewordTest.charAt(i)=='(' || kewordTest.charAt(i)=='['){
//                stack.push(kewordTest.charAt(i));
//            }
//            if(kewordTest.charAt(i)=='}' || kewordTest.charAt(i)==')' || kewordTest.charAt(i)=='}'){
//                if(stack.isEmpthy()||isPair.test((char)stack.getTopElemnt(), kewordTest.charAt(i))) System.out.println("Not Balnced....");
//                stack.pop();
//            }
//        }
//        stack.showAll();
//        System.out.println("Rhis expertion is correct: "+stack.isEmpthy() );
//        System.out.println(isPair.test('(', ')'));
//        stack.showAll();
        LinkedStack stack = new LinkedStack();
        Scanner input=new Scanner(System.in);
        String myExprestion=input.nextLine();
        ArrayList<Character> prefix=new ArrayList<>();
        for (int i = 0; i < myExprestion.length(); i++) {
            if(isOperatore(myExprestion.charAt(i))){
                if(!stack.isEmpthy() && operatorePower((char)stack.getTopElemnt())>=operatorePower(myExprestion.charAt(i))){
                    prefix.add((char)stack.getTopElemnt());
                    stack.pop();
                    stack.push(myExprestion.charAt(i));
                    continue;
                }
                stack.push(myExprestion.charAt(i));
            }else{
                prefix.add(myExprestion.charAt(i));
            }
        }
        while (!stack.isEmpthy()){
            prefix.add((char)stack.getTopElemnt());
            stack.pop();
        }
        System.out.println(prefix.toString());
    for (char elem:prefix){
        System.out.printf("%c ",elem);
    }

    }
}