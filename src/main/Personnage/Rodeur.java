package main.Personnage;

public class Rodeur extends Personnage {

	  /**
	   * Default constructor for Rodeur
	   * @param niveau       The level of the personnage
	   * @param force        the force
	   * @param agilite      the agility
	   * @param intelligence the intelligence
	   * @param playerNumber the number of the actual player
	   */
	  public Rodeur(int niveau, int force, int agilite, int intelligence, int playerNumber) {
	    super(niveau, force, agilite, intelligence, playerNumber);
	  }

	  // ---- class method ----

	  @Override
	  public String cri() {
	    return "Fsshhh";
	  }

	  @Override
	  public void attack1(Personnage p) {
	    int damage = getAgilite();
	    System.out.println("Joueur " + getPlayerNumber() + " utilise Tir à l'Arc et inflige " + damage + " dommages.");
	    p.removeLife(damage);
	  }

	  @Override
	  public void attack2(Personnage p) {
	    int agilityWon = getNiveau() / 2;
	    addAgility(agilityWon);
	  }
	
}