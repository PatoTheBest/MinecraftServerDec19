package net.minecraft.server;


public class class_bi extends class_i {
	@Override
	public boolean a(class_m var1) {
		return MinecraftServer.P().V() || super.a(var1);
	}

	@Override
	public String c() {
		return "seed";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String c(class_m var1) {
		return "commands.seed.usage";
	}

	@Override
	public void a(class_m var1, String[] var2) throws class_bz {
		Object var3 = var1 instanceof class_yu ? ((class_yu) var1).o : MinecraftServer.P().a(0);
		var1.a(new class_fb("commands.seed.success", new Object[] { Long.valueOf(((class_ago) var3).L()) }));
	}
}
