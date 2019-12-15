# MagiWorld  Openclassrooms
***Comment se déroule le jeu :***

Le jeu commence par proposer au joueur 1 de choisir entre **Guerrier**, **Rôdeur** ou **Mage**.<br>
Il doit ensuite choisir le niveau, la force, l’agilité et enfin l’intelligence de son personnage.<br>
C’est ensuite au tour du second joueur de choisir la classe et les caractéristiques de son personnage.<br>
La partie démarre ensuite, le joueur 1 commence.<br>
Chaque joueur joue tour à tour et choisit entre son **Attaque Basique** ou son **Attaque spéciale**.<br>
Quand un joueur n’a plus de point de vie, la partie est terminée et l’autre joueur l’emporte.<br>

***Les caractéristiques :***

Chaque personnage possède 5 caractéristiques :<br>
__Niveau__ : choisi par le joueur (min 1, max 100)<br>
__Vie__ : égale au niveau du joueur * 5<br>
__Force__ : choisie par le joueur (min 0, max 100)<br>
__Agilité__ : choisie par le joueur (min 0, max 100)<br>
__Intelligence__ : choisie par le joueur (min 0, max 100)<br>

Le total __force + agilité + intelligence = niveau du joueur.__

Par exemple, un mage niveau 18 ne peut pas avoir 5 de force et 14 d’intelligence : le total fait 19 et non 18.

Les sorts :
Chaque joueur possède 2 sorts :

Une attaque basique qui cause des dommages à l’adversaire.<br>
Une attaque spéciale aux effets variés.<br>

**Guerrier**

*Attaque Basique* - **Coup d’Épée** : Effectue des dommages égaux à la force du joueur sur l’adversaire.<br>
*Attaque Spéciale* - **Coup de Rage** : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. 
Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.<br>

**Rôdeur**

*Attaque Basique* - **Tir à l’Arc** : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.<br>
*Attaque Spéciale* - **Concentration** : Le joueur gagne son niveau divisé par 2 en agilité.<br>

**Mage**

*Attaque Basique* - **Boule de Feu** : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.<br>
*Attaque Spéciale* - **Soin** : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. 
Il ne peut pas avoir plus de vie qu’il n’en avait au départ.
