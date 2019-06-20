public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Today is July 19, 2019. I am alive!");
        int num;
        System.out.println("I can count to 100!");
        for (num = 1; num < 100; num++) {
            System.out.print(num + ", ");
        }
        System.out.println("100!");
        int test1 = 3, test2 = 3, test3 = 3;
        System.out.println(test1 + " " + test2 + " " + test3);
        System.out.println();
        int x, y, answer;
        double temperature;
        float Temperature;
        String firstName, lastName;
        String question = "unknown";
        x = 99;
        y = Integer.MAX_VALUE;
        answer = 42;
        firstName = "Joseph";
        lastName = "Homick";
        temperature = 86;
        Temperature = 32.0f;

        System.out.println("The variable x contains a value of " + x
            + ". The value of " + y + " is the largest value you can store in an integer.");
        System.out.println("The answer to the question is: " + answer);
        System.out.println("And the question has long been " + question);
        System.out.println("If you're not sick your temperature is " + temperature);
        System.out.println("If you're an ice cube your temperature is " + Temperature);
        System.out.println("The variable Temperature is not the same as  temperature");
        System.out.println("I am " + firstName + " " + lastName);
        System.out.println();

        int mynumber = 2;
        double myothernumber = 1.7938;
        System.out.println(mynumber);
        System.out.println(myothernumber);

    }
}
