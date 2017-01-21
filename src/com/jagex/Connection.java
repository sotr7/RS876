package com.jagex;

import com.jagex.Class115;
import com.jagex.Class149_Sub1;
import com.jagex.Class204;
import com.jagex.InterfaceDef;
import com.jagex.Class270;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub39;
import com.jagex.Class708;
import com.jagex.client;
import java.io.IOException;

public abstract class Connection {
   static Class708[] aClass708Array7545;

   public abstract void write(byte[] var1, int var2, int var3, int var4) throws IOException;

   public abstract int method6724(byte[] var1, int var2, int var3) throws IOException;

   public abstract int available(short var1) throws IOException;

   public abstract void method6726();

   public abstract boolean method6727(int var1, int var2) throws IOException;

   public abstract void stop(short var1);

   public abstract void method6729(int var1);

   public abstract boolean method6730(int var1) throws IOException;

   public abstract boolean method6731(int var1) throws IOException;

   public abstract boolean method6732(int var1) throws IOException;

   public abstract int method6733() throws IOException;

   public abstract int method6734() throws IOException;

   public abstract void method6735();

   public abstract int method6736(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method6737();

   public abstract int method6738(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method6739(byte[] var1, int var2, int var3) throws IOException;

   public abstract int method6740(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method6741();

   public abstract int read(byte[] var1, int var2, int var3, int var4) throws IOException;

   static void method6743(InterfaceDef var0, int var1) {
      if(client.aBool11276) {
         if(null != var0.anObjectArray2630) {
            InterfaceDef var2 = Class204.method2893(-367921651 * Class149_Sub1.uid, client.slot * 1280409375, 1631733208);
            if(null != var2) {
               Class526_Sub39 var3 = new Class526_Sub39();
               var3.aClass245_10694 = var0;
               var3.aClass245_10698 = var2;
               var3.anObjectArray10701 = var0.anObjectArray2630;
               Class270.method3594(var3, -620258485);
            }
         }

         OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4265, client.aClass111_11060.aClass14_1342, 982241098);
         var4.out.writeInt(var0.uid * 919258769, -357564953);
         var4.out.writeShort(client.slot * 1280409375, -805078716);
         var4.out.writeLEShort(var0.componentSlot * 1300712985, (byte)0);
         var4.out.writeLEShort(1394971083 * client.item, (byte)0);
         var4.out.writeShort(var0.componentItem * -77845371, -805078716);
         var4.out.writeInt(-367921651 * Class149_Sub1.uid, -357564953);
         client.aClass111_11060.write(var4, (byte)81);
      }
   }
}
