public class Dog {
    private String name;
    private String toy;
    private int sleep;

    public Dog(String dogName, String dogToy, int dogSleep){
        name=dogName;
        toy=dogToy;
        sleep=dogSleep;

    }

    public void info(){
        System.out.println("Hello my name is "+name+" and my favorite toy is a "+toy+".  I also sleep "+sleep+" hours a day.");


    }

}
