package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.World;
import net.minecraft.server.Block;
import net.minecraft.server.Blocks;
import net.minecraft.server.class_ajs;
import net.minecraft.server.class_ajt;
import net.minecraft.server.class_ajw;
import net.minecraft.server.class_alu;
import net.minecraft.server.IBlockData;
import net.minecraft.server.class_anw;
import net.minecraft.server.class_apw;
import net.minecraft.server.Material;
import net.minecraft.server.BlockPosition;

public class class_arl extends class_apw {
   private static final IBlockData a;
   private static final IBlockData b;

   public class_arl() {
      super(false);
   }

   public boolean b(World var1, Random var2, BlockPosition var3) {
      int var4;
      for(var4 = var2.nextInt(4) + 5; var1.p(var3.shiftDown()).getBlock().getMaterial() == Material.WATER; var3 = var3.shiftDown()) {
         ;
      }

      boolean var5 = true;
      if(var3.getY() >= 1 && var3.getY() + var4 + 1 <= 256) {
         int var9;
         int var10;
         for(int var6 = var3.getY(); var6 <= var3.getY() + 1 + var4; ++var6) {
            byte var7 = 1;
            if(var6 == var3.getY()) {
               var7 = 0;
            }

            if(var6 >= var3.getY() + 1 + var4 - 2) {
               var7 = 3;
            }

            BlockPosition.MutableBlockPosition var8 = new BlockPosition.MutableBlockPosition();

            for(var9 = var3.getX() - var7; var9 <= var3.getX() + var7 && var5; ++var9) {
               for(var10 = var3.getZ() - var7; var10 <= var3.getZ() + var7 && var5; ++var10) {
                  if(var6 >= 0 && var6 < 256) {
                     Block var11 = var1.p(var8.setPosition(var9, var6, var10)).getBlock();
                     if(var11.getMaterial() != Material.AIR && var11.getMaterial() != Material.LEAVES) {
                        if(var11 != Blocks.WATER && var11 != Blocks.FLOWING_WATER) {
                           var5 = false;
                        } else if(var6 > var3.getY()) {
                           var5 = false;
                        }
                     }
                  } else {
                     var5 = false;
                  }
               }
            }
         }

         if(!var5) {
            return false;
         } else {
            Block var17 = var1.p(var3.shiftDown()).getBlock();
            if((var17 == Blocks.GRASS || var17 == Blocks.DIRT) && var3.getY() < 256 - var4 - 1) {
               this.a(var1, var3.shiftDown());

               int var12;
               BlockPosition var14;
               int var18;
               int var19;
               int var21;
               for(var18 = var3.getY() - 3 + var4; var18 <= var3.getY() + var4; ++var18) {
                  var19 = var18 - (var3.getY() + var4);
                  var9 = 2 - var19 / 2;

                  for(var10 = var3.getX() - var9; var10 <= var3.getX() + var9; ++var10) {
                     var21 = var10 - var3.getX();

                     for(var12 = var3.getZ() - var9; var12 <= var3.getZ() + var9; ++var12) {
                        int var13 = var12 - var3.getZ();
                        if(Math.abs(var21) != var9 || Math.abs(var13) != var9 || var2.nextInt(2) != 0 && var19 != 0) {
                           var14 = new BlockPosition(var10, var18, var12);
                           if(!var1.p(var14).getBlock().isFullBlock()) {
                              this.a(var1, var14, b);
                           }
                        }
                     }
                  }
               }

               for(var18 = 0; var18 < var4; ++var18) {
                  Block var20 = var1.p(var3.shiftUp(var18)).getBlock();
                  if(var20.getMaterial() == Material.AIR || var20.getMaterial() == Material.LEAVES || var20 == Blocks.FLOWING_WATER || var20 == Blocks.WATER) {
                     this.a(var1, var3.shiftUp(var18), a);
                  }
               }

               for(var18 = var3.getY() - 3 + var4; var18 <= var3.getY() + var4; ++var18) {
                  var19 = var18 - (var3.getY() + var4);
                  var9 = 2 - var19 / 2;
                  BlockPosition.MutableBlockPosition var22 = new BlockPosition.MutableBlockPosition();

                  for(var21 = var3.getX() - var9; var21 <= var3.getX() + var9; ++var21) {
                     for(var12 = var3.getZ() - var9; var12 <= var3.getZ() + var9; ++var12) {
                        var22.setPosition(var21, var18, var12);
                        if(var1.p(var22).getBlock().getMaterial() == Material.LEAVES) {
                           BlockPosition var23 = var22.shiftWest();
                           var14 = var22.shiftEast();
                           BlockPosition var15 = var22.shiftNorth();
                           BlockPosition var16 = var22.shiftSouth();
                           if(var2.nextInt(4) == 0 && var1.p(var23).getBlock().getMaterial() == Material.AIR) {
                              this.a(var1, var23, class_alu.N);
                           }

                           if(var2.nextInt(4) == 0 && var1.p(var14).getBlock().getMaterial() == Material.AIR) {
                              this.a(var1, var14, class_alu.P);
                           }

                           if(var2.nextInt(4) == 0 && var1.p(var15).getBlock().getMaterial() == Material.AIR) {
                              this.a(var1, var15, class_alu.O);
                           }

                           if(var2.nextInt(4) == 0 && var1.p(var16).getBlock().getMaterial() == Material.AIR) {
                              this.a(var1, var16, class_alu.b);
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void a(World var1, BlockPosition var2, class_anw var3) {
      IBlockData var4 = Blocks.VINE.getBlockData().set(var3, Boolean.valueOf(true));
      this.a(var1, var2, var4);
      int var5 = 4;

      for(var2 = var2.shiftDown(); var1.p(var2).getBlock().getMaterial() == Material.AIR && var5 > 0; --var5) {
         this.a(var1, var2, var4);
         var2 = var2.shiftDown();
      }

   }

   static {
      a = Blocks.LOG.getBlockData().set(class_ajt.b, class_ajw.class_a_in_class_ajw.a);
      b = Blocks.LEAVES.getBlockData().set(class_ajs.Q, class_ajw.class_a_in_class_ajw.a).set(class_ajs.b, Boolean.valueOf(false));
   }
}
