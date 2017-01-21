package com.jagex;

import com.jagex.Class195;
import com.jagex.Class22;
import com.jagex.Class221;
import com.jagex.Class231;
import com.jagex.InterfaceDef;
import com.jagex.Class263;
import com.jagex.Class298;
import com.jagex.Class681;
import com.jagex.Class689_Sub2;
import java.util.Iterator;
import java.util.LinkedList;

public class Class269 {
   static final int anInt2989 = 10;
   boolean aBool2990 = false;
   String aString2992;
   LinkedList aLinkedList2991 = new LinkedList();

   final Class263 method3575(String var1, byte var2) {
      Iterator var3 = this.aLinkedList2991.iterator();

      Class263 var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (Class263)var3.next();
      } while(!var4.aString2968.equals(var1));

      return var4;
   }

   public void method3576(boolean var1, byte var2) {
      this.aBool2990 = var1;
   }

   public int method3577(int var1) {
      return this.aLinkedList2991.size();
   }

   public final boolean method3578(String var1, int var2, int var3, int var4) {
      if(!var1.isEmpty() && var1.length() <= 10 && Class22.method676(var1.charAt(0), 476630695)) {
         Class263 var5 = this.method3575(var1, (byte)14);
         if(null != var5) {
            this.aLinkedList2991.remove(var5);
         }

         this.aLinkedList2991.add(new Class263(var1, var2, var3));
         this.method3582(2146335649);
         return true;
      } else {
         return false;
      }
   }

   public final void method3579(String var1, int var2) {
      Iterator var3 = this.aLinkedList2991.iterator();

      while(var3.hasNext()) {
         Class263 var4 = (Class263)var3.next();
         if(var4.aString2968.equals(var1)) {
            var3.remove();
            break;
         }
      }

   }

   public void method3580(boolean var1) {
      this.aBool2990 = var1;
   }

   public final String method3581(String var1, byte var2) {
      if(this.aLinkedList2991.isEmpty()) {
         return var1;
      } else {
         StringBuilder var3 = new StringBuilder(var1.length());
         int var4 = var1.length();
         boolean var5 = false;

         for(int var6 = 0; var6 < var4; ++var6) {
            boolean var7 = false;
            char var8 = var1.charAt(var6);
            if(var5) {
               if(var8 == 62) {
                  var5 = false;
               }
            } else if(var8 == 60) {
               var5 = true;
            } else if(this.aString2992.indexOf(var8) != -1) {
               for(int var9 = 0; var9 < this.aLinkedList2991.size(); ++var9) {
                  Class263 var10 = (Class263)this.aLinkedList2991.get(var9);
                  int var11 = var10.aString2968.length();
                  if(var6 <= var4 - var11 && var1.substring(var6, var11 + var6).equals(var10.aString2968)) {
                     String var12;
                     if(2001005207 * var10.anInt2967 > 0) {
                        var12 = String.format("<sprite=%d,%d>", new Object[]{Integer.valueOf(var10.anInt2966 * 534676501), Integer.valueOf(2001005207 * var10.anInt2967)});
                     } else {
                        var12 = String.format("<sprite=%d>", new Object[]{Integer.valueOf(534676501 * var10.anInt2966)});
                     }

                     var3.append(var12);
                     var7 = true;
                     var6 += var11 - 1;
                     break;
                  }
               }
            }

            if(!var7) {
               var3.append(var8);
            }
         }

         return var3.toString();
      }
   }

   final void method3582(int var1) {
      this.aString2992 = "";

      for(int var2 = 0; var2 < this.aLinkedList2991.size(); ++var2) {
         Class263 var3 = (Class263)this.aLinkedList2991.get(var2);
         char var4 = var3.aString2968.charAt(0);
         if(this.aString2992.indexOf(var4) < 0) {
            this.aString2992 = this.aString2992 + var4;
         }
      }

   }

   public boolean method3583(int var1) {
      return this.aBool2990;
   }

   public void method3584(boolean var1) {
      this.aBool2990 = var1;
   }

   public void method3585(boolean var1) {
      this.aBool2990 = var1;
   }

   public final void method3586(int var1) {
      this.aLinkedList2991.clear();
      this.aString2992 = "";
   }

   public final void method3587() {
      this.aLinkedList2991.clear();
      this.aString2992 = "";
   }

   static boolean method3588(int var0, byte var1) {
      return 59 == var0 || var0 == 2 || var0 == 8 || 17 == var0 || var0 == 15 || 16 == var0 || var0 == 58;
   }

   static final void method3589(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)31);
      Class231.method3253(var3, var0, -713535682);
   }

   static final void method3590(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass526_Sub9_8646.anInt10400 * 1763792899;
   }

   static final void method3591(Class681 var0, int var1) {
      if(Class195.aClass292_Sub1_2182.method3940(-352240259) != Class298.aClass298_3241) {
         throw new RuntimeException();
      } else {
         ((Class689_Sub2)Class195.aClass292_Sub1_2182.method3938((byte)1)).method10204(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -1771132261);
      }
   }
}
