package net.minecraft.server;

import java.util.Random;

public class class_ako extends class_ajz {
	@Override
	public Item a(class_apn var1, Random var2, int var3) {
		if (var3 > 3) {
			var3 = 3;
		}

		return var2.nextInt(10 - (var3 * 3)) == 0 ? Items.am : Item.a(this);
	}

	@Override
	public class_avr g(class_apn var1) {
		return class_avr.m;
	}
}
