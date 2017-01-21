package com.jagex;

import com.jagex.Class183;
import com.jagex.Class466;
import com.jagex.Class526_Sub11;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class542;
import com.jagex.Class702;

public class Class526_Sub21_Sub11 extends Class526_Sub21 {
   static Class466 aClass466_11733;
   byte[][] aByteArrayArray11732;
   Class183[] aClass183Array11731;
   int anInt11734;

   public boolean method10641(int var1, int var2) {
      return this.aClass183Array11731[var1].aBool2110;
   }

   public boolean method10642(byte var1) {
      if(null != this.aClass183Array11731) {
         return true;
      } else {
         if(null == this.aByteArrayArray11732) {
            Class466 var2 = aClass466_11733;
            synchronized(var2) {
               if(!aClass466_11733.method5538(this.anInt11734 * 2140419083, (byte)57)) {
                  return false;
               }

               int[] var3 = aClass466_11733.method5542(2140419083 * this.anInt11734, (byte)-92);
               this.aByteArrayArray11732 = new byte[var3.length][];

               for(int var4 = 0; var4 < var3.length; ++var4) {
                  this.aByteArrayArray11732[var4] = aClass466_11733.method5536(2140419083 * this.anInt11734, var3[var4], (byte)79);
               }
            }
         }

         boolean var16 = true;

         int var6;
         for(int var17 = 0; var17 < this.aByteArrayArray11732.length; ++var17) {
            byte[] var19 = this.aByteArrayArray11732[var17];
            RSByteBuffer var5 = new RSByteBuffer(var19);
            var5.pos = 801976415;
            var6 = var5.readUnsignedShort(877419661);
            Class466 var7 = Class542.aClass466_7239;
            synchronized(var7) {
               var16 &= Class542.aClass466_7239.method5537(var6, (byte)95);
            }
         }

         if(!var16) {
            return false;
         } else {
            Class702 var18 = new Class702();
            Class466 var21 = aClass466_11733;
            int[] var20;
            synchronized(var21) {
               var6 = aClass466_11733.method5544(2140419083 * this.anInt11734, -1696680338);
               this.aClass183Array11731 = new Class183[var6];
               var20 = aClass466_11733.method5542(this.anInt11734 * 2140419083, (byte)-3);
            }

            for(int var22 = 0; var22 < var20.length; ++var22) {
               byte[] var23 = this.aByteArrayArray11732[var22];
               RSByteBuffer var24 = new RSByteBuffer(var23);
               var24.pos = 801976415;
               int var8 = var24.readUnsignedShort(1782886245);
               Class526_Sub11 var9 = null;

               for(Class526_Sub11 var10 = (Class526_Sub11)var18.method8206((byte)23); var10 != null; var10 = (Class526_Sub11)var18.method8181(-752240842)) {
                  if(var8 == var10.anInt10428 * 1592502901) {
                     var9 = var10;
                     break;
                  }
               }

               if(var9 == null) {
                  Class466 var25 = Class542.aClass466_7239;
                  synchronized(var25) {
                     var9 = new Class526_Sub11(var8, Class542.aClass466_7239.method5541(var8, 16777472));
                  }

                  var18.method8176(var9, -723261634);
               }

               this.aClass183Array11731[var20[var22]] = new Class183(var23, var9);
            }

            this.aByteArrayArray11732 = (byte[][])null;
            return true;
         }
      }
   }

   public boolean method10643(int var1) {
      return this.aClass183Array11731[var1].aBool2110;
   }

   public Class526_Sub21_Sub11(int var1) {
      this.anInt11734 = -122832989 * var1;
   }

   public boolean method10644(int var1, int var2) {
      return this.aClass183Array11731[var1].aBool2111;
   }

   public boolean method10645(int var1, int var2) {
      return this.aClass183Array11731[var1].aBool2112;
   }

   public boolean method10646() {
      if(null != this.aClass183Array11731) {
         return true;
      } else {
         if(null == this.aByteArrayArray11732) {
            Class466 var1 = aClass466_11733;
            synchronized(var1) {
               if(!aClass466_11733.method5538(this.anInt11734 * 2140419083, (byte)-19)) {
                  return false;
               }

               int[] var2 = aClass466_11733.method5542(2140419083 * this.anInt11734, (byte)-128);
               this.aByteArrayArray11732 = new byte[var2.length][];

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  this.aByteArrayArray11732[var3] = aClass466_11733.method5536(2140419083 * this.anInt11734, var2[var3], (byte)-18);
               }
            }
         }

         boolean var15 = true;

         int var5;
         for(int var16 = 0; var16 < this.aByteArrayArray11732.length; ++var16) {
            byte[] var18 = this.aByteArrayArray11732[var16];
            RSByteBuffer var4 = new RSByteBuffer(var18);
            var4.pos = 801976415;
            var5 = var4.readUnsignedShort(1973936358);
            Class466 var6 = Class542.aClass466_7239;
            synchronized(var6) {
               var15 &= Class542.aClass466_7239.method5537(var5, (byte)64);
            }
         }

         if(!var15) {
            return false;
         } else {
            Class702 var17 = new Class702();
            Class466 var20 = aClass466_11733;
            int[] var19;
            synchronized(var20) {
               var5 = aClass466_11733.method5544(2140419083 * this.anInt11734, -1939174888);
               this.aClass183Array11731 = new Class183[var5];
               var19 = aClass466_11733.method5542(this.anInt11734 * 2140419083, (byte)-1);
            }

            for(int var21 = 0; var21 < var19.length; ++var21) {
               byte[] var22 = this.aByteArrayArray11732[var21];
               RSByteBuffer var23 = new RSByteBuffer(var22);
               var23.pos = 801976415;
               int var7 = var23.readUnsignedShort(633576614);
               Class526_Sub11 var8 = null;

               for(Class526_Sub11 var9 = (Class526_Sub11)var17.method8206((byte)50); var9 != null; var9 = (Class526_Sub11)var17.method8181(1211895216)) {
                  if(var7 == var9.anInt10428 * 1592502901) {
                     var8 = var9;
                     break;
                  }
               }

               if(var8 == null) {
                  Class466 var24 = Class542.aClass466_7239;
                  synchronized(var24) {
                     var8 = new Class526_Sub11(var7, Class542.aClass466_7239.method5541(var7, 16777472));
                  }

                  var17.method8176(var8, -1159642243);
               }

               this.aClass183Array11731[var19[var21]] = new Class183(var22, var8);
            }

            this.aByteArrayArray11732 = (byte[][])null;
            return true;
         }
      }
   }

   public boolean method10647() {
      if(null != this.aClass183Array11731) {
         return true;
      } else {
         if(null == this.aByteArrayArray11732) {
            Class466 var1 = aClass466_11733;
            synchronized(var1) {
               if(!aClass466_11733.method5538(this.anInt11734 * 2140419083, (byte)67)) {
                  return false;
               }

               int[] var2 = aClass466_11733.method5542(2140419083 * this.anInt11734, (byte)-125);
               this.aByteArrayArray11732 = new byte[var2.length][];

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  this.aByteArrayArray11732[var3] = aClass466_11733.method5536(2140419083 * this.anInt11734, var2[var3], (byte)46);
               }
            }
         }

         boolean var15 = true;

         int var5;
         for(int var16 = 0; var16 < this.aByteArrayArray11732.length; ++var16) {
            byte[] var18 = this.aByteArrayArray11732[var16];
            RSByteBuffer var4 = new RSByteBuffer(var18);
            var4.pos = 801976415;
            var5 = var4.readUnsignedShort(1988157598);
            Class466 var6 = Class542.aClass466_7239;
            synchronized(var6) {
               var15 &= Class542.aClass466_7239.method5537(var5, (byte)94);
            }
         }

         if(!var15) {
            return false;
         } else {
            Class702 var17 = new Class702();
            Class466 var20 = aClass466_11733;
            int[] var19;
            synchronized(var20) {
               var5 = aClass466_11733.method5544(2140419083 * this.anInt11734, 1354882518);
               this.aClass183Array11731 = new Class183[var5];
               var19 = aClass466_11733.method5542(this.anInt11734 * 2140419083, (byte)-38);
            }

            for(int var21 = 0; var21 < var19.length; ++var21) {
               byte[] var22 = this.aByteArrayArray11732[var21];
               RSByteBuffer var23 = new RSByteBuffer(var22);
               var23.pos = 801976415;
               int var7 = var23.readUnsignedShort(2088506213);
               Class526_Sub11 var8 = null;

               for(Class526_Sub11 var9 = (Class526_Sub11)var17.method8206((byte)36); var9 != null; var9 = (Class526_Sub11)var17.method8181(-164189189)) {
                  if(var7 == var9.anInt10428 * 1592502901) {
                     var8 = var9;
                     break;
                  }
               }

               if(var8 == null) {
                  Class466 var24 = Class542.aClass466_7239;
                  synchronized(var24) {
                     var8 = new Class526_Sub11(var7, Class542.aClass466_7239.method5541(var7, 16777472));
                  }

                  var17.method8176(var8, -102580298);
               }

               this.aClass183Array11731[var19[var21]] = new Class183(var22, var8);
            }

            this.aByteArrayArray11732 = (byte[][])null;
            return true;
         }
      }
   }

   public boolean method10648(int var1) {
      return this.aClass183Array11731[var1].aBool2110;
   }

   public boolean method10649(int var1) {
      return this.aClass183Array11731[var1].aBool2111;
   }

   public boolean method10650(int var1) {
      return this.aClass183Array11731[var1].aBool2112;
   }
}
