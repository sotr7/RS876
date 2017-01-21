package com.jagex;

import com.jagex.Class108;
import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class199;
import com.jagex.Class206;
import com.jagex.Class230;
import com.jagex.Class388;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class670;
import com.jagex.Class681;
import com.jagex.Class689;
import com.jagex.client;
import java.io.IOException;

public abstract class Class199_Sub23 extends Class199 {
   int anInt9982;
   int anInt9980;
   int anInt9981;

   boolean method2860() {
      Class670 var1 = (Class670)Class689.aClass40_Sub12_8692.method89(this.anInt9982 * 1145797559, -1474517799);
      boolean var2 = var1.method7966(470774803);
      Class206 var3 = (Class206)Class388.aClass40_Sub15_4063.method89(1305328919 * var1.anInt8550, 130867389);
      var2 &= var3.method2900(404092416);
      return var2;
   }

   boolean method2853(byte var1) {
      Class670 var2 = (Class670)Class689.aClass40_Sub12_8692.method89(this.anInt9982 * 1145797559, 220837574);
      boolean var3 = var2.method7966(470774803);
      Class206 var4 = (Class206)Class388.aClass40_Sub15_4063.method89(1305328919 * var2.anInt8550, -1821929450);
      var3 &= var4.method2900(404092416);
      return var3;
   }

   boolean method2862() {
      Class670 var1 = (Class670)Class689.aClass40_Sub12_8692.method89(this.anInt9982 * 1145797559, -1895413055);
      boolean var2 = var1.method7966(470774803);
      Class206 var3 = (Class206)Class388.aClass40_Sub15_4063.method89(1305328919 * var1.anInt8550, -943794403);
      var2 &= var3.method2900(404092416);
      return var2;
   }

   Class199_Sub23(RSByteBuffer var1) {
      super(var1);
      this.anInt9982 = var1.readUnsignedShort(572088240) * -64400889;
      this.anInt9980 = var1.readUnsignedShort(1988538369) * -734465177;
      this.anInt9981 = var1.readUnsignedByte(-859342900) * 1927537851;
   }

   boolean method2851() {
      Class670 var1 = (Class670)Class689.aClass40_Sub12_8692.method89(this.anInt9982 * 1145797559, -58112827);
      boolean var2 = var1.method7966(470774803);
      Class206 var3 = (Class206)Class388.aClass40_Sub15_4063.method89(1305328919 * var1.anInt8550, -203166435);
      var2 &= var3.method2900(404092416);
      return var2;
   }

   public static void method9038(boolean var0, int var1) {
      Class570.aClass231_7657.method3190((byte)-37);
      if(Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
         Class111[] var2 = client.aClass111Array11061;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Class111 var4 = var2[var3];
            var4.anInt1345 += 1298387453;
            if(-2003594411 * var4.anInt1345 < 50 && !var0) {
               return;
            }

            var4.anInt1345 = 0;
            if(!var4.aBool1346 && var4.method1364(-1184311292) != null) {
               OutFrameBuffer var5 = Class115.method1414(OutFrame.aClass405_4282, var4.aClass14_1342, 695707891);
               var4.write(var5, (byte)-78);

               try {
                  var4.method1365((byte)-16);
               } catch (IOException var7) {
                  var4.aBool1346 = true;
               }
            }
         }

         Class570.aClass231_7657.method3190((byte)-16);
      }
   }

   static final void method9039(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub33_10608.method10135((byte)27);
   }
}
