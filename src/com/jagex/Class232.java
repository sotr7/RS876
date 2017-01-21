package com.jagex;

import com.jagex.Class1;
import com.jagex.Class114;
import com.jagex.Class178;
import com.jagex.Class210;
import com.jagex.Class212;
import com.jagex.Class213;
import com.jagex.Class214;
import com.jagex.Class215;
import com.jagex.Class219;
import com.jagex.Class222;
import com.jagex.Class223;
import com.jagex.Class224;
import com.jagex.Class225;
import com.jagex.Class227;
import com.jagex.Class228;
import com.jagex.Class230;
import com.jagex.Class236;
import com.jagex.Class242;
import com.jagex.InterfaceDef;
import com.jagex.Class251;
import com.jagex.Class252;
import com.jagex.Class253;
import com.jagex.Class264;
import com.jagex.Class31;
import com.jagex.Class311;
import com.jagex.Class41;
import com.jagex.Class438;
import com.jagex.Class514;
import com.jagex.Class517;
import com.jagex.Class523;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class526_Sub23_Sub4;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub25;
import com.jagex.Class526_Sub29;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub6;
import com.jagex.Class53;
import com.jagex.Class561;
import com.jagex.Class573;
import com.jagex.Class622;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub2;
import com.jagex.Class656;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class695;
import com.jagex.Class697;
import com.jagex.Class711_Sub36;
import com.jagex.Class8;
import com.jagex.Interface26;
import com.jagex.Interface28;
import com.jagex.client;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class Class232 {
   static int anInt2367;
   int anInt2363 = 947265851;
   LinkedList aLinkedList2366 = new LinkedList();
   Interface28 anInterface28_2365;
   long aLong2364;

   public void method3258(Class223 var1) {
      if(5356572723386344775L * this.aLong2364 == var1.aLong2313 * -4769375660468969133L && var1.method3102(-1675364644) == this.anInt2363 * -1963200499) {
         Iterator var2 = this.aLinkedList2366.iterator();

         while(var2.hasNext()) {
            Interface26 var3 = (Interface26)var2.next();
            var3.method168(var1, (byte)95);
         }

         var1.method3103(1286630588);
      } else {
         throw new IllegalStateException("");
      }
   }

   public void method3259(Class223 var1, byte var2) {
      if(5356572723386344775L * this.aLong2364 == var1.aLong2313 * -4769375660468969133L && var1.method3102(-1675364644) == this.anInt2363 * -1963200499) {
         Iterator var3 = this.aLinkedList2366.iterator();

         while(var3.hasNext()) {
            Interface26 var4 = (Interface26)var3.next();
            var4.method168(var1, (byte)-8);
         }

         var1.method3103(1126644088);
      } else {
         throw new IllegalStateException("");
      }
   }

   public Class232(RSByteBuffer var1, Interface28 var2) {
      this.anInterface28_2365 = var2;
      this.aLong2364 = var1.method9663(898529447) * 8274567071971456119L;
      this.anInt2363 = var1.readInt((byte)5) * -947265851;

      for(int var3 = var1.readUnsignedByte(2066723415); 0 != var3; var3 = var1.readUnsignedByte(1687323460)) {
         Class253 var4 = (Class253)Class561.findIdentifiable(Class253.method3470(-1084415244), var3, (byte)-62);
         Object var5;
         switch(var4.anInt2792 * 2147081589) {
         case 0:
            var5 = new Class227(this, var1);
            break;
         case 1:
            var5 = new Class219(this, var1);
            break;
         case 2:
            var5 = new Class214(this, var1);
            break;
         case 3:
            var5 = new Class212(this, var1);
            break;
         case 4:
            var5 = new Class224(this, var1);
            break;
         case 5:
            var5 = new Class252(this, var1);
            break;
         case 6:
            var5 = new Class228(this, var1);
            break;
         case 7:
            var5 = new Class236(this);
            break;
         case 8:
            var5 = new Class242(this, var1);
            break;
         case 9:
            var5 = new Class213(this, var1);
            break;
         case 10:
            var5 = new Class222(this, var1);
            break;
         case 11:
            var5 = new Class251(this, var1);
            break;
         case 12:
            var5 = new Class210(this, var1);
            break;
         case 13:
            var5 = new Class225(this);
            break;
         default:
            throw new IllegalStateException("");
         }

         this.aLinkedList2366.add(var5);
      }

   }

   public void method3260(Class223 var1) {
      if(5356572723386344775L * this.aLong2364 == var1.aLong2313 * -4769375660468969133L && var1.method3102(-1675364644) == this.anInt2363 * -1963200499) {
         Iterator var2 = this.aLinkedList2366.iterator();

         while(var2.hasNext()) {
            Interface26 var3 = (Interface26)var2.next();
            var3.method168(var1, (byte)74);
         }

         var1.method3103(1723977121);
      } else {
         throw new IllegalStateException("");
      }
   }

   public static boolean method3261(String var0, int var1, String var2, int var3) {
      if(0 == var1) {
         try {
            if(!Class514.aString7025.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if(var11.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if(1 == var1) {
         try {
            Object var4 = Class53.method969(Class514.anApplet7023, var2, new Object[]{(new URL(Class514.anApplet7023.getCodeBase(), var0)).toString()}, (byte)8);
            return null != var4;
         } catch (Throwable var7) {
            return false;
         }
      } else if(2 == var1) {
         try {
            Class514.anApplet7023.getAppletContext().showDocument(new URL(Class514.anApplet7023.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if(3 == var1) {
         try {
            Class53.method968(Class514.anApplet7023, "loggedout", -798203413);
         } catch (Throwable var10) {
            ;
         }

         try {
            Class514.anApplet7023.getAppletContext().showDocument(new URL(Class514.anApplet7023.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method3262(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2611 * -1115067825;
   }

   static final void method3263(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.modelType * 619744185 == 1?561507777 * var3.anInt2539:-1;
   }

   static final void method3264(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 < var3?var2:var3;
   }

   static void method3265(short var0) {
      if(client.anInt11072 * -1498975703 < 0) {
         Class1 var1 = Class526_Sub6.method9340(-1838614648);
         if(!Class31.aBool291) {
            Class31.aBool266 = Class31.anInt295 * -2050574577 != -1 && Class31.anInt273 * 1600532433 >= -2050574577 * Class31.anInt295 || (Class31.aBool302?26:22) + Class31.anInt273 * 1600532433 * Class31.anInt262 * 414128345 > 974996221 * Class526_Sub24.anInt10549;
         }

         Class31.aClass702_269.method8188(1583293283);
         Class31.aClass702_279.method8188(-99415603);

         int var3;
         for(Class526_Sub21_Sub6 var2 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)58); var2 != null; var2 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(-371635038)) {
            var3 = var2.anInt11659 * 976428997;
            if(var3 < 1000) {
               var2.method6332(-1949449864);
               if(59 != var3 && 2 != var3 && 8 != var3 && 17 != var3 && 15 != var3 && 16 != var3 && var3 != 58) {
                  Class31.aClass702_269.method8176(var2, -2044521591);
               } else {
                  Class31.aClass702_279.method8176(var2, -138169855);
               }
            }
         }

         Class31.aClass702_269.method8175(Class31.aClass702_292, 303295737);
         Class31.aClass702_279.method8175(Class31.aClass702_292, -326162918);
         if(1600532433 * Class31.anInt273 > 1) {
            if(Class178.method2667(-2069843062) && Class31.anInt273 * 1600532433 > 2) {
               Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631 = (Class526_Sub21_Sub6)Class31.aClass702_292.aClass526_8788.aClass526_7158.aClass526_7158;
            } else {
               Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631 = (Class526_Sub21_Sub6)Class31.aClass702_292.aClass526_8788.aClass526_7158;
            }

            Class517.aClass526_Sub21_Sub6_7040 = (Class526_Sub21_Sub6)Class31.aClass702_292.aClass526_8788.aClass526_7158;
            if(Class31.anInt273 * 1600532433 > 2) {
               Class31.aClass526_Sub21_Sub6_275 = (Class526_Sub21_Sub6)Class517.aClass526_Sub21_Sub6_7040.aClass526_7158;
            } else {
               Class31.aClass526_Sub21_Sub6_275 = null;
            }
         } else {
            Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631 = null;
            Class517.aClass526_Sub21_Sub6_7040 = null;
            Class31.aClass526_Sub21_Sub6_275 = null;
         }

         Class526_Sub29 var11 = (Class526_Sub29)client.aClass702_11028.method8206((byte)77);
         int var4;
         if(null != var11) {
            var3 = var11.method9527((byte)74);
            var4 = var11.method9530(1762748637);
         } else {
            var3 = Class8.aClass547_45.method6534(32124419);
            var4 = Class8.aClass547_45.method6531(1840953497);
         }

         boolean var13;
         if(Class31.aBool291) {
            int var6;
            int var7;
            if(Class622.method7358(Class253.aClass627_2794.anInterface67_8188, var11, -1580998920)) {
               int var5;
               Class526_Sub21_Sub6 var8;
               Class697 var14;
               if(null != Class31.aClass526_Sub21_Sub7_267 && var3 >= Class711_Sub36.anInt10917 * -679993307 && var3 <= -1423746299 * Class526_Sub25.anInt10551 + -679993307 * Class711_Sub36.anInt10917 && var4 >= 660573447 * Class311.anInt3384 && var4 <= 568451999 * Class523.anInt7075 + 660573447 * Class311.anInt3384) {
                  var5 = -1;

                  for(var6 = 0; var6 < -1095890769 * Class31.aClass526_Sub21_Sub7_267.anInt11664; ++var6) {
                     if(Class31.aBool302) {
                        var7 = 1 + 20 + 660573447 * Class311.anInt3384 + 96898447 * var1.anInt12 + var6 * Class31.anInt262 * 414128345;
                        if(var4 > var7 - var1.anInt12 * 96898447 - 1 && var4 < var7 + var1.anInt14 * -1329402501) {
                           var5 = var6;
                        }
                     } else {
                        var7 = Class311.anInt3384 * 660573447 + 31 + 414128345 * Class31.anInt262 * var6;
                        if(var4 > var7 - 13 && var4 < 3 + var7) {
                           var5 = var6;
                        }
                     }
                  }

                  if(-1 != var5) {
                     var6 = 0;
                     var14 = new Class697(Class31.aClass526_Sub21_Sub7_267.aClass696_11662);

                     for(var8 = (Class526_Sub21_Sub6)var14.method8149(-1051463164); var8 != null; var8 = (Class526_Sub21_Sub6)var14.next()) {
                        if(var5 == var6) {
                           Class639_Sub1_Sub2_Sub2.method10832(var8, var3, var4, true, -117020313);
                           break;
                        }

                        ++var6;
                     }
                  }

                  Class114.method1400(-1969702102);
               } else if(var3 >= Class41.anInt450 * 1183999269 && var3 <= 2110689557 * Class219.anInt2295 + 1183999269 * Class41.anInt450 && var4 >= Class679.anInt8602 * 1581495531 && var4 <= 1622612179 * Class573.anInt7689 + Class679.anInt8602 * 1581495531) {
                  if(!Class31.aBool266) {
                     var5 = -1;

                     for(var6 = 0; var6 < 1600532433 * Class31.anInt273; ++var6) {
                        if(Class31.aBool302) {
                           var7 = (1600532433 * Class31.anInt273 - 1 - var6) * Class31.anInt262 * 414128345 + 1 + Class679.anInt8602 * 1581495531 + 20 + var1.anInt12 * 96898447;
                           if(var4 > var7 - 96898447 * var1.anInt12 - 1 && var4 < var1.anInt14 * -1329402501 + var7) {
                              var5 = var6;
                           }
                        } else {
                           var7 = 31 + Class679.anInt8602 * 1581495531 + 414128345 * Class31.anInt262 * (1600532433 * Class31.anInt273 - 1 - var6);
                           if(var4 > var7 - 13 && var4 < 3 + var7) {
                              var5 = var6;
                           }
                        }
                     }

                     if(var5 != -1) {
                        var6 = 0;
                        Class695 var12 = new Class695(Class31.aClass702_292);

                        for(var8 = (Class526_Sub21_Sub6)var12.method8120(-1586562804); var8 != null; var8 = (Class526_Sub21_Sub6)var12.next()) {
                           if(var6 == var5) {
                              Class639_Sub1_Sub2_Sub2.method10832(var8, var3, var4, true, -2057546412);
                              break;
                           }

                           ++var6;
                        }
                     }

                     Class114.method1400(-94643411);
                  } else {
                     var5 = -1;

                     for(var6 = 0; var6 < -1345788195 * Class31.anInt274; ++var6) {
                        if(Class31.aBool302) {
                           var7 = 414128345 * Class31.anInt262 * var6 + 96898447 * var1.anInt12 + Class679.anInt8602 * 1581495531 + 20 + 1;
                           if(var4 > var7 - 96898447 * var1.anInt12 - 1 && var4 < var7 + var1.anInt14 * -1329402501) {
                              var5 = var6;
                              break;
                           }
                        } else {
                           var7 = 31 + 1581495531 * Class679.anInt8602 + Class31.anInt262 * 414128345 * var6;
                           if(var4 > var7 - 13 && var4 < 3 + var7) {
                              var5 = var6;
                              break;
                           }
                        }
                     }

                     if(var5 != -1) {
                        var6 = 0;
                        var14 = new Class697(Class31.aClass696_287);

                        for(Class526_Sub21_Sub7 var15 = (Class526_Sub21_Sub7)var14.method8149(1020542048); var15 != null; var15 = (Class526_Sub21_Sub7)var14.next()) {
                           if(var6 == var5) {
                              Class639_Sub1_Sub2_Sub2.method10832((Class526_Sub21_Sub6)var15.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531, var3, var4, true, -2018334708);
                              Class114.method1400(1221873938);
                              break;
                           }

                           ++var6;
                        }
                     }
                  }
               }
            } else {
               var13 = false;
               if(null != Class31.aClass526_Sub21_Sub7_267) {
                  if(var3 >= -679993307 * Class711_Sub36.anInt10917 - 10 && var3 <= 10 + -1423746299 * Class526_Sub25.anInt10551 + Class711_Sub36.anInt10917 * -679993307 && var4 >= Class311.anInt3384 * 660573447 - 10 && var4 <= 10 + 568451999 * Class523.anInt7075 + Class311.anInt3384 * 660573447) {
                     var13 = true;
                  } else {
                     Class656.method7837(-1839852902);
                  }
               }

               if(!var13) {
                  if(var3 >= Class41.anInt450 * 1183999269 - 10 && var3 <= 10 + 2110689557 * Class219.anInt2295 + 1183999269 * Class41.anInt450 && var4 >= Class679.anInt8602 * 1581495531 - 10 && var4 <= 10 + 1622612179 * Class573.anInt7689 + 1581495531 * Class679.anInt8602) {
                     if(Class31.aBool266) {
                        var6 = -1;
                        var7 = -1;

                        int var17;
                        for(var17 = 0; var17 < -1345788195 * Class31.anInt274; ++var17) {
                           int var9;
                           if(Class31.aBool302) {
                              var9 = 1 + 1581495531 * Class679.anInt8602 + 20 + var1.anInt12 * 96898447 + var17 * 414128345 * Class31.anInt262;
                              if(var4 > var9 - 96898447 * var1.anInt12 - 1 && var4 < -1329402501 * var1.anInt14 + var9) {
                                 var6 = var17;
                                 var7 = var9 - 96898447 * var1.anInt12 - 1;
                                 break;
                              }
                           } else {
                              var9 = 31 + Class679.anInt8602 * 1581495531 + Class31.anInt262 * 414128345 * var17;
                              if(var4 > var9 - 13 && var4 < 3 + var9) {
                                 var6 = var17;
                                 var7 = var9 - 13;
                                 break;
                              }
                           }
                        }

                        if(var6 != -1) {
                           var17 = 0;
                           Class697 var16 = new Class697(Class31.aClass696_287);

                           for(Class526_Sub21_Sub7 var10 = (Class526_Sub21_Sub7)var16.method8149(1334585014); null != var10; var10 = (Class526_Sub21_Sub7)var16.next()) {
                              if(var17 == var6) {
                                 if(var10.anInt11664 * -1095890769 > 1) {
                                    Class230.method3184(var10, var7, (byte)100);
                                 }
                                 break;
                              }

                              ++var17;
                           }
                        }
                     }
                  } else {
                     Class114.method1400(-632866011);
                  }
               }
            }
         } else {
            var13 = Class622.method7358(Class253.aClass627_2794.anInterface67_8189, var11, -1704609817);
            boolean var18 = Class622.method7358(Class253.aClass627_2794.anInterface67_8186, var11, -1496024055);
            boolean var19 = Class622.method7358(Class253.aClass627_2794.anInterface67_8187, var11, 60833215);
            if((var13 || var18) && (client.anInt11176 * 531712101 == 1 && 1600532433 * Class31.anInt273 > 2 || Class639_Sub1_Sub2_Sub1_Sub1.method10980(-2142508093))) {
               var19 = true;
            }

            if(var19 && 1600532433 * Class31.anInt273 > 0) {
               if(null == client.aClass245_11003 && 0 == client.anInt11242 * 1767961505) {
                  Class264.method3548(var3, var4, (byte)-30);
               } else {
                  Class31.anInt271 = -1318001542;
               }
            } else if(var18) {
               if(Class31.aClass526_Sub21_Sub6_275 != null) {
                  Class639_Sub1_Sub2_Sub2.method10832(Class31.aClass526_Sub21_Sub6_275, var3, var4, false, -41242618);
               }
            } else if(var13) {
               if(null == Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631) {
                  if(client.aBool11276) {
                     Class438.method5153(122915813);
                  }
               } else {
                  boolean var20 = null != client.aClass245_11003 || client.anInt11242 * 1767961505 > 0;
                  if(var20) {
                     Class31.anInt271 = -659000771;
                     Class215.aClass526_Sub21_Sub6_2274 = Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631;
                  } else {
                     Class639_Sub1_Sub2_Sub2.method10832(Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631, var3, var4, false, -2146288473);
                  }
               }
            }

            if(client.aClass245_11003 == null && 0 == client.anInt11242 * 1767961505) {
               Class31.anInt271 = 0;
               Class215.aClass526_Sub21_Sub6_2274 = null;
            }
         }

      }
   }

   static void method3266(int var0, int var1, byte var2) {
      if(Class31.anInt271 * 1503147285 == 1) {
         Class639_Sub1_Sub2_Sub2.method10832(Class215.aClass526_Sub21_Sub6_2274, var0, var1, false, -1901843482);
      } else if(Class31.anInt271 * 1503147285 == 2) {
         Class264.method3548(var0, var1, (byte)8);
      }

      Class31.anInt271 = 0;
      Class215.aClass526_Sub21_Sub6_2274 = null;
   }

   static final void method3267(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2529 * 1700151229;
   }

   static final void method3268(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass526_Sub9_8646.method9346((String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629], (byte)-3);
   }
}
