public class Main {

   public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
      task5();
      task6();
      task7();
      task8();
   }
   public static void task1 () {
      System.out.println("Задача 1");
      var dog = 8.0;
      var cat = 3.6;
      var paper = 763789;
      System.out.println("dog = " + dog);
      System.out.println("cat = " + cat);
      System.out.println("paper = " + paper);
   }
   public static void task2 () {
      System.out.println("Задача 2");
      var dog = 8.0;
      var cat = 3.6;
      var paper = 763789;
      dog = dog + 4;
      cat = cat + 4;
      paper = paper + 4;
      System.out.println("dog = " + dog);
      System.out.println("cat = " + cat);
      System.out.println("paper = " + paper);
   }
   public static void task3 () {
      System.out.println("Задача 3");
      var dog = 8.0;
      var cat = 3.6;
      var paper = 763789;
      dog = dog - 3.5;
      cat = cat - 1.6;
      paper = paper - 7639;
      System.out.println("dog = " + dog);
      System.out.println("cat = " + cat);
      System.out.println("paper = " + paper);
   }
   public static void task4 () {
      System.out.println("Задача 4");
      var friend = 19;
      System.out.println("friend = " + friend);
      friend = friend + 2;
      System.out.println("friend = " + friend);
      friend = friend / 7;
      System.out.println("friend = " + friend);
   }
   public static void task5 () {
      System.out.println("Задача 5");
      var flog = 3.5;
      System.out.println("flog = " + flog);
      flog = flog * 10;
      System.out.println("flog = " + flog);
      flog = flog / 3.5;
      System.out.println("flog = " + flog);
      flog = flog + 4;
      System.out.println("flog = " + flog);
   }
   public static void task6 () {
      System.out.println("Задача 6");
      var weight1 = 78.2;
      System.out.println("weight1 = " + weight1);
      var weight2 = 82.7;
      System.out.println("weight2 = " + weight2);
      var weight3 = weight1 + weight2;
      System.out.println("weight3 = " + weight3);
   }
   public static void task7 () {
      System.out.println("Задача 7");
      var weight1 = 78.2;
      var weight2 = 82.7;
      var weight4 = weight2 % weight1;
      System.out.println("weight4-1 = " + weight4);
      weight4 = weight2 - weight1;
      System.out.println("weight4-2 = " + weight4);
   }
   public static void task8 () {
      System.out.println("Задача 8");
      var taimMax = 640;
      var taimCount = 8;
      var CountMax = taimMax / taimCount;
      System.out.println("Всего работников в компании работает " + CountMax + " человек");
      CountMax = CountMax + 94;
      taimCount = taimMax / CountMax;
      System.out.println("Если в компании работает " + CountMax + " человека, то всего " + taimCount + " часа работы может быть поделено между сотрудниками" );
   }
}