package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class class_sm extends class_sr {
	private static final Predicate b;
	private class_rh c;
	private class_ago d;
	int a;

	public class_sm(class_rh var1) {
		c = var1;
		d = var1.o;
		this.a(7);
	}

	@Override
	public boolean a() {
		if (c.bj().nextInt(c.i_() ? 50 : 1000) != 0) {
			return false;
		} else {
			class_cj var1 = new class_cj(c.s, c.t, c.u);
			return b.apply(d.p(var1)) ? true : d.p(var1.b()).c() == Blocks.GRASS;
		}
	}

	@Override
	public void c() {
		a = 40;
		d.a(c, (byte) 10);
		c.u().n();
	}

	@Override
	public void d() {
		a = 0;
	}

	@Override
	public boolean b() {
		return a > 0;
	}

	public int f() {
		return a;
	}

	@Override
	public void e() {
		a = Math.max(0, a - 1);
		if (a == 4) {
			class_cj var1 = new class_cj(c.s, c.t, c.u);
			if (b.apply(d.p(var1))) {
				if (d.S().b("mobGriefing")) {
					d.b(var1, false);
				}

				c.x();
			} else {
				class_cj var2 = var1.b();
				if (d.p(var2).c() == Blocks.GRASS) {
					if (d.S().b("mobGriefing")) {
						d.b(2001, var2, Block.a(Blocks.GRASS));
						d.a(var2, Blocks.DIRT.S(), 2);
					}

					c.x();
				}
			}

		}
	}

	static {
		b = class_apv.a(Blocks.H).a(BlockLongGrass.a, Predicates.equalTo(BlockLongGrass.class_a_in_class_ano.b));
	}
}
