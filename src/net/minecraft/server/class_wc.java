package net.minecraft.server;

import net.minecraft.server.Item;
import net.minecraft.server.World;
import net.minecraft.server.Block;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cy;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_qf;
import net.minecraft.server.class_rj;
import net.minecraft.server.class_rr;
import net.minecraft.server.class_ru;
import net.minecraft.server.class_sh;
import net.minecraft.server.class_si;
import net.minecraft.server.class_sw;
import net.minecraft.server.class_sz;
import net.minecraft.server.class_wi;
import net.minecraft.server.class_wl;
import net.minecraft.server.class_xa;

public class class_wc extends class_wi {
   private int a = 0;
   private boolean b = false;

   public class_wc(World var1) {
      super(var1);
      this.b_ = 3;
      this.a(0.4F, 0.3F);
      this.i.a(1, new class_rj(this));
      this.i.a(2, new class_ru(this, class_xa.class, 1.0D, false));
      this.i.a(3, new class_si(this, 1.0D));
      this.i.a(7, new class_rr(this, class_xa.class, 8.0F));
      this.i.a(8, new class_sh(this));
      this.bn.a(1, new class_sw(this, true, new Class[0]));
      this.bn.a(2, new class_sz(this, class_xa.class, true));
   }

   public float aU() {
      return 0.1F;
   }

   protected void aY() {
      super.aY();
      this.a(class_wl.a).a(8.0D);
      this.a(class_wl.d).a(0.25D);
      this.a(class_wl.e).a(2.0D);
   }

   protected boolean s_() {
      return false;
   }

   protected String C() {
      return "mob.silverfish.say";
   }

   protected String bp() {
      return "mob.silverfish.hit";
   }

   protected String bq() {
      return "mob.silverfish.kill";
   }

   protected void a(class_cj var1, Block var2) {
      this.a("mob.silverfish.step", 0.15F, 1.0F);
   }

   protected Item D() {
      return null;
   }

   public void a(class_dn var1) {
      super.a(var1);
      this.a = var1.g("Lifetime");
      this.b = var1.o("PlayerSpawned");
   }

   public void b(class_dn var1) {
      super.b(var1);
      var1.a("Lifetime", this.a);
      var1.a("PlayerSpawned", this.b);
   }

   public void t_() {
      this.aL = this.y;
      super.t_();
   }

   public boolean n() {
      return this.b;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public void m() {
      super.m();
      if(this.o.D) {
         for(int var1 = 0; var1 < 2; ++var1) {
            this.o.a(class_cy.y, this.s + (this.V.nextDouble() - 0.5D) * (double)this.J, this.t + this.V.nextDouble() * (double)this.K, this.u + (this.V.nextDouble() - 0.5D) * (double)this.J, (this.V.nextDouble() - 0.5D) * 2.0D, -this.V.nextDouble(), (this.V.nextDouble() - 0.5D) * 2.0D, new int[0]);
         }
      } else {
         if(!this.cn()) {
            ++this.a;
         }

         if(this.a >= 2400) {
            this.J();
         }
      }

   }

   protected boolean n_() {
      return true;
   }

   public boolean cf() {
      if(super.cf()) {
         class_xa var1 = this.o.a(this, 5.0D);
         return var1 == null;
      } else {
         return false;
      }
   }

   public class_qf bz() {
      return class_qf.c;
   }
}
