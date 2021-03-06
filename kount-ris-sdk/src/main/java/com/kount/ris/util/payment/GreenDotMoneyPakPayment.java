package com.kount.ris.util.payment;

/**
 * Green Dot MoneyPak payment.
 * </p>
 * Sets the PTYP parameter to "GDMP".
 * 
 * @author Kount &lt;custserv@kount.com&gt;
 * @version $Id$
 * @copyright 2011 Kount Inc. All Rights Reverved.
 */
public class GreenDotMoneyPakPayment extends Payment {

	/**
	 * Constructor for a Green Dot MoneyPak payment.
	 * 
	 * @param id
	 *            Green Dot MoneyPak payment ID number
	 */
	public GreenDotMoneyPakPayment(String id) {
		super("GDMP", id);
	}

}
