package net.minecraft.server;

import java.io.IOException;

public class class_fo implements class_ff {
	private int a;
	private class_cj b;
	private class_cq c;
	private String d;

	public class_fo() {
	}

	public class_fo(class_ww var1) {
		a = var1.G();
		b = var1.m();
		c = var1.b;
		d = var1.c.B;
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.g();
		d = var1.c(class_ww.class_a_in_class_ww.A);
		b = var1.e();
		c = class_cq.b(var1.readUnsignedByte());
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.b(a);
		var1.a(d);
		var1.a(b);
		var1.writeByte(c.b());
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
