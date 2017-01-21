package com.jagex;

import com.jagex.Class466;
import com.jagex.Class481;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class90 {
   static int anInt860;
   static FileOutputStream aFileOutputStream863;
   Class481 aClass481_862;
   Map aMap861;

   public Class90(Class466 var1, int var2, int var3) {
      byte[] var4 = var1.method5536(var2, var3, (byte)-65);
      this.method1208(new RSByteBuffer(var4), -1658890515);
   }

   void method1208(RSByteBuffer var1, int var2) {
      this.aClass481_862 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)121), var1.readUnsignedByte(1100394430), (byte)-71);
      int var3 = var1.method9686(-338583511);
      this.aMap861 = new HashMap(var3);

      while(var3-- > 0) {
         Object var4 = this.aClass481_862.method5757(var1, -504626889);
         int var5 = var1.method9686(1454728000);
         LinkedList var6 = new LinkedList();

         while(var5-- > 0) {
            int var7 = var1.method9686(724147736);
            var6.add(Integer.valueOf(var7));
         }

         this.aMap861.put(var4, var6);
      }

   }

   public List method1209(Object var1, byte var2) {
      return (List)this.aMap861.get(var1);
   }

   void method1210(RSByteBuffer var1) {
      this.aClass481_862 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)93), var1.readUnsignedByte(-1825999192), (byte)-36);
      int var2 = var1.method9686(992336717);
      this.aMap861 = new HashMap(var2);

      while(var2-- > 0) {
         Object var3 = this.aClass481_862.method5757(var1, 414901653);
         int var4 = var1.method9686(-1671966088);
         LinkedList var5 = new LinkedList();

         while(var4-- > 0) {
            int var6 = var1.method9686(1638762293);
            var5.add(Integer.valueOf(var6));
         }

         this.aMap861.put(var3, var5);
      }

   }
}
