//package Oops;
//Abstract Method

//abstract class phone {
//    abstract void call();
//    abstract void text();
//}
//
//abstract class smartphone extends  phone{
//    abstract void browse ();
//    abstract void recording();
//}
//
//class samsung24 extends  smartphone{
//    public static void main(String[] args){
//        samsung24 s = new samsung24();
//        s.call();
//    }
//
//    @Override
//    void browse() {
//
//    }
//
//    @Override
//    void recording() {
//
//    }
//
//    @Override
//    void call() {
//
//    }
//
//    @Override
//    void text() {
//
//    }
//}
//
//abstract class Iphone extends smartphone{
//    abstract void Imeassage();
//}
//
//class Iphone15 extends Iphone{
//
//}






//Interface Method
//interface  phone {
//     void call();
//     void text();
//}
//
//interface smartphone extends  phone{
//    void browse ();
//    void recording();
//}
//
//interface  Iphone extends smartphone{
//    abstract void Imeassage();
//}
//
//class samsung24 implements   smartphone{
//    public static void main(String[] args){
//        samsung24 s = new samsung24();
//        s.call();
//    }
//
//
//    @Override
//    public void browse() {
//
//    }
//
//    @Override
//    public void recording() {
//
//    }
//
//    @Override
//    public void call() {
//
//    }
//
//    @Override
//    public void text() {
//
//    }
//}
//
//class Iphone15 implements Iphone{
//
//
//    @Override
//    public void Imeassage() {
//
//    }
//
//    @Override
//    public void browse() {
//
//    }
//
//    @Override
//    public void recording() {
//
//    }
//
//    @Override
//    public void call() {
//
//    }
//
//    @Override
//    public void text() {
//
//    }
//}
//
//









//Abstract
//abstract class Animal {
//    private String name;
//
//    public Animal(String name) {
//        this.name = name;
//        System.out.println("hello " + name);
//    }
//
//    abstract void move();
//
//    public void eat() {
//        System.out.println(name + " is eating");
//    }
//
//    public final void makeSound() {
//        System.out.println(name + " make a sound");
//    }
//}
//
//class Lion extends Animal {
//    public Lion(String name) {
//        super(name);
//    }
//
//    void move() {
//        System.out.println("the lion is moving");
//    }
//}
//
//public class Abstract {
//    public static void main(String[] args) {
//        Animal lion = new Lion("simba");
//        lion.eat();
//        lion.makeSound();
//        lion.move();
//    }
//}
