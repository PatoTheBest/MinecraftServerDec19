package net.minecraft.server;

import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_awh;
import net.minecraft.server.class_bz;
import net.minecraft.server.class_cf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_eu;
import net.minecraft.server.class_i;
import net.minecraft.server.class_l;
import net.minecraft.server.class_m;
import net.minecraft.server.class_n;
import net.minecraft.server.class_pr;

public class class_ad extends class_i {
   public String c() {
      return "execute";
   }

   public int a() {
      return 2;
   }

   public String c(class_m var1) {
      return "commands.execute.usage";
   }

   public void a(final class_m var1, String[] var2) throws class_bz {
      if(var2.length < 5) {
         throw new class_cf("commands.execute.usage", new Object[0]);
      } else {
         final class_pr var3 = a(var1, var2[0], class_pr.class);
         final double var4 = b(var3.s, var2[1], false);
         final double var6 = b(var3.t, var2[2], false);
         final double var8 = b(var3.u, var2[3], false);
         final class_cj var10 = new class_cj(var4, var6, var8);
         byte var11 = 4;
         if("detect".equals(var2[4]) && var2.length > 10) {
            class_aen var12 = var3.e();
            double var13 = b(var4, var2[5], false);
            double var15 = b(var6, var2[6], false);
            double var17 = b(var8, var2[7], false);
            class_agj var19 = g(var1, var2[8]);
            int var20 = a(var2[9], -1, 15);
            class_cj var21 = new class_cj(var13, var15, var17);
            class_anl var22 = var12.p(var21);
            if(var22.c() != var19 || var20 >= 0 && var22.c().c(var22) != var20) {
               throw new class_bz("commands.execute.failed", new Object[]{"detect", var3.e_()});
            }

            var11 = 10;
         }

         String var24 = a(var2, var11);
         class_m var14 = new class_m() {
            public String e_() {
               return var3.e_();
            }

            public class_eu f_() {
               return var3.f_();
            }

            public void a(class_eu var1x) {
               var1.a(var1x);
            }

            public boolean a(int var1x, String var2) {
               return var1.a(var1x, var2);
            }

            public class_cj c() {
               return var10;
            }

            public class_awh d() {
               return new class_awh(var4, var6, var8);
            }

            public class_aen e() {
               return var3.o;
            }

            public class_pr f() {
               return var3;
            }

            public boolean u_() {
               MinecraftServer var1x = MinecraftServer.N();
               return var1x == null || var1x.d[0].R().b("commandBlockOutput");
            }

            public void a(class_n.class_a_in_class_n var1x, int var2) {
               var3.a(var1x, var2);
            }
         };
         class_l var25 = MinecraftServer.N().P();

         try {
            int var16 = var25.a(var14, var24);
            if(var16 < 1) {
               throw new class_bz("commands.execute.allInvocationsFailed", new Object[]{var24});
            }
         } catch (Throwable var23) {
            throw new class_bz("commands.execute.failed", new Object[]{var24, var3.e_()});
         }
      }
   }

   public List a(class_m var1, String[] var2, class_cj var3) {
      return var2.length == 1?a(var2, MinecraftServer.N().K()):(var2.length > 1 && var2.length <= 4?a(var2, 1, var3):(var2.length > 5 && var2.length <= 8 && "detect".equals(var2[4])?a(var2, 5, var3):(var2.length == 9 && "detect".equals(var2[4])?a(var2, class_agj.c.c()):null)));
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 0;
   }
}