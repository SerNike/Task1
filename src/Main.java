public class Main {
    public static void main(String[] args) {
        task1();
        task4();
        task5();
        task6();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog =8D;
        var cat =3.6;
        var paper =763789;
        System.out.println(dog + " " + cat  + " " + paper);
        System.out.println("Задача 2");
        var dog1 = dog + 4;
        var cat1 =3.6 + 4;
        var paper1 =763789 + 4;
        System.out.println(dog1 + " " + cat1  + " " + paper1);
        System.out.println("Задача 3");
        var dog2 =8D - 3.5;
        var cat2 =3.6 - 1.6;
        var paper2 =763789 - 7639;
        System.out.println(dog2 + " " + cat2  + " " + paper2);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        var box = friend * 2;
        System.out.println(box);
        var box1 = box / 7;
        System.out.println(box1);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var flog = 3.5;
        System.out.println(flog);
        var flog1 = flog*10;
        System.out.println(flog1);
        var flog2 = flog1*3.5;
        System.out.println(flog2);
        var flog3 = flog2+4;
        System.out.println(flog3);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var sportOne = 78.2;
        var sportTwo = 82.7;
        System.out.println(sportTwo+sportOne);
        System.out.println(sportTwo-sportOne);
        System.out.println("Задача 7");
        var weightOne = 75;
        var weightTwo = 80;
        var a = weightTwo - weightOne;
        var b = weightTwo%weightOne;
        System.out.println(a + " " + b);
    }
    public static void task8() {
        System.out.println("Задача 8");
        var a = 640;
        var b = 8;
        var c = a/b;
        System.out.println("Всего работников в компании — " + c + " человек");
        var d = (c + 94)*8;
        System.out.println("Если в компании работает " + c + " человек, то всего " + d + " часов работы может быть поделено между сотрудниками");
    }
}
