package net.minecraft.server;

import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_abz;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_nc;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_oq;
import net.minecraft.server.class_or;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_zu;

public class class_aay extends class_aar {
   public class_aay() {
      this.d(1);
      this.a(class_zu.f);
   }

   public class_aas a(class_aas var1, class_aen var2, class_qa var3) {
      if(var3 instanceof class_xa && !((class_xa)var3).bH.d) {
         --var1.b;
      }

      if(!var2.D) {
         var3.bl();
      }

      if(var3 instanceof class_xa) {
         ((class_xa)var3).b(class_nc.ad[class_aar.b((class_aar)this)]);
      }

      return var1.b <= 0?new class_aas(class_aau.ay):var1;
   }

   public int e(class_aas var1) {
      return 32;
   }

   public class_abz f(class_aas var1) {
      return class_abz.c;
   }

   public class_or a(class_aas var1, class_aen var2, class_xa var3, class_oo var4) {
      var3.c(var4);
      return new class_or(class_oq.a, var1);
   }
}