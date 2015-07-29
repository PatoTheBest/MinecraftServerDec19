package net.minecraft.server;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_ahl;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_awh;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_df;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_du;
import net.minecraft.server.class_eb;
import net.minecraft.server.class_lv;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_to;
import net.minecraft.server.class_uj;
import net.minecraft.server.class_wv;
import net.minecraft.server.class_xa;

public class class_tp {
   private class_aen a;
   private final List b = Lists.newArrayList();
   private class_cj c;
   private class_cj d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private TreeMap j;
   private List k;
   private int l;

   public class_tp() {
      this.c = class_cj.a;
      this.d = class_cj.a;
      this.j = new TreeMap();
      this.k = Lists.newArrayList();
   }

   public class_tp(class_aen var1) {
      this.c = class_cj.a;
      this.d = class_cj.a;
      this.j = new TreeMap();
      this.k = Lists.newArrayList();
      this.a = var1;
   }

   public void a(class_aen var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.g = var1;
      this.m();
      this.l();
      if(var1 % 20 == 0) {
         this.k();
      }

      if(var1 % 30 == 0) {
         this.j();
      }

      int var2 = this.h / 10;
      if(this.l < var2 && this.b.size() > 20 && this.a.s.nextInt(7000) == 0) {
         class_awh var3 = this.a(this.d, 2, 4, 2);
         if(var3 != null) {
            class_uj var4 = new class_uj(this.a);
            var4.b(var3.a, var3.b, var3.c);
            this.a.a((class_pr)var4);
            ++this.l;
         }
      }

   }

   private class_awh a(class_cj var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < 10; ++var5) {
         class_cj var6 = var1.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
         if(this.a(var6) && this.a(new class_cj(var2, var3, var4), var6)) {
            return new class_awh((double)var6.n(), (double)var6.o(), (double)var6.p());
         }
      }

      return null;
   }

   private boolean a(class_cj var1, class_cj var2) {
      if(!class_aen.a((class_aer)this.a, (class_cj)var2.b())) {
         return false;
      } else {
         int var3 = var2.n() - var1.n() / 2;
         int var4 = var2.p() - var1.p() / 2;

         for(int var5 = var3; var5 < var3 + var1.n(); ++var5) {
            for(int var6 = var2.o(); var6 < var2.o() + var1.o(); ++var6) {
               for(int var7 = var4; var7 < var4 + var1.p(); ++var7) {
                  if(this.a.p(new class_cj(var5, var6, var7)).c().x()) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private void j() {
      List var1 = this.a.a(class_uj.class, new class_awf((double)(this.d.n() - this.e), (double)(this.d.o() - 4), (double)(this.d.p() - this.e), (double)(this.d.n() + this.e), (double)(this.d.o() + 4), (double)(this.d.p() + this.e)));
      this.l = var1.size();
   }

   private void k() {
      List var1 = this.a.a(class_wv.class, new class_awf((double)(this.d.n() - this.e), (double)(this.d.o() - 4), (double)(this.d.p() - this.e), (double)(this.d.n() + this.e), (double)(this.d.o() + 4), (double)(this.d.p() + this.e)));
      this.h = var1.size();
      if(this.h == 0) {
         this.j.clear();
      }

   }

   public class_cj a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.b.size();
   }

   public int d() {
      return this.g - this.f;
   }

   public int e() {
      return this.h;
   }

   public boolean a(class_cj var1) {
      return this.d.i(var1) < (double)(this.e * this.e);
   }

   public List f() {
      return this.b;
   }

   public class_to b(class_cj var1) {
      class_to var2 = null;
      int var3 = Integer.MAX_VALUE;
      Iterator var4 = this.b.iterator();

      while(var4.hasNext()) {
         class_to var5 = (class_to)var4.next();
         int var6 = var5.a(var1);
         if(var6 < var3) {
            var2 = var5;
            var3 = var6;
         }
      }

      return var2;
   }

   public class_to c(class_cj var1) {
      class_to var2 = null;
      int var3 = Integer.MAX_VALUE;
      Iterator var4 = this.b.iterator();

      while(var4.hasNext()) {
         class_to var5 = (class_to)var4.next();
         int var6 = var5.a(var1);
         if(var6 > 256) {
            var6 *= 1000;
         } else {
            var6 = var5.c();
         }

         if(var6 < var3) {
            var2 = var5;
            var3 = var6;
         }
      }

      return var2;
   }

   public class_to e(class_cj var1) {
      if(this.d.i(var1) > (double)(this.e * this.e)) {
         return null;
      } else {
         Iterator var2 = this.b.iterator();

         class_to var3;
         do {
            if(!var2.hasNext()) {
               return null;
            }

            var3 = (class_to)var2.next();
         } while(var3.d().n() != var1.n() || var3.d().p() != var1.p() || Math.abs(var3.d().o() - var1.o()) > 1);

         return var3;
      }
   }

   public void a(class_to var1) {
      this.b.add(var1);
      this.c = this.c.a((class_df)var1.d());
      this.n();
      this.f = var1.h();
   }

   public boolean g() {
      return this.b.isEmpty();
   }

   public void a(class_qa var1) {
      Iterator var2 = this.k.iterator();

      class_tp.class_a_in_class_tp var3;
      do {
         if(!var2.hasNext()) {
            this.k.add(new class_tp.class_a_in_class_tp(var1, this.g));
            return;
         }

         var3 = (class_tp.class_a_in_class_tp)var2.next();
      } while(var3.a != var1);

      var3.b = this.g;
   }

   public class_qa b(class_qa var1) {
      double var2 = Double.MAX_VALUE;
      class_tp.class_a_in_class_tp var4 = null;

      for(int var5 = 0; var5 < this.k.size(); ++var5) {
         class_tp.class_a_in_class_tp var6 = (class_tp.class_a_in_class_tp)this.k.get(var5);
         double var7 = var6.a.h(var1);
         if(var7 <= var2) {
            var4 = var6;
            var2 = var7;
         }
      }

      return var4 != null?var4.a:null;
   }

   public class_xa c(class_qa var1) {
      double var2 = Double.MAX_VALUE;
      class_xa var4 = null;
      Iterator var5 = this.j.keySet().iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         if(this.d(var6)) {
            class_xa var7 = this.a.a(var6);
            if(var7 != null) {
               double var8 = var7.h(var1);
               if(var8 <= var2) {
                  var4 = var7;
                  var2 = var8;
               }
            }
         }
      }

      return var4;
   }

   private void l() {
      Iterator var1 = this.k.iterator();

      while(true) {
         class_tp.class_a_in_class_tp var2;
         do {
            if(!var1.hasNext()) {
               return;
            }

            var2 = (class_tp.class_a_in_class_tp)var1.next();
         } while(var2.a.ai() && Math.abs(this.g - var2.b) <= 300);

         var1.remove();
      }
   }

   private void m() {
      boolean var1 = false;
      boolean var2 = this.a.s.nextInt(50) == 0;
      Iterator var3 = this.b.iterator();

      while(true) {
         class_to var4;
         do {
            if(!var3.hasNext()) {
               if(var1) {
                  this.n();
               }

               return;
            }

            var4 = (class_to)var3.next();
            if(var2) {
               var4.a();
            }
         } while(this.f(var4.d()) && Math.abs(this.g - var4.h()) <= 1200);

         this.c = this.c.b(var4.d());
         var1 = true;
         var4.a(true);
         var3.remove();
      }
   }

   private boolean f(class_cj var1) {
      class_agj var2 = this.a.p(var1).c();
      return var2 instanceof class_ahl?var2.v() == class_atk.d:false;
   }

   private void n() {
      int var1 = this.b.size();
      if(var1 == 0) {
         this.d = new class_cj(0, 0, 0);
         this.e = 0;
      } else {
         this.d = new class_cj(this.c.n() / var1, this.c.o() / var1, this.c.p() / var1);
         int var2 = 0;

         class_to var4;
         for(Iterator var3 = this.b.iterator(); var3.hasNext(); var2 = Math.max(var4.a(this.d), var2)) {
            var4 = (class_to)var3.next();
         }

         this.e = Math.max(32, (int)Math.sqrt((double)var2) + 1);
      }
   }

   public int a(String var1) {
      Integer var2 = (Integer)this.j.get(var1);
      return var2 != null?var2.intValue():0;
   }

   public int a(String var1, int var2) {
      int var3 = this.a(var1);
      int var4 = class_nu.a(var3 + var2, -30, 10);
      this.j.put(var1, Integer.valueOf(var4));
      return var4;
   }

   public boolean d(String var1) {
      return this.a(var1) <= -15;
   }

   public void a(class_dn var1) {
      this.h = var1.g("PopSize");
      this.e = var1.g("Radius");
      this.l = var1.g("Golems");
      this.f = var1.g("Stable");
      this.g = var1.g("Tick");
      this.i = var1.g("MTick");
      this.d = new class_cj(var1.g("CX"), var1.g("CY"), var1.g("CZ"));
      this.c = new class_cj(var1.g("ACX"), var1.g("ACY"), var1.g("ACZ"));
      class_du var2 = var1.c("Doors", 10);

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         class_dn var4 = var2.b(var3);
         class_to var5 = new class_to(new class_cj(var4.g("X"), var4.g("Y"), var4.g("Z")), var4.g("IDX"), var4.g("IDZ"), var4.g("TS"));
         this.b.add(var5);
      }

      class_du var8 = var1.c("Players", 10);

      for(int var9 = 0; var9 < var8.c(); ++var9) {
         class_dn var10 = var8.b(var9);
         if(var10.d("UUID")) {
            class_lv var6 = MinecraftServer.N().aF();
            GameProfile var7 = var6.a(UUID.fromString(var10.k("UUID")));
            if(var7 != null) {
               this.j.put(var7.getName(), Integer.valueOf(var10.g("S")));
            }
         } else {
            this.j.put(var10.k("Name"), Integer.valueOf(var10.g("S")));
         }
      }

   }

   public void b(class_dn var1) {
      var1.a("PopSize", this.h);
      var1.a("Radius", this.e);
      var1.a("Golems", this.l);
      var1.a("Stable", this.f);
      var1.a("Tick", this.g);
      var1.a("MTick", this.i);
      var1.a("CX", this.d.n());
      var1.a("CY", this.d.o());
      var1.a("CZ", this.d.p());
      var1.a("ACX", this.c.n());
      var1.a("ACY", this.c.o());
      var1.a("ACZ", this.c.p());
      class_du var2 = new class_du();
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         class_to var4 = (class_to)var3.next();
         class_dn var5 = new class_dn();
         var5.a("X", var4.d().n());
         var5.a("Y", var4.d().o());
         var5.a("Z", var4.d().p());
         var5.a("IDX", var4.f());
         var5.a("IDZ", var4.g());
         var5.a("TS", var4.h());
         var2.a((class_eb)var5);
      }

      var1.a((String)"Doors", (class_eb)var2);
      class_du var9 = new class_du();
      Iterator var10 = this.j.keySet().iterator();

      while(var10.hasNext()) {
         String var11 = (String)var10.next();
         class_dn var6 = new class_dn();
         class_lv var7 = MinecraftServer.N().aF();
         GameProfile var8 = var7.a(var11);
         if(var8 != null) {
            var6.a("UUID", var8.getId().toString());
            var6.a("S", ((Integer)this.j.get(var11)).intValue());
            var9.a((class_eb)var6);
         }
      }

      var1.a((String)"Players", (class_eb)var9);
   }

   public void h() {
      this.i = this.g;
   }

   public boolean i() {
      return this.i == 0 || this.g - this.i >= 3600;
   }

   public void b(int var1) {
      Iterator var2 = this.j.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.a(var3, var1);
      }

   }

   class class_a_in_class_tp {
      public class_qa a;
      public int b;

      class_a_in_class_tp(class_qa var2, int var3) {
         this.a = var2;
         this.b = var3;
      }
   }
}