package net.minecraft.server;

import net.minecraft.server.class_aen;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_apc;
import net.minecraft.server.class_apd;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_pc;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qi;
import net.minecraft.server.class_ur;

public class class_uq extends class_pr {
   public int a;
   public int b;
   private static final int c = class_qi.a(class_uq.class);

   public class_uq(class_aen var1) {
      super(var1);
      this.k = true;
      this.a(2.0F, 2.0F);
      this.b = 5;
      this.a = this.V.nextInt(100000);
   }

   protected boolean s_() {
      return false;
   }

   protected void h() {
      this.ac.a(c, Integer.valueOf(this.b));
   }

   public void t_() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      ++this.a;
      this.ac.b(c, Integer.valueOf(this.b));
      if(!this.o.D) {
         class_cj var1 = new class_cj(this);
         if(this.o.t instanceof class_apd && this.o.p(var1).c() != class_agk.ab) {
            this.o.a(var1, class_agk.ab.S());
         }
      }

   }

   protected void b(class_dn var1) {
   }

   protected void a(class_dn var1) {
   }

   public boolean ad() {
      return true;
   }

   public boolean a(class_pc var1, float var2) {
      if(this.b(var1)) {
         return false;
      } else if(var1.j() instanceof class_ur) {
         return false;
      } else {
         if(!this.I && !this.o.D) {
            this.b = 0;
            this.J();
            if(!this.o.D) {
               this.o.a((class_pr)null, this.s, this.t, this.u, 6.0F, true);
               if(this.o.t instanceof class_apd) {
                  class_apd var3 = (class_apd)this.o.t;
                  class_apc var4 = var3.s();
                  if(var4 != null) {
                     var4.a(this, var1);
                  }
               }
            }
         }

         return true;
      }
   }
}