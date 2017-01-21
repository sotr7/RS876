package com.jagex;

import com.jagex.Class21;
import com.jagex.Class450;
import com.jagex.RSByteBuffer;
import com.jagex.Class619;
import com.jagex.Class681;
import com.jagex.client;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class51 {
   static final int anInt661 = 10;
   static final int anInt662 = 1;
   LinkedHashMap aLinkedHashMap663;

   Class51(RSByteBuffer var1) {
      this.aLinkedHashMap663 = new LinkedHashMap();
      if(null != var1 && null != var1.buffer) {
         int var2 = var1.readUnsignedByte(168135118);
         if(var2 > 0 && var2 <= 1) {
            int var3 = var1.readUnsignedByte(1753292561);

            for(int var4 = 0; var4 < var3; ++var4) {
               long var5 = var1.method9663(448951874);
               int var7 = var1.readInt((byte)5);
               this.aLinkedHashMap663.put(Long.valueOf(var5), Integer.valueOf(var7));
            }

         }
      }
   }

   void method947(RSByteBuffer var1, int var2) {
      var1.writeByte(1, 1966174016);
      var1.writeByte(this.aLinkedHashMap663.size(), 343939768);
      Iterator var3 = this.aLinkedHashMap663.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var1.method9621(((Long)var4.getKey()).longValue());
         var1.writeInt(((Integer)var4.getValue()).intValue(), -357564953);
      }

   }

   void method948(long var1, int var3, byte var4) {
      if(this.aLinkedHashMap663.size() >= 10 && !this.aLinkedHashMap663.containsKey(Long.valueOf(var1))) {
         Iterator var5 = this.aLinkedHashMap663.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.aLinkedHashMap663.put(Long.valueOf(var1), Integer.valueOf(var3));
      this.method951(925809255);
   }

   Class51() {
      this((RSByteBuffer)null);
   }

   boolean method949(long var1) {
      return this.aLinkedHashMap663.containsKey(Long.valueOf(var1));
   }

   void method950(RSByteBuffer var1) {
      var1.writeByte(1, -483127044);
      var1.writeByte(this.aLinkedHashMap663.size(), 398965175);
      Iterator var2 = this.aLinkedHashMap663.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method9621(((Long)var3.getKey()).longValue());
         var1.writeInt(((Integer)var3.getValue()).intValue(), -357564953);
      }

   }

   void method951(int var1) {
      Class21 var2 = null;

      try {
         try {
            var2 = Class619.method7340("3", client.aClass676_11127.aString8591, true, 1236947259);
            RSByteBuffer var3 = new RSByteBuffer(5000);
            this.method947(var3, -1016378555);
            var2.method650(var3.buffer, 0, 301018015 * var3.pos, (byte)-59);
         } catch (Exception var14) {
            try {
               if(var2 != null) {
                  var2.method651(1288298302);
                  return;
               }
            } catch (Exception var12) {
               ;
            }

            return;
         }

         try {
            if(var2 != null) {
               var2.method651(2016668558);
            }
         } catch (Exception var13) {
            ;
         }

      } finally {
         try {
            if(var2 != null) {
               var2.method651(68477693);
            }
         } catch (Exception var11) {
            ;
         }

      }
   }

   int method952(long var1) {
      return ((Integer)this.aLinkedHashMap663.get(Long.valueOf(var1))).intValue();
   }

   void method953(long var1, int var3) {
      if(this.aLinkedHashMap663.size() >= 10 && !this.aLinkedHashMap663.containsKey(Long.valueOf(var1))) {
         Iterator var4 = this.aLinkedHashMap663.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.aLinkedHashMap663.put(Long.valueOf(var1), Integer.valueOf(var3));
      this.method951(2106876773);
   }

   void method954(RSByteBuffer var1) {
      var1.writeByte(1, -690379757);
      var1.writeByte(this.aLinkedHashMap663.size(), 1187612637);
      Iterator var2 = this.aLinkedHashMap663.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method9621(((Long)var3.getKey()).longValue());
         var1.writeInt(((Integer)var3.getValue()).intValue(), -357564953);
      }

   }

   static final void method955(Class681 var0, byte var1) {
      if(-1395039251 * client.anInt11064 >= 2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1395039251 * client.anInt11064;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   public static byte[] method956(Object var0, int var1, int var2, int var3) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         return Arrays.copyOfRange(var6, var1, var2 + var1);
      } else if(var0 instanceof ByteBuffer) {
         ByteBuffer var4 = (ByteBuffer)var0;
         byte[] var5 = new byte[var2];
         var4.position(var1);
         var4.get(var5, 0, var2);
         return var5;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method957(Class681 var0, int var1) {
      Class450.method5343(-764957082);
   }
}
