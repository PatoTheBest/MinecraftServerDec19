package net.minecraft.server;

import java.io.IOException;

public class class_fy implements class_ff {
	private String[] a;

	public class_fy() {
	}

	public class_fy(String[] var1) {
		a = var1;
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = new String[var1.g()];

		for (int var2 = 0; var2 < a.length; ++var2) {
			a[var2] = var1.c(32767);
		}

	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.b(a.length);
		String[] var2 = a;
		int var3 = var2.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			String var5 = var2[var4];
			var1.a(var5);
		}

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
