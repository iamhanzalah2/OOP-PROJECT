import java.util.Random;
import java.util.Scanner;

abstract class Skull {
    abstract void skull1();
}

class Skshot extends Skull {
    Skilltr skl = new Skilltr();
    Scanner cin = new Scanner(System.in);
    int skid1;
    int skid2;
    int skid3;
    int skid4;
    String s1, s2, s3, s4;

    @Override
    public void skull1() {
        int a, b;
        do {
            System.out.println(
                    "Select your skill\n\n 1.Shield bash\t\t2.Poison throw\n3.Double slash\t\t4.Burst strike\n5.Head strike\t\t6.Spirit gun\n7.Laser burst\t\t8.Death stare\n9.Endeavour\t\t10.End game");
            a = cin.nextInt();
            if (a < 1 || a > 10) {
                System.out.println("Invalid Input");
            }
        } while (a < 1 || a > 10);
        do {
            System.out.println("Choose Slot\n1\n2\n3\n4");
            b = cin.nextInt();
            if (b < 1 || b > 4) {
                System.out.println("Invalid Input");
            }
        } while (b < 1 || b > 4);
        switch (b) {
            case 1:
                switch (a) {
                    case 1:
                        this.s1 = "Shield bash";
                        this.skid1 = skl.skill1();
                        break;
                    case 2:
                        this.s1 = "Poison throw";
                        this.skid1 = skl.skill2();
                        break;
                    case 3:
                        this.s1 = "Double slash";
                        this.skid1 = skl.skill3();
                        break;
                    case 4:
                        this.s1 = "Burst strike";
                        this.skid1 = skl.skill4();
                        break;
                    case 5:
                        this.s1 = "Spirit gun";
                        this.skid1 = skl.skill5();
                        break;
                    case 6:
                        this.s1 = "Laser burst";
                        this.skid1 = skl.skill6();
                        break;
                    case 7:
                        this.s1 = "Death stare";
                        this.skid1 = skl.skill7();
                        break;
                    case 8:
                        this.s1 = "Endevour";
                        this.skid1 = skl.skill8();
                        break;
                    case 9:
                        this.s1 = "End game";
                        this.skid1 = skl.skill9();
                        break;
                    case 10:
                        this.s1 = "Head strike";
                        this.skid1 = skl.skill10();
                        break;
                    default:
                        System.out.println("Incorrect input. Try again");
                }
                break;
            case 2:
                switch (a) {
                    case 1:
                        this.s2 = "Shield bash";
                        this.skid2 = skl.skill1();
                        break;
                    case 2:
                        this.s2 = "Poison throw";
                        this.skid2 = skl.skill2();
                        break;
                    case 3:
                        this.s2 = "Double slash";
                        this.skid2 = skl.skill3();
                        break;
                    case 4:
                        this.s2 = "Burst strike";
                        this.skid2 = skl.skill4();
                        break;
                    case 5:
                        this.s2 = "Spirit gun";
                        this.skid2 = skl.skill5();
                        break;
                    case 6:
                        this.s2 = "Laser burst";
                        this.skid2 = skl.skill6();
                        break;
                    case 7:
                        this.s2 = "Death stare";
                        this.skid2 = skl.skill7();
                        break;
                    case 8:
                        this.s2 = "Endevour";
                        this.skid2 = skl.skill8();
                        break;
                    case 9:
                        this.s2 = "End game";
                        this.skid2 = skl.skill9();
                        break;
                    case 10:
                        this.s2 = "Head strike";
                        this.skid2 = skl.skill10();
                        break;
                    default:
                        System.out.println("Incorrect input. Try again");
                }
                break;
            case 3:
                switch (a) {
                    case 1:
                        this.s3 = "Shield bash";
                        this.skid3 = skl.skill1();
                        break;
                    case 2:
                        this.s3 = "Poison throw";
                        this.skid3 = skl.skill2();
                        break;
                    case 3:
                        this.s3 = "Double slash";
                        this.skid3 = skl.skill3();
                        break;
                    case 4:
                        this.s3 = "Burst strike";
                        this.skid3 = skl.skill4();
                        break;
                    case 5:
                        this.s3 = "Spirit gun";
                        this.skid3 = skl.skill5();
                        break;
                    case 6:
                        this.s3 = "Laser burst";
                        this.skid3 = skl.skill6();
                        break;
                    case 7:
                        this.s3 = "Death stare";
                        this.skid3 = skl.skill7();
                        break;
                    case 8:
                        this.s3 = "Endevour";
                        this.skid3 = skl.skill8();
                        break;
                    case 9:
                        this.s3 = "End game";
                        this.skid3 = skl.skill9();
                        break;
                    case 10:
                        this.s3 = "Head strike";
                        this.skid3 = skl.skill10();
                        break;
                    default:
                        System.out.println("Incorrect input. Try again");

                }
                break;
            case 4:
                switch (a) {
                    case 1:
                        this.s4 = "Shield bash";
                        this.skid4 = skl.skill1();
                        break;
                    case 2:
                        this.s4 = "Poison throw";
                        this.skid4 = skl.skill2();
                        break;
                    case 3:
                        this.s4 = "Double slash";
                        this.skid4 = skl.skill3();
                        break;
                    case 4:
                        this.s4 = "Burst strike";
                        this.skid4 = skl.skill4();
                        break;
                    case 5:
                        this.s4 = "Spirit gun";
                        this.skid4 = skl.skill5();
                        break;
                    case 6:
                        this.s4 = "Laser burst";
                        this.skid4 = skl.skill6();
                        break;
                    case 7:
                        this.s4 = "Death stare";
                        this.skid4 = skl.skill7();
                        break;
                    case 8:
                        this.s4 = "Endevour";
                        this.skid4 = skl.skill8();
                        break;
                    case 9:
                        this.s4 = "End game";
                        this.skid4 = skl.skill9();
                        break;
                    case 10:
                        this.s4 = "Head strike";
                        this.skid4 = skl.skill10();
                        break;
                    default:
                        System.out.println("Incorrect input. Try again");
                }
                break;
            default:
                break;
        }
    }
}

class Skcall {
    Skilltr skl = new Skilltr();

    void skill1(int s) {
        switch (s) {
            case 1001:

                skl.skill1();
                break;
            case 1002:

                skl.skill2();
                break;
            case 1003:

                skl.skill3();
                break;
            case 1004:
                skl.skill4();
                break;
            case 1006:
                skl.skill6();
                break;
            case 1007:

                skl.skill7();
                break;
            case 1008:

                skl.skill8();
                break;
            case 1009:

                skl.skill9();
                break;
            case 1010:

                skl.skill10();
                break;
            case 1005:

                skl.skill5();
                break;
        }

    }
}

class Skilltr extends Gam {
    String s;
    int skid;

    Skilltr() {
        this.s = " ";

    }

    int skill1() {
        skid = 1001;
        s = "Poison throw";
        att = plstr * 2 - (opend / 2);
        stun = 0;
        oppo = 4;
        System.out.println("You used POISON ATTACK!");
        return skid;
    }

    int skill2() {
        skid = 1002;
        att = plstr * 3 - (opend / 2);
        stun = 1;
        System.out.println("You used SHIELD BASH!");
        s = "Shield bash";
        return skid;
    }

    int skill3() {
        skid = 1003;
        att = plstr * 4 - (opend / 2);
        stun = 0;
        System.out.println("You used DOUBLE SLASH!");
        s = "Double Slash";
        return skid;
    }

    int skill4() {
        skid = 1004;
        att = plstr * 5 - (opend / 2);
        stun = 0;
        System.out.println("You used BURST STRIKE!");
        s = "Burst strike";
        return skid;
    }

    int skill5() {
        skid = 1005;
        att = plstr * 6 - (opend / 2);
        stun = 50;
        System.out.println("You used HEAD BASH!");
        s = "Head strike";
        return skid;
    }

    int skill6() {
        skid = 1006;
        att = 20;
        stun = 77;
        System.out.println("You used SPIRIT GUN!");
        s = "Spirit gun";
        return skid;
    }

    int skill7() {
        skid = 1007;
        att = 20;
        stun = 7;
        System.out.println("You used LASER BURST!");
        s = "Laser burst";
        return skid;
    }

    int skill8() {
        skid = 1008;
        att = 1;
        stun = 2;
        System.out.println("You used DEATH STARE!");
        s = "Death stare";
        return skid;
    }

    int skill9() {
        skid = 1009;
        att = 100;
        stun = 0;
        System.out.println("You used ENDEVOUR!");
        s = "Endevour";
        return skid;
    }

    int skill10() {
        skid = 1010;
        att = 40;
        stun = 6;
        System.out.println("You used END GAME!");
        s = "End game";
        return skid;
    }
}

class Gam {

    Scanner cin = new Scanner(System.in);
    // Global variables
    static int skip = 0, ret, exp, no, quest, ex, hp, mon, att = 1, plstr = 8, ophp, opend, opstr, opatt, sinp,
            oppo = 0,
            plend = 8, opstun = 0, stun, unspentskp = 8;
    String op;

    String swordd = "|\\ \n| \\ \n|  \\ \n \\  \\ \n  \\  \\ \n   \\  \\ \n    \\  \\ \n     \\  \\ \n      \\  \\ \n       \\  \\ \n        \\  \\ \n         \\  \\ \n          \\__\\ \n            \\\\ \n             \\\\ \n              \\\\ \n               \\\\ \n                \\\\ \n                 \\\\ \n";
    String sword = "   /|   \n  / |   \n /  |  \n |  |  \n |  |  \n |  |  \n |  |  \n |  |  \n |  |  \n |  |  \n |  |  \n |_|   \n   ||  \n   ||  \n   ||  \n   ||   \n   ||  \n   ||  \n  (_) ";
    String swordl = "  _________\n /                           |______|\n/__________|------------------|\n";

    void ma(Skshot sks, Skcall SKK) {

        mainscreen();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("WELCOME TO THE CITY OF AAGON.");
        System.out.println(
                "YOU ARE AN ASPIRING ADVENTURER HOPING TO GET THE MEDALATION OF LEO THE BRAVEST OF ALL HEROES.");
        System.out.println("Now DEFEAT THE BEASTS OF DARKNESS FOR YOUR OWN GREED.");
        cin.nextLine(); // wait for user input
        clearScreen();
        stun = 0;

        do {
            do {
                System.out.println("WHAT WOULD YOU LIKE TO DO?");
                System.out.println("1. GO TO THE HEALER");
                System.out.println("2. TAKE A QUEST");
                if (unspentskp >= 1) {
                    System.out.println("3. CHECK CHARACTER SHEET");
                }

                System.out.println("4. EQUIP SKILLS");
                if (quest > 0) {
                    System.out.println("5. GO FOR QUEST");
                }
                ex = cin.nextInt();

                if (ex == 3 && unspentskp >= 1) {
                    chrscr();
                } else if (ex == 3 && unspentskp <= 0) {
                    System.out.println("STRENGTH = " + plstr + "\nENDURANCE = " + plend);
                } else if (ex == 2) {
                    while (no < 1 || no > 2) {
                        System.out.println("CHOOSE YOUR QUEST\n 1. PATROL THE FOREST\n 2. CLEAR THE RUINS");
                        no = cin.nextInt();
                        switch (no) {
                            case 1: {
                                Random rand = new Random();
                                mon = 1 + rand.nextInt(5);
                                if (mon >= 1 && mon <= 3) {
                                    gob();
                                } else {
                                    dire();
                                }
                                break;
                            }
                            case 2: {
                                Random rand = new Random();
                                ret = 1 + rand.nextInt(10);
                                if (ret >= 1 && ret <= 5) {
                                    skl();
                                } else if (ret >= 6 && ret <= 8) {
                                    spider();
                                } else if (ret == 9 || ret == 10) {
                                    sklngt();
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid\n");
                                break;
                        }
                        quest++;
                        break;
                    }
                } else if (ex == 1) {
                    hp = 1 + (plstr * 2) + (plend * 4);
                    System.out.println("YOU HAVE BEEN HEALED AND CURED\nYOUR HEALTH IS NOW: " + hp);
                } else if (ex == 4) {
                    sks.skull1();

                }
            } while (ex == 1 || ex == 2 || ex == 3 || ex == 4);

            clearScreen();

            // Main game loop
            while (quest > 0 && ophp > 0 && hp > 0) {
                Random rand = new Random();
                int random = 1 + rand.nextInt(2);
                System.out.println(op);
                System.out.println("HEALTH = " + ophp + "\t\t\t\t PLAYER HEALTH = " + hp);
                System.out.println("\nWHAT WOULD YOU LIKE TO DO?\n\nA FOR ATTACK S FOR SKILL");
                char ch = cin.next().charAt(0);

                // Determine opponent's attack based on random number
                if (random == 1) {
                    opatt = (int) (1 + (opstr * (1.15)) - (plend * (0.1)));
                }

                // Player's turn
                if (ch == 'a' || ch == 'A') {
                    att = (int) (plstr * (1.15) - (opend * (0.1)));
                    cin.nextLine(); // wait for user input
                    if (skip != 1) {
                        anim();
                    }
                } else if (ch == 's' || ch == 'S') {
                    // Player chooses a skill
                    do {
                        System.out.println("CHOOSE THE SKILL\n1. " + sks.s1 + "\n2. " + sks.s2 + "\n3. " + sks.s3
                                + "\n4. " + sks.s4);
                        sinp = cin.nextInt();
                        clearScreen();
                        switch (sinp) {
                            case 1:
                                SKK.skill1(sks.skid1);
                                break;
                            case 2:
                                // Call skill2 function
                                SKK.skill1(sks.skid2);
                                break;
                            case 3:
                                // Call skill3 function
                                SKK.skill1(sks.skid3);
                                break;
                            case 4:
                                // Call skill4 function
                                SKK.skill1(sks.skid4);
                                break;
                            default:
                                System.out.println("TRY AGAIN");
                        }

                    } while (sinp > 4 || sinp < 0);
                }
                clearScreen();

                // Handle stun effect on player
                if (stun > 0) {
                    opatt = 0;
                    stun--;
                }

                // Handle opponent's debuff effect on player
                if (oppo > 0) {
                    att = att + 5;
                    oppo--;
                }

                // Handle stun effect on opponent
                if (opstun > 0) {
                    ;
                    opstun--;
                }

                // Update opponent's health based on player's attack
                ophp = ophp - att;
                System.out.println("You HIT THE ENEMY FOR " + att + " DAMAGE\n\n");

                // Update player's health based on opponent's attack
                hp = hp - opatt;
                System.out.println("THE OPPONENT HIT YOU FOR " + opatt + " DAMAGE\n\n");
            }
            skip--;
            quest--;
            unspentskp += exp;
        } while (ex != 6);

        System.out.println("CONGRATULATIONS NOW YOU HAVE BECOME A BEAST");
        cin.close();
    }

    void anim() {
        clearScreen();
        System.out.println(sword);
        cin.nextLine(); // wait for user input
        clearScreen();
        System.out.println(swordd);
        cin.nextLine(); // wait for user input
        clearScreen();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(swordl);
        cin.nextLine(); // wait for user input
        clearScreen();
        skip++;
    }

    void mainscreen() {
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("************************************");
        System.out.println("*                                  *");
        System.out.println("*          WELCOME TO THE          *");
        System.out.println("*               GAME!              *");
        System.out.println("*                                  *");
        System.out.println("************************************");
        System.out.println("PRESS ENTER TO CONTINUE.... ");
        cin.nextLine(); // wait for user input
    }

    void chrscr() {
        try (Scanner cin = new Scanner(System.in)) {
            while (unspentskp >= 1) {
                System.out.println("1. ENDURANCE = " + plend + "\t\t\t2. STRENGTH = " + plstr
                        + "\t\t\tUNSPENT SKILL POINTS = " + unspentskp);
                System.out.println("WOULD YOU LIKE TO SPEND ANY?\n1. ENDURANCE\n2. STRENGTH");
                sinp = cin.nextInt();
                switch (sinp) {
                    case 1:
                        unspentskp--;
                        plend++;
                        break;
                    case 2:
                        unspentskp--;
                        plstr++;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            }
        }
        System.out.println("STRENGTH = " + plstr + "\nENDURANCE = " + plend);
    }

    void clearScreen() {
        // Clearing the screen can be done in different ways in Java. One approach is to
        // print new lines.
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    void gob() {
        opstr = 8;
        opend = 9;
        ophp = 1 + (opstr * 2) + (opend * 4);
        op = "GOBLIN";
        exp = 1;
    }

    void dire() {
        opstr = 17;
        opend = 14;
        ophp = 1 + (opstr * 2) + (opend * 4);
        op = "DIRE WOLF";
        exp = 2;
    }

    void sklngt() {
        opstr = 15;
        opend = 20;
        ophp = 1 + (opstr * 2) + (opend * 4);
        op = "SKELETON KNIGHT";
        exp = 3;
    }

    void skl() {
        opstr = 12;
        opend = 9;
        ophp = 1 + (opstr * 2) + (opend * 4);
        op = "SKELETON";
        exp = 1;
    }

    void spider() {
        opstr = 25;
        opend = 4;
        ophp = 1 + (opstr * 2) + (opend * 4);
        op = "SPIDER";
        exp = 2;
    }

}

public class Game {
    public static void main(String[] args) {
        Skshot sks = new Skshot();
        Skcall SKK = new Skcall();
        Gam r = new Gam();
        r.ma(sks, SKK);
    }
}