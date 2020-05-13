class WaterMonster extends Monster {

    // TODO : add constructor and initialize type to "water"
    public WaterMonster(String name, int attack) {
        super( name, attack, "water");
    }

    // TODO : create an attack method which deals x2 damage to "fire"
    public boolean attack(Monster opponent) {

        opponent.setLife( opponent.getLife() - this.getAttack() * ( opponent.getType() == "fire" ? 2 : 1 ) );

        return opponent.isKO();
    }

}