package net.minecraft.server;

import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_pc;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_qi;
import net.minecraft.server.class_qk;
import net.minecraft.server.class_rb;
import net.minecraft.server.class_rj;
import net.minecraft.server.class_rr;
import net.minecraft.server.class_ru;
import net.minecraft.server.class_sh;
import net.minecraft.server.class_si;
import net.minecraft.server.class_sp;
import net.minecraft.server.class_sw;
import net.minecraft.server.class_sz;
import net.minecraft.server.class_uc;
import net.minecraft.server.class_vi;
import net.minecraft.server.class_wi;
import net.minecraft.server.class_wl;
import net.minecraft.server.class_wn;
import net.minecraft.server.class_xa;

public class class_wa extends class_wi {
   private static final int a = class_qi.a(class_wa.class);
   private static final int b = class_qi.a(class_wa.class);
   private static final int c = class_qi.a(class_wa.class);
   private int bs;
   private int bt;
   private int bu = 30;
   private int bv = 3;
   private int bw = 0;

   public class_wa(class_aen var1) {
      super(var1);
      this.i.a(1, new class_rj(this));
      this.i.a(2, new class_sp(this));
      this.i.a(3, new class_rb(this, class_uc.class, 6.0F, 1.0D, 1.2D));
      this.i.a(4, new class_ru(this, 1.0D, false));
      this.i.a(5, new class_si(this, 0.8D));
      this.i.a(6, new class_rr(this, class_xa.class, 8.0F));
      this.i.a(6, new class_sh(this));
      this.bn.a(1, new class_sz(this, class_xa.class, true));
      this.bn.a(2, new class_sw(this, false, new Class[0]));
   }

   protected void aY() {
      super.aY();
      this.a((class_qk)class_wl.d).a(0.25D);
   }

   public int aG() {
      return this.w() == null?3:3 + (int)(this.bo() - 1.0F);
   }

   public void e(float var1, float var2) {
      super.e(var1, var2);
      this.bt = (int)((float)this.bt + var1 * 1.5F);
      if(this.bt > this.bu - 5) {
         this.bt = this.bu - 5;
      }

   }

   protected void h() {
      super.h();
      this.ac.a(a, Byte.valueOf((byte)-1));
      this.ac.a(b, Byte.valueOf((byte)0));
      this.ac.a(c, Byte.valueOf((byte)0));
   }

   public void b(class_dn var1) {
      super.b(var1);
      if(this.ac.a(b) == 1) {
         var1.a("powered", true);
      }

      var1.a("Fuse", (short)this.bu);
      var1.a("ExplosionRadius", (byte)this.bv);
      var1.a("ignited", this.cC());
   }

   public void a(class_dn var1) {
      super.a(var1);
      this.ac.b(b, Byte.valueOf((byte)(var1.o("powered")?1:0)));
      if(var1.b("Fuse", 99)) {
         this.bu = var1.f("Fuse");
      }

      if(var1.b("ExplosionRadius", 99)) {
         this.bv = var1.e("ExplosionRadius");
      }

      if(var1.o("ignited")) {
         this.cD();
      }

   }

   public void t_() {
      if(this.ai()) {
         this.bs = this.bt;
         if(this.cC()) {
            this.a(1);
         }

         int var1 = this.cB();
         if(var1 > 0 && this.bt == 0) {
            this.a("creeper.primed", 1.0F, 0.5F);
         }

         this.bt += var1;
         if(this.bt < 0) {
            this.bt = 0;
         }

         if(this.bt >= this.bu) {
            this.bt = this.bu;
            this.cG();
         }
      }

      super.t_();
   }

   protected String bp() {
      return "mob.creeper.say";
   }

   protected String bq() {
      return "mob.creeper.death";
   }

   public void a(class_pc var1) {
      super.a(var1);
      if(var1.j() instanceof class_wn) {
         int var2 = class_aar.b(class_aau.ct);
         int var3 = class_aar.b(class_aau.cE);
         int var4 = var2 + this.V.nextInt(var3 - var2 + 1);
         this.a(class_aar.c(var4), 1);
      } else if(var1.j() instanceof class_wa && var1.j() != this && ((class_wa)var1.j()).n() && ((class_wa)var1.j()).cE()) {
         ((class_wa)var1.j()).cF();
         this.a(new class_aas(class_aau.ca, 1, 4), 0.0F);
      }

   }

   public boolean r(class_pr var1) {
      return true;
   }

   public boolean n() {
      return this.ac.a(b) == 1;
   }

   protected class_aar D() {
      return class_aau.J;
   }

   public int cB() {
      return this.ac.a(a);
   }

   public void a(int var1) {
      this.ac.b(a, Byte.valueOf((byte)var1));
   }

   public void a(class_vi var1) {
      super.a(var1);
      this.ac.b(b, Byte.valueOf((byte)1));
   }

   protected boolean a(class_xa var1, class_oo var2, class_aas var3) {
      if(var3 != null && var3.b() == class_aau.d) {
         this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.ignite", 1.0F, this.V.nextFloat() * 0.4F + 0.8F);
         var1.a((class_oo)var2);
         if(!this.o.D) {
            this.cD();
            var3.a(1, (class_qa)var1);
            return true;
         }
      }

      return super.a(var1, var2, var3);
   }

   private void cG() {
      if(!this.o.D) {
         boolean var1 = this.o.R().b("mobGriefing");
         float var2 = this.n()?2.0F:1.0F;
         this.o.a(this, this.s, this.t, this.u, (float)this.bv * var2, var1);
         this.J();
      }

   }

   public boolean cC() {
      return this.ac.a(c) != 0;
   }

   public void cD() {
      this.ac.b(c, Byte.valueOf((byte)1));
   }

   public boolean cE() {
      return this.bw < 1 && this.o.R().b("doMobLoot");
   }

   public void cF() {
      ++this.bw;
   }
}