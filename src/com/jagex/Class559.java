package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class164;
import com.jagex.Class318_Sub2;
import com.jagex.Class339;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class555;
import com.jagex.Class566;
import com.jagex.Class594;
import com.jagex.Class639_Sub1;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.client;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class559 {
   public static int anInt7544;
   public List aList7541 = new LinkedList();
   boolean aBool7543 = false;
   int anInt7540 = 0;
   int anInt7542 = 0;

   public void method6717() {
      Iterator var1 = this.aList7541.iterator();

      while(var1.hasNext()) {
         Class555 var2 = (Class555)var1.next();
         var1.remove();
         Class684.method8042(var2, 1805999637);
      }

   }

   public void method6718(byte var1) {
      Iterator var2 = this.aList7541.iterator();

      while(var2.hasNext()) {
         Class555 var3 = (Class555)var2.next();
         var2.remove();
         Class684.method8042(var3, 2016403839);
      }

   }

   void method6719(Class555 var1, byte var2) {
      Class639_Sub1 var3 = var1.aClass639_Sub1_7477;
      boolean var4 = true;
      Class164[] var5 = var1.aClass639_Sub1_7477.aClass164Array10829;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         if(var5[var6].aBool1784) {
            var4 = false;
            break;
         }
      }

      if(!var4) {
         var1.aClass559_7476 = this;
         Class555 var7;
         if(this.aBool7543) {
            Iterator var8 = this.aList7541.iterator();

            while(var8.hasNext()) {
               var7 = (Class555)var8.next();
               if(var7.aClass639_Sub1_7477 == var3) {
                  var8.remove();
                  Class684.method8042(var7, 1777924252);
               }
            }
         }

         ListIterator var9 = this.aList7541.listIterator();

         do {
            if(!var9.hasNext()) {
               this.aList7541.add(var1);
               return;
            }

            var7 = (Class555)var9.next();
         } while(-1949413091 * var3.anInt10830 < var7.aClass639_Sub1_7477.anInt10830 * -1949413091);

         var9.previous();
         var9.add(var1);
      }
   }

   Class559(boolean var1) {
      this.aBool7543 = var1;
   }

   static final void method6720(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class566.aClass223_7610.method3122(var2, (byte)89).method2993((byte)0);
   }

   static final void method6721(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      if(var2 >= 0 && var2 < 2) {
         client.anIntArrayArrayArray11100[var2] = new int[var3 << 1][4];
      }

   }

   public static final void method6722(int var0, boolean var1, int var2) {
      if(null != Class318_Sub2.aClass526_Sub9_10065) {
         if(var0 >= 0 && var0 < 1763792899 * Class318_Sub2.aClass526_Sub9_10065.anInt10400) {
            Class339 var3 = Class318_Sub2.aClass526_Sub9_10065.aClass339Array10402[var0];
            Class111 var4 = Class452_Sub4.method9295((byte)38);
            OutFrameBuffer var5 = Class115.method1414(OutFrame.aClass405_4283, var4.aClass14_1342, -1238525612);
            var5.out.writeByte(3 + Class594.method7039(var3.aString3528, -518623613), 1506601034);
            var5.out.writeShort(var0, -805078716);
            var5.out.writeByte(var1?1:0, -1824538220);
            var5.out.method9616(var3.aString3528, -755869533);
            var4.write(var5, (byte)-57);
         }
      }
   }
}
