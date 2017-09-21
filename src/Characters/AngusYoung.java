/*Author:    Alec Rulev & Sean Egger [Worked on whole lab together]
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
package Characters;

import Guitar.*;
import SoloActs.*;

public class AngusYoung extends Character{
	public AngusYoung()
	{
		this.name = "Angus Young";
		this.guitar = new FenderTelecaster();
		this.soloBehaviour = new GuitarOnFire();
	}

	@Override
	void display() {
		System.out.println("I am Angus Young");
	}
}
