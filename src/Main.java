public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDefenceBoss("Магический");
        boss.setHealthBoss(700);
        boss.setDamageBoss(50);
        System.out.println("Boss Health: " + boss.getHealthBoss() +
                " Damage: " + boss.getDamageBoss()+ " Defence: " + boss.getDefenceBoss());
    }
}