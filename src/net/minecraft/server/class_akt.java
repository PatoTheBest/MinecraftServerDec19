package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_atl;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_zu;

public class class_akt extends class_agj {
   public class_akt(class_atk var1) {
      super(var1);
      this.a(class_zu.b);
   }

   public int a(Random var1) {
      return 2 + var1.nextInt(2);
   }

   public int a(int var1, Random var2) {
      return class_nu.a(this.a(var2) + var2.nextInt(var1 + 1), 1, 5);
   }

   public class_aar a(class_anl var1, Random var2, int var3) {
      return class_aau.cG;
   }

   public class_atl g(class_anl var1) {
      return class_atl.p;
   }

   protected boolean K() {
      return true;
   }
}