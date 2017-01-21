package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class184;
import com.jagex.Class265;
import com.jagex.Class276;
import com.jagex.Class277;
import com.jagex.Class284;
import com.jagex.Class313;
import com.jagex.Class39;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class526_Sub21_Sub12;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class662_Sub1;
import com.jagex.Class687;
import com.jagex.Exception_Sub5;
import java.util.Iterator;
import java.util.LinkedList;

public class Class313_Sub1 extends Class313 {
   public static byte aByte10012;
   static String[] aStringArray10013;
   Class284 aClass284_10009;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10010;
   Class276 aClass276_10011;

   public void method4080() {
      this.aClass284_10009.method3722();
      this.aClass284_10009.method3760(this.aClass526_Sub13_Sub1_10010, 0, this.anInterface38_3390, (byte)-53);
   }

   boolean method9055(byte var1) throws Exception_Sub5 {
      this.aClass284_10009 = this.aClass174_Sub3_3389.method8725("BatchedSprite");
      this.aClass526_Sub13_Sub1_10010 = this.aClass284_10009.method3750("SpriteSampler", 2130514775);
      this.aClass276_10011 = this.aClass284_10009.method3742("Normal", (byte)23);
      this.aClass284_10009.method3757(this.aClass276_10011);
      return true;
   }

   public Class313_Sub1(Class174_Sub3 var1) throws Exception_Sub5 {
      super(var1);
      this.method9055((byte)-85);
   }

   public void method4081() {
      this.aClass284_10009.method3722();
      this.aClass284_10009.method3760(this.aClass526_Sub13_Sub1_10010, 0, this.anInterface38_3390, (byte)-104);
   }

   boolean method9056() throws Exception_Sub5 {
      this.aClass284_10009 = this.aClass174_Sub3_3389.method8725("BatchedSprite");
      this.aClass526_Sub13_Sub1_10010 = this.aClass284_10009.method3750("SpriteSampler", 2107721159);
      this.aClass276_10011 = this.aClass284_10009.method3742("Normal", (byte)52);
      this.aClass284_10009.method3757(this.aClass276_10011);
      return true;
   }

   public void method4082() {
      this.aClass284_10009.method3722();
      this.aClass284_10009.method3760(this.aClass526_Sub13_Sub1_10010, 0, this.anInterface38_3390, (byte)-86);
   }

   public void method4079() {
      this.aClass284_10009.method3722();
      this.aClass284_10009.method3760(this.aClass526_Sub13_Sub1_10010, 0, this.anInterface38_3390, (byte)-6);
   }

   public static int method9057(String var0, boolean var1, int var2) {
      var0 = var0.toLowerCase();
      Class184.anIntArray2116 = null;
      Class687.anInt8679 = 0;
      LinkedList var3 = new LinkedList();
      LinkedList var4 = new LinkedList();
      int var5 = var1?'\u8000':0;
      int var6 = (var1?129794791 * Class277.aClass56_3028.anInt676:Class277.aClass56_3028.anInt677 * -2093189635) + var5;

      int var7;
      for(var7 = var5; var7 < var6; ++var7) {
         Class526_Sub21_Sub12 var8 = Class277.aClass56_3028.method994(var7, (byte)0);
         if(var8.aBool11812 && var8.method10678((byte)4).toLowerCase().indexOf(var0) != -1) {
            if(var3.size() >= 50) {
               return -1;
            }

            var3.add(Integer.valueOf(var7));
            var4.add(var8.method10678((byte)-96));
         }
      }

      Class184.anIntArray2116 = new int[var3.size()];
      var7 = 0;

      Integer var9;
      for(Iterator var10 = var3.iterator(); var10.hasNext(); Class184.anIntArray2116[var7++] = var9.intValue()) {
         var9 = (Integer)var10.next();
      }

      String[] var11 = (String[])((String[])var4.toArray(new String[Class184.anIntArray2116.length]));
      Class662_Sub1.method9941(var11, Class184.anIntArray2116, -1341974825);
      return var3.size();
   }

   public static Class39[] method9058(int var0) {
      return new Class39[]{Class39.aClass39_402, Class39.aClass39_400, Class39.aClass39_409, Class39.aClass39_419, Class39.aClass39_408, Class39.aClass39_404, Class39.aClass39_405, Class39.aClass39_418, Class39.aClass39_407, Class39.aClass39_410, Class39.aClass39_399, Class39.aClass39_439, Class39.aClass39_411, Class39.aClass39_401, Class39.aClass39_413, Class39.aClass39_414, Class39.aClass39_415, Class39.aClass39_416, Class39.aClass39_437, Class39.aClass39_403, Class39.aClass39_417, Class39.aClass39_431, Class39.aClass39_421, Class39.aClass39_422, Class39.aClass39_406, Class39.aClass39_424, Class39.aClass39_425, Class39.aClass39_426, Class39.aClass39_427, Class39.aClass39_428, Class39.aClass39_429, Class39.aClass39_430, Class39.aClass39_433, Class39.aClass39_432, Class39.aClass39_412, Class39.aClass39_434, Class39.aClass39_435, Class39.aClass39_436, Class39.aClass39_420, Class39.aClass39_440, Class39.aClass39_438, Class39.aClass39_423, Class39.aClass39_441};
   }

   public static void method9059(int var0, byte var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(13, (long)var0);
      var2.method10583((byte)-1);
   }
}
