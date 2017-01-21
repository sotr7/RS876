package com.jagex;

import com.jagex.Class141;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class182;
import com.jagex.Class387;
import com.jagex.Class430;
import com.jagex.Class440;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class463;
import com.jagex.LinkableObject;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.RenderDef;
import com.jagex.Class614;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class645;
import com.jagex.Class670;
import com.jagex.Class689;
import com.jagex.Class704;
import com.jagex.Class704_Sub2;
import com.jagex.client;

public class Class639_Sub1_Sub2_Sub4 extends Class639_Sub1_Sub2 {
   int anInt12125 = 0;
   double aDouble12119;
   double aDouble12120;
   double aDouble12114;
   double aDouble12116;
   double aDouble12107;
   boolean aBool12123 = false;
   boolean aBool12126 = false;
   Class614 aClass614_12118;
   int anInt12121 = 0;
   int anInt12128;
   public int anInt12110;
   public int anInt12111;
   int anInt12112;
   int anInt12113;
   int anInt12122;
   public int anInt12115;
   int anInt12108;
   public int anInt12109;
   boolean aBool12117;
   int anInt12127;
   Class704 aClass704_12124;

   void method9848(Class174 var1) {
      Class168 var2 = this.method10932(var1, 0, -2143479121);
      if(null != var2) {
         Class445 var3 = this.method7623();
         this.anInt12125 = var2.method1981() * 1154284135;
         var2.method2063();
         this.method10931(var1, var2, var3, -1871362729);
      }
   }

   boolean method9822(int var1) {
      return this.aBool12126;
   }

   public int method9832(byte var1) {
      return this.anInt12125 * 1122992471;
   }

   public Class550 method9827(Class174 var1, int var2) {
      return null;
   }

   public final void method10925(int var1, int var2, int var3, int var4, int var5) {
      Class446 var6 = Class446.method5305(this.method7635().aClass446_4816);
      if(!this.aBool12123) {
         float var7 = (float)var1 - var6.aFloat4917;
         float var8 = (float)var2 - var6.aFloat4919;
         float var9 = (float)Math.sqrt((double)(var8 * var8 + var7 * var7));
         if(var9 != 0.0F) {
            var6.aFloat4917 += (float)(-391662187 * this.anInt12113) * var7 / var9;
            var6.aFloat4919 += var8 * (float)(-391662187 * this.anInt12113) / var9;
         }

         if(this.aBool12117) {
            var6.aFloat4915 = (float)(Class387.method4762((int)var6.aFloat4917, (int)var6.aFloat4919, this.aByte10827, 1010631397) - this.anInt12108 * 1496601327);
         }

         this.method7632(var6);
      }

      double var10 = (double)(1 + -1422153107 * this.anInt12111 - var4);
      this.aDouble12119 = (double)((float)var1 - var6.aFloat4917) / var10;
      this.aDouble12120 = (double)((float)var2 - var6.aFloat4919) / var10;
      this.aDouble12114 = Math.sqrt(this.aDouble12119 * this.aDouble12119 + this.aDouble12120 * this.aDouble12120);
      if(this.anInt12112 * -1443235125 != -1) {
         if(!this.aBool12123) {
            this.aDouble12116 = -this.aDouble12114 * Math.tan((double)(this.anInt12112 * -1443235125) * 0.02454369D);
         }

         this.aDouble12107 = ((double)((float)var3 - var6.aFloat4915) - var10 * this.aDouble12116) * 2.0D / (var10 * var10);
      } else {
         this.aDouble12116 = (double)((float)var3 - var6.aFloat4915) / var10;
      }

      var6.method5278();
   }

   public void method10926(byte var1) {
      if(!this.aBool12123) {
         if(0 != this.anInt12122 * -945855719) {
            Object var2 = null;
            if(4 == client.anInt11073 * 378016543) {
               var2 = Class645.aClass207Array8445[-945855719 * this.anInt12122 - 1].method2913((byte)26);
            } else {
               int var3;
               if(-945855719 * this.anInt12122 < 0) {
                  var3 = -(this.anInt12122 * -945855719) - 1;
                  if(-1204447689 * client.localPlayerIndex == var3) {
                     var2 = Class451.localPlayer;
                  } else {
                     var2 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var3];
                  }
               } else {
                  var3 = -945855719 * this.anInt12122 - 1;
                  LinkableObject var4 = (LinkableObject)client.npcs.get((long)var3);
                  if(null != var4) {
                     var2 = (Class639_Sub1_Sub2_Sub1)var4.anObject10399;
                  }
               }
            }

            if(var2 != null) {
               Class446 var14 = ((Class639_Sub1_Sub2_Sub1)var2).method7635().aClass446_4816;
               this.method7618(var14.aFloat4917, (float)(Class387.method4762((int)var14.aFloat4917, (int)var14.aFloat4919, this.aByte10827, 1475877392) - this.anInt12108 * 1496601327), var14.aFloat4919);
               if(this.anInt12127 * -1695405771 >= 0) {
                  RenderDef var15 = ((Class639_Sub1_Sub2_Sub1)var2).method10786(-16777216);
                  int var5 = 0;
                  int var6 = 0;
                  if(var15.anIntArrayArray7704 != null && var15.anIntArrayArray7704[this.anInt12127 * -1695405771] != null) {
                     var5 += var15.anIntArrayArray7704[-1695405771 * this.anInt12127][0];
                     var6 += var15.anIntArrayArray7704[this.anInt12127 * -1695405771][2];
                  }

                  if(var15.anIntArrayArray7698 != null && null != var15.anIntArrayArray7698[-1695405771 * this.anInt12127]) {
                     var5 += var15.anIntArrayArray7698[this.anInt12127 * -1695405771][0];
                     var6 += var15.anIntArrayArray7698[-1695405771 * this.anInt12127][2];
                  }

                  if(var5 != 0 || 0 != var6) {
                     int var7 = ((Class639_Sub1_Sub2_Sub1)var2).aClass34_11940.method817(-190749844);
                     int var8 = var7;
                     if(null != ((Class639_Sub1_Sub2_Sub1)var2).anIntArray11898 && ((Class639_Sub1_Sub2_Sub1)var2).anIntArray11898[-1695405771 * this.anInt12127] != -1) {
                        var8 = ((Class639_Sub1_Sub2_Sub1)var2).anIntArray11898[this.anInt12127 * -1695405771];
                     }

                     int var9 = var8 - var7 & 16383;
                     int var10 = Class443.anIntArray4895[var9];
                     int var11 = Class443.anIntArray4896[var9];
                     int var12 = var10 * var6 + var11 * var5 >> 14;
                     var6 = var6 * var11 - var10 * var5 >> 14;
                     Class446 var13 = Class446.method5305(this.method7635().aClass446_4816);
                     var13.aFloat4917 += (float)var12;
                     var13.aFloat4919 += (float)var6;
                     this.method7632(var13);
                     var13.method5278();
                  }
               }
            }
         }

      }
   }

   public final void method10927(int var1, int var2) {
      this.aBool12123 = true;
      Class430 var3 = new Class430(this.method7635());
      var3.aClass446_4816.aFloat4917 = (float)((double)var3.aClass446_4816.aFloat4917 + (double)var1 * this.aDouble12119);
      var3.aClass446_4816.aFloat4919 = (float)((double)var3.aClass446_4816.aFloat4919 + (double)var1 * this.aDouble12120);
      if(this.aBool12117) {
         var3.aClass446_4816.aFloat4915 = (float)(Class387.method4762((int)var3.aClass446_4816.aFloat4917, (int)var3.aClass446_4816.aFloat4919, this.aByte10827, 1679686453) - 1496601327 * this.anInt12108);
      } else if(this.anInt12112 * -1443235125 != -1) {
         var3.aClass446_4816.aFloat4915 = (float)((double)var3.aClass446_4816.aFloat4915 + this.aDouble12116 * (double)var1 + (double)var1 * 0.5D * this.aDouble12107 * (double)var1);
         this.aDouble12116 += (double)var1 * this.aDouble12107;
      } else {
         var3.aClass446_4816.aFloat4915 = (float)((double)var3.aClass446_4816.aFloat4915 + this.aDouble12116 * (double)var1);
      }

      var3.aClass440_4817.method5193(1.0F, 0.0F, 0.0F, (float)Math.atan2(this.aDouble12116, this.aDouble12114));
      Class440 var4 = Class440.method5192();
      var4.method5193(0.0F, 1.0F, 0.0F, (float)Math.atan2(this.aDouble12119, this.aDouble12120) - 3.1415927F);
      var3.aClass440_4817.method5194(var4);
      var4.method5163();
      this.method7619(var3);
      if(this.aClass704_12124.method8247(1, (byte)72) && this.aClass704_12124.method8249(66692146)) {
         this.aClass704_12124.method8236(-1730576285);
      }

   }

   Class555 method9825(Class174 var1, int var2) {
      Class168 var3 = this.method10932(var1, 2048, -2019587432);
      if(var3 == null) {
         return null;
      } else {
         Class445 var4 = this.method7623();
         this.method10931(var1, var3, var4, -411036067);
         Class555 var5 = Class463.method5475(false, (short)15008);
         var3.method1974(var4, this.aClass164Array10829[0], 0);
         if(null != this.aClass614_12118) {
            Class177 var6 = this.aClass614_12118.method7253();
            var1.method2516(var6);
         }

         this.aBool12126 = var3.method2014();
         var3.method2063();
         this.anInt12125 = var3.method1981() * 1154284135;
         return var5;
      }
   }

   void method9834(Class174 var1, int var2) {
      Class168 var3 = this.method10932(var1, 0, -1951425664);
      if(null != var3) {
         Class445 var4 = this.method7623();
         this.anInt12125 = var3.method1981() * 1154284135;
         var3.method2063();
         this.method10931(var1, var3, var4, -1220992979);
      }
   }

   public int method10928(int var1) {
      return -2120241247 * this.anInt12121;
   }

   public final void method10929(int var1) {
      this.aBool12123 = true;
      Class430 var2 = new Class430(this.method7635());
      var2.aClass446_4816.aFloat4917 = (float)((double)var2.aClass446_4816.aFloat4917 + (double)var1 * this.aDouble12119);
      var2.aClass446_4816.aFloat4919 = (float)((double)var2.aClass446_4816.aFloat4919 + (double)var1 * this.aDouble12120);
      if(this.aBool12117) {
         var2.aClass446_4816.aFloat4915 = (float)(Class387.method4762((int)var2.aClass446_4816.aFloat4917, (int)var2.aClass446_4816.aFloat4919, this.aByte10827, 973700848) - 1496601327 * this.anInt12108);
      } else if(this.anInt12112 * -1443235125 != -1) {
         var2.aClass446_4816.aFloat4915 = (float)((double)var2.aClass446_4816.aFloat4915 + this.aDouble12116 * (double)var1 + (double)var1 * 0.5D * this.aDouble12107 * (double)var1);
         this.aDouble12116 += (double)var1 * this.aDouble12107;
      } else {
         var2.aClass446_4816.aFloat4915 = (float)((double)var2.aClass446_4816.aFloat4915 + this.aDouble12116 * (double)var1);
      }

      var2.aClass440_4817.method5193(1.0F, 0.0F, 0.0F, (float)Math.atan2(this.aDouble12116, this.aDouble12114));
      Class440 var3 = Class440.method5192();
      var3.method5193(0.0F, 1.0F, 0.0F, (float)Math.atan2(this.aDouble12119, this.aDouble12120) - 3.1415927F);
      var2.aClass440_4817.method5194(var3);
      var3.method5163();
      this.method7619(var2);
      if(this.aClass704_12124.method8247(1, (byte)-34) && this.aClass704_12124.method8249(-1236294190)) {
         this.aClass704_12124.method8236(-1730576285);
      }

   }

   public void method10930(byte var1) {
      if(this.aClass614_12118 != null) {
         this.aClass614_12118.method7246();
      }

   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      return false;
   }

   final boolean method9864(byte var1) {
      return false;
   }

   void method10931(Class174 var1, Class168 var2, Class445 var3, int var4) {
      var2.method1996(var3);
      Class182[] var5 = var2.method1997();
      Class141[] var6 = var2.method2064();
      if((this.aClass614_12118 == null || this.aClass614_12118.aBool8074) && (var5 != null || null != var6)) {
         this.aClass614_12118 = Class614.method7263(client.anInt11012, true);
      }

      if(this.aClass614_12118 != null) {
         this.aClass614_12118.method7250(var1, (long)client.anInt11012, var5, var6, false);
         this.aClass614_12118.method7254(this.aByte10827, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802);
      }

   }

   Class555 method9844(Class174 var1) {
      Class168 var2 = this.method10932(var1, 2048, -1909326226);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         this.method10931(var1, var2, var3, -1181763080);
         Class555 var4 = Class463.method5475(false, (short)28960);
         var2.method1974(var3, this.aClass164Array10829[0], 0);
         if(null != this.aClass614_12118) {
            Class177 var5 = this.aClass614_12118.method7253();
            var1.method2516(var5);
         }

         this.aBool12126 = var2.method2014();
         var2.method2063();
         this.anInt12125 = var2.method1981() * 1154284135;
         return var4;
      }
   }

   Class168 method10932(Class174 var1, int var2, int var3) {
      Class670 var4 = (Class670)Class689.aClass40_Sub12_8692.method89(-708669055 * this.anInt12128, -1648400667);
      return var4.method7969(var1, var2, this.aClass704_12124, (byte)2, -990603662);
   }

   boolean method9841() {
      return this.aBool12126;
   }

   public int method9838() {
      return this.anInt12125 * 1122992471;
   }

   public int method9833() {
      return this.anInt12125 * 1122992471;
   }

   public Class550 method9840(Class174 var1) {
      return null;
   }

   public Class550 method9829(Class174 var1) {
      return null;
   }

   public Class550 method9856(Class174 var1) {
      return null;
   }

   public Class550 method9843(Class174 var1) {
      return null;
   }

   Class555 method9858(Class174 var1) {
      Class168 var2 = this.method10932(var1, 2048, -1791575282);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         this.method10931(var1, var2, var3, 2145503243);
         Class555 var4 = Class463.method5475(false, (short)29194);
         var2.method1974(var3, this.aClass164Array10829[0], 0);
         if(null != this.aClass614_12118) {
            Class177 var5 = this.aClass614_12118.method7253();
            var1.method2516(var5);
         }

         this.aBool12126 = var2.method2014();
         var2.method2063();
         this.anInt12125 = var2.method1981() * 1154284135;
         return var4;
      }
   }

   public void method10933() {
      if(!this.aBool12123) {
         if(0 != this.anInt12122 * -945855719) {
            Object var1 = null;
            if(4 == client.anInt11073 * 378016543) {
               var1 = Class645.aClass207Array8445[-945855719 * this.anInt12122 - 1].method2913((byte)119);
            } else {
               int var2;
               if(-945855719 * this.anInt12122 < 0) {
                  var2 = -(this.anInt12122 * -945855719) - 1;
                  if(-1204447689 * client.localPlayerIndex == var2) {
                     var1 = Class451.localPlayer;
                  } else {
                     var1 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
                  }
               } else {
                  var2 = -945855719 * this.anInt12122 - 1;
                  LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
                  if(null != var3) {
                     var1 = (Class639_Sub1_Sub2_Sub1)var3.anObject10399;
                  }
               }
            }

            if(var1 != null) {
               Class446 var13 = ((Class639_Sub1_Sub2_Sub1)var1).method7635().aClass446_4816;
               this.method7618(var13.aFloat4917, (float)(Class387.method4762((int)var13.aFloat4917, (int)var13.aFloat4919, this.aByte10827, 2019985862) - this.anInt12108 * 1496601327), var13.aFloat4919);
               if(this.anInt12127 * -1695405771 >= 0) {
                  RenderDef var14 = ((Class639_Sub1_Sub2_Sub1)var1).method10786(-16777216);
                  int var4 = 0;
                  int var5 = 0;
                  if(var14.anIntArrayArray7704 != null && var14.anIntArrayArray7704[this.anInt12127 * -1695405771] != null) {
                     var4 += var14.anIntArrayArray7704[-1695405771 * this.anInt12127][0];
                     var5 += var14.anIntArrayArray7704[this.anInt12127 * -1695405771][2];
                  }

                  if(var14.anIntArrayArray7698 != null && null != var14.anIntArrayArray7698[-1695405771 * this.anInt12127]) {
                     var4 += var14.anIntArrayArray7698[this.anInt12127 * -1695405771][0];
                     var5 += var14.anIntArrayArray7698[-1695405771 * this.anInt12127][2];
                  }

                  if(var4 != 0 || 0 != var5) {
                     int var6 = ((Class639_Sub1_Sub2_Sub1)var1).aClass34_11940.method817(1511687533);
                     int var7 = var6;
                     if(null != ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898 && ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[-1695405771 * this.anInt12127] != -1) {
                        var7 = ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[this.anInt12127 * -1695405771];
                     }

                     int var8 = var7 - var6 & 16383;
                     int var9 = Class443.anIntArray4895[var8];
                     int var10 = Class443.anIntArray4896[var8];
                     int var11 = var9 * var5 + var10 * var4 >> 14;
                     var5 = var5 * var10 - var9 * var4 >> 14;
                     Class446 var12 = Class446.method5305(this.method7635().aClass446_4816);
                     var12.aFloat4917 += (float)var11;
                     var12.aFloat4919 += (float)var5;
                     this.method7632(var12);
                     var12.method5278();
                  }
               }
            }
         }

      }
   }

   boolean method9836() {
      return false;
   }

   Class555 method9828(Class174 var1) {
      Class168 var2 = this.method10932(var1, 2048, -2081155865);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         this.method10931(var1, var2, var3, -837986562);
         Class555 var4 = Class463.method5475(false, (short)20412);
         var2.method1974(var3, this.aClass164Array10829[0], 0);
         if(null != this.aClass614_12118) {
            Class177 var5 = this.aClass614_12118.method7253();
            var1.method2516(var5);
         }

         this.aBool12126 = var2.method2014();
         var2.method2063();
         this.anInt12125 = var2.method1981() * 1154284135;
         return var4;
      }
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      return false;
   }

   final boolean method9850() {
      return false;
   }

   final boolean method9851() {
      return false;
   }

   final void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   final void method9847() {
      throw new IllegalStateException();
   }

   void method10671() {
      Class446 var1 = this.method7635().aClass446_4816;
      this.aShort11803 = this.aShort11798 = (short)((int)(var1.aFloat4917 / 512.0F));
      this.aShort11799 = this.aShort11802 = (short)((int)(var1.aFloat4919 / 512.0F));
   }

   void method10672() {
      Class446 var1 = this.method7635().aClass446_4816;
      this.aShort11803 = this.aShort11798 = (short)((int)(var1.aFloat4917 / 512.0F));
      this.aShort11799 = this.aShort11802 = (short)((int)(var1.aFloat4919 / 512.0F));
   }

   public void method10934() {
      if(this.aClass614_12118 != null) {
         this.aClass614_12118.method7246();
      }

   }

   public int method10935() {
      return -2120241247 * this.anInt12121;
   }

   public int method10936() {
      return -2120241247 * this.anInt12121;
   }

   public int method10937() {
      return -2120241247 * this.anInt12121;
   }

   public void method10938() {
      if(!this.aBool12123) {
         if(0 != this.anInt12122 * -945855719) {
            Object var1 = null;
            if(4 == client.anInt11073 * 378016543) {
               var1 = Class645.aClass207Array8445[-945855719 * this.anInt12122 - 1].method2913((byte)100);
            } else {
               int var2;
               if(-945855719 * this.anInt12122 < 0) {
                  var2 = -(this.anInt12122 * -945855719) - 1;
                  if(-1204447689 * client.localPlayerIndex == var2) {
                     var1 = Class451.localPlayer;
                  } else {
                     var1 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
                  }
               } else {
                  var2 = -945855719 * this.anInt12122 - 1;
                  LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
                  if(null != var3) {
                     var1 = (Class639_Sub1_Sub2_Sub1)var3.anObject10399;
                  }
               }
            }

            if(var1 != null) {
               Class446 var13 = ((Class639_Sub1_Sub2_Sub1)var1).method7635().aClass446_4816;
               this.method7618(var13.aFloat4917, (float)(Class387.method4762((int)var13.aFloat4917, (int)var13.aFloat4919, this.aByte10827, 1863780262) - this.anInt12108 * 1496601327), var13.aFloat4919);
               if(this.anInt12127 * -1695405771 >= 0) {
                  RenderDef var14 = ((Class639_Sub1_Sub2_Sub1)var1).method10786(-16777216);
                  int var4 = 0;
                  int var5 = 0;
                  if(var14.anIntArrayArray7704 != null && var14.anIntArrayArray7704[this.anInt12127 * -1695405771] != null) {
                     var4 += var14.anIntArrayArray7704[-1695405771 * this.anInt12127][0];
                     var5 += var14.anIntArrayArray7704[this.anInt12127 * -1695405771][2];
                  }

                  if(var14.anIntArrayArray7698 != null && null != var14.anIntArrayArray7698[-1695405771 * this.anInt12127]) {
                     var4 += var14.anIntArrayArray7698[this.anInt12127 * -1695405771][0];
                     var5 += var14.anIntArrayArray7698[-1695405771 * this.anInt12127][2];
                  }

                  if(var4 != 0 || 0 != var5) {
                     int var6 = ((Class639_Sub1_Sub2_Sub1)var1).aClass34_11940.method817(712740079);
                     int var7 = var6;
                     if(null != ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898 && ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[-1695405771 * this.anInt12127] != -1) {
                        var7 = ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[this.anInt12127 * -1695405771];
                     }

                     int var8 = var7 - var6 & 16383;
                     int var9 = Class443.anIntArray4895[var8];
                     int var10 = Class443.anIntArray4896[var8];
                     int var11 = var9 * var5 + var10 * var4 >> 14;
                     var5 = var5 * var10 - var9 * var4 >> 14;
                     Class446 var12 = Class446.method5305(this.method7635().aClass446_4816);
                     var12.aFloat4917 += (float)var11;
                     var12.aFloat4919 += (float)var5;
                     this.method7632(var12);
                     var12.method5278();
                  }
               }
            }
         }

      }
   }

   public void method10939() {
      if(!this.aBool12123) {
         if(0 != this.anInt12122 * -945855719) {
            Object var1 = null;
            if(4 == client.anInt11073 * 378016543) {
               var1 = Class645.aClass207Array8445[-945855719 * this.anInt12122 - 1].method2913((byte)85);
            } else {
               int var2;
               if(-945855719 * this.anInt12122 < 0) {
                  var2 = -(this.anInt12122 * -945855719) - 1;
                  if(-1204447689 * client.localPlayerIndex == var2) {
                     var1 = Class451.localPlayer;
                  } else {
                     var1 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
                  }
               } else {
                  var2 = -945855719 * this.anInt12122 - 1;
                  LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
                  if(null != var3) {
                     var1 = (Class639_Sub1_Sub2_Sub1)var3.anObject10399;
                  }
               }
            }

            if(var1 != null) {
               Class446 var13 = ((Class639_Sub1_Sub2_Sub1)var1).method7635().aClass446_4816;
               this.method7618(var13.aFloat4917, (float)(Class387.method4762((int)var13.aFloat4917, (int)var13.aFloat4919, this.aByte10827, 2045957186) - this.anInt12108 * 1496601327), var13.aFloat4919);
               if(this.anInt12127 * -1695405771 >= 0) {
                  RenderDef var14 = ((Class639_Sub1_Sub2_Sub1)var1).method10786(-16777216);
                  int var4 = 0;
                  int var5 = 0;
                  if(var14.anIntArrayArray7704 != null && var14.anIntArrayArray7704[this.anInt12127 * -1695405771] != null) {
                     var4 += var14.anIntArrayArray7704[-1695405771 * this.anInt12127][0];
                     var5 += var14.anIntArrayArray7704[this.anInt12127 * -1695405771][2];
                  }

                  if(var14.anIntArrayArray7698 != null && null != var14.anIntArrayArray7698[-1695405771 * this.anInt12127]) {
                     var4 += var14.anIntArrayArray7698[this.anInt12127 * -1695405771][0];
                     var5 += var14.anIntArrayArray7698[-1695405771 * this.anInt12127][2];
                  }

                  if(var4 != 0 || 0 != var5) {
                     int var6 = ((Class639_Sub1_Sub2_Sub1)var1).aClass34_11940.method817(-1340485885);
                     int var7 = var6;
                     if(null != ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898 && ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[-1695405771 * this.anInt12127] != -1) {
                        var7 = ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[this.anInt12127 * -1695405771];
                     }

                     int var8 = var7 - var6 & 16383;
                     int var9 = Class443.anIntArray4895[var8];
                     int var10 = Class443.anIntArray4896[var8];
                     int var11 = var9 * var5 + var10 * var4 >> 14;
                     var5 = var5 * var10 - var9 * var4 >> 14;
                     Class446 var12 = Class446.method5305(this.method7635().aClass446_4816);
                     var12.aFloat4917 += (float)var11;
                     var12.aFloat4919 += (float)var5;
                     this.method7632(var12);
                     var12.method5278();
                  }
               }
            }
         }

      }
   }

   final void method9842(int var1) {
      throw new IllegalStateException();
   }

   public void method10940() {
      if(!this.aBool12123) {
         if(0 != this.anInt12122 * -945855719) {
            Object var1 = null;
            if(4 == client.anInt11073 * 378016543) {
               var1 = Class645.aClass207Array8445[-945855719 * this.anInt12122 - 1].method2913((byte)113);
            } else {
               int var2;
               if(-945855719 * this.anInt12122 < 0) {
                  var2 = -(this.anInt12122 * -945855719) - 1;
                  if(-1204447689 * client.localPlayerIndex == var2) {
                     var1 = Class451.localPlayer;
                  } else {
                     var1 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
                  }
               } else {
                  var2 = -945855719 * this.anInt12122 - 1;
                  LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
                  if(null != var3) {
                     var1 = (Class639_Sub1_Sub2_Sub1)var3.anObject10399;
                  }
               }
            }

            if(var1 != null) {
               Class446 var13 = ((Class639_Sub1_Sub2_Sub1)var1).method7635().aClass446_4816;
               this.method7618(var13.aFloat4917, (float)(Class387.method4762((int)var13.aFloat4917, (int)var13.aFloat4919, this.aByte10827, 1868802301) - this.anInt12108 * 1496601327), var13.aFloat4919);
               if(this.anInt12127 * -1695405771 >= 0) {
                  RenderDef var14 = ((Class639_Sub1_Sub2_Sub1)var1).method10786(-16777216);
                  int var4 = 0;
                  int var5 = 0;
                  if(var14.anIntArrayArray7704 != null && var14.anIntArrayArray7704[this.anInt12127 * -1695405771] != null) {
                     var4 += var14.anIntArrayArray7704[-1695405771 * this.anInt12127][0];
                     var5 += var14.anIntArrayArray7704[this.anInt12127 * -1695405771][2];
                  }

                  if(var14.anIntArrayArray7698 != null && null != var14.anIntArrayArray7698[-1695405771 * this.anInt12127]) {
                     var4 += var14.anIntArrayArray7698[this.anInt12127 * -1695405771][0];
                     var5 += var14.anIntArrayArray7698[-1695405771 * this.anInt12127][2];
                  }

                  if(var4 != 0 || 0 != var5) {
                     int var6 = ((Class639_Sub1_Sub2_Sub1)var1).aClass34_11940.method817(-1221671355);
                     int var7 = var6;
                     if(null != ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898 && ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[-1695405771 * this.anInt12127] != -1) {
                        var7 = ((Class639_Sub1_Sub2_Sub1)var1).anIntArray11898[this.anInt12127 * -1695405771];
                     }

                     int var8 = var7 - var6 & 16383;
                     int var9 = Class443.anIntArray4895[var8];
                     int var10 = Class443.anIntArray4896[var8];
                     int var11 = var9 * var5 + var10 * var4 >> 14;
                     var5 = var5 * var10 - var9 * var4 >> 14;
                     Class446 var12 = Class446.method5305(this.method7635().aClass446_4816);
                     var12.aFloat4917 += (float)var11;
                     var12.aFloat4919 += (float)var5;
                     this.method7632(var12);
                     var12.method5278();
                  }
               }
            }
         }

      }
   }

   public Class639_Sub1_Sub2_Sub4(Class549 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, int var16, int var17) {
      super(var1, var3, var4, var5, Class387.method4762(var5, var6, var3, 1951517052) - var7, var6, var5 >> 9, var5 >> 9, var6 >> 9, var6 >> 9, false, (byte)0);
      this.anInt12128 = var2 * 1133489793;
      this.anInt12110 = var8 * 767178725;
      this.anInt12111 = -1165824155 * var9;
      this.anInt12112 = -1713759517 * var10;
      this.anInt12113 = var11 * 1740959165;
      this.anInt12122 = 1808746793 * var12;
      this.anInt12115 = 1321229743 * var13;
      this.anInt12108 = -319611889 * var7;
      this.anInt12109 = var14 * 1910721943;
      this.aBool12117 = var15;
      this.aBool12123 = false;
      this.anInt12127 = 1743495453 * var16;
      this.anInt12121 = var17 * 746189921;
      int var18 = ((Class670)Class689.aClass40_Sub12_8692.method89(-708669055 * this.anInt12128, -673412619)).anInt8550 * 1305328919;
      this.aClass704_12124 = new Class704_Sub2(this, false);
      this.aClass704_12124.method8246(var18, (byte)-30);
      this.method9835(1, 112195470);
   }

   final void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   boolean method9821(int var1) {
      return false;
   }

   void method10670(int var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      this.aShort11803 = this.aShort11798 = (short)((int)(var2.aFloat4917 / 512.0F));
      this.aShort11799 = this.aShort11802 = (short)((int)(var2.aFloat4919 / 512.0F));
   }

   public void method10941() {
      if(this.aClass614_12118 != null) {
         this.aClass614_12118.method7246();
      }

   }

   public void method10942() {
      if(this.aClass614_12118 != null) {
         this.aClass614_12118.method7246();
      }

   }
}
