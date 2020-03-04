/*
 *
 * Example of anonymous inner class
 * 
 * 
 * 
 */

package Pips;

import Pips.unnice.Unnice;

public class Main {

	public static void main(String[] args) {
		Unnice unnice = new Unnice();
		if(unnice.getAnnoyance().isAnnoy(args[0])) {
			System.out.println("Yes you are Annoying!");
		} else {
			System.out.println("You're not Annoying");
		}

	}

}
