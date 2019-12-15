package main.Personnage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MageTest {

	  Mage m1 = new Mage(10, 0, 0, 10, 1);
	  Mage m2 = new Mage(10, 0, 0, 10, 2);

	  @Test
	  public void Given_GuerrierSelected_When_PersonnageCreation_Then_DisplayTheScreamWord(){
	    System.out.println(m1.cri());
	    assertEquals("Abracadabra", m1.cri());
	  }

	  @Test
	  public void Given_Attack1Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPersonnage2WithoutChangeLifeOfPersonnage1(){
	    m1.attack1(m2);
	    assertEquals(40,m2.getVie());
	    assertEquals(50,m1.getVie());
	  }

	  @Test
	  public void Given_Attack2SelectedWithFullLife_When_PlayerTurn_Then_DisplayMessageFor0LifeGiven(){
	    m1.attack2(m2);
	    assertEquals(50,m1.getVie());
	  }

	  @Test
	  public void Given_Attack2SelectedWithFullLife_When_PlayerTurn_Then_DisplayMessageFor20LifeGiven(){
	    m1.setVie(43);
	    m1.attack2(m2);
	    assertEquals(50,m1.getVie());
	  }

}
