class FireMonster extends Monster {

    // TODO : add constructor and initialize type to "fire"
    public FireMonster(String name, int attack) {
        super( name, attack, "fire");
    }

    // TODO : create an attack method which deals x2 damage to "air"
    public boolean attack(Monster opponent) {

        opponent.setLife( opponent.getLife() - this.getAttack() * ( opponent.getType() == "air" ? 2 : 1 ) );

        return opponent.isKO();
    }

}