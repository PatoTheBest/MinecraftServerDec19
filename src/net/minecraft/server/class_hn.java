package net.minecraft.server;

import java.io.IOException;

public class class_hn implements class_ff {
	private int a;
	private int b;
	private int c;
	private int d;

	public class_hn() {
	}

	public class_hn(Entity var1) {
		this(var1.G(), var1.v, var1.w, var1.x);
	}

	public class_hn(int var1, double var2, double var4, double var6) {
		a = var1;
		double var8 = 3.9D;
		if (var2 < -var8) {
			var2 = -var8;
		}

		if (var4 < -var8) {
			var4 = -var8;
		}

		if (var6 < -var8) {
			var6 = -var8;
		}

		if (var2 > var8) {
			var2 = var8;
		}

		if (var4 > var8) {
			var4 = var8;
		}

		if (var6 > var8) {
			var6 = var8;
		}

		b = (int) (var2 * 8000.0D);
		c = (int) (var4 * 8000.0D);
		d = (int) (var6 * 8000.0D);
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.g();
		b = var1.readShort();
		c = var1.readShort();
		d = var1.readShort();
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.b(a);
		var1.writeShort(b);
		var1.writeShort(c);
		var1.writeShort(d);
	}

	public void a(class_fj var1) {
		var1.a(this);
	}

	// $FF: synthetic method
	// $FF: bridge method
	@Override
	public void a(class_ep var1) {
		this.a((class_fj) var1);
	}
}
