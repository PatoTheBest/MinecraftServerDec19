package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.EnumChatFormat;
import net.minecraft.server.World;
import net.minecraft.server.WorldSettings;
import net.minecraft.server.class_aoc;
import net.minecraft.server.class_aoe;
import net.minecraft.server.class_avn;
import net.minecraft.server.IPlayerFileData;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_awj;
import net.minecraft.server.class_awk;
import net.minecraft.server.class_awp;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NetworkManager;
import net.minecraft.server.PacketDataSerializer;
import net.minecraft.server.IChatBaseComponent;
import net.minecraft.server.class_fb;
import net.minecraft.server.Packet;
import net.minecraft.server.PacketPlayOutServerDifficulty;
import net.minecraft.server.PacketPlayOutChat;
import net.minecraft.server.PacketPlayOutCustomPayload;
import net.minecraft.server.PacketPlayOutEntityStatus;
import net.minecraft.server.PacketPlayOutGameStateChange;
import net.minecraft.server.PacketPlayOutLogin;
import net.minecraft.server.PacketPlayOutAbilities;
import net.minecraft.server.PacketPlayOutPlayerInfo;
import net.minecraft.server.PacketPlayOutRespawn;
import net.minecraft.server.PacketPlayOutWorldBorder;
import net.minecraft.server.PacketPlayOutHeldItemSlot;
import net.minecraft.server.PacketPlayOutExperience;
import net.minecraft.server.PacketPlayOutScoreboardTeam;
import net.minecraft.server.PacketPlayOutSpawnPosition;
import net.minecraft.server.PacketPlayOutUpdateTime;
import net.minecraft.server.PacketPlayOutEntityEffect;
import net.minecraft.server.class_kl;
import net.minecraft.server.class_kz;
import net.minecraft.server.class_ld;
import net.minecraft.server.WorldServer;
import net.minecraft.server.class_lh;
import net.minecraft.server.class_li;
import net.minecraft.server.class_lo;
import net.minecraft.server.class_lv;
import net.minecraft.server.IpBanList;
import net.minecraft.server.class_lx;
import net.minecraft.server.OpList;
import net.minecraft.server.class_mb;
import net.minecraft.server.class_mc;
import net.minecraft.server.GameProfileBanList;
import net.minecraft.server.class_mf;
import net.minecraft.server.WhiteList;
import net.minecraft.server.class_mh;
import net.minecraft.server.ServerStatisticManager;
import net.minecraft.server.class_my;
import net.minecraft.server.class_nc;
import net.minecraft.server.MathHelper;
import net.minecraft.server.class_pl;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_pt;
import net.minecraft.server.class_xa;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class PlayerList {

	public static final File BANNED_PLAYERS_FILE = new File("banned-players.json");
	public static final File BANNED_IPS_FILE = new File("banned-ips.json");
	public static final File OPS_FILE = new File("ops.json");
	public static final File WHITELIST_FILE = new File("whitelist.json");
	private static final Logger looger = LogManager.getLogger();
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd \'at\' HH:mm:ss z");

	private final MinecraftServer mcserver;
	private final List<class_lh> playerList = Lists.newArrayList();
	private final Map<UUID, class_lh> playerMap = Maps.newHashMap();
	private final GameProfileBanList gameProfileBanList;
	private final IpBanList ipBanList;
	private final OpList opList;
	private final WhiteList whiteList;
	private final Map<UUID, ServerStatisticManager> stats;
	private IPlayerFileData playerDataProvider;
	private boolean hasWhitelist;
	protected int maxPlayers;
	private int viewDistance;
	private WorldSettings.EnumGameMode defaultGameMode;
	private boolean isEveryoneOP;
	private int pingUpdateCounter;

	public PlayerList(MinecraftServer var1) {
		this.gameProfileBanList = new GameProfileBanList(BANNED_PLAYERS_FILE);
		this.ipBanList = new IpBanList(BANNED_IPS_FILE);
		this.opList = new OpList(OPS_FILE);
		this.whiteList = new WhiteList(WHITELIST_FILE);
		this.stats = Maps.newHashMap();
		this.mcserver = var1;
		this.gameProfileBanList.a(false);
		this.ipBanList.a(false);
		this.maxPlayers = 8;
	}

	public void processLogin(NetworkManager networkManager, class_lh player) {
		GameProfile var3 = player.cf();
		class_lv var4 = this.mcserver.aF();
		GameProfile var5 = var4.a(var3.getId());
		String var6 = var5 == null ? var3.getName() : var5.getName();
		var4.a(var3);
		NBTTagCompound var7 = this.a(player);
		player.a((World) this.mcserver.a(player.am));
		player.c.a((WorldServer) player.o);
		String var8 = "local";
		if (networkManager.getAddress() != null) {
			var8 = networkManager.getAddress().toString();
		}

		looger.info(player.e_() + "[" + var8 + "] logged in with entity id " + player.getId() + " at (" + player.s + ", " + player.t + ", " + player.u + ")");
		WorldServer var9 = this.mcserver.a(player.am);
		class_avn var10 = var9.Q();
		BlockPosition var11 = var9.N();
		this.a(player, (class_lh) null, var9);
		class_lo var12 = new class_lo(this.mcserver, networkManager, player);
		var12.a((Packet<?>) (new PacketPlayOutLogin(player.getId(), player.c.b(), var10.t(), var9.t.p().a(), var9.ab(), this.getMaxPlayers(), var10.u(), var9.R().b("reducedDebugInfo"))));
		var12.a((Packet<?>) (new PacketPlayOutCustomPayload("MC|Brand", (new PacketDataSerializer(Unpooled.buffer())).writeString(this.getMinecraftServer().getServerModName()))));
		var12.a((Packet<?>) (new PacketPlayOutServerDifficulty(var10.y(), var10.z())));
		var12.a((Packet<?>) (new PacketPlayOutSpawnPosition(var11)));
		var12.a((Packet<?>) (new PacketPlayOutAbilities(player.bH)));
		var12.a((Packet<?>) (new PacketPlayOutHeldItemSlot(player.bp.d)));
		int var13 = this.h(var3) ? this.opList.a(var3) : 0;
		var13 = this.mcserver.isLocal() && this.mcserver.d[0].Q().v() ? 4 : var13;
		var13 = this.isEveryoneOP ? 4 : var13;
		this.b(player, var13);
		player.A().d();
		player.A().b(player);
		this.a((class_kl) var9.aa(), player);
		this.mcserver.aH();
		class_fb var14;
		if (!player.e_().equalsIgnoreCase(var6)) {
			var14 = new class_fb("multiplayer.player.joined.renamed", new Object[] { player.f_(), var6 });
		} else {
			var14 = new class_fb("multiplayer.player.joined", new Object[] { player.f_() });
		}

		var14.b().a(EnumChatFormat.YELLOW);
		this.a((IChatBaseComponent) var14);
		this.c(player);
		var12.a(player.s, player.t, player.u, player.y, player.z);
		this.b(player, var9);
		if (!this.mcserver.ab().isEmpty()) {
			player.a(this.mcserver.ab(), this.mcserver.ac());
		}

		Iterator<?> var15 = player.bm().iterator();

		while (var15.hasNext()) {
			class_pl var16 = (class_pl) var15.next();
			var12.a((Packet<?>) (new PacketPlayOutEntityEffect(player.getId(), var16)));
		}

		player.g_();
		if (var7 != null && var7.hasOfType("Riding", 10)) {
			class_pr var17 = class_pt.a((NBTTagCompound) var7.getCompound("Riding"), (World) var9);
			if (var17 != null) {
				var17.n = true;
				var9.a(var17);
				player.a(var17);
				var17.n = false;
			}
		}

	}

	protected void a(class_kl var1, class_lh var2) {
		HashSet<class_awj> var3 = Sets.newHashSet();
		Iterator<?> var4 = var1.g().iterator();

		while (var4.hasNext()) {
			class_awk var5 = (class_awk) var4.next();
			var2.a.a((Packet<?>) (new PacketPlayOutScoreboardTeam(var5, 0)));
		}

		for (int var9 = 0; var9 < 19; ++var9) {
			class_awj var10 = var1.a(var9);
			if (var10 != null && !var3.contains(var10)) {
				List<?> var6 = var1.d(var10);
				Iterator<?> var7 = var6.iterator();

				while (var7.hasNext()) {
					Packet<?> var8 = (Packet<?>) var7.next();
					var2.a.a(var8);
				}

				var3.add(var10);
			}
		}

	}

	public void a(WorldServer[] var1) {
		this.playerDataProvider = var1[0].P().e();
		var1[0].ag().a(new class_aoc() {
			public void a(class_aoe var1, double var2) {
				PlayerList.this.a((Packet<?>) (new PacketPlayOutWorldBorder(var1, PacketPlayOutWorldBorder.class_a_in_class_hg.a)));
			}

			public void a(class_aoe var1, double var2, double var4, long var6) {
				PlayerList.this.a((Packet<?>) (new PacketPlayOutWorldBorder(var1, PacketPlayOutWorldBorder.class_a_in_class_hg.b)));
			}

			public void a(class_aoe var1, double var2, double var4) {
				PlayerList.this.a((Packet<?>) (new PacketPlayOutWorldBorder(var1, PacketPlayOutWorldBorder.class_a_in_class_hg.c)));
			}

			public void a(class_aoe var1, int var2) {
				PlayerList.this.a((Packet<?>) (new PacketPlayOutWorldBorder(var1, PacketPlayOutWorldBorder.class_a_in_class_hg.e)));
			}

			public void b(class_aoe var1, int var2) {
				PlayerList.this.a((Packet<?>) (new PacketPlayOutWorldBorder(var1, PacketPlayOutWorldBorder.class_a_in_class_hg.f)));
			}

			public void b(class_aoe var1, double var2) {
			}

			public void c(class_aoe var1, double var2) {
			}
		});
	}

	public void a(class_lh var1, WorldServer var2) {
		WorldServer var3 = var1.u();
		if (var2 != null) {
			var2.u().c(var1);
		}

		var3.u().a(var1);
		var3.b.c((int) var1.s >> 4, (int) var1.u >> 4);
	}

	public int d() {
		return class_ld.b(this.getViewDistance());
	}

	public NBTTagCompound a(class_lh var1) {
		NBTTagCompound var2 = this.mcserver.d[0].Q().i();
		NBTTagCompound var3;
		if (var1.e_().equals(this.mcserver.S()) && var2 != null) {
			var1.f(var2);
			var3 = var2;
			looger.debug("loading single player");
		} else {
			var3 = this.playerDataProvider.b(var1);
		}

		return var3;
	}

	protected void b(class_lh var1) {
		this.playerDataProvider.a(var1);
		ServerStatisticManager var2 = (ServerStatisticManager) this.stats.get(var1.aM());
		if (var2 != null) {
			var2.b();
		}

	}

	public void c(class_lh var1) {
		this.playerList.add(var1);
		this.playerMap.put(var1.aM(), var1);
		this.a((Packet<?>) (new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.class_a_in_class_gz.a, new class_lh[] { var1 })));
		WorldServer var2 = this.mcserver.a(var1.am);
		var2.a((class_pr) var1);
		this.a((class_lh) var1, (WorldServer) null);

		for (int var3 = 0; var3 < this.playerList.size(); ++var3) {
			class_lh var4 = (class_lh) this.playerList.get(var3);
			var1.a.a((Packet<?>) (new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.class_a_in_class_gz.a, new class_lh[] { var4 })));
		}

	}

	public void d(class_lh var1) {
		var1.u().u().d(var1);
	}

	public void e(class_lh var1) {
		var1.b((class_my) class_nc.f);
		this.b(var1);
		WorldServer var2 = var1.u();
		if (var1.m != null) {
			var2.f(var1.m);
			looger.debug("removing player mount");
		}

		var2.e(var1);
		var2.u().c(var1);
		this.playerList.remove(var1);
		UUID var3 = var1.aM();
		class_lh var4 = (class_lh) this.playerMap.get(var3);
		if (var4 == var1) {
			this.playerMap.remove(var3);
			this.stats.remove(var3);
		}

		this.a((Packet<?>) (new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.class_a_in_class_gz.e, new class_lh[] { var1 })));
	}

	public String getKickReason(SocketAddress address, GameProfile profile) {
		String reason;
		if (this.gameProfileBanList.a(profile)) {
			class_mf var5 = (class_mf) this.gameProfileBanList.b((Object) profile);
			reason = "You are banned from this server!\nReason: " + var5.d();
			if (var5.c() != null) {
				reason = reason + "\nYour ban will be removed on " + format.format(var5.c());
			}

			return reason;
		} else if (!this.e(profile)) {
			return "You are not white-listed on this server!";
		} else if (this.ipBanList.a(address)) {
			class_lx var3 = this.ipBanList.b(address);
			reason = "Your IP address is banned from this server!\nReason: " + var3.d();
			if (var3.c() != null) {
				reason = reason + "\nYour ban will be removed on " + format.format(var3.c());
			}

			return reason;
		} else {
			return this.playerList.size() >= this.maxPlayers && !this.f(profile) ? "The server is full!" : null;
		}
	}

	public class_lh addPlayer(GameProfile var1) {
		UUID var2 = class_xa.a(var1);
		ArrayList<class_lh> var3 = Lists.newArrayList();

		for (int var4 = 0; var4 < this.playerList.size(); ++var4) {
			class_lh var5 = (class_lh) this.playerList.get(var4);
			if (var5.aM().equals(var2)) {
				var3.add(var5);
			}
		}

		class_lh var7 = (class_lh) this.playerMap.get(var1.getId());
		if (var7 != null && !var3.contains(var7)) {
			var3.add(var7);
		}

		Iterator<class_lh> var8 = var3.iterator();

		while (var8.hasNext()) {
			class_lh var6 = (class_lh) var8.next();
			var6.a.c("You logged in from another location");
		}

		Object var9;
		if (this.mcserver.X()) {
			var9 = new class_kz(this.mcserver.a(0));
		} else {
			var9 = new class_li(this.mcserver.a(0));
		}

		return new class_lh(this.mcserver, this.mcserver.a(0), var1, (class_li) var9);
	}

	public class_lh a(class_lh var1, int var2, boolean var3) {
		var1.u().t().b(var1);
		var1.u().t().b((class_pr) var1);
		var1.u().u().c(var1);
		this.playerList.remove(var1);
		this.mcserver.a(var1.am).f(var1);
		BlockPosition var4 = var1.cj();
		boolean var5 = var1.ck();
		var1.am = var2;
		Object var6;
		if (this.mcserver.X()) {
			var6 = new class_kz(this.mcserver.a(var1.am));
		} else {
			var6 = new class_li(this.mcserver.a(var1.am));
		}

		class_lh var7 = new class_lh(this.mcserver, this.mcserver.a(var1.am), var1.cf(), (class_li) var6);
		var7.a = var1.a;
		var7.a((class_xa) var1, var3);
		var7.e(var1.getId());
		var7.o(var1);
		var7.a(var1.bR());
		WorldServer var8 = this.mcserver.a(var1.am);
		this.a(var7, var1, var8);
		BlockPosition var9;
		if (var4 != null) {
			var9 = class_xa.a(this.mcserver.a(var1.am), var4, var5);
			if (var9 != null) {
				var7.b((double) ((float) var9.getX() + 0.5F), (double) ((float) var9.getY() + 0.1F), (double) ((float) var9.getZ() + 0.5F), 0.0F, 0.0F);
				var7.a((BlockPosition) var4, var5);
			} else {
				var7.a.a((Packet<?>) (new PacketPlayOutGameStateChange(0, 0.0F)));
			}
		}

		var8.b.c((int) var7.s >> 4, (int) var7.u >> 4);

		while (!var8.a((class_pr) var7, (class_awf) var7.aT()).isEmpty() && var7.t < 256.0D) {
			var7.b(var7.s, var7.t + 1.0D, var7.u);
		}

		var7.a.a((Packet<?>) (new PacketPlayOutRespawn(var7.am, var7.o.ab(), var7.o.Q().u(), var7.c.b())));
		var9 = var8.N();
		var7.a.a(var7.s, var7.t, var7.u, var7.y, var7.z);
		var7.a.a((Packet<?>) (new PacketPlayOutSpawnPosition(var9)));
		var7.a.a((Packet<?>) (new PacketPlayOutExperience(var7.bK, var7.bJ, var7.bI)));
		this.b(var7, var8);
		var8.u().a(var7);
		var8.a((class_pr) var7);
		this.playerList.add(var7);
		this.playerMap.put(var7.aM(), var7);
		var7.g_();
		var7.i(var7.bo());
		return var7;
	}

	public void a(class_lh var1, int var2) {
		int var3 = var1.am;
		WorldServer var4 = this.mcserver.a(var1.am);
		var1.am = var2;
		WorldServer var5 = this.mcserver.a(var1.am);
		var1.a.a((Packet<?>) (new PacketPlayOutRespawn(var1.am, var1.o.ab(), var1.o.Q().u(), var1.c.b())));
		var4.f(var1);
		var1.I = false;
		this.a(var1, var3, var4, var5);
		this.a(var1, var4);
		var1.a.a(var1.s, var1.t, var1.u, var1.y, var1.z);
		var1.c.a(var5);
		this.b(var1, var5);
		this.f(var1);
		Iterator<?> var6 = var1.bm().iterator();

		while (var6.hasNext()) {
			class_pl var7 = (class_pl) var6.next();
			var1.a.a((Packet<?>) (new PacketPlayOutEntityEffect(var1.getId(), var7)));
		}

	}

	public void a(class_pr var1, int var2, WorldServer var3, WorldServer var4) {
		double var5 = var1.s;
		double var7 = var1.u;
		double var9 = 8.0D;
		float var11 = var1.y;
		var3.B.a("moving");
		if (var1.am == -1) {
			var5 = MathHelper.clamp(var5 / var9, var4.ag().b() + 16.0D, var4.ag().d() - 16.0D);
			var7 = MathHelper.clamp(var7 / var9, var4.ag().c() + 16.0D, var4.ag().e() - 16.0D);
			var1.b(var5, var1.t, var7, var1.y, var1.z);
			if (var1.ai()) {
				var3.a(var1, false);
			}
		} else if (var1.am == 0) {
			var5 = MathHelper.clamp(var5 * var9, var4.ag().b() + 16.0D, var4.ag().d() - 16.0D);
			var7 = MathHelper.clamp(var7 * var9, var4.ag().c() + 16.0D, var4.ag().e() - 16.0D);
			var1.b(var5, var1.t, var7, var1.y, var1.z);
			if (var1.ai()) {
				var3.a(var1, false);
			}
		} else {
			BlockPosition var12;
			if (var2 == 1) {
				var12 = var4.N();
			} else {
				var12 = var4.n();
			}

			var5 = (double) var12.getX();
			var1.t = (double) var12.getY();
			var7 = (double) var12.getZ();
			var1.b(var5, var1.t, var7, 90.0F, 0.0F);
			if (var1.ai()) {
				var3.a(var1, false);
			}
		}

		var3.B.b();
		if (var2 != 1) {
			var3.B.a("placing");
			var5 = (double) MathHelper.clamp((int) var5, -29999872, 29999872);
			var7 = (double) MathHelper.clamp((int) var7, -29999872, 29999872);
			if (var1.ai()) {
				var1.b(var5, var1.t, var7, var1.y, var1.z);
				var4.v().a(var1, var11);
				var4.a(var1);
				var4.a(var1, false);
			}

			var3.B.b();
		}

		var1.a((World) var4);
	}

	public void tick() {
		if (++this.pingUpdateCounter > 600) {
			this.a((Packet<?>) (new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.class_a_in_class_gz.c, this.playerList)));
			this.pingUpdateCounter = 0;
		}
	}

	public void a(Packet<?> var1) {
		for (int var2 = 0; var2 < this.playerList.size(); ++var2) {
			((class_lh) this.playerList.get(var2)).a.a(var1);
		}

	}

	public void a(Packet<?> var1, int var2) {
		for (int var3 = 0; var3 < this.playerList.size(); ++var3) {
			class_lh var4 = (class_lh) this.playerList.get(var3);
			if (var4.am == var2) {
				var4.a.a(var1);
			}
		}

	}

	public void a(class_xa var1, IChatBaseComponent var2) {
		class_awp var3 = var1.bP();
		if (var3 != null) {
			Collection<?> var4 = var3.d();
			Iterator<?> var5 = var4.iterator();

			while (var5.hasNext()) {
				String var6 = (String) var5.next();
				class_lh var7 = this.a(var6);
				if (var7 != null && var7 != var1) {
					var7.a(var2);
				}
			}

		}
	}

	public void b(class_xa var1, IChatBaseComponent var2) {
		class_awp var3 = var1.bP();
		if (var3 == null) {
			this.a(var2);
		} else {
			for (int var4 = 0; var4 < this.playerList.size(); ++var4) {
				class_lh var5 = (class_lh) this.playerList.get(var4);
				if (var5.bP() != var3) {
					var5.a(var2);
				}
			}

		}
	}

	public String b(boolean var1) {
		String var2 = "";
		ArrayList<class_lh> var3 = Lists.newArrayList((Iterable<class_lh>) this.playerList);

		for (int var4 = 0; var4 < var3.size(); ++var4) {
			if (var4 > 0) {
				var2 = var2 + ", ";
			}

			var2 = var2 + ((class_lh) var3.get(var4)).e_();
			if (var1) {
				var2 = var2 + " (" + ((class_lh) var3.get(var4)).aM().toString() + ")";
			}
		}

		return var2;
	}

	public String[] f() {
		String[] var1 = new String[this.playerList.size()];

		for (int var2 = 0; var2 < this.playerList.size(); ++var2) {
			var1[var2] = ((class_lh) this.playerList.get(var2)).e_();
		}

		return var1;
	}

	public GameProfile[] g() {
		GameProfile[] var1 = new GameProfile[this.playerList.size()];

		for (int var2 = 0; var2 < this.playerList.size(); ++var2) {
			var1[var2] = ((class_lh) this.playerList.get(var2)).cf();
		}

		return var1;
	}

	public GameProfileBanList h() {
		return this.gameProfileBanList;
	}

	public IpBanList i() {
		return this.ipBanList;
	}

	public void a(GameProfile var1) {
		int var2 = this.mcserver.p();
		this.opList.a((class_mc) (new class_mb(var1, this.mcserver.p(), this.opList.b(var1))));
		this.b(this.getPlayer(var1.getId()), var2);
	}

	public void b(GameProfile var1) {
		this.opList.c(var1);
		this.b(this.getPlayer(var1.getId()), 0);
	}

	private void b(class_lh var1, int var2) {
		if (var1 != null && var1.a != null) {
			byte var3 = var2 <= 0 ? 24 : (var2 >= 4 ? 28 : (byte) (24 + var2));
			var1.a.a((Packet<?>) (new PacketPlayOutEntityStatus(var1, var3)));
		}

	}

	public boolean e(GameProfile var1) {
		return !this.hasWhitelist || this.opList.d(var1) || this.whiteList.d(var1);
	}

	public boolean h(GameProfile var1) {
		return this.opList.d(var1) || this.mcserver.isLocal() && this.mcserver.d[0].Q().v() && this.mcserver.S().equalsIgnoreCase(var1.getName()) || this.isEveryoneOP;
	}

	public class_lh a(String var1) {
		Iterator<class_lh> var2 = this.playerList.iterator();

		class_lh var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (class_lh) var2.next();
		} while (!var3.e_().equalsIgnoreCase(var1));

		return var3;
	}

	public void a(double var1, double var3, double var5, double var7, int var9, Packet<?> var10) {
		this.a((class_xa) null, var1, var3, var5, var7, var9, var10);
	}

	public void a(class_xa var1, double var2, double var4, double var6, double var8, int var10, Packet<?> var11) {
		for (int var12 = 0; var12 < this.playerList.size(); ++var12) {
			class_lh var13 = (class_lh) this.playerList.get(var12);
			if (var13 != var1 && var13.am == var10) {
				double var14 = var2 - var13.s;
				double var16 = var4 - var13.t;
				double var18 = var6 - var13.u;
				if (var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
					var13.a.a(var11);
				}
			}
		}

	}

	public void j() {
		for (int var1 = 0; var1 < this.playerList.size(); ++var1) {
			this.b((class_lh) this.playerList.get(var1));
		}

	}

	public void d(GameProfile var1) {
		this.whiteList.a((class_mc) (new class_mh(var1)));
	}

	public void c(GameProfile var1) {
		this.whiteList.c(var1);
	}

	public WhiteList k() {
		return this.whiteList;
	}

	public String[] l() {
		return this.whiteList.a();
	}

	public OpList m() {
		return this.opList;
	}

	public String[] n() {
		return this.opList.a();
	}

	public void a() {
	}

	public void b(class_lh var1, WorldServer var2) {
		class_aoe var3 = this.mcserver.d[0].ag();
		var1.a.a((Packet<?>) (new PacketPlayOutWorldBorder(var3, PacketPlayOutWorldBorder.class_a_in_class_hg.d)));
		var1.a.a((Packet<?>) (new PacketPlayOutUpdateTime(var2.L(), var2.M(), var2.R().b("doDaylightCycle"))));
		if (var2.T()) {
			var1.a.a((Packet<?>) (new PacketPlayOutGameStateChange(1, 0.0F)));
			var1.a.a((Packet<?>) (new PacketPlayOutGameStateChange(7, var2.j(1.0F))));
			var1.a.a((Packet<?>) (new PacketPlayOutGameStateChange(8, var2.h(1.0F))));
		}

	}

	public void f(class_lh var1) {
		var1.a(var1.bq);
		var1.r();
		var1.a.a((Packet<?>) (new PacketPlayOutHeldItemSlot(var1.bp.d)));
	}

	public int getOnlinePlayers() {
		return this.playerList.size();
	}

	public int getMaxPlayers() {
		return this.maxPlayers;
	}

	public String[] q() {
		return this.mcserver.d[0].P().e().f();
	}

	public boolean hasWhitelist() {
		return this.hasWhitelist;
	}

	public void setHasWhitelist(boolean has) {
		this.hasWhitelist = has;
	}

	public List<class_lh> b(String var1) {
		ArrayList<class_lh> var2 = Lists.newArrayList();
		Iterator<class_lh> var3 = this.playerList.iterator();

		while (var3.hasNext()) {
			class_lh var4 = (class_lh) var3.next();
			if (var4.w().equals(var1)) {
				var2.add(var4);
			}
		}

		return var2;
	}

	public int getViewDistance() {
		return this.viewDistance;
	}

	public MinecraftServer getMinecraftServer() {
		return this.mcserver;
	}

	public NBTTagCompound t() {
		return null;
	}

	private void a(class_lh var1, class_lh var2, World var3) {
		if (var2 != null) {
			var1.c.a(var2.c.b());
		} else if (this.defaultGameMode != null) {
			var1.c.a(this.defaultGameMode);
		}

		var1.c.b(var3.Q().r());
	}

	public void u() {
		for (int var1 = 0; var1 < this.playerList.size(); ++var1) {
			((class_lh) this.playerList.get(var1)).a.c("Server closed");
		}

	}

	public void a(IChatBaseComponent var1, boolean var2) {
		this.mcserver.a(var1);
		int var3 = var2 ? 1 : 0;
		this.a((Packet<?>) (new PacketPlayOutChat(var1, (byte) var3)));
	}

	public void a(IChatBaseComponent var1) {
		this.a(var1, true);
	}

	public ServerStatisticManager a(class_xa var1) {
		UUID var2 = var1.aM();
		ServerStatisticManager var3 = var2 == null ? null : (ServerStatisticManager) this.stats.get(var2);
		if (var3 == null) {
			File var4 = new File(this.mcserver.a(0).P().b(), "stats");
			File var5 = new File(var4, var2.toString() + ".json");
			if (!var5.exists()) {
				File var6 = new File(var4, var1.e_() + ".json");
				if (var6.exists() && var6.isFile()) {
					var6.renameTo(var5);
				}
			}

			var3 = new ServerStatisticManager(this.mcserver, var5);
			var3.a();
			this.stats.put(var2, var3);
		}

		return var3;
	}

	public void a(int var1) {
		this.viewDistance = var1;
		if (this.mcserver.d != null) {
			WorldServer[] var2 = this.mcserver.d;
			int var3 = var2.length;

			for (int var4 = 0; var4 < var3; ++var4) {
				WorldServer var5 = var2[var4];
				if (var5 != null) {
					var5.u().a(var1);
				}
			}

		}
	}

	public List<class_lh> v() {
		return this.playerList;
	}

	public class_lh getPlayer(UUID var1) {
		return (class_lh) this.playerMap.get(var1);
	}

	public boolean f(GameProfile var1) {
		return false;
	}
}