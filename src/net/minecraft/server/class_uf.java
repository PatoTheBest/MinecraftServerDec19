package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import net.minecraft.server.Item;
import net.minecraft.server.ItemStack;
import net.minecraft.server.Items;
import net.minecraft.server.class_act;
import net.minecraft.server.World;
import net.minecraft.server.Block;
import net.minecraft.server.Blocks;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.class_on;
import net.minecraft.server.EnumUsedHand;
import net.minecraft.server.class_po;
import net.minecraft.server.EntityLiving;
import net.minecraft.server.class_qd;
import net.minecraft.server.Datawathcer;
import net.minecraft.server.class_qk;
import net.minecraft.server.class_re;
import net.minecraft.server.class_rh;
import net.minecraft.server.class_rj;
import net.minecraft.server.class_rl;
import net.minecraft.server.class_rr;
import net.minecraft.server.class_se;
import net.minecraft.server.class_sh;
import net.minecraft.server.class_si;
import net.minecraft.server.class_sr;
import net.minecraft.server.class_tf;
import net.minecraft.server.class_tw;
import net.minecraft.server.EntityItem;
import net.minecraft.server.class_wl;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.Container;
import net.minecraft.server.class_yg;
import net.minecraft.server.EnumColor;

public class class_uf extends class_tw {
   private static final int bs = Datawathcer.claimId(class_uf.class);
   private final class_yg bt = new class_yg(new Container() {
      public boolean a(EntityHuman var1) {
         return false;
      }
   }, 2, 1);
   private static final Map bu = Maps.newEnumMap(EnumColor.class);
   private int bw;
   private class_rh bx = new class_rh(this);

   public static float[] a(EnumColor var0) {
      return (float[])bu.get(var0);
   }

   public class_uf(World var1) {
      super(var1);
      this.a(0.9F, 1.3F);
      ((class_tf)this.u()).a(true);
      this.i.a(0, new class_rj(this));
      this.i.a(1, new class_se(this, 1.25D));
      this.i.a(2, new class_re(this, 1.0D));
      this.i.a(3, new class_sr(this, 1.1D, Items.Q, false));
      this.i.a(4, new class_rl(this, 1.1D));
      this.i.a(5, this.bx);
      this.i.a(6, new class_si(this, 1.0D));
      this.i.a(7, new class_rr(this, EntityHuman.class, 6.0F));
      this.i.a(8, new class_sh(this));
      this.bt.setItem(0, new ItemStack(Items.aY));
      this.bt.setItem(1, new ItemStack(Items.aY));
   }

   protected void cc() {
      this.bw = this.bx.f();
      super.cc();
   }

   public void m() {
      if(this.o.isClientSide) {
         this.bw = Math.max(0, this.bw - 1);
      }

      super.m();
   }

   protected void aY() {
      super.aY();
      this.a((class_qk)class_wl.a).a(8.0D);
      this.a((class_qk)class_wl.d).a(0.23000000417232513D);
   }

   protected void h() {
      super.h();
      this.ac.add(bs, new Byte((byte)0));
   }

   protected void b(boolean var1, int var2) {
      if(!this.cB()) {
         this.a(new ItemStack(Item.getItemOf(Blocks.WOOL), 1, this.cA().a()), 0.0F);
      }

      int var3 = this.V.nextInt(2) + 1 + this.V.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         if(this.av()) {
            this.a(Items.bp, 1);
         } else {
            this.a(Items.bo, 1);
         }
      }

   }

   protected Item D() {
      return Item.getItemOf(Blocks.WOOL);
   }

   public boolean a(EntityHuman var1, EnumUsedHand var2, ItemStack var3) {
      if(var3 != null && var3.getItem() == Items.bg && !this.cB() && !this.j_()) {
         if(!this.o.isClientSide) {
            this.m(true);
            int var4 = 1 + this.V.nextInt(3);

            for(int var5 = 0; var5 < var4; ++var5) {
               EntityItem var6 = this.a(new ItemStack(Item.getItemOf(Blocks.WOOL), 1, this.cA().a()), 1.0F);
               var6.motY += (double)(this.V.nextFloat() * 0.05F);
               var6.v += (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.1F);
               var6.x += (double)((this.V.nextFloat() - this.V.nextFloat()) * 0.1F);
            }
         }

         var3.a(1, (EntityLiving)var1);
         this.a("mob.sheep.shear", 1.0F, 1.0F);
      }

      return super.a(var1, var2, var3);
   }

   public void b(NBTTagCompound var1) {
      super.b(var1);
      var1.put("Sheared", this.cB());
      var1.put("Color", (byte)this.cA().a());
   }

   public void a(NBTTagCompound var1) {
      super.a(var1);
      this.m(var1.getBoolean("Sheared"));
      this.b(EnumColor.b(var1.getByte("Color")));
   }

   protected String C() {
      return "mob.sheep.say";
   }

   protected String bp() {
      return "mob.sheep.say";
   }

   protected String bq() {
      return "mob.sheep.say";
   }

   protected void a(BlockPosition var1, Block var2) {
      this.a("mob.sheep.step", 0.15F, 1.0F);
   }

   public EnumColor cA() {
      return EnumColor.b(this.ac.getByte(bs) & 15);
   }

   public void b(EnumColor var1) {
      byte var2 = this.ac.getByte(bs);
      this.ac.b(bs, Byte.valueOf((byte)(var2 & 240 | var1.a() & 15)));
   }

   public boolean cB() {
      return (this.ac.getByte(bs) & 16) != 0;
   }

   public void m(boolean var1) {
      byte var2 = this.ac.getByte(bs);
      if(var1) {
         this.ac.b(bs, Byte.valueOf((byte)(var2 | 16)));
      } else {
         this.ac.b(bs, Byte.valueOf((byte)(var2 & -17)));
      }

   }

   public static EnumColor a(Random var0) {
      int var1 = var0.nextInt(100);
      return var1 < 5?EnumColor.p:(var1 < 10?EnumColor.h:(var1 < 15?EnumColor.i:(var1 < 18?EnumColor.m:(var0.nextInt(500) == 0?EnumColor.g:EnumColor.a))));
   }

   public class_uf b(class_po var1) {
      class_uf var2 = (class_uf)var1;
      class_uf var3 = new class_uf(this.o);
      var3.b(this.a((class_tw)this, (class_tw)var2));
      return var3;
   }

   public void x() {
      this.m(false);
      if(this.j_()) {
         this.a(60);
      }

   }

   public class_qd a(class_on var1, class_qd var2) {
      var2 = super.a(var1, var2);
      this.b(a(this.o.random));
      return var2;
   }

   private EnumColor a(class_tw var1, class_tw var2) {
      int var3 = ((class_uf)var1).cA().b();
      int var4 = ((class_uf)var2).cA().b();
      this.bt.getItem(0).setData(var3);
      this.bt.getItem(1).setData(var4);
      ItemStack var5 = class_act.a().a(this.bt, ((class_uf)var1).o);
      int var6;
      if(var5 != null && var5.getItem() == Items.aY) {
         var6 = var5.i();
      } else {
         var6 = this.o.random.nextBoolean()?var3:var4;
      }

      return EnumColor.a(var6);
   }

   public float aU() {
      return 0.95F * this.K;
   }

   // $FF: synthetic method
   public class_po a(class_po var1) {
      return this.b(var1);
   }

   static {
      bu.put(EnumColor.a, new float[]{1.0F, 1.0F, 1.0F});
      bu.put(EnumColor.b, new float[]{0.85F, 0.5F, 0.2F});
      bu.put(EnumColor.c, new float[]{0.7F, 0.3F, 0.85F});
      bu.put(EnumColor.d, new float[]{0.4F, 0.6F, 0.85F});
      bu.put(EnumColor.e, new float[]{0.9F, 0.9F, 0.2F});
      bu.put(EnumColor.f, new float[]{0.5F, 0.8F, 0.1F});
      bu.put(EnumColor.g, new float[]{0.95F, 0.5F, 0.65F});
      bu.put(EnumColor.h, new float[]{0.3F, 0.3F, 0.3F});
      bu.put(EnumColor.i, new float[]{0.6F, 0.6F, 0.6F});
      bu.put(EnumColor.j, new float[]{0.3F, 0.5F, 0.6F});
      bu.put(EnumColor.k, new float[]{0.5F, 0.25F, 0.7F});
      bu.put(EnumColor.l, new float[]{0.2F, 0.3F, 0.7F});
      bu.put(EnumColor.m, new float[]{0.4F, 0.3F, 0.2F});
      bu.put(EnumColor.n, new float[]{0.4F, 0.5F, 0.2F});
      bu.put(EnumColor.o, new float[]{0.6F, 0.2F, 0.2F});
      bu.put(EnumColor.p, new float[]{0.1F, 0.1F, 0.1F});
   }
}
