

public class JSample14_2 {

    public static void main(String[] args) {
        ControlBikeIf myBike = new BikeGo();
        myBike.start();
        myBike.speedup();
        myBike.stop();
        myBike.start();
    }
}    
    
    public class BikeGo implements ControlBikeIf {
        public void start() {
            System.out.println("自電車起動");
        }
        public void stop() {
            System.out.println("自電車停止");
        }
        public void speedup() {
            System.out.println("速度アップ");
        }
        public void speeddown() {
            System.out.println("速度ダウン");
        }
    }

    public class ControlBikeIf {
        void start();
        void stop();
        void speedup();
        void speeddown();
    }


