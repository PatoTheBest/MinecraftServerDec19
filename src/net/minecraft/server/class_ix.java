package net.minecraft.server;

import java.io.IOException;

public class class_ix implements class_ff {
	private int a;
	private class_aco b;

	public void a(class_id var1) {
		var1.a(this);
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.readShort();
		b = var1.k();
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.writeShort(a);
		var1.a(b);
	}

	public int a() {
		return a;
	}

	public class_aco b() {
		return b;
	}

	// $FF: synthetic method
	// $FF: bridge method
	@Override
	public void a(class_ep var1) {
		this.a((class_id) var1);
	}
}
