package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.class_agd;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_ane;
import net.minecraft.server.class_anf;
import net.minecraft.server.class_ang;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anx;
import net.minecraft.server.class_any;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_awg;
import net.minecraft.server.class_awh;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_xa;

public class class_anh extends class_agd {
   public static final class_anx a;
   public static final class_any b;

   public class_anh() {
      super(class_atk.H);
      this.j(this.M.b().a(a, class_cq.c).a(b, class_anf.class_a_in_class_anf.a));
      this.c(-1.0F);
   }

   public class_amg a(class_aen var1, int var2) {
      return null;
   }

   public static class_amg a(class_anl var0, class_cq var1, boolean var2, boolean var3) {
      return new class_ang(var0, var1, var2, var3);
   }

   public void b(class_aen var1, class_cj var2, class_anl var3) {
      class_amg var4 = var1.s(var2);
      if(var4 instanceof class_ang) {
         ((class_ang)var4).h();
      } else {
         super.b(var1, var2, var3);
      }

   }

   public boolean d(class_aen var1, class_cj var2) {
      return false;
   }

   public boolean b(class_aen var1, class_cj var2, class_cq var3) {
      return false;
   }

   public void d(class_aen var1, class_cj var2, class_anl var3) {
      class_cj var4 = var2.a(((class_cq)var3.b(a)).d());
      class_anl var5 = var1.p(var4);
      if(var5.c() instanceof class_ane && ((Boolean)var5.b(class_ane.a)).booleanValue()) {
         var1.g(var4);
      }

   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean a(class_aen var1, class_cj var2, class_anl var3, class_xa var4, class_oo var5, class_aas var6, class_cq var7, float var8, float var9, float var10) {
      if(!var1.D && var1.s(var2) == null) {
         var1.g(var2);
         return true;
      } else {
         return false;
      }
   }

   public class_aar a(class_anl var1, Random var2, int var3) {
      return null;
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, float var4, int var5) {
      if(!var1.D) {
         class_ang var6 = this.e((class_aer) var1, var2);
         if(var6 != null) {
            class_anl var7 = var6.b();
            var7.c().b(var1, var2, var7, 0);
         }
      }
   }

   public class_awg a(class_aen var1, class_cj var2, class_awh var3, class_awh var4) {
      return null;
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, class_agj var4) {
      if(!var1.D) {
         var1.s(var2);
      }

   }

   public class_awf a(class_aen var1, class_cj var2, class_anl var3) {
      class_ang var4 = this.e((class_aer) var1, var2);
      if(var4 == null) {
         return null;
      } else {
         float var5 = var4.a(0.0F);
         if(var4.d()) {
            var5 = 1.0F - var5;
         }

         return this.a(var1, var2, var4.b(), var5, var4.e());
      }
   }

   public void a(class_aer var1, class_cj var2) {
      class_ang var3 = this.e(var1, var2);
      if(var3 != null) {
         class_anl var4 = var3.b();
         class_agj var5 = var4.c();
         if(var5 == this || var5.v() == class_atk.a) {
            return;
         }

         float var6 = var3.a(0.0F);
         if(var3.d()) {
            var6 = 1.0F - var6;
         }

         var5.a(var1, var2);
         if(var5 == class_agk.J || var5 == class_agk.F) {
            var6 = 0.0F;
         }

         class_cq var7 = var3.e();
         this.B = var5.D() - (double)((float)var7.g() * var6);
         this.C = var5.F() - (double)((float)var7.h() * var6);
         this.D = var5.H() - (double)((float)var7.i() * var6);
         this.E = var5.E() - (double)((float)var7.g() * var6);
         this.F = var5.G() - (double)((float)var7.h() * var6);
         this.G = var5.I() - (double)((float)var7.i() * var6);
      }

   }

   public class_awf a(class_aen var1, class_cj var2, class_anl var3, float var4, class_cq var5) {
      if(var3.c() != this && var3.c().v() != class_atk.a) {
         class_awf var6 = var3.c().a(var1, var2, var3);
         if(var6 == null) {
            return null;
         } else {
            double var7 = var6.a;
            double var9 = var6.b;
            double var11 = var6.c;
            double var13 = var6.d;
            double var15 = var6.e;
            double var17 = var6.f;
            if(var5.g() < 0) {
               var7 -= (double)((float)var5.g() * var4);
            } else {
               var13 -= (double)((float)var5.g() * var4);
            }

            if(var5.h() < 0) {
               var9 -= (double)((float)var5.h() * var4);
            } else {
               var15 -= (double)((float)var5.h() * var4);
            }

            if(var5.i() < 0) {
               var11 -= (double)((float)var5.i() * var4);
            } else {
               var17 -= (double)((float)var5.i() * var4);
            }

            return new class_awf(var7, var9, var11, var13, var15, var17);
         }
      } else {
         return null;
      }
   }

   private class_ang e(class_aer var1, class_cj var2) {
      class_amg var3 = var1.s(var2);
      return var3 instanceof class_ang?(class_ang)var3:null;
   }

   public class_anl a(int var1) {
      return this.S().a(a, class_anf.b(var1)).a(b, (var1 & 8) > 0?class_anf.class_a_in_class_anf.b:class_anf.class_a_in_class_anf.a);
   }

   public class_anl a(class_anl var1, class_agj.class_c_in_class_agj var2) {
      return var1.c() != this?var1:var1.a(a, var2.a((class_cq)var1.b(a)));
   }

   public class_anl a(class_anl var1, class_agj.class_a_in_class_agj var2) {
      return var1.c() != this?var1:this.a(var1, var2.a((class_cq)var1.b(a)));
   }

   public int c(class_anl var1) {
      byte var2 = 0;
      int var3 = var2 | ((class_cq)var1.b(a)).a();
      if(var1.b(b) == class_anf.class_a_in_class_anf.b) {
         var3 |= 8;
      }

      return var3;
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{a, b});
   }

   static {
      a = class_anf.b;
      b = class_anf.a;
   }
}