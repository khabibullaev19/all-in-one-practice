package javapractice.threading.multithreading;

public class MultithreadingIntro {

    /*
        - Multithreading = enables a program to run multiple threads concurrently
                           (Thread = A set of instructions that run independently)
                           Useful for background tasks or time-consuming operations.
     */

    /*
        1 - use myRunnable
        2 - directly use inside the thread object
        3 - multiple threads
        4 - give a name
        5 - game start and over
        6 - join threads
     */

    public static void main(String[] args) {

        //MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        System.out.println("Game Start!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Game over!");

    }

}
