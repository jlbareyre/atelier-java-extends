class AirMonster extends Monster {

    // TODO : add constructor and initialize type to "air"
    public AirMonster(String name, int attack) {
        super( name, attack, "air");
    }

    // TODO : create an attack method which deals x2 damage to "water"
    public boolean attack(Monster opponent) {

        opponent.setLife( opponent.getLife() - this.getAttack() * ( opponent.getType() == "water" ? 2 : 1 ) );

        return opponent.isKO();
    }

    
}