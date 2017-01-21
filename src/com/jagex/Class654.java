package com.jagex;

import com.jagex.Class201;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class36;
import com.jagex.Class378;
import com.jagex.Class502;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub29;
import com.jagex.RSByteBuffer;
import com.jagex.Class661;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.client;
import java.util.Iterator;

public abstract class Class654 {
   long aLong8481 = 2721876005558904567L;
   int anInt8484 = -865655211;
   int anInt8485 = -37925327;
   long aLong8483 = 3913797519321321789L;
   Class702 aClass702_8482 = new Class702();

   abstract int method7798();

   int method7799(Class526_Sub29 var1, int var2, int var3) {
      long var4;
      if(-1L == 4393539348596442425L * this.aLong8481) {
         var4 = (long)var2;
      } else {
         var4 = var1.method9532(-1974791608) - 4393539348596442425L * this.aLong8481;
         if(var4 > (long)var2) {
            var4 = (long)var2;
         }
      }

      this.aLong8481 = var1.method9532(-1550135170) * -2721876005558904567L;
      return (int)var4;
   }

   abstract void method7800();

   abstract boolean method7801();

   abstract int method7802(byte var1);

   abstract void method7803(RSByteBuffer var1, Class526_Sub29 var2, int var3);

   abstract void method7804(byte var1);

   abstract boolean method7805(int var1);

   abstract OutFrameBuffer method7806(int var1);

   void method7807() {
      if(this.method7805(-1893222735)) {
         OutFrameBuffer var1 = null;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         Iterator var5 = this.aClass702_8482.iterator();

         label100:
         while(true) {
            while(true) {
               if(!var5.hasNext()) {
                  break label100;
               }

               Class526_Sub29 var6 = (Class526_Sub29)var5.next();
               if(var1 != null && var1.out.pos * 301018015 - var2 >= 252 - (6 + this.method7802((byte)83))) {
                  break label100;
               }

               var6.method6332(-1949449864);
               int var7 = var6.method9530(1762748637);
               if(var7 < -1) {
                  var7 = -1;
               } else if(var7 > '\ufffe') {
                  var7 = '\ufffe';
               }

               int var8 = var6.method9527((byte)67);
               if(var8 < -1) {
                  var8 = -1;
               } else if(var8 > '\ufffe') {
                  var8 = '\ufffe';
               }

               if(this.anInt8484 * 1704679683 == var8 && var7 == this.anInt8485 * 1171698991) {
                  var6.method9533((byte)-61);
               } else {
                  if(var1 == null) {
                     var1 = this.method7806(1656472412);
                     var1.out.writeByte(0, 1273273864);
                     var2 = 301018015 * var1.out.pos;
                     var1.out.pos += 1603952830;
                     var3 = 0;
                     var4 = 0;
                  }

                  int var9;
                  int var10;
                  int var11;
                  if(-1L != this.aLong8483 * 2949132011686556139L) {
                     var9 = var8 - 1704679683 * this.anInt8484;
                     var10 = var7 - 1171698991 * this.anInt8485;
                     var11 = (int)((var6.method9532(-1820904677) - this.aLong8483 * 2949132011686556139L) / 20L);
                     var3 = (int)((long)var3 + (var6.method9532(-1420541511) - this.aLong8483 * 2949132011686556139L) % 20L);
                  } else {
                     var9 = var8;
                     var10 = var7;
                     var11 = Integer.MAX_VALUE;
                  }

                  this.anInt8484 = 865655211 * var8;
                  this.anInt8485 = 37925327 * var7;
                  if(var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                     var9 += 32;
                     var10 += 32;
                     var1.out.writeShort(var10 + (var11 << 12) + (var9 << 6), -805078716);
                  } else if(var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                     var9 += 128;
                     var10 += 128;
                     var1.out.writeByte(var11 + 128, -254307038);
                     var1.out.writeShort(var10 + (var9 << 8), -805078716);
                  } else if(var11 < 32) {
                     var1.out.writeByte(var11 + 192, -1344712692);
                     if(-1 != var8 && var7 != -1) {
                        var1.out.writeInt(var8 | var7 << 16, -357564953);
                     } else {
                        var1.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  } else {
                     var1.out.writeShort('\ue000' + (var11 & 8191), -805078716);
                     if(var8 != -1 && var7 != -1) {
                        var1.out.writeInt(var8 | var7 << 16, -357564953);
                     } else {
                        var1.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  }

                  ++var4;
                  this.method7803(var1.out, var6, 1802514924);
                  this.aLong8483 = var6.method9532(-1903353888) * -3913797519321321789L;
                  var6.method9533((byte)-107);
               }
            }
         }

         if(var1 != null) {
            var1.out.method9678(301018015 * var1.out.pos - var2, (byte)-29);
            int var12 = var1.out.pos * 301018015;
            var1.out.pos = var2 * 801976415;
            var1.out.writeByte(var3 / var4, 1157262253);
            var1.out.writeByte(var3 % var4, 575740356);
            var1.out.pos = var12 * 801976415;
            client.aClass111_11060.write(var1, (byte)-67);
         }
      }

      this.method7804((byte)9);
   }

   void method7808() {
      if(this.method7805(-377768878)) {
         OutFrameBuffer var1 = null;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         Iterator var5 = this.aClass702_8482.iterator();

         label100:
         while(true) {
            while(true) {
               if(!var5.hasNext()) {
                  break label100;
               }

               Class526_Sub29 var6 = (Class526_Sub29)var5.next();
               if(var1 != null && var1.out.pos * 301018015 - var2 >= 252 - (6 + this.method7802((byte)89))) {
                  break label100;
               }

               var6.method6332(-1949449864);
               int var7 = var6.method9530(1762748637);
               if(var7 < -1) {
                  var7 = -1;
               } else if(var7 > '\ufffe') {
                  var7 = '\ufffe';
               }

               int var8 = var6.method9527((byte)1);
               if(var8 < -1) {
                  var8 = -1;
               } else if(var8 > '\ufffe') {
                  var8 = '\ufffe';
               }

               if(this.anInt8484 * 1704679683 == var8 && var7 == this.anInt8485 * 1171698991) {
                  var6.method9533((byte)-106);
               } else {
                  if(var1 == null) {
                     var1 = this.method7806(1743818229);
                     var1.out.writeByte(0, -1065618972);
                     var2 = 301018015 * var1.out.pos;
                     var1.out.pos += 1603952830;
                     var3 = 0;
                     var4 = 0;
                  }

                  int var9;
                  int var10;
                  int var11;
                  if(-1L != this.aLong8483 * 2949132011686556139L) {
                     var9 = var8 - 1704679683 * this.anInt8484;
                     var10 = var7 - 1171698991 * this.anInt8485;
                     var11 = (int)((var6.method9532(-1493667484) - this.aLong8483 * 2949132011686556139L) / 20L);
                     var3 = (int)((long)var3 + (var6.method9532(-2147259378) - this.aLong8483 * 2949132011686556139L) % 20L);
                  } else {
                     var9 = var8;
                     var10 = var7;
                     var11 = Integer.MAX_VALUE;
                  }

                  this.anInt8484 = 865655211 * var8;
                  this.anInt8485 = 37925327 * var7;
                  if(var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                     var9 += 32;
                     var10 += 32;
                     var1.out.writeShort(var10 + (var11 << 12) + (var9 << 6), -805078716);
                  } else if(var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                     var9 += 128;
                     var10 += 128;
                     var1.out.writeByte(var11 + 128, -1457289731);
                     var1.out.writeShort(var10 + (var9 << 8), -805078716);
                  } else if(var11 < 32) {
                     var1.out.writeByte(var11 + 192, 639497900);
                     if(-1 != var8 && var7 != -1) {
                        var1.out.writeInt(var8 | var7 << 16, -357564953);
                     } else {
                        var1.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  } else {
                     var1.out.writeShort('\ue000' + (var11 & 8191), -805078716);
                     if(var8 != -1 && var7 != -1) {
                        var1.out.writeInt(var8 | var7 << 16, -357564953);
                     } else {
                        var1.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  }

                  ++var4;
                  this.method7803(var1.out, var6, 1373383483);
                  this.aLong8483 = var6.method9532(-1697351785) * -3913797519321321789L;
                  var6.method9533((byte)-86);
               }
            }
         }

         if(var1 != null) {
            var1.out.method9678(301018015 * var1.out.pos - var2, (byte)-49);
            int var12 = var1.out.pos * 301018015;
            var1.out.pos = var2 * 801976415;
            var1.out.writeByte(var3 / var4, 1048670284);
            var1.out.writeByte(var3 % var4, 1598844674);
            var1.out.pos = var12 * 801976415;
            client.aClass111_11060.write(var1, (byte)-76);
         }
      }

      this.method7804((byte)9);
   }

   void method7809(byte var1) {
      this.aClass702_8482.method8188(-1882282776);
      this.aLong8481 = 2721876005558904567L;
      this.aLong8483 = 3913797519321321789L;
      this.anInt8484 = -865655211;
      this.anInt8485 = -37925327;
   }

   abstract boolean method7810();

   void method7811(byte var1) {
      if(this.method7805(-1389117853)) {
         OutFrameBuffer var2 = null;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         Iterator var6 = this.aClass702_8482.iterator();

         label100:
         while(true) {
            while(true) {
               if(!var6.hasNext()) {
                  break label100;
               }

               Class526_Sub29 var7 = (Class526_Sub29)var6.next();
               if(var2 != null && var2.out.pos * 301018015 - var3 >= 252 - (6 + this.method7802((byte)116))) {
                  break label100;
               }

               var7.method6332(-1949449864);
               int var8 = var7.method9530(1762748637);
               if(var8 < -1) {
                  var8 = -1;
               } else if(var8 > '\ufffe') {
                  var8 = '\ufffe';
               }

               int var9 = var7.method9527((byte)127);
               if(var9 < -1) {
                  var9 = -1;
               } else if(var9 > '\ufffe') {
                  var9 = '\ufffe';
               }

               if(this.anInt8484 * 1704679683 == var9 && var8 == this.anInt8485 * 1171698991) {
                  var7.method9533((byte)-127);
               } else {
                  if(var2 == null) {
                     var2 = this.method7806(1732964968);
                     var2.out.writeByte(0, 420757300);
                     var3 = 301018015 * var2.out.pos;
                     var2.out.pos += 1603952830;
                     var4 = 0;
                     var5 = 0;
                  }

                  int var10;
                  int var11;
                  int var12;
                  if(-1L != this.aLong8483 * 2949132011686556139L) {
                     var10 = var9 - 1704679683 * this.anInt8484;
                     var11 = var8 - 1171698991 * this.anInt8485;
                     var12 = (int)((var7.method9532(-1841723319) - this.aLong8483 * 2949132011686556139L) / 20L);
                     var4 = (int)((long)var4 + (var7.method9532(-1697872149) - this.aLong8483 * 2949132011686556139L) % 20L);
                  } else {
                     var10 = var9;
                     var11 = var8;
                     var12 = Integer.MAX_VALUE;
                  }

                  this.anInt8484 = 865655211 * var9;
                  this.anInt8485 = 37925327 * var8;
                  if(var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                     var10 += 32;
                     var11 += 32;
                     var2.out.writeShort(var11 + (var12 << 12) + (var10 << 6), -805078716);
                  } else if(var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                     var10 += 128;
                     var11 += 128;
                     var2.out.writeByte(var12 + 128, -203561445);
                     var2.out.writeShort(var11 + (var10 << 8), -805078716);
                  } else if(var12 < 32) {
                     var2.out.writeByte(var12 + 192, -1108204801);
                     if(-1 != var9 && var8 != -1) {
                        var2.out.writeInt(var9 | var8 << 16, -357564953);
                     } else {
                        var2.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  } else {
                     var2.out.writeShort('\ue000' + (var12 & 8191), -805078716);
                     if(var9 != -1 && var8 != -1) {
                        var2.out.writeInt(var9 | var8 << 16, -357564953);
                     } else {
                        var2.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  }

                  ++var5;
                  this.method7803(var2.out, var7, 1738658756);
                  this.aLong8483 = var7.method9532(-1981412102) * -3913797519321321789L;
                  var7.method9533((byte)-101);
               }
            }
         }

         if(var2 != null) {
            var2.out.method9678(301018015 * var2.out.pos - var3, (byte)-34);
            int var13 = var2.out.pos * 301018015;
            var2.out.pos = var3 * 801976415;
            var2.out.writeByte(var4 / var5, 1905198829);
            var2.out.writeByte(var4 % var5, -1952268766);
            var2.out.pos = var13 * 801976415;
            client.aClass111_11060.write(var2, (byte)-3);
         }
      }

      this.method7804((byte)9);
   }

   abstract void method7812(RSByteBuffer var1, Class526_Sub29 var2);

   abstract OutFrameBuffer method7813();

   void method7814(Class526_Sub29 var1, int var2) {
      this.aClass702_8482.method8176(var1, -1900626973);
   }

   abstract void method7815();

   void method7816() {
      if(this.method7805(-71898849)) {
         OutFrameBuffer var1 = null;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         Iterator var5 = this.aClass702_8482.iterator();

         label100:
         while(true) {
            while(true) {
               if(!var5.hasNext()) {
                  break label100;
               }

               Class526_Sub29 var6 = (Class526_Sub29)var5.next();
               if(var1 != null && var1.out.pos * 301018015 - var2 >= 252 - (6 + this.method7802((byte)48))) {
                  break label100;
               }

               var6.method6332(-1949449864);
               int var7 = var6.method9530(1762748637);
               if(var7 < -1) {
                  var7 = -1;
               } else if(var7 > '\ufffe') {
                  var7 = '\ufffe';
               }

               int var8 = var6.method9527((byte)64);
               if(var8 < -1) {
                  var8 = -1;
               } else if(var8 > '\ufffe') {
                  var8 = '\ufffe';
               }

               if(this.anInt8484 * 1704679683 == var8 && var7 == this.anInt8485 * 1171698991) {
                  var6.method9533((byte)-107);
               } else {
                  if(var1 == null) {
                     var1 = this.method7806(1644410974);
                     var1.out.writeByte(0, 1774331108);
                     var2 = 301018015 * var1.out.pos;
                     var1.out.pos += 1603952830;
                     var3 = 0;
                     var4 = 0;
                  }

                  int var9;
                  int var10;
                  int var11;
                  if(-1L != this.aLong8483 * 2949132011686556139L) {
                     var9 = var8 - 1704679683 * this.anInt8484;
                     var10 = var7 - 1171698991 * this.anInt8485;
                     var11 = (int)((var6.method9532(-2053549926) - this.aLong8483 * 2949132011686556139L) / 20L);
                     var3 = (int)((long)var3 + (var6.method9532(-1996802423) - this.aLong8483 * 2949132011686556139L) % 20L);
                  } else {
                     var9 = var8;
                     var10 = var7;
                     var11 = Integer.MAX_VALUE;
                  }

                  this.anInt8484 = 865655211 * var8;
                  this.anInt8485 = 37925327 * var7;
                  if(var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                     var9 += 32;
                     var10 += 32;
                     var1.out.writeShort(var10 + (var11 << 12) + (var9 << 6), -805078716);
                  } else if(var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                     var9 += 128;
                     var10 += 128;
                     var1.out.writeByte(var11 + 128, 1501405766);
                     var1.out.writeShort(var10 + (var9 << 8), -805078716);
                  } else if(var11 < 32) {
                     var1.out.writeByte(var11 + 192, -1416581785);
                     if(-1 != var8 && var7 != -1) {
                        var1.out.writeInt(var8 | var7 << 16, -357564953);
                     } else {
                        var1.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  } else {
                     var1.out.writeShort('\ue000' + (var11 & 8191), -805078716);
                     if(var8 != -1 && var7 != -1) {
                        var1.out.writeInt(var8 | var7 << 16, -357564953);
                     } else {
                        var1.out.writeInt(Integer.MIN_VALUE, -357564953);
                     }
                  }

                  ++var4;
                  this.method7803(var1.out, var6, 2008839982);
                  this.aLong8483 = var6.method9532(-1882175191) * -3913797519321321789L;
                  var6.method9533((byte)-89);
               }
            }
         }

         if(var1 != null) {
            var1.out.method9678(301018015 * var1.out.pos - var2, (byte)-64);
            int var12 = var1.out.pos * 301018015;
            var1.out.pos = var2 * 801976415;
            var1.out.writeByte(var3 / var4, 935775116);
            var1.out.writeByte(var3 % var4, 1613699763);
            var1.out.pos = var12 * 801976415;
            client.aClass111_11060.write(var1, (byte)-53);
         }
      }

      this.method7804((byte)9);
   }

   abstract void method7817(RSByteBuffer var1, Class526_Sub29 var2);

   public static void method7818(boolean var0, boolean var1, byte var2) {
      if(var0) {
         Class661.anInt8515 += 759532629;
         Class36.method839(304311172);
      }

      if(var1) {
         Class661.anInt8514 += 1534686479;
         Class378.method4696((byte)-19);
      }

   }

   public static final int method7819(int var0, int var1, int var2) {
      if(-2 == var0) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final void method7820(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class502.method6023(var3, var4, var0, (byte)112);
   }

   static String method7821(InterfaceDef var0, int var1, int var2) {
      return !client.method10311(var0).method9460(var1, -363228536) && null == var0.anObjectArray2491?null:(var0.aStringArray2579 != null && var0.aStringArray2579.length > var1 && null != var0.aStringArray2579[var1] && var0.aStringArray2579[var1].trim().length() != 0?var0.aStringArray2579[var1]:(client.aBool11192?"Hidden-" + var1:null));
   }

   static final void method7822(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class201.method2877(var3, var4, var0, (byte)79);
   }
}
