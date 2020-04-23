public class Main {

    public static void main(String[] args) {
        KronometreThreading thread1 = new KronometreThreading("1");
        KronometreThreading thread2 = new KronometreThreading("2");
        KronometreThreading thread3 = new KronometreThreading("3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
