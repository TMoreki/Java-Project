Question 1


```java
public class PrintValues {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            System.out.print(i + " ");

        System.out.println();

        for (int i = 0; i <= 10; i++)
            if (i > 1)
                System.out.println("greater than 1");
            else if (i > 2)
                System.out.println("greater than 2");
            else if (i > 3)
                System.out.println("greater than 3");
            else if (i > 4)
                System.out.println("greater than 4");
            else if (i > 5)
                System.out.println("greater than 5");
            else if (i > 6)
                System.out.println("greater than 6");
            else if (i > 7)
                System.out.println("greater than 7");
            else if (i > 8)
                System.out.println("greater than 8");
            else if (i > 9)
                System.out.println("greater than 9");
            else
                System.out.println(i);
    }
}
```

This program will output:

```
0 1 2 3 4 5 6 7 8 9 10 
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
0
1
```


Question 2

```java
public class PrintValues {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        i = 0;
        while (i <= 10)
            if (i > 1)
                System.out.println("greater than 1");
            else if (i > 2)
                System.out.println("greater than 2");
            else if (i > 3)
                System.out.println("greater than 3");
            else if (i > 4)
                System.out.println("greater than 4");
            else if (i > 5)
                System.out.println("greater than 5");
            else if (i > 6)
                System.out.println("greater than 6");
            else if (i > 7)
                System.out.println("greater than 7");
            else if (i > 8)
                System.out.println("greater than 8");
            else if (i > 9)
                System.out.println("greater than 9");
            else
                System.out.println(i);
            i++;
    }
}
```

This program will output:

```
0 1 2 3 4 5 6 7 8 9 10 
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
greater than 1
0
1
```

The main changes are:

1. Initialization of the loop counter `i` before the loop.
2. Using the `while` loop instead of `for` loop.
3. Incrementing the loop counter `i` at the end of each iteration using `i++`.

Note that the logic remains the same, just the loop construct has been changed from `for` to `while`.


Question 3


```java
public class PrintValues {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        System.out.println();

        i = 0;
        do {
            switch (i) {
                case 0:
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println("greater than 1");
                    break;
                case 3:
                    System.out.println("greater than 2");
                    break;
                case 4:
                    System.out.println("greater than 3");
                    break;
                case 5:
                    System.out.println("greater than 4");
                    break;
                case 6:
                    System.out.println("greater than 5");
                    break;
                case 7:
                    System.out.println("greater than 6");
                    break;
                case 8:
                    System.out.println("greater than 7");
                    break;
                case 9:
                    System.out.println("greater than 8");
                    break;
                case 10:
                    System.out.println("greater than 9");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            i++;
        } while (i <= 10);
    }
}
```

This program will output:

```
0 1 2 3 4 5 6 7 8 9 10 
0
1
greater than 1
greater than 2
greater than 3
greater than 4
greater than 5
greater than 6
greater than 7
greater than 8
greater than 9
```

The main changes are:

1. Using the `do-while` loop instead of `while` loop.
2. Using a `switch` statement instead of `if-else` ladder.
3. Printing the value of `i` directly for cases 0 and 1 since there is no condition for them in the problem statement.
4. Adding a `default` case to handle any invalid values (although in this case, it will never be executed).

Note that the logic remains the same, just the loop construct has been changed from `while` to `do-while`, and the conditional statements have been replaced with a `switch` statement.





