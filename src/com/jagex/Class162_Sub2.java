package com.jagex;

import com.jagex.Class103;
import com.jagex.Class115;
import com.jagex.Class149_Sub1;
import com.jagex.Class162;
import com.jagex.Class199_Sub1;
import com.jagex.Class26;
import com.jagex.Class283;
import com.jagex.OutFrame;
import com.jagex.Class438;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class523;
import com.jagex.OutFrameBuffer;
import com.jagex.Class532;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class693;
import com.jagex.client;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class162_Sub2 extends Class162 {
   int[] anIntArray9211;
   int[] anIntArray9210;

   Class162_Sub2(int var1, int var2, int[] var3, int[] var4) {
      this.anIntArray9211 = var3;
      this.anIntArray9210 = var4;
   }

   public static void method8462(String var0, byte var1) {
      if(client.aBool11276 && 0 != (Class199_Sub1.anInt9869 * 257411563 & 24)) {
         boolean var2 = false;
         int var3 = 1609310241 * Class103.anInt1270;
         int[] var4 = Class103.anIntArray1276;

         for(int var5 = 0; var5 < var3; ++var5) {
            Class639_Sub1_Sub2_Sub1_Sub1 var6 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var4[var5]];
            if(var6.aString12161 != null && var6.aString12161.equalsIgnoreCase(var0) && (Class451.localPlayer == var6 && 0 != (257411563 * Class199_Sub1.anInt9869 & 16) || 0 != (Class199_Sub1.anInt9869 * 257411563 & 8))) {
               OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4248, client.aClass111_11060.aClass14_1342, -1626423364);
               var7.out.writeInt(Class149_Sub1.uid * -367921651, -357564953);
               var7.out.writeShort128(1394971083 * client.item, (byte)12);
               var7.out.writeByte(0, -2023921703);
               var7.out.writeLEShort128(var4[var5], -763619157);
               var7.out.writeShort(1280409375 * client.slot, -805078716);
               client.aClass111_11060.write(var7, (byte)-12);
               Class693.method8112(var6.screenX[0], var6.screenY[0], -641856329);
               var2 = true;
               break;
            }
         }

         if(!var2) {
            Class283.method3718(4, Class45.aClass45_587.method920(Class26.aClass673_247, -827840379) + var0, 1720399705);
         }

         if(client.aBool11276) {
            Class438.method5153(-1789937425);
         }

      }
   }

   static byte[] method8463(InputStream var0, int var1, int var2) throws IOException {
      byte[] var3 = new byte[5];
      if(var0.read(var3, 0, 5) != 5) {
         throw new IOException("2");
      } else {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream(var1);
         Class523 var5 = Class532.aClass523_7185;
         synchronized(var5) {
            if(!Class532.aClass523_7185.method6263(var3, (short)10696)) {
               throw new IOException("3");
            }

            Class532.aClass523_7185.method6262(var0, var4, (long)var1);
         }

         var4.flush();
         return var4.toByteArray();
      }
   }
}
