package net.minecraft.server;


public class class_auz {
	private Block.class_a_in_class_ail a;
	private Block.class_c_in_class_ail b;
	private boolean c;
	private Block d;
	private class_agi e;
	private class_aua f;
	private boolean g;

	public class_auz() {
		this(Block.class_a_in_class_ail.a, Block.class_c_in_class_ail.a, false, (Block) null, (class_aua) null);
	}

	public class_auz(Block.class_a_in_class_ail var1, Block.class_c_in_class_ail var2, boolean var3, Block var4, class_aua var5) {
		b = var2;
		a = var1;
		c = var3;
		d = var4;
		e = null;
		f = var5;
		g = true;
	}

	public class_auz a() {
		return (new class_auz(a, b, c, d, f)).a(e).b(g);
	}

	public class_auz a(Block.class_a_in_class_ail var1) {
		a = var1;
		return this;
	}

	public class_auz a(Block.class_c_in_class_ail var1) {
		b = var1;
		return this;
	}

	public class_auz a(boolean var1) {
		c = var1;
		return this;
	}

	public class_auz a(Block var1) {
		d = var1;
		return this;
	}

	public class_auz a(class_agi var1) {
		e = var1;
		return this;
	}

	public class_auz a(class_aua var1) {
		f = var1;
		return this;
	}

	public Block.class_a_in_class_ail b() {
		return a;
	}

	public class_auz b(boolean var1) {
		g = var1;
		return this;
	}

	public Block.class_c_in_class_ail c() {
		return b;
	}

	public boolean e() {
		return c;
	}

	public Block f() {
		return d;
	}

	public class_aua g() {
		if ((f == null) && (e != null)) {
			i();
		}

		return f;
	}

	public boolean h() {
		return g;
	}

	void i() {
		f = this.b(e);
	}

	private class_aua b(class_agi var1) {
		if (var1 == null) {
			return null;
		} else {
			int var2 = var1.a * 16;
			int var3 = var1.b * 16;
			return new class_aua(var2, 0, var3, (var2 + 16) - 1, 255, (var3 + 16) - 1);
		}
	}
}
