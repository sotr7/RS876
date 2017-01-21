package com.jagex;

import com.jagex.Class115;
import com.jagex.Class255;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub29;
import com.jagex.Class526_Sub29_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Class654;
import com.jagex.client;
import java.util.LinkedList;
import java.util.Queue;

public class Class654_Sub1 extends Class654 {
   Queue aQueue10833 = new LinkedList();

   void method9884(Class526_Sub29_Sub1 var1, byte var2) {
      this.aQueue10833.add(var1);
      if(this.aQueue10833.size() > 10) {
         this.aQueue10833.poll();
      }

   }

   void method7804(byte var1) {
      Class526_Sub29_Sub1 var2 = (Class526_Sub29_Sub1)this.aQueue10833.poll();
      if(null != var2) {
         OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4287, client.aClass111_11060.aClass14_1342, 1335605223);
         var3.out.writeShort128(this.method7799(var2, '\uffff', 1906501842), (byte)39);
         var3.out.writeByteC(var2.method10658(-2145632397) << 1 | var2.method10651((byte)67) & 1, -802285532);
         var3.out.writeIntLE(var2.method9527((byte)81) | var2.method9530(1762748637) << 16, (byte)3);
         client.aClass111_11060.write(var3, (byte)-102);
         var2.method9533((byte)-82);
      }
   }

   void method9885(RSByteBuffer var1, Class526_Sub29_Sub1 var2, int var3) {
      var1.writeByte(var2.method10651((byte)34), -259619573);
   }

   int method7802(byte var1) {
      return 1;
   }

   void method7803(RSByteBuffer var1, Class526_Sub29 var2, int var3) {
      this.method9885(var1, (Class526_Sub29_Sub1)var2, 1209578485);
   }

   void method7800() {
      Class526_Sub29_Sub1 var1 = (Class526_Sub29_Sub1)this.aQueue10833.poll();
      if(null != var1) {
         OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4287, client.aClass111_11060.aClass14_1342, 1974628698);
         var2.out.writeShort128(this.method7799(var1, '\uffff', 1706564403), (byte)69);
         var2.out.writeByteC(var1.method10658(-2144862430) << 1 | var1.method10651((byte)66) & 1, -802285532);
         var2.out.writeIntLE(var1.method9527((byte)41) | var1.method9530(1762748637) << 16, (byte)102);
         client.aClass111_11060.write(var2, (byte)-51);
         var1.method9533((byte)-78);
      }
   }

   void method7815() {
      Class526_Sub29_Sub1 var1 = (Class526_Sub29_Sub1)this.aQueue10833.poll();
      if(null != var1) {
         OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4287, client.aClass111_11060.aClass14_1342, 87671882);
         var2.out.writeShort128(this.method7799(var1, '\uffff', 1568314900), (byte)62);
         var2.out.writeByteC(var1.method10658(-2129401532) << 1 | var1.method10651((byte)50) & 1, -802285532);
         var2.out.writeIntLE(var1.method9527((byte)70) | var1.method9530(1762748637) << 16, (byte)72);
         client.aClass111_11060.write(var2, (byte)17);
         var1.method9533((byte)-68);
      }
   }

   boolean method7801() {
      return !this.aQueue10833.isEmpty() || 2949132011686556139L * this.aLong8483 < Class255.time((byte)24) - 2000L;
   }

   boolean method7805(int var1) {
      return !this.aQueue10833.isEmpty() || 2949132011686556139L * this.aLong8483 < Class255.time((byte)24) - 2000L;
   }

   OutFrameBuffer method7813() {
      return Class115.method1414(OutFrame.aClass405_4224, client.aClass111_11060.aClass14_1342, 1973608956);
   }

   void method7817(RSByteBuffer var1, Class526_Sub29 var2) {
      this.method9885(var1, (Class526_Sub29_Sub1)var2, 1841173742);
   }

   int method7798() {
      return 1;
   }

   void method7812(RSByteBuffer var1, Class526_Sub29 var2) {
      this.method9885(var1, (Class526_Sub29_Sub1)var2, 1693651997);
   }

   boolean method7810() {
      return !this.aQueue10833.isEmpty() || 2949132011686556139L * this.aLong8483 < Class255.time((byte)24) - 2000L;
   }

   OutFrameBuffer method7806(int var1) {
      return Class115.method1414(OutFrame.aClass405_4224, client.aClass111_11060.aClass14_1342, 1220682930);
   }
}
