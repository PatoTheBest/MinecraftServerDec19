package net.minecraft.server;

import com.google.gson.JsonParseException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_awh;
import net.minecraft.server.class_bz;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_et;
import net.minecraft.server.class_eu;
import net.minecraft.server.class_ev;
import net.minecraft.server.class_ez;
import net.minecraft.server.class_fa;
import net.minecraft.server.class_ff;
import net.minecraft.server.class_hw;
import net.minecraft.server.class_m;
import net.minecraft.server.class_n;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_xa;

public class class_amx extends class_amg {
   public final class_eu[] a = new class_eu[]{new class_fa(""), new class_fa(""), new class_fa(""), new class_fa("")};
   public int f = -1;
   private boolean g = true;
   private class_xa h;
   private final class_n i = new class_n();

   public void b(class_dn var1) {
      super.b(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         String var3 = class_eu.class_a_in_class_eu.a(this.a[var2]);
         var1.a("Text" + (var2 + 1), var3);
      }

      this.i.b(var1);
   }

   public void a(class_dn var1) {
      this.g = false;
      super.a(var1);
      class_m var2 = new class_m() {
         public String e_() {
            return "Sign";
         }

         public class_eu f_() {
            return new class_fa(this.e_());
         }

         public void a(class_eu var1) {
         }

         public boolean a(int var1, String var2) {
            return true;
         }

         public class_cj c() {
            return class_amx.this.c;
         }

         public class_awh d() {
            return new class_awh((double)class_amx.this.c.n() + 0.5D, (double)class_amx.this.c.o() + 0.5D, (double)class_amx.this.c.p() + 0.5D);
         }

         public class_aen e() {
            return class_amx.this.b;
         }

         public class_pr f() {
            return null;
         }

         public boolean u_() {
            return false;
         }

         public void a(class_n.class_a_in_class_n var1, int var2) {
         }
      };

      for(int var3 = 0; var3 < 4; ++var3) {
         String var4 = var1.k("Text" + (var3 + 1));

         try {
            class_eu var5 = class_eu.class_a_in_class_eu.a(var4);

            try {
               this.a[var3] = class_ev.a(var2, var5, (class_pr)null);
            } catch (class_bz var7) {
               this.a[var3] = var5;
            }
         } catch (JsonParseException var8) {
            this.a[var3] = new class_fa(var4);
         }
      }

      this.i.a(var1);
   }

   public class_ff z_() {
      class_eu[] var1 = new class_eu[4];
      System.arraycopy(this.a, 0, var1, 0, 4);
      return new class_hw(this.b, this.c, var1);
   }

   public boolean F() {
      return true;
   }

   public boolean b() {
      return this.g;
   }

   public void a(class_xa var1) {
      this.h = var1;
   }

   public class_xa c() {
      return this.h;
   }

   public boolean b(final class_xa var1) {
      class_m var2 = new class_m() {
         public String e_() {
            return var1.e_();
         }

         public class_eu f_() {
            return var1.f_();
         }

         public void a(class_eu var1x) {
         }

         public boolean a(int var1x, String var2) {
            return var1x <= 2;
         }

         public class_cj c() {
            return class_amx.this.c;
         }

         public class_awh d() {
            return new class_awh((double)class_amx.this.c.n() + 0.5D, (double)class_amx.this.c.o() + 0.5D, (double)class_amx.this.c.p() + 0.5D);
         }

         public class_aen e() {
            return var1.e();
         }

         public class_pr f() {
            return var1;
         }

         public boolean u_() {
            return false;
         }

         public void a(class_n.class_a_in_class_n var1x, int var2) {
            class_amx.this.i.a(this, var1x, var2);
         }
      };

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         class_ez var4 = this.a[var3] == null?null:this.a[var3].b();
         if(var4 != null && var4.h() != null) {
            class_et var5 = var4.h();
            if(var5.a() == class_et.class_a_in_class_et.c) {
               MinecraftServer.N().P().a(var2, var5.b());
            }
         }
      }

      return true;
   }

   public class_n d() {
      return this.i;
   }
}