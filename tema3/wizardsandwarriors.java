public class wizzardsandwarrior {class Fighter {
    @Override
    public String toString() {
        return "Fighter is a Fighter";
    }
    public boolean isVulnerable() {
        return false;
    }
    public int damagePoints(Fighter opponent) {
        return 0;
    }
}
    class Warrior extends Fighter {
        @Override
        public String toString() {
            return "Fighter is a Warrior";
        }
        @Override
        public int damagePoints(Fighter opponent) {
            if (opponent.isVulnerable()) {
                return 10; // 10 damage points when the target is vulnerable
            } else {
                return 6; // 6 damage points when the target is not vulnerable
            }
        }
    }
    class Wizard extends Fighter {
        private boolean spellPrepared;
        public Wizard() {
            this.spellPrepared = false;
        }
        public void prepareSpell() {
            spellPrepared = true;
        }
        @Override
        public String toString() {
            return "Fighter is a Wizard";
        }
        @Override
        public boolean isVulnerable() {
            return !spellPrepared;
        }
        @Override
        public int damagePoints(Fighter opponent) {
            if (spellPrepared) {
                return 12; 
            } else {
                return 3; 
            }
        }
    }
    public class Main {
        public void main(String[] args) {
            Fighter warrior = new Warrior();
            System.out.println(warrior);
            System.out.println(warrior.isVulnerable());
            Wizard wizard = new Wizard();
            wizard.prepareSpell();
            Fighter wizardFighter = new Wizard();
            System.out.println(wizardFighter.isVulnerable());
            System.out.println(wizard.damagePoints(new Warrior()));
            Warrior warrior2 = new Warrior();
            Wizard wizard2 = new Wizard();
            System.out.println(warrior2.damagePoints(wizard2)); 
        }
    }
}
