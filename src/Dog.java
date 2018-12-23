

public class Dog extends Animals {


    public void jump(int i) {
        if (i <= 0.5){
            printInfo(true);
        }
        else {
            printInfo(false);}
    }



    public void run(int i, int j) {
        if(j == 1){
        if (i <= 400){
            printInfo(true);
        }
        else {
            printInfo(false);}}

            else {if (i <= 600){
            printInfo(true);
        }
        else {
            printInfo(false);}}}




    public void swim(float i) {
        if (i <= 10){
            printInfo(true);
        }
        else {
            printInfo(false);}
}
    public void printInfo(boolean b) {
        if(b == true){
            System.out.println(true);
        }
        else {System.out.println(false);}
    }


}