package net.minecraft.server;

import java.io.IOException;

public class class_fl implements class_ff {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;

	public class_fl() {
	}

	public class_fl(class_rd var1) {
		a = var1.G();
		b = class_oa.c(var1.s * 32.0D);
		c = class_oa.c(var1.t * 32.0D);
		d = class_oa.c(var1.u * 32.0D);
		e = var1.i();
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.g();
		b = var1.readInt();
		c = var1.readInt();
		d = var1.readInt();
		e = var1.readShort();
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.b(a);
		var1.writeInt(b);
		var1.writeInt(c);
		var1.writeInt(d);
		var1.writeShort(e);
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
