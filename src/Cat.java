public class Cat extends Animals {


    public void jump(int i) {
        if (i <= 2){
            printInfo(true);
        }
        else {
            printInfo(false);}
    }

    public void run(int i) {
            if (i <= 150){
                printInfo(true);
            }
            else {
                printInfo(false);}
    }

    public void swim(int i) {
        System.out.println("Кот не умеет плавать");
    }

    public void printInfo(boolean b) {
        if(b == true){
            System.out.println(true);
        }
        else {System.out.println(false);}
    }
}