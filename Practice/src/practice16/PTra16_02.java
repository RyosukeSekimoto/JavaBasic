/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		Boolean ob = new Boolean(b);
		Byte oby = new Byte(by);
		Short os = new Short(s);
		Character oc = new Character(c);
		Integer oi = new Integer(i);
		Long ol = new Long(l);
		Float of = new Float(f);
		Double od = new Double(d);
	}
}
