package net.minecraft.server;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class class_oi {
	public static int a(Collection var0) {
		int var1 = 0;

		class_oi.class_a_in_class_oi var3;
		for (Iterator var2 = var0.iterator(); var2.hasNext(); var1 += var3.a) {
			var3 = (class_oi.class_a_in_class_oi) var2.next();
		}

		return var1;
	}

	public static class_oi.class_a_in_class_oi a(Random var0, Collection var1, int var2) {
		if (var2 <= 0) {
			throw new IllegalArgumentException();
		} else {
			int var3 = var0.nextInt(var2);
			return a(var1, var3);
		}
	}

	public static class_oi.class_a_in_class_oi a(Collection var0, int var1) {
		Iterator var2 = var0.iterator();

		class_oi.class_a_in_class_oi var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (class_oi.class_a_in_class_oi) var2.next();
			var1 -= var3.a;
		} while (var1 >= 0);

		return var3;
	}

	public static class_oi.class_a_in_class_oi a(Random var0, Collection var1) {
		return a(var0, var1, a(var1));
	}

	public static class class_a_in_class_oi {
		protected int a;

		public class_a_in_class_oi(int var1) {
			a = var1;
		}
	}
}
