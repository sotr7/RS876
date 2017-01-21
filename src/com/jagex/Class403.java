package com.jagex;

import com.jagex.Class1;
import com.jagex.Class10;
import com.jagex.Class103;
import com.jagex.Class113;
import com.jagex.Class115;
import com.jagex.Class174_Sub1;
import com.jagex.Class187;
import com.jagex.Class199_Sub1;
import com.jagex.Class199_Sub2;
import com.jagex.Class201;
import com.jagex.Class219;
import com.jagex.Class227;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class264;
import com.jagex.Class265;
import com.jagex.Class285;
import com.jagex.Class291;
import com.jagex.Class294;
import com.jagex.Class304_Sub1;
import com.jagex.Class32;
import com.jagex.Class323;
import com.jagex.Class380;
import com.jagex.Class388;
import com.jagex.OutFrame;
import com.jagex.Class40_Sub1;
import com.jagex.Class448_Sub1;
import com.jagex.Class466;
import com.jagex.Class476;
import com.jagex.Class484;
import com.jagex.Class488;
import com.jagex.Class5;
import com.jagex.Class506;
import com.jagex.Class52;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub33;
import com.jagex.Class561;
import com.jagex.Class596;
import com.jagex.Class627;
import com.jagex.Class646;
import com.jagex.Class679;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class689;
import com.jagex.Class709;
import com.jagex.Class76;
import com.jagex.client;

public class Class403 {
   public static Class466 aClass466_4161;
   static Class1 aClass1_4162;
   public static Class403 aClass403_4159 = new Class403(14, 0);
   public static Class403 aClass403_4148 = new Class403(15, -1);
   public static Class403 aClass403_4147 = new Class403(16, -2);
   public static Class403 aClass403_4150 = new Class403(19, -2);
   static Class403 aClass403_4151 = new Class403(23, 4);
   static Class403 aClass403_4149 = new Class403(24, -1);
   public static Class403 aClass403_4157 = new Class403(26, 0);
   static Class403 aClass403_4154 = new Class403(27, 0);
   public static Class403 aClass403_4155 = new Class403(28, -2);
   public static Class403 aClass403_4156 = new Class403(29, -2);
   public static Class403 aClass403_4158 = new Class403(30, -2);
   static Class403 aClass403_4152 = new Class403(31, 4);
   static Class403[] aClass403Array4160 = new Class403[32];
   public int anInt4153;

   static {
      Class403[] var0 = Class291.method3883(1542390718);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         aClass403Array4160[var0[var1].anInt4153 * -636933581] = var0[var1];
      }

   }

   Class403(int var1, int var2) {
      this.anInt4153 = var1 * 848158971;
   }

   static final void method4867(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class484.method5835(var3, var4, var0, (byte)16);
   }

   static final void method4868(Class681 var0, int var1) {
      if(client.aString11017 != null) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class646.method7690(client.aString11017, 1710391764);
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static final void method4869(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      MovementDirection var2 = (MovementDirection)Class561.findIdentifiable(MovementDirection.method8035(-584136159), var0.anIntArray8622[-1730576285 * var0.anInt8623], (byte)-103);
      Class596 var3 = new Class596(var0.anIntArray8622[1 + -1730576285 * var0.anInt8623]);
      if(-1 == var3.anInt7850 * 1837438465) {
         throw new RuntimeException("");
      } else if(MovementDirection.TELEPORTING != var2 && var2 != MovementDirection.WALKING && var2 != MovementDirection.RUNNING) {
         throw new RuntimeException("");
      } else {
         if(null != client.aClass111_11060) {
            OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4252, client.aClass111_11060.aClass14_1342, -95545531);
            var4.out.writeShort128(var3.localX * -814686591, (byte)102);
            var4.out.writeByte(var2.getId(), 752407125);
            var4.out.writeLEShort128(-845789331 * var3.localY, 1401157950);
            client.aClass111_11060.write(var4, (byte)-71);
         }

      }
   }

   static final void method4870(int var0) {
      Class323.aClass40_Sub10_3461.method870(5, (short)5451);
      Class709.aClass40_Sub18_8849.method870(5, (short)7528);
      Class264.aClass40_Sub9_2970.method870(5, (short)31570);
      client.aClass505_11204.method6066(-631188979).method870(5, (short)2885);
      Class76.loader.method870(5, (short)22470);
      Class448_Sub1.aClass40_Sub1_10233.method870(5, (short)12289);
      Class388.aClass40_Sub15_4063.method870(5, (short)2585);
      Class689.aClass40_Sub12_8692.method870(5, (short)24526);
      Class5.aClass40_Sub2_28.method870(5, (short)5030);
      Class506.aClass97_Sub1_Sub1_5698.method10386(5, 1866519745);
      Class201.aClass97_Sub1_Sub2_2210.method10406(5, 809968249);
      Class52.aClass97_Sub1_Sub2_665.method10406(5, -1543651708);
      Class265.aClass97_Sub1_Sub2_2974.method10406(5, 114408833);
      Class103.aClass97_Sub1_Sub2_1277.method10406(5, -2124034167);
      Class476.aClass97_Sub1_Sub2_5386.method10406(5, -242627837);
      Class227.aClass40_Sub16_2327.method870(5, (short)8699);
      Class113.aClass40_Sub6_1371.method870(5, (short)22131);
      Class32.aClass40_Sub3_361.method870(5, (short)24025);
      Class10.aClass40_Sub20_62.method870(5, (short)15781);
      Class294.aClass40_Sub13_3189.method870(5, (short)21561);
      Class199_Sub1.aClass40_Sub4_9867.method870(5, (short)19660);
      Class40_Sub1.aClass40_Sub21_10958.method870(5, (short)19602);
      Class174_Sub1.aClass40_Sub7_9280.method870(5, (short)31228);
      Class526_Sub33.aClass40_Sub14_10659.method870(5, (short)6916);
      Class199_Sub2.aClass40_Sub19_9875.method870(5, (short)25251);
      Class488.method5866(5, -2065597981);
      Class285.method3800(50, -792251145);
      Class627.aClass418_8195.method4953(50, (byte)7);
      Class380.method4707(5, -1967526377);
      Class187.method2726(5, (byte)39);
      client.aClass192_11286.method2769(5, (byte)-115);
      client.aClass192_11044.method2769(5, (byte)-120);
      Class680.aClass192_8608.method2769(5, (byte)-110);
      client.aClass192_11299.method2769(5, (byte)-55);
      Class219.aClass40_2294.method870(5, (short)13599);
      Class304_Sub1.aClass40_10066.method870(5, (short)17699);
      client.aClass192_11009.method2769(5, (byte)-61);
   }
}
