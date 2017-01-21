package com.jagex;

import com.jagex.Class143;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class192;
import com.jagex.Class20;
import com.jagex.Class208;
import com.jagex.Class265;
import com.jagex.Class294;
import com.jagex.Class304;
import com.jagex.Class317;
import com.jagex.Class40_Sub16;
import com.jagex.Class437;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class452;
import com.jagex.Class466;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class561;
import com.jagex.RenderDef;
import com.jagex.Class592;
import com.jagex.Class592;
import com.jagex.Class676;
import com.jagex.MovementDirection;
import com.jagex.Class692;
import com.jagex.Class704;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.Interface19;
import java.util.Arrays;

public class NPCDef implements Interface12 {
   public static final int anInt3300 = 8;
   static final int anInt3302 = 6;
   public static final int anInt3351 = 1;
   public static final int anInt3352 = 2;
   public int[] models;
   public String name = "null";
   public int boundSize = 1265189131;
   short[] originalColours;
   public short[] replacementColours;
   short[] originalTextures;
   public short[] replacementTextures;
   byte[] recolourPalette;
   public int[] headModels;
   public byte[] aByteArray3341;
   public boolean drawMapdot = true;
   public byte[] aByteArray3366;
   public int combatLevel = 717243737;
   int scaleX = 1210845312;
   int scaleY = 578830208;
   public boolean aBool3329 = false;
   int ambience = 0;
   int anInt3338 = 0;
   public int contrast = -1493899296;
   int varbit = -641716999;
   public int[] headIconSprites = null;
   public short[] headIconSubSprites = null;
   int varp = -1862704965;
   public boolean aBool3317 = true;
   public boolean slowWalk = true;
   public int[] morphisms;
   public boolean animateIdle = true;
   public short aShort3353 = 0;
   public short aShort3345 = 0;
   public byte aByte3299 = -96;
   public byte aByte3347 = -16;
   public byte movementCapabilities = 0;
   int[][] translations;
   public int height = -722249395;
   public NPCDirection respawnDirection;
   public int renderEmote = -1457391483;
   public int anInt3313 = -812768201;
   public int anInt3354 = -2108060057;
   public int anInt3355 = -191791459;
   public int attackCursor = -1637677659;
   public int anInt3356 = 1437088833;
   public int armyIcon = 230266399;
   public int anInt3332 = 0;
   public int anInt3359 = -1771516031;
   public boolean aBool3331 = false;
   public int mapFunction;
   public boolean aBool3330 = false;
   byte aByte3318;
   byte aByte3370;
   byte aByte3320;
   byte aByte3316 = 0;
   public byte aByte3365;
   public int[] anIntArray3321;
   public int anInt3314;
   public int anInt3301;
   public int anInt3369;
   public int anInt3319;
   public int anInt3326 = 0;
   public boolean aBool3346;
   int[] cursorOps;
   public Class437 aClass437_3367;
   public int anInt3344;
   public short aShort3348 = -1;
   public byte aByte3358 = 0;
   public boolean hidePlayer;
   Class20 aClass20_3360;
   public static short[] aShortArray3337 = new short[256];
   public int anInt3304;
   Class304 aClass304_3305;
   Interface14 anInterface14_3303;
   public String[] actions;

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1986023660);
         if(0 == var3) {
            return;
         }

         this.method4046(var1, var3, (byte)0);
      }
   }

   void method4046(RSByteBuffer buffer, int opcode, byte var3) {
      int count;
      int index;
      if(opcode == 1) {
         count = buffer.readUnsignedByte(-1287166626);
         this.models = new int[count];

         for(index = 0; index < count; ++index) {
            this.models[index] = buffer.readBigSmart((byte)-18);
         }
      } else if(2 == opcode) {
         this.name = buffer.readString(-1383816903);
      } else if(opcode == 12) {
         this.boundSize = buffer.readUnsignedByte(-1512077065) * 1265189131;
      } else if(opcode >= 30 && opcode < 35) {
         this.actions[opcode - 30] = buffer.readString(-463219509);
      } else if(40 == opcode) {
         count = buffer.readUnsignedByte(1100689526);
         this.originalColours = new short[count];
         this.replacementColours = new short[count];

         for(index = 0; index < count; ++index) {
            this.originalColours[index] = (short)buffer.readUnsignedShort(1922864384);
            this.replacementColours[index] = (short)buffer.readUnsignedShort(1997471743);
         }
      } else if(opcode == 41) {
         count = buffer.readUnsignedByte(-1259976000);
         this.originalTextures = new short[count];
         this.replacementTextures = new short[count];

         for(index = 0; index < count; ++index) {
            this.originalTextures[index] = (short)buffer.readUnsignedShort(259299304);
            this.replacementTextures[index] = (short)buffer.readUnsignedShort(1048497784);
         }
      } else if(opcode == 42) {
         count = buffer.readUnsignedByte(575047212);
         this.recolourPalette = new byte[count];

         for(index = 0; index < count; ++index) {
            this.recolourPalette[index] = buffer.readByte((byte)14);
         }
      } else {
         int slot;
         int var7;
         byte var9;
         if(44 == opcode) {
            count = buffer.readUnsignedShort(1928943168);
            index = 0;

            for(slot = count; slot > 0; slot >>= 1) {
               ++index;
            }

            this.aByteArray3341 = new byte[index];
            var9 = 0;

            for(var7 = 0; var7 < index; ++var7) {
               if((count & 1 << var7) > 0) {
                  this.aByteArray3341[var7] = var9++;
               } else {
                  this.aByteArray3341[var7] = -1;
               }
            }
         } else if(45 == opcode) {
            count = buffer.readUnsignedShort(175031906);
            index = 0;

            for(slot = count; slot > 0; slot >>= 1) {
               ++index;
            }

            this.aByteArray3366 = new byte[index];
            var9 = 0;

            for(var7 = 0; var7 < index; ++var7) {
               if((count & 1 << var7) > 0) {
                  this.aByteArray3366[var7] = var9++;
               } else {
                  this.aByteArray3366[var7] = -1;
               }
            }
         } else if(opcode == 60) {
            count = buffer.readUnsignedByte(1636923044);
            this.headModels = new int[count];

            for(index = 0; index < count; ++index) {
               this.headModels[index] = buffer.readBigSmart((byte)99);
            }
         } else if(opcode == 93) {
            this.drawMapdot = false;
         } else if(opcode == 95) {
            this.combatLevel = buffer.readUnsignedShort(852502121) * -717243737;
         } else if(97 == opcode) {
            this.scaleX = buffer.readUnsignedShort(538403557) * 646993937;
         } else if(opcode == 98) {
            this.scaleY = buffer.readUnsignedShort(1270212435) * -62586753;
         } else if(opcode == 99) {
            this.aBool3329 = true;
         } else if(100 == opcode) {
            this.ambience = buffer.readByte((byte)122) * -167665889;
         } else if(opcode == 101) {
            this.anInt3338 = buffer.readByte((byte)36) * 39459101;
         } else if(102 == opcode) {
            count = buffer.readUnsignedByte(-1123042188);
            index = 0;

            for(slot = count; 0 != slot; slot >>= 1) {
               ++index;
            }

            this.headIconSprites = new int[index];
            this.headIconSubSprites = new short[index];

            for(var7 = 0; var7 < index; ++var7) {
               if((count & 1 << var7) == 0) {
                  this.headIconSprites[var7] = -1;
                  this.headIconSubSprites[var7] = -1;
               } else {
                  this.headIconSprites[var7] = buffer.readBigSmart((byte)-62);
                  this.headIconSubSprites[var7] = (short)buffer.readDecoratedSmart(1000906178);
               }
            }
         } else if(103 == opcode) {
            this.contrast = buffer.readUnsignedShort(1916218461) * 1966581567;
         } else if(106 != opcode && opcode != 118) {
            if(opcode == 107) {
               this.aBool3317 = false;
            } else if(109 == opcode) {
               this.slowWalk = false;
            } else if(111 == opcode) {
               this.animateIdle = false;
            } else if(113 == opcode) {
               this.aShort3353 = (short)buffer.readUnsignedShort(556724257);
               this.aShort3345 = (short)buffer.readUnsignedShort(1997207991);
            } else if(114 == opcode) {
               this.aByte3299 = buffer.readByte((byte)81);
               this.aByte3347 = buffer.readByte((byte)19);
            } else if(119 == opcode) {
               this.movementCapabilities = buffer.readByte((byte)54);
            } else if(opcode == 121) {
               this.translations = new int[this.models.length][];
               count = buffer.readUnsignedByte(2037045877);

               for(index = 0; index < count; ++index) {
                  slot = buffer.readUnsignedByte(-1152791878);
                  int[] translations = this.translations[slot] = new int[3];
                  translations[0] = buffer.readByte((byte)78);
                  translations[1] = buffer.readByte((byte)126);
                  translations[2] = buffer.readByte((byte)48);
               }
            } else if(123 == opcode) {
               this.height = buffer.readUnsignedShort(1745355650) * 722249395;
            } else if(125 == opcode) {
               this.respawnDirection = (NPCDirection)Class561.findIdentifiable(Class592.valuesOf(-1763260781), buffer.readByte((byte)85), (byte)-103);
            } else if(opcode == 127) {
               this.renderEmote = buffer.readUnsignedShort(168132374) * 1457391483;
            } else if(128 == opcode) {
               Class561.findIdentifiable(MovementDirection.method8035(2100716577), buffer.readUnsignedByte(1770117778), (byte)4);
            } else if(opcode == 134) {
               this.anInt3313 = buffer.readUnsignedShort(975519359) * 812768201;
               if(-1515639175 * this.anInt3313 == '\uffff') {
                  this.anInt3313 = -812768201;
               }

               this.anInt3354 = buffer.readUnsignedShort(451042753) * 2108060057;
               if('\uffff' == -803450199 * this.anInt3354) {
                  this.anInt3354 = -2108060057;
               }

               this.anInt3355 = buffer.readUnsignedShort(965807414) * 191791459;
               if(this.anInt3355 * 2040989771 == '\uffff') {
                  this.anInt3355 = -191791459;
               }

               this.anInt3356 = buffer.readUnsignedShort(1636691862) * -1437088833;
               if(this.anInt3356 * 163458111 == '\uffff') {
                  this.anInt3356 = 1437088833;
               }

               this.anInt3332 = buffer.readUnsignedByte(-589233093) * -1244121661;
            } else if(135 != opcode && 136 != opcode) {
               if(opcode == 137) {
                  this.attackCursor = buffer.readUnsignedShort(1571544355) * 1637677659;
               } else if(opcode == 138) {
                  this.armyIcon = buffer.readBigSmart((byte)-14) * -230266399;
               } else if(opcode == 140) {
                  this.anInt3359 = buffer.readUnsignedByte(148452503) * -1337544833;
               } else if(141 == opcode) {
                  this.aBool3331 = true;
               } else if(opcode == 142) {
                  this.mapFunction = buffer.readUnsignedShort(1012005791) * 1821656325;
               } else if(opcode == 143) {
                  this.aBool3330 = true;
               } else if(opcode >= 150 && opcode < 155) {
                  this.actions[opcode - 150] = buffer.readString(-125362906);
                  if(!this.aClass304_3305.aBool3274) {
                     this.actions[opcode - 150] = null;
                  }
               } else if(155 == opcode) {
                  this.aByte3318 = buffer.readByte((byte)44);
                  this.aByte3370 = buffer.readByte((byte)22);
                  this.aByte3320 = buffer.readByte((byte)114);
                  this.aByte3316 = buffer.readByte((byte)25);
               } else if(opcode == 158) {
                  this.aByte3365 = 1;
               } else if(opcode == 159) {
                  this.aByte3365 = 0;
               } else if(opcode == 160) {
                  count = buffer.readUnsignedByte(1049837155);
                  this.anIntArray3321 = new int[count];

                  for(index = 0; index < count; ++index) {
                     this.anIntArray3321[index] = buffer.readUnsignedShort(512627013);
                  }
               } else if(162 != opcode) {
                  if(opcode == 163) {
                     this.anInt3314 = buffer.readUnsignedByte(2021411147) * -429342161;
                  } else if(164 == opcode) {
                     this.anInt3301 = buffer.readUnsignedShort(932392576) * 1070155543;
                     this.anInt3369 = buffer.readUnsignedShort(648826301) * -454916931;
                  } else if(opcode == 165) {
                     this.anInt3319 = buffer.readUnsignedByte(293337016) * 1094585975;
                  } else if(168 == opcode) {
                     this.anInt3326 = buffer.readUnsignedByte(1065729838) * 434247997;
                  } else if(169 == opcode) {
                     this.aBool3346 = false;
                  } else if(opcode >= 170 && opcode < 176) {
                     if(null == this.cursorOps) {
                        this.cursorOps = new int[6];
                        Arrays.fill(this.cursorOps, -1);
                     }

                     count = buffer.readUnsignedShort(816325629);
                     if(count == '\uffff') {
                        count = -1;
                     }

                     this.cursorOps[opcode - 170] = count;
                  } else if(178 != opcode) {
                     if(opcode == 179) {
                        this.aClass437_3367 = new Class437();
                        this.aClass437_3367.aFloat4856 = (float)buffer.readUnsignedSmart(1611462020);
                        this.aClass437_3367.aFloat4858 = (float)buffer.readUnsignedSmart(909039371);
                        this.aClass437_3367.aFloat4852 = (float)buffer.readUnsignedSmart(63444858);
                        this.aClass437_3367.aFloat4853 = (float)buffer.readUnsignedSmart(829733590);
                        this.aClass437_3367.aFloat4854 = (float)buffer.readUnsignedSmart(1060066455);
                        this.aClass437_3367.aFloat4855 = (float)buffer.readUnsignedSmart(1758644121);
                     } else if(180 == opcode) {
                        this.anInt3344 = (buffer.readUnsignedByte(-962868852) & 255) * -591302333;
                     } else if(opcode == 181) {
                        this.aShort3348 = (short)buffer.readUnsignedShort(1886552973);
                        this.aByte3358 = (byte)buffer.readUnsignedByte(431595266);
                     } else if(182 == opcode) {
                        this.hidePlayer = true;
                     } else if(249 == opcode) {
                        count = buffer.readUnsignedByte(-1222127493);
                        if(this.aClass20_3360 == null) {
                           index = Class692.method8110(count, 952390862);
                           this.aClass20_3360 = new Class20(index);
                        }

                        for(index = 0; index < count; ++index) {
                           boolean var11 = buffer.readUnsignedByte(1919202047) == 1;
                           var7 = buffer.read24BitInt(742041327);
                           Object var8;
                           if(var11) {
                              var8 = new LinkableObject(buffer.readString(611858634));
                           } else {
                              var8 = new Class526_Sub25(buffer.readInt((byte)5));
                           }

                           this.aClass20_3360.put((Class526)var8, (long)var7);
                        }
                     }
                  }
               }
            } else {
               buffer.readUnsignedByte(-2130379387);
               buffer.readUnsignedShort(1463554564);
            }
         } else {
            this.varbit = buffer.readUnsignedShort(450689028) * 641716999;
            if('\uffff' == this.varbit * -856216905) {
               this.varbit = -641716999;
            }

            this.varp = buffer.readUnsignedShort(915372834) * 1862704965;
            if('\uffff' == 909515661 * this.varp) {
               this.varp = -1862704965;
            }

            count = -1;
            if(118 == opcode) {
               count = buffer.readUnsignedShort(1128933745);
               if(count == '\uffff') {
                  count = -1;
               }
            }

            index = buffer.readUnsignedByte(-765733285);
            this.morphisms = new int[index + 2];

            for(slot = 0; slot <= index; ++slot) {
               this.morphisms[slot] = buffer.readUnsignedShort(565551041);
               if('\uffff' == this.morphisms[slot]) {
                  this.morphisms[slot] = -1;
               }
            }

            this.morphisms[index + 1] = count;
         }
      }

   }

   public void method81(int var1) {
      if(this.models == null) {
         this.models = new int[0];
      }

      if(this.aByte3365 == -1) {
         if(this.aClass304_3305 != null && Class676.aClass676_8589 != this.aClass304_3305.aClass676_3277) {
            this.aByte3365 = 0;
         } else {
            this.aByte3365 = 1;
         }
      }

   }

   public final Class168 method4047(Class174 var1, int var2, Class40_Sub16 var3, Interface17 var4, Interface19 var5, Class704 var6, Class704 var7, Class704[] var8, int[] var9, int var10, Class294 var11, int var12) {
      return this.method4059(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, this.renderEmote * 1405403059, true, (byte)-8);
   }

   public int method4048(int var1, int var2) {
      if(this.aClass20_3360 == null) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_3360.get((long)var1);
         return null == var3?var2:var3.anInt10550 * -1044108751;
      }
   }

   public final NPCDef method4049(Interface17 var1, Interface19 var2, int var3) {
      int var4 = -1;
      if(-856216905 * this.varbit != -1) {
         Class317 var5 = var1.method109(-856216905 * this.varbit, '\uff00');
         if(var5 != null) {
            var4 = var2.method116(var5, (byte)-83);
         }
      } else if(-1 != 909515661 * this.varp) {
         Class143 var6 = var1.method106(Class452.aClass452_4946, this.varp * 909515661, -1856712554);
         if(null != var6) {
            var4 = var2.method114(var6, -1676760071);
         }
      }

      if(var4 >= 0 && var4 < this.morphisms.length - 1) {
         return this.morphisms[var4] == -1?null:(NPCDef)this.anInterface14_3303.method89(this.morphisms[var4], -587640965);
      } else {
         int var7 = this.morphisms[this.morphisms.length - 1];
         return var7 != -1?(NPCDef)this.anInterface14_3303.method89(var7, -396916846):null;
      }
   }

   public final boolean method4050(byte var1) {
      if(null == this.models) {
         return true;
      } else {
         boolean var2 = true;
         int[] var3 = this.models;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var3[var4];
            if(!this.aClass304_3305.aClass466_3275.method5530(var5, 0, 2057515289)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public int method4051(int var1, int var2, byte var3) {
      if(this.aClass20_3360 == null) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_3360.get((long)var1);
         return null == var4?var2:var4.anInt10550 * -1044108751;
      }
   }

   public String method4052(int var1, String var2, int var3) {
      if(null == this.aClass20_3360) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_3360.get((long)var1);
         return null == var4?var2:(String)var4.anObject10399;
      }
   }

   public int method4053(int var1, int var2) {
      return this.cursorOps == null?-1:this.cursorOps[var1];
   }

   public boolean method4054(Interface17 var1, Interface19 var2, int var3) {
      if(null == this.morphisms) {
         return true;
      } else {
         int var4 = -1;
         if(this.varbit * -856216905 != -1) {
            Class317 var5 = var1.method109(-856216905 * this.varbit, '\uff00');
            if(var5 != null) {
               var4 = var2.method116(var5, (byte)-7);
            }
         } else if(-1 != 909515661 * this.varp) {
            Class143 var6 = var1.method106(Class452.aClass452_4946, 909515661 * this.varp, 1995539927);
            if(null != var6) {
               var4 = var2.method114(var6, -1286404830);
            }
         }

         if(var4 >= 0 && var4 < this.morphisms.length - 1) {
            return this.morphisms[var4] != -1;
         } else {
            int var7 = this.morphisms[this.morphisms.length - 1];
            return -1 != var7;
         }
      }
   }

   public boolean method4055(int var1) {
      if(this.morphisms == null) {
         return -1 != this.anInt3313 * -1515639175 || -1 != 2040989771 * this.anInt3355 || this.anInt3356 * 163458111 != -1;
      } else {
         for(int var2 = 0; var2 < this.morphisms.length; ++var2) {
            if(this.morphisms[var2] != -1) {
               NPCDef var3 = (NPCDef)this.anInterface14_3303.method89(this.morphisms[var2], 307752553);
               if(-1 != -1515639175 * var3.anInt3313 || -1 != 2040989771 * var3.anInt3355 || -1 != 163458111 * var3.anInt3356) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(878394817);
         if(0 == var2) {
            return;
         }

         this.method4046(var1, var2, (byte)0);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1669298840);
         if(0 == var2) {
            return;
         }

         this.method4046(var1, var2, (byte)0);
      }
   }

   public void method85() {
      if(this.models == null) {
         this.models = new int[0];
      }

      if(this.aByte3365 == -1) {
         if(this.aClass304_3305 != null && Class676.aClass676_8589 != this.aClass304_3305.aClass676_3277) {
            this.aByte3365 = 0;
         } else {
            this.aByte3365 = 1;
         }
      }

   }

   public boolean method4057() {
      if(this.morphisms == null) {
         return -1 != this.anInt3313 * -1515639175 || -1 != 2040989771 * this.anInt3355 || this.anInt3356 * 163458111 != -1;
      } else {
         for(int var1 = 0; var1 < this.morphisms.length; ++var1) {
            if(this.morphisms[var1] != -1) {
               NPCDef var2 = (NPCDef)this.anInterface14_3303.method89(this.morphisms[var1], 182137137);
               if(-1 != -1515639175 * var2.anInt3313 || -1 != 2040989771 * var2.anInt3355 || -1 != 163458111 * var2.anInt3356) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public String method4058(int var1, String var2) {
      if(null == this.aClass20_3360) {
         return var2;
      } else {
         LinkableObject var3 = (LinkableObject)this.aClass20_3360.get((long)var1);
         return null == var3?var2:(String)var3.anObject10399;
      }
   }

   public final Class168 method4059(Class174 var1, int var2, Class40_Sub16 var3, Interface17 var4, Interface19 var5, Class704 var6, Class704 var7, Class704[] var8, int[] var9, int var10, Class294 var11, int var12, boolean var13, byte var14) {
      if(null != this.morphisms) {
         NPCDef var40 = this.method4049(var4, var5, 182793117);
         return var40 == null?null:var40.method4059(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)-71);
      } else {
         int var15 = var2;
         if(-291848321 * this.scaleY != 128) {
            var15 = var2 | 2;
         }

         if(128 != 1000577265 * this.scaleX) {
            var15 |= 5;
         }

         boolean var16 = false;
         int var17 = var8 != null?var8.length:0;

         for(int var18 = 0; var18 < var17; ++var18) {
            if(var8[var18] != null) {
               var15 |= var8[var18].method8221((byte)122);
               var16 = true;
            }
         }

         if(null != var6) {
            var15 |= var6.method8221((byte)53);
            var16 = true;
         }

         if(null != var7) {
            var15 |= var7.method8221((byte)81);
            var16 = true;
         }

         long var19 = (long)(this.anInt3304 * 430699907 | var1.anInt2030 * -316183255 << 16);
         if(null != var11) {
            var19 |= 4636214709193697903L * var11.aLong3183 << 24;
         }

         Class192 var21 = this.aClass304_3305.aClass192_3276;
         Class168 var22;
         synchronized(var21) {
            var22 = (Class168)this.aClass304_3305.aClass192_3276.method2765(var19);
         }

         RenderDef var41 = null;
         if(!var13 && var12 != -1) {
            var41 = (RenderDef)var3.method89(var12, -88122628);
         } else if(-1 != this.renderEmote * 1405403059) {
            var41 = (RenderDef)var3.method89(this.renderEmote * 1405403059, 50151050);
         }

         int var27;
         if(var22 == null || (var22.method2101() & var15) != var15) {
            if(var22 != null) {
               var15 |= var22.method2101();
            }

            int var23 = var15;
            if(this.originalColours != null) {
               var23 = var15 | 16384;
            }

            if(null != this.originalTextures) {
               var23 |= '\u8000';
            }

            if(this.aByte3316 != 0) {
               var23 |= 524288;
            }

            int[] var24 = var11 != null && null != var11.anIntArray3185?var11.anIntArray3185:this.models;
            boolean var25 = false;
            Class466 var26 = this.aClass304_3305.aClass466_3275;
            synchronized(var26) {
               for(var27 = 0; var27 < var24.length; ++var27) {
                  if(var24[var27] != -1 && !this.aClass304_3305.aClass466_3275.method5530(var24[var27], 0, 2007531411)) {
                     var25 = true;
                  }
               }
            }

            if(var25) {
               return null;
            }

            Class170[] var48 = new Class170[var24.length];

            int var28;
            for(var28 = 0; var28 < var24.length; ++var28) {
               if(-1 != var24[var28]) {
                  Class466 var29 = this.aClass304_3305.aClass466_3275;
                  synchronized(var29) {
                     var48[var28] = Class170.method2146(this.aClass304_3305.aClass466_3275, var24[var28], 0);
                  }

                  if(var48[var28] != null) {
                     if(var48[var28].anInt1942 < 13) {
                        var48[var28].method2148(2);
                     }

                     if(null != this.translations && this.translations[var28] != null) {
                        var48[var28].method2129(this.translations[var28][0], this.translations[var28][1], this.translations[var28][2]);
                     }
                  }
               }
            }

            if(var11 != null) {
               for(var28 = 0; var28 < var48.length; ++var28) {
                  if(var48[var28] != null) {
                     if(null != var11.aFloatArray3187 && 0.0F != var11.aFloatArray3187[var28]) {
                        var48[var28].method2147(var11.aFloatArray3187[var28]);
                     }

                     if(null != var11.anIntArrayArray3184) {
                        var48[var28].method2140(var11.anIntArrayArray3184[var28][0], var11.anIntArrayArray3184[var28][1], var11.anIntArrayArray3184[var28][2]);
                     }

                     if(null != var11.anIntArrayArray3181) {
                        var48[var28].method2129(var11.anIntArrayArray3181[var28][0], var11.anIntArrayArray3181[var28][1], var11.anIntArrayArray3181[var28][2]);
                     }
                  }
               }
            }

            int var49;
            if(null != var41 && var41.anIntArrayArray7704 != null) {
               for(var28 = 0; var28 < var41.anIntArrayArray7704.length; ++var28) {
                  if(var28 < var48.length && var48[var28] != null) {
                     var49 = 0;
                     int var30 = 0;
                     int var31 = 0;
                     int var32 = 0;
                     int var33 = 0;
                     int var34 = 0;
                     if(var41.anIntArrayArray7704[var28] != null) {
                        var49 = var41.anIntArrayArray7704[var28][0];
                        var30 = var41.anIntArrayArray7704[var28][1];
                        var31 = var41.anIntArrayArray7704[var28][2];
                        var32 = var41.anIntArrayArray7704[var28][3] << 3;
                        var33 = var41.anIntArrayArray7704[var28][4] << 3;
                        var34 = var41.anIntArrayArray7704[var28][5] << 3;
                     }

                     if(0 != var32 || var33 != 0 || 0 != var34) {
                        var48[var28].method2140(var32, var33, var34);
                     }

                     if(var49 != 0 || var30 != 0 || var31 != 0) {
                        var48[var28].method2129(var49, var30, var31);
                     }
                  }
               }
            }

            Class170 var46;
            if(1 == var48.length) {
               var46 = var48[0];
            } else {
               var46 = new Class170(var48, var48.length);
            }

            var22 = var1.method2321(var46, var23, -271538315 * this.aClass304_3305.anInt3273, this.ambience * -437183265 + 64, 850 + -765643255 * this.anInt3338);
            short[] var50;
            if(this.originalColours != null) {
               if(null != var11 && var11.aShortArray3186 != null) {
                  var50 = var11.aShortArray3186;
               } else {
                  var50 = this.replacementColours;
               }

               for(var49 = 0; var49 < this.originalColours.length; ++var49) {
                  if(null != this.recolourPalette && var49 < this.recolourPalette.length) {
                     var22.method1940(this.originalColours[var49], aShortArray3337[this.recolourPalette[var49] & 255]);
                  } else {
                     var22.method1940(this.originalColours[var49], var50[var49]);
                  }
               }
            }

            if(null != this.originalTextures) {
               if(var11 != null && null != var11.aShortArray3182) {
                  var50 = var11.aShortArray3182;
               } else {
                  var50 = this.replacementTextures;
               }

               for(var49 = 0; var49 < this.originalTextures.length; ++var49) {
                  var22.method1992(this.originalTextures[var49], var50[var49]);
               }
            }

            if(0 != this.aByte3316) {
               var22.method2020(this.aByte3318, this.aByte3370, this.aByte3320, this.aByte3316 & 255);
            }

            var22.method1986();
            var22.method2110(var15);
            Class192 var51 = this.aClass304_3305.aClass192_3276;
            synchronized(var51) {
               this.aClass304_3305.aClass192_3276.method2768(var22, var19);
            }
         }

         Class168 var43 = var22.method1947((byte)4, var15, true);
         boolean var42 = false;
         if(var9 != null) {
            for(int var44 = 0; var44 < 12; ++var44) {
               if(var9[var44] != -1) {
                  var42 = true;
               }
            }
         }

         if(!var16 && !var42) {
            return var43;
         } else {
            Class445[] var45 = null;
            if(var41 != null) {
               var45 = var41.method6922(1939621524);
            }

            int var47;
            if(var42 && null != var45) {
               for(var47 = 0; var47 < 12; ++var47) {
                  if(var45[var47] != null) {
                     var43.method1948(var45[var47], 1 << var47, true);
                  }
               }
            }

            var47 = 0;

            for(var27 = 1; var47 < var17; var27 <<= 1) {
               if(null != var8[var47]) {
                  var8[var47].method8248(var43, 0, var27, -1007094370);
               }

               ++var47;
            }

            if(var42) {
               for(var47 = 0; var47 < 12; ++var47) {
                  if(-1 != var9[var47]) {
                     var27 = var9[var47] - var10;
                     var27 &= 16383;
                     Class445 var52 = new Class445();
                     var52.method5225(0.0F, 1.0F, 0.0F, Class443.method5200(var27));
                     var43.method1948(var52, 1 << var47, false);
                  }
               }
            }

            if(var42 && var45 != null) {
               for(var47 = 0; var47 < 12; ++var47) {
                  if(var45[var47] != null) {
                     var43.method1948(var45[var47], 1 << var47, false);
                  }
               }
            }

            if(null != var6 && var7 != null) {
               Class208.method2931(var43, var6, var7, -739794749);
            } else if(null != var6) {
               var6.method8231(var43, 0, 644550902);
            } else if(var7 != null) {
               var7.method8231(var43, 0, -231771631);
            }

            if(1000577265 * this.scaleX != 128 || 128 != -291848321 * this.scaleY) {
               var43.method1957(1000577265 * this.scaleX, this.scaleY * -291848321, 1000577265 * this.scaleX);
            }

            var43.method2110(var2);
            return var43;
         }
      }
   }

   NPCDef(int var1, Class304 var2, Interface14 var3) {
      this.respawnDirection = NPCDirection.NORTH_EAST;
      this.mapFunction = -1821656325;
      this.aByte3365 = -1;
      this.anInt3314 = 429342161;
      this.anInt3301 = -918087936;
      this.anInt3369 = -494617344;
      this.anInt3319 = 0;
      this.aBool3346 = true;
      this.anInt3344 = 0;
      this.hidePlayer = false;
      this.anInt3304 = var1 * -1962753749;
      this.aClass304_3305 = var2;
      this.anInterface14_3303 = var3;
      this.actions = (String[])((String[])this.aClass304_3305.aStringArray3279.clone());
   }

   public boolean method4060() {
      if(this.morphisms == null) {
         return -1 != this.anInt3313 * -1515639175 || -1 != 2040989771 * this.anInt3355 || this.anInt3356 * 163458111 != -1;
      } else {
         for(int var1 = 0; var1 < this.morphisms.length; ++var1) {
            if(this.morphisms[var1] != -1) {
               NPCDef var2 = (NPCDef)this.anInterface14_3303.method89(this.morphisms[var1], -317411940);
               if(-1 != -1515639175 * var2.anInt3313 || -1 != 2040989771 * var2.anInt3355 || -1 != 163458111 * var2.anInt3356) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final Class168 method4061(Class174 var1, int var2, Interface17 var3, Interface19 var4, Class704 var5, Class294 var6, byte var7) {
      if(null != this.morphisms) {
         NPCDef var24 = this.method4049(var3, var4, 182793117);
         return var24 == null?null:var24.method4061(var1, var2, var3, var4, var5, var6, (byte)124);
      } else if(null != this.headModels || var6 != null && null != var6.anIntArray3185) {
         int var8 = var2;
         if(var5 != null) {
            var8 = var2 | var5.method8221((byte)31);
         }

         long var9 = (long)(430699907 * this.anInt3304 | -316183255 * var1.anInt2030 << 16);
         if(null != var6) {
            var9 |= 4636214709193697903L * var6.aLong3183 << 24;
         }

         Class192 var11 = this.aClass304_3305.aClass192_3278;
         Class168 var12;
         synchronized(var11) {
            var12 = (Class168)this.aClass304_3305.aClass192_3278.method2765(var9);
         }

         if(var12 == null || (var12.method2101() & var8) != var8) {
            if(null != var12) {
               var8 |= var12.method2101();
            }

            int var25 = var8;
            if(null != this.originalColours) {
               var25 = var8 | 16384;
            }

            if(this.originalTextures != null) {
               var25 |= '\u8000';
            }

            if(this.aByte3316 != 0) {
               var25 |= 524288;
            }

            int[] var13 = var6 != null && var6.anIntArray3185 != null?var6.anIntArray3185:this.headModels;
            boolean var14 = false;
            Class466 var15 = this.aClass304_3305.aClass466_3275;
            int var16;
            synchronized(var15) {
               for(var16 = 0; var16 < var13.length; ++var16) {
                  if(!this.aClass304_3305.aClass466_3275.method5530(var13[var16], 0, 2111749494)) {
                     var14 = true;
                  }
               }
            }

            if(var14) {
               return null;
            }

            Class170[] var26 = new Class170[var13.length];
            Class466 var27 = this.aClass304_3305.aClass466_3275;
            synchronized(var27) {
               int var17 = 0;

               while(true) {
                  if(var17 >= var13.length) {
                     break;
                  }

                  var26[var17] = Class170.method2146(this.aClass304_3305.aClass466_3275, var13[var17], 0);
                  ++var17;
               }
            }

            for(var16 = 0; var16 < var13.length; ++var16) {
               if(var26[var16] != null && var26[var16].anInt1942 < 13) {
                  var26[var16].method2148(2);
               }
            }

            Class170 var28;
            if(var26.length == 1) {
               var28 = var26[0];
            } else {
               var28 = new Class170(var26, var26.length);
            }

            var12 = var1.method2321(var28, var25, this.aClass304_3305.anInt3273 * -271538315, 64, 768);
            int var18;
            short[] var29;
            if(this.originalColours != null) {
               if(null != var6 && var6.aShortArray3186 != null) {
                  var29 = var6.aShortArray3186;
               } else {
                  var29 = this.replacementColours;
               }

               for(var18 = 0; var18 < this.originalColours.length; ++var18) {
                  if(this.recolourPalette != null && var18 < this.recolourPalette.length) {
                     var12.method1940(this.originalColours[var18], aShortArray3337[this.recolourPalette[var18] & 255]);
                  } else {
                     var12.method1940(this.originalColours[var18], var29[var18]);
                  }
               }
            }

            if(null != this.originalTextures) {
               if(null != var6 && var6.aShortArray3182 != null) {
                  var29 = var6.aShortArray3182;
               } else {
                  var29 = this.replacementTextures;
               }

               for(var18 = 0; var18 < this.originalTextures.length; ++var18) {
                  var12.method1992(this.originalTextures[var18], var29[var18]);
               }
            }

            if(0 != this.aByte3316) {
               var12.method2020(this.aByte3318, this.aByte3370, this.aByte3320, this.aByte3316 & 255);
            }

            var12.method2110(var8);
            Class192 var30 = this.aClass304_3305.aClass192_3278;
            synchronized(var30) {
               this.aClass304_3305.aClass192_3278.method2768(var12, var9);
            }
         }

         if(var5 != null) {
            var12 = var12.method1947((byte)1, var8, true);
            var5.method8231(var12, 0, -161165251);
         }

         var12.method2110(var2);
         return var12;
      } else {
         return null;
      }
   }

   public boolean method4062() {
      if(this.morphisms == null) {
         return -1 != this.anInt3313 * -1515639175 || -1 != 2040989771 * this.anInt3355 || this.anInt3356 * 163458111 != -1;
      } else {
         for(int var1 = 0; var1 < this.morphisms.length; ++var1) {
            if(this.morphisms[var1] != -1) {
               NPCDef var2 = (NPCDef)this.anInterface14_3303.method89(this.morphisms[var1], -118673396);
               if(-1 != -1515639175 * var2.anInt3313 || -1 != 2040989771 * var2.anInt3355 || -1 != 163458111 * var2.anInt3356) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public int method4063(int var1) {
      return this.cursorOps == null?-1:this.cursorOps[var1];
   }

   public static int method4064(CharSequence var0, byte var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if(var5 <= 127) {
            ++var3;
         } else if(var5 <= 2047) {
            var3 += 2;
         } else {
            var3 += 3;
         }
      }

      return var3;
   }

   static void method4065(int var0) {
      Class526_Sub21_Sub9 var1 = Class265.method3560(14, 0L);
      var1.method10583((byte)-115);
   }
}
