package com.jagex;

import com.jagex.Class111;
import com.jagex.Class114;
import com.jagex.Class115;
import com.jagex.Class163;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class178;
import com.jagex.Class193;
import com.jagex.Class201;
import com.jagex.Class206;
import com.jagex.Class227;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.Class294;
import com.jagex.Class295;
import com.jagex.Class305;
import com.jagex.NPCDef;
import com.jagex.Class31;
import com.jagex.Class331;
import com.jagex.Class388;
import com.jagex.OutFrame;
import com.jagex.Class430;
import com.jagex.Class440;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class452_Sub4;
import com.jagex.Class463;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub32;
import com.jagex.Class541;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class552;
import com.jagex.Class555;
import com.jagex.RenderDef;
import com.jagex.Class596;
import com.jagex.Class636;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class663;
import com.jagex.Class670;
import com.jagex.NPCDirection;
import com.jagex.MovementDirection;
import com.jagex.Class689;
import com.jagex.Class704;
import com.jagex.Class704_Sub3;
import com.jagex.client;

public class NPC extends Class639_Sub1_Sub2_Sub1 {
   public Class294 aClass294_12188;
   boolean aBool12200;
   public int anInt12201;
   public int anInt12192 = -1172692015;
   public int anInt12187 = 1094789271;
   public int anInt12191 = 851363225;
   int[] anIntArray12185 = new int[6];
   int[] anIntArray12195 = new int[6];
   public NPCDef def;
   public String aString12194;
   public int combatLevel;
   public Class305 aClass305_12186;
   int anInt12197;
   int anInt12198;
   int anInt12199;
   int anInt12196;
   public static int anInt12189 = 1836894055;
   public static int anInt12190 = 1542168007;

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      if(this.def == null) {
         return false;
      } else if(null != this.def.aClass437_3367) {
         return var1.method2301(var2, var3, this.method7623(), this.def.aClass437_3367, 983801545);
      } else if(!this.method10993(var1, 131072, 67471887)) {
         return false;
      } else {
         Class445 var5 = this.method7623();
         boolean var6 = false;

         int var7;
         for(var7 = 0; var7 < this.aClass168Array11953.length; ++var7) {
            if(this.aClass168Array11953[var7] != null && this.aClass168Array11953[var7].aBool1909) {
               boolean var10000;
               label68: {
                  if(this.def.anInt3319 * -1434178745 <= 0) {
                     label67: {
                        if(-1 == this.def.anInt3314 * -2137930545) {
                           if(459047587 * this.def.boundSize == 1) {
                              break label67;
                           }
                        } else if(this.def.anInt3314 * -2137930545 == 1) {
                           break label67;
                        }

                        var10000 = false;
                        break label68;
                     }
                  }

                  var10000 = true;
               }

               boolean var8 = var10000;
               boolean var9 = this.aClass168Array11953[var7].method1975(var2, var3, var5, var8, this.def.anInt3319 * -1434178745);
               if(var9) {
                  var6 = true;
                  break;
               }
            }
         }

         for(var7 = 0; var7 < this.aClass168Array11953.length; ++var7) {
            this.aClass168Array11953[var7] = null;
         }

         return var6;
      }
   }

   public NPC(Class549 var1, int var2) {
      super(var1, var2, Class201.aClass97_Sub1_Sub2_2210);
      this.method10982((byte)0);
   }

   int method10772() {
      if(this.anInt12191 * -1168686761 != -1) {
         return this.anInt12191 * -1168686761;
      } else {
         if(null != this.def.morphisms) {
            NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            if(null != var1 && -1 != 1405403059 * var1.renderEmote) {
               return 1405403059 * var1.renderEmote;
            }
         }

         return this.def.renderEmote * 1405403059;
      }
   }

   public Class440 method194() {
      Class440 var1 = Class440.method5192();
      var1.method5160(Class443.method5200(604797385 * this.aClass34_11940.anInt370), 0.0F, 0.0F);
      return var1;
   }

   public boolean method10818() {
      return Class331.aClass613_3498.aBool8030;
   }

   public void method10981(NPCDef var1, boolean var2, boolean var3, boolean var4, int var5) {
      if(var1 != this.def && Class31.aBool291 && Class663.method7947(this.index * 828574411, -2100549937)) {
         Class114.method1400(-1383470257);
      }

      this.def = var1;
      if(null != this.def) {
         if(var2) {
            this.aString12194 = this.def.name;
         }

         if(var3) {
            this.combatLevel = -380325731 * this.def.combatLevel;
         }

         if(var4) {
            this.aClass305_12186 = null;
         }
      }

      if(null != this.aClass614_11950) {
         this.aClass614_11950.method7244();
      }

   }

   public Class550 method9827(Class174 var1, int var2) {
      return null;
   }

   Class555 method9825(Class174 var1, int var2) {
      if(null != this.def && this.method10993(var1, 526336, -206511851)) {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class445 var5 = var1.method2319();
         int var6 = this.aClass34_11940.method817(-850921429);
         Class552 var7 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][(int)var4.aClass446_4816.aFloat4917 >> 9][(int)var4.aClass446_4816.aFloat4919 >> 9];
         if(null != var7 && null != var7.aClass639_Sub1_Sub3_7355) {
            int var8 = -1438156659 * this.anInt11902 - var7.aClass639_Sub1_Sub3_7355.aShort11834;
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)var8 / 10.0F);
         } else {
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)(this.anInt11902 * -1438156659) / 10.0F);
         }

         var5.method5242(var3);
         var5.method5251(0.0F, (float)(-20 - -1438156659 * this.anInt11902), 0.0F);
         RenderDef var17 = this.method10786(-16777216);
         NPCDef var9 = null != this.def.morphisms?this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117):this.def;
         boolean var10 = null != var9.aClass437_3367;
         this.aBool11913 = false;
         Class555 var11 = null;
         if(Class230.preferences.aClass711_Sub3_10644.method9873(1943437395) == 1 && var9.animateIdle && var17.aBool7733) {
            Class704 var12 = this.aClass704_11915.method8218((byte)-55) && this.aClass704_11915.method8227((byte)0)?this.aClass704_11915:null;
            Class704_Sub3 var13 = !this.aClass704_Sub3_11914.method8218((byte)-111) || this.aClass704_Sub3_11914.aBool10969 && var12 != null?null:this.aClass704_Sub3_11914;
            short var14 = Class331.aClass613_3498.aShort8042;
            byte var15 = Class331.aClass613_3498.aByte8060;
            if(this.def.aShort3348 > -1) {
               var14 = this.def.aShort3348;
               var15 = this.def.aByte3358;
            }

            Class168 var16;
            if(var14 > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
               var16 = Class193.method2808(var1, var6, 1194917821 * this.anInt11889, -1966848677 * this.anInt11900, this.anInt11901 * 361060487, this.aClass168Array11953[0], var14, var15, (Class704)(var13 != null?var13:var12), -1807191956);
            } else {
               var16 = Class178.method2666(var1, var6, 1194917821 * this.anInt11889, this.anInt11900 * -1966848677, 361060487 * this.anInt11901, 459047587 * this.def.boundSize, this.aClass168Array11953[0], this.def.aShort3353 & '\uffff', this.def.aShort3345 & '\uffff', this.def.aByte3299 & 255, this.def.aByte3347 & 255, (Class704)(var13 != null?var13:var12), 1983961387);
            }

            if(var16 != null) {
               var11 = Class463.method5475(this.method10991((byte)-80), (short)4754);
               this.aBool11913 = true;
               var1.method2328(false);
               if(var10) {
                  var16.method1974(var5, (Class164)null, 0);
               } else {
                  if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length + 1) {
                     this.method9835(1 + this.aClass168Array11953.length, -67459598);
                  }

                  var16.method1974(var5, this.aClass164Array10829[this.aClass168Array11953.length], 0);
               }

               var1.method2328(true);
            }
         }

         if(var10) {
            if(null == this.aClass164Array10829 || this.aClass164Array10829.length > 1) {
               this.method9835(1, -501164907);
            }

            var1.method2303(var5, this.aClass164Array10829[0], var9.aClass437_3367);
         } else if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length) {
            this.method9835(this.aClass168Array11953.length, -1581182874);
         }

         if(var11 == null) {
            var11 = Class463.method5475(this.method10991((byte)-97), (short)20031);
         }

         this.method10776(var1, this.aClass168Array11953, var5, false, (byte)57);

         int var18;
         for(var18 = 0; var18 < this.aClass168Array11953.length; ++var18) {
            if(this.aClass168Array11953[var18] != null) {
               if(this.def.aBool3346) {
                  this.aClass168Array11953[var18].method2020(-336535637 * this.anInt12197, 2028561821 * this.anInt12198, this.anInt12199 * 1089511811, this.anInt12196 * -2074753321);
               }

               if(var10) {
                  this.aClass168Array11953[var18].method1974(var5, (Class164)null, 0);
               } else {
                  this.aClass168Array11953[var18].method1974(var5, this.aClass164Array10829[var18], 0);
               }
            } else if(!var10) {
               this.aClass164Array10829[var18].aBool1784 = false;
            }
         }

         if(this.aClass614_11950 != null) {
            Class177 var19 = this.aClass614_11950.method7253();
            var1.method2516(var19);
         }

         for(var18 = 0; var18 < this.aClass168Array11953.length; ++var18) {
            if(this.aClass168Array11953[var18] != null) {
               this.aBool11913 |= this.aClass168Array11953[var18].method2014();
            }

            this.aClass168Array11953[var18] = null;
         }

         this.anInt11891 = client.anInt11126 * -1513030831;
         return var11;
      } else {
         return null;
      }
   }

   final void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   void method10982(byte var1) {
      this.anInt12197 = (32 + (int)(Math.random() * 4.0D)) * -741661949;
      this.anInt12198 = (3 + (int)(Math.random() * 2.0D)) * 919816373;
      this.anInt12199 = (16 + (int)(Math.random() * 3.0D)) * -1813220053;
      if(Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
         this.anInt12196 = (int)(Math.random() * 6.0D) * 830770407;
      } else {
         this.anInt12196 = (int)(Math.random() * 12.0D) * 830770407;
      }

   }

   public final void move(NPCDirection var1, int var2, int var3) {
      int var4 = this.screenX[0];
      int var5 = this.screenY[0];
      switch(var1.id * -2048807445) {
      case 0:
         ++var4;
         ++var5;
         break;
      case 1:
         --var4;
         break;
      case 2:
         ++var4;
         break;
      case 3:
         ++var5;
         break;
      case 4:
         --var5;
         break;
      case 5:
         ++var4;
         --var5;
         break;
      case 6:
         --var4;
         ++var5;
         break;
      case 7:
         --var4;
         --var5;
      }

      if(this.aClass704_11915.method8218((byte)-74) && this.aClass704_11915.method8219((byte)-31).anInt2237 * -571300867 == 1) {
         this.anIntArray11935 = null;
         this.aClass704_11915.method8246(-1, (byte)-105);
      }

      int var6;
      for(var6 = 0; var6 < this.aClass510Array11906.length; ++var6) {
         if(-1 != this.aClass510Array11906[var6].anInt6980 * 901715121) {
            Class670 var7 = (Class670)Class689.aClass40_Sub12_8692.method89(901715121 * this.aClass510Array11906[var6].anInt6980, -1252435391);
            if(var7.aBool8552 && var7.anInt8550 * 1305328919 != -1 && ((Class206)Class388.aClass40_Sub15_4063.method89(var7.anInt8550 * 1305328919, 186016105)).anInt2237 * -571300867 == 1) {
               this.aClass510Array11906[var6].aClass704_6979.method8246(-1, (byte)-79);
               this.aClass510Array11906[var6].anInt6980 = -2069804113;
            }
         }
      }

      if(-577323399 * this.anInt11943 < this.screenX.length - 1) {
         this.anInt11943 += -808498231;
      }

      for(var6 = this.anInt11943 * -577323399; var6 > 0; --var6) {
         this.screenX[var6] = this.screenX[var6 - 1];
         this.screenY[var6] = this.screenY[var6 - 1];
         this.aByteArray11946[var6] = this.aByteArray11946[var6 - 1];
      }

      this.screenX[0] = var4;
      this.screenY[0] = var5;
      this.aByteArray11946[0] = (byte)var2;
   }

   public void move(int var1, int var2, int var3, boolean var4, int var5, int var6) {
      this.aByte10827 = this.aByte10828 = (byte)var1;
      if(client.aClass505_11204.method6094((byte)-82).method5614(var2, var3, -1361009427)) {
         ++this.aByte10828;
      }

      if(this.aClass704_11915.method8218((byte)-33) && this.aClass704_11915.method8219((byte)5).anInt2237 * -571300867 == 1) {
         this.anIntArray11935 = null;
         this.aClass704_11915.method8246(-1, (byte)-1);
      }

      int var7;
      for(var7 = 0; var7 < this.aClass510Array11906.length; ++var7) {
         if(901715121 * this.aClass510Array11906[var7].anInt6980 != -1) {
            Class670 var8 = (Class670)Class689.aClass40_Sub12_8692.method89(this.aClass510Array11906[var7].anInt6980 * 901715121, -1070259248);
            if(var8.aBool8552 && -1 != var8.anInt8550 * 1305328919 && ((Class206)Class388.aClass40_Sub15_4063.method89(var8.anInt8550 * 1305328919, -1658268108)).anInt2237 * -571300867 == 1) {
               this.aClass510Array11906[var7].aClass704_6979.method8246(-1, (byte)-26);
               this.aClass510Array11906[var7].anInt6980 = -2069804113;
            }
         }
      }

      if(!var4) {
         var7 = var2 - this.screenX[0];
         int var11 = var3 - this.screenY[0];
         if(var7 >= -8 && var7 <= 8 && var11 >= -8 && var11 <= 8) {
            if(-577323399 * this.anInt11943 < this.screenX.length - 1) {
               this.anInt11943 += -808498231;
            }

            for(int var9 = this.anInt11943 * -577323399; var9 > 0; --var9) {
               this.screenX[var9] = this.screenX[var9 - 1];
               this.screenY[var9] = this.screenY[var9 - 1];
               this.aByteArray11946[var9] = this.aByteArray11946[var9 - 1];
            }

            this.screenX[0] = var2;
            this.screenY[0] = var3;
            this.aByteArray11946[0] = MovementDirection.WALKING.id;
            return;
         }
      }

      this.anInt11943 = 0;
      this.anInt11948 = 0;
      this.anInt11957 = 0;
      this.screenX[0] = var2;
      this.screenY[0] = var3;
      Class446 var10 = Class446.method5305(this.method7635().aClass446_4816);
      var10.aFloat4917 = (float)((this.screenX[0] << 9) + (var5 << 8));
      var10.aFloat4919 = (float)((var5 << 8) + (this.screenY[0] << 9));
      this.method7632(var10);
      var10.method5278();
      if(null != this.aClass614_11950) {
         this.aClass614_11950.method7244();
      }

   }

   public boolean method10810() {
      return Class331.aClass613_3498.aBool8030;
   }

   int method10787(byte var1) {
      if(this.anInt12191 * -1168686761 != -1) {
         return this.anInt12191 * -1168686761;
      } else {
         if(null != this.def.morphisms) {
            NPCDef var2 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            if(null != var2 && -1 != 1405403059 * var2.renderEmote) {
               return 1405403059 * var2.renderEmote;
            }
         }

         return this.def.renderEmote * 1405403059;
      }
   }

   public int method10788(int var1) {
      if(this.def.morphisms != null) {
         NPCDef var2 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var2 != null && -1 != 245078561 * var2.armyIcon) {
            return 245078561 * var2.armyIcon;
         }
      }

      return 245078561 * this.def.armyIcon;
   }

   public int method9859(byte var1) {
      if(null != this.def.morphisms) {
         NPCDef var2 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var2 != null && -1 != var2.height * 907573371) {
            return 907573371 * var2.height;
         }
      }

      return -1 != this.def.height * 907573371?this.def.height * 907573371:super.method9859((byte)-65);
   }

   int method9854() {
      return null == this.def?0:this.def.anInt3319 * -1434178745;
   }

   int method9837(short var1) {
      return null == this.def?0:this.def.anInt3319 * -1434178745;
   }

   final boolean method9864(byte var1) {
      return false;
   }

   final void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   Class555 method9828(Class174 var1) {
      if(null != this.def && this.method10993(var1, 526336, -437903137)) {
         Class445 var2 = this.method7623();
         Class430 var3 = this.method7635();
         Class445 var4 = var1.method2319();
         int var5 = this.aClass34_11940.method817(-908162626);
         Class552 var6 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][(int)var3.aClass446_4816.aFloat4917 >> 9][(int)var3.aClass446_4816.aFloat4919 >> 9];
         if(null != var6 && null != var6.aClass639_Sub1_Sub3_7355) {
            int var7 = -1438156659 * this.anInt11902 - var6.aClass639_Sub1_Sub3_7355.aShort11834;
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)var7 / 10.0F);
         } else {
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)(this.anInt11902 * -1438156659) / 10.0F);
         }

         var4.method5242(var2);
         var4.method5251(0.0F, (float)(-20 - -1438156659 * this.anInt11902), 0.0F);
         RenderDef var16 = this.method10786(-16777216);
         NPCDef var8 = null != this.def.morphisms?this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117):this.def;
         boolean var9 = null != var8.aClass437_3367;
         this.aBool11913 = false;
         Class555 var10 = null;
         if(Class230.preferences.aClass711_Sub3_10644.method9873(1011146269) == 1 && var8.animateIdle && var16.aBool7733) {
            Class704 var11 = this.aClass704_11915.method8218((byte)-60) && this.aClass704_11915.method8227((byte)-47)?this.aClass704_11915:null;
            Class704_Sub3 var12 = !this.aClass704_Sub3_11914.method8218((byte)-73) || this.aClass704_Sub3_11914.aBool10969 && var11 != null?null:this.aClass704_Sub3_11914;
            short var13 = Class331.aClass613_3498.aShort8042;
            byte var14 = Class331.aClass613_3498.aByte8060;
            if(this.def.aShort3348 > -1) {
               var13 = this.def.aShort3348;
               var14 = this.def.aByte3358;
            }

            Class168 var15;
            if(var13 > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
               var15 = Class193.method2808(var1, var5, 1194917821 * this.anInt11889, -1966848677 * this.anInt11900, this.anInt11901 * 361060487, this.aClass168Array11953[0], var13, var14, (Class704)(var12 != null?var12:var11), -1659695753);
            } else {
               var15 = Class178.method2666(var1, var5, 1194917821 * this.anInt11889, this.anInt11900 * -1966848677, 361060487 * this.anInt11901, 459047587 * this.def.boundSize, this.aClass168Array11953[0], this.def.aShort3353 & '\uffff', this.def.aShort3345 & '\uffff', this.def.aByte3299 & 255, this.def.aByte3347 & 255, (Class704)(var12 != null?var12:var11), 1888378464);
            }

            if(var15 != null) {
               var10 = Class463.method5475(this.method10991((byte)-14), (short)5971);
               this.aBool11913 = true;
               var1.method2328(false);
               if(var9) {
                  var15.method1974(var4, (Class164)null, 0);
               } else {
                  if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length + 1) {
                     this.method9835(1 + this.aClass168Array11953.length, -418988484);
                  }

                  var15.method1974(var4, this.aClass164Array10829[this.aClass168Array11953.length], 0);
               }

               var1.method2328(true);
            }
         }

         if(var9) {
            if(null == this.aClass164Array10829 || this.aClass164Array10829.length > 1) {
               this.method9835(1, 1415352946);
            }

            var1.method2303(var4, this.aClass164Array10829[0], var8.aClass437_3367);
         } else if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length) {
            this.method9835(this.aClass168Array11953.length, 1775405904);
         }

         if(var10 == null) {
            var10 = Class463.method5475(this.method10991((byte)-6), (short)23743);
         }

         this.method10776(var1, this.aClass168Array11953, var4, false, (byte)20);

         int var17;
         for(var17 = 0; var17 < this.aClass168Array11953.length; ++var17) {
            if(this.aClass168Array11953[var17] != null) {
               if(this.def.aBool3346) {
                  this.aClass168Array11953[var17].method2020(-336535637 * this.anInt12197, 2028561821 * this.anInt12198, this.anInt12199 * 1089511811, this.anInt12196 * -2074753321);
               }

               if(var9) {
                  this.aClass168Array11953[var17].method1974(var4, (Class164)null, 0);
               } else {
                  this.aClass168Array11953[var17].method1974(var4, this.aClass164Array10829[var17], 0);
               }
            } else if(!var9) {
               this.aClass164Array10829[var17].aBool1784 = false;
            }
         }

         if(this.aClass614_11950 != null) {
            Class177 var18 = this.aClass614_11950.method7253();
            var1.method2516(var18);
         }

         for(var17 = 0; var17 < this.aClass168Array11953.length; ++var17) {
            if(this.aClass168Array11953[var17] != null) {
               this.aBool11913 |= this.aClass168Array11953[var17].method2014();
            }

            this.aClass168Array11953[var17] = null;
         }

         this.anInt11891 = client.anInt11126 * -1513030831;
         return var10;
      } else {
         return null;
      }
   }

   public int method10985(int var1, byte var2) {
      return this.anIntArray12185[var1];
   }

   public int method10986(int var1, int var2) {
      return this.anIntArray12195[var1];
   }

   public void method10987(int var1, int var2, int var3, int var4) {
      this.anIntArray12185[var1] = var2;
      this.anIntArray12195[var1] = var3;
   }

   public boolean method10782(int var1) {
      return Class331.aClass613_3498.aBool8030;
   }

   public Class541 method10790(byte var1) {
      return this.aClass541_11903 != null && null == this.aClass541_11903.aString7228?null:this.aClass541_11903;
   }

   public void method10988(String var1, int var2, int var3, byte var4) {
      int var5 = Class636.method7565(1463845438) * Class331.aClass613_3498.anInt8051 * 535905851;
      this.method10780(var1, var2, var3, var5, 440286348);
   }

   public int method10795(int var1) {
      return 828574411 * this.index + 1;
   }

   public Class295 method197(byte var1) {
      return Class295.aClass295_3191;
   }

   public void method10989(int var1) {
      this.anInt11917 = 1130790757;
      this.anInt11932 = client.anInt11012 * -972218431;
   }

   public boolean method10816() {
      return Class331.aClass613_3498.aBool8030;
   }

   public boolean method9852() {
      return this.def.morphisms == null || this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117) != null;
   }

   public Class446 method188(int var1) {
      return Class446.method5312();
   }

   public int method87(int var1) {
      return 828574411 * this.index;
   }

   public void setDefinition(NPCDef var1, int var2) {
      this.method10981(var1, true, true, true, -603737070);
   }

   public Class295 method189() {
      return Class295.aClass295_3191;
   }

   public int method92() {
      return 828574411 * this.index;
   }

   public Class526_Sub32 method191() {
      Class596 var1 = client.aClass505_11204.method6128(2009055676);
      return Class163.method1925(this.aByte10827, (int)this.method7635().aClass446_4816.aFloat4917 + -507706880 * var1.localX, -((int)this.method7635().aClass446_4816.aFloat4915), (int)this.method7635().aClass446_4816.aFloat4919 + var1.localY * 747559424, (byte)121);
   }

   public Class526_Sub32 method187() {
      Class596 var1 = client.aClass505_11204.method6128(2084369543);
      return Class163.method1925(this.aByte10827, (int)this.method7635().aClass446_4816.aFloat4917 + -507706880 * var1.localX, -((int)this.method7635().aClass446_4816.aFloat4915), (int)this.method7635().aClass446_4816.aFloat4919 + var1.localY * 747559424, (byte)87);
   }

   public Class526_Sub32 method192() {
      Class596 var1 = client.aClass505_11204.method6128(2008453975);
      return Class163.method1925(this.aByte10827, (int)this.method7635().aClass446_4816.aFloat4917 + -507706880 * var1.localX, -((int)this.method7635().aClass446_4816.aFloat4915), (int)this.method7635().aClass446_4816.aFloat4919 + var1.localY * 747559424, (byte)29);
   }

   boolean method10991(byte var1) {
      return this.aBool12200 || this.def.aBool3317;
   }

   int method10812() {
      if(this.anInt12191 * -1168686761 != -1) {
         return this.anInt12191 * -1168686761;
      } else {
         if(null != this.def.morphisms) {
            NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            if(null != var1 && -1 != 1405403059 * var1.renderEmote) {
               return 1405403059 * var1.renderEmote;
            }
         }

         return this.def.renderEmote * 1405403059;
      }
   }

   public Class440 method195() {
      Class440 var1 = Class440.method5192();
      var1.method5160(Class443.method5200(604797385 * this.aClass34_11940.anInt370), 0.0F, 0.0F);
      return var1;
   }

   public Class440 method196() {
      Class440 var1 = Class440.method5192();
      var1.method5160(Class443.method5200(604797385 * this.aClass34_11940.anInt370), 0.0F, 0.0F);
      return var1;
   }

   public Class440 method190() {
      Class440 var1 = Class440.method5192();
      var1.method5160(Class443.method5200(604797385 * this.aClass34_11940.anInt370), 0.0F, 0.0F);
      return var1;
   }

   int method9819() {
      return null == this.def?0:this.def.anInt3319 * -1434178745;
   }

   public Class446 method199() {
      return Class446.method5312();
   }

   public Class446 method200() {
      return Class446.method5312();
   }

   public Class440 method193() {
      Class440 var1 = Class440.method5192();
      var1.method5160(Class443.method5200(604797385 * this.aClass34_11940.anInt370), 0.0F, 0.0F);
      return var1;
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

   public int method9846() {
      if(null != this.def.morphisms) {
         NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var1 != null && -1 != var1.height * 907573371) {
            return 907573371 * var1.height;
         }
      }

      return -1 != this.def.height * 907573371?this.def.height * 907573371:super.method9859((byte)-90);
   }

   public int method9845() {
      if(null != this.def.morphisms) {
         NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var1 != null && -1 != var1.height * 907573371) {
            return 907573371 * var1.height;
         }
      }

      return -1 != this.def.height * 907573371?this.def.height * 907573371:super.method9859((byte)-72);
   }

   Class555 method9858(Class174 var1) {
      if(null != this.def && this.method10993(var1, 526336, 1389669246)) {
         Class445 var2 = this.method7623();
         Class430 var3 = this.method7635();
         Class445 var4 = var1.method2319();
         int var5 = this.aClass34_11940.method817(452542092);
         Class552 var6 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][(int)var3.aClass446_4816.aFloat4917 >> 9][(int)var3.aClass446_4816.aFloat4919 >> 9];
         if(null != var6 && null != var6.aClass639_Sub1_Sub3_7355) {
            int var7 = -1438156659 * this.anInt11902 - var6.aClass639_Sub1_Sub3_7355.aShort11834;
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)var7 / 10.0F);
         } else {
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)(this.anInt11902 * -1438156659) / 10.0F);
         }

         var4.method5242(var2);
         var4.method5251(0.0F, (float)(-20 - -1438156659 * this.anInt11902), 0.0F);
         RenderDef var16 = this.method10786(-16777216);
         NPCDef var8 = null != this.def.morphisms?this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117):this.def;
         boolean var9 = null != var8.aClass437_3367;
         this.aBool11913 = false;
         Class555 var10 = null;
         if(Class230.preferences.aClass711_Sub3_10644.method9873(1915010459) == 1 && var8.animateIdle && var16.aBool7733) {
            Class704 var11 = this.aClass704_11915.method8218((byte)-38) && this.aClass704_11915.method8227((byte)12)?this.aClass704_11915:null;
            Class704_Sub3 var12 = !this.aClass704_Sub3_11914.method8218((byte)-51) || this.aClass704_Sub3_11914.aBool10969 && var11 != null?null:this.aClass704_Sub3_11914;
            short var13 = Class331.aClass613_3498.aShort8042;
            byte var14 = Class331.aClass613_3498.aByte8060;
            if(this.def.aShort3348 > -1) {
               var13 = this.def.aShort3348;
               var14 = this.def.aByte3358;
            }

            Class168 var15;
            if(var13 > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
               var15 = Class193.method2808(var1, var5, 1194917821 * this.anInt11889, -1966848677 * this.anInt11900, this.anInt11901 * 361060487, this.aClass168Array11953[0], var13, var14, (Class704)(var12 != null?var12:var11), -1595214306);
            } else {
               var15 = Class178.method2666(var1, var5, 1194917821 * this.anInt11889, this.anInt11900 * -1966848677, 361060487 * this.anInt11901, 459047587 * this.def.boundSize, this.aClass168Array11953[0], this.def.aShort3353 & '\uffff', this.def.aShort3345 & '\uffff', this.def.aByte3299 & 255, this.def.aByte3347 & 255, (Class704)(var12 != null?var12:var11), 817148741);
            }

            if(var15 != null) {
               var10 = Class463.method5475(this.method10991((byte)-60), (short)1184);
               this.aBool11913 = true;
               var1.method2328(false);
               if(var9) {
                  var15.method1974(var4, (Class164)null, 0);
               } else {
                  if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length + 1) {
                     this.method9835(1 + this.aClass168Array11953.length, 1462664328);
                  }

                  var15.method1974(var4, this.aClass164Array10829[this.aClass168Array11953.length], 0);
               }

               var1.method2328(true);
            }
         }

         if(var9) {
            if(null == this.aClass164Array10829 || this.aClass164Array10829.length > 1) {
               this.method9835(1, 1797163593);
            }

            var1.method2303(var4, this.aClass164Array10829[0], var8.aClass437_3367);
         } else if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length) {
            this.method9835(this.aClass168Array11953.length, 1641323191);
         }

         if(var10 == null) {
            var10 = Class463.method5475(this.method10991((byte)15), (short)25808);
         }

         this.method10776(var1, this.aClass168Array11953, var4, false, (byte)55);

         int var17;
         for(var17 = 0; var17 < this.aClass168Array11953.length; ++var17) {
            if(this.aClass168Array11953[var17] != null) {
               if(this.def.aBool3346) {
                  this.aClass168Array11953[var17].method2020(-336535637 * this.anInt12197, 2028561821 * this.anInt12198, this.anInt12199 * 1089511811, this.anInt12196 * -2074753321);
               }

               if(var9) {
                  this.aClass168Array11953[var17].method1974(var4, (Class164)null, 0);
               } else {
                  this.aClass168Array11953[var17].method1974(var4, this.aClass164Array10829[var17], 0);
               }
            } else if(!var9) {
               this.aClass164Array10829[var17].aBool1784 = false;
            }
         }

         if(this.aClass614_11950 != null) {
            Class177 var18 = this.aClass614_11950.method7253();
            var1.method2516(var18);
         }

         for(var17 = 0; var17 < this.aClass168Array11953.length; ++var17) {
            if(this.aClass168Array11953[var17] != null) {
               this.aBool11913 |= this.aClass168Array11953[var17].method2014();
            }

            this.aClass168Array11953[var17] = null;
         }

         this.anInt11891 = client.anInt11126 * -1513030831;
         return var10;
      } else {
         return null;
      }
   }

   int method10811() {
      if(this.anInt12191 * -1168686761 != -1) {
         return this.anInt12191 * -1168686761;
      } else {
         if(null != this.def.morphisms) {
            NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            if(null != var1 && -1 != 1405403059 * var1.renderEmote) {
               return 1405403059 * var1.renderEmote;
            }
         }

         return this.def.renderEmote * 1405403059;
      }
   }

   public Class440 method198(int var1) {
      Class440 var2 = Class440.method5192();
      var2.method5160(Class443.method5200(604797385 * this.aClass34_11940.anInt370), 0.0F, 0.0F);
      return var2;
   }

   public boolean method9820(int var1) {
      return this.def.morphisms == null || this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117) != null;
   }

   public final boolean method10992(int var1) {
      return this.def != null;
   }

   final boolean method9850() {
      return false;
   }

   final void method9842(int var1) {
      throw new IllegalStateException();
   }

   public Class446 method185() {
      return Class446.method5312();
   }

   final void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method9847() {
      throw new IllegalStateException();
   }

   public int method10804() {
      return 828574411 * this.index + 1;
   }

   public Class550 method9840(Class174 var1) {
      return null;
   }

   public int method10813() {
      if(this.def.morphisms != null) {
         NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var1 != null && -1 != 245078561 * var1.armyIcon) {
            return 245078561 * var1.armyIcon;
         }
      }

      return 245078561 * this.def.armyIcon;
   }

   int method10770() {
      if(this.anInt12191 * -1168686761 != -1) {
         return this.anInt12191 * -1168686761;
      } else {
         if(null != this.def.morphisms) {
            NPCDef var1 = this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            if(null != var1 && -1 != 1405403059 * var1.renderEmote) {
               return 1405403059 * var1.renderEmote;
            }
         }

         return this.def.renderEmote * 1405403059;
      }
   }

   Class555 method9844(Class174 var1) {
      if(null != this.def && this.method10993(var1, 526336, -586986443)) {
         Class445 var2 = this.method7623();
         Class430 var3 = this.method7635();
         Class445 var4 = var1.method2319();
         int var5 = this.aClass34_11940.method817(609099254);
         Class552 var6 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][(int)var3.aClass446_4816.aFloat4917 >> 9][(int)var3.aClass446_4816.aFloat4919 >> 9];
         if(null != var6 && null != var6.aClass639_Sub1_Sub3_7355) {
            int var7 = -1438156659 * this.anInt11902 - var6.aClass639_Sub1_Sub3_7355.aShort11834;
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)var7 / 10.0F);
         } else {
            this.anInt11902 = -672986555 * (int)((float)(-1438156659 * this.anInt11902) - (float)(this.anInt11902 * -1438156659) / 10.0F);
         }

         var4.method5242(var2);
         var4.method5251(0.0F, (float)(-20 - -1438156659 * this.anInt11902), 0.0F);
         RenderDef var16 = this.method10786(-16777216);
         NPCDef var8 = null != this.def.morphisms?this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117):this.def;
         boolean var9 = null != var8.aClass437_3367;
         this.aBool11913 = false;
         Class555 var10 = null;
         if(Class230.preferences.aClass711_Sub3_10644.method9873(1381600623) == 1 && var8.animateIdle && var16.aBool7733) {
            Class704 var11 = this.aClass704_11915.method8218((byte)-45) && this.aClass704_11915.method8227((byte)-27)?this.aClass704_11915:null;
            Class704_Sub3 var12 = !this.aClass704_Sub3_11914.method8218((byte)-103) || this.aClass704_Sub3_11914.aBool10969 && var11 != null?null:this.aClass704_Sub3_11914;
            short var13 = Class331.aClass613_3498.aShort8042;
            byte var14 = Class331.aClass613_3498.aByte8060;
            if(this.def.aShort3348 > -1) {
               var13 = this.def.aShort3348;
               var14 = this.def.aByte3358;
            }

            Class168 var15;
            if(var13 > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
               var15 = Class193.method2808(var1, var5, 1194917821 * this.anInt11889, -1966848677 * this.anInt11900, this.anInt11901 * 361060487, this.aClass168Array11953[0], var13, var14, (Class704)(var12 != null?var12:var11), -1550703613);
            } else {
               var15 = Class178.method2666(var1, var5, 1194917821 * this.anInt11889, this.anInt11900 * -1966848677, 361060487 * this.anInt11901, 459047587 * this.def.boundSize, this.aClass168Array11953[0], this.def.aShort3353 & '\uffff', this.def.aShort3345 & '\uffff', this.def.aByte3299 & 255, this.def.aByte3347 & 255, (Class704)(var12 != null?var12:var11), 979838177);
            }

            if(var15 != null) {
               var10 = Class463.method5475(this.method10991((byte)-16), (short)19162);
               this.aBool11913 = true;
               var1.method2328(false);
               if(var9) {
                  var15.method1974(var4, (Class164)null, 0);
               } else {
                  if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length + 1) {
                     this.method9835(1 + this.aClass168Array11953.length, -1199666752);
                  }

                  var15.method1974(var4, this.aClass164Array10829[this.aClass168Array11953.length], 0);
               }

               var1.method2328(true);
            }
         }

         if(var9) {
            if(null == this.aClass164Array10829 || this.aClass164Array10829.length > 1) {
               this.method9835(1, -1614561580);
            }

            var1.method2303(var4, this.aClass164Array10829[0], var8.aClass437_3367);
         } else if(this.aClass164Array10829 == null || this.aClass164Array10829.length < this.aClass168Array11953.length) {
            this.method9835(this.aClass168Array11953.length, 2058010537);
         }

         if(var10 == null) {
            var10 = Class463.method5475(this.method10991((byte)-15), (short)26431);
         }

         this.method10776(var1, this.aClass168Array11953, var4, false, (byte)57);

         int var17;
         for(var17 = 0; var17 < this.aClass168Array11953.length; ++var17) {
            if(this.aClass168Array11953[var17] != null) {
               if(this.def.aBool3346) {
                  this.aClass168Array11953[var17].method2020(-336535637 * this.anInt12197, 2028561821 * this.anInt12198, this.anInt12199 * 1089511811, this.anInt12196 * -2074753321);
               }

               if(var9) {
                  this.aClass168Array11953[var17].method1974(var4, (Class164)null, 0);
               } else {
                  this.aClass168Array11953[var17].method1974(var4, this.aClass164Array10829[var17], 0);
               }
            } else if(!var9) {
               this.aClass164Array10829[var17].aBool1784 = false;
            }
         }

         if(this.aClass614_11950 != null) {
            Class177 var18 = this.aClass614_11950.method7253();
            var1.method2516(var18);
         }

         for(var17 = 0; var17 < this.aClass168Array11953.length; ++var17) {
            if(this.aClass168Array11953[var17] != null) {
               this.aBool11913 |= this.aClass168Array11953[var17].method2014();
            }

            this.aClass168Array11953[var17] = null;
         }

         this.anInt11891 = client.anInt11126 * -1513030831;
         return var10;
      } else {
         return null;
      }
   }

   void method9834(Class174 var1, int var2) {
      if(null != this.def) {
         if(this.aBool11930 || this.method10993(var1, 0, 339689705)) {
            Class445 var3 = var1.method2319();
            var3.method5242(this.method7623());
            var3.method5251(0.0F, -5.0F, 0.0F);
            this.method10776(var1, this.aClass168Array11953, var3, this.aBool11930, (byte)117);

            for(int var4 = 0; var4 < this.aClass168Array11953.length; ++var4) {
               this.aClass168Array11953[var4] = null;
            }

         }
      }
   }

   public Class541 method10809() {
      return this.aClass541_11903 != null && null == this.aClass541_11903.aString7228?null:this.aClass541_11903;
   }

   public int method10821() {
      return 828574411 * this.index + 1;
   }

   boolean method10993(Class174 var1, int var2, int var3) {
      int var4 = var2;
      RenderDef var5 = this.method10786(-16777216);
      Class704 var6 = this.aClass704_11915.method8218((byte)-3) && !this.aClass704_11915.method8227((byte)108)?this.aClass704_11915:null;
      Class704_Sub3 var7 = !this.aClass704_Sub3_11914.method8218((byte)-30) || this.aClass704_Sub3_11914.aBool10969 && var6 != null?null:this.aClass704_Sub3_11914;
      int var8 = var5.anInt7714 * -1579527151;
      int var9 = var5.anInt7725 * 1378869757;
      if(0 != var8 || 0 != var9 || -1326543223 * var5.anInt7727 != 0 || 359293787 * var5.anInt7730 != 0) {
         var2 |= 7;
      }

      boolean var10 = 0 != this.aByte11893 && client.anInt11012 >= -1334443687 * this.anInt11926 && client.anInt11012 < 2055682623 * this.anInt11933;
      if(var10) {
         var2 |= 524288;
      }

      boolean var11 = false;
      if(0 != this.anInt11917 * 1490342547) {
         NPCDef var12 = null != this.def.morphisms?this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117):this.def;
         if(null != var12 && client.anInt11012 < this.anInt11932 * 1114042433 + var12.anInt3344 * 1264100203) {
            this.anInt11917 = 1907694491 * (255 - 255 * (client.anInt11012 - 1114042433 * this.anInt11932) / (1264100203 * var12.anInt3344));
            var11 = true;
         } else {
            this.anInt11917 = 0;
         }
      }

      if(var11) {
         var2 |= 256;
      }

      int var14 = this.aClass34_11940.method817(136942577);
      Class168 var13 = this.aClass168Array11953[0] = this.def.method4059(var1, var2, Class227.aClass40_Sub16_2327, Class242.aClass94_2456, Class242.aClass94_2456, var6, var7, this.aClass704_Sub2_Sub1Array11916, this.anIntArray11898, var14, this.aClass294_12188, this.method10787((byte)-3), false, (byte)-54);
      if(null == var13) {
         return false;
      } else {
         this.anInt11892 = var13.method1981() * -839025111;
         this.anInt11918 = var13.method1985() * 1403769243;
         var13.method2063();
         this.method10783(var13, 2129134104);
         if(0 == var8 && 0 == var9) {
            this.method10801(var14, this.method10781(-627148024) << 9, this.method10781(-627148024) << 9, 0, 0, (byte)111);
         } else {
            this.method10801(var14, var8, var9, 699225925 * var5.anInt7726, var5.anInt7696 * 1863865935, (byte)7);
            if(1194917821 * this.anInt11889 != 0) {
               this.aClass168Array11953[0].method2076(this.anInt11889 * 1194917821);
            }

            if(0 != -1966848677 * this.anInt11900) {
               this.aClass168Array11953[0].method1954(this.anInt11900 * -1966848677);
            }

            if(this.anInt11901 * 361060487 != 0) {
               this.aClass168Array11953[0].method1955(0, 361060487 * this.anInt11901, 0);
            }
         }

         if(var10) {
            var13.method2020(this.aByte11928, this.aByte11929, this.aByte11899, this.aByte11893 & 255);
         }

         if(var11) {
            var13.method2028((byte)(this.anInt11917 * 1490342547), (byte[])null);
         }

         this.method10784(var1, var5, var4, var8, var9, var14, (byte)30);
         return true;
      }
   }

   int method9855() {
      return null == this.def?0:this.def.anInt3319 * -1434178745;
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      if(this.def == null) {
         return false;
      } else if(null != this.def.aClass437_3367) {
         return var1.method2301(var2, var3, this.method7623(), this.def.aClass437_3367, 300290381);
      } else if(!this.method10993(var1, 131072, -1016089897)) {
         return false;
      } else {
         Class445 var4 = this.method7623();
         boolean var5 = false;

         int var6;
         for(var6 = 0; var6 < this.aClass168Array11953.length; ++var6) {
            if(this.aClass168Array11953[var6] != null && this.aClass168Array11953[var6].aBool1909) {
               boolean var10000;
               label68: {
                  if(this.def.anInt3319 * -1434178745 <= 0) {
                     label67: {
                        if(-1 == this.def.anInt3314 * -2137930545) {
                           if(459047587 * this.def.boundSize == 1) {
                              break label67;
                           }
                        } else if(this.def.anInt3314 * -2137930545 == 1) {
                           break label67;
                        }

                        var10000 = false;
                        break label68;
                     }
                  }

                  var10000 = true;
               }

               boolean var7 = var10000;
               boolean var8 = this.aClass168Array11953[var6].method1975(var2, var3, var4, var7, this.def.anInt3319 * -1434178745);
               if(var8) {
                  var5 = true;
                  break;
               }
            }
         }

         for(var6 = 0; var6 < this.aClass168Array11953.length; ++var6) {
            this.aClass168Array11953[var6] = null;
         }

         return var5;
      }
   }

   public void method10994() {
      this.anInt11917 = 1130790757;
      this.anInt11932 = client.anInt11012 * -972218431;
   }

   public void method10995() {
      this.anInt11917 = 1130790757;
      this.anInt11932 = client.anInt11012 * -972218431;
   }

   public NPC(Class549 var1) {
      super(var1, Class201.aClass97_Sub1_Sub2_2210);
      this.method10982((byte)0);
   }

   void method10996() {
      this.anInt12197 = (32 + (int)(Math.random() * 4.0D)) * -741661949;
      this.anInt12198 = (3 + (int)(Math.random() * 2.0D)) * 919816373;
      this.anInt12199 = (16 + (int)(Math.random() * 3.0D)) * -1813220053;
      if(Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
         this.anInt12196 = (int)(Math.random() * 6.0D) * 830770407;
      } else {
         this.anInt12196 = (int)(Math.random() * 12.0D) * 830770407;
      }

   }

   boolean method10997(Class174 var1, int var2) {
      int var3 = var2;
      RenderDef var4 = this.method10786(-16777216);
      Class704 var5 = this.aClass704_11915.method8218((byte)-26) && !this.aClass704_11915.method8227((byte)67)?this.aClass704_11915:null;
      Class704_Sub3 var6 = !this.aClass704_Sub3_11914.method8218((byte)-58) || this.aClass704_Sub3_11914.aBool10969 && var5 != null?null:this.aClass704_Sub3_11914;
      int var7 = var4.anInt7714 * -1579527151;
      int var8 = var4.anInt7725 * 1378869757;
      if(0 != var7 || 0 != var8 || -1326543223 * var4.anInt7727 != 0 || 359293787 * var4.anInt7730 != 0) {
         var2 |= 7;
      }

      boolean var9 = 0 != this.aByte11893 && client.anInt11012 >= -1334443687 * this.anInt11926 && client.anInt11012 < 2055682623 * this.anInt11933;
      if(var9) {
         var2 |= 524288;
      }

      boolean var10 = false;
      if(0 != this.anInt11917 * 1490342547) {
         NPCDef var11 = null != this.def.morphisms?this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117):this.def;
         if(null != var11 && client.anInt11012 < this.anInt11932 * 1114042433 + var11.anInt3344 * 1264100203) {
            this.anInt11917 = 1907694491 * (255 - 255 * (client.anInt11012 - 1114042433 * this.anInt11932) / (1264100203 * var11.anInt3344));
            var10 = true;
         } else {
            this.anInt11917 = 0;
         }
      }

      if(var10) {
         var2 |= 256;
      }

      int var13 = this.aClass34_11940.method817(-1849017651);
      Class168 var12 = this.aClass168Array11953[0] = this.def.method4059(var1, var2, Class227.aClass40_Sub16_2327, Class242.aClass94_2456, Class242.aClass94_2456, var5, var6, this.aClass704_Sub2_Sub1Array11916, this.anIntArray11898, var13, this.aClass294_12188, this.method10787((byte)-43), false, (byte)-109);
      if(null == var12) {
         return false;
      } else {
         this.anInt11892 = var12.method1981() * -839025111;
         this.anInt11918 = var12.method1985() * 1403769243;
         var12.method2063();
         this.method10783(var12, 2129134104);
         if(0 == var7 && 0 == var8) {
            this.method10801(var13, this.method10781(-627148024) << 9, this.method10781(-627148024) << 9, 0, 0, (byte)44);
         } else {
            this.method10801(var13, var7, var8, 699225925 * var4.anInt7726, var4.anInt7696 * 1863865935, (byte)104);
            if(1194917821 * this.anInt11889 != 0) {
               this.aClass168Array11953[0].method2076(this.anInt11889 * 1194917821);
            }

            if(0 != -1966848677 * this.anInt11900) {
               this.aClass168Array11953[0].method1954(this.anInt11900 * -1966848677);
            }

            if(this.anInt11901 * 361060487 != 0) {
               this.aClass168Array11953[0].method1955(0, 361060487 * this.anInt11901, 0);
            }
         }

         if(var9) {
            var12.method2020(this.aByte11928, this.aByte11929, this.aByte11899, this.aByte11893 & 255);
         }

         if(var10) {
            var12.method2028((byte)(this.anInt11917 * 1490342547), (byte[])null);
         }

         this.method10784(var1, var4, var3, var7, var8, var13, (byte)-13);
         return true;
      }
   }

   final boolean method9851() {
      return false;
   }

   void method9848(Class174 var1) {
      if(null != this.def) {
         if(this.aBool11930 || this.method10993(var1, 0, -1379003935)) {
            Class445 var2 = var1.method2319();
            var2.method5242(this.method7623());
            var2.method5251(0.0F, -5.0F, 0.0F);
            this.method10776(var1, this.aClass168Array11953, var2, this.aBool11930, (byte)118);

            for(int var3 = 0; var3 < this.aClass168Array11953.length; ++var3) {
               this.aClass168Array11953[var3] = null;
            }

         }
      }
   }

   void method10998() {
      this.anInt12197 = (32 + (int)(Math.random() * 4.0D)) * -741661949;
      this.anInt12198 = (3 + (int)(Math.random() * 2.0D)) * 919816373;
      this.anInt12199 = (16 + (int)(Math.random() * 3.0D)) * -1813220053;
      if(Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
         this.anInt12196 = (int)(Math.random() * 6.0D) * 830770407;
      } else {
         this.anInt12196 = (int)(Math.random() * 12.0D) * 830770407;
      }

   }

   boolean method10999() {
      return this.aBool12200 || this.def.aBool3317;
   }

   int method9857() {
      return null == this.def?0:this.def.anInt3319 * -1434178745;
   }

   public Class526_Sub32 method186(int var1) {
      Class596 var2 = client.aClass505_11204.method6128(2112816609);
      return Class163.method1925(this.aByte10827, (int)this.method7635().aClass446_4816.aFloat4917 + -507706880 * var2.localX, -((int)this.method7635().aClass446_4816.aFloat4915), (int)this.method7635().aClass446_4816.aFloat4919 + var2.localY * 747559424, (byte)62);
   }

   public boolean method9831() {
      return this.def.morphisms == null || this.def.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117) != null;
   }

   public static final void method11000(byte var0) {
      Class111 var1 = Class452_Sub4.method9295((byte)118);
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4255, var1.aClass14_1342, -1758333396);
      var2.out.writeByte(0, 928891281);
      var1.write(var2, (byte)108);
   }
}
