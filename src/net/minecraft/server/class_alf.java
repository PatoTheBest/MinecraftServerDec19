package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.World;
import net.minecraft.server.Block;
import net.minecraft.server.Blocks;
import net.minecraft.server.class_ahp;
import net.minecraft.server.class_ajd;
import net.minecraft.server.IBlockData;
import net.minecraft.server.Material;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;

public class class_alf extends class_ajd {
   protected class_alf(Material var1) {
      super(var1);
      this.setTicking(false);
      if(var1 == Material.i) {
         this.setTicking(true);
      }

   }

   public void a(World var1, class_cj var2, IBlockData var3, Block var4) {
      if(!this.e(var1, var2, var3)) {
         this.f(var1, var2, var3);
      }

   }

   private void f(World var1, class_cj var2, IBlockData var3) {
      class_ahp var4 = a(this.material);
      var1.a((class_cj)var2, (IBlockData)var4.getBlockData().set(b, var3.get(b)), 2);
      var1.a((class_cj)var2, (Block)var4, this.a(var1));
   }

   public void b(World var1, class_cj var2, IBlockData var3, Random var4) {
      if(this.material == Material.i) {
         if(var1.R().b("doFireTick")) {
            int var5 = var4.nextInt(3);
            if(var5 > 0) {
               class_cj var6 = var2;

               for(int var7 = 0; var7 < var5; ++var7) {
                  var6 = var6.a(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
                  Block var8 = var1.p(var6).getBlock();
                  if(var8.material == Material.a) {
                     if(this.f(var1, var6)) {
                        var1.a(var6, Blocks.FIRE.getBlockData());
                        return;
                     }
                  } else if(var8.material.isSolid()) {
                     return;
                  }
               }
            } else {
               for(int var9 = 0; var9 < 3; ++var9) {
                  class_cj var10 = var2.a(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
                  if(var1.d(var10.a()) && this.m(var1, var10)) {
                     var1.a(var10.a(), Blocks.FIRE.getBlockData());
                  }
               }
            }

         }
      }
   }

   protected boolean f(World var1, class_cj var2) {
      class_cq[] var3 = class_cq.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         class_cq var6 = var3[var5];
         if(this.m(var1, var2.a(var6))) {
            return true;
         }
      }

      return false;
   }

   private boolean m(World var1, class_cj var2) {
      return var1.p(var2).getBlock().getMaterial().h();
   }
}
