package net.minecraft.server;

import java.io.IOException;
import java.util.List;

public class class_hl implements class_ff {
	private int a;
	private List b;

	public class_hl() {
	}

	public class_hl(int var1, class_kc var2, boolean var3) {
		a = var1;
		if (var3) {
			b = var2.c();
		} else {
			b = var2.b();
		}

	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.g();
		b = class_kc.b(var1);
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.b(a);
		class_kc.a(b, var1);
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
