package lyabda;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Fartable fart = new Fartable() {
            @Override
            public void fart() {
                System.out.println("I perghu");
            }
        };

        fart.fart();

/*        Fly f = new Fly() {
            @Override
            public void fly() {
                System.out.println("lechu blyad");
            }
        };
        f.fly();

        Runable run = new Runable() {
            @Override
            public long run(double speed, double distance) {
                return (long)(distance/speed)*3600*1000;
            }
        };

        System.out.println(run.run(1,10));*/


        Fartable ff = () -> System.out.println("puk-puk");

        ff.fart();
        ff.fart();
        Fly f = () -> System.out.println("u-u");
        f.fly();
        Runable r = (a, b) -> (long) (a / b);
        System.out.println(r.run(34, 7));


        Thread t = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                System.out.println(new Date(System.currentTimeMillis() + i));

            }
        });
        t.start();
        Thread.sleep(60);
        System.out.println("main thread finished");


    }
}
