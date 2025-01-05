import java.util.Random;

class NumberGenerator extends Thread {
    public static int number;

    // Method to generate a random number every second
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                number = random.nextInt(100);  // Generate random number between 0 and 99
                System.out.println("Generated number: " + number);
                Thread.sleep(1000);  // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Number generation interrupted.");
        }
    }
}

class SquareThread extends Thread {
    public void run() {
        try {
            while (true) {
                // If the generated number is even, compute its square
                if (NumberGenerator.number % 2 == 0) {
                    System.out.println("Square of " + NumberGenerator.number + " is: " + (NumberGenerator.number * NumberGenerator.number));
                }
                Thread.sleep(1000);  // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Square thread interrupted.");
        }
    }
}

class CubeThread extends Thread {
    public void run() {
        try {
            while (true) {
                // If the generated number is odd, compute its cube
                if (NumberGenerator.number % 2 != 0) {
                    System.out.println("Cube of " + NumberGenerator.number + " is: " + (NumberGenerator.number * NumberGenerator.number * NumberGenerator.number));
                }
                Thread.sleep(1000);  // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Cube thread interrupted.");
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        // Create and start the three threads
        NumberGenerator numberGenerator = new NumberGenerator();
        SquareThread squareThread = new SquareThread();
        CubeThread cubeThread = new CubeThread();

        numberGenerator.start();
        squareThread.start();
        cubeThread.start();
    }
}
