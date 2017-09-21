package Characters;
import Guitar.Guitar;
import SoloActs.SoloAct;

/*Author:    Alec Rulev & Sean Egger
 * Class: CSI-340-01
 * Assignment: Lab 2
 * Date Assigned:9/21/2017
 * Due Date: 9/28/2017
 * Description: Implement a play configuration system in Java using the Strategy Design Pattern
 * Certification of Authenticity:I  certify  that  this  is  entirely 
 *  my  own  work,  except  where  I  have  given fully-documented  references
 *  to  the  work  of  others.  I  understand  the definition and consequences of
 *  plagiarism and acknowledge that the assessor of this assignment may, for the
 *  purpose of assessing this assignment:-Reproduce  this  assignment  and  provide
 *  a  copy  to  another  member  of academic staff; and/or-Communicate  a  copy 
 *  of  this  assignment  to  a  plagiarism  checking service  (which  may  then 
 *  retain  a  copy  of  this  assignment  on  its database for the purpose of 
 *  future plagiarism checking)
*/
public abstract class Character {

	Guitar guitar;
	SoloAct soloAct;
	String name;
	public Character()
	{
		
	}
	
	public void setGuitar(Guitar myGuitar)
	{
		this.guitar = myGuitar;
	}
	
	public void setSoloAct(SoloAct mySoloAct)
	{
		this.soloAct = mySoloAct;
	}
	public void setSoloAct(String myName)
	{
		this.name = myName;
	}
}
