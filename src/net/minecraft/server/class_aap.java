package net.minecraft.server;

import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_oq;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_uz;
import net.minecraft.server.class_va;
import net.minecraft.server.class_vc;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_zu;

public class class_aap extends class_aar {
   private final Class a;

   public class_aap(Class var1) {
      this.a = var1;
      this.a(class_zu.c);
   }

   public class_oq a(class_aas var1, class_xa var2, class_aen var3, class_cj var4, class_oo var5, class_cq var6, float var7, float var8, float var9) {
      if(var6 == class_cq.a) {
         return class_oq.b;
      } else if(var6 == class_cq.b) {
         return class_oq.b;
      } else {
         class_cj var10 = var4.a(var6);
         if(!var2.a(var10, var6, var1)) {
            return class_oq.b;
         } else {
            class_uz var11 = this.a(var3, var10, var6);
            if(var11 != null && var11.j()) {
               if(!var3.D) {
                  var3.a((class_pr)var11);
               }

               --var1.b;
            }

            return class_oq.a;
         }
      }
   }

   private class_uz a(class_aen var1, class_cj var2, class_cq var3) {
      return (class_uz)(this.a == class_vc.class?new class_vc(var1, var2, var3):(this.a == class_va.class?new class_va(var1, var2, var3):null));
   }
}