package net.minecraft.server;

import net.minecraft.server.class_agj;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_any;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_ny;
import net.minecraft.server.class_zu;

public class class_ali extends class_agj {
   public static final class_any a = class_any.a("variant", class_ali.class_a_in_class_ali.class);
   public static final int b;
   public static final int N;
   public static final int O;
   public static final int P;

   public class_ali() {
      super(class_atk.e);
      this.j(this.M.b().a(a, class_ali.class_a_in_class_ali.a));
      this.a(class_zu.b);
   }

   public int a(class_anl var1) {
      return ((class_ali.class_a_in_class_ali)var1.b(a)).a();
   }

   public class_anl a(int var1) {
      return this.S().a(a, class_ali.class_a_in_class_ali.a(var1));
   }

   public int c(class_anl var1) {
      return ((class_ali.class_a_in_class_ali)var1.b(a)).a();
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{a});
   }

   static {
      b = class_ali.class_a_in_class_ali.a.a();
      N = class_ali.class_a_in_class_ali.b.a();
      O = class_ali.class_a_in_class_ali.c.a();
      P = class_ali.class_a_in_class_ali.d.a();
   }

   public static enum class_a_in_class_ali implements class_ny {
      a(0, "stonebrick", "default"),
      b(1, "mossy_stonebrick", "mossy"),
      c(2, "cracked_stonebrick", "cracked"),
      d(3, "chiseled_stonebrick", "chiseled");

      private static final class_ali.class_a_in_class_ali[] e;
      private final int f;
      private final String g;
      private final String h;

      private class_a_in_class_ali(int var3, String var4, String var5) {
         this.f = var3;
         this.g = var4;
         this.h = var5;
      }

      public int a() {
         return this.f;
      }

      public String toString() {
         return this.g;
      }

      public static class_ali.class_a_in_class_ali a(int var0) {
         if(var0 < 0 || var0 >= e.length) {
            var0 = 0;
         }

         return e[var0];
      }

      public String l() {
         return this.g;
      }

      public String c() {
         return this.h;
      }

      static {
         e = new class_ali.class_a_in_class_ali[values().length];
         class_ali.class_a_in_class_ali[] var0 = values();
         int var1 = var0.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            class_ali.class_a_in_class_ali var3 = var0[var2];
            e[var3.a()] = var3;
         }

      }
   }
}