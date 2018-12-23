public class Animals {

    public static  void main(String args[]) {
        Cat Cat1 = new Cat();
        Cat1.jump(1);
        Cat1.run(300);
        Cat1.swim(100);

        Dog Dog1 = new Dog();
        Dog1.jump(1);
        Dog1.run(500, 2);
        Dog1.swim((float) 0.4);
    }
}
