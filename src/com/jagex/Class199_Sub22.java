package com.jagex;

import com.jagex.Class199;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class645;
import com.jagex.client;

public class Class199_Sub22 extends Class199 {
   public static int anInt9979;
   int anInt9975;
   int anInt9977;
   int anInt9976;
   int anInt9978;
   int anInt9974;

   public void method2861() {
      Class639_Sub1_Sub2_Sub1 var1 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)9);
      var1.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -1504184722);
   }

   public void method2852(byte var1) {
      Class639_Sub1_Sub2_Sub1 var2 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)15);
      var2.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -1456671837);
   }

   public void method2857() {
      Class639_Sub1_Sub2_Sub1 var1 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)69);
      var1.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -1472064397);
   }

   public void method2855() {
      Class639_Sub1_Sub2_Sub1 var1 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)16);
      var1.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -1949600278);
   }

   Class199_Sub22(RSByteBuffer var1) {
      super(var1);
      this.anInt9975 = var1.readUnsignedShort(846546398) * 563985113;
      int var2 = var1.readUnsignedByte(206199637);
      if(0 != (var2 & 1)) {
         this.anInt9977 = var1.readUnsignedShort(354021126) * 1741139795;
         this.anInt9976 = var1.readUnsignedShort(1324490457) * -1532123531;
      } else {
         this.anInt9977 = -1741139795;
         this.anInt9976 = 1532123531;
      }

      if(0 != (var2 & 2)) {
         this.anInt9978 = var1.readUnsignedShort(1188423233) * 2065690243;
         this.anInt9974 = var1.readUnsignedShort(1592320745) * 897765189;
      } else {
         this.anInt9978 = -2065690243;
         this.anInt9974 = -897765189;
      }

      if(0 != (var2 & 4)) {
         int var3 = var1.readUnsignedShort(956234319);
         int var4 = var1.readUnsignedShort(1593918047);
         int var5 = 255 * var3 / var4;
         if(var3 > 0 && var5 < 1) {
            boolean var6 = true;
         }
      }

   }

   public void method2856() {
      Class639_Sub1_Sub2_Sub1 var1 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)124);
      var1.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -1428161673);
   }

   public void method2858() {
      Class639_Sub1_Sub2_Sub1 var1 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)51);
      var1.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -1979731831);
   }

   public void method2859() {
      Class639_Sub1_Sub2_Sub1 var1 = Class645.aClass207Array8445[-1164630679 * this.anInt9975].method2913((byte)127);
      var1.method10785(-734892837 * this.anInt9977, this.anInt9976 * -276661795, this.anInt9978 * -1050783701, this.anInt9974 * -2060817523, client.anInt11012, 0, -2059751502);
   }

   static boolean method9036(int var0, int var1) {
      return 18 != var0 && var0 != 19 && var0 != 20 && var0 != 21 && 22 != var0 && 1004 != var0?17 == var0:true;
   }

   static OutFrameBuffer method9037(int var0) {
      return 835651317 * OutFrameBuffer.anInt10555 == 0?new OutFrameBuffer():OutFrameBuffer.aClass526_Sub28Array10558[(OutFrameBuffer.anInt10555 -= -2074413731) * 835651317];
   }
}
