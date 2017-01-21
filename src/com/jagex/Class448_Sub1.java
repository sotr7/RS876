package com.jagex;

import com.jagex.Class20;
import com.jagex.Class200;
import com.jagex.Class255;
import com.jagex.Class40_Sub1;
import com.jagex.Class448;
import com.jagex.Class451;
import com.jagex.Class453;
import com.jagex.Class460;
import com.jagex.Class462;
import com.jagex.Class525_Sub1;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub15;
import com.jagex.Class526_Sub21_Sub15_Sub1;
import com.jagex.PaddedResourceRequest;
import com.jagex.Class526_Sub21_Sub15_Sub3;
import com.jagex.Class564;
import com.jagex.Class702;
import java.util.zip.CRC32;

public class Class448_Sub1 extends Class448 {
   static final byte aByte10213 = 0;
   static final byte aByte10215 = -1;
   static final byte aByte10226 = 1;
   static final int anInt10227 = 1000;
   static final int anInt10228 = 250;
   static final int anInt10230 = 0;
   static final int anInt10231 = 1;
   static final int anInt10232 = 2;
   public static Class40_Sub1 aClass40_Sub1_10233;
   boolean aBool10218;
   boolean aBool10220;
   Class702 aClass702_10223;
   int anInt10209;
   byte[] aByteArray10210;
   int anInt10211;
   Class462 aClass462_10212;
   Class526_Sub21_Sub15 aClass526_Sub21_Sub15_10202;
   long aLong10225 = 0L;
   boolean aBool10208;
   int anInt10222 = 0;
   int anInt10217 = 0;
   static CRC32 aCRC32_10229 = new CRC32();
   Class20 aClass20_10219 = new Class20(16);
   Class702 aClass702_10224 = new Class702();
   int anInt10214;
   Class564 aClass564_10206;
   Class564 aClass564_10216;
   Class460 aClass460_10203;
   Class453 aClass453_10204;
   Class451 aClass451_10205;
   boolean aBool10207;
   byte[] aByteArray10221;

   public void method9192(byte var1) {
      if(this.aClass453_10204 == null) {
         if(null != this.aClass564_10206) {
            this.aBool10218 = true;
            this.aBool10220 = true;
            if(null == this.aClass702_10223) {
               this.aClass702_10223 = new Class702();
            }

         }
      }
   }

   void method9193(int var1, byte[] var2, int var3, int var4, int var5) {
      if(!this.method9194(var1, var2, var3, var4, -1735211238)) {
         this.anInt10209 = 1645922739 * var1;
         this.aByteArray10210 = var2;
         this.anInt10211 = 1965705697 * var3;
         this.aClass462_10212 = null;
         this.aClass526_Sub21_Sub15_10202 = null;
         if(!this.aClass460_10203.method5428(-1871382260)) {
            this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, 1068121633 * this.anInt10214, (byte)0, true, 626378799);
         }

      }
   }

   boolean method9194(int var1, byte[] var2, int var3, int var4, int var5) {
      if(1947274619 * this.anInt10209 == var1 && var3 == -1379943903 * this.anInt10211) {
         boolean var6 = true;

         for(int var7 = 0; var7 < this.aByteArray10210.length; ++var7) {
            if(var2[var7] != this.aByteArray10210[var7]) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         }
      }

      return false;
   }

   void method9195(boolean var1, byte var2) {
      this.aClass453_10204.method5379(var1, (short)256);
   }

   public int method9196() {
      return this.anInt10217 * -885187161;
   }

   void method9197(int var1) {
      if(null != this.aClass702_10223) {
         if(this.method5324(2065192975) == null) {
            return;
         }

         boolean var2;
         Class526 var3;
         int var4;
         if(this.aBool10208) {
            var2 = true;

            for(var3 = this.aClass702_10223.method8206((byte)82); null != var3; var3 = this.aClass702_10223.method8181(-117800663)) {
               var4 = (int)(-6805155999452426801L * var3.aLong7156);
               if(0 == this.aByteArray10221[var4]) {
                  this.method9198(var4, 1, -902394400);
               }

               if(0 != this.aByteArray10221[var4]) {
                  var3.method6332(-1949449864);
               } else {
                  var2 = false;
               }
            }

            while(this.anInt10222 * 1662896713 < this.aClass462_10212.anIntArray5222.length) {
               if(0 == this.aClass462_10212.anIntArray5222[this.anInt10222 * 1662896713]) {
                  this.anInt10222 += 227297273;
               } else {
                  if(-658259673 * this.aClass451_10205.anInt4934 >= 250) {
                     var2 = false;
                     break;
                  }

                  if(this.aByteArray10221[1662896713 * this.anInt10222] == 0) {
                     this.method9198(this.anInt10222 * 1662896713, 1, -902394400);
                  }

                  if(0 == this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     var3 = new Class526();
                     var3.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var3, -227754128);
                     var2 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var2) {
               this.aBool10208 = false;
               this.anInt10222 = 0;
            }
         } else if(this.aBool10218) {
            var2 = true;

            for(var3 = this.aClass702_10223.method8206((byte)53); var3 != null; var3 = this.aClass702_10223.method8181(-765212236)) {
               var4 = (int)(var3.aLong7156 * -6805155999452426801L);
               if(1 != this.aByteArray10221[var4]) {
                  this.method9198(var4, 2, -902394400);
               }

               if(1 == this.aByteArray10221[var4]) {
                  var3.method6332(-1949449864);
               } else {
                  var2 = false;
               }
            }

            while(1662896713 * this.anInt10222 < this.aClass462_10212.anIntArray5222.length) {
               if(this.aClass462_10212.anIntArray5222[1662896713 * this.anInt10222] == 0) {
                  this.anInt10222 += 227297273;
               } else {
                  if(this.aClass460_10203.method5427(-259322185)) {
                     var2 = false;
                     break;
                  }

                  if(1 != this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     this.method9198(this.anInt10222 * 1662896713, 2, -902394400);
                  }

                  if(1 != this.aByteArray10221[1662896713 * this.anInt10222]) {
                     var3 = new Class526();
                     var3.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var3, -1508376261);
                     var2 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var2) {
               this.aBool10218 = false;
               this.anInt10222 = 0;
            }
         } else {
            this.aClass702_10223 = null;
         }
      }

      if(this.aBool10207 && Class255.time((byte)24) >= -53029946852169957L * this.aLong10225) {
         for(Class526_Sub21_Sub15 var5 = (Class526_Sub21_Sub15)this.aClass20_10219.method638(753202953); var5 != null; var5 = (Class526_Sub21_Sub15)this.aClass20_10219.method639(-2101910711)) {
            if(!var5.waiting) {
               if(var5.aBool11828) {
                  if(!var5.aBool11829) {
                     throw new RuntimeException();
                  }

                  var5.method6332(-1949449864);
               } else {
                  var5.aBool11828 = true;
               }
            }
         }

         this.aLong10225 = (Class255.time((byte)24) + 1000L) * 8642710768338918163L;
      }

   }

   Class526_Sub21_Sub15 method9198(int var1, int var2, int var3) {
      Object var4 = (Class526_Sub21_Sub15)this.aClass20_10219.get((long)var1);
      if(var4 != null && var2 == 0 && !((Class526_Sub21_Sub15)var4).aBool11829 && ((Class526_Sub21_Sub15)var4).waiting) {
         ((Class526_Sub21_Sub15)var4).method6332(-1949449864);
         var4 = null;
      }

      if(null == var4) {
         if(0 == var2) {
            if(this.aClass564_10206 != null && this.aByteArray10221[var1] != -1) {
               var4 = this.aClass451_10205.method5345(var1, this.aClass564_10206, -2128866053);
            } else if(this.aClass453_10204 != null) {
               var4 = this.aClass453_10204.method5377(1068121633 * this.anInt10214, var1, (byte)2, true, this.aClass462_10212.anIntArray5224[var1], this.aClass462_10212.anIntArray5219[var1], 1118593195);
               if(var4 == null) {
                  return null;
               }
            } else {
               if(this.aClass460_10203.method5428(-1871382260)) {
                  return null;
               }

               var4 = this.aClass460_10203.method5445(1068121633 * this.anInt10214, var1, (byte)2, true, -1903915246);
            }
         } else if(var2 == 1) {
            if(null == this.aClass564_10206) {
               throw new RuntimeException();
            }

            var4 = this.aClass451_10205.method5346(var1, this.aClass564_10206, (byte)-40);
         } else {
            if(2 != var2) {
               throw new RuntimeException();
            }

            if(null == this.aClass564_10206) {
               throw new RuntimeException();
            }

            if(-1 != this.aByteArray10221[var1]) {
               throw new RuntimeException();
            }

            if(null != this.aClass453_10204) {
               return null;
            }

            if(this.aClass460_10203.method5427(1765636998)) {
               return null;
            }

            var4 = this.aClass460_10203.method5445(1068121633 * this.anInt10214, var1, (byte)2, false, 1080464818);
         }

         this.aClass20_10219.put((Class526)var4, (long)var1);
      }

      if(((Class526_Sub21_Sub15)var4).waiting) {
         return null;
      } else {
         byte[] var5 = ((Class526_Sub21_Sub15)var4).method10704(1112733014);
         int var6;
         byte[] var7;
         byte[] var8;
         int var9;
         Class526_Sub21_Sub15_Sub3 var12;
         PaddedResourceRequest var14;
         if(var4 instanceof Class526_Sub21_Sub15_Sub1) {
            try {
               if(var5 != null && var5.length > 2) {
                  aCRC32_10229.reset();
                  aCRC32_10229.update(var5, 0, var5.length - 2);
                  var6 = (int)aCRC32_10229.getValue();
                  if(this.aClass462_10212.anIntArray5224[var1] != var6) {
                     throw new RuntimeException();
                  } else {
                     if(this.aClass462_10212.aByteArrayArray5212 != null && this.aClass462_10212.aByteArrayArray5212[var1] != null) {
                        var7 = this.aClass462_10212.aByteArrayArray5212[var1];
                        var8 = Class200.method2872(var5, 0, var5.length - 2, 898176578);

                        for(var9 = 0; var9 < 64; ++var9) {
                           if(var7[var9] != var8[var9]) {
                              throw new RuntimeException();
                           }
                        }
                     }

                     int var13 = (var5[var5.length - 1] & 255) + ((var5[var5.length - 2] & 255) << 8);
                     if(var13 != (this.aClass462_10212.anIntArray5219[var1] & '\uffff')) {
                        throw new RuntimeException();
                     } else {
                        if(1 != this.aByteArray10221[var1]) {
                           if(this.aByteArray10221[var1] == 0) {
                              ;
                           }

                           this.anInt10217 += 791788055;
                           this.aByteArray10221[var1] = 1;
                        }

                        if(!((Class526_Sub21_Sub15)var4).aBool11829) {
                           ((Class526_Sub21_Sub15)var4).method6332(-1949449864);
                        }

                        return (Class526_Sub21_Sub15)var4;
                     }
                  }
               } else {
                  throw new RuntimeException();
               }
            } catch (Exception var10) {
               this.aByteArray10221[var1] = -1;
               ((Class526_Sub21_Sub15)var4).method6332(-1949449864);
               if(((Class526_Sub21_Sub15)var4).aBool11829) {
                  if(this.aClass453_10204 != null) {
                     if(!this.aClass453_10204.method5375(-1882150032)) {
                        var12 = this.aClass453_10204.method5377(1068121633 * this.anInt10214, var1, (byte)2, true, this.aClass462_10212.anIntArray5224[var1], this.aClass462_10212.anIntArray5219[var1], 2070194660);
                        if(var12 != null) {
                           this.aClass20_10219.put(var12, (long)var1);
                        }
                     }
                  } else if(!this.aClass460_10203.method5428(-1871382260)) {
                     var14 = this.aClass460_10203.method5445(1068121633 * this.anInt10214, var1, (byte)2, true, 1472887246);
                     this.aClass20_10219.put(var14, (long)var1);
                  }
               }

               return null;
            }
         } else {
            try {
               if(var5 == null || var5.length <= 2) {
                  if(null != this.aClass453_10204) {
                     ((Class526_Sub21_Sub15)var4).method6332(-1949449864);
                     return null;
                  }

                  throw new RuntimeException();
               }

               aCRC32_10229.reset();
               aCRC32_10229.update(var5, 0, var5.length - 2);
               var6 = (int)aCRC32_10229.getValue();
               if(var6 != this.aClass462_10212.anIntArray5224[var1]) {
                  throw new RuntimeException();
               }

               if(this.aClass462_10212.aByteArrayArray5212 != null && null != this.aClass462_10212.aByteArrayArray5212[var1]) {
                  var7 = this.aClass462_10212.aByteArrayArray5212[var1];
                  var8 = Class200.method2872(var5, 0, var5.length - 2, 496102327);

                  for(var9 = 0; var9 < 64; ++var9) {
                     if(var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                     }
                  }
               }

               if(this.aClass453_10204 != null) {
                  this.aClass460_10203.errors = 0;
                  this.aClass460_10203.status = 0;
               }
            } catch (RuntimeException var11) {
               this.aClass460_10203.method5444(1068121633 * this.anInt10214, var1, (byte)-61);
               ((Class526_Sub21_Sub15)var4).method6332(-1949449864);
               if(((Class526_Sub21_Sub15)var4).aBool11829) {
                  if(null != this.aClass453_10204) {
                     if(!this.aClass453_10204.method5375(-1882150032)) {
                        var12 = this.aClass453_10204.method5377(1068121633 * this.anInt10214, var1, (byte)2, true, this.aClass462_10212.anIntArray5224[var1], this.aClass462_10212.anIntArray5219[var1], 634798255);
                        if(var12 != null) {
                           this.aClass20_10219.put(var12, (long)var1);
                        }
                     }
                  } else if(!this.aClass460_10203.method5428(-1871382260)) {
                     var14 = this.aClass460_10203.method5445(this.anInt10214 * 1068121633, var1, (byte)2, true, 2041588311);
                     this.aClass20_10219.put(var14, (long)var1);
                  }
               }

               return null;
            }

            var5[var5.length - 2] = (byte)(this.aClass462_10212.anIntArray5219[var1] >>> 8);
            var5[var5.length - 1] = (byte)this.aClass462_10212.anIntArray5219[var1];
            if(null != this.aClass564_10206) {
               this.aClass451_10205.method5352(var1, var5, this.aClass564_10206, (byte)110);
               if(1 != this.aByteArray10221[var1]) {
                  this.anInt10217 += 791788055;
                  this.aByteArray10221[var1] = 1;
               }
            }

            if(!((Class526_Sub21_Sub15)var4).aBool11829) {
               ((Class526_Sub21_Sub15)var4).method6332(-1949449864);
            }

            return (Class526_Sub21_Sub15)var4;
         }
      }
   }

   void method9199(byte var1) {
      if(this.aClass702_10223 != null) {
         if(this.method5324(2002911061) != null) {
            for(Class526 var2 = this.aClass702_10224.method8206((byte)94); var2 != null; var2 = this.aClass702_10224.method8181(-88448708)) {
               int var3 = (int)(-6805155999452426801L * var2.aLong7156);
               if(var3 >= 0 && var3 < this.aClass462_10212.anInt5215 * 42702579 && 0 != this.aClass462_10212.anIntArray5222[var3]) {
                  if(this.aByteArray10221[var3] == 0) {
                     this.method9198(var3, 1, -902394400);
                  }

                  if(-1 == this.aByteArray10221[var3]) {
                     this.method9198(var3, 2, -902394400);
                  }

                  if(1 == this.aByteArray10221[var3]) {
                     var2.method6332(-1949449864);
                  }
               } else {
                  var2.method6332(-1949449864);
               }
            }

         }
      }
   }

   public int method9200(byte var1) {
      return this.aClass462_10212 == null?0:this.aClass462_10212.anInt5211 * 497900677;
   }

   public int method9201(int var1) {
      return this.anInt10217 * -885187161;
   }

   void method9202(boolean var1) {
      this.aClass453_10204.method5379(var1, (short)256);
   }

   boolean method9203(int var1) {
      return null != this.aClass453_10204;
   }

   int method5326(int var1, int var2) {
      Class526_Sub21_Sub15 var3 = (Class526_Sub21_Sub15)this.aClass20_10219.get((long)var1);
      return null != var3?var3.method10703(-1218753450):0;
   }

   public boolean method9204(byte var1) {
      return this.aBool10220;
   }

   public int method9205() {
      if(null == this.aClass462_10212) {
         return 0;
      } else if(!this.aBool10208) {
         return 497900677 * this.aClass462_10212.anInt5211;
      } else {
         Class526 var1 = this.aClass702_10223.method8206((byte)112);
         return null == var1?0:(int)(-6805155999452426801L * var1.aLong7156);
      }
   }

   Class448_Sub1(int var1, Class564 var2, Class564 var3, Class460 var4, Class453 var5, Class451 var6, int var7, byte[] var8, int var9, boolean var10, int var11) {
      this.anInt10214 = var1 * 932234721;
      this.aClass564_10206 = var2;
      if(null == this.aClass564_10206) {
         this.aBool10208 = false;
      } else {
         this.aBool10208 = true;
         this.aClass702_10223 = new Class702();
      }

      this.aClass564_10216 = var3;
      this.aClass460_10203 = var4;
      this.aClass453_10204 = var5;
      this.aClass451_10205 = var6;
      this.anInt10209 = 1645922739 * var7;
      this.aByteArray10210 = var8;
      this.anInt10211 = var9 * 1965705697;
      this.aBool10207 = var10;
      if(this.aClass564_10216 != null) {
         this.aClass526_Sub21_Sub15_10202 = this.aClass451_10205.method5345(this.anInt10214 * 1068121633, this.aClass564_10216, -1267369596);
      }

   }

   byte[] method5325(int var1, byte var2) {
      Class526_Sub21_Sub15 var3 = this.method9198(var1, 0, -902394400);
      if(null == var3) {
         return null;
      } else {
         byte[] var4 = var3.method10704(-282665028);
         var3.method6332(-1949449864);
         return var4;
      }
   }

   Class462 method5327() {
      if(this.aClass462_10212 != null) {
         return this.aClass462_10212;
      } else {
         if(this.aClass526_Sub21_Sub15_10202 == null) {
            if(this.aClass460_10203.method5428(-1871382260)) {
               return null;
            }

            this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, 1068121633 * this.anInt10214, (byte)0, true, -21509941);
         }

         if(this.aClass526_Sub21_Sub15_10202.waiting) {
            return null;
         } else {
            byte[] var1 = this.aClass526_Sub21_Sub15_10202.method10704(-2061558269);
            if(this.aClass526_Sub21_Sub15_10202 instanceof Class526_Sub21_Sub15_Sub1) {
               try {
                  if(null == var1) {
                     throw new RuntimeException();
                  }

                  this.aClass462_10212 = new Class462(var1, 1947274619 * this.anInt10209, this.aByteArray10210);
                  if(this.anInt10211 * -1379943903 != -2046556537 * this.aClass462_10212.anInt5210) {
                     throw new RuntimeException();
                  }
               } catch (RuntimeException var3) {
                  this.aClass462_10212 = null;
                  if(this.aClass460_10203.method5428(-1871382260)) {
                     this.aClass526_Sub21_Sub15_10202 = null;
                  } else {
                     this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, this.anInt10214 * 1068121633, (byte)0, true, 1625670850);
                  }

                  return null;
               }
            } else {
               try {
                  if(null == var1) {
                     throw new RuntimeException();
                  }

                  this.aClass462_10212 = new Class462(var1, 1947274619 * this.anInt10209, this.aByteArray10210);
               } catch (RuntimeException var4) {
                  this.aClass460_10203.method5444(255, 1068121633 * this.anInt10214, (byte)-22);
                  this.aClass462_10212 = null;
                  if(this.aClass460_10203.method5428(-1871382260)) {
                     this.aClass526_Sub21_Sub15_10202 = null;
                  } else {
                     this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, this.anInt10214 * 1068121633, (byte)0, true, -1609199429);
                  }

                  return null;
               }

               if(null != this.aClass564_10216) {
                  this.aClass451_10205.method5352(this.anInt10214 * 1068121633, var1, this.aClass564_10216, (byte)78);
               }
            }

            this.aClass526_Sub21_Sub15_10202 = null;
            if(null != this.aClass564_10206) {
               this.aByteArray10221 = new byte[42702579 * this.aClass462_10212.anInt5215];
               this.anInt10217 = 0;
            }

            return this.aClass462_10212;
         }
      }
   }

   void method5323(int var1) {
      if(null != this.aClass564_10206) {
         Class526 var2;
         for(var2 = this.aClass702_10224.method8206((byte)62); var2 != null; var2 = this.aClass702_10224.method8181(-582590192)) {
            if(-6805155999452426801L * var2.aLong7156 == (long)var1) {
               return;
            }
         }

         var2 = new Class526();
         var2.aLong7156 = (long)var1 * -7608595443915499217L;
         this.aClass702_10224.method8176(var2, -1024890644);
      }
   }

   int method5328(int var1) {
      Class526_Sub21_Sub15 var2 = (Class526_Sub21_Sub15)this.aClass20_10219.get((long)var1);
      return null != var2?var2.method10703(-1680716874):0;
   }

   int method5330(int var1) {
      Class526_Sub21_Sub15 var2 = (Class526_Sub21_Sub15)this.aClass20_10219.get((long)var1);
      return null != var2?var2.method10703(-1086835509):0;
   }

   void method5322(int var1, int var2) {
      if(null != this.aClass564_10206) {
         Class526 var3;
         for(var3 = this.aClass702_10224.method8206((byte)33); var3 != null; var3 = this.aClass702_10224.method8181(1695875803)) {
            if(-6805155999452426801L * var3.aLong7156 == (long)var1) {
               return;
            }
         }

         var3 = new Class526();
         var3.aLong7156 = (long)var1 * -7608595443915499217L;
         this.aClass702_10224.method8176(var3, -467107236);
      }
   }

   public int method9206() {
      return this.method5324(2016348807) == null?(null == this.aClass526_Sub21_Sub15_10202?0:this.aClass526_Sub21_Sub15_10202.method10703(-492234216)):100;
   }

   public int method9207() {
      return this.method5324(2018918857) == null?(null == this.aClass526_Sub21_Sub15_10202?0:this.aClass526_Sub21_Sub15_10202.method10703(-1268215598)):100;
   }

   Class462 method5329() {
      if(this.aClass462_10212 != null) {
         return this.aClass462_10212;
      } else {
         if(this.aClass526_Sub21_Sub15_10202 == null) {
            if(this.aClass460_10203.method5428(-1871382260)) {
               return null;
            }

            this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, 1068121633 * this.anInt10214, (byte)0, true, -276440112);
         }

         if(this.aClass526_Sub21_Sub15_10202.waiting) {
            return null;
         } else {
            byte[] var1 = this.aClass526_Sub21_Sub15_10202.method10704(1682948866);
            if(this.aClass526_Sub21_Sub15_10202 instanceof Class526_Sub21_Sub15_Sub1) {
               try {
                  if(null == var1) {
                     throw new RuntimeException();
                  }

                  this.aClass462_10212 = new Class462(var1, 1947274619 * this.anInt10209, this.aByteArray10210);
                  if(this.anInt10211 * -1379943903 != -2046556537 * this.aClass462_10212.anInt5210) {
                     throw new RuntimeException();
                  }
               } catch (RuntimeException var3) {
                  this.aClass462_10212 = null;
                  if(this.aClass460_10203.method5428(-1871382260)) {
                     this.aClass526_Sub21_Sub15_10202 = null;
                  } else {
                     this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, this.anInt10214 * 1068121633, (byte)0, true, -2087897878);
                  }

                  return null;
               }
            } else {
               try {
                  if(null == var1) {
                     throw new RuntimeException();
                  }

                  this.aClass462_10212 = new Class462(var1, 1947274619 * this.anInt10209, this.aByteArray10210);
               } catch (RuntimeException var4) {
                  this.aClass460_10203.method5444(255, 1068121633 * this.anInt10214, (byte)-46);
                  this.aClass462_10212 = null;
                  if(this.aClass460_10203.method5428(-1871382260)) {
                     this.aClass526_Sub21_Sub15_10202 = null;
                  } else {
                     this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, this.anInt10214 * 1068121633, (byte)0, true, -2055135970);
                  }

                  return null;
               }

               if(null != this.aClass564_10216) {
                  this.aClass451_10205.method5352(this.anInt10214 * 1068121633, var1, this.aClass564_10216, (byte)70);
               }
            }

            this.aClass526_Sub21_Sub15_10202 = null;
            if(null != this.aClass564_10206) {
               this.aByteArray10221 = new byte[42702579 * this.aClass462_10212.anInt5215];
               this.anInt10217 = 0;
            }

            return this.aClass462_10212;
         }
      }
   }

   void method9208() {
      if(this.aClass702_10223 != null) {
         if(this.method5324(1552719406) != null) {
            for(Class526 var1 = this.aClass702_10224.method8206((byte)103); var1 != null; var1 = this.aClass702_10224.method8181(1264916769)) {
               int var2 = (int)(-6805155999452426801L * var1.aLong7156);
               if(var2 >= 0 && var2 < this.aClass462_10212.anInt5215 * 42702579 && 0 != this.aClass462_10212.anIntArray5222[var2]) {
                  if(this.aByteArray10221[var2] == 0) {
                     this.method9198(var2, 1, -902394400);
                  }

                  if(-1 == this.aByteArray10221[var2]) {
                     this.method9198(var2, 2, -902394400);
                  }

                  if(1 == this.aByteArray10221[var2]) {
                     var1.method6332(-1949449864);
                  }
               } else {
                  var1.method6332(-1949449864);
               }
            }

         }
      }
   }

   void method9209() {
      if(null != this.aClass702_10223) {
         if(this.method5324(1708151615) == null) {
            return;
         }

         boolean var1;
         Class526 var2;
         int var3;
         if(this.aBool10208) {
            var1 = true;

            for(var2 = this.aClass702_10223.method8206((byte)127); null != var2; var2 = this.aClass702_10223.method8181(-147380564)) {
               var3 = (int)(-6805155999452426801L * var2.aLong7156);
               if(0 == this.aByteArray10221[var3]) {
                  this.method9198(var3, 1, -902394400);
               }

               if(0 != this.aByteArray10221[var3]) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = false;
               }
            }

            while(this.anInt10222 * 1662896713 < this.aClass462_10212.anIntArray5222.length) {
               if(0 == this.aClass462_10212.anIntArray5222[this.anInt10222 * 1662896713]) {
                  this.anInt10222 += 227297273;
               } else {
                  if(-658259673 * this.aClass451_10205.anInt4934 >= 250) {
                     var1 = false;
                     break;
                  }

                  if(this.aByteArray10221[1662896713 * this.anInt10222] == 0) {
                     this.method9198(this.anInt10222 * 1662896713, 1, -902394400);
                  }

                  if(0 == this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     var2 = new Class526();
                     var2.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var2, -1524398086);
                     var1 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var1) {
               this.aBool10208 = false;
               this.anInt10222 = 0;
            }
         } else if(this.aBool10218) {
            var1 = true;

            for(var2 = this.aClass702_10223.method8206((byte)42); var2 != null; var2 = this.aClass702_10223.method8181(1065695782)) {
               var3 = (int)(var2.aLong7156 * -6805155999452426801L);
               if(1 != this.aByteArray10221[var3]) {
                  this.method9198(var3, 2, -902394400);
               }

               if(1 == this.aByteArray10221[var3]) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = false;
               }
            }

            while(1662896713 * this.anInt10222 < this.aClass462_10212.anIntArray5222.length) {
               if(this.aClass462_10212.anIntArray5222[1662896713 * this.anInt10222] == 0) {
                  this.anInt10222 += 227297273;
               } else {
                  if(this.aClass460_10203.method5427(1633451973)) {
                     var1 = false;
                     break;
                  }

                  if(1 != this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     this.method9198(this.anInt10222 * 1662896713, 2, -902394400);
                  }

                  if(1 != this.aByteArray10221[1662896713 * this.anInt10222]) {
                     var2 = new Class526();
                     var2.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var2, -668276897);
                     var1 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var1) {
               this.aBool10218 = false;
               this.anInt10222 = 0;
            }
         } else {
            this.aClass702_10223 = null;
         }
      }

      if(this.aBool10207 && Class255.time((byte)24) >= -53029946852169957L * this.aLong10225) {
         for(Class526_Sub21_Sub15 var4 = (Class526_Sub21_Sub15)this.aClass20_10219.method638(1384510353); var4 != null; var4 = (Class526_Sub21_Sub15)this.aClass20_10219.method639(2108135436)) {
            if(!var4.waiting) {
               if(var4.aBool11828) {
                  if(!var4.aBool11829) {
                     throw new RuntimeException();
                  }

                  var4.method6332(-1949449864);
               } else {
                  var4.aBool11828 = true;
               }
            }
         }

         this.aLong10225 = (Class255.time((byte)24) + 1000L) * 8642710768338918163L;
      }

   }

   void method9210() {
      if(null != this.aClass702_10223) {
         if(this.method5324(1370172505) == null) {
            return;
         }

         boolean var1;
         Class526 var2;
         int var3;
         if(this.aBool10208) {
            var1 = true;

            for(var2 = this.aClass702_10223.method8206((byte)28); null != var2; var2 = this.aClass702_10223.method8181(2020765093)) {
               var3 = (int)(-6805155999452426801L * var2.aLong7156);
               if(0 == this.aByteArray10221[var3]) {
                  this.method9198(var3, 1, -902394400);
               }

               if(0 != this.aByteArray10221[var3]) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = false;
               }
            }

            while(this.anInt10222 * 1662896713 < this.aClass462_10212.anIntArray5222.length) {
               if(0 == this.aClass462_10212.anIntArray5222[this.anInt10222 * 1662896713]) {
                  this.anInt10222 += 227297273;
               } else {
                  if(-658259673 * this.aClass451_10205.anInt4934 >= 250) {
                     var1 = false;
                     break;
                  }

                  if(this.aByteArray10221[1662896713 * this.anInt10222] == 0) {
                     this.method9198(this.anInt10222 * 1662896713, 1, -902394400);
                  }

                  if(0 == this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     var2 = new Class526();
                     var2.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var2, -801954678);
                     var1 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var1) {
               this.aBool10208 = false;
               this.anInt10222 = 0;
            }
         } else if(this.aBool10218) {
            var1 = true;

            for(var2 = this.aClass702_10223.method8206((byte)40); var2 != null; var2 = this.aClass702_10223.method8181(1322326628)) {
               var3 = (int)(var2.aLong7156 * -6805155999452426801L);
               if(1 != this.aByteArray10221[var3]) {
                  this.method9198(var3, 2, -902394400);
               }

               if(1 == this.aByteArray10221[var3]) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = false;
               }
            }

            while(1662896713 * this.anInt10222 < this.aClass462_10212.anIntArray5222.length) {
               if(this.aClass462_10212.anIntArray5222[1662896713 * this.anInt10222] == 0) {
                  this.anInt10222 += 227297273;
               } else {
                  if(this.aClass460_10203.method5427(320028275)) {
                     var1 = false;
                     break;
                  }

                  if(1 != this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     this.method9198(this.anInt10222 * 1662896713, 2, -902394400);
                  }

                  if(1 != this.aByteArray10221[1662896713 * this.anInt10222]) {
                     var2 = new Class526();
                     var2.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var2, -1199817440);
                     var1 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var1) {
               this.aBool10218 = false;
               this.anInt10222 = 0;
            }
         } else {
            this.aClass702_10223 = null;
         }
      }

      if(this.aBool10207 && Class255.time((byte)24) >= -53029946852169957L * this.aLong10225) {
         for(Class526_Sub21_Sub15 var4 = (Class526_Sub21_Sub15)this.aClass20_10219.method638(-471568990); var4 != null; var4 = (Class526_Sub21_Sub15)this.aClass20_10219.method639(-266708268)) {
            if(!var4.waiting) {
               if(var4.aBool11828) {
                  if(!var4.aBool11829) {
                     throw new RuntimeException();
                  }

                  var4.method6332(-1949449864);
               } else {
                  var4.aBool11828 = true;
               }
            }
         }

         this.aLong10225 = (Class255.time((byte)24) + 1000L) * 8642710768338918163L;
      }

   }

   void method9211() {
      if(null != this.aClass702_10223) {
         if(this.method5324(1484072289) == null) {
            return;
         }

         boolean var1;
         Class526 var2;
         int var3;
         if(this.aBool10208) {
            var1 = true;

            for(var2 = this.aClass702_10223.method8206((byte)63); null != var2; var2 = this.aClass702_10223.method8181(892101983)) {
               var3 = (int)(-6805155999452426801L * var2.aLong7156);
               if(0 == this.aByteArray10221[var3]) {
                  this.method9198(var3, 1, -902394400);
               }

               if(0 != this.aByteArray10221[var3]) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = false;
               }
            }

            while(this.anInt10222 * 1662896713 < this.aClass462_10212.anIntArray5222.length) {
               if(0 == this.aClass462_10212.anIntArray5222[this.anInt10222 * 1662896713]) {
                  this.anInt10222 += 227297273;
               } else {
                  if(-658259673 * this.aClass451_10205.anInt4934 >= 250) {
                     var1 = false;
                     break;
                  }

                  if(this.aByteArray10221[1662896713 * this.anInt10222] == 0) {
                     this.method9198(this.anInt10222 * 1662896713, 1, -902394400);
                  }

                  if(0 == this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     var2 = new Class526();
                     var2.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var2, -1354245582);
                     var1 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var1) {
               this.aBool10208 = false;
               this.anInt10222 = 0;
            }
         } else if(this.aBool10218) {
            var1 = true;

            for(var2 = this.aClass702_10223.method8206((byte)37); var2 != null; var2 = this.aClass702_10223.method8181(-454570561)) {
               var3 = (int)(var2.aLong7156 * -6805155999452426801L);
               if(1 != this.aByteArray10221[var3]) {
                  this.method9198(var3, 2, -902394400);
               }

               if(1 == this.aByteArray10221[var3]) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = false;
               }
            }

            while(1662896713 * this.anInt10222 < this.aClass462_10212.anIntArray5222.length) {
               if(this.aClass462_10212.anIntArray5222[1662896713 * this.anInt10222] == 0) {
                  this.anInt10222 += 227297273;
               } else {
                  if(this.aClass460_10203.method5427(774722990)) {
                     var1 = false;
                     break;
                  }

                  if(1 != this.aByteArray10221[this.anInt10222 * 1662896713]) {
                     this.method9198(this.anInt10222 * 1662896713, 2, -902394400);
                  }

                  if(1 != this.aByteArray10221[1662896713 * this.anInt10222]) {
                     var2 = new Class526();
                     var2.aLong7156 = -4258290369570929561L * (long)this.anInt10222;
                     this.aClass702_10223.method8176(var2, -1349845922);
                     var1 = false;
                  }

                  this.anInt10222 += 227297273;
               }
            }

            if(var1) {
               this.aBool10218 = false;
               this.anInt10222 = 0;
            }
         } else {
            this.aClass702_10223 = null;
         }
      }

      if(this.aBool10207 && Class255.time((byte)24) >= -53029946852169957L * this.aLong10225) {
         for(Class526_Sub21_Sub15 var4 = (Class526_Sub21_Sub15)this.aClass20_10219.method638(-1857978006); var4 != null; var4 = (Class526_Sub21_Sub15)this.aClass20_10219.method639(1497616925)) {
            if(!var4.waiting) {
               if(var4.aBool11828) {
                  if(!var4.aBool11829) {
                     throw new RuntimeException();
                  }

                  var4.method6332(-1949449864);
               } else {
                  var4.aBool11828 = true;
               }
            }
         }

         this.aLong10225 = (Class255.time((byte)24) + 1000L) * 8642710768338918163L;
      }

   }

   public int method9212() {
      return this.aClass462_10212 == null?0:this.aClass462_10212.anInt5211 * 497900677;
   }

   public int method9213() {
      return this.aClass462_10212 == null?0:this.aClass462_10212.anInt5211 * 497900677;
   }

   public boolean method9214() {
      return this.aBool10220;
   }

   public int method9215() {
      return this.anInt10217 * -885187161;
   }

   public int method9216() {
      if(null == this.aClass462_10212) {
         return 0;
      } else if(!this.aBool10208) {
         return 497900677 * this.aClass462_10212.anInt5211;
      } else {
         Class526 var1 = this.aClass702_10223.method8206((byte)110);
         return null == var1?0:(int)(-6805155999452426801L * var1.aLong7156);
      }
   }

   Class462 method5324(int var1) {
      if(this.aClass462_10212 != null) {
         return this.aClass462_10212;
      } else {
         if(this.aClass526_Sub21_Sub15_10202 == null) {
            if(this.aClass460_10203.method5428(-1871382260)) {
               return null;
            }

            this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, 1068121633 * this.anInt10214, (byte)0, true, -190555990);
         }

         if(this.aClass526_Sub21_Sub15_10202.waiting) {
            return null;
         } else {
            byte[] var2 = this.aClass526_Sub21_Sub15_10202.method10704(628678241);
            if(this.aClass526_Sub21_Sub15_10202 instanceof Class526_Sub21_Sub15_Sub1) {
               try {
                  if(null == var2) {
                     throw new RuntimeException();
                  }

                  this.aClass462_10212 = new Class462(var2, 1947274619 * this.anInt10209, this.aByteArray10210);
                  if(this.anInt10211 * -1379943903 != -2046556537 * this.aClass462_10212.anInt5210) {
                     throw new RuntimeException();
                  }
               } catch (RuntimeException var4) {
                  this.aClass462_10212 = null;
                  if(this.aClass460_10203.method5428(-1871382260)) {
                     this.aClass526_Sub21_Sub15_10202 = null;
                  } else {
                     this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, this.anInt10214 * 1068121633, (byte)0, true, -983794963);
                  }

                  return null;
               }
            } else {
               try {
                  if(null == var2) {
                     throw new RuntimeException();
                  }

                  this.aClass462_10212 = new Class462(var2, 1947274619 * this.anInt10209, this.aByteArray10210);
               } catch (RuntimeException var5) {
                  this.aClass460_10203.method5444(255, 1068121633 * this.anInt10214, (byte)-16);
                  this.aClass462_10212 = null;
                  if(this.aClass460_10203.method5428(-1871382260)) {
                     this.aClass526_Sub21_Sub15_10202 = null;
                  } else {
                     this.aClass526_Sub21_Sub15_10202 = this.aClass460_10203.method5445(255, this.anInt10214 * 1068121633, (byte)0, true, 524242087);
                  }

                  return null;
               }

               if(null != this.aClass564_10216) {
                  this.aClass451_10205.method5352(this.anInt10214 * 1068121633, var2, this.aClass564_10216, (byte)52);
               }
            }

            this.aClass526_Sub21_Sub15_10202 = null;
            if(null != this.aClass564_10206) {
               this.aByteArray10221 = new byte[42702579 * this.aClass462_10212.anInt5215];
               this.anInt10217 = 0;
            }

            return this.aClass462_10212;
         }
      }
   }

   public boolean method9217() {
      return this.aBool10220;
   }

   public int method9218(int var1) {
      if(null == this.aClass462_10212) {
         return 0;
      } else if(!this.aBool10208) {
         return 497900677 * this.aClass462_10212.anInt5211;
      } else {
         Class526 var2 = this.aClass702_10223.method8206((byte)110);
         return null == var2?0:(int)(-6805155999452426801L * var2.aLong7156);
      }
   }

   public boolean method9219() {
      return this.aBool10220;
   }

   void method9220(boolean var1) {
      this.aClass453_10204.method5379(var1, (short)256);
   }

   public int method9221(byte var1) {
      return this.method5324(2123278240) == null?(null == this.aClass526_Sub21_Sub15_10202?0:this.aClass526_Sub21_Sub15_10202.method10703(-1913350645)):100;
   }

   void method9222(boolean var1) {
      this.aClass453_10204.method5379(var1, (short)256);
   }

   boolean method9223() {
      return null != this.aClass453_10204;
   }

   public static int method9224(int var0, int var1) {
      return 50675075 * Class525_Sub1.anInt10729 == var0?(Class525_Sub1.aBool10732?1:0):(var0 == Class525_Sub1.anInt10704 * 490863479?(Class525_Sub1.aBool10726?1:0):(var0 == -1011460715 * Class525_Sub1.anInt10705?(Class525_Sub1.aBool10731?1:0):-1));
   }
}
