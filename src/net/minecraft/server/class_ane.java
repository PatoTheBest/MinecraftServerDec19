package net.minecraft.server;

import java.util.List;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_ahi;
import net.minecraft.server.class_ahw;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_anf;
import net.minecraft.server.class_ang;
import net.minecraft.server.class_anh;
import net.minecraft.server.class_ani;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anw;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_zu;

public class class_ane extends class_ahi {
   public static final class_anw a = class_anw.a("extended");
   private final boolean N;

   public class_ane(boolean var1) {
      super(class_atk.H);
      this.j(this.M.b().a(b, class_cq.c).a(a, Boolean.valueOf(false)));
      this.N = var1;
      this.a(i);
      this.c(0.5F);
      this.a(class_zu.d);
   }

   public boolean c() {
      return false;
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, class_qa var4, class_aas var5) {
      var1.a((class_cj)var2, (class_anl)var3.a(b, a(var1, var2, var4)), 2);
      if(!var1.D) {
         this.e(var1, var2, var3);
      }

   }

   public void a(class_aen var1, class_cj var2, class_anl var3, class_agj var4) {
      if(!var1.D) {
         this.e(var1, var2, var3);
      }

   }

   public void c(class_aen var1, class_cj var2, class_anl var3) {
      if(!var1.D && var1.s(var2) == null) {
         this.e(var1, var2, var3);
      }

   }

   public class_anl a(class_aen var1, class_cj var2, class_cq var3, float var4, float var5, float var6, int var7, class_qa var8) {
      return this.S().a(b, a(var1, var2, var8)).a(a, Boolean.valueOf(false));
   }

   private void e(class_aen var1, class_cj var2, class_anl var3) {
      class_cq var4 = (class_cq)var3.b(b);
      boolean var5 = this.a(var1, var2, var4);
      if(var5 && !((Boolean)var3.b(a)).booleanValue()) {
         if((new class_ani(var1, var2, var4, true)).a()) {
            var1.c(var2, this, 0, var4.a());
         }
      } else if(!var5 && ((Boolean)var3.b(a)).booleanValue()) {
         var1.a((class_cj)var2, (class_anl)var3.a(a, Boolean.valueOf(false)), 2);
         var1.c(var2, this, 1, var4.a());
      }

   }

   private boolean a(class_aen var1, class_cj var2, class_cq var3) {
      class_cq[] var4 = class_cq.values();
      int var5 = var4.length;

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         class_cq var7 = var4[var6];
         if(var7 != var3 && var1.b(var2.a(var7), var7)) {
            return true;
         }
      }

      if(var1.b(var2, class_cq.a)) {
         return true;
      } else {
         class_cj var9 = var2.a();
         class_cq[] var10 = class_cq.values();
         var6 = var10.length;

         for(int var11 = 0; var11 < var6; ++var11) {
            class_cq var8 = var10[var11];
            if(var8 != class_cq.a && var1.b(var9.a(var8), var8)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean a(class_aen var1, class_cj var2, class_anl var3, int var4, int var5) {
      class_cq var6 = (class_cq)var3.b(b);
      if(!var1.D) {
         boolean var7 = this.a(var1, var2, var6);
         if(var7 && var4 == 1) {
            var1.a((class_cj)var2, (class_anl)var3.a(a, Boolean.valueOf(true)), 2);
            return false;
         }

         if(!var7 && var4 == 0) {
            return false;
         }
      }

      if(var4 == 0) {
         if(!this.a(var1, var2, var6, true)) {
            return false;
         }

         var1.a((class_cj)var2, (class_anl)var3.a(a, Boolean.valueOf(true)), 2);
         var1.a((double)var2.n() + 0.5D, (double)var2.o() + 0.5D, (double)var2.p() + 0.5D, "tile.piston.out", 0.5F, var1.s.nextFloat() * 0.25F + 0.6F);
      } else if(var4 == 1) {
         class_amg var13 = var1.s(var2.a(var6));
         if(var13 instanceof class_ang) {
            ((class_ang)var13).h();
         }

         var1.a((class_cj)var2, (class_anl)class_agk.M.S().a(class_anh.a, var6).a(class_anh.b, this.N?class_anf.class_a_in_class_anf.b:class_anf.class_a_in_class_anf.a), 3);
         var1.a(var2, class_anh.a(this.a(var5), var6, false, true));
         if(this.N) {
            class_cj var8 = var2.a(var6.g() * 2, var6.h() * 2, var6.i() * 2);
            class_agj var9 = var1.p(var8).c();
            boolean var10 = false;
            if(var9 == class_agk.M) {
               class_amg var11 = var1.s(var8);
               if(var11 instanceof class_ang) {
                  class_ang var12 = (class_ang)var11;
                  if(var12.e() == var6 && var12.d()) {
                     var12.h();
                     var10 = true;
                  }
               }
            }

            if(!var10 && var9.v() != class_atk.a && a(var9, var1, var8, var6.d(), false) && (var9.k() == 0 || var9 == class_agk.J || var9 == class_agk.F)) {
               this.a(var1, var2, var6, false);
            }
         } else {
            var1.g(var2.a(var6));
         }

         var1.a((double)var2.n() + 0.5D, (double)var2.o() + 0.5D, (double)var2.p() + 0.5D, "tile.piston.in", 0.5F, var1.s.nextFloat() * 0.15F + 0.6F);
      }

      return true;
   }

   public void a(class_aer var1, class_cj var2) {
      class_anl var3 = var1.p(var2);
      if(var3.c() == this && ((Boolean)var3.b(a)).booleanValue()) {
         float var4 = 0.25F;
         class_cq var5 = (class_cq)var3.b(b);
         if(var5 != null) {
            switch(class_ane.SyntheticClass_1.a[var5.ordinal()]) {
            case 1:
               this.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
               break;
            case 2:
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
               break;
            case 3:
               this.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
               break;
            case 4:
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
               break;
            case 5:
               this.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
               break;
            case 6:
               this.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
            }
         }
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void j() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, class_awf var4, List var5, class_pr var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public class_awf a(class_aen var1, class_cj var2, class_anl var3) {
      this.a((class_aer)var1, (class_cj)var2);
      return super.a(var1, var2, var3);
   }

   public boolean d() {
      return false;
   }

   public static class_cq b(int var0) {
      int var1 = var0 & 7;
      return var1 > 5?null:class_cq.a(var1);
   }

   public static class_cq a(class_aen var0, class_cj var1, class_qa var2) {
      if(class_nu.e((float)var2.s - (float)var1.n()) < 2.0F && class_nu.e((float)var2.u - (float)var1.p()) < 2.0F) {
         double var3 = var2.t + (double)var2.aU();
         if(var3 - (double)var1.o() > 2.0D) {
            return class_cq.b;
         }

         if((double)var1.o() - var3 > 0.0D) {
            return class_cq.a;
         }
      }

      return var2.aR().d();
   }

   public static boolean a(class_agj var0, class_aen var1, class_cj var2, class_cq var3, boolean var4) {
      if(var0 == class_agk.Z) {
         return false;
      } else if(!var1.ag().a(var2)) {
         return false;
      } else if(var2.o() < 0 || var3 == class_cq.a && var2.o() == 0) {
         return false;
      } else if(var2.o() <= var1.V() - 1 && (var3 != class_cq.b || var2.o() != var1.V() - 1)) {
         if(var0 != class_agk.J && var0 != class_agk.F) {
            if(var0.g(var1, var2) == -1.0F) {
               return false;
            }

            if(var0.k() == 2) {
               return false;
            }

            if(var0.k() == 1) {
               if(!var4) {
                  return false;
               }

               return true;
            }
         } else if(((Boolean)var1.p(var2).b(a)).booleanValue()) {
            return false;
         }

         return !(var0 instanceof class_ahw);
      } else {
         return false;
      }
   }

   private boolean a(class_aen var1, class_cj var2, class_cq var3, boolean var4) {
      if(!var4) {
         var1.g(var2.a(var3));
      }

      class_ani var5 = new class_ani(var1, var2, var3, var4);
      List var6 = var5.c();
      List var7 = var5.d();
      if(!var5.a()) {
         return false;
      } else {
         int var8 = var6.size() + var7.size();
         class_agj[] var9 = new class_agj[var8];
         class_cq var10 = var4?var3:var3.d();

         int var11;
         class_cj var12;
         for(var11 = var7.size() - 1; var11 >= 0; --var11) {
            var12 = (class_cj)var7.get(var11);
            class_agj var13 = var1.p(var12).c();
            var13.b(var1, var12, var1.p(var12), 0);
            var1.g(var12);
            --var8;
            var9[var8] = var13;
         }

         class_anl var18;
         for(var11 = var6.size() - 1; var11 >= 0; --var11) {
            var12 = (class_cj)var6.get(var11);
            var18 = var1.p(var12);
            class_agj var14 = var18.c();
            var14.c(var18);
            var1.g(var12);
            var12 = var12.a(var10);
            var1.a((class_cj)var12, (class_anl)class_agk.M.S().a(b, var3), 4);
            var1.a(var12, class_anh.a(var18, var3, var4, false));
            --var8;
            var9[var8] = var14;
         }

         class_cj var16 = var2.a(var3);
         if(var4) {
            class_anf.class_a_in_class_anf var17 = this.N?class_anf.class_a_in_class_anf.b:class_anf.class_a_in_class_anf.a;
            var18 = class_agk.K.S().a(class_anf.b, var3).a(class_anf.a, var17);
            class_anl var20 = class_agk.M.S().a(class_anh.a, var3).a(class_anh.b, this.N?class_anf.class_a_in_class_anf.b:class_anf.class_a_in_class_anf.a);
            var1.a((class_cj)var16, (class_anl)var20, 4);
            var1.a(var16, class_anh.a(var18, var3, true, false));
         }

         int var19;
         for(var19 = var7.size() - 1; var19 >= 0; --var19) {
            var1.c((class_cj)var7.get(var19), var9[var8++]);
         }

         for(var19 = var6.size() - 1; var19 >= 0; --var19) {
            var1.c((class_cj)var6.get(var19), var9[var8++]);
         }

         if(var4) {
            var1.c((class_cj)var16, (class_agj)class_agk.K);
            var1.c((class_cj)var2, (class_agj)this);
         }

         return true;
      }
   }

   public class_anl a(int var1) {
      return this.S().a(b, b(var1)).a(a, Boolean.valueOf((var1 & 8) > 0));
   }

   public int c(class_anl var1) {
      byte var2 = 0;
      int var3 = var2 | ((class_cq)var1.b(b)).a();
      if(((Boolean)var1.b(a)).booleanValue()) {
         var3 |= 8;
      }

      return var3;
   }

   public class_anl a(class_anl var1, class_agj.class_c_in_class_agj var2) {
      return var1.c() != this?var1:var1.a(b, var2.a((class_cq)var1.b(b)));
   }

   public class_anl a(class_anl var1, class_agj.class_a_in_class_agj var2) {
      return var1.c() != this?var1:this.a(var1, var2.a((class_cq)var1.b(b)));
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{b, a});
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] a = new int[class_cq.values().length];

      static {
         try {
            a[class_cq.a.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            a[class_cq.b.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            a[class_cq.c.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            a[class_cq.d.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            a[class_cq.e.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            a[class_cq.f.ordinal()] = 6;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}