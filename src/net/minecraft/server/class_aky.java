package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_aer;
import net.minecraft.server.class_aet;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_amg;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anz;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_nc;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_zu;

public class class_aky extends class_agj {
   public static final class_anz a = class_anz.a("layers", 1, 8);

   protected class_aky() {
      super(class_atk.y);
      this.j(this.M.b().a(a, Integer.valueOf(1)));
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
      this.a(class_zu.c);
      this.j();
   }

   public boolean b(class_aer var1, class_cj var2) {
      return ((Integer)var1.p(var2).b(a)).intValue() < 5;
   }

   public class_awf a(class_aen var1, class_cj var2, class_anl var3) {
      int var4 = ((Integer)var3.b(a)).intValue() - 1;
      float var5 = 0.125F;
      return new class_awf((double)var2.n() + this.B, (double)var2.o() + this.C, (double)var2.p() + this.D, (double)var2.n() + this.E, (double)((float)var2.o() + (float)var4 * var5), (double)var2.p() + this.G);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void j() {
      this.b(0);
   }

   public void a(class_aer var1, class_cj var2) {
      class_anl var3 = var1.p(var2);
      this.b(((Integer)var3.b(a)).intValue());
   }

   protected void b(int var1) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, (float)var1 / 8.0F, 1.0F);
   }

   public boolean d(class_aen var1, class_cj var2) {
      class_anl var3 = var1.p(var2.b());
      class_agj var4 = var3.c();
      return var4 != class_agk.aI && var4 != class_agk.cB?(var4.v() == class_atk.j?true:(var4 == this && ((Integer)var3.b(a)).intValue() >= 7?true:var4.c() && var4.J.c())):false;
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, class_agj var4) {
      this.e(var1, var2, var3);
   }

   private boolean e(class_aen var1, class_cj var2, class_anl var3) {
      if(!this.d(var1, var2)) {
         this.b(var1, var2, var3, 0);
         var1.g(var2);
         return false;
      } else {
         return true;
      }
   }

   public void a(class_aen var1, class_xa var2, class_cj var3, class_anl var4, class_amg var5, class_aas var6) {
      a(var1, var3, new class_aas(class_aau.aF, ((Integer)var4.b(a)).intValue() + 1, 0));
      var1.g(var3);
      var2.b(class_nc.ab[class_agj.a((class_agj)this)]);
   }

   public class_aar a(class_anl var1, Random var2, int var3) {
      return class_aau.aF;
   }

   public int a(Random var1) {
      return 0;
   }

   public void b(class_aen var1, class_cj var2, class_anl var3, Random var4) {
      if(var1.b(class_aet.b, var2) > 11) {
         this.b(var1, var2, var1.p(var2), 0);
         var1.g(var2);
      }

   }

   public class_anl a(int var1) {
      return this.S().a(a, Integer.valueOf((var1 & 7) + 1));
   }

   public boolean a(class_aen var1, class_cj var2) {
      return ((Integer)var1.p(var2).b(a)).intValue() == 1;
   }

   public int c(class_anl var1) {
      return ((Integer)var1.b(a)).intValue() - 1;
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{a});
   }
}