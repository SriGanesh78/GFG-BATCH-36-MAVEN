package com.ganesh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        MyCalc myCalc = new MyCalc();
        int sum = myCalc.add(5, 3);
        System.out.println("Sum of 5 and 3 is: " + sum);

        int difference = myCalc.subtract(10, 4);
        System.out.println("Difference of 10 and 4 is: " + difference);

        int product = myCalc.multiply(6, 7);
        System.out.println("Product of 6 and 7 is: " + product);

        double quotient = myCalc.divide(20, 4);
        System.out.println("Quotient of 20 and 4 is: " + quotient);

    }
}