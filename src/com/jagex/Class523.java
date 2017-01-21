package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class207;
import com.jagex.Class230;
import com.jagex.Class26;
import com.jagex.Class265;
import com.jagex.Class293;
import com.jagex.Class304;
import com.jagex.Class307;
import com.jagex.Class32;
import com.jagex.Class324;
import com.jagex.Class331;
import com.jagex.Class378;
import com.jagex.Class380_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class418;
import com.jagex.Class447;
import com.jagex.Class45;
import com.jagex.Class452_Sub4;
import com.jagex.Class503;
import com.jagex.Class507;
import com.jagex.Class508;
import com.jagex.Class518;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class533;
import com.jagex.Class542;
import com.jagex.Class582;
import com.jagex.Class633;
import com.jagex.Class635;
import com.jagex.Class650;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class523 {
   static int anInt7075;
   static int anInt7076;
   public static int anInt7077;
   Class507 aClass507_7063 = new Class507();
   Class324 aClass324_7059 = new Class324();
   short[] aShortArray7060 = new short[192];
   short[] aShortArray7061 = new short[12];
   short[] aShortArray7062 = new short[12];
   short[] aShortArray7072 = new short[12];
   short[] aShortArray7064 = new short[12];
   short[] aShortArray7070 = new short[192];
   Class331[] aClass331Array7066 = new Class331[4];
   short[] aShortArray7065 = new short[114];
   Class331 aClass331_7068 = new Class331(4);
   Class542 aClass542_7069 = new Class542(this);
   Class542 aClass542_7074 = new Class542(this);
   Class533 aClass533_7071 = new Class533(this);
   int anInt7067 = 1517348967;
   int anInt7058 = 1731125473;
   int anInt7073;

   Class523() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.aClass331Array7066[var1] = new Class331(6);
      }

   }

   boolean method6260(int var1, int var2, int var3, int var4) {
      if(var1 <= 8 && var2 <= 4 && var3 <= 4) {
         this.aClass533_7071.method6385(var2, var1, -1942056192);
         int var5 = 1 << var3;
         this.aClass542_7069.method6480(var5, 713805446);
         this.aClass542_7074.method6480(var5, 713805446);
         this.anInt7073 = (var5 - 1) * 1973738069;
         return true;
      } else {
         return false;
      }
   }

   void method6261(byte var1) throws IOException {
      this.aClass507_7063.method6147(false, (short)-17822);
      Class207.method2922(this.aShortArray7060, (byte)0);
      Class207.method2922(this.aShortArray7070, (byte)0);
      Class207.method2922(this.aShortArray7061, (byte)0);
      Class207.method2922(this.aShortArray7062, (byte)0);
      Class207.method2922(this.aShortArray7072, (byte)0);
      Class207.method2922(this.aShortArray7064, (byte)0);
      Class207.method2922(this.aShortArray7065, (byte)0);
      this.aClass533_7071.method6387(898444046);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.aClass331Array7066[var2].method4246(1609491684);
      }

      this.aClass542_7069.method6479(-1144090317);
      this.aClass542_7074.method6479(585486240);
      this.aClass331_7068.method4246(1604615802);
      this.aClass324_7059.method4160(-1067034774);
   }

   boolean method6262(InputStream var1, OutputStream var2, long var3) throws IOException {
      this.aClass324_7059.method4158(var1, 1607574812);
      this.aClass507_7063.method6140(var2, (byte)-117);
      this.method6261((byte)10);
      int var5 = Class380_Sub1.method9143((byte)29);
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      long var10 = 0L;
      byte var12 = 0;

      while(var3 < 0L || var10 < var3) {
         int var13 = (int)var10 & this.anInt7073 * 881939197;
         if(this.aClass324_7059.method4162(this.aShortArray7060, var13 + (var5 << 4), -2114435951) == 0) {
            Class518 var17 = this.aClass533_7071.method6390((int)var10, var12, 1132270406);
            if(!Class633.method7529(var5, 1278901301)) {
               var12 = var17.method6241(this.aClass324_7059, this.aClass507_7063.method6146(var6, -889752564), (byte)69);
            } else {
               var12 = var17.method6234(this.aClass324_7059, (byte)85);
            }

            this.aClass507_7063.method6152(var12, (byte)0);
            var5 = Class447.method5320(var5, (byte)69);
            ++var10;
         } else {
            int var14;
            int var15;
            if(this.aClass324_7059.method4162(this.aShortArray7061, var5, -2114435951) == 1) {
               var14 = 0;
               if(this.aClass324_7059.method4162(this.aShortArray7062, var5, -2114435951) == 0) {
                  if(this.aClass324_7059.method4162(this.aShortArray7070, var13 + (var5 << 4), -2114435951) == 0) {
                     var5 = Class293.method3953(var5, 1738691755);
                     var14 = 1;
                  }
               } else {
                  if(this.aClass324_7059.method4162(this.aShortArray7072, var5, -2114435951) == 0) {
                     var15 = var7;
                  } else {
                     if(this.aClass324_7059.method4162(this.aShortArray7064, var5, -2114435951) == 0) {
                        var15 = var8;
                     } else {
                        var15 = var9;
                        var9 = var8;
                     }

                     var8 = var7;
                  }

                  var7 = var6;
                  var6 = var15;
               }

               if(0 == var14) {
                  var14 = this.aClass542_7074.method6481(this.aClass324_7059, var13, -2124274507) + 2;
                  var5 = Class650.method7722(var5, (byte)60);
               }
            } else {
               var9 = var8;
               var8 = var7;
               var7 = var6;
               var14 = 2 + this.aClass542_7069.method6481(this.aClass324_7059, var13, -135007582);
               var5 = Class307.method4042(var5, (byte)104);
               var15 = this.aClass331Array7066[Class378.method4695(var14, (byte)38)].method4244(this.aClass324_7059, (byte)78);
               if(var15 >= 4) {
                  int var16 = (var15 >> 1) - 1;
                  var6 = (2 | var15 & 1) << var16;
                  if(var15 < 14) {
                     var6 += Class418.method4977(this.aShortArray7065, var6 - var15 - 1, this.aClass324_7059, var16, (byte)-62);
                  } else {
                     var6 += this.aClass324_7059.method4161(var16 - 4, -1957887669) << 4;
                     var6 += this.aClass331_7068.method4245(this.aClass324_7059, -2027999372);
                     if(var6 < 0) {
                        if(-1 != var6) {
                           return false;
                        }
                        break;
                     }
                  }
               } else {
                  var6 = var15;
               }
            }

            if((long)var6 >= var10 || var6 >= this.anInt7058 * -197026593) {
               return false;
            }

            this.aClass507_7063.method6138(var6, var14, 1956109058);
            var10 += (long)var14;
            var12 = this.aClass507_7063.method6146(0, -1172895965);
         }
      }

      this.aClass507_7063.method6142((byte)53);
      this.aClass507_7063.method6141((byte)-56);
      this.aClass324_7059.method4159(-300161514);
      return true;
   }

   boolean method6263(byte[] var1, short var2) {
      if(var1.length < 5) {
         return false;
      } else {
         int var3 = var1[0] & 255;
         int var4 = var3 % 9;
         int var5 = var3 / 9;
         int var6 = var5 % 5;
         int var7 = var5 / 5;
         int var8 = 0;

         for(int var9 = 0; var9 < 4; ++var9) {
            var8 += (var1[var9 + 1] & 255) << 8 * var9;
         }

         return !this.method6260(var4, var6, var7, 946930758)?false:this.method6268(var8, (byte)73);
      }
   }

   void method6264() throws IOException {
      this.aClass507_7063.method6147(false, (short)-24027);
      Class207.method2922(this.aShortArray7060, (byte)0);
      Class207.method2922(this.aShortArray7070, (byte)0);
      Class207.method2922(this.aShortArray7061, (byte)0);
      Class207.method2922(this.aShortArray7062, (byte)0);
      Class207.method2922(this.aShortArray7072, (byte)0);
      Class207.method2922(this.aShortArray7064, (byte)0);
      Class207.method2922(this.aShortArray7065, (byte)0);
      this.aClass533_7071.method6387(1056337380);

      for(int var1 = 0; var1 < 4; ++var1) {
         this.aClass331Array7066[var1].method4246(-76555630);
      }

      this.aClass542_7069.method6479(337453579);
      this.aClass542_7074.method6479(-929718637);
      this.aClass331_7068.method4246(1718162812);
      this.aClass324_7059.method4160(-1637095288);
   }

   void method6265() throws IOException {
      this.aClass507_7063.method6147(false, (short)-29275);
      Class207.method2922(this.aShortArray7060, (byte)0);
      Class207.method2922(this.aShortArray7070, (byte)0);
      Class207.method2922(this.aShortArray7061, (byte)0);
      Class207.method2922(this.aShortArray7062, (byte)0);
      Class207.method2922(this.aShortArray7072, (byte)0);
      Class207.method2922(this.aShortArray7064, (byte)0);
      Class207.method2922(this.aShortArray7065, (byte)0);
      this.aClass533_7071.method6387(-946062223);

      for(int var1 = 0; var1 < 4; ++var1) {
         this.aClass331Array7066[var1].method4246(616078880);
      }

      this.aClass542_7069.method6479(-1090910758);
      this.aClass542_7074.method6479(-1059143683);
      this.aClass331_7068.method4246(1236837820);
      this.aClass324_7059.method4160(72097579);
   }

   void method6266() throws IOException {
      this.aClass507_7063.method6147(false, (short)-6978);
      Class207.method2922(this.aShortArray7060, (byte)0);
      Class207.method2922(this.aShortArray7070, (byte)0);
      Class207.method2922(this.aShortArray7061, (byte)0);
      Class207.method2922(this.aShortArray7062, (byte)0);
      Class207.method2922(this.aShortArray7072, (byte)0);
      Class207.method2922(this.aShortArray7064, (byte)0);
      Class207.method2922(this.aShortArray7065, (byte)0);
      this.aClass533_7071.method6387(130283149);

      for(int var1 = 0; var1 < 4; ++var1) {
         this.aClass331Array7066[var1].method4246(2111846645);
      }

      this.aClass542_7069.method6479(-1766926053);
      this.aClass542_7074.method6479(383403153);
      this.aClass331_7068.method4246(1956241576);
      this.aClass324_7059.method4160(-1302661417);
   }

   boolean method6267(int var1) {
      if(var1 < 0) {
         return false;
      } else {
         if(this.anInt7067 * 1523076265 != var1) {
            this.anInt7067 = -1517348967 * var1;
            this.anInt7058 = Math.max(1523076265 * this.anInt7067, 1) * -1731125473;
            this.aClass507_7063.method6139(Math.max(this.anInt7058 * -197026593, 4096), -86470448);
         }

         return true;
      }
   }

   boolean method6268(int var1, byte var2) {
      if(var1 < 0) {
         return false;
      } else {
         if(this.anInt7067 * 1523076265 != var1) {
            this.anInt7067 = -1517348967 * var1;
            this.anInt7058 = Math.max(1523076265 * this.anInt7067, 1) * -1731125473;
            this.aClass507_7063.method6139(Math.max(this.anInt7058 * -197026593, 4096), -86470448);
         }

         return true;
      }
   }

   static final void method6269(Class681 var0, int var1) {
      Class526_Sub32 var2 = Class503.method6044((Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629], -1622885852);
      var0.anInt8623 -= 758383916;
      var2.anInt10598 += -215261577 * var0.anIntArray8622[-1730576285 * var0.anInt8623];
      var2.anInt10599 += -1304809903 * var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      var2.anInt10597 += -2016339049 * var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      var2.anInt10600 += var0.anIntArray8622[3 + var0.anInt8623 * -1730576285] * -255916441;
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
   }

   static final void method6270(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(client.anInt11064 * -1395039251 != 0 || (!client.aBool11161 || client.aBool11162) && !client.aBool11004) {
         String var3 = var2.toLowerCase();
         byte var4 = 0;
         if(var3.startsWith(Class45.aClass45_620.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 0;
            var2 = var2.substring(Class45.aClass45_620.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_593.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 1;
            var2 = var2.substring(Class45.aClass45_593.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_568.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 2;
            var2 = var2.substring(Class45.aClass45_568.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_477.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 3;
            var2 = var2.substring(Class45.aClass45_477.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_624.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 4;
            var2 = var2.substring(Class45.aClass45_624.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_625.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 5;
            var2 = var2.substring(Class45.aClass45_625.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_626.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 6;
            var2 = var2.substring(Class45.aClass45_626.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_546.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 7;
            var2 = var2.substring(Class45.aClass45_546.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_628.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 8;
            var2 = var2.substring(Class45.aClass45_628.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_629.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 9;
            var2 = var2.substring(Class45.aClass45_629.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_630.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 10;
            var2 = var2.substring(Class45.aClass45_630.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_497.method920(Class673.aClass673_8579, -827840379))) {
            var4 = 11;
            var2 = var2.substring(Class45.aClass45_497.method920(Class673.aClass673_8579, -827840379).length());
         } else if(Class673.aClass673_8579 != Class26.aClass673_247) {
            if(var3.startsWith(Class45.aClass45_620.method920(Class26.aClass673_247, -827840379))) {
               var4 = 0;
               var2 = var2.substring(Class45.aClass45_620.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_593.method920(Class26.aClass673_247, -827840379))) {
               var4 = 1;
               var2 = var2.substring(Class45.aClass45_593.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_568.method920(Class26.aClass673_247, -827840379))) {
               var4 = 2;
               var2 = var2.substring(Class45.aClass45_568.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_477.method920(Class26.aClass673_247, -827840379))) {
               var4 = 3;
               var2 = var2.substring(Class45.aClass45_477.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_624.method920(Class26.aClass673_247, -827840379))) {
               var4 = 4;
               var2 = var2.substring(Class45.aClass45_624.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_625.method920(Class26.aClass673_247, -827840379))) {
               var4 = 5;
               var2 = var2.substring(Class45.aClass45_625.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_626.method920(Class26.aClass673_247, -827840379))) {
               var4 = 6;
               var2 = var2.substring(Class45.aClass45_626.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_546.method920(Class26.aClass673_247, -827840379))) {
               var4 = 7;
               var2 = var2.substring(Class45.aClass45_546.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_628.method920(Class26.aClass673_247, -827840379))) {
               var4 = 8;
               var2 = var2.substring(Class45.aClass45_628.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_629.method920(Class26.aClass673_247, -827840379))) {
               var4 = 9;
               var2 = var2.substring(Class45.aClass45_629.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_630.method920(Class26.aClass673_247, -827840379))) {
               var4 = 10;
               var2 = var2.substring(Class45.aClass45_630.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_497.method920(Class26.aClass673_247, -827840379))) {
               var4 = 11;
               var2 = var2.substring(Class45.aClass45_497.method920(Class26.aClass673_247, -827840379).length());
            }
         }

         var3 = var2.toLowerCase();
         byte var5 = 0;
         if(var3.startsWith(Class45.aClass45_632.method920(Class673.aClass673_8579, -827840379))) {
            var5 = 1;
            var2 = var2.substring(Class45.aClass45_632.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_475.method920(Class673.aClass673_8579, -827840379))) {
            var5 = 2;
            var2 = var2.substring(Class45.aClass45_475.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_634.method920(Class673.aClass673_8579, -827840379))) {
            var5 = 3;
            var2 = var2.substring(Class45.aClass45_634.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_635.method920(Class673.aClass673_8579, -827840379))) {
            var5 = 4;
            var2 = var2.substring(Class45.aClass45_635.method920(Class673.aClass673_8579, -827840379).length());
         } else if(var3.startsWith(Class45.aClass45_636.method920(Class673.aClass673_8579, -827840379))) {
            var5 = 5;
            var2 = var2.substring(Class45.aClass45_636.method920(Class673.aClass673_8579, -827840379).length());
         } else if(Class26.aClass673_247 != Class673.aClass673_8579) {
            if(var3.startsWith(Class45.aClass45_632.method920(Class26.aClass673_247, -827840379))) {
               var5 = 1;
               var2 = var2.substring(Class45.aClass45_632.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_475.method920(Class26.aClass673_247, -827840379))) {
               var5 = 2;
               var2 = var2.substring(Class45.aClass45_475.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_634.method920(Class26.aClass673_247, -827840379))) {
               var5 = 3;
               var2 = var2.substring(Class45.aClass45_634.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_635.method920(Class26.aClass673_247, -827840379))) {
               var5 = 4;
               var2 = var2.substring(Class45.aClass45_635.method920(Class26.aClass673_247, -827840379).length());
            } else if(var3.startsWith(Class45.aClass45_636.method920(Class26.aClass673_247, -827840379))) {
               var5 = 5;
               var2 = var2.substring(Class45.aClass45_636.method920(Class26.aClass673_247, -827840379).length());
            }
         }

         Class111 var6 = Class452_Sub4.method9295((byte)72);
         OutFrameBuffer var7 = Class115.method1414(OutFrame.CHAT, var6.aClass14_1342, -1473685555);
         var7.out.writeByte(0, 452212707);
         int var8 = var7.out.pos * 301018015;
         var7.out.writeByte(var4, 1534286586);
         var7.out.writeByte(var5, 1557769563);
         Class508.method6161(var7.out, var2, 755532680);
         var7.out.method9678(var7.out.pos * 301018015 - var8, (byte)-94);
         var6.write(var7, (byte)-56);
      }
   }

   static final void method6271(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub11_10609.method8313(var2, -1932307426);
   }

   static final void method6272(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class304.method4021(var2, -1926033678);
   }

   static boolean method6273(int var0) {
      Class32.anInt310 = 1696245043;
      RuntimeException_Sub4.aClass111_12105 = client.aClass111_11060;
      return Class635.method7556(-5590316573601377797L * Class32.aLong313 == -1L, true, "", "", Class32.aLong313 * -5590316573601377797L);
   }

   public static Class582 method6274(RSByteBuffer var0, int var1) {
      int var2 = var0.readUnsignedByte(-724803990);
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var0.readUnsignedByte(739015509);
      }

      return new Class582(var3);
   }

   public static void method6275(int var0, short var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(9, (long)var0);
      var2.method10583((byte)-116);
   }
}
