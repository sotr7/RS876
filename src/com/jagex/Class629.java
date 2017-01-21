package com.jagex;

import com.jagex.Class218;
import com.jagex.Class230;
import com.jagex.Class466;
import com.jagex.Class522;
import com.jagex.RSByteBuffer;
import com.jagex.Class622;
import com.jagex.Class681;
import com.jagex.Class695;
import com.jagex.Interface67;
import com.jagex.client;

public class Class629 {
   public Interface67 anInterface67_8216;

   void method7465(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1261108026);
         if(var2 == 0) {
            return;
         }

         if(1 == var2) {
            this.anInterface67_8216 = Class218.method3029(var1, (byte)3);
         }
      }
   }

   void method7466(RSByteBuffer var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(8650396);
         if(var3 == 0) {
            return;
         }

         if(1 == var3) {
            this.anInterface67_8216 = Class218.method3029(var1, (byte)3);
         }
      }
   }

   public Class629(Class466 var1) {
      byte[] var2 = var1.method5541(Class622.aClass622_8133.anInt8139 * 127490303, 16777472);
      if(var2 != null) {
         this.method7466(new RSByteBuffer(var2), (byte)-58);
      }

   }

   static void method7467(Class681 var0, byte var1) {
      boolean var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] != 0;
      Class695.method8133(var2, 2123081008);
   }

   static final void method7468(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 != Class230.preferences.aClass711_Sub42_10607.method10199((byte)-74)) {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub42_10607, var2, (short)-23866);
         Class522.method6257(-1042127423);
         client.aBool11013 = false;
         client.aClass505_11204.method6078(-2043666406);
      }

   }
}
