package com.jagex;

import com.jagex.Class170;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class265;
import com.jagex.IncomingFrame;
import com.jagex.Class466;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class602;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface12;

public class Class326 implements Interface12 {
   int[] anIntArray3479;
   short[] aShortArray3478;
   short[] aShortArray3477;
   short[] aShortArray3480;
   short[] aShortArray3476;
   byte[] aByteArray3482;
   byte[] aByteArray3483;
   public static int[] anIntArray3485 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   public static int[] anIntArray3486 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   int[] anIntArray3484 = new int[]{-1, -1, -1, -1, -1};
   Class466 aClass466_3481;

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(1969225995);
         if(var3 == 0) {
            return;
         }

         this.method4184(var1, var3, -801788100);
      }
   }

   public boolean method4183(int var1) {
      boolean var2 = true;
      Class466 var3 = this.aClass466_3481;
      synchronized(var3) {
         for(int var4 = 0; var4 < 5; ++var4) {
            if(this.anIntArray3484[var4] != -1 && !this.aClass466_3481.method5530(this.anIntArray3484[var4], 0, 1446840226)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   void method4184(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         var1.readUnsignedByte(-730295845);
      } else {
         int var4;
         int var5;
         if(2 == var2) {
            var4 = var1.readUnsignedByte(-42082311);
            this.anIntArray3479 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray3479[var5] = var1.readBigSmart((byte)-112);
            }
         } else if(var2 != 3) {
            if(var2 == 40) {
               var4 = var1.readUnsignedByte(666941479);
               this.aShortArray3478 = new short[var4];
               this.aShortArray3477 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.aShortArray3478[var5] = (short)var1.readUnsignedShort(271127571);
                  this.aShortArray3477[var5] = (short)var1.readUnsignedShort(93329305);
               }
            } else if(41 == var2) {
               var4 = var1.readUnsignedByte(89940290);
               this.aShortArray3480 = new short[var4];
               this.aShortArray3476 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.aShortArray3480[var5] = (short)var1.readUnsignedShort(871136989);
                  this.aShortArray3476[var5] = (short)var1.readUnsignedShort(549666971);
               }
            } else {
               int var6;
               int var7;
               byte var8;
               if(var2 == 44) {
                  var4 = var1.readUnsignedShort(271951058);
                  var5 = 0;

                  for(var6 = var4; var6 > 0; var6 >>= 1) {
                     ++var5;
                  }

                  this.aByteArray3482 = new byte[var5];
                  var8 = 0;

                  for(var7 = 0; var7 < var5; ++var7) {
                     if((var4 & 1 << var7) > 0) {
                        this.aByteArray3482[var7] = var8++;
                     } else {
                        this.aByteArray3482[var7] = -1;
                     }
                  }
               } else if(var2 == 45) {
                  var4 = var1.readUnsignedShort(979868353);
                  var5 = 0;

                  for(var6 = var4; var6 > 0; var6 >>= 1) {
                     ++var5;
                  }

                  this.aByteArray3483 = new byte[var5];
                  var8 = 0;

                  for(var7 = 0; var7 < var5; ++var7) {
                     if((var4 & 1 << var7) > 0) {
                        this.aByteArray3483[var7] = var8++;
                     } else {
                        this.aByteArray3483[var7] = -1;
                     }
                  }
               } else if(var2 >= 60 && var2 < 70) {
                  this.anIntArray3484[var2 - 60] = var1.readBigSmart((byte)66);
               }
            }
         }
      }

   }

   public void method81(int var1) {
   }

   public Class170 method4185(int var1) {
      if(null == this.anIntArray3479) {
         return null;
      } else {
         Class170[] var2 = new Class170[this.anIntArray3479.length];
         Class466 var3 = this.aClass466_3481;
         int var4;
         synchronized(var3) {
            var4 = 0;

            while(true) {
               if(var4 >= this.anIntArray3479.length) {
                  break;
               }

               var2[var4] = Class170.method2146(this.aClass466_3481, this.anIntArray3479[var4], 0);
               ++var4;
            }
         }

         for(int var7 = 0; var7 < this.anIntArray3479.length; ++var7) {
            if(var2[var7].anInt1942 < 13) {
               var2[var7].method2148(2);
            }
         }

         Class170 var8;
         if(1 == var2.length) {
            var8 = var2[0];
         } else {
            var8 = new Class170(var2, var2.length);
         }

         if(var8 == null) {
            return null;
         } else {
            if(null != this.aShortArray3478) {
               for(var4 = 0; var4 < this.aShortArray3478.length; ++var4) {
                  var8.method2138(this.aShortArray3478[var4], this.aShortArray3477[var4]);
               }
            }

            if(this.aShortArray3480 != null) {
               for(var4 = 0; var4 < this.aShortArray3480.length; ++var4) {
                  var8.method2139(this.aShortArray3480[var4], this.aShortArray3476[var4]);
               }
            }

            return var8;
         }
      }
   }

   public Class170 method4186(int var1) {
      Class170[] var2 = new Class170[5];
      int var3 = 0;
      Class466 var4 = this.aClass466_3481;
      int var5;
      synchronized(var4) {
         var5 = 0;

         while(true) {
            if(var5 >= 5) {
               break;
            }

            if(this.anIntArray3484[var5] != -1) {
               var2[var3++] = Class170.method2146(this.aClass466_3481, this.anIntArray3484[var5], 0);
            }

            ++var5;
         }
      }

      for(int var8 = 0; var8 < 5; ++var8) {
         if(var2[var8] != null && var2[var8].anInt1942 < 13) {
            var2[var8].method2148(2);
         }
      }

      Class170 var9 = new Class170(var2, var3);
      if(null != this.aShortArray3478) {
         for(var5 = 0; var5 < this.aShortArray3478.length; ++var5) {
            var9.method2138(this.aShortArray3478[var5], this.aShortArray3477[var5]);
         }
      }

      if(this.aShortArray3480 != null) {
         for(var5 = 0; var5 < this.aShortArray3480.length; ++var5) {
            var9.method2139(this.aShortArray3480[var5], this.aShortArray3476[var5]);
         }
      }

      return var9;
   }

   public boolean method4187(short var1) {
      if(this.anIntArray3479 == null) {
         return true;
      } else {
         boolean var2 = true;
         Class466 var3 = this.aClass466_3481;
         synchronized(var3) {
            for(int var4 = 0; var4 < this.anIntArray3479.length; ++var4) {
               if(!this.aClass466_3481.method5530(this.anIntArray3479[var4], 0, 1590811661)) {
                  var2 = false;
               }
            }

            return var2;
         }
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(488229062);
         if(var2 == 0) {
            return;
         }

         this.method4184(var1, var2, -681906132);
      }
   }

   public void method85() {
   }

   void method4188(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         var1.readUnsignedByte(-1256776845);
      } else {
         int var3;
         int var4;
         if(2 == var2) {
            var3 = var1.readUnsignedByte(185064807);
            this.anIntArray3479 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray3479[var4] = var1.readBigSmart((byte)8);
            }
         } else if(var2 != 3) {
            if(var2 == 40) {
               var3 = var1.readUnsignedByte(-13540933);
               this.aShortArray3478 = new short[var3];
               this.aShortArray3477 = new short[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aShortArray3478[var4] = (short)var1.readUnsignedShort(1766434173);
                  this.aShortArray3477[var4] = (short)var1.readUnsignedShort(1557933247);
               }
            } else if(41 == var2) {
               var3 = var1.readUnsignedByte(1202550808);
               this.aShortArray3480 = new short[var3];
               this.aShortArray3476 = new short[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aShortArray3480[var4] = (short)var1.readUnsignedShort(1814870325);
                  this.aShortArray3476[var4] = (short)var1.readUnsignedShort(1062422489);
               }
            } else {
               int var5;
               int var6;
               byte var7;
               if(var2 == 44) {
                  var3 = var1.readUnsignedShort(617380291);
                  var4 = 0;

                  for(var5 = var3; var5 > 0; var5 >>= 1) {
                     ++var4;
                  }

                  this.aByteArray3482 = new byte[var4];
                  var7 = 0;

                  for(var6 = 0; var6 < var4; ++var6) {
                     if((var3 & 1 << var6) > 0) {
                        this.aByteArray3482[var6] = var7++;
                     } else {
                        this.aByteArray3482[var6] = -1;
                     }
                  }
               } else if(var2 == 45) {
                  var3 = var1.readUnsignedShort(233188043);
                  var4 = 0;

                  for(var5 = var3; var5 > 0; var5 >>= 1) {
                     ++var4;
                  }

                  this.aByteArray3483 = new byte[var4];
                  var7 = 0;

                  for(var6 = 0; var6 < var4; ++var6) {
                     if((var3 & 1 << var6) > 0) {
                        this.aByteArray3483[var6] = var7++;
                     } else {
                        this.aByteArray3483[var6] = -1;
                     }
                  }
               } else if(var2 >= 60 && var2 < 70) {
                  this.anIntArray3484[var2 - 60] = var1.readBigSmart((byte)-19);
               }
            }
         }
      }

   }

   void method4189(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         var1.readUnsignedByte(-1662998562);
      } else {
         int var3;
         int var4;
         if(2 == var2) {
            var3 = var1.readUnsignedByte(-726141970);
            this.anIntArray3479 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray3479[var4] = var1.readBigSmart((byte)16);
            }
         } else if(var2 != 3) {
            if(var2 == 40) {
               var3 = var1.readUnsignedByte(1184108983);
               this.aShortArray3478 = new short[var3];
               this.aShortArray3477 = new short[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aShortArray3478[var4] = (short)var1.readUnsignedShort(119255489);
                  this.aShortArray3477[var4] = (short)var1.readUnsignedShort(2057269457);
               }
            } else if(41 == var2) {
               var3 = var1.readUnsignedByte(-832991443);
               this.aShortArray3480 = new short[var3];
               this.aShortArray3476 = new short[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.aShortArray3480[var4] = (short)var1.readUnsignedShort(873749156);
                  this.aShortArray3476[var4] = (short)var1.readUnsignedShort(1331110798);
               }
            } else {
               int var5;
               int var6;
               byte var7;
               if(var2 == 44) {
                  var3 = var1.readUnsignedShort(1872002548);
                  var4 = 0;

                  for(var5 = var3; var5 > 0; var5 >>= 1) {
                     ++var4;
                  }

                  this.aByteArray3482 = new byte[var4];
                  var7 = 0;

                  for(var6 = 0; var6 < var4; ++var6) {
                     if((var3 & 1 << var6) > 0) {
                        this.aByteArray3482[var6] = var7++;
                     } else {
                        this.aByteArray3482[var6] = -1;
                     }
                  }
               } else if(var2 == 45) {
                  var3 = var1.readUnsignedShort(912232548);
                  var4 = 0;

                  for(var5 = var3; var5 > 0; var5 >>= 1) {
                     ++var4;
                  }

                  this.aByteArray3483 = new byte[var4];
                  var7 = 0;

                  for(var6 = 0; var6 < var4; ++var6) {
                     if((var3 & 1 << var6) > 0) {
                        this.aByteArray3483[var6] = var7++;
                     } else {
                        this.aByteArray3483[var6] = -1;
                     }
                  }
               } else if(var2 >= 60 && var2 < 70) {
                  this.anIntArray3484[var2 - 60] = var1.readBigSmart((byte)-86);
               }
            }
         }
      }

   }

   public boolean method4190() {
      boolean var1 = true;
      Class466 var2 = this.aClass466_3481;
      synchronized(var2) {
         for(int var3 = 0; var3 < 5; ++var3) {
            if(this.anIntArray3484[var3] != -1 && !this.aClass466_3481.method5530(this.anIntArray3484[var3], 0, 1602911246)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public boolean method4191() {
      boolean var1 = true;
      Class466 var2 = this.aClass466_3481;
      synchronized(var2) {
         for(int var3 = 0; var3 < 5; ++var3) {
            if(this.anIntArray3484[var3] != -1 && !this.aClass466_3481.method5530(this.anIntArray3484[var3], 0, 1593946285)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public boolean method4192() {
      boolean var1 = true;
      Class466 var2 = this.aClass466_3481;
      synchronized(var2) {
         for(int var3 = 0; var3 < 5; ++var3) {
            if(this.anIntArray3484[var3] != -1 && !this.aClass466_3481.method5530(this.anIntArray3484[var3], 0, 2057822692)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   Class326(int var1, Class466 var2) {
      this.aClass466_3481 = var2;
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-933012812);
         if(var2 == 0) {
            return;
         }

         this.method4184(var1, var2, -1707078148);
      }
   }

   public static IncomingFrame[] method4193(byte var0) {
      return new IncomingFrame[]{IncomingFrame.aClass420_4702, IncomingFrame.aClass420_4524, IncomingFrame.aClass420_4528, IncomingFrame.SET_SPRITE, IncomingFrame.aClass420_4527, IncomingFrame.SKILLS_UPDATE, IncomingFrame.ADD_OBJECT, IncomingFrame.aClass420_4530, IncomingFrame.OPEN_INTERFACE, IncomingFrame.PLAY_MUSIC_EFFECT, IncomingFrame.aClass420_4533, IncomingFrame.aClass420_4534, IncomingFrame.aClass420_4535, IncomingFrame.SET_PLAYER_INTERFACE, IncomingFrame.CONTAINER_UPDATE, IncomingFrame.SPRITE_ON_INTERFACE, IncomingFrame.aClass420_4539, IncomingFrame.MESSAGE_FRIENDS_QC, IncomingFrame.aClass420_4717, IncomingFrame.aClass420_4542, IncomingFrame.aClass420_4543, IncomingFrame.GAMEBAR_UPDATE, IncomingFrame.aClass420_4545, IncomingFrame.FRIEND_CHAT_LIST, IncomingFrame.aClass420_4653, IncomingFrame.WEIGHT, IncomingFrame.REMOVE_GROUND_ITEM, IncomingFrame.CAMERA_SHAKE, IncomingFrame.QC_PRIVATE_MESSAGE, IncomingFrame.STAMINA, IncomingFrame.aClass420_4553, IncomingFrame.PLAY_MUSIC_EFFECT_WITH_VOLUME, IncomingFrame.aClass420_4555, IncomingFrame.aClass420_4556, IncomingFrame.ICOMPONENT_TEXT, IncomingFrame.PUBLIC_MESSAGE, IncomingFrame.SET_OBJECT_INTERFACE, IncomingFrame.aClass420_4560, IncomingFrame.aClass420_4561, IncomingFrame.NPC_UPDATE, IncomingFrame.RESET_CAMERA, IncomingFrame.CS_VAR_1_PACKET, IncomingFrame.aClass420_4565, IncomingFrame.GAME_MESSAGE, IncomingFrame.CLAN_CHAT_MESSAGE_QUICK, IncomingFrame.CS2_SCRIPT_PACKET, IncomingFrame.aClass420_4529, IncomingFrame.aClass420_4525, IncomingFrame.CLOSE_INTERFACE, IncomingFrame.aClass420_4531, IncomingFrame.CAMERA_POSITION, IncomingFrame.aClass420_4574, IncomingFrame.aClass420_4696, IncomingFrame.aClass420_4576, IncomingFrame.PLAYER_UPDATE, IncomingFrame.aClass420_4578, IncomingFrame.CS2_VAR_STRING_SMALL, IncomingFrame.CS_VAR_STRING_LARGE, IncomingFrame.aClass420_4581, IncomingFrame.aClass420_4622, IncomingFrame.SYSTEM_UPDATE, IncomingFrame.PLAYER_UNDER_NPC_PRIORITY_PACKET, IncomingFrame.aClass420_4562, IncomingFrame.CUTSCENE, IncomingFrame.aClass420_4587, IncomingFrame.aClass420_4588, IncomingFrame.STATIC_REGION, IncomingFrame.VAR_NIS, IncomingFrame.aClass420_4597, IncomingFrame.FRIEND_CHAT_MESSAGE, IncomingFrame.PLAY_MUSIC, IncomingFrame.aClass420_4594, IncomingFrame.aClass420_4704, IncomingFrame.ROOT_INTERFACE_PACKET, IncomingFrame.FRIENDS_STATUS, IncomingFrame.aClass420_4598, IncomingFrame.PLAY_SOUND_EFFECT, IncomingFrame.aClass420_4577, IncomingFrame.IGNORE_LIST, IncomingFrame.aClass420_4585, IncomingFrame.aClass420_4523, IncomingFrame.LOBBY_INFO_PACKET, IncomingFrame.GRAPHIC_ON_TILE, IncomingFrame.PRIVATE_MESSAGE, IncomingFrame.PLAYER_OPTION, IncomingFrame.aClass420_4608, IncomingFrame.aClass420_4645, IncomingFrame.CS_VAR_2_PACKET, IncomingFrame.aClass420_4658, IncomingFrame.CONSOLE_MESSAGE, IncomingFrame.CLAN_CHAT_MESSAGE, IncomingFrame.aClass420_4614, IncomingFrame.ANIMATION_ON_INTERFACE, IncomingFrame.SET_MOUSE, IncomingFrame.aClass420_4617, IncomingFrame.aClass420_4618, IncomingFrame.aClass420_4619, IncomingFrame.aClass420_4620, IncomingFrame.aClass420_4621, IncomingFrame.CLAN_CHANNEL, IncomingFrame.AUDIO_RESET, IncomingFrame.aClass420_4688, IncomingFrame.ROTATE_CAMERA, IncomingFrame.REMOVE_OBJECT, IncomingFrame.NPC_ON_INTERFACE, IncomingFrame.aClass420_4575, IncomingFrame.aClass420_4629, IncomingFrame.aClass420_4595, IncomingFrame.aClass420_4569, IncomingFrame.ITEM_ICOMPONENT, IncomingFrame.PROJECTILE_TORSO_FOCUS, IncomingFrame.HUD_FLAG, IncomingFrame.PROJECTILE_BODY_TARGET, IncomingFrame.FRIEND_LIST, IncomingFrame.aClass420_4637, IncomingFrame.aClass420_4638, IncomingFrame.SET_NPC_INTERFACE, IncomingFrame.aClass420_4640, IncomingFrame.aClass420_4681, IncomingFrame.aClass420_4642, IncomingFrame.aClass420_4643, IncomingFrame.aClass420_4644, IncomingFrame.aClass420_4589, IncomingFrame.aClass420_4646, IncomingFrame.ICOMPONENT_SETTINGS, IncomingFrame.MOVE_INTERFACE, IncomingFrame.aClass420_4649, IncomingFrame.aClass420_4603, IncomingFrame.VAR_2_PACKET, IncomingFrame.HINTICON, IncomingFrame.OPEN_URL, IncomingFrame.GRAND_EXCHANGE, IncomingFrame.aClass420_4580, IncomingFrame.aClass420_4656, IncomingFrame.HIDE_ICOMPONENT, IncomingFrame.aClass420_4538, IncomingFrame.aClass420_4695, IncomingFrame.aClass420_4660, IncomingFrame.aClass420_4631, IncomingFrame.aClass420_4662, IncomingFrame.SLOT_CONTAINER_UPDATE, IncomingFrame.aClass420_4665, IncomingFrame.VAR_1_PACKET, IncomingFrame.aClass420_4675, IncomingFrame.aClass420_4667, IncomingFrame.aClass420_4632, IncomingFrame.aClass420_4669, IncomingFrame.RESET_NIS_VARS, IncomingFrame.aClass420_4671, IncomingFrame.REFRESH_WORLD_LIST, IncomingFrame.LOGOUT, IncomingFrame.aClass420_4690, IncomingFrame.aClass420_4686, IncomingFrame.OTHER_PLAYER_ON_INTERFACE, IncomingFrame.aClass420_4677, IncomingFrame.aClass420_4550, IncomingFrame.aClass420_4624, IncomingFrame.CHUNK_STREAM, IncomingFrame.PLAY_OBJECT_ANIMATION, IncomingFrame.aClass420_4682, IncomingFrame.PLAYER_HEAD_ON_INTERFACE, IncomingFrame.aClass420_4684, IncomingFrame.aClass420_4685, IncomingFrame.aClass420_4526, IncomingFrame.aClass420_4687, IncomingFrame.FADE_MAP, IncomingFrame.aClass420_4612, IncomingFrame.aClass420_4602, IncomingFrame.aClass420_4691, IncomingFrame.aClass420_4692, IncomingFrame.aClass420_4693, IncomingFrame.MODEL_ON_ICOMPONENT, IncomingFrame.SET_TILE_INTERFACE, IncomingFrame.CONSTRUCTED_MAP, IncomingFrame.aClass420_4697, IncomingFrame.aClass420_4532, IncomingFrame.PING_FRAME, IncomingFrame.CAMERA_LOOK, IncomingFrame.aClass420_4701, IncomingFrame.aClass420_4541, IncomingFrame.DECODE_LOOKS, IncomingFrame.LOGOUT_TO_LOBBY, IncomingFrame.aClass420_4705, IncomingFrame.aClass420_4706, IncomingFrame.aClass420_4707, IncomingFrame.PLAYER_ON_INTERFACE, IncomingFrame.aClass420_4709, IncomingFrame.SET_TARGET, IncomingFrame.aClass420_4711, IncomingFrame.aClass420_4712, IncomingFrame.CLAN_INFO, IncomingFrame.ADD_GROUND_ITEM, IncomingFrame.aClass420_4715};
   }

   static final void method4194(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class602.method7096(var3, var4, var0, Class258.aClass258_2824, 1340751157);
   }

   public static void method4195(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(7, (long)var0);
      var2.method10583((byte)-108);
   }
}
