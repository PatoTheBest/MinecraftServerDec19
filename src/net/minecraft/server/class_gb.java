package net.minecraft.server;

import java.io.IOException;

public class class_gb implements class_ff {
	private int a;
	private short b;
	private boolean c;

	public class_gb() {
	}

	public class_gb(int var1, short var2, boolean var3) {
		a = var1;
		b = var2;
		c = var3;
	}

	public void a(class_fj var1) {
		var1.a(this);
	}

	@Override
	public void a(PacketDataSerializer var1) throws IOException {
		a = var1.readUnsignedByte();
		b = var1.readShort();
		c = var1.readBoolean();
	}

	@Override
	public void b(PacketDataSerializer var1) throws IOException {
		var1.writeByte(a);
		var1.writeShort(b);
		var1.writeBoolean(c);
	}

	// $FF: synthetic method
	// $FF: bridge method
	@Override
	public void a(class_ep var1) {
		this.a((class_fj) var1);
	}
}
