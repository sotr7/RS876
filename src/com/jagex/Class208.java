package com.jagex;

import com.jagex.Class108;
import com.jagex.Class143;
import com.jagex.Class168;
import com.jagex.Class201;
import com.jagex.Class206;
import com.jagex.Class231;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class266;
import com.jagex.Class294;
import com.jagex.Class305;
import com.jagex.NPCDef;
import com.jagex.Class408;
import com.jagex.Class424;
import com.jagex.Class446;
import com.jagex.Class481;
import com.jagex.Class482;
import com.jagex.Class521;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub1;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Buffer;
import com.jagex.Class526_Sub38_Sub2;
import com.jagex.LinkableObject;
import com.jagex.Class561;
import com.jagex.Class566;
import com.jagex.Class570;
import com.jagex.Class581;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class640;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Class76;
import com.jagex.Interface56;
import com.jagex.client;

class Class208 implements Interface56 {
   // $FF: synthetic field
   Class231 this$0;

   Class208(Class231 var1) {
      this.this$0 = var1;
   }

   public void method370(Object var1, float[] var2, Object[] var3, int var4) {
      Class482 var5 = (Class482)var1;
      Class446 var6 = var5.method5784(-763581331);
      float var7 = var5.method5785((short)20498);
      float var8 = var5.method5791(1244881981);
      Class446 var9 = this.this$0.method3188(1810597233);
      Class446 var10 = Class446.method5275(var6, var9);
      float var11 = 0.0F;
      float var12 = var10.method5276();
      if(var12 >= var8) {
         var11 = 0.0F;
      } else {
         float var13 = ((Float)var3[0]).floatValue();
         float var14 = ((Float)var3[1]).floatValue();
         if(var9.aFloat4917 > var6.aFloat4917 - var13 / 2.0F && var9.aFloat4917 < var6.aFloat4917 + var13 / 2.0F && var9.aFloat4919 > var6.aFloat4919 - var14 / 2.0F && var9.aFloat4919 < var6.aFloat4919 + var14 / 2.0F) {
            float var15 = Math.abs(var9.aFloat4917 - (var6.aFloat4917 + var13 / 2.0F));
            float var16 = Math.abs(var9.aFloat4917 - (var6.aFloat4917 - var13 / 2.0F));
            float var17 = Math.abs(var9.aFloat4919 - (var14 / 2.0F + var6.aFloat4917));
            float var18 = Math.abs(var9.aFloat4919 - (var6.aFloat4917 - var14 / 2.0F));
            float var19 = var8 - var7;
            float var20 = Math.min(var15, var16);
            float var21 = Math.min(var17, var18);
            float var22 = 1.0F / var19 * var20;
            float var23 = 1.0F / var19 * var21;
            var22 = Math.min(Math.max(var22, 0.0F), 1.0F);
            var23 = Math.min(Math.max(var23, 0.0F), 1.0F);
            var11 = Math.min(var22, var23);
         }
      }

      var2[0] = var11;
      var2[1] = var11;
   }

   public void method371(Object var1, float[] var2, Object[] var3) {
      Class482 var4 = (Class482)var1;
      Class446 var5 = var4.method5784(-458092098);
      float var6 = var4.method5785((short)32553);
      float var7 = var4.method5791(1244881981);
      Class446 var8 = this.this$0.method3188(1874189427);
      Class446 var9 = Class446.method5275(var5, var8);
      float var10 = 0.0F;
      float var11 = var9.method5276();
      if(var11 >= var7) {
         var10 = 0.0F;
      } else {
         float var12 = ((Float)var3[0]).floatValue();
         float var13 = ((Float)var3[1]).floatValue();
         if(var8.aFloat4917 > var5.aFloat4917 - var12 / 2.0F && var8.aFloat4917 < var5.aFloat4917 + var12 / 2.0F && var8.aFloat4919 > var5.aFloat4919 - var13 / 2.0F && var8.aFloat4919 < var5.aFloat4919 + var13 / 2.0F) {
            float var14 = Math.abs(var8.aFloat4917 - (var5.aFloat4917 + var12 / 2.0F));
            float var15 = Math.abs(var8.aFloat4917 - (var5.aFloat4917 - var12 / 2.0F));
            float var16 = Math.abs(var8.aFloat4919 - (var13 / 2.0F + var5.aFloat4917));
            float var17 = Math.abs(var8.aFloat4919 - (var5.aFloat4917 - var13 / 2.0F));
            float var18 = var7 - var6;
            float var19 = Math.min(var14, var15);
            float var20 = Math.min(var16, var17);
            float var21 = 1.0F / var18 * var19;
            float var22 = 1.0F / var18 * var20;
            var21 = Math.min(Math.max(var21, 0.0F), 1.0F);
            var22 = Math.min(Math.max(var22, 0.0F), 1.0F);
            var10 = Math.min(var21, var22);
         }
      }

      var2[0] = var10;
      var2[1] = var10;
   }

   static void method2927(long[] var0, Object[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         long var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         Object var9 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var9;
         int var10 = Long.MAX_VALUE == var7?0:1;

         for(int var11 = var2; var11 < var3; ++var11) {
            if(var0[var11] < var7 + (long)(var11 & var10)) {
               long var12 = var0[var11];
               var0[var11] = var0[var6];
               var0[var6] = var12;
               Object var14 = var1[var11];
               var1[var11] = var1[var6];
               var1[var6++] = var14;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var9;
         method2927(var0, var1, var2, var6 - 1, -639667245);
         method2927(var0, var1, var6 + 1, var3, -1511592478);
      }

   }

   static final void method2928(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class143.method1666(var3, var4, var0, 1839543713);
   }

   static final void method2929(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)((Class255.time((byte)24) - Class566.aClass223_7610.method3099(2014539708) - Class266.aLong2982 * 1411796210146295063L) / 1000L);
   }

   static final void method2930(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      NPC var3 = (NPC)var0.aClass639_Sub1_Sub2_Sub1_8635;
      int var4 = var3.method10985(var2, (byte)-120);
      int var5 = var3.method10986(var2, -1907746204);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
   }

   public static final void method2931(Class168 var0, Class704 var1, Class704 var2, int var3) {
      if(var1.method8216(-2132491042) && var2.method8216(-2132491042)) {
         Class206 var4 = var1.aClass206_8823;
         Class206 var5 = var2.aClass206_8823;
         var0.method1964(var1.aClass699_8822.aClass526_Sub21_Sub11_8770, -212153941 * var1.aClass699_8822.anInt8768, var1.aClass699_8822.aClass526_Sub21_Sub11_8771, 1819333767 * var1.aClass699_8822.anInt8772, 1202803827 * var1.anInt8813, var4.anIntArray2226[507434409 * var1.anInt8816], var2.aClass699_8822.aClass526_Sub21_Sub11_8770, var2.aClass699_8822.anInt8768 * -212153941, var2.aClass699_8822.aClass526_Sub21_Sub11_8771, var2.aClass699_8822.anInt8772 * 1819333767, var2.anInt8813 * 1202803827, var5.anIntArray2226[var2.anInt8816 * 507434409], var4.aClass202_2221 != null?var4.aClass202_2221.aBoolArray2211:null, var4.aBool2239 | var5.aBool2239);
      }

   }

   static final void decodeNPCMask(int var0) {
      Buffer var1 = client.aClass111_11060.buffer;

      for(int var2 = 0; var2 < 1544015143 * client.anInt11065; ++var2) {
         int var3 = client.anIntArray11055[var2];
         NPC npc = (NPC)((LinkableObject)client.npcs.get((long)var3)).anObject10399;
         var1.readUnsignedShort(859451986);
         int var5 = var1.readUnsignedByte(234984377);
         if((var5 & 2) != 0) {
            var5 += var1.readUnsignedByte(-237253597) << 8;
         }

         if(0 != (var5 & 512)) {
            var5 += var1.readUnsignedByte(-3404193) << 16;
         }

         if(0 != (var5 & 4194304)) {
            var5 += var1.readUnsignedByte(-350870135) << 24;
         }

         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         boolean var11;
         if((var5 & 4) != 0) {
            var6 = var1.readUnsignedShort128((short)12060);
            var7 = var1.readInt((byte)5);
            if('\uffff' == var6) {
               var6 = -1;
            }

            var8 = var1.readUnsigned128Byte((byte)-96);
            var9 = var8 & 7;
            var10 = var8 >> 3 & 15;
            if(var10 == 15) {
               var10 = -1;
            }

            var11 = (var8 >> 7 & 1) == 1;
            npc.method10777(var6, var7, var9, var10, var11, 0, 79056171);
         }

         if(0 != (var5 & 134217728)) {
            npc.aByte11928 = var1.read128Byte((byte)-56);
            npc.aByte11929 = var1.read128Byte((byte)-51);
            npc.aByte11899 = var1.readByte((byte)51);
            npc.aByte11893 = (byte)var1.readByteC((byte)8);
            npc.anInt11926 = (client.anInt11012 + var1.readUnsignedShort128((short)15849)) * -1462749463;
            npc.anInt11933 = (client.anInt11012 + var1.readUnsignedShort(1084471913)) * 1238611391;
         }

         if(0 != (var5 & 33554432)) {
            var6 = var1.readUnsignedShortLE128((short)5888);
            var7 = var1.readInt((byte)5);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var8 = var1.readUnsignedByte128((byte)36);
            var9 = var8 & 7;
            var10 = var8 >> 3 & 15;
            if(15 == var10) {
               var10 = -1;
            }

            var11 = 1 == (var8 >> 7 & 1);
            npc.method10777(var6, var7, var9, var10, var11, 2, 79056171);
         }

         int var12;
         int var13;
         int var22;
         if(0 != (var5 & 128)) {
            var6 = var1.readUnsignedByte128((byte)36);
            if(var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  boolean var24 = true;
                  var22 = -1;
                  var8 = var1.readSmart(-2043925943);
                  if(var8 == 32767) {
                     var8 = var1.readSmart(-1227084516);
                     var10 = var1.readSmart(-1909785272);
                     var9 = var1.readSmart(-1580573597);
                     var22 = var1.readSmart(-1889014151);
                  } else if(var8 != 32766) {
                     var10 = var1.readSmart(-60904800);
                  } else {
                     var8 = -1;
                     var10 = var1.readUnsignedByte128((byte)36);
                  }

                  var12 = var1.readSmart(-2126147996);
                  npc.method10785(var8, var10, var9, var22, client.anInt11012, var12, -2065942854);
               }
            }

            var7 = var1.readUnsignedByte(1357724948);
            if(var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var1.readSmart(-680127116);
                  var10 = var1.readSmart(-248862985);
                  if(var10 != 32767) {
                     var22 = var1.readSmart(-927824155);
                     var12 = var1.readByteC((byte)8);
                     var13 = var10 > 0?var1.readUnsignedByte128((byte)36):var12;
                     npc.method10769(var9, client.anInt11012, var10, var22, var12, var13, 197410453);
                  } else {
                     npc.method10779(var9, (byte)8);
                  }
               }
            }
         }

         if(0 != (var5 & 268435456)) {
            var6 = var1.readUnsignedShortLE128((short)5888);
            var7 = var1.readInt((byte)5);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var8 = var1.readByteC((byte)8);
            var9 = var8 & 7;
            var10 = var8 >> 3 & 15;
            if(15 == var10) {
               var10 = -1;
            }

            var11 = (var8 >> 7 & 1) == 1;
            npc.method10777(var6, var7, var9, var10, var11, 4, 79056171);
         }

         if((var5 & 1) != 0) {
            if(npc.def.method4055(384843266)) {
               Class108.method1352(npc, (byte)10);
            }

            npc.method10981((NPCDef)Class76.loader.method89(var1.readBigSmart((byte)-19), -1723408191), 0 == (var5 & 8388608), (var5 & 131072) == 0, true, 1302222279);
            npc.setBoundSize(npc.def.boundSize * 459047587, (byte)-66);
            npc.anInt11938 = 446106299 * (npc.def.contrast * -739260225 << 3);
            if(npc.def.method4055(982223508)) {
               Class408.method4893(npc.aByte10827, npc.screenX[0], npc.screenY[0], 0, (Class610)null, npc, (Class639_Sub1_Sub2_Sub1_Sub1)null, -1056598282);
            }
         }

         int[] var33;
         if(0 != (var5 & 1048576)) {
            var6 = npc.def.headModels.length;
            var7 = 0;
            if(npc.def.replacementColours != null) {
               var7 = npc.def.replacementColours.length;
            }

            byte var21 = 0;
            if(npc.def.replacementTextures != null) {
               var7 = npc.def.replacementTextures.length;
            }

            var9 = var1.readUnsignedByte(1691114282);
            if(1 != (var9 & 1)) {
               var1.pos += 1603952830;
               var33 = null;
               if(2 == (var9 & 2)) {
                  var33 = new int[var6];

                  for(var22 = 0; var22 < var6; ++var22) {
                     var33[var22] = var1.readBigSmart((byte)-60);
                  }
               }

               short[] var30 = null;
               if((var9 & 4) == 4) {
                  var30 = new short[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var30[var12] = (short)var1.readUnsignedShortLE128((short)5888);
                  }
               }

               short[] var27 = null;
               if((var9 & 8) == 8) {
                  var27 = new short[var21];

                  for(var13 = 0; var13 < var21; ++var13) {
                     var27[var13] = (short)var1.readUnsignedLEShort((byte)20);
                  }
               }

               long var14 = (long)((NPC.anInt12190 += 1542168007) * -1184689161 - 1);
               new Class294(var14, var33, (float[])null, (int[][])null, (int[][])null, var30, var27);
            }
         }

         Class481 var23;
         Class424 var36;
         if((var5 & 65536) != 0) {
            npc.anInterface4_11887.method28(-1250442233);
            var1.pos += 1603952830;
            var6 = var1.buffer[(var1.pos += 801976415) * 301018015 - 1] & 255;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.readUnsignedByte(1014524948);
               var23 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)3), var8, (byte)-65);
               var36 = Class201.aClass97_Sub1_Sub2_2210.method8372(var1, var23, (byte)0);
               npc.anInterface4_11887.method27(var36.anInt4793 * 1602756037, var36.anObject4794, 172204199);
            }
         }

         if((var5 & '\u8000') != 0) {
            var6 = npc.def.models.length;
            var7 = 0;
            if(npc.def.replacementColours != null) {
               var7 = npc.def.replacementColours.length;
            }

            var8 = 0;
            if(null != npc.def.replacementTextures) {
               var8 = npc.def.replacementTextures.length;
            }

            var9 = var1.readByteC((byte)8);
            if((var9 & 1) == 1) {
               npc.aClass294_12188 = null;
            } else {
               var1.pos += 1603952830;
               var33 = null;
               float[] var34 = null;
               int[][] var31 = (int[][])null;
               int[][] var29 = (int[][])null;
               int var17;
               if((var9 & 2) == 2) {
                  var33 = new int[var6];
                  if((var9 & 16) == 16) {
                     var34 = new float[var6];
                     var31 = new int[var6][3];
                     var29 = new int[var6][3];
                  }

                  for(int var16 = 0; var16 < var6; ++var16) {
                     var33[var16] = var1.readBigSmart((byte)33);
                     if(16 == (var9 & 16) && var33[var16] != -1) {
                        var34[var16] = var1.method9634((byte)1);

                        for(var17 = 0; var17 < 3; ++var17) {
                           var31[var16][var17] = var1.readShortLE128(742342165);
                        }

                        for(var17 = 0; var17 < 3; ++var17) {
                           var29[var16][var17] = var1.readShortLE128(742342165);
                        }
                     }
                  }
               }

               short[] var37 = null;
               if((var9 & 4) == 4) {
                  var37 = new short[var7];

                  for(var17 = 0; var17 < var7; ++var17) {
                     var37[var17] = (short)var1.readUnsignedShort128((short)28597);
                  }
               }

               short[] var38 = null;
               if(8 == (var9 & 8)) {
                  var38 = new short[var8];

                  for(int var18 = 0; var18 < var8; ++var18) {
                     var38[var18] = (short)var1.readUnsignedShortLE128((short)5888);
                  }
               }

               long var19 = (long)((NPC.anInt12189 += 1836894055) * -1590926249 - 1);
               npc.aClass294_12188 = new Class294(var19, var33, var34, var31, var29, var37, var38);
            }
         }

         if((var5 & 1024) != 0) {
            var6 = var1.readUnsignedLEShort((byte)22);
            var7 = var1.readIntLE(-779131323);
            if('\uffff' == var6) {
               var6 = -1;
            }

            var8 = var1.readUnsigned128Byte((byte)-92);
            var9 = var8 & 7;
            var10 = var8 >> 3 & 15;
            if(15 == var10) {
               var10 = -1;
            }

            var11 = 1 == (var8 >> 7 & 1);
            npc.method10777(var6, var7, var9, var10, var11, 1, 79056171);
         }

         if((var5 & 64) != 0) {
            npc.anInt12192 = var1.readUnsignedShort(1547109889) * 1172692015;
            npc.anInt12187 = var1.readUnsignedShortLE128((short)5888) * -1094789271;
         }

         int[] var25;
         int[] var26;
         if((var5 & 16384) != 0) {
            var6 = var1.readByteC((byte)8);
            var25 = new int[var6];
            var26 = new int[var6];

            for(var9 = 0; var9 < var6; ++var9) {
               var10 = var1.readUnsignedShort128((short)5098);
               if('\uc000' == (var10 & '\uc000')) {
                  var22 = var1.readUnsignedShortLE128((short)5888);
                  var25[var9] = var10 << 16 | var22;
               } else {
                  var25[var9] = var10;
               }

               var26[var9] = var1.readUnsignedLEShort((byte)103);
            }

            npc.method10774(var25, var26, 63822607);
         }

         if((var5 & 8) != 0) {
            npc.method10988(var1.readString(-126346859), 0, 0, (byte)-33);
         }

         if(0 != (var5 & 2048)) {
            npc.anInt12191 = var1.readUnsignedShort(1049616834) * -851363225;
            if('\uffff' == -1168686761 * npc.anInt12191) {
               npc.anInt12191 = 851363225;
            }
         }

         if(0 != (var5 & 524288)) {
            var1.pos += 1603952830;
            var6 = var1.buffer[(var1.pos += 801976415) * 301018015 - 1] & 255;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.readUnsignedByte(1773727809);
               var23 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)50), var8, (byte)-4);
               var36 = Class201.aClass97_Sub1_Sub2_2210.method8372(var1, var23, (byte)0);
               npc.anInterface4_11887.method27(var36.anInt4793 * 1602756037, var36.anObject4794, 172204199);
            }
         }

         if((var5 & 131072) != 0) {
            npc.combatLevel = var1.readUnsignedShortLE128((short)5888) * -701216661;
            if(317072451 * npc.combatLevel == '\uffff') {
               npc.combatLevel = -380325731 * npc.def.combatLevel;
            }
         }

         if(0 != (var5 & 2097152)) {
            var6 = var1.buffer[(var1.pos += 801976415) * 301018015 - 1] & 255;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.readUnsignedByte(-472660066);
               var9 = var1.readIntV2((byte)94);
               var10 = var1.read24BitIntV2((byte)-2);
               npc.method10987(var8, var9, var10, 2061385805);
            }
         }

         if((var5 & 16) != 0) {
            npc.anInt11911 = var1.readUnsignedShort(888750592) * -790295043;
            if(npc.anInt11911 * 1208301397 == '\uffff') {
               npc.anInt11911 = 790295043;
            }
         }

         if((var5 & 67108864) != 0) {
            var6 = var1.readUnsignedShort(1766792679);
            var7 = var1.readInt((byte)5);
            if('\uffff' == var6) {
               var6 = -1;
            }

            var8 = var1.readByteC((byte)8);
            var9 = var8 & 7;
            var10 = var8 >> 3 & 15;
            if(15 == var10) {
               var10 = -1;
            }

            var11 = (var8 >> 7 & 1) == 1;
            npc.method10777(var6, var7, var9, var10, var11, 3, 79056171);
         }

         if(0 != (var5 & 8388608)) {
            npc.aString12194 = var1.readString(-1257838306);
            if("".equals(npc.aString12194) || npc.aString12194.equals(npc.def.name)) {
               npc.aString12194 = npc.def.name;
            }
         }

         if((var5 & 262144) != 0) {
            var6 = var1.readUnsignedByte128((byte)36);
            var25 = new int[8];
            short[] var32 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if(0 != (var6 & 1 << var9)) {
                  var25[var9] = var1.readBigSmart((byte)92);
                  var32[var9] = (short)var1.readDecoratedSmart(1188025014);
               } else {
                  var25[var9] = -1;
                  var32[var9] = -1;
               }
            }

            npc.aClass305_12186 = new Class305(var25, var32);
         }

         if((var5 & 32) != 0) {
            int[] var28 = new int[4];

            for(var7 = 0; var7 < 4; ++var7) {
               var28[var7] = var1.readBigSmart((byte)90);
            }

            var7 = var1.readUnsigned128Byte((byte)-117);
            Class581.method6971(npc, var28, var7, true, (byte)0);
         }

         if((var5 & 8192) != 0) {
            npc.anInt11912 = var1.read128Byte((byte)-49) * -1923326237;
            npc.anInt11919 = var1.read128Byte((byte)-37) * 1573028629;
            npc.anInt11920 = var1.read128Byte((byte)-53) * -1475013205;
            npc.anInt11954 = var1.readByte((byte)49) * 193059349;
            npc.anInt11921 = var1.readByteC(-2087725885) * -1199325289;
            npc.anInt11922 = var1.read128Byte((byte)-106) * -1820207517;
            npc.anInt11923 = (var1.readUnsignedShort128((short)26503) + client.anInt11012) * 1436013787;
            npc.anInt11924 = (var1.readUnsignedShort128((short)25331) + client.anInt11012) * 1479744435;
            npc.anInt11925 = var1.readUnsignedLEShort((byte)60) * -47812659;
            npc.anInt11943 = -808498231;
            npc.anInt11948 = 0;
            npc.anInt11912 += npc.screenX[0] * -1923326237;
            npc.anInt11919 += npc.screenY[0] * 1573028629;
            npc.anInt11920 += -1475013205 * npc.screenX[0];
            npc.anInt11954 += npc.screenY[0] * 193059349;
            npc.anInt11921 += npc.aByte10827 * -1199325289;
            npc.anInt11922 += npc.aByte10827 * -1820207517;
         }

         if(0 != (var5 & 536870912)) {
            npc.aBool11895 = var1.readUnsignedByte128((byte)36) == 1;
         }

         if(0 != (var5 & 16777216)) {
            npc.anInt12201 = var1.readUnsignedByte(280274365) * 430697279;
         }

         if(0 != (var5 & 4096)) {
            var6 = var1.readByteC((byte)8);
            var25 = new int[var6];
            var26 = new int[var6];
            int[] var35 = new int[var6];

            for(var10 = 0; var10 < var6; ++var10) {
               var22 = var1.readBigSmart((byte)54);
               var25[var10] = var22;
               var26[var10] = var1.readUnsignedByte(630567826);
               var35[var10] = var1.readUnsignedShort(2064038688);
            }

            Class640.method7638(npc, var25, var26, var35, -969646539);
         }
      }

   }

   static final void method2933(int var0) {
      Class526_Sub1 var1;
      for(var1 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8206((byte)119); null != var1; var1 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8181(992801004)) {
         Class521.method6255(var1, false, -1025303921);
      }

      for(var1 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8206((byte)18); var1 != null; var1 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8181(1547749807)) {
         Class521.method6255(var1, true, -1488115345);
      }

   }

   public static Class526_Sub21_Sub17 method2934(byte var0) {
      return Class525_Sub1.aClass526_Sub21_Sub17_7093;
   }

   public static int method2935(int var0) {
      Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 = null;
      int var1 = Class570.aTwitchTV7639.RequestLiveStreams(client.aClass676_11127.aString8586);
      return var1;
   }
}
