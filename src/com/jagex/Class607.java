package com.jagex;

import com.jagex.Class105;
import com.jagex.Class214;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.RSByteBuffer;
import com.jagex.Class615;
import com.jagex.Class616;
import com.jagex.Class617;
import com.jagex.Class622;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class71;
import com.jagex.client;
import java.util.Iterator;
import java.util.LinkedList;

public class Class607 implements Iterable {
   public static int anInt7914;
   Class616[] aClass616Array7912;
   Class617[] aClass617Array7913;

   void method7132() {
      this.aClass616Array7912 = null;
   }

   public Class616 method7133(int var1, int var2) {
      return this.aClass616Array7912[var1];
   }

   void method7134(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(1989949428);
         if(0 == var3) {
            return;
         }

         int var4;
         if(var3 == 1) {
            var4 = var1.readUnsignedByte(-305827981);
            int var16 = 0;
            LinkedList var17 = new LinkedList();

            for(int var7 = 0; var7 < var4; ++var7) {
               int var8 = var1.readUnsignedByte(-2013589384);
               int var9 = var1.readUnsignedShort(1094203107);
               int var10 = var1.readUnsignedByte(971921208);
               int var11 = 0;
               Class617 var12 = Class617.aClass617_8100;
               byte var13 = 1;
               boolean var14 = (var10 & 1) != 0;
               if(0 != (var10 & 2)) {
                  var11 = var1.readUnsignedByte(-1032012265);
               }

               if((var10 & 4) != 0) {
                  var12 = this.aClass617Array7913[var1.readUnsignedByte(-1781722579)];
               }

               if(0 != (var10 & 8)) {
                  var13 = var1.readByte((byte)58);
               }

               boolean var15 = var1.readUnsignedByte(-2063972062) == 1;
               var17.add(new Class616(var8, var9, var14, var15, var11, var12, var13));
               if(var8 > var16) {
                  var16 = var8;
               }
            }

            this.aClass616Array7912 = new Class616[var16 + 1];

            Class616 var19;
            for(Iterator var18 = var17.iterator(); var18.hasNext(); this.aClass616Array7912[var19.method7284(182793117)] = var19) {
               var19 = (Class616)var18.next();
            }
         } else if(2 == var3) {
            this.aClass617Array7913 = new Class617[var1.readUnsignedByte(-1896922160)];

            for(var4 = var1.readUnsignedByte(-1525374329); var4 != 255; var4 = var1.readUnsignedByte(123138141)) {
               int[] var5 = new int[var1.readUnsignedShort(1172557622)];

               for(int var6 = 0; var6 < var5.length; ++var6) {
                  var5[var6] = var1.readInt((byte)5);
               }

               this.aClass617Array7913[var4] = new Class617(var5);
            }
         }
      }
   }

   public Class607(Class466 var1) {
      this.method7139(var1.method5541(Class622.aClass622_8141.anInt8139 * 127490303, 16777472), -819621006);
   }

   public int method7135(byte var1) {
      return this.aClass616Array7912.length;
   }

   public Iterator iterator() {
      return new Class615(this.aClass616Array7912);
   }

   public Iterator method7136() {
      return new Class615(this.aClass616Array7912);
   }

   public Iterator method7137() {
      return new Class615(this.aClass616Array7912);
   }

   void method7138() {
      this.aClass616Array7912 = null;
   }

   void method7139(byte[] var1, int var2) {
      this.method7142(1824378156);
      if(var1 == null) {
         this.aClass616Array7912 = new Class616[0];
      } else {
         this.method7134(new RSByteBuffer(var1), -1816586181);
      }
   }

   void method7140(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-161501093);
         if(0 == var2) {
            return;
         }

         int var3;
         if(var2 == 1) {
            var3 = var1.readUnsignedByte(-1310024522);
            int var15 = 0;
            LinkedList var16 = new LinkedList();

            for(int var6 = 0; var6 < var3; ++var6) {
               int var7 = var1.readUnsignedByte(1159338508);
               int var8 = var1.readUnsignedShort(2038946462);
               int var9 = var1.readUnsignedByte(-1617923860);
               int var10 = 0;
               Class617 var11 = Class617.aClass617_8100;
               byte var12 = 1;
               boolean var13 = (var9 & 1) != 0;
               if(0 != (var9 & 2)) {
                  var10 = var1.readUnsignedByte(1839778142);
               }

               if((var9 & 4) != 0) {
                  var11 = this.aClass617Array7913[var1.readUnsignedByte(1906477631)];
               }

               if(0 != (var9 & 8)) {
                  var12 = var1.readByte((byte)46);
               }

               boolean var14 = var1.readUnsignedByte(-820686419) == 1;
               var16.add(new Class616(var7, var8, var13, var14, var10, var11, var12));
               if(var7 > var15) {
                  var15 = var7;
               }
            }

            this.aClass616Array7912 = new Class616[var15 + 1];

            Class616 var18;
            for(Iterator var17 = var16.iterator(); var17.hasNext(); this.aClass616Array7912[var18.method7284(182793117)] = var18) {
               var18 = (Class616)var17.next();
            }
         } else if(2 == var2) {
            this.aClass617Array7913 = new Class617[var1.readUnsignedByte(-1113204725)];

            for(var3 = var1.readUnsignedByte(1812297817); var3 != 255; var3 = var1.readUnsignedByte(1703160158)) {
               int[] var4 = new int[var1.readUnsignedShort(907120264)];

               for(int var5 = 0; var5 < var4.length; ++var5) {
                  var4[var5] = var1.readInt((byte)5);
               }

               this.aClass617Array7913[var3] = new Class617(var4);
            }
         }
      }
   }

   void method7141(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(609219672);
         if(0 == var2) {
            return;
         }

         int var3;
         if(var2 == 1) {
            var3 = var1.readUnsignedByte(81012709);
            int var15 = 0;
            LinkedList var16 = new LinkedList();

            for(int var6 = 0; var6 < var3; ++var6) {
               int var7 = var1.readUnsignedByte(579431269);
               int var8 = var1.readUnsignedShort(77773244);
               int var9 = var1.readUnsignedByte(-1825287594);
               int var10 = 0;
               Class617 var11 = Class617.aClass617_8100;
               byte var12 = 1;
               boolean var13 = (var9 & 1) != 0;
               if(0 != (var9 & 2)) {
                  var10 = var1.readUnsignedByte(1112934852);
               }

               if((var9 & 4) != 0) {
                  var11 = this.aClass617Array7913[var1.readUnsignedByte(-648008557)];
               }

               if(0 != (var9 & 8)) {
                  var12 = var1.readByte((byte)111);
               }

               boolean var14 = var1.readUnsignedByte(-1540222365) == 1;
               var16.add(new Class616(var7, var8, var13, var14, var10, var11, var12));
               if(var7 > var15) {
                  var15 = var7;
               }
            }

            this.aClass616Array7912 = new Class616[var15 + 1];

            Class616 var18;
            for(Iterator var17 = var16.iterator(); var17.hasNext(); this.aClass616Array7912[var18.method7284(182793117)] = var18) {
               var18 = (Class616)var17.next();
            }
         } else if(2 == var2) {
            this.aClass617Array7913 = new Class617[var1.readUnsignedByte(-1878882691)];

            for(var3 = var1.readUnsignedByte(-1705927268); var3 != 255; var3 = var1.readUnsignedByte(-572337657)) {
               int[] var4 = new int[var1.readUnsignedShort(1127481147)];

               for(int var5 = 0; var5 < var4.length; ++var5) {
                  var4[var5] = var1.readInt((byte)5);
               }

               this.aClass617Array7913[var3] = new Class617(var4);
            }
         }
      }
   }

   void method7142(int var1) {
      this.aClass616Array7912 = null;
   }

   void method7143(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(2036065984);
         if(0 == var2) {
            return;
         }

         int var3;
         if(var2 == 1) {
            var3 = var1.readUnsignedByte(-1681943738);
            int var15 = 0;
            LinkedList var16 = new LinkedList();

            for(int var6 = 0; var6 < var3; ++var6) {
               int var7 = var1.readUnsignedByte(996401835);
               int var8 = var1.readUnsignedShort(1055897502);
               int var9 = var1.readUnsignedByte(-1742356098);
               int var10 = 0;
               Class617 var11 = Class617.aClass617_8100;
               byte var12 = 1;
               boolean var13 = (var9 & 1) != 0;
               if(0 != (var9 & 2)) {
                  var10 = var1.readUnsignedByte(1661579086);
               }

               if((var9 & 4) != 0) {
                  var11 = this.aClass617Array7913[var1.readUnsignedByte(612575543)];
               }

               if(0 != (var9 & 8)) {
                  var12 = var1.readByte((byte)62);
               }

               boolean var14 = var1.readUnsignedByte(-1780913081) == 1;
               var16.add(new Class616(var7, var8, var13, var14, var10, var11, var12));
               if(var7 > var15) {
                  var15 = var7;
               }
            }

            this.aClass616Array7912 = new Class616[var15 + 1];

            Class616 var18;
            for(Iterator var17 = var16.iterator(); var17.hasNext(); this.aClass616Array7912[var18.method7284(182793117)] = var18) {
               var18 = (Class616)var17.next();
            }
         } else if(2 == var2) {
            this.aClass617Array7913 = new Class617[var1.readUnsignedByte(-1870471355)];

            for(var3 = var1.readUnsignedByte(934612076); var3 != 255; var3 = var1.readUnsignedByte(-526134047)) {
               int[] var4 = new int[var1.readUnsignedShort(1535604647)];

               for(int var5 = 0; var5 < var4.length; ++var5) {
                  var4[var5] = var1.readInt((byte)5);
               }

               this.aClass617Array7913[var3] = new Class617(var4);
            }
         }
      }
   }

   public int method7144() {
      return this.aClass616Array7912.length;
   }

   public int method7145() {
      return this.aClass616Array7912.length;
   }

   static final void method7146(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class214.method2960(var3, var4, var0, (byte)23);
   }

   public static boolean method7147(String var0, int var1) {
      if(null == var0) {
         return false;
      } else {
         for(int var2 = 0; var2 < client.anInt11130 * -17244221; ++var2) {
            if(var0.equalsIgnoreCase(client.aClass50Array11290[var2].aString659)) {
               return true;
            }
         }

         if(var0.equalsIgnoreCase(Class451.localPlayer.aString12161)) {
            return true;
         } else {
            return false;
         }
      }
   }

   public static void method7148(byte var0) {
      int var1 = client.aClass505_11204.method6056(-1746741811);
      int var2 = client.aClass505_11204.method6057(126749238);
      Class105.aBoolArrayArray1306 = new boolean[var1 >> 3][var2 >> 3];
   }

   static void method7149(int var0, int var1) {
      Class71.anInt800 = var0 * -521323797;
      Class525_Sub1.anInt10710 = 608366201;
      Class525_Sub1.anInt10711 = -805427121;
      Class526_Sub21_Sub2.method10420(1613233520);
   }
}
