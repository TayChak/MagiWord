package main.Personnage;

public class Guerrier extends Personnage {
	
	/**
	   * Default constructor for Guerrier
	   * @param niveau       The level of the personnage
	   * @param force        the force
	   * @param agilite      the agility
	   * @param intelligence the intelligence
	   * @param playerNumber the number of the actual player
	   */
	  public Guerrier(int niveau, int force, int agilite, int intelligence, int playerNumber){
	    super(niveau, force, agilite, intelligence, playerNumber);
	  }

	// ---- class method ----

	  @Override
	  public String cri() {
	    return "Woarg";
	  }
	  
	  @Override
	  public void attack1(Personnage p) {
	    int damage = getForce();
	    System.out.println("Joueur " + getPlayerNumber() + " utilise Coup d'Epee et inflige " + damage + " dommages.");
	    p.removeLife(damage);
	  }

	  @Override
	  public void attack2(Personnage p) {
	    int damage = getForce() * 2;
	    int autoDamage = getForce() / 2;
	    System.out.println("Joueur " + getPlayerNumber() + " utilise Coup de rage et inflige " + damage + " dommages.");
	    p.removeLife(damage);
	    removeLife(autoDamage);
	  }
	  
}
