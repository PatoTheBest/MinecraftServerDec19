package net.minecraft.server;

import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aee;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_ahz;
import net.minecraft.server.class_ajd;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_amv;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_awg;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_di;
import net.minecraft.server.class_nc;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_on;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_oq;
import net.minecraft.server.class_or;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_pt;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_qb;
import net.minecraft.server.class_qd;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_zu;

public class class_abt extends class_aar {
   public class_abt() {
      this.a(true);
      this.a(class_zu.f);
   }

   public String a(class_aas var1) {
      String var2 = ("" + class_di.a(this.a() + ".name")).trim();
      String var3 = class_pt.b(var1.i());
      if(var3 != null) {
         var2 = var2 + " " + class_di.a("entity." + var3 + ".name");
      }

      return var2;
   }

   public class_oq a(class_aas var1, class_xa var2, class_aen var3, class_cj var4, class_oo var5, class_cq var6, float var7, float var8, float var9) {
      if(var3.D) {
         return class_oq.a;
      } else if(!var2.a(var4.a(var6), var6, var1)) {
         return class_oq.b;
      } else {
         class_anl var10 = var3.p(var4);
         if(var10.c() == class_agk.ac) {
            class_amg var11 = var3.s(var4);
            if(var11 instanceof class_amv) {
               class_aee var12 = ((class_amv)var11).b();
               var12.a(class_pt.b(var1.i()));
               var11.p_();
               var3.h(var4);
               if(!var2.bH.d) {
                  --var1.b;
               }

               return class_oq.a;
            }
         }

         var4 = var4.a(var6);
         double var14 = 0.0D;
         if(var6 == class_cq.b && var10 instanceof class_ahz) {
            var14 = 0.5D;
         }

         class_pr var13 = a(var3, var1.i(), (double)var4.n() + 0.5D, (double)var4.o() + var14, (double)var4.p() + 0.5D);
         if(var13 != null) {
            if(var13 instanceof class_qa && var1.s()) {
               var13.a(var1.q());
            }

            if(!var2.bH.d) {
               --var1.b;
            }
         }

         return class_oq.a;
      }
   }

   public class_or a(class_aas var1, class_aen var2, class_xa var3, class_oo var4) {
      if(var2.D) {
         return new class_or(class_oq.b, var1);
      } else {
         class_awg var5 = this.a(var2, var3, true);
         if(var5 == null) {
            return new class_or(class_oq.b, var1);
         } else {
            if(var5.a == class_awg.class_a_in_class_awg.b) {
               class_cj var6 = var5.a();
               if(!var2.a(var3, var6)) {
                  return new class_or(class_oq.b, var1);
               }

               if(!var3.a(var6, var5.b, var1)) {
                  return new class_or(class_oq.b, var1);
               }

               if(var2.p(var6).c() instanceof class_ajd) {
                  class_pr var7 = a(var2, var1.i(), (double)var6.n() + 0.5D, (double)var6.o() + 0.5D, (double)var6.p() + 0.5D);
                  if(var7 != null) {
                     if(var7 instanceof class_qa && var1.s()) {
                        var7.a(var1.q());
                     }

                     if(!var3.bH.d) {
                        --var1.b;
                     }

                     var3.b(class_nc.ad[class_aar.b((class_aar)this)]);
                     return new class_or(class_oq.a, var1);
                  }
               }
            }

            return new class_or(class_oq.b, var1);
         }
      }
   }

   public static class_pr a(class_aen var0, int var1, double var2, double var4, double var6) {
      if(!class_pt.a.containsKey(Integer.valueOf(var1))) {
         return null;
      } else {
         class_pr var8 = null;

         for(int var9 = 0; var9 < 1; ++var9) {
            var8 = class_pt.a(var1, var0);
            if(var8 instanceof class_qa) {
               class_qb var10 = (class_qb)var8;
               var8.b(var2, var4, var6, class_nu.g(var0.s.nextFloat() * 360.0F), 0.0F);
               var10.aN = var10.y;
               var10.aL = var10.y;
               var10.a((class_on)var0.E(new class_cj(var10)), (class_qd)null);
               var0.a(var8);
               var10.z();
            }
         }

         return var8;
      }
   }
}