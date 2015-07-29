package net.minecraft.server;

import net.minecraft.server.EnumChatFormat;
import net.minecraft.server.MaterialMapColor;
import net.minecraft.server.INamable;

public enum class_zy implements INamable {
    a(0, 15, "white", "white", MaterialMapColor.j, EnumChatFormat.WHITE),
    b(1, 14, "orange", "orange", MaterialMapColor.q, EnumChatFormat.GOLD),
    c(2, 13, "magenta", "magenta", MaterialMapColor.r, EnumChatFormat.AQUA),
    d(3, 12, "light_blue", "lightBlue", MaterialMapColor.s, EnumChatFormat.BLUE),
    e(4, 11, "yellow", "yellow", MaterialMapColor.t, EnumChatFormat.YELLOW),
    f(5, 10, "lime", "lime", MaterialMapColor.u, EnumChatFormat.GREEN),
    g(6, 9, "pink", "pink", MaterialMapColor.v, EnumChatFormat.LIGHT_PURPLE),
    h(7, 8, "gray", "gray", MaterialMapColor.w, EnumChatFormat.DARK_GRAY),
    i(8, 7, "silver", "silver", MaterialMapColor.x, EnumChatFormat.GRAY),
    j(9, 6, "cyan", "cyan", MaterialMapColor.y, EnumChatFormat.DARK_AQUA),
    k(10, 5, "purple", "purple", MaterialMapColor.z, EnumChatFormat.DARK_PURPLE),
    l(11, 4, "blue", "blue", MaterialMapColor.A, EnumChatFormat.DARK_BLUE),
    m(12, 3, "brown", "brown", MaterialMapColor.B, EnumChatFormat.GOLD),
    n(13, 2, "green", "green", MaterialMapColor.C, EnumChatFormat.DARK_GREEN),
    o(14, 1, "red", "red", MaterialMapColor.D, EnumChatFormat.DARK_RED),
    p(15, 0, "black", "black", MaterialMapColor.E, EnumChatFormat.BLACK);

   private static final class_zy[] q;
   private static final class_zy[] r;
   private final int s;
   private final int t;
   private final String u;
   private final String v;
   private final MaterialMapColor w;
   private final EnumChatFormat x;

   private class_zy(int var3, int var4, String var5, String var6, MaterialMapColor var7, EnumChatFormat var8) {
      this.s = var3;
      this.t = var4;
      this.u = var5;
      this.v = var6;
      this.w = var7;
      this.x = var8;
   }

   public int a() {
      return this.s;
   }

   public int b() {
      return this.t;
   }

   public String d() {
      return this.v;
   }

   public MaterialMapColor e() {
      return this.w;
   }

   public static class_zy a(int var0) {
      if(var0 < 0 || var0 >= r.length) {
         var0 = 0;
      }

      return r[var0];
   }

   public static class_zy b(int var0) {
      if(var0 < 0 || var0 >= q.length) {
         var0 = 0;
      }

      return q[var0];
   }

   public String toString() {
      return this.v;
   }

   public String getName() {
      return this.u;
   }

   static {
      q = new class_zy[values().length];
      r = new class_zy[values().length];
      class_zy[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         class_zy var3 = var0[var2];
         q[var3.a()] = var3;
         r[var3.b()] = var3;
      }

   }
}
