package main.Personnage;

public class Mage extends Personnage {
	
	private int defaultLife;

	  /**
	   * Default constructor for Mage
	   * @param niveau       The level of the personnage
	   * @param force        the force
	   * @param agilite      the agility
	   * @param intelligence the intelligence
	   * @param playerNumber the number of the actual player
	   */
	  public Mage(int niveau, int force, int agilite, int intelligence, int playerNumber) {
	    super(niveau, force, agilite, intelligence, playerNumber);
	    this.defaultLife = niveau * 5;
	  }

	  // ---- class method ----

	  @Override
	  public String cri() {
	    return "Abracadabra";
	  }

	  @Override
	  public void attack1(Personnage p) {
	    int damage = getIntelligence();
	    System.out.println("Joueur " + getPlayerNumber() + " utilise Boule de Feu et inflige " + damage + " dommages.");
	    p.removeLife(damage);
	  }

	  @Override
	  public void attack2(Personnage p) {
	    int health = getIntelligence() * 2;
	    if(getVie() + health >= defaultLife){
	      health = defaultLife - getVie();
	      addLife(health);
	    }
	    else
	      addLife(health);
	  }

}
