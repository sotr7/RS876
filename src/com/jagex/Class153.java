package com.jagex;

import com.jagex.Class162;
import com.jagex.Interface21;
import com.jagex.Interface3;

public abstract class Class153 implements Interface3 {
   public abstract void method1768(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8);

   public abstract void method1769(int[] var1);

   public abstract void method1770(int var1, int var2, int var3, int var4, int var5);

   public abstract int method21();

   public abstract int method1771();

   public final void method1772(int var1, int var2, int var3, int var4) {
      this.method1775(var1, var2, var3, var4, 1, -1, 1, 1);
   }

   public abstract Interface21 method1773();

   public abstract void method1774(int var1, int var2, int var3, int var4, int var5);

   abstract void method1775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public abstract void method1776(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method1777(int var1, int var2, int var3);

   public final void method1778(int var1, int var2) {
      this.method1774(var1, var2, 1, -1, 1);
   }

   public abstract void method1779(int var1, int var2, Class162 var3, int var4, int var5);

   public abstract void method1780(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public final void method1781(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method1775(var1, var2, var3, var4, var5, var6, var7, 1);
   }

   public abstract void method1782(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public final void method1783(int var1, int var2, int var3, int var4) {
      this.method1784(var1, var2, var3, var4, 1, -1, 1);
   }

   public abstract void method1784(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public final void method1785(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.method1801(var1, var2, var3, var4, var5, var6, 1, -1, 1);
   }

   public final void method1786(float var1, float var2, int var3, int var4) {
      this.method1801(var1, var2, (float)this.method21() / 2.0F, (float)this.method1788() / 2.0F, var3, var4, 1, -1, 1);
   }

   public abstract int method1787();

   public abstract int method1788();

   public final void method1789(float var1, float var2, float var3, float var4, int var5, int var6, Class162 var7, int var8, int var9) {
      if(var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (-(-var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.method21() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.method21() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.method1788() - var4) * var12) / 4096.0F + var1;
         float var19 = (-(-var3) * var12 + ((float)this.method1788() - var4) * var13) / 4096.0F + var2;
         this.method1792(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }
   }

   public final void method1790(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.method1791(var1, var2, var3, var4, var5, var6, var7, var8, var9, 1);
   }

   abstract void method1791(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

   final void method1792(float var1, float var2, float var3, float var4, float var5, float var6, Class162 var7, int var8, int var9) {
      this.method1793(var1, var2, var3, var4, var5, var6, 1, var7, var8, var9);
   }

   abstract void method1793(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10);

   public abstract void method1794(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public abstract void method1795(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public abstract void method1796(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public abstract void method1797(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8);

   public abstract void method1798(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8);

   public abstract void method1799(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract int method19();

   public abstract void method1800(int var1, int var2, int var3);

   public final void method1801(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if(var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (-(-var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.method21() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.method21() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.method1788() - var4) * var12) / 4096.0F + var1;
         float var19 = (-(-var3) * var12 + ((float)this.method1788() - var4) * var13) / 4096.0F + var2;
         this.method1790(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }
   }

   public abstract void method1802(int var1, int var2, int var3, int var4, int var5);

   public abstract void method1803(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public abstract void method1804(int var1, int var2, int var3, int var4, int var5);

   public abstract void method1805(int var1, int var2, Class162 var3, int var4, int var5);

   public abstract void method1806(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void method1807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   abstract void method1808(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public abstract void method1809(int var1, int var2, int var3, int var4);

   public abstract void method1810(int[] var1);

   public abstract void method1811(int[] var1);

   public abstract int method1812();

   public abstract int method1813();

   public abstract int method18();

   abstract void method1814(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

   public abstract void method1815(int var1, int var2, int var3, int var4, int var5, int var6);

   public final void method1816(float var1, float var2, int var3, int var4, Class162 var5, int var6, int var7) {
      this.method1789(var1, var2, (float)this.method21() / 2.0F, (float)this.method1788() / 2.0F, var3, var4, var5, var6, var7);
   }

   public abstract int method20();

   public abstract int method1817();

   public abstract int method1818();

   abstract void method1819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   abstract void method1820(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

   abstract void method1821(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10);

   public final void method1822(int var1, int var2) {
      this.method1774(var1, var2, 1, -1, 1);
   }

   public abstract int method1823();

   public final void method1824(int var1, int var2) {
      this.method1774(var1, var2, 1, -1, 1);
   }

   public abstract int method1825();

   public final void method1826(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var5 != 0 && var6 != 0) {
         double var11 = (double)(var7 & '\uffff') * 9.587379924285257E-5D;
         float var13 = (float)Math.sin(var11) * (float)var6;
         float var14 = (float)Math.cos(var11) * (float)var6;
         float var15 = (float)Math.sin(var11) * (float)var5;
         float var16 = (float)Math.cos(var11) * (float)var5;
         float var17 = (-var3 * var16 + -var4 * var13) / 4096.0F + var1;
         float var18 = (-(-var3) * var15 + -var4 * var14) / 4096.0F + var2;
         float var19 = (((float)this.method21() - var3) * var16 + -var4 * var13) / 4096.0F + var1;
         float var20 = (-((float)this.method21() - var3) * var15 + -var4 * var14) / 4096.0F + var2;
         float var21 = (-var3 * var16 + ((float)this.method1788() - var4) * var13) / 4096.0F + var1;
         float var22 = (-(-var3) * var15 + ((float)this.method1788() - var4) * var14) / 4096.0F + var2;
         this.method1790(var17, var18, var19, var20, var21, var22, var8, var9, var10);
      }
   }

   public abstract int method1827();

   public abstract void method1828(int var1, int var2, int var3, int var4);

   public final void method1829(float var1, float var2, int var3, int var4, int var5, int var6, int var7) {
      this.method1801(var1, var2, (float)this.method21() / 2.0F, (float)this.method1788() / 2.0F, var3, var4, var5, var6, var7);
   }

   public abstract Interface21 method1830();
}
