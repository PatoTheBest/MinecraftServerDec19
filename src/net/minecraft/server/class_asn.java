package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_ahk;
import net.minecraft.server.class_ahl;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_ami;
import net.minecraft.server.class_amm;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_arw;
import net.minecraft.server.class_asl;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_df;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_eb;
import net.minecraft.server.class_od;
import net.minecraft.server.class_oj;

public abstract class class_asn {
   protected class_arw l;
   private class_cq a;
   private class_agj.class_a_in_class_agj b;
   private class_agj.class_c_in_class_agj c;
   protected int m;

   public class_asn() {
   }

   protected class_asn(int var1) {
      this.m = var1;
   }

   public final class_dn b() {
      class_dn var1 = new class_dn();
      var1.a("id", class_asl.a(this));
      var1.a((String)"BB", (class_eb)this.l.g());
      class_cq var2 = this.e();
      var1.a("O", var2 == null?-1:var2.b());
      var1.a("GD", this.m);
      this.a(var1);
      return var1;
   }

   protected abstract void a(class_dn var1);

   public void a(class_aen var1, class_dn var2) {
      if(var2.d("BB")) {
         this.l = new class_arw(var2.m("BB"));
      }

      int var3 = var2.g("O");
      this.a(var3 == -1?null:class_cq.b(var3));
      this.m = var2.g("GD");
      this.b(var2);
   }

   protected abstract void b(class_dn var1);

   public void a(class_asn var1, List var2, Random var3) {
   }

   public abstract boolean a(class_aen var1, Random var2, class_arw var3);

   public class_arw c() {
      return this.l;
   }

   public int d() {
      return this.m;
   }

   public static class_asn a(List var0, class_arw var1) {
      Iterator var2 = var0.iterator();

      class_asn var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (class_asn)var2.next();
      } while(var3.c() == null || !var3.c().a(var1));

      return var3;
   }

   public class_cj a() {
      return new class_cj(this.l.f());
   }

   protected boolean a(class_aen var1, class_arw var2) {
      int var3 = Math.max(this.l.a - 1, var2.a);
      int var4 = Math.max(this.l.b - 1, var2.b);
      int var5 = Math.max(this.l.c - 1, var2.c);
      int var6 = Math.min(this.l.d + 1, var2.d);
      int var7 = Math.min(this.l.e + 1, var2.e);
      int var8 = Math.min(this.l.f + 1, var2.f);
      class_cj.class_a_in_class_cj var9 = new class_cj.class_a_in_class_cj();

      int var10;
      int var11;
      for(var10 = var3; var10 <= var6; ++var10) {
         for(var11 = var5; var11 <= var8; ++var11) {
            if(var1.p(var9.c(var10, var4, var11)).c().v().d()) {
               return true;
            }

            if(var1.p(var9.c(var10, var7, var11)).c().v().d()) {
               return true;
            }
         }
      }

      for(var10 = var3; var10 <= var6; ++var10) {
         for(var11 = var4; var11 <= var7; ++var11) {
            if(var1.p(var9.c(var10, var11, var5)).c().v().d()) {
               return true;
            }

            if(var1.p(var9.c(var10, var11, var8)).c().v().d()) {
               return true;
            }
         }
      }

      for(var10 = var5; var10 <= var8; ++var10) {
         for(var11 = var4; var11 <= var7; ++var11) {
            if(var1.p(var9.c(var3, var11, var10)).c().v().d()) {
               return true;
            }

            if(var1.p(var9.c(var6, var11, var10)).c().v().d()) {
               return true;
            }
         }
      }

      return false;
   }

   protected int a(int var1, int var2) {
      class_cq var3 = this.e();
      if(var3 == null) {
         return var1;
      } else {
         switch(class_asn.SyntheticClass_1.a[var3.ordinal()]) {
         case 1:
         case 2:
            return this.l.a + var1;
         case 3:
            return this.l.d - var2;
         case 4:
            return this.l.a + var2;
         default:
            return var1;
         }
      }
   }

   protected int d(int var1) {
      return this.e() == null?var1:var1 + this.l.b;
   }

   protected int b(int var1, int var2) {
      class_cq var3 = this.e();
      if(var3 == null) {
         return var2;
      } else {
         switch(class_asn.SyntheticClass_1.a[var3.ordinal()]) {
         case 1:
            return this.l.f - var2;
         case 2:
            return this.l.c + var2;
         case 3:
         case 4:
            return this.l.c + var1;
         default:
            return var2;
         }
      }
   }

   protected void a(class_aen var1, class_anl var2, int var3, int var4, int var5, class_arw var6) {
      class_cj var7 = new class_cj(this.a(var3, var5), this.d(var4), this.b(var3, var5));
      if(var6.b((class_df)var7)) {
         if(this.b != class_agj.class_a_in_class_agj.a) {
            var2 = var2.c().a(var2, this.b);
         }

         if(this.c != class_agj.class_c_in_class_agj.a) {
            var2 = var2.c().a(var2, this.c);
         }

         var1.a((class_cj)var7, (class_anl)var2, 2);
      }
   }

   protected class_anl a(class_aen var1, int var2, int var3, int var4, class_arw var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.d(var3);
      int var8 = this.b(var2, var4);
      class_cj var9 = new class_cj(var6, var7, var8);
      return !var5.b((class_df)var9)?class_agk.a.S():var1.p(var9);
   }

   protected void a(class_aen var1, class_arw var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = var4; var9 <= var7; ++var9) {
         for(int var10 = var3; var10 <= var6; ++var10) {
            for(int var11 = var5; var11 <= var8; ++var11) {
               this.a(var1, class_agk.a.S(), var10, var9, var11, var2);
            }
         }
      }

   }

   protected void a(class_aen var1, class_arw var2, int var3, int var4, int var5, int var6, int var7, int var8, class_anl var9, class_anl var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var11 || this.a(var1, var13, var12, var14, var2).c().v() != class_atk.a) {
                  if(var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.a(var1, var10, var13, var12, var14, var2);
                  } else {
                     this.a(var1, var9, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(class_aen var1, class_arw var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, class_asn.class_a_in_class_asn var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var9 || this.a(var1, var13, var12, var14, var2).c().v() != class_atk.a) {
                  var11.a(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.a(var1, var11.a(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void a(class_aen var1, class_arw var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, class_anl var11, class_anl var12, boolean var13) {
      for(int var14 = var6; var14 <= var9; ++var14) {
         for(int var15 = var5; var15 <= var8; ++var15) {
            for(int var16 = var7; var16 <= var10; ++var16) {
               if(var3.nextFloat() <= var4 && (!var13 || this.a(var1, var15, var14, var16, var2).c().v() != class_atk.a)) {
                  if(var14 != var6 && var14 != var9 && var15 != var5 && var15 != var8 && var16 != var7 && var16 != var10) {
                     this.a(var1, var12, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var11, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(class_aen var1, class_arw var2, Random var3, float var4, int var5, int var6, int var7, class_anl var8) {
      if(var3.nextFloat() < var4) {
         this.a(var1, var8, var5, var6, var7, var2);
      }

   }

   protected void a(class_aen var1, class_arw var2, int var3, int var4, int var5, int var6, int var7, int var8, class_anl var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if(!var10 || this.a(var1, var18, var16, var20, var2).c().v() != class_atk.a) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if(var22 <= 1.05F) {
                     this.a(var1, var9, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void b(class_aen var1, int var2, int var3, int var4, class_arw var5) {
      class_cj var6 = new class_cj(this.a(var2, var4), this.d(var3), this.b(var2, var4));
      if(var5.b((class_df)var6)) {
         while(!var1.d(var6) && var6.o() < 255) {
            var1.a((class_cj)var6, (class_anl)class_agk.a.S(), 2);
            var6 = var6.a();
         }

      }
   }

   protected void b(class_aen var1, class_anl var2, int var3, int var4, int var5, class_arw var6) {
      int var7 = this.a(var3, var5);
      int var8 = this.d(var4);
      int var9 = this.b(var3, var5);
      if(var6.b((class_df)(new class_cj(var7, var8, var9)))) {
         while((var1.d(new class_cj(var7, var8, var9)) || var1.p(new class_cj(var7, var8, var9)).c().v().d()) && var8 > 1) {
            var1.a((class_cj)(new class_cj(var7, var8, var9)), (class_anl)var2, 2);
            --var8;
         }

      }
   }

   protected boolean a(class_aen var1, class_arw var2, Random var3, int var4, int var5, int var6, List var7, int var8) {
      class_cj var9 = new class_cj(this.a(var4, var6), this.d(var5), this.b(var4, var6));
      if(var2.b((class_df)var9) && var1.p(var9).c() != class_agk.ae) {
         class_anl var10 = class_agk.ae.S();
         var1.a((class_cj)var9, (class_anl)class_agk.ae.f(var1, var9, var10), 2);
         class_amg var11 = var1.s(var9);
         if(var11 instanceof class_ami) {
            class_od.a(var3, var7, (class_oj)((class_ami)var11), var8);
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(class_aen var1, class_arw var2, Random var3, int var4, int var5, int var6, class_cq var7, List var8, int var9) {
      class_cj var10 = new class_cj(this.a(var4, var6), this.d(var5), this.b(var4, var6));
      if(var2.b((class_df)var10) && var1.p(var10).c() != class_agk.z) {
         this.a(var1, class_agk.z.S().a(class_ahk.a, var7), var4, var5, var6, var2);
         class_amg var11 = var1.s(var10);
         if(var11 instanceof class_amm) {
            class_od.a(var3, var8, (class_amm)var11, var9);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(class_aen var1, class_arw var2, Random var3, int var4, int var5, int var6, class_cq var7) {
      this.a(var1, class_agk.ao.S().a(class_ahl.a, var7), var4, var5, var6, var2);
      this.a(var1, class_agk.ao.S().a(class_ahl.a, var7).a(class_ahl.P, class_ahl.class_a_in_class_ahl.a), var4, var5 + 1, var6, var2);
   }

   public void a(int var1, int var2, int var3) {
      this.l.a(var1, var2, var3);
   }

   public class_cq e() {
      return this.a;
   }

   public void a(class_cq var1) {
      this.a = var1;
      if(var1 == null) {
         this.c = class_agj.class_c_in_class_agj.a;
         this.b = class_agj.class_a_in_class_agj.a;
      } else {
         switch(class_asn.SyntheticClass_1.a[var1.ordinal()]) {
         case 2:
            this.b = class_agj.class_a_in_class_agj.b;
            this.c = class_agj.class_c_in_class_agj.a;
            break;
         case 3:
            this.b = class_agj.class_a_in_class_agj.b;
            this.c = class_agj.class_c_in_class_agj.b;
            break;
         case 4:
            this.b = class_agj.class_a_in_class_agj.a;
            this.c = class_agj.class_c_in_class_agj.b;
            break;
         default:
            this.b = class_agj.class_a_in_class_agj.a;
            this.c = class_agj.class_c_in_class_agj.a;
         }
      }

   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] a = new int[class_cq.values().length];

      static {
         try {
            a[class_cq.c.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            a[class_cq.d.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            a[class_cq.e.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            a[class_cq.f.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public abstract static class class_a_in_class_asn {
      protected class_anl a;

      protected class_a_in_class_asn() {
         this.a = class_agk.a.S();
      }

      public abstract void a(Random var1, int var2, int var3, int var4, boolean var5);

      public class_anl a() {
         return this.a;
      }
   }
}