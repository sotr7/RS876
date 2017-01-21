package com.jagex;

import com.jagex.Class454;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class681;
import com.jagex.Class69;
import com.jagex.Interface12;
import com.jagex.Interface5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class24 implements Interface12, Interface5 {
   static int anInt241;
   HashMap aHashMap239;
   public Class454 aClass454_233;
   public Class454 aClass454_234;
   String aString235 = "null";
   int anInt236;
   int anInt240 = 0;
   Map aMap237;
   Object[] anObjectArray238;

   void method696() {
      HashMap var1 = new HashMap();
      Object var4;
      Iterator var9;
      Entry var10;
      if(null != this.anObjectArray238) {
         for(int var2 = 0; var2 < this.anObjectArray238.length; ++var2) {
            if(this.anObjectArray238[var2] != null) {
               Object var3 = this.anObjectArray238[var2];
               var4 = (List)var1.get(var3);
               if(var4 == null) {
                  var4 = new LinkedList();
                  var1.put(var3, var4);
               }

               ((List)var4).add(new Integer(var2));
            }
         }
      } else {
         if(this.aMap237 == null) {
            throw new IllegalStateException();
         }

         Object var5;
         for(var9 = this.aMap237.entrySet().iterator(); var9.hasNext(); ((List)var5).add(var10.getKey())) {
            var10 = (Entry)var9.next();
            var4 = var10.getValue();
            var5 = (List)var1.get(var4);
            if(var5 == null) {
               var5 = new LinkedList();
               var1.put(var4, var5);
            }
         }
      }

      this.aHashMap239 = new HashMap();

      int[] var12;
      for(var9 = var1.entrySet().iterator(); var9.hasNext(); this.aHashMap239.put(var10.getKey(), var12)) {
         var10 = (Entry)var9.next();
         List var11 = (List)var10.getValue();
         var12 = new int[var11.size()];
         int var6 = 0;

         Integer var8;
         for(Iterator var7 = var11.iterator(); var7.hasNext(); var12[var6++] = var8.intValue()) {
            var8 = (Integer)var7.next();
         }

         if(this.anObjectArray238 == null) {
            Arrays.sort(var12);
         }
      }

   }

   public int method697(int var1) {
      Object var2 = this.method714(var1, -582039715);
      return var2 == null?this.anInt236 * 1145058717:((Integer)var2).intValue();
   }

   void method698() {
      HashMap var1 = new HashMap();
      Object var4;
      Iterator var9;
      Entry var10;
      if(null != this.anObjectArray238) {
         for(int var2 = 0; var2 < this.anObjectArray238.length; ++var2) {
            if(this.anObjectArray238[var2] != null) {
               Object var3 = this.anObjectArray238[var2];
               var4 = (List)var1.get(var3);
               if(var4 == null) {
                  var4 = new LinkedList();
                  var1.put(var3, var4);
               }

               ((List)var4).add(new Integer(var2));
            }
         }
      } else {
         if(this.aMap237 == null) {
            throw new IllegalStateException();
         }

         Object var5;
         for(var9 = this.aMap237.entrySet().iterator(); var9.hasNext(); ((List)var5).add(var10.getKey())) {
            var10 = (Entry)var9.next();
            var4 = var10.getValue();
            var5 = (List)var1.get(var4);
            if(var5 == null) {
               var5 = new LinkedList();
               var1.put(var4, var5);
            }
         }
      }

      this.aHashMap239 = new HashMap();

      int[] var12;
      for(var9 = var1.entrySet().iterator(); var9.hasNext(); this.aHashMap239.put(var10.getKey(), var12)) {
         var10 = (Entry)var9.next();
         List var11 = (List)var10.getValue();
         var12 = new int[var11.size()];
         int var6 = 0;

         Integer var8;
         for(Iterator var7 = var11.iterator(); var7.hasNext(); var12[var6++] = var8.intValue()) {
            var8 = (Integer)var7.next();
         }

         if(this.anObjectArray238 == null) {
            Arrays.sort(var12);
         }
      }

   }

   void method699(RSByteBuffer var1, int var2, byte var3) {
      char var4;
      if(var2 == 1) {
         var4 = Class69.method1087(var1.readByte((byte)71), (short)18141);
         this.aClass454_233 = Class454.method5388(var4, -1450246664);
      } else if(2 == var2) {
         var4 = Class69.method1087(var1.readByte((byte)116), (short)25404);
         this.aClass454_234 = Class454.method5388(var4, -2058504596);
      } else if(var2 == 3) {
         this.aString235 = var1.readString(-2006676664);
      } else if(var2 == 4) {
         this.anInt236 = var1.readInt((byte)5) * -1171064651;
      } else {
         int var5;
         int var7;
         if(var2 != 5 && var2 != 6) {
            if(7 == var2 || var2 == 8) {
               var7 = var1.readUnsignedShort(1501699185);
               this.anInt240 = var1.readUnsignedShort(2080212056) * -1840123847;
               this.anObjectArray238 = new Object[var7];

               for(var5 = 0; var5 < this.anInt240 * 2029452809; ++var5) {
                  int var8 = var1.readUnsignedShort(1645682152);
                  if(var2 == 7) {
                     this.anObjectArray238[var8] = var1.readString(409280320);
                  } else {
                     this.anObjectArray238[var8] = new Integer(var1.readInt((byte)5));
                  }
               }
            } else if(var2 == 101) {
               this.aClass454_233 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1819361674), (byte)-113);
            } else if(102 == var2) {
               this.aClass454_234 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-364209910), (byte)-20);
            }
         } else {
            this.anInt240 = var1.readUnsignedShort(169792583) * -1840123847;
            this.aMap237 = new HashMap(this.anInt240 * 2029452809);

            for(var7 = 0; var7 < 2029452809 * this.anInt240; ++var7) {
               var5 = var1.readInt((byte)5);
               Object var6;
               if(var2 == 5) {
                  var6 = var1.readString(711749014);
               } else {
                  var6 = new Integer(var1.readInt((byte)5));
               }

               this.aMap237.put(new Integer(var5), var6);
            }
         }
      }

   }

   void method700() {
      HashMap var1 = new HashMap();
      Object var4;
      Iterator var9;
      Entry var10;
      if(null != this.anObjectArray238) {
         for(int var2 = 0; var2 < this.anObjectArray238.length; ++var2) {
            if(this.anObjectArray238[var2] != null) {
               Object var3 = this.anObjectArray238[var2];
               var4 = (List)var1.get(var3);
               if(var4 == null) {
                  var4 = new LinkedList();
                  var1.put(var3, var4);
               }

               ((List)var4).add(new Integer(var2));
            }
         }
      } else {
         if(this.aMap237 == null) {
            throw new IllegalStateException();
         }

         Object var5;
         for(var9 = this.aMap237.entrySet().iterator(); var9.hasNext(); ((List)var5).add(var10.getKey())) {
            var10 = (Entry)var9.next();
            var4 = var10.getValue();
            var5 = (List)var1.get(var4);
            if(var5 == null) {
               var5 = new LinkedList();
               var1.put(var4, var5);
            }
         }
      }

      this.aHashMap239 = new HashMap();

      int[] var12;
      for(var9 = var1.entrySet().iterator(); var9.hasNext(); this.aHashMap239.put(var10.getKey(), var12)) {
         var10 = (Entry)var9.next();
         List var11 = (List)var10.getValue();
         var12 = new int[var11.size()];
         int var6 = 0;

         Integer var8;
         for(Iterator var7 = var11.iterator(); var7.hasNext(); var12[var6++] = var8.intValue()) {
            var8 = (Integer)var7.next();
         }

         if(this.anObjectArray238 == null) {
            Arrays.sort(var12);
         }
      }

   }

   public boolean method701(Object var1, short var2) {
      if(0 == 2029452809 * this.anInt240) {
         return false;
      } else {
         if(null == this.aHashMap239) {
            this.method704((byte)43);
         }

         return this.aHashMap239.containsKey(var1);
      }
   }

   public int[] method702(Object var1, int var2) {
      if(0 == this.anInt240 * 2029452809) {
         return null;
      } else {
         if(null == this.aHashMap239) {
            this.method704((byte)27);
         }

         return (int[])((int[])this.aHashMap239.get(var1));
      }
   }

   public int method703(int var1) {
      return 2029452809 * this.anInt240;
   }

   void method704(byte var1) {
      HashMap var2 = new HashMap();
      Object var5;
      Iterator var10;
      Entry var11;
      if(null != this.anObjectArray238) {
         for(int var3 = 0; var3 < this.anObjectArray238.length; ++var3) {
            if(this.anObjectArray238[var3] != null) {
               Object var4 = this.anObjectArray238[var3];
               var5 = (List)var2.get(var4);
               if(var5 == null) {
                  var5 = new LinkedList();
                  var2.put(var4, var5);
               }

               ((List)var5).add(new Integer(var3));
            }
         }
      } else {
         if(this.aMap237 == null) {
            throw new IllegalStateException();
         }

         Object var6;
         for(var10 = this.aMap237.entrySet().iterator(); var10.hasNext(); ((List)var6).add(var11.getKey())) {
            var11 = (Entry)var10.next();
            var5 = var11.getValue();
            var6 = (List)var2.get(var5);
            if(var6 == null) {
               var6 = new LinkedList();
               var2.put(var5, var6);
            }
         }
      }

      this.aHashMap239 = new HashMap();

      int[] var13;
      for(var10 = var2.entrySet().iterator(); var10.hasNext(); this.aHashMap239.put(var11.getKey(), var13)) {
         var11 = (Entry)var10.next();
         List var12 = (List)var11.getValue();
         var13 = new int[var12.size()];
         int var7 = 0;

         Integer var9;
         for(Iterator var8 = var12.iterator(); var8.hasNext(); var13[var7++] = var9.intValue()) {
            var9 = (Integer)var8.next();
         }

         if(this.anObjectArray238 == null) {
            Arrays.sort(var13);
         }
      }

   }

   void method705(RSByteBuffer var1, int var2) {
      char var3;
      if(var2 == 1) {
         var3 = Class69.method1087(var1.readByte((byte)79), (short)10763);
         this.aClass454_233 = Class454.method5388(var3, -1452597781);
      } else if(2 == var2) {
         var3 = Class69.method1087(var1.readByte((byte)43), (short)7519);
         this.aClass454_234 = Class454.method5388(var3, -1324249487);
      } else if(var2 == 3) {
         this.aString235 = var1.readString(-1601315065);
      } else if(var2 == 4) {
         this.anInt236 = var1.readInt((byte)5) * -1171064651;
      } else {
         int var4;
         int var6;
         if(var2 != 5 && var2 != 6) {
            if(7 == var2 || var2 == 8) {
               var6 = var1.readUnsignedShort(1860340019);
               this.anInt240 = var1.readUnsignedShort(972878341) * -1840123847;
               this.anObjectArray238 = new Object[var6];

               for(var4 = 0; var4 < this.anInt240 * 2029452809; ++var4) {
                  int var7 = var1.readUnsignedShort(448779976);
                  if(var2 == 7) {
                     this.anObjectArray238[var7] = var1.readString(-1329716280);
                  } else {
                     this.anObjectArray238[var7] = new Integer(var1.readInt((byte)5));
                  }
               }
            } else if(var2 == 101) {
               this.aClass454_233 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1723893876), (byte)-62);
            } else if(102 == var2) {
               this.aClass454_234 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-956698985), (byte)-16);
            }
         } else {
            this.anInt240 = var1.readUnsignedShort(1744108445) * -1840123847;
            this.aMap237 = new HashMap(this.anInt240 * 2029452809);

            for(var6 = 0; var6 < 2029452809 * this.anInt240; ++var6) {
               var4 = var1.readInt((byte)5);
               Object var5;
               if(var2 == 5) {
                  var5 = var1.readString(-75433177);
               } else {
                  var5 = new Integer(var1.readInt((byte)5));
               }

               this.aMap237.put(new Integer(var4), var5);
            }
         }
      }

   }

   public void method49(int var1, int var2) {
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1030080933);
         if(var2 == 0) {
            return;
         }

         this.method699(var1, var2, (byte)12);
      }
   }

   public void method85() {
   }

   public int method706(int var1, int var2) {
      Object var3 = this.method714(var1, -1114335186);
      return var3 == null?this.anInt236 * 1145058717:((Integer)var3).intValue();
   }

   public void method51(int var1) {
   }

   void method707(RSByteBuffer var1, int var2) {
      char var3;
      if(var2 == 1) {
         var3 = Class69.method1087(var1.readByte((byte)47), (short)2004);
         this.aClass454_233 = Class454.method5388(var3, -1968449476);
      } else if(2 == var2) {
         var3 = Class69.method1087(var1.readByte((byte)49), (short)14867);
         this.aClass454_234 = Class454.method5388(var3, -2094659238);
      } else if(var2 == 3) {
         this.aString235 = var1.readString(-1277678095);
      } else if(var2 == 4) {
         this.anInt236 = var1.readInt((byte)5) * -1171064651;
      } else {
         int var4;
         int var6;
         if(var2 != 5 && var2 != 6) {
            if(7 == var2 || var2 == 8) {
               var6 = var1.readUnsignedShort(1006704657);
               this.anInt240 = var1.readUnsignedShort(2011708402) * -1840123847;
               this.anObjectArray238 = new Object[var6];

               for(var4 = 0; var4 < this.anInt240 * 2029452809; ++var4) {
                  int var7 = var1.readUnsignedShort(406123053);
                  if(var2 == 7) {
                     this.anObjectArray238[var7] = var1.readString(311143277);
                  } else {
                     this.anObjectArray238[var7] = new Integer(var1.readInt((byte)5));
                  }
               }
            } else if(var2 == 101) {
               this.aClass454_233 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-725637017), (byte)-126);
            } else if(102 == var2) {
               this.aClass454_234 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1493498121), (byte)-56);
            }
         } else {
            this.anInt240 = var1.readUnsignedShort(1055608254) * -1840123847;
            this.aMap237 = new HashMap(this.anInt240 * 2029452809);

            for(var6 = 0; var6 < 2029452809 * this.anInt240; ++var6) {
               var4 = var1.readInt((byte)5);
               Object var5;
               if(var2 == 5) {
                  var5 = var1.readString(1244407664);
               } else {
                  var5 = new Integer(var1.readInt((byte)5));
               }

               this.aMap237.put(new Integer(var4), var5);
            }
         }
      }

   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1556852192);
         if(var2 == 0) {
            return;
         }

         this.method699(var1, var2, (byte)12);
      }
   }

   public int method708(int var1) {
      Object var2 = this.method714(var1, 243010738);
      return var2 == null?this.anInt236 * 1145058717:((Integer)var2).intValue();
   }

   public int method709(int var1) {
      Object var2 = this.method714(var1, 52725115);
      return var2 == null?this.anInt236 * 1145058717:((Integer)var2).intValue();
   }

   public int method710(int var1) {
      Object var2 = this.method714(var1, 1379744881);
      return var2 == null?this.anInt236 * 1145058717:((Integer)var2).intValue();
   }

   public int method711(int var1) {
      Object var2 = this.method714(var1, -399324688);
      return var2 == null?this.anInt236 * 1145058717:((Integer)var2).intValue();
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1250759058);
         if(var3 == 0) {
            return;
         }

         this.method699(var1, var3, (byte)12);
      }
   }

   public void method81(int var1) {
   }

   public String method712(int var1, int var2) {
      Object var3 = this.method714(var1, 1618399847);
      return var3 == null?this.aString235:(String)var3;
   }

   public int method713() {
      return 2029452809 * this.anInt240;
   }

   Object method714(int var1, int var2) {
      return this.anObjectArray238 != null?(var1 >= 0 && var1 < this.anObjectArray238.length?this.anObjectArray238[var1]:null):(null != this.aMap237?this.aMap237.get(new Integer(var1)):null);
   }

   public void method50(int var1) {
   }

   static final void method715(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.aByte3636;
   }
}
