package net.minecraft.server;

import java.io.IOException;

public class class_jk implements class_ff {
	private int a;

	public class_jk() {
	}

	public class_jk(int var1) {
		a = var1;
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.g();
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.b(a);
	}

	public void a(class_jh var1) {
		var1.a(this);
	}

	// $FF: synthetic method
	// $FF: bridge method
	@Override
	public void a(class_ep var1) {
		this.a((class_jh) var1);
	}
}
