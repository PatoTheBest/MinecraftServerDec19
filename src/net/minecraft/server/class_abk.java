package net.minecraft.server;

import net.minecraft.server.Item;
import net.minecraft.server.class_aas;
import net.minecraft.server.World;
import net.minecraft.server.Block;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_oo;
import net.minecraft.server.class_oq;
import net.minecraft.server.class_xa;
import net.minecraft.server.CreativeTab;

public class class_abk extends Item {
   private Block a;
   private Block b;

   public class_abk(Block var1, Block var2) {
      this.a = var1;
      this.b = var2;
      this.a(CreativeTab.l);
   }

   public class_oq a(class_aas var1, class_xa var2, World var3, class_cj var4, class_oo var5, class_cq var6, float var7, float var8, float var9) {
      if(var6 != class_cq.b) {
         return class_oq.b;
      } else if(!var2.a(var4.a(var6), var6, var1)) {
         return class_oq.b;
      } else if(var3.p(var4).getBlock() == this.b && var3.d(var4.a())) {
         var3.a(var4.a(), this.a.getBlockData());
         --var1.b;
         return class_oq.a;
      } else {
         return class_oq.b;
      }
   }
}
