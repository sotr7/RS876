package com.jagex;

import com.jagex.Class115;
import com.jagex.Class255;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub29;
import com.jagex.RSByteBuffer;
import com.jagex.Class654;
import com.jagex.client;

public class Class654_Sub2 extends Class654 {
   boolean method7805(int var1) {
      return this.method9942(2052311032) != null || this.aLong8483 * 2949132011686556139L < Class255.time((byte)24) - 2000L;
   }

   void method7817(RSByteBuffer var1, Class526_Sub29 var2) {
   }

   OutFrameBuffer method7806(int var1) {
      return Class115.method1414(OutFrame.aClass405_4193, client.aClass111_11060.aClass14_1342, -1594351430);
   }

   void method7803(RSByteBuffer var1, Class526_Sub29 var2, int var3) {
   }

   int method7802(byte var1) {
      return 0;
   }

   void method7800() {
      Class526_Sub29 var1 = this.method9942(1701811081);
      if(null != var1) {
         int var2 = this.method7799(var1, 32767, 2082199583);
         int var3 = var1.method9530(1762748637);
         if(var3 < 0) {
            var3 = 0;
         } else if(var3 > '\uffff') {
            var3 = '\uffff';
         }

         int var4 = var1.method9527((byte)65);
         if(var4 < 0) {
            var4 = 0;
         } else if(var4 > '\uffff') {
            var4 = '\uffff';
         }

         byte var5 = 0;
         if(var1.method9528((byte)6) == 2) {
            var5 = 1;
         }

         OutFrameBuffer var6 = Class115.method1414(OutFrame.aClass405_4236, client.aClass111_11060.aClass14_1342, 178178096);
         var6.out.writeShort(var2 | var5 << 15, -805078716);
         var6.out.writeIntLE(var4 | var3 << 16, (byte)27);
         client.aClass111_11060.write(var6, (byte)-108);
      }

   }

   void method7804(byte var1) {
      Class526_Sub29 var2 = this.method9942(2008883691);
      if(null != var2) {
         int var3 = this.method7799(var2, 32767, 1650503845);
         int var4 = var2.method9530(1762748637);
         if(var4 < 0) {
            var4 = 0;
         } else if(var4 > '\uffff') {
            var4 = '\uffff';
         }

         int var5 = var2.method9527((byte)96);
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > '\uffff') {
            var5 = '\uffff';
         }

         byte var6 = 0;
         if(var2.method9528((byte)-10) == 2) {
            var6 = 1;
         }

         OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4236, client.aClass111_11060.aClass14_1342, -994000785);
         var7.out.writeShort(var3 | var6 << 15, -805078716);
         var7.out.writeIntLE(var5 | var4 << 16, (byte)90);
         client.aClass111_11060.write(var7, (byte)53);
      }

   }

   boolean method7801() {
      return this.method9942(1630613565) != null || this.aLong8483 * 2949132011686556139L < Class255.time((byte)24) - 2000L;
   }

   OutFrameBuffer method7813() {
      return Class115.method1414(OutFrame.aClass405_4193, client.aClass111_11060.aClass14_1342, 1723871630);
   }

   void method7812(RSByteBuffer var1, Class526_Sub29 var2) {
   }

   Class526_Sub29 method9942(int var1) {
      return (Class526_Sub29)client.aClass702_11028.method8206((byte)119);
   }

   boolean method7810() {
      return this.method9942(1671210785) != null || this.aLong8483 * 2949132011686556139L < Class255.time((byte)24) - 2000L;
   }

   void method7815() {
      Class526_Sub29 var1 = this.method9942(1880100546);
      if(null != var1) {
         int var2 = this.method7799(var1, 32767, 1777597322);
         int var3 = var1.method9530(1762748637);
         if(var3 < 0) {
            var3 = 0;
         } else if(var3 > '\uffff') {
            var3 = '\uffff';
         }

         int var4 = var1.method9527((byte)48);
         if(var4 < 0) {
            var4 = 0;
         } else if(var4 > '\uffff') {
            var4 = '\uffff';
         }

         byte var5 = 0;
         if(var1.method9528((byte)-96) == 2) {
            var5 = 1;
         }

         OutFrameBuffer var6 = Class115.method1414(OutFrame.aClass405_4236, client.aClass111_11060.aClass14_1342, -1909089331);
         var6.out.writeShort(var2 | var5 << 15, -805078716);
         var6.out.writeIntLE(var4 | var3 << 16, (byte)61);
         client.aClass111_11060.write(var6, (byte)46);
      }

   }

   int method7798() {
      return 0;
   }
}
