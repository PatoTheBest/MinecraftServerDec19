package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.World;
import net.minecraft.server.class_aez;
import net.minecraft.server.class_afn;
import net.minecraft.server.class_ahm;
import net.minecraft.server.class_aic;
import net.minecraft.server.class_apw;
import net.minecraft.server.class_apy;
import net.minecraft.server.class_aqr;
import net.minecraft.server.class_arf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_ul;

public class class_afh extends class_aez {
   private int aG;
   protected static final class_apy aD = new class_apy(false, true);
   protected static final class_apy aE = new class_apy(false, false);
   protected static final class_arf aF = new class_arf(false);

   public class_afh(int var1, int var2) {
      super(var1);
      this.aG = var2;
      this.as.A = 10;
      this.as.C = 2;
      if(this.aG == 1) {
         this.as.A = 6;
         this.as.B = 100;
         this.as.C = 1;
      }

      this.a(5159473);
      this.a(0.7F, 0.8F);
      if(this.aG == 2) {
         this.aj = 353825;
         this.ai = 3175492;
         this.a(0.6F, 0.6F);
      }

      if(this.aG == 0) {
         this.au.add(new class_aez.class_c_in_class_aez(class_ul.class, 5, 4, 4));
      }

      if(this.aG == 3) {
         this.as.A = -999;
      }

   }

   protected class_aez a(int var1, boolean var2) {
      if(this.aG == 2) {
         this.aj = 353825;
         this.ai = var1;
         if(var2) {
            this.aj = (this.aj & 16711422) >> 1;
         }

         return this;
      } else {
         return super.a(var1, var2);
      }
   }

   public class_apw a(Random var1) {
      return (class_apw)(this.aG == 3 && var1.nextInt(3) > 0?aF:(this.aG != 2 && var1.nextInt(5) != 0?this.aA:aE));
   }

   public class_aic.class_a_in_class_aic a(Random var1, class_cj var2) {
      if(this.aG == 1) {
         double var3 = class_nu.a((1.0D + af.a((double)var2.n() / 48.0D, (double)var2.p() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
         class_aic.class_a_in_class_aic var5 = class_aic.class_a_in_class_aic.values()[(int)(var3 * (double)class_aic.class_a_in_class_aic.values().length)];
         return var5 == class_aic.class_a_in_class_aic.c?class_aic.class_a_in_class_aic.b:var5;
      } else {
         return super.a(var1, var2);
      }
   }

   public void a(World var1, Random var2, class_cj var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(this.aG == 3) {
         for(var4 = 0; var4 < 4; ++var4) {
            for(var5 = 0; var5 < 4; ++var5) {
               var6 = var4 * 4 + 1 + 8 + var2.nextInt(3);
               var7 = var5 * 4 + 1 + 8 + var2.nextInt(3);
               class_cj var8 = var1.m(var3.a(var6, 0, var7));
               if(var2.nextInt(20) == 0) {
                  class_aqr var9 = new class_aqr();
                  var9.b(var1, var2, var8);
               } else {
                  class_apw var12 = this.a(var2);
                  var12.e();
                  if(var12.b(var1, var2, var8)) {
                     var12.a(var1, var2, var8);
                  }
               }
            }
         }
      }

      var4 = var2.nextInt(5) - 3;
      if(this.aG == 1) {
         var4 += 2;
      }

      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var2.nextInt(3);
         if(var6 == 0) {
            ag.a(class_ahm.class_b_in_class_ahm.b);
         } else if(var6 == 1) {
            ag.a(class_ahm.class_b_in_class_ahm.e);
         } else if(var6 == 2) {
            ag.a(class_ahm.class_b_in_class_ahm.f);
         }

         for(var7 = 0; var7 < 5; ++var7) {
            int var11 = var2.nextInt(16) + 8;
            int var13 = var2.nextInt(16) + 8;
            int var10 = var2.nextInt(var1.m(var3.a(var11, 0, var13)).o() + 32);
            if(ag.b(var1, var2, new class_cj(var3.n() + var11, var10, var3.p() + var13))) {
               break;
            }
         }
      }

      super.a(var1, var2, var3);
   }

   protected class_aez d(final int var1) {
      if(this.az == class_aez.t.az) {
         class_afh var2 = new class_afh(var1, 1);
         var2.a(new class_aez.class_a_in_class_aez(this.an, this.ao + 0.2F));
         var2.a("Flower Forest");
         var2.a(6976549, true);
         var2.a(8233509);
         return var2;
      } else {
         return this.az != class_aez.Q.az && this.az != class_aez.R.az?new class_afn(var1, this) {
            public void a(World var1, Random var2, class_cj var3) {
               this.aE.a(var1, var2, var3);
            }
         }:new class_afn(var1, this) {
            public class_apw a(Random var1) {
               return var1.nextBoolean()?class_afh.aD:class_afh.aE;
            }
         };
      }
   }
}
