package main.Personnage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuerrierTest {

	Guerrier g1 = new Guerrier(10, 10, 0, 0, 1);
    Guerrier g2 = new Guerrier(10, 10, 0, 0, 2);

  @Test
  public void Given_GuerrierSelected_When_PersonnageCreation_Then_DisplayTheScreamWord(){
    System.out.println(g1.cri());
    assertEquals("Woarg", g1.cri());
  }

  @Test
  public void Given_Attack1Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPersonnage2WithoutChangeLifeOfPersonnage1(){
    g1.attack1(g2);
    assertEquals(40,g2.getVie());
    assertEquals(50,g1.getVie());
  }

  @Test
  public void Given_Attack2Selected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToPersonnage2WithLooseLifeOfPersonnage1(){
    g1.attack2(g2);
    assertEquals(30,g2.getVie());
    assertEquals(45,g1.getVie());
  }



}
