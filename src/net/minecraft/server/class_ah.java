package net.minecraft.server;

import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_aeq;
import net.minecraft.server.class_bz;
import net.minecraft.server.class_cb;
import net.minecraft.server.class_cf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_eu;
import net.minecraft.server.class_fb;
import net.minecraft.server.class_i;
import net.minecraft.server.class_lh;
import net.minecraft.server.class_m;

public class class_ah extends class_i {
   public String c() {
      return "gamemode";
   }

   public int a() {
      return 2;
   }

   public String c(class_m var1) {
      return "commands.gamemode.usage";
   }

   public void a(class_m var1, String[] var2) throws class_bz {
      if(var2.length <= 0) {
         throw new class_cf("commands.gamemode.usage", new Object[0]);
      } else {
         class_aeq.class_a_in_class_aeq var3 = this.h(var1, var2[0]);
         class_lh var4 = var2.length >= 2?a(var1, var2[1]):b(var1);
         var4.a(var3);
         var4.O = 0.0F;
         if(var1.e().R().b("sendCommandFeedback")) {
            var4.a((class_eu)(new class_fb("gameMode.changed", new Object[0])));
         }

         class_fb var5 = new class_fb("gameMode." + var3.b(), new Object[0]);
         if(var4 != var1) {
            a(var1, this, 1, "commands.gamemode.success.other", new Object[]{var4.e_(), var5});
         } else {
            a(var1, this, 1, "commands.gamemode.success.self", new Object[]{var5});
         }

      }
   }

   protected class_aeq.class_a_in_class_aeq h(class_m var1, String var2) throws class_cb {
      return !var2.equalsIgnoreCase(class_aeq.class_a_in_class_aeq.b.b()) && !var2.equalsIgnoreCase("s")?(!var2.equalsIgnoreCase(class_aeq.class_a_in_class_aeq.c.b()) && !var2.equalsIgnoreCase("c")?(!var2.equalsIgnoreCase(class_aeq.class_a_in_class_aeq.d.b()) && !var2.equalsIgnoreCase("a")?(!var2.equalsIgnoreCase(class_aeq.class_a_in_class_aeq.e.b()) && !var2.equalsIgnoreCase("sp")?class_aeq.a(a(var2, 0, class_aeq.class_a_in_class_aeq.values().length - 2)):class_aeq.class_a_in_class_aeq.e):class_aeq.class_a_in_class_aeq.d):class_aeq.class_a_in_class_aeq.c):class_aeq.class_a_in_class_aeq.b;
   }

   public List a(class_m var1, String[] var2, class_cj var3) {
      return var2.length == 1?a(var2, new String[]{"survival", "creative", "adventure", "spectator"}):(var2.length == 2?a(var2, this.d()):null);
   }

   protected String[] d() {
      return MinecraftServer.N().K();
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 1;
   }
}