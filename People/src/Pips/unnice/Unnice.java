/*
 *
 * Example of anonymous inner class
 * 
 * 
 * 
 */

package Pips.unnice;

public class Unnice {
	Annoyance annoyance = new Annoyance() {

		@Override
		public boolean isAnnoy(String verAnnoy) {
			if(verAnnoy.equals("yes")) {
				return true;
			} else {
			return false;
			
			}
		}
		
	};
	
	public Annoyance getAnnoyance() {
		return annoyance;
	}
	

}
