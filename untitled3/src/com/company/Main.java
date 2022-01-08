package com.company;

import java.io.IOException;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;


public class  Main {
    public int temp = 0;
    public int health, damage, armor;
    public int choice, creepFight;
    public int MaxAnswers, boss;
    public String [] enemies = new String[] {"Чучело", "Бомж", "Лошадь", "Школьник", "Бисквит", "qweqweqwe", "Стиральный порошок", "Голубь", "Обои", "Пехотинец",
    "Сом", "Курсовая Работа", "Робот-малыш", "Жесткое Манго", "Антон", "Горилла", "Бразилец", "Засохшее Пятно", "Старый Ковёр", "Теория Вероятности", "Спрей от Жуков", "Гоблин",
    "Диван", "Крылатый Гвоздь", "Кокосовый Краб"};
    public int[] FirstTower, SecondTower, ThirdTower, FourthTower, FifthTower, SixthTower;
    public int enemyHealth, enemyDamage, enemyArmor;

    public String choiceMaker;

    public String[] inventory = new String[6];
    public String head, body, weapon, shoes, hands;
    public String EnemyName, Name;

    public boolean BossFight = false;
    public boolean InventoryCheck = false;
    public boolean Tower2 = false, Tower3 = false, Tower4 = false, Tower5 = false, Tower6 = false;

    public Scanner in = new Scanner(System.in);

    public static Main main;


    public Main() {
        FirstTower = new int[] {1,2,3,4,5,6,7,8,9,10};
        SecondTower = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("Плиз, назови своего перса");
        Name = in.nextLine();
        System.out.println("");
        System.out.println("Теперь тебя зовут " + Name);
        liner(1,0);
        System.out.println("Ну чтож, " + Name + ", теперь выбери свой класс");
        liner(2,3);
        System.out.print("//1. Волшебник ////2. Мастер рикошета ////3. Дивергент ////4. Мельник//");
        System.out.println();
        choice = in.nextInt();
        Maker(choice);
        liner(1,3);
        System.out.println("Поздравляю, теперь твой класс " + Maker(choice));
        System.out.println("Твои статы вот какие: ");
        System.out.println("Здоровье " + health);
        System.out.println("Защита " + armor);
        System.out.println("Дамаг " + damage);
        Name = Maker(choice) + " " + Name;
        System.out.println("Напиши 1 чтобы продолжить");
        choice = in.nextInt();
        if (choice == 1) {
            MenuOpen();
        }


    }

    public void MenuOpen() {
        System.out.println();
        System.out.println("Меню открыто. Выбери действие");
        System.out.println();
        System.out.println("1. Пойти сражаться с монстрами.");
        System.out.println("2. Позырить инвентарь.");
        System.out.println("3. Закончить игру и свалить напип.");
        System.out.println();
        MaxAnswers = 3;
        MyAnswerCheck();
        if (choice == 1) {
            TowerChoosing();
            String press = "Выбери башню, чтобы напасть на неё";
            System.out.println(press);
        }
        if (choice == 2) {
            InventoryCheck = false;
            InventoryOpen();
            String press = "Твой инвентарь перед тобой";
            System.out.println(press);
        }
        if (choice == 3) {

            String press = "Так тому и быть";
            System.out.println(press);
        }


    }



    public void TowerChoosing() {
        liner(2,1);
        System.out.println("1. Сторожевая башня");
        System.out.println("2. Пизанская башня");
        System.out.println("3. Гейм Спай");
        System.out.println("4. Дворец Путина");
        System.out.println("5. Аксиома");
        System.out.println("6. Зал Тяжелой Атлетики");
        System.out.println("7. Обратно");
        MaxAnswers=7;
        MyAnswerCheck();
        if (choice == 1) {
            FirstTowerChosen();
        }
        if (choice == 2 && Tower2 == true) {
            SecondTowerChosen();
        } else {
            TowerChoosing();
        }
        if (choice == 7) {
            MenuOpen();
        } else {
            System.out.println("Чё за пип ты пишешь? Напиши цифру от 1 до 7.");
        }

    }
    public void InventoryOpen() {
        liner(2,1);
        for (int i = 0; i<=inventory.length-1; i++) {
            System.out.println(inventory[i]);
        }
        liner(0,1);
        System.out.println("Твой шлем - " + head);
        System.out.println("Твоя броня - " + body);
        System.out.println("Твое оружие - " + weapon);
        System.out.println("Твои перчатки - " + hands);
        System.out.println("Твои ботинки - " +shoes);
        liner(0,1);
        System.out.println("1.Обратно");
        MaxAnswers=1;
        MyAnswerCheck();
        if (choice==1 && InventoryCheck == false) {
            MenuOpen();
        } else {
            Fight();
        }

    }

    public void MyAnswerCheck() {
        choice = in.nextInt();
        if (choice > MaxAnswers) {
            System.out.println("Чё за пип ты пишешь?");
            MyAnswerCheck();
        } else {
            return;
        }
    }

    public void InTowerAnswerCheck() {
        creepFight = in.nextInt();
        if (creepFight == boss && BossFight == false) {
            System.out.println("Ты не можешь сражаться с боссом, пока не убил всех монстров.");
            InTowerAnswerCheck();
        } else if (creepFight > MaxAnswers) {
            System.out.println("Чё за пип ты пишешь?");
            InTowerAnswerCheck();
        } else {
            return;
        }
    }

    public void FirstTowerChosen() {
        for ( int g = 0; g<=1; g++) {
            if (FirstTower[9] == 0) {
                liner(1, 1);
                System.out.println("Поздравляю, Сторожвеая башня пройдена. Можешь идти в следующую башню!");
                Tower2 = true;
                TowerChoosing();
            } break;
        }
        MaxAnswers=10;
        boss = 10;
        BossFight = true;
        for (int i = 0; i <= boss-1; i ++) {
            temp += FirstTower[i];
            if (temp ==10) {
                BossFight = false;
            }
        }
        liner(2,1);
        System.out.println("Добро пожаловать в Сторожевую башню. Выбери комнату, в которую ты хочешь войти.");
        liner(0,1);
        System.out.println(Arrays.toString(FirstTower));
        InTowerAnswerCheck();
        if (creepFight==1) {
                EnemyName = enemies [0];
                enemyHealth = 10;
                enemyArmor = 0;
                enemyDamage = 1;
                Greetings();
            }
        if (creepFight==2) {
            EnemyName = enemies [1];
            enemyHealth = 5;
            enemyArmor = 1;
            enemyDamage = 3;
            Greetings();
        }
        if (creepFight==3) {
            EnemyName = enemies [2];
            enemyHealth = 10;
            enemyArmor = 2;
            enemyDamage = 2;
            Greetings();
        }
        if (creepFight==4) {
            EnemyName = enemies [3];
            enemyHealth = 15;
            enemyArmor = 0;
            enemyDamage = 5;
            Greetings();
        }
        if (creepFight==5) {
            EnemyName = enemies [4];
            enemyHealth = 1;
            enemyArmor = 0;
            enemyDamage = 0;
            Greetings();
        }
        if (creepFight==6) {
            EnemyName = enemies [5];
            enemyHealth = 8;
            enemyArmor = 3;
            enemyDamage = 5;
            Greetings();
        }
        if (creepFight==7) {
            EnemyName = enemies [6];
            enemyHealth = 15;
            enemyArmor = 2;
            enemyDamage = 5;
            Greetings();
        }
        if (creepFight==8) {
            EnemyName = enemies [7];
            enemyHealth = 5;
            enemyArmor = 5;
            enemyDamage = 5;
            Greetings();
        }
        if (creepFight==9) {
            EnemyName = enemies [8];
            enemyHealth = 11;
            enemyArmor = 0;
            enemyDamage = 10;
            Greetings();
        }
        if (creepFight==10) {
            EnemyName = enemies [9];
            enemyHealth = 100;
            enemyArmor = 4;
            enemyDamage = 8;
            Greetings();
        }
        if (FirstTower[9] == 0) {
            liner(1,1);
            System.out.println("Поздравляю, Сторожвеая башня пройдена. Можешь идти в следующую башню!");
            Tower2 = true;
            TowerChoosing();
        }

    }
    public void SecondTowerChosen() {
        boss = 15;
        BossFight = true;
        for (int i = 0; i <= boss-2; i ++) {
            temp = SecondTower[i];
            if (temp > 0) {
                BossFight = false;
            }
        }
        liner(2,1);
        System.out.println("Добро пожаловать в Пизанскую башню. Выбери комнату, в которую ты хочешь войти.");
        liner(0,1);
        System.out.println(Arrays.toString(SecondTower));
        MaxAnswers=15;
        InTowerAnswerCheck();
        if (creepFight==1) {
            EnemyName = enemies [10];
            enemyHealth = 40;
            enemyArmor = 3;
            enemyDamage = 13;
            Greetings();
        }
        if (creepFight==2) {
            EnemyName = enemies [11];
            enemyHealth = 400;
            enemyArmor = 0;
            enemyDamage = 3;
            Greetings();
        }
        if (creepFight==3) {
            EnemyName = enemies [12];
            enemyHealth = 60;
            enemyArmor = 3;
            enemyDamage = 13;
            Greetings();
        }
        if (creepFight==4) {
            EnemyName = enemies [13];
            enemyHealth = 70;
            enemyArmor = 8;
            enemyDamage = 7;
            Greetings();
        }
        if (creepFight==5) {
            EnemyName = enemies [14];
            enemyHealth = 120;
            enemyArmor = 3;
            enemyDamage = 17;
            Greetings();
        }
        if (creepFight==6) {
            EnemyName = enemies [15];
            enemyHealth = 60;
            enemyArmor = 10;
            enemyDamage = 20;
            Greetings();
        }
        if (creepFight==7) {
            EnemyName = enemies [16];
            enemyHealth = 99;
            enemyArmor = 0;
            enemyDamage = 60;
            Greetings();
        }
        if (creepFight==8) {
            EnemyName = enemies [17];
            enemyHealth = 220;
            enemyArmor = 7;
            enemyDamage = 18;
            Greetings();
        }
        if (creepFight==9) {
            EnemyName = enemies [18];
            enemyHealth = 90;
            enemyArmor = 15;
            enemyDamage = 15;
            Greetings();
        }
        if (creepFight==10) {
            EnemyName = enemies [19];
            enemyHealth = 20;
            enemyArmor = 50;
            enemyDamage = 15;
            Greetings();
        }
        if (creepFight==11) {
            EnemyName = enemies [20];
            enemyHealth = 155;
            enemyArmor = 13;
            enemyDamage = 28;
            Greetings();
        }
        if (creepFight==12) {
            EnemyName = enemies [21];
            enemyHealth = 270;
            enemyArmor = 8;
            enemyDamage = 31;
            Greetings();
        }
        if (creepFight==13) {
            EnemyName = enemies [22];
            enemyHealth = 90;
            enemyArmor = 31;
            enemyDamage = 21;
            Greetings();
        }
        if (creepFight==14) {
            EnemyName = enemies [23];
            enemyHealth = 340;
            enemyArmor = 9;
            enemyDamage = 24;
            Greetings();
        }
        if (creepFight==15) {
            EnemyName = enemies [24];
            enemyHealth = 600;
            enemyArmor = 20;
            enemyDamage = 55;
            Greetings();
        }
    }
    public void Greetings() {
        liner(2,1);
        System.out.println("Встречай своего соперника - " + EnemyName);
        liner(0,2);
        Fight();
    }

    public void Fight () {
        System.out.println(Name + "                   " + EnemyName);
        System.out.println("Здоровье " + health + "                " + enemyHealth + " Здоровье");
        System.out.println("Урон " + damage + "          VS          " + enemyDamage + " Урон");
        System.out.println("Броня " + armor + "                      " + enemyArmor + " Броня");
        System.out.println();
        System.out.println("Твои действия");
        liner(0,1);
        System.out.println("1. Ударить");
        System.out.println("2. Позырить инвентарь");
        System.out.println("3. Бежать с криком");
        MaxAnswers = 3;
        MyAnswerCheck();
            if (choice==1) {
                enemyHealth = enemyHealth + enemyArmor - damage;
                System.out.println("Ты внёс " + damage + " урона, и у врага осталось " + enemyHealth + " жизни с учетом его брони");
                if (enemyHealth>0) {
                    health = health + armor - enemyDamage;
                    System.out.println(EnemyName + " внёс " + enemyDamage + " по тебе, и у тебя осталось " + health + " жизни с учётом брони");
                    Fight();
                }
                else    {
                    System.out.println(EnemyName + " уничтожен! Ты очень крут!");
                    FirstTower[creepFight-1] = 0;
                    FirstTowerChosen();

                }
            }
            if (choice == 2) {
                InventoryCheck = true;
                InventoryOpen();
            }
            if (choice == 3) {
                FirstTowerChosen();
            }
    }

        public int liner ( int x, int y){
            for (int i = 0; i<=x; i++) {
                System.out.println("------------------------------");
            }
            for (int d = 0; d<=y; d++) {
                System.out.println();
            }
            return x;
        }
        public String Maker ( int choice){
            String our = " ";
            if (choice == 1) {
                our = "Волшебник";
                health = 20;
                armor = 0;
                damage = 10;
            }
            if (choice == 2) {
                our = "Мастер рикошета";
                health = 55;
                armor = 2;
                damage = 15;
            }
            if (choice == 3) {
                our = "Дивергент";
                health = 3000;
                armor = 55;
                damage = 100;
            }
            if (choice == 4) {
                our = "Мельник";
                health = 100;
                armor = 2;
                damage = 20;
            }
            return (our);
        }


    public static void main(String[] args) {

        main = new Main();
        }
}
