package net.minecraft.server;

import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_ags;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_auv;
import net.minecraft.server.class_awh;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cy;
import net.minecraft.server.class_di;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_on;
import net.minecraft.server.class_pc;
import net.minecraft.server.class_po;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_qd;
import net.minecraft.server.class_qi;
import net.minecraft.server.class_qk;
import net.minecraft.server.class_qx;
import net.minecraft.server.class_qz;
import net.minecraft.server.class_rb;
import net.minecraft.server.class_re;
import net.minecraft.server.class_rj;
import net.minecraft.server.class_rm;
import net.minecraft.server.class_rr;
import net.minecraft.server.class_ru;
import net.minecraft.server.class_rx;
import net.minecraft.server.class_se;
import net.minecraft.server.class_si;
import net.minecraft.server.class_sr;
import net.minecraft.server.class_sw;
import net.minecraft.server.class_sz;
import net.minecraft.server.class_tf;
import net.minecraft.server.class_tw;
import net.minecraft.server.class_ul;
import net.minecraft.server.class_wl;
import net.minecraft.server.class_xa;

public class class_ue extends class_tw {
   private static final int bs = class_qi.a(class_ue.class);
   private class_ue.class_c_in_class_ue bt;
   private int bu = 0;
   private int bw = 0;
   private boolean bx = false;
   private boolean by = false;
   private int bz = 0;
   private class_ue.class_b_in_class_ue bA;
   private int bB;
   private class_xa bC;

   public class_ue(class_aen var1) {
      super(var1);
      this.bA = class_ue.class_b_in_class_ue.b;
      this.bB = 0;
      this.bC = null;
      this.a(0.6F, 0.7F);
      this.g = new class_ue.class_e_in_class_ue(this);
      this.f = new class_ue.class_f_in_class_ue(this);
      ((class_tf)this.u()).a(true);
      this.h.a(2.5F);
      this.i.a(1, new class_rj(this));
      this.i.a(1, new class_ue.class_g_in_class_ue(this, 1.33D));
      this.i.a(2, new class_sr(this, 1.0D, class_aau.bU, false));
      this.i.a(2, new class_sr(this, 1.0D, class_aau.bZ, false));
      this.i.a(2, new class_sr(this, 1.0D, class_aar.a((class_agj)class_agk.N), false));
      this.i.a(3, new class_re(this, 0.8D));
      this.i.a(5, new class_ue.class_h_in_class_ue(this));
      this.i.a(5, new class_si(this, 0.6D));
      this.i.a(11, new class_rr(this, class_xa.class, 10.0F));
      this.bt = new class_ue.class_c_in_class_ue(this, class_ul.class, 16.0F, 1.33D, 1.33D);
      this.i.a(4, this.bt);
      this.b(0.0D);
   }

   protected float bF() {
      return this.f.a() && this.f.e() > this.t + 0.5D?0.5F:this.bA.b();
   }

   public void a(class_ue.class_b_in_class_ue var1) {
      this.bA = var1;
   }

   public void b(double var1) {
      this.u().a(var1);
      this.f.a(this.f.d(), this.f.e(), this.f.f(), var1);
   }

   public void a(boolean var1, class_ue.class_b_in_class_ue var2) {
      super.i(var1);
      if(!var1) {
         if(this.bA == class_ue.class_b_in_class_ue.e) {
            this.bA = class_ue.class_b_in_class_ue.b;
         }
      } else {
         this.b(1.5D * (double)var2.a());
         this.a(this.cB(), this.bC(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) * 0.8F);
      }

      this.bx = var1;
   }

   public void b(class_ue.class_b_in_class_ue var1) {
      this.a(true, var1);
      this.bw = var1.d();
      this.bu = 0;
   }

   public boolean cA() {
      return this.bx;
   }

   protected void h() {
      super.h();
      this.ac.a(bs, Byte.valueOf((byte)0));
   }

   public void cc() {
      if(this.f.b() > 0.8D) {
         this.a(class_ue.class_b_in_class_ue.d);
      } else if(this.bA != class_ue.class_b_in_class_ue.e) {
         this.a(class_ue.class_b_in_class_ue.b);
      }

      if(this.bz > 0) {
         --this.bz;
      }

      if(this.bB > 0) {
         this.bB -= this.V.nextInt(3);
         if(this.bB < 0) {
            this.bB = 0;
         }
      }

      if(this.C) {
         if(!this.by) {
            this.a(false, class_ue.class_b_in_class_ue.a);
            this.cL();
         }

         if(this.cC() == 99 && this.bz == 0) {
            class_qa var1 = this.w();
            if(var1 != null && this.h(var1) < 16.0D) {
               this.a(var1.s, var1.u);
               this.f.a(var1.s, var1.t, var1.u, this.f.b());
               this.b(class_ue.class_b_in_class_ue.e);
               this.by = true;
            }
         }

         class_ue.class_e_in_class_ue var4 = (class_ue.class_e_in_class_ue)this.g;
         if(!var4.c()) {
            if(this.f.a() && this.bz == 0) {
               class_auv var2 = this.h.j();
               class_awh var3 = new class_awh(this.f.d(), this.f.e(), this.f.f());
               if(var2 != null && var2.e() < var2.d()) {
                  var3 = var2.a((class_pr)this);
               }

               this.a(var3.a, var3.c);
               this.b(this.bA);
            }
         } else if(!var4.d()) {
            this.cI();
         }
      }

      this.by = this.C;
   }

   public void Y() {
   }

   private void a(double var1, double var3) {
      this.y = (float)(class_nu.b(var3 - this.u, var1 - this.s) * 180.0D / 3.1415927410125732D) - 90.0F;
   }

   private void cI() {
      ((class_ue.class_e_in_class_ue)this.g).a(true);
   }

   private void cJ() {
      ((class_ue.class_e_in_class_ue)this.g).a(false);
   }

   private void cK() {
      this.bz = this.cD();
   }

   private void cL() {
      this.cK();
      this.cJ();
   }

   public void m() {
      super.m();
      if(this.bu != this.bw) {
         if(this.bu == 0 && !this.o.D) {
            this.o.a((class_pr)this, (byte)1);
         }

         ++this.bu;
      } else if(this.bw != 0) {
         this.bu = 0;
         this.bw = 0;
      }

   }

   protected void aY() {
      super.aY();
      this.a((class_qk)class_wl.a).a(10.0D);
      this.a((class_qk)class_wl.d).a(0.30000001192092896D);
   }

   public void b(class_dn var1) {
      super.b(var1);
      var1.a("RabbitType", this.cC());
      var1.a("MoreCarrotTicks", this.bB);
   }

   public void a(class_dn var1) {
      super.a(var1);
      this.m(var1.g("RabbitType"));
      this.bB = var1.g("MoreCarrotTicks");
   }

   protected String cB() {
      return "mob.rabbit.hop";
   }

   protected String C() {
      return "mob.rabbit.idle";
   }

   protected String bp() {
      return "mob.rabbit.hurt";
   }

   protected String bq() {
      return "mob.rabbit.death";
   }

   public boolean r(class_pr var1) {
      if(this.cC() == 99) {
         this.a("mob.attack", 1.0F, (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
         return var1.a(class_pc.a((class_qa)this), 8.0F);
      } else {
         return var1.a(class_pc.a((class_qa)this), 3.0F);
      }
   }

   public int bs() {
      return this.cC() == 99?8:super.bs();
   }

   public boolean a(class_pc var1, float var2) {
      return this.b((class_pc)var1)?false:super.a(var1, var2);
   }

   protected void br() {
      this.a(new class_aas(class_aau.bt, 1), 0.0F);
   }

   protected void b(boolean var1, int var2) {
      int var3 = this.V.nextInt(2) + this.V.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.a(class_aau.bu, 1);
      }

      var3 = this.V.nextInt(2);

      for(var4 = 0; var4 < var3; ++var4) {
         if(this.av()) {
            this.a(class_aau.br, 1);
         } else {
            this.a(class_aau.bq, 1);
         }
      }

   }

   private boolean a(class_aar var1) {
      return var1 == class_aau.bU || var1 == class_aau.bZ || var1 == class_aar.a((class_agj)class_agk.N);
   }

   public class_ue b(class_po var1) {
      class_ue var2 = new class_ue(this.o);
      if(var1 instanceof class_ue) {
         var2.m(this.V.nextBoolean()?this.cC():((class_ue)var1).cC());
      }

      return var2;
   }

   public boolean d(class_aas var1) {
      return var1 != null && this.a(var1.b());
   }

   public int cC() {
      return this.ac.a(bs);
   }

   public void m(int var1) {
      if(var1 == 99) {
         this.i.a((class_rm)this.bt);
         this.i.a(4, new class_ue.class_a_in_class_ue(this));
         this.bn.a(1, new class_sw(this, false, new Class[0]));
         this.bn.a(2, new class_sz(this, class_xa.class, true));
         this.bn.a(2, new class_sz(this, class_ul.class, true));
         if(!this.l_()) {
            this.a((String)class_di.a("entity.KillerBunny.name"));
         }
      }

      this.ac.b(bs, Byte.valueOf((byte)var1));
   }

   public class_qd a(class_on var1, class_qd var2) {
      Object var5 = super.a(var1, var2);
      int var3 = this.V.nextInt(6);
      boolean var4 = false;
      if(var5 instanceof class_ue.class_d_in_class_ue) {
         var3 = ((class_ue.class_d_in_class_ue)var5).a;
         var4 = true;
      } else {
         var5 = new class_ue.class_d_in_class_ue(var3);
      }

      this.m(var3);
      if(var4) {
         this.b(-24000);
      }

      return (class_qd)var5;
   }

   private boolean cM() {
      return this.bB == 0;
   }

   protected int cD() {
      return this.bA.c();
   }

   protected void cE() {
      class_ags var1 = (class_ags)class_agk.cb;
      class_anl var2 = var1.b(var1.n());
      this.o.a(class_cy.M, this.s + (double)(this.V.nextFloat() * this.J * 2.0F) - (double)this.J, this.t + 0.5D + (double)(this.V.nextFloat() * this.K), this.u + (double)(this.V.nextFloat() * this.J * 2.0F) - (double)this.J, 0.0D, 0.0D, 0.0D, new int[]{class_agj.f(var2)});
      this.bB = 100;
   }

   // $FF: synthetic method
   public class_po a(class_po var1) {
      return this.b(var1);
   }

   static enum class_b_in_class_ue {
      a(0.0F, 0.0F, 30, 1),
      b(0.8F, 0.2F, 20, 10),
      c(1.0F, 0.45F, 14, 14),
      d(1.75F, 0.4F, 1, 8),
      e(2.0F, 0.7F, 7, 8);

      private final float f;
      private final float g;
      private final int h;
      private final int i;

      private class_b_in_class_ue(float var3, float var4, int var5, int var6) {
         this.f = var3;
         this.g = var4;
         this.h = var5;
         this.i = var6;
      }

      public float a() {
         return this.f;
      }

      public float b() {
         return this.g;
      }

      public int c() {
         return this.h;
      }

      public int d() {
         return this.i;
      }
   }

   static class class_a_in_class_ue extends class_ru {
      public class_a_in_class_ue(class_ue var1) {
         super(var1, class_qa.class, 1.4D, true);
      }

      protected double a(class_qa var1) {
         return (double)(4.0F + var1.J);
      }
   }

   static class class_g_in_class_ue extends class_se {
      private class_ue b;

      public class_g_in_class_ue(class_ue var1, double var2) {
         super(var1, var2);
         this.b = var1;
      }

      public void e() {
         super.e();
         this.b.b(this.a);
      }
   }

   static class class_h_in_class_ue extends class_rx {
      private final class_ue c;
      private boolean d;
      private boolean e = false;

      public class_h_in_class_ue(class_ue var1) {
         super(var1, 0.699999988079071D, 16);
         this.c = var1;
      }

      public boolean a() {
         if(this.a <= 0) {
            if(!this.c.o.R().b("mobGriefing")) {
               return false;
            }

            this.e = false;
            this.d = this.c.cM();
         }

         return super.a();
      }

      public boolean b() {
         return this.e && super.b();
      }

      public void c() {
         super.c();
      }

      public void d() {
         super.d();
      }

      public void e() {
         super.e();
         this.c.q().a((double)this.b.n() + 0.5D, (double)(this.b.o() + 1), (double)this.b.p() + 0.5D, 10.0F, (float)this.c.cd());
         if(this.f()) {
            class_aen var1 = this.c.o;
            class_cj var2 = this.b.a();
            class_anl var3 = var1.p(var2);
            class_agj var4 = var3.c();
            if(this.e && var4 instanceof class_ags && ((class_ags)var4).e(var3)) {
               var1.a((class_cj)var2, (class_anl)class_agk.a.S(), 2);
               var1.b(var2, true);
               this.c.cE();
            }

            this.e = false;
            this.a = 10;
         }

      }

      protected boolean a(class_aen var1, class_cj var2) {
         class_agj var3 = var1.p(var2).c();
         if(var3 == class_agk.ak) {
            var2 = var2.a();
            class_anl var4 = var1.p(var2);
            var3 = var4.c();
            if(var3 instanceof class_ags && ((class_ags)var3).e(var4) && this.d && !this.e) {
               this.e = true;
               return true;
            }
         }

         return false;
      }
   }

   static class class_c_in_class_ue extends class_rb {
      private class_ue c;

      public class_c_in_class_ue(class_ue var1, Class var2, float var3, double var4, double var6) {
         super(var1, var2, var3, var4, var6);
         this.c = var1;
      }

      public void e() {
         super.e();
      }
   }

   static class class_f_in_class_ue extends class_qz {
      private class_ue g;

      public class_f_in_class_ue(class_ue var1) {
         super(var1);
         this.g = var1;
      }

      public void c() {
         if(this.g.C && !this.g.cA()) {
            this.g.b(0.0D);
         }

         super.c();
      }
   }

   public class class_e_in_class_ue extends class_qx {
      private class_ue c;
      private boolean d = false;

      public class_e_in_class_ue(class_ue var2) {
         super(var2);
         this.c = var2;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.d;
      }

      public void a(boolean var1) {
         this.d = var1;
      }

      public void b() {
         if(this.a) {
            this.c.b(class_ue.class_b_in_class_ue.c);
            this.a = false;
         }

      }
   }

   public static class class_d_in_class_ue implements class_qd {
      public int a;

      public class_d_in_class_ue(int var1) {
         this.a = var1;
      }
   }
}