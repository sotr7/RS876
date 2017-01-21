package com.jagex;

import com.jagex.Class152;
import com.jagex.Class189;
import com.jagex.Class206;
import com.jagex.Class227;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.Class255;
import com.jagex.Class259;
import com.jagex.Class297;
import com.jagex.NPCDef;
import com.jagex.Class314;
import com.jagex.Class322;
import com.jagex.Class332;
import com.jagex.Class388;
import com.jagex.Class522;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.RenderDef;
import com.jagex.Class583;
import com.jagex.Class586;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;
import java.awt.Container;
import java.awt.Insets;

public final class Class207 {
   static final int anInt2253 = 25;
   public boolean aBool2251 = false;
   Class639_Sub1_Sub2_Sub1_Sub1 aClass639_Sub1_Sub2_Sub1_Sub1_2249 = null;
   NPC aClass639_Sub1_Sub2_Sub1_Sub2_2252 = null;
   int[] anIntArray2254;
   int anInt2248;
   public int anInt2250;

   void method2909(int var1, int var2, int var3, int var4) {
      if(!this.aBool2251) {
         this.aBool2251 = true;
         if(this.anInt2250 * -1817012609 >= 0) {
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = new NPC(client.aClass505_11204.method6072(-515856548), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setDefinition((NPCDef)Class76.loader.method89(this.anInt2250 * -1817012609, -928913579), -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setBoundSize(this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.boundSize * 459047587, (byte)120);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11938 = 446106299 * (this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.contrast * -739260225 << 3);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         } else {
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(726036429), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.decodeAppearance(Class322.aClass526_Sub36_3457, -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         }
      }

      if(-1817012609 * this.anInt2250 >= 0) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var3, var1, var2, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), -224655981);
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.turn(var4, true, -522653846);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var3;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var1, var2, 1557436501);
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.turn(var4, true, -1900559814);
      }

   }

   void method2910(int var1, int var2, int var3, int var4, int var5) {
      if(!this.aBool2251) {
         this.aBool2251 = true;
         if(this.anInt2250 * -1817012609 >= 0) {
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = new NPC(client.aClass505_11204.method6072(-1351466951), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setDefinition((NPCDef)Class76.loader.method89(this.anInt2250 * -1817012609, -1683984066), -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setBoundSize(this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.boundSize * 459047587, (byte)42);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11938 = 446106299 * (this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.contrast * -739260225 << 3);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         } else {
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(-1053639634), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.decodeAppearance(Class322.aClass526_Sub36_3457, -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         }
      }

      if(-1817012609 * this.anInt2250 >= 0) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var3, var1, var2, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), -875361776);
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.turn(var4, true, 390156732);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var3;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var1, var2, 1938391915);
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.turn(var4, true, -2071363447);
      }

   }

   void method2911(int var1) {
      this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = null;
      this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = null;
      this.aBool2251 = false;
   }

   boolean method2912() {
      if(-1817012609 * this.anInt2250 < 0) {
         return true;
      } else {
         NPCDef var1 = (NPCDef)Class76.loader.method89(this.anInt2250 * -1817012609, -2098229140);
         boolean var2 = var1.method4050((byte)0);
         if(this.anIntArray2254 == null) {
            RenderDef var3 = (RenderDef)Class227.aClass40_Sub16_2327.method89(1405403059 * var1.renderEmote, -1651108970);
            this.anIntArray2254 = var3.method6927(2107345669);
         }

         int[] var6 = this.anIntArray2254;

         for(int var4 = 0; var4 < var6.length; ++var4) {
            int var5 = var6[var4];
            var2 &= ((Class206)Class388.aClass40_Sub15_4063.method89(var5, -1281603999)).method2900(404092416);
         }

         return var2;
      }
   }

   public Class639_Sub1_Sub2_Sub1 method2913(byte var1) {
      return (Class639_Sub1_Sub2_Sub1)(this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 != null?this.aClass639_Sub1_Sub2_Sub1_Sub2_2252:this.aClass639_Sub1_Sub2_Sub1_Sub1_2249);
   }

   boolean method2914(int var1) {
      if(-1817012609 * this.anInt2250 < 0) {
         return true;
      } else {
         NPCDef var2 = (NPCDef)Class76.loader.method89(this.anInt2250 * -1817012609, -2128864400);
         boolean var3 = var2.method4050((byte)0);
         if(this.anIntArray2254 == null) {
            RenderDef var4 = (RenderDef)Class227.aClass40_Sub16_2327.method89(1405403059 * var2.renderEmote, -1981411382);
            this.anIntArray2254 = var4.method6927(2107345669);
         }

         int[] var7 = this.anIntArray2254;

         for(int var5 = 0; var5 < var7.length; ++var5) {
            int var6 = var7[var5];
            var3 &= ((Class206)Class388.aClass40_Sub15_4063.method89(var6, -1965659097)).method2900(404092416);
         }

         return var3;
      }
   }

   void method2915(int var1, int var2, int var3, int var4) {
      if(!this.aBool2251) {
         this.aBool2251 = true;
         if(this.anInt2250 * -1817012609 >= 0) {
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = new NPC(client.aClass505_11204.method6072(289012922), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setDefinition((NPCDef)Class76.loader.method89(this.anInt2250 * -1817012609, -1810611485), -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setBoundSize(this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.boundSize * 459047587, (byte)70);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11938 = 446106299 * (this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.contrast * -739260225 << 3);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         } else {
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(23486291), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.decodeAppearance(Class322.aClass526_Sub36_3457, -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         }
      }

      if(-1817012609 * this.anInt2250 >= 0) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var3, var1, var2, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), -1878556385);
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.turn(var4, true, 914148093);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var3;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var1, var2, 1185956670);
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.turn(var4, true, 133101503);
      }

   }

   void method2916(int var1, int var2, int var3, int var4) {
      if(!this.aBool2251) {
         this.aBool2251 = true;
         if(this.anInt2250 * -1817012609 >= 0) {
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = new NPC(client.aClass505_11204.method6072(-1244412306), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setDefinition((NPCDef)Class76.loader.method89(this.anInt2250 * -1817012609, -1840248633), -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.setBoundSize(this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.boundSize * 459047587, (byte)72);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11938 = 446106299 * (this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.def.contrast * -739260225 << 3);
            this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         } else {
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(1769207350), 25);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.decodeAppearance(Class322.aClass526_Sub36_3457, -1957887669);
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.index = -383966505 * this.anInt2248;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.lastUpdate = client.anInt11012 * 577471779;
            this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.anInt11904 = ((Class189.anInt2153 += -445294529) * 1612355519 - 1) * 1725991479;
         }
      }

      if(-1817012609 * this.anInt2250 >= 0) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var3, var1, var2, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), 650269124);
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.turn(var4, true, -2119218540);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var3;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var1, var2, 1754248860);
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.turn(var4, true, -1685601308);
      }

   }

   Class207(RSByteBuffer var1, int var2) {
      this.anInt2248 = var2 * 473572053;
      int var3 = var1.readUnsignedByte(1789101508);
      switch(var3) {
      case 0:
         this.anInt2250 = var1.readBigSmart((byte)38) * 1530079615;
         break;
      case 1:
         this.anInt2250 = -1530079615;
         break;
      default:
         this.anInt2250 = -1530079615;
      }

      var1.readString(-363109275);
   }

   void method2917() {
      this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = null;
      this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = null;
      this.aBool2251 = false;
   }

   void method2918() {
      this.aClass639_Sub1_Sub2_Sub1_Sub2_2252 = null;
      this.aClass639_Sub1_Sub2_Sub1_Sub1_2249 = null;
      this.aBool2251 = false;
   }

   void method2919(int var1, int var2, int var3, byte var4) {
      if(null != this.aClass639_Sub1_Sub2_Sub1_Sub2_2252) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var1, var2, var3, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), -2002690062);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var1;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var2, var3, 1826342815);
      }

   }

   void method2920(int var1, int var2, int var3) {
      if(null != this.aClass639_Sub1_Sub2_Sub1_Sub2_2252) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var1, var2, var3, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), -67170007);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var1;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var2, var3, 1709255873);
      }

   }

   void method2921(int var1, int var2, int var3) {
      if(null != this.aClass639_Sub1_Sub2_Sub1_Sub2_2252) {
         this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.move(var1, var2, var3, true, this.aClass639_Sub1_Sub2_Sub1_Sub2_2252.method10781(-627148024), 289391378);
      } else {
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10827 = this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.aByte10828 = (byte)var1;
         this.aClass639_Sub1_Sub2_Sub1_Sub1_2249.method10971(var2, var3, 1928011001);
      }

   }

   public static void method2922(short[] var0, byte var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = 1024;
      }

   }

   static final void method2923(Class681 var0, int var1) {
      if(client.anInt11089 * 96539231 >= 5 && client.anInt11089 * 96539231 <= 9) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   public static void method2924(int var0) {
      Container var1 = Class152.method1757((byte)-42);
      int var2 = var1.getSize().width;
      int var3 = var1.getSize().height;
      if(Class242.aFrame2454 == var1) {
         Insets var4 = Class242.aFrame2454.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.top + var4.bottom;
      }

      if(var2 != 1405944805 * Class332.anInt3505 || var3 != 542147681 * Class586.anInt7792 || client.aBool11104) {
         if(null != Class554.aClass174_7475 && !Class554.aClass174_7475.method2238()) {
            Class332.anInt3505 = var2 * -512130579;
            Class586.anInt7792 = -1921704031 * var3;
         } else {
            Class583.method6984((byte)77);
         }

         client.aLong11151 = (Class255.time((byte)24) + 500L) * 5758791444970743915L;
         client.aBool11104 = false;
      }

   }

   public static final void method2925(byte var0) {
      if(!client.aBool11108) {
         client.aFloat10992 += (12.0F - client.aFloat10992) / 2.0F;
         client.aBool11070 = true;
         client.aBool11108 = true;
      }
   }

   static final void method2926(Class681 var0, byte var1) {
      int var2 = Class259.method3518((byte)49);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (Class314.anInt3394 = Class230.preferences.aClass711_Sub19_10633.method10022((byte)-51) * 2083296013) * -2127268923;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
      Class297.method3972(-2085898154);
      client.aClass505_11204.method6078(-2118570792);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }
}
