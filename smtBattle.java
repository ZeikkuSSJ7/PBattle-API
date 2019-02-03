import java.util.*;

/**
 * smtBattle
 */
public class smtBattle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce a name to be used in battle: ");
        final String pl_name = in.nextLine();
        System.out.println(
                "Welcome to a smt java battle! It may not be a great port but its all i can do at the moment.");
        Random ran = new Random();
        String[] obj_name = new String[10];
        for (int i = 0; i < obj_name.length; i++) {
            obj_name[i] = "";
        }
        int[] obj = new int[10];
        int en_life;
        int en_mp;
        int[] en_magic = new int[2];
        int pl_life_max = 20;
        int pl_life = 20;
        int pl_mp = 20;
        int pl_attack = 4;
        int pl_defense = 2;
        int select;
        int accuracy;
        int life_lost;
        boolean end_turn = false;
        int[] pl_magic = new int[10];
        String[] pl_magic_name = new String[10];
        int exp = 0;
        int exp_needed = 100;
        int level = 1;
        for (int i = 0; i < pl_magic_name.length; i++) {
            pl_magic_name[i] = "";
        }

        while (pl_life > 0 && pl_attack < 15) {
            System.out.println("You encountered a Zombie!");
            en_life = 10;
            en_mp = 5;
            pl_magic[0] = 5;
            pl_magic_name[0] = "Fire";
            pl_magic[1] = 10;
            pl_magic_name[1] = "Thunder";
            obj[0] = 10;
            obj_name[0] = "Potion";
            obj[1] = 20;
            obj_name[1] = "Great Potion";
            en_magic[0] = 4;
            while (en_life > 0 && pl_life > 0) {
                System.out.println("HP: " + pl_life + " MP: " + pl_mp);
                System.out.println("Enemy HP: " + en_life + " Enemy MP: " + en_mp);
                System.out.println("What will " + pl_name + " do?");
                System.out.println("1) Fight 2) Item 3) Magic 4) Defend 5) Talk");
                end_turn = false;
                do {
                    select = in.nextInt();
                } while (select < 1 || select > 5);
                if (select == 1) {
                    System.out.println(pl_name + " attacks!");
                    accuracy = ran.nextInt(100) + 1;
                    if (accuracy > 5) {
                        life_lost = ran.nextInt(pl_attack) + 1;
                        en_life -= life_lost;
                        System.out.println("The enemy lost " + life_lost + " HP!");
                    } else {
                        System.out.println(pl_name + " missed the attack!");
                    }
                } else if (select == 2) {
                    boolean are = false;
                    boolean using_object = true;
                    while (!end_turn && !are && using_object) {
                        are = true;
                        boolean none = false;
                        int voidd = 0;
                        int recovered;
                        for (int i = 0; i < obj.length && !none; i++) {
                            if (obj[i] != 0) {
                                System.out.println(i + ". " + obj_name[i]);
                                are = false;
                            } else {
                                none = true;
                                System.out.println(i + ". Exit");
                                voidd = i;
                            }
                        }
                        if (!are) {
                            System.out.print("Which item do you want to use? ");
                            select = in.nextInt();
                            if (select == voidd) {
                                end_turn = true;
                            } else {
                                System.out.println(pl_name + " used " + obj_name[select] + "!");
                                recovered = obj[select];
                                System.out.println(pl_name + " recovered " + recovered + " HP!");
                                pl_life += obj[select];
                                obj[select] = 0;
                                using_object = false;
                            }
                        }
                    }
                } else if (select == 3 && pl_mp > 0) {
                    boolean are = false;
                    boolean using_magic = true;
                    while (!end_turn && !are && using_magic) {
                        are = true;
                        boolean none = false;
                        int voidd = 0;
                        int damage;
                        for (int i = 0; i < pl_magic.length && !none; i++) {
                            if (pl_magic[i] != 0) {
                                System.out.println(i + ". " + pl_magic_name[i]);
                                are = false;
                            } else {
                                voidd = i;
                                System.out.println(i + ". Exit");
                                none = true;
                            }
                        }
                        if (!are) {
                            System.out.print("Which magic will you use? ");
                            select = in.nextInt();
                            if (pl_mp < pl_magic[select]) {
                                System.out.println("You don't have enough MP!");
                                select = voidd;
                            }
                            if (select == voidd) {
                                end_turn = true;
                            } else {
                                System.out.println(pl_name + " used " + pl_magic_name[select] + "!");
                                damage = pl_magic[select];
                                System.out.println("Zombie recieved " + damage + " HP of damage!");
                                en_life -= pl_magic[select];
                                pl_mp -= pl_magic[select];
                                using_magic = false;
                            }
                        }
                    }
                } else if (select == 4) {
                    System.out.println(pl_name + " is defending.");
                    System.out.println("Zombie attacks!");
                    accuracy = ran.nextInt(100) + 1;
                    if (accuracy > 25) {
                        life_lost = ran.nextInt(3) + 1;
                        pl_life -= life_lost / pl_defense;
                        System.out.println(pl_name + " lost " + life_lost / pl_defense + " HP!");
                    } else {
                        System.out.println("Zombie missed the attack!");
                    }
                    end_turn = true;
                } else if (select == 5) {
                    String none;
                    System.out.println(pl_name + " tries to talk to the zombie");
                    none = in.nextLine();
                    System.out.println("The fuck you are tryin'na do kiddo???");
                    none = in.nextLine();
                    System.out.println("Don't ya see that I'm gonna eat your fucking brain???");
                    none = in.nextLine();
                    System.out.println("Snap out of it goddam!!!");
                    none = in.nextLine();
                    System.out.println("You're a little piece of shit so shoot me now or i'll kill you!!!");
                }
                if (!end_turn && en_life > 0) {
                    System.out.println("Zombie attacks!");
                    accuracy = ran.nextInt(100) + 1;
                    if (accuracy > 25) {
                        life_lost = ran.nextInt(3) + 1;
                        pl_life -= life_lost;
                        System.out.println(pl_name + " lost " + life_lost + " HP!");
                    } else {
                        System.out.println("Zombie missed the attack!");
                    }
                }
                if (en_life <= 0) {

                    int exp_gained = ran.nextInt(50) + 126;
                    System.out.println("Enemy defeated");
                    System.out.println("You gained " + exp_gained + " expirience points!");
                    exp += exp_gained;
                    System.out.println("Current expirience: " + exp);
                    if (exp > exp_needed) {
                        System.out.println("Level Up!");
                        level++;
                        System.out.println("Level: " + level);
                        pl_life_max += 5;
                        pl_life = pl_life_max;
                        System.out.println("HP: " + pl_life_max);
                        pl_mp++;
                        pl_mp++;
                        System.out.println("MP: " + pl_mp);
                        pl_attack++;
                        pl_attack++;
                        System.out.println("Attack: " + pl_attack);
                        pl_defense++;
                        pl_defense++;
                        System.out.println("Defense: " + pl_defense);
                        exp_needed += level * 100;
                        System.out.println("Experience needed for next level: " + exp_needed);
                    }
                }
            }
        }
        while (pl_life > 0 && pl_attack < 50) {
            System.out.println("You encountered a Wolf!");
            en_life = 40;
            en_mp = 25;
            pl_magic[0] = 10;
            pl_magic_name[0] = "Flamethrower";
            pl_magic[1] = 20;
            pl_magic_name[1] = "Hailstorm";
            pl_magic[2] = 10;
            pl_magic_name[2] = "Heal 30 HP";
            obj[0] = 20;
            obj_name[0] = "Great Potion";
            obj[1] = 100;
            obj_name[1] = "Hyper Potion";
            en_magic[0] = 4;
            while (en_life > 0 && pl_life > 0) {
                System.out.println("HP: " + pl_life + " MP: " + pl_mp);
                System.out.println("Enemy HP: " + en_life + " Enemy MP: " + en_mp);
                System.out.println("What will " + pl_name + " do?");
                System.out.println("1) Fight 2) Item 3) Magic 4) Defend 5) Talk");
                end_turn = false;
                do {
                    select = in.nextInt();
                } while (select < 1 || select > 5);
                if (select == 1) {
                    System.out.println(pl_name + " attacks!");
                    accuracy = ran.nextInt(100) + 1;
                    if (accuracy > 5) {
                        life_lost = ran.nextInt(pl_attack) + 1;
                        en_life -= life_lost;
                        System.out.println("The enemy lost " + life_lost + " HP!");
                    } else {
                        System.out.println(pl_name + " missed the attack!");
                    }
                } else if (select == 2) {
                    boolean are = false;
                    boolean using_object = true;
                    while (!end_turn && !are && using_object) {
                        are = true;
                        boolean none = false;
                        int voidd = 0;
                        int recovered;
                        for (int i = 0; i < obj.length && !none; i++) {
                            if (obj[i] != 0) {
                                System.out.println(i + ". " + obj_name[i]);
                                are = false;
                            } else {
                                none = true;
                                System.out.println(i + ". Exit");
                                voidd = i;
                            }
                        }
                        if (!are) {
                            System.out.print("Which item do you want to use? ");
                            select = in.nextInt();
                            if (select == voidd) {
                                end_turn = true;
                            } else {
                                System.out.println(pl_name + " used " + obj_name[select] + "!");
                                recovered = obj[select];
                                System.out.println(pl_name + " recovered " + recovered + " HP!");
                                pl_life += obj[select];
                                obj[select] = 0;
                                using_object = false;
                            }
                        }
                    }
                } else if (select == 3 && pl_mp > 0) {
                    boolean are = false;
                    boolean using_magic = true;
                    while (!end_turn && !are && using_magic) {
                        are = true;
                        boolean none = false;
                        int voidd = 0;
                        int damage;
                        for (int i = 0; i < pl_magic.length && !none; i++) {
                            if (pl_magic[i] != 0) {
                                System.out.println(i + ". " + pl_magic_name[i]);
                                are = false;
                            } else {
                                voidd = i;
                                System.out.println(i + ". Exit");
                                none = true;
                            }
                        }
                        if (!are) {
                            System.out.print("Which magic will you use? ");
                            select = in.nextInt();
                            if (pl_mp < pl_magic[select]) {
                                System.out.println("You don't have enpugh MP!");
                                select = voidd;
                            }
                            if (select == voidd) {
                                end_turn = true;
                            } else {
                                System.out.println(pl_name + " used " + pl_magic_name[select] + "!");
                                damage = pl_magic[select];
                                System.out.println("Wolf recieved " + damage + " HP of damage!");
                                en_life -= pl_magic[select];
                                pl_mp -= pl_magic[select];
                                using_magic = false;
                            }
                        }
                    }
                } else if (select == 4) {
                    System.out.println(pl_name + " is defending.");
                    System.out.println("Wolf attacks!");
                    accuracy = ran.nextInt(100) + 1;
                    if (accuracy > 20) {
                        life_lost = ran.nextInt(15) + 1;
                        pl_life -= (life_lost / pl_defense);
                        System.out.println(pl_name + " lost " + life_lost / pl_defense + " HP!");
                    } else {
                        System.out.println("Wolf missed the attack!");
                    }
                    end_turn = true;
                } else if (select == 5) {
                    String none;
                    System.out.println(pl_name + " tries to talk to the Wolf");
                    none = in.nextLine();
                    System.out.println("The fuck you are tryin'na do kiddo???");
                    none = in.nextLine();
                    System.out.println("Don't ya see that I'm gonna eat your fucking brain???");
                    none = in.nextLine();
                    System.out.println("Snap out of it goddam!!!");
                    none = in.nextLine();
                    System.out.println("You're a little piece of shit so shoot me now or i'll kill you!!!");
                }
                if (!end_turn && en_life > 0) {
                    System.out.println("Wolf attacks!");
                    accuracy = ran.nextInt(100) + 1;
                    if (accuracy > 20) {
                        life_lost = ran.nextInt(15) + 1;
                        pl_life -= life_lost;
                        System.out.println(pl_name + " lost " + life_lost + " HP!");
                    } else {
                        System.out.println("Wolf missed the attack!");
                    }
                }
                if (en_life <= 0) {

                    int exp_gained = ran.nextInt(250) + 500;
                    System.out.println("Enemy defeated");
                    System.out.println("You gained " + exp_gained + " expirience points!");
                    exp += exp_gained;
                    System.out.println("Current expirience: " + exp);
                    if (exp > exp_needed) {
                        System.out.println("Level Up!");
                        level++;
                        System.out.println("Level: " + level);
                        pl_life_max += 5;
                        pl_life = pl_life_max;
                        System.out.println("HP: " + pl_life_max);
                        pl_mp++;
                        pl_mp++;
                        System.out.println("MP: " + pl_mp);
                        pl_attack++;
                        pl_attack++;
                        System.out.println("Attack: " + pl_attack);
                        pl_defense++;
                        pl_defense++;
                        System.out.println("Defense: " + pl_defense);
                        exp_needed += level * 100;
                        System.out.println("Experience needed for next level: " + exp_needed);
                    }
                }
            }
        }
        in.close();
    }
}