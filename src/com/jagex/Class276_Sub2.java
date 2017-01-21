package com.jagex;

import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class260;
import com.jagex.Class261;
import com.jagex.Class266;
import com.jagex.Class276;
import com.jagex.Class284_Sub2;
import com.jagex.Class433;
import com.jagex.Class494;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class526_Sub13_Sub1_Sub2;
import com.jagex.Class691;
import com.jagex.IllegalArgumentException_Sub1;
import com.jagex.Interface41;
import jaggl.OpenGL;
import java.util.HashMap;
import java.util.Map;

public class Class276_Sub2 extends Class276 {
   static final int anInt10079 = 35632;
   static final int anInt10081 = 13;
   static final int anInt10096 = 35633;
   int anInt10084;
   int anInt10085;
   int anInt10093;
   boolean aBool10097;
   int[] anIntArray10080;
   Map aMap10091;
   Map aMap10092;
   Map aMap10086;
   Map aMap10094;
   Map aMap10095;
   String aString10088;
   String aString10090;
   // $FF: synthetic field
   static boolean $assertionsDisabled = !Class276_Sub2.class.desiredAssertionStatus();
   static int[] anIntArray10089 = new int[2];
   static float[] aFloatArray10087 = new float[16];
   Class284_Sub2 aClass284_Sub2_10083;
   Class174_Sub3_Sub2 aClass174_Sub3_Sub2_10082;

   void method3626(Class526_Sub13_Sub1 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var6 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var6)) == null || this.aMap10092.get(Integer.valueOf(var6)) == null || this.aMap10086.get(Integer.valueOf(var6)) == null || this.aMap10094.get(Integer.valueOf(var6)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var6))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var6))).floatValue() != var3 || ((Float)this.aMap10086.get(Integer.valueOf(var6))).floatValue() != var4 || ((Float)this.aMap10094.get(Integer.valueOf(var6))).floatValue() != var5) {
            this.aMap10091.put(Integer.valueOf(var6), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var6), Float.valueOf(var3));
            this.aMap10086.put(Integer.valueOf(var6), Float.valueOf(var4));
            this.aMap10094.put(Integer.valueOf(var6), Float.valueOf(var5));
            if(var1.method10632(-1681874700) != Class260.aClass260_2889) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform4f(var6, var2, var3, var4, var5);
         }

      }
   }

   Class276_Sub2(Class174_Sub3_Sub2 var1, Class266 var2) {
      this.anInt10084 = 0;
      this.anInt10085 = 0;
      this.anInt10093 = 0;
      this.aBool10097 = false;
      this.anIntArray10080 = new int[13];
      this.aMap10091 = new HashMap();
      this.aMap10092 = new HashMap();
      this.aMap10086 = new HashMap();
      this.aMap10094 = new HashMap();
      this.aMap10095 = new HashMap();
      this.aString3020 = var2.aString2977;
      StringBuilder var3 = new StringBuilder();
      Class261[] var4;
      int var5;
      Class261 var6;
      if(var2.aString2976 != null) {
         this.aString3021 = var2.aString2976;
         if(var2.aClass261Array2979 != null) {
            var4 = var2.aClass261Array2979;

            for(var5 = 0; var5 < var4.length; ++var5) {
               var6 = var4[var5];
               var3.append("#define " + var6.aString2963 + " " + var6.aString2964 + '\n');
            }
         }

         var3.append(new String(var1.method10525(this.aString3021)));
         this.aString10088 = var3.toString();
      }

      if(var2.aString2978 != null) {
         this.aString3022 = var2.aString2978;
         var3.setLength(0);
         if(var2.aClass261Array2980 != null) {
            var4 = var2.aClass261Array2980;

            for(var5 = 0; var5 < var4.length; ++var5) {
               var6 = var4[var5];
               var3.append("#define " + var6.aString2963 + " " + var6.aString2964 + '\n');
            }
         }

         var3.append(new String(var1.method10525(this.aString3022)));
         this.aString10090 = var3.toString();
      }

      Class691.method8102(this.anIntArray10080, 0, this.anIntArray10080.length, -1);
   }

   int method9101(int var1, String var2, String var3) {
      if(var2 == null) {
         return 0;
      } else {
         int var4 = OpenGL.glCreateShader(var1);
         OpenGL.glShaderSource(var4, var2);
         OpenGL.glCompileShader(var4);
         OpenGL.glGetShaderiv(var4, '\u8b81', anIntArray10089, 0);
         if(anIntArray10089[0] == 0) {
            OpenGL.glDeleteShader(var4);
            var4 = 0;
         }

         return var4;
      }
   }

   void method3646(Class526_Sub13_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var5 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var5)) == null || this.aMap10092.get(Integer.valueOf(var5)) == null || this.aMap10086.get(Integer.valueOf(var5)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var5))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var5))).floatValue() != var3 || ((Float)this.aMap10086.get(Integer.valueOf(var5))).floatValue() != var4) {
            this.aMap10091.put(Integer.valueOf(var5), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var5), Float.valueOf(var3));
            this.aMap10086.put(Integer.valueOf(var5), Float.valueOf(var4));
            if(var1.method10632(-1261959384) != Class260.aClass260_2863) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform3f(var5, var2, var3, var4);
         }

      }
   }

   void method3640(Class526_Sub13_Sub1 var1, float var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var3 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var3)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var3))).floatValue() != var2) {
            this.aMap10091.put(Integer.valueOf(var3), Float.valueOf(var2));
            if(var1.method10632(-1335984597) != Class260.aClass260_2853 && var1.method10632(-1177771721) != Class260.aClass260_2907) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform1f(var3, var2);
         }

      }
   }

   void method3627(Class526_Sub13_Sub1 var1, float var2, float var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var4 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var4)) == null || this.aMap10092.get(Integer.valueOf(var4)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var4))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var4))).floatValue() != var3) {
            this.aMap10091.put(Integer.valueOf(var4), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var4), Float.valueOf(var3));
            if(var1.method10632(-1761520355) != Class260.aClass260_2842) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform2f(var4, var2, var3);
         }

      }
   }

   void method3657(int var1, Class433 var2) {
      OpenGL.glUniform3fv(var1, 3, var2.method5109(aFloatArray10087), 0);
   }

   void method3654(int var1, float var2, float var3, float var4, float var5) {
      OpenGL.glUniform4f(var1, var2, var3, var4, var5);
   }

   public boolean method3643() {
      if(this.aBool10097) {
         return true;
      } else {
         this.aClass174_Sub3_Sub2_10082.aClass276_Sub2_11512 = null;
         this.anInt10085 = this.method9101('\u8b31', this.aString10088, this.aString3021);
         this.anInt10093 = this.method9101('\u8b30', this.aString10090, this.aString3022);
         if(this.anInt10085 != 0 && this.anInt10093 != 0) {
            this.anInt10084 = OpenGL.glCreateProgram();
            if(this.anInt10085 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10093);
            }

            OpenGL.glLinkProgram(this.anInt10084);
            OpenGL.glGetProgramiv(this.anInt10084, '\u8b82', anIntArray10089, 0);
            if(anIntArray10089[0] == 0) {
               if(this.anInt10085 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10085);
                  OpenGL.glDeleteShader(this.anInt10085);
               }

               if(this.anInt10093 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10093);
                  OpenGL.glDeleteShader(this.anInt10093);
               }

               OpenGL.glDeleteProgram(this.anInt10084);
               return false;
            } else {
               OpenGL.glUseProgram(this.anInt10084);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3727(1279930962); ++var2) {
                  if(this.aClass284_Sub2_10083.method3755(var2, -1274330211) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  Class526_Sub13_Sub1 var3;
                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3753(1027428844); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3777(var2, -83429187);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3751((short)23329); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3770(var2, 1670772149);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  this.aString10088 = null;
                  this.aString10090 = null;
                  this.aBool10097 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt10085 != 0) {
               OpenGL.glDeleteShader(this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glDeleteShader(this.anInt10093);
            }

            return false;
         }
      }
   }

   void method3624(Class526_Sub13_Sub1 var1, Class433 var2) {
      if(!$assertionsDisabled && var1.method10632(-1437862926) != Class260.aClass260_2878) {
         throw new AssertionError();
      } else {
         int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
         if(var3 != -1) {
            OpenGL.glUniform2fv(var3, 4, var2.method5111(aFloatArray10087), 0);
         }
      }
   }

   void method3629(Class526_Sub13_Sub1 var1, Class433 var2) {
      if(!$assertionsDisabled && var1.method10632(-1187845190) != Class260.aClass260_2880) {
         throw new AssertionError();
      } else {
         int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
         if(var3 != -1) {
            OpenGL.glUniform4fv(var3, 4, var2.method5107(aFloatArray10087), 0);
         }
      }
   }

   void method3630(Class526_Sub13_Sub1 var1, int var2, Interface41 var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var4 != -1) {
         if(var3 == null) {
            var3 = this.aClass174_Sub3_Sub2_10082.anInterface38_9779;
         }

         if(var2 < this.aClass174_Sub3_Sub2_10082.anInt9683) {
            this.aClass174_Sub3_Sub2_10082.method8788(var2);
            this.aClass174_Sub3_Sub2_10082.method8841((Interface41)var3);
         } else {
            OpenGL.glActiveTexture('\u84c0' + var2);
            OpenGL.glBindTexture(((Class494)var3).anInt5533, ((Class494)var3).anInt5532);
         }

         if(this.aMap10095.get(Integer.valueOf(var4)) == null || ((Integer)this.aMap10095.get(Integer.valueOf(var4))).intValue() != var2) {
            this.aMap10095.put(Integer.valueOf(var4), Integer.valueOf(var2));
            OpenGL.glUniform1i(var4, var2);
         }

      }
   }

   void method3631(int var1, float var2, float var3, float var4) {
      OpenGL.glUniform3f(var1, var2, var3, var4);
   }

   void method3632(int var1, float var2, float var3, float var4, float var5) {
      OpenGL.glUniform4f(var1, var2, var3, var4, var5);
   }

   void method3633(int var1, float[] var2, int var3) {
      OpenGL.glUniform4fv(var1, var3, var2, 0);
   }

   void method3644(Class526_Sub13_Sub1 var1, float var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var3 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var3)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var3))).floatValue() != var2) {
            this.aMap10091.put(Integer.valueOf(var3), Float.valueOf(var2));
            if(var1.method10632(-1782120955) != Class260.aClass260_2853 && var1.method10632(-1767590160) != Class260.aClass260_2907) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform1f(var3, var2);
         }

      }
   }

   void method3650(int var1, Class433 var2) {
      OpenGL.glUniform2fv(var1, 4, var2.method5111(aFloatArray10087), 0);
   }

   void method3636(int var1, Class433 var2) {
      OpenGL.glUniform4fv(var1, 4, var2.method5107(aFloatArray10087), 0);
   }

   void method3622(int var1, Class433 var2) {
      OpenGL.glUniform3fv(var1, 3, var2.method5109(aFloatArray10087), 0);
   }

   void method3637(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub2_10082.method8788(var2);
      this.aClass174_Sub3_Sub2_10082.method8841(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   void method3660(Class526_Sub13_Sub1 var1, float[] var2, int var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var4 != -1) {
         OpenGL.glUniform4fv(var4, var3, var2, 0);
      }
   }

   public void method141() {
      if(this.anInt10084 != 0) {
         this.aClass174_Sub3_Sub2_10082.method10531(this.anInt10084);
         if(this.anInt10085 != 0) {
            this.aClass174_Sub3_Sub2_10082.method10536((long)this.anInt10085);
         }

         if(this.anInt10093 != 0) {
            this.aClass174_Sub3_Sub2_10082.method10536((long)this.anInt10093);
         }

         this.anInt10084 = 0;
         this.anInt10085 = 0;
         this.anInt10093 = 0;
      }

   }

   void method9102() {
      this.method140();
   }

   public void method140() {
      if(this.anInt10084 != 0) {
         this.aClass174_Sub3_Sub2_10082.method10531(this.anInt10084);
         if(this.anInt10085 != 0) {
            this.aClass174_Sub3_Sub2_10082.method10536((long)this.anInt10085);
         }

         if(this.anInt10093 != 0) {
            this.aClass174_Sub3_Sub2_10082.method10536((long)this.anInt10093);
         }

         this.anInt10084 = 0;
         this.anInt10085 = 0;
         this.anInt10093 = 0;
      }

   }

   public boolean method3639() {
      if(this.aBool10097) {
         return true;
      } else {
         this.aClass174_Sub3_Sub2_10082.aClass276_Sub2_11512 = null;
         this.anInt10085 = this.method9101('\u8b31', this.aString10088, this.aString3021);
         this.anInt10093 = this.method9101('\u8b30', this.aString10090, this.aString3022);
         if(this.anInt10085 != 0 && this.anInt10093 != 0) {
            this.anInt10084 = OpenGL.glCreateProgram();
            if(this.anInt10085 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10093);
            }

            OpenGL.glLinkProgram(this.anInt10084);
            OpenGL.glGetProgramiv(this.anInt10084, '\u8b82', anIntArray10089, 0);
            if(anIntArray10089[0] == 0) {
               if(this.anInt10085 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10085);
                  OpenGL.glDeleteShader(this.anInt10085);
               }

               if(this.anInt10093 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10093);
                  OpenGL.glDeleteShader(this.anInt10093);
               }

               OpenGL.glDeleteProgram(this.anInt10084);
               return false;
            } else {
               OpenGL.glUseProgram(this.anInt10084);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3727(1608093672); ++var2) {
                  if(this.aClass284_Sub2_10083.method3755(var2, -2002500114) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  Class526_Sub13_Sub1 var3;
                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3753(123721355); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3777(var2, -658720927);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3751((short)-26888); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3770(var2, 1670772149);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  this.aString10088 = null;
                  this.aString10090 = null;
                  this.aBool10097 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt10085 != 0) {
               OpenGL.glDeleteShader(this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glDeleteShader(this.anInt10093);
            }

            return false;
         }
      }
   }

   void method3662(Class526_Sub13_Sub1 var1, Class433 var2) {
      if(!$assertionsDisabled && var1.method10632(-1869827275) != Class260.aClass260_2878) {
         throw new AssertionError();
      } else {
         int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
         if(var3 != -1) {
            OpenGL.glUniform2fv(var3, 4, var2.method5111(aFloatArray10087), 0);
         }
      }
   }

   public boolean method3641() {
      if(this.aBool10097) {
         return true;
      } else {
         this.aClass174_Sub3_Sub2_10082.aClass276_Sub2_11512 = null;
         this.anInt10085 = this.method9101('\u8b31', this.aString10088, this.aString3021);
         this.anInt10093 = this.method9101('\u8b30', this.aString10090, this.aString3022);
         if(this.anInt10085 != 0 && this.anInt10093 != 0) {
            this.anInt10084 = OpenGL.glCreateProgram();
            if(this.anInt10085 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10093);
            }

            OpenGL.glLinkProgram(this.anInt10084);
            OpenGL.glGetProgramiv(this.anInt10084, '\u8b82', anIntArray10089, 0);
            if(anIntArray10089[0] == 0) {
               if(this.anInt10085 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10085);
                  OpenGL.glDeleteShader(this.anInt10085);
               }

               if(this.anInt10093 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10093);
                  OpenGL.glDeleteShader(this.anInt10093);
               }

               OpenGL.glDeleteProgram(this.anInt10084);
               return false;
            } else {
               OpenGL.glUseProgram(this.anInt10084);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3727(1500523619); ++var2) {
                  if(this.aClass284_Sub2_10083.method3755(var2, -1837087410) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  Class526_Sub13_Sub1 var3;
                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3753(-1766699443); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3777(var2, -1099626456);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3751((short)19512); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3770(var2, 1670772149);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  this.aString10088 = null;
                  this.aString10090 = null;
                  this.aBool10097 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt10085 != 0) {
               OpenGL.glDeleteShader(this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glDeleteShader(this.anInt10093);
            }

            return false;
         }
      }
   }

   public boolean method3625() {
      if(this.aBool10097) {
         return true;
      } else {
         this.aClass174_Sub3_Sub2_10082.aClass276_Sub2_11512 = null;
         this.anInt10085 = this.method9101('\u8b31', this.aString10088, this.aString3021);
         this.anInt10093 = this.method9101('\u8b30', this.aString10090, this.aString3022);
         if(this.anInt10085 != 0 && this.anInt10093 != 0) {
            this.anInt10084 = OpenGL.glCreateProgram();
            if(this.anInt10085 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10093);
            }

            OpenGL.glLinkProgram(this.anInt10084);
            OpenGL.glGetProgramiv(this.anInt10084, '\u8b82', anIntArray10089, 0);
            if(anIntArray10089[0] == 0) {
               if(this.anInt10085 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10085);
                  OpenGL.glDeleteShader(this.anInt10085);
               }

               if(this.anInt10093 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10093);
                  OpenGL.glDeleteShader(this.anInt10093);
               }

               OpenGL.glDeleteProgram(this.anInt10084);
               return false;
            } else {
               OpenGL.glUseProgram(this.anInt10084);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3727(1767216555); ++var2) {
                  if(this.aClass284_Sub2_10083.method3755(var2, -2080571503) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  Class526_Sub13_Sub1 var3;
                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3753(-546890337); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3777(var2, -627230464);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3751((short)5018); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3770(var2, 1670772149);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  this.aString10088 = null;
                  this.aString10090 = null;
                  this.aBool10097 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt10085 != 0) {
               OpenGL.glDeleteShader(this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glDeleteShader(this.anInt10093);
            }

            return false;
         }
      }
   }

   void method3648(int var1, Class433 var2) {
      OpenGL.glUniform4fv(var1, 4, var2.method5107(aFloatArray10087), 0);
   }

   void method3665(Class526_Sub13_Sub1 var1, Class433 var2) {
      if(!$assertionsDisabled && var1.method10632(-1239086980) != Class260.aClass260_2880) {
         throw new AssertionError();
      } else {
         int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
         if(var3 != -1) {
            OpenGL.glUniform4fv(var3, 4, var2.method5107(aFloatArray10087), 0);
         }
      }
   }

   void method3645(Class526_Sub13_Sub1 var1, float var2, float var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var4 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var4)) == null || this.aMap10092.get(Integer.valueOf(var4)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var4))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var4))).floatValue() != var3) {
            this.aMap10091.put(Integer.valueOf(var4), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var4), Float.valueOf(var3));
            if(var1.method10632(-1442766866) != Class260.aClass260_2842) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform2f(var4, var2, var3);
         }

      }
   }

   public boolean method3638() {
      if(this.aBool10097) {
         return true;
      } else {
         this.aClass174_Sub3_Sub2_10082.aClass276_Sub2_11512 = null;
         this.anInt10085 = this.method9101('\u8b31', this.aString10088, this.aString3021);
         this.anInt10093 = this.method9101('\u8b30', this.aString10090, this.aString3022);
         if(this.anInt10085 != 0 && this.anInt10093 != 0) {
            this.anInt10084 = OpenGL.glCreateProgram();
            if(this.anInt10085 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10093);
            }

            OpenGL.glLinkProgram(this.anInt10084);
            OpenGL.glGetProgramiv(this.anInt10084, '\u8b82', anIntArray10089, 0);
            if(anIntArray10089[0] == 0) {
               if(this.anInt10085 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10085);
                  OpenGL.glDeleteShader(this.anInt10085);
               }

               if(this.anInt10093 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10093);
                  OpenGL.glDeleteShader(this.anInt10093);
               }

               OpenGL.glDeleteProgram(this.anInt10084);
               return false;
            } else {
               OpenGL.glUseProgram(this.anInt10084);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3727(1139921049); ++var2) {
                  if(this.aClass284_Sub2_10083.method3755(var2, -1748982453) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  Class526_Sub13_Sub1 var3;
                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3753(849481639); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3777(var2, -533916393);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3751((short)-7785); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3770(var2, 1670772149);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  this.aString10088 = null;
                  this.aString10090 = null;
                  this.aBool10097 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt10085 != 0) {
               OpenGL.glDeleteShader(this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glDeleteShader(this.anInt10093);
            }

            return false;
         }
      }
   }

   void method3623(Class526_Sub13_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var5 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var5)) == null || this.aMap10092.get(Integer.valueOf(var5)) == null || this.aMap10086.get(Integer.valueOf(var5)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var5))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var5))).floatValue() != var3 || ((Float)this.aMap10086.get(Integer.valueOf(var5))).floatValue() != var4) {
            this.aMap10091.put(Integer.valueOf(var5), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var5), Float.valueOf(var3));
            this.aMap10086.put(Integer.valueOf(var5), Float.valueOf(var4));
            if(var1.method10632(-1279089970) != Class260.aClass260_2863) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform3f(var5, var2, var3, var4);
         }

      }
   }

   void method3649(Class526_Sub13_Sub1 var1, float[] var2, int var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var4 != -1) {
         OpenGL.glUniform4fv(var4, var3, var2, 0);
      }
   }

   void method3628(Class526_Sub13_Sub1 var1, Class433 var2) {
      if(!$assertionsDisabled && var1.method10632(-1528818679) != Class260.aClass260_2878) {
         throw new AssertionError();
      } else {
         int var3 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
         if(var3 != -1) {
            OpenGL.glUniform2fv(var3, 4, var2.method5111(aFloatArray10087), 0);
         }
      }
   }

   void method9103() {
      this.method140();
   }

   void method3666(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub2_10082.method8788(var2);
      this.aClass174_Sub3_Sub2_10082.method8841(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   void method3642(Class526_Sub13_Sub1 var1, int var2, Interface41 var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var4 != -1) {
         if(var3 == null) {
            var3 = this.aClass174_Sub3_Sub2_10082.anInterface38_9779;
         }

         if(var2 < this.aClass174_Sub3_Sub2_10082.anInt9683) {
            this.aClass174_Sub3_Sub2_10082.method8788(var2);
            this.aClass174_Sub3_Sub2_10082.method8841((Interface41)var3);
         } else {
            OpenGL.glActiveTexture('\u84c0' + var2);
            OpenGL.glBindTexture(((Class494)var3).anInt5533, ((Class494)var3).anInt5532);
         }

         if(this.aMap10095.get(Integer.valueOf(var4)) == null || ((Integer)this.aMap10095.get(Integer.valueOf(var4))).intValue() != var2) {
            this.aMap10095.put(Integer.valueOf(var4), Integer.valueOf(var2));
            OpenGL.glUniform1i(var4, var2);
         }

      }
   }

   void method3652(int var1, float var2, float var3, float var4) {
      OpenGL.glUniform3f(var1, var2, var3, var4);
   }

   void method3653(int var1, float var2, float var3, float var4) {
      OpenGL.glUniform3f(var1, var2, var3, var4);
   }

   void method3634(int var1, Class433 var2) {
      OpenGL.glUniform3fv(var1, 3, var2.method5109(aFloatArray10087), 0);
   }

   void method3655(int var1, float var2, float var3, float var4, float var5) {
      OpenGL.glUniform4f(var1, var2, var3, var4, var5);
   }

   void method3656(int var1, Class433 var2) {
      OpenGL.glUniform3fv(var1, 3, var2.method5109(aFloatArray10087), 0);
   }

   public void finalize() {
      this.method140();
   }

   void method3659(int var1, Class433 var2) {
      OpenGL.glUniform2fv(var1, 4, var2.method5111(aFloatArray10087), 0);
   }

   void method3620(int var1, Class433 var2) {
      OpenGL.glUniform2fv(var1, 4, var2.method5111(aFloatArray10087), 0);
   }

   void method3658(int var1, Class433 var2) {
      OpenGL.glUniform2fv(var1, 4, var2.method5111(aFloatArray10087), 0);
   }

   public boolean method3647() {
      if(this.aBool10097) {
         return true;
      } else {
         this.aClass174_Sub3_Sub2_10082.aClass276_Sub2_11512 = null;
         this.anInt10085 = this.method9101('\u8b31', this.aString10088, this.aString3021);
         this.anInt10093 = this.method9101('\u8b30', this.aString10090, this.aString3022);
         if(this.anInt10085 != 0 && this.anInt10093 != 0) {
            this.anInt10084 = OpenGL.glCreateProgram();
            if(this.anInt10085 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glAttachShader(this.anInt10084, this.anInt10093);
            }

            OpenGL.glLinkProgram(this.anInt10084);
            OpenGL.glGetProgramiv(this.anInt10084, '\u8b82', anIntArray10089, 0);
            if(anIntArray10089[0] == 0) {
               if(this.anInt10085 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10085);
                  OpenGL.glDeleteShader(this.anInt10085);
               }

               if(this.anInt10093 != 0) {
                  OpenGL.glDetachShader(this.anInt10084, this.anInt10093);
                  OpenGL.glDeleteShader(this.anInt10093);
               }

               OpenGL.glDeleteProgram(this.anInt10084);
               return false;
            } else {
               OpenGL.glUseProgram(this.anInt10084);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3727(1638149363); ++var2) {
                  if(this.aClass284_Sub2_10083.method3755(var2, -1984334969) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  Class526_Sub13_Sub1 var3;
                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3753(-2002262112); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3777(var2, -267959598);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  for(var2 = 0; var2 < this.aClass284_Sub2_10083.method3751((short)11670); ++var2) {
                     var3 = this.aClass284_Sub2_10083.method3770(var2, 1670772149);
                     if(var3 != null) {
                        var3.method10626(var1);
                     }
                  }

                  this.aString10088 = null;
                  this.aString10090 = null;
                  this.aBool10097 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt10085 != 0) {
               OpenGL.glDeleteShader(this.anInt10085);
            }

            if(this.anInt10093 != 0) {
               OpenGL.glDeleteShader(this.anInt10093);
            }

            return false;
         }
      }
   }

   void method3663(int var1, Class433 var2) {
      OpenGL.glUniform4fv(var1, 4, var2.method5107(aFloatArray10087), 0);
   }

   void method3664(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub2_10082.method8788(var2);
      this.aClass174_Sub3_Sub2_10082.method8841(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   void method3635(Class526_Sub13_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var5 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var5)) == null || this.aMap10092.get(Integer.valueOf(var5)) == null || this.aMap10086.get(Integer.valueOf(var5)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var5))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var5))).floatValue() != var3 || ((Float)this.aMap10086.get(Integer.valueOf(var5))).floatValue() != var4) {
            this.aMap10091.put(Integer.valueOf(var5), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var5), Float.valueOf(var3));
            this.aMap10086.put(Integer.valueOf(var5), Float.valueOf(var4));
            if(var1.method10632(-1389924235) != Class260.aClass260_2863) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform3f(var5, var2, var3, var4);
         }

      }
   }

   void method3670(int var1, float[] var2, int var3) {
      OpenGL.glUniform4fv(var1, var3, var2, 0);
   }

   void method3667(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub2_10082.method8788(var2);
      this.aClass174_Sub3_Sub2_10082.method8841(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   void method3668(Class526_Sub13_Sub1 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((Class526_Sub13_Sub1_Sub2)var1).method10886();
      if(var6 != -1) {
         if(this.aMap10091.get(Integer.valueOf(var6)) == null || this.aMap10092.get(Integer.valueOf(var6)) == null || this.aMap10086.get(Integer.valueOf(var6)) == null || this.aMap10094.get(Integer.valueOf(var6)) == null || ((Float)this.aMap10091.get(Integer.valueOf(var6))).floatValue() != var2 || ((Float)this.aMap10092.get(Integer.valueOf(var6))).floatValue() != var3 || ((Float)this.aMap10086.get(Integer.valueOf(var6))).floatValue() != var4 || ((Float)this.aMap10094.get(Integer.valueOf(var6))).floatValue() != var5) {
            this.aMap10091.put(Integer.valueOf(var6), Float.valueOf(var2));
            this.aMap10092.put(Integer.valueOf(var6), Float.valueOf(var3));
            this.aMap10086.put(Integer.valueOf(var6), Float.valueOf(var4));
            this.aMap10094.put(Integer.valueOf(var6), Float.valueOf(var5));
            if(var1.method10632(-1974376993) != Class260.aClass260_2889) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform4f(var6, var2, var3, var4, var5);
         }

      }
   }

   void method3669(int var1, float[] var2, int var3) {
      OpenGL.glUniform4fv(var1, var3, var2, 0);
   }

   void method3651(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub2_10082.method8788(var2);
      this.aClass174_Sub3_Sub2_10082.method8841(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   Class276_Sub2(Class174_Sub3_Sub2 var1, Class284_Sub2 var2, Class266 var3) {
      this(var1, var3);
      this.aClass284_Sub2_10083 = var2;
      this.aClass174_Sub3_Sub2_10082 = var1;
   }
}
