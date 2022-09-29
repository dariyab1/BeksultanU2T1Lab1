public class CatRunner {
    public static void main(String[] args){
        Cat cat1=new Cat("Bug",5, 10);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2=new Cat("Milly",2,8);
        cat2.introduce();
        cat1.printCatInfo();
    }
}
