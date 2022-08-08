public class Main {
    public static void main(String[] args) {
      /*  Балык, Попугай, мышык жана ит деген класс тузунуз
        Алардын свойстваларын ойлоп табыныз
        Бир канча объектилерин тузуп жана аларга маанилерин бериниз
        Аларды консольго чыгарыныз
        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек*/

        Fish fish = new Fish();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();
        Dog dog = new Dog();


        fish.setDasda("sss");
        fish.setSdasd(3123);
        cat.setDsa(312312);
        cat.setSdsad("sadasdadwqe");
        parrot.setMmmmm("asdasd");
        parrot.setMommm(423423);
        dog.setEwqe(21312);
        dog.setMam("asdasd");

        System.out.println(fish.getDasda());
        System.out.println(fish.getSdasd());
        System.out.println(cat.getDsa());;
        System.out.println(cat.getSdsad());
        System.out.println(parrot.getMmmmm());
        System.out.println(parrot.getMommm());
        System.out.println(dog.getEwqe());
        System.out.println(dog.getMam());
    }
}