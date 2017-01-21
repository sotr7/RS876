package com.jagex;

import com.jagex.Class124_Sub1;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class184_Sub2_Sub2;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub1;
import com.jagex.Class526_Sub26;
import com.jagex.Class702;
import com.jagex.Interface21;
import com.jagex.Interface23;
import jaggl.OpenGL;

public class Class156 {
   int anInt1732 = 0;
   int anInt1730 = 0;
   int anInt1743 = 1;
   int anInt1735 = 1;
   Class702 aClass702_1744 = new Class702();
   boolean aBool1738 = true;
   boolean aBool1739 = true;
   boolean aBool1740 = true;
   boolean aBool1741 = true;
   Class124_Sub1[] aClass124_Sub1Array1734 = new Class124_Sub1[2];
   boolean aBool1746 = false;
   int anInt1742 = 0;
   Class166 aClass166_1728;
   Class174_Sub2 aClass174_Sub2_1737;
   Class184_Sub2_Sub2 aClass184_Sub2_Sub2_1729;
   Class184_Sub2_Sub2 aClass184_Sub2_Sub2_1731;
   Class184_Sub2_Sub2 aClass184_Sub2_Sub2_1747;
   boolean aBool1736;
   Class526_Sub21_Sub1 aClass526_Sub21_Sub1_1745;
   Class124_Sub1 aClass124_Sub1_1733;
   Class526_Sub21_Sub1 aClass526_Sub21_Sub1_1748;

   void method1840(Class526_Sub26 var1) {
      var1.aBool10553 = false;
      var1.method9486();
      var1.method6332(-1949449864);
      this.method1848();
   }

   boolean method1841() {
      for(Class526_Sub26 var1 = (Class526_Sub26)this.aClass702_1744.method8206((byte)127); var1 != null; var1 = (Class526_Sub26)this.aClass702_1744.method8181(-828626557)) {
         if(!var1.method9495()) {
            return false;
         }
      }

      return true;
   }

   boolean method1842() {
      return this.aClass184_Sub2_Sub2_1731 != null;
   }

   boolean method1843() {
      return this.aBool1736;
   }

   boolean method1844() {
      for(Class526_Sub26 var1 = (Class526_Sub26)this.aClass702_1744.method8206((byte)35); var1 != null; var1 = (Class526_Sub26)this.aClass702_1744.method8181(1760566103)) {
         if(!var1.method9495()) {
            return false;
         }
      }

      return true;
   }

   Class156(Class174_Sub2 var1) {
      this.aClass166_1728 = Class166.aClass166_1884;
      this.aClass174_Sub2_1737 = var1;
      if(this.aClass174_Sub2_1737.aBool9638 && this.aClass174_Sub2_1737.aBool9623) {
         this.aClass184_Sub2_Sub2_1731 = this.aClass184_Sub2_Sub2_1729 = new Class184_Sub2_Sub2(this.aClass174_Sub2_1737);
         if(this.aClass174_Sub2_1737.anInt9612 > 1 && this.aClass174_Sub2_1737.aBool9625 && this.aClass174_Sub2_1737.aBool9582) {
            this.aClass184_Sub2_Sub2_1731 = this.aClass184_Sub2_Sub2_1747 = new Class184_Sub2_Sub2(this.aClass174_Sub2_1737);
         }
      }

   }

   boolean method1845(int var1, int var2, int var3, int var4) {
      if(this.aClass184_Sub2_Sub2_1731 != null && !this.aClass702_1744.method8209(726705945) && !this.method1844()) {
         if(this.anInt1743 != var3 || this.anInt1735 != var4) {
            this.anInt1743 = var3;
            this.anInt1735 = var4;

            for(Class526 var5 = this.aClass702_1744.method8206((byte)41); var5 != this.aClass702_1744.aClass526_8788; var5 = var5.aClass526_7157) {
               ((Class526_Sub26)var5).method9487(this.anInt1743, this.anInt1735);
            }

            this.aBool1738 = true;
            this.aBool1739 = true;
            this.aBool1740 = true;
         }

         if(this.method1859()) {
            this.anInt1732 = var1;
            this.anInt1730 = var2;
            this.aBool1736 = true;
            this.aClass174_Sub2_1737.method8607(-this.anInt1732, this.anInt1735 + this.anInt1730 - this.aClass174_Sub2_1737.method2247((byte)6).method2693());
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1731, (short)128);
            this.aClass184_Sub2_Sub2_1731.method10454(0);
            this.aClass174_Sub2_1737.method2283(3, 0);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   void method1846(int var1, int var2) {
      if(this.aBool1736) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method10454(0);
            this.aClass184_Sub2_Sub2_1747.method8470(0, 0, this.anInt1743, this.anInt1735, 0, 0, true, this.aBool1746);
         }

         this.aClass174_Sub2_1737.method8668();
         this.aClass174_Sub2_1737.method8651(0);
         this.aClass174_Sub2_1737.method8672(1);
         this.aClass174_Sub2_1737.method2278();
         int var3 = 0;
         int var4 = 1;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         Class526_Sub26[] var8 = null;

         Class526_Sub26 var9;
         for(var9 = (Class526_Sub26)this.aClass702_1744.method8206((byte)81); var9 != null; var9 = (Class526_Sub26)this.aClass702_1744.method8181(129109212)) {
            if(!var9.method9495()) {
               ++var6;
            }
         }

         var8 = new Class526_Sub26[var6];
         var6 = 0;

         for(var9 = (Class526_Sub26)this.aClass702_1744.method8206((byte)65); var9 != null; var9 = (Class526_Sub26)this.aClass702_1744.method8181(1967701505)) {
            if(!var9.method9495()) {
               var8[var6++] = var9;
            }
         }

         while(var5 < var6) {
            for(int var13 = 0; var13 < var6; ++var13) {
               Class526_Sub26 var10 = var8[var13];
               if(var10.method9491() == var7) {
                  int var11 = var10.method9493();

                  for(int var12 = 0; var12 < var11; ++var12) {
                     this.aClass174_Sub2_1737.method8607(0, 0);
                     var10.method9513(var12, this.aClass124_Sub1Array1734[var3], this.aClass124_Sub1_1733, var2, var1);
                     if(var12 == var11 - 1 && var5 == var6 - 1) {
                        this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)(0 + this.anInt1735));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt1732, this.anInt1730);
                        OpenGL.glTexCoord2f(0.0F, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt1732, this.anInt1730 + var2);
                        OpenGL.glTexCoord2f((float)(0 + var1), (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt1732 + var1, this.anInt1730 + var2);
                        OpenGL.glTexCoord2f((float)(0 + var1), (float)(0 + this.anInt1735));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt1732 + var1, this.anInt1730);
                        OpenGL.glEnd();
                     } else {
                        this.aClass184_Sub2_Sub2_1729.method10454(var4);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)this.anInt1735);
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, var2);
                        OpenGL.glTexCoord2f((float)var1, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                        OpenGL.glVertex2i(var1, var2);
                        OpenGL.glTexCoord2f((float)var1, (float)this.anInt1735);
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                        OpenGL.glVertex2i(var1, 0);
                        OpenGL.glEnd();
                     }

                     var10.method9489(var12);
                     var4 = var4 + 1 & 1;
                     var3 = var3 + 1 & 1;
                  }

                  ++var5;
               }
            }

            ++var7;
         }

         this.aBool1736 = false;
         var8 = null;
      }
   }

   boolean method1847() {
      return this.aBool1736;
   }

   void method1848() {
      int var1 = 0;
      boolean var2 = false;
      Class166 var3 = Class166.aClass166_1884;

      for(Class526_Sub26 var4 = (Class526_Sub26)this.aClass702_1744.method8206((byte)43); var4 != null; var4 = (Class526_Sub26)this.aClass702_1744.method8181(1397929398)) {
         Class166 var5 = var4.method9498();
         if(var5.anInt1891 * 1990758583 > var3.anInt1891 * 1990758583) {
            var3 = var5;
         }

         var2 |= var4.method9492();
         var1 += var4.method9493();
      }

      if(var3 != this.aClass166_1728) {
         this.aClass166_1728 = var3;
         this.aBool1738 = true;
      }

      int var6 = this.anInt1742 > 2?2:this.anInt1742;
      int var7 = var1 > 2?2:var1;
      if(var6 != var7) {
         this.aBool1738 = true;
         this.aBool1740 = true;
      }

      if(var2 != this.aBool1746) {
         this.aBool1746 = var2;
         this.aBool1739 = true;
      }

      this.anInt1742 = var1;
   }

   void method1849() {
      this.aClass184_Sub2_Sub2_1729 = null;
      this.aClass184_Sub2_Sub2_1747 = null;
      this.aClass184_Sub2_Sub2_1731 = null;
      this.aClass526_Sub21_Sub1_1745 = null;
      this.aClass124_Sub1_1733 = null;
      this.aClass124_Sub1Array1734 = null;
      this.aClass526_Sub21_Sub1_1748 = null;
      if(!this.aClass702_1744.method8209(1691518131)) {
         for(Class526 var1 = this.aClass702_1744.method8206((byte)32); var1 != this.aClass702_1744.aClass526_8788; var1 = var1.aClass526_7157) {
            ((Class526_Sub26)var1).method9486();
         }
      }

      this.anInt1735 = 1;
      this.anInt1743 = 1;
   }

   boolean method1850() {
      return this.aClass184_Sub2_Sub2_1731 != null;
   }

   boolean method1851() {
      return this.aClass184_Sub2_Sub2_1731 != null;
   }

   boolean method1852() {
      return this.aBool1736;
   }

   boolean method1853(Class526_Sub26 var1) {
      if(this.aClass184_Sub2_Sub2_1731 != null) {
         if(var1.method9484() || var1.method9490()) {
            this.aClass702_1744.method8176(var1, -1469628728);
            this.method1848();
            if(var1.method9491() >= 0 && this.method1859()) {
               if(this.anInt1743 != -1 && this.anInt1735 != -1) {
                  var1.method9487(this.anInt1743, this.anInt1735);
               }

               var1.aBool10553 = true;
               return true;
            }
         }

         this.method1840(var1);
      }

      return false;
   }

   boolean method1854() {
      if(this.aBool1739) {
         if(this.aClass526_Sub21_Sub1_1745 != null) {
            this.aClass526_Sub21_Sub1_1745.method140();
            this.aClass526_Sub21_Sub1_1745 = null;
         }

         if(this.aClass124_Sub1_1733 != null) {
            this.aClass124_Sub1_1733.method1493();
            this.aClass124_Sub1_1733 = null;
         }
      }

      if(this.aBool1738) {
         if(this.aClass526_Sub21_Sub1_1748 != null) {
            this.aClass526_Sub21_Sub1_1748.method140();
            this.aClass526_Sub21_Sub1_1748 = null;
         }

         if(this.aClass124_Sub1Array1734[0] != null) {
            this.aClass124_Sub1Array1734[0].method1493();
            this.aClass124_Sub1Array1734[0] = null;
         }

         if(this.aClass124_Sub1Array1734[1] != null) {
            this.aClass124_Sub1Array1734[1].method1493();
            this.aClass124_Sub1Array1734[1] = null;
         }
      }

      if(this.aBool1739) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         if(this.aBool1746) {
            this.aClass124_Sub1_1733 = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         } else if(this.aClass526_Sub21_Sub1_1745 == null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         }

         this.aBool1739 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1738) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1748 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         this.aClass124_Sub1Array1734[0] = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735);
         this.aClass124_Sub1Array1734[1] = this.anInt1742 > 1?new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735):null;
         this.aBool1738 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1740) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1747, (short)128);
            this.aClass184_Sub2_Sub2_1747.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, this.aClass526_Sub21_Sub1_1748);
            this.aClass184_Sub2_Sub2_1747.method8476(this.aClass526_Sub21_Sub1_1745);
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
         } else {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            } else {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass526_Sub21_Sub1_1745);
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
         }

         this.aBool1740 = false;
         this.aBool1741 = true;
      }

      if(this.aBool1741) {
         this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1731, (short)128);
         this.aBool1741 = !this.aClass184_Sub2_Sub2_1731.method8466();
         this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1731, (byte)0);
      }

      return !this.aBool1741;
   }

   boolean method1855() {
      if(this.aBool1739) {
         if(this.aClass526_Sub21_Sub1_1745 != null) {
            this.aClass526_Sub21_Sub1_1745.method140();
            this.aClass526_Sub21_Sub1_1745 = null;
         }

         if(this.aClass124_Sub1_1733 != null) {
            this.aClass124_Sub1_1733.method1493();
            this.aClass124_Sub1_1733 = null;
         }
      }

      if(this.aBool1738) {
         if(this.aClass526_Sub21_Sub1_1748 != null) {
            this.aClass526_Sub21_Sub1_1748.method140();
            this.aClass526_Sub21_Sub1_1748 = null;
         }

         if(this.aClass124_Sub1Array1734[0] != null) {
            this.aClass124_Sub1Array1734[0].method1493();
            this.aClass124_Sub1Array1734[0] = null;
         }

         if(this.aClass124_Sub1Array1734[1] != null) {
            this.aClass124_Sub1Array1734[1].method1493();
            this.aClass124_Sub1Array1734[1] = null;
         }
      }

      if(this.aBool1739) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         if(this.aBool1746) {
            this.aClass124_Sub1_1733 = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         } else if(this.aClass526_Sub21_Sub1_1745 == null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         }

         this.aBool1739 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1738) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1748 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         this.aClass124_Sub1Array1734[0] = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735);
         this.aClass124_Sub1Array1734[1] = this.anInt1742 > 1?new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735):null;
         this.aBool1738 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1740) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1747, (short)128);
            this.aClass184_Sub2_Sub2_1747.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, this.aClass526_Sub21_Sub1_1748);
            this.aClass184_Sub2_Sub2_1747.method8476(this.aClass526_Sub21_Sub1_1745);
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
         } else {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            } else {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass526_Sub21_Sub1_1745);
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
         }

         this.aBool1740 = false;
         this.aBool1741 = true;
      }

      if(this.aBool1741) {
         this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1731, (short)128);
         this.aBool1741 = !this.aClass184_Sub2_Sub2_1731.method8466();
         this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1731, (byte)0);
      }

      return !this.aBool1741;
   }

   boolean method1856() {
      if(this.aBool1739) {
         if(this.aClass526_Sub21_Sub1_1745 != null) {
            this.aClass526_Sub21_Sub1_1745.method140();
            this.aClass526_Sub21_Sub1_1745 = null;
         }

         if(this.aClass124_Sub1_1733 != null) {
            this.aClass124_Sub1_1733.method1493();
            this.aClass124_Sub1_1733 = null;
         }
      }

      if(this.aBool1738) {
         if(this.aClass526_Sub21_Sub1_1748 != null) {
            this.aClass526_Sub21_Sub1_1748.method140();
            this.aClass526_Sub21_Sub1_1748 = null;
         }

         if(this.aClass124_Sub1Array1734[0] != null) {
            this.aClass124_Sub1Array1734[0].method1493();
            this.aClass124_Sub1Array1734[0] = null;
         }

         if(this.aClass124_Sub1Array1734[1] != null) {
            this.aClass124_Sub1Array1734[1].method1493();
            this.aClass124_Sub1Array1734[1] = null;
         }
      }

      if(this.aBool1739) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         if(this.aBool1746) {
            this.aClass124_Sub1_1733 = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         } else if(this.aClass526_Sub21_Sub1_1745 == null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         }

         this.aBool1739 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1738) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1748 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         this.aClass124_Sub1Array1734[0] = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735);
         this.aClass124_Sub1Array1734[1] = this.anInt1742 > 1?new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735):null;
         this.aBool1738 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1740) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1747, (short)128);
            this.aClass184_Sub2_Sub2_1747.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, this.aClass526_Sub21_Sub1_1748);
            this.aClass184_Sub2_Sub2_1747.method8476(this.aClass526_Sub21_Sub1_1745);
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
         } else {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            } else {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass526_Sub21_Sub1_1745);
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
         }

         this.aBool1740 = false;
         this.aBool1741 = true;
      }

      if(this.aBool1741) {
         this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1731, (short)128);
         this.aBool1741 = !this.aClass184_Sub2_Sub2_1731.method8466();
         this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1731, (byte)0);
      }

      return !this.aBool1741;
   }

   void method1857(int var1, int var2) {
      if(this.aBool1736) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method10454(0);
            this.aClass184_Sub2_Sub2_1747.method8470(0, 0, this.anInt1743, this.anInt1735, 0, 0, true, this.aBool1746);
         }

         this.aClass174_Sub2_1737.method8668();
         this.aClass174_Sub2_1737.method8651(0);
         this.aClass174_Sub2_1737.method8672(1);
         this.aClass174_Sub2_1737.method2278();
         int var3 = 0;
         int var4 = 1;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         Class526_Sub26[] var8 = null;

         Class526_Sub26 var9;
         for(var9 = (Class526_Sub26)this.aClass702_1744.method8206((byte)27); var9 != null; var9 = (Class526_Sub26)this.aClass702_1744.method8181(475978148)) {
            if(!var9.method9495()) {
               ++var6;
            }
         }

         var8 = new Class526_Sub26[var6];
         var6 = 0;

         for(var9 = (Class526_Sub26)this.aClass702_1744.method8206((byte)81); var9 != null; var9 = (Class526_Sub26)this.aClass702_1744.method8181(1930219655)) {
            if(!var9.method9495()) {
               var8[var6++] = var9;
            }
         }

         while(var5 < var6) {
            for(int var13 = 0; var13 < var6; ++var13) {
               Class526_Sub26 var10 = var8[var13];
               if(var10.method9491() == var7) {
                  int var11 = var10.method9493();

                  for(int var12 = 0; var12 < var11; ++var12) {
                     this.aClass174_Sub2_1737.method8607(0, 0);
                     var10.method9513(var12, this.aClass124_Sub1Array1734[var3], this.aClass124_Sub1_1733, var2, var1);
                     if(var12 == var11 - 1 && var5 == var6 - 1) {
                        this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)(0 + this.anInt1735));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt1732, this.anInt1730);
                        OpenGL.glTexCoord2f(0.0F, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt1732, this.anInt1730 + var2);
                        OpenGL.glTexCoord2f((float)(0 + var1), (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt1732 + var1, this.anInt1730 + var2);
                        OpenGL.glTexCoord2f((float)(0 + var1), (float)(0 + this.anInt1735));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt1732 + var1, this.anInt1730);
                        OpenGL.glEnd();
                     } else {
                        this.aClass184_Sub2_Sub2_1729.method10454(var4);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)this.anInt1735);
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, var2);
                        OpenGL.glTexCoord2f((float)var1, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                        OpenGL.glVertex2i(var1, var2);
                        OpenGL.glTexCoord2f((float)var1, (float)this.anInt1735);
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                        OpenGL.glVertex2i(var1, 0);
                        OpenGL.glEnd();
                     }

                     var10.method9489(var12);
                     var4 = var4 + 1 & 1;
                     var3 = var3 + 1 & 1;
                  }

                  ++var5;
               }
            }

            ++var7;
         }

         this.aBool1736 = false;
         var8 = null;
      }
   }

   void method1858(int var1, int var2) {
      if(this.aBool1736) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method10454(0);
            this.aClass184_Sub2_Sub2_1747.method8470(0, 0, this.anInt1743, this.anInt1735, 0, 0, true, this.aBool1746);
         }

         this.aClass174_Sub2_1737.method8668();
         this.aClass174_Sub2_1737.method8651(0);
         this.aClass174_Sub2_1737.method8672(1);
         this.aClass174_Sub2_1737.method2278();
         int var3 = 0;
         int var4 = 1;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         Class526_Sub26[] var8 = null;

         Class526_Sub26 var9;
         for(var9 = (Class526_Sub26)this.aClass702_1744.method8206((byte)104); var9 != null; var9 = (Class526_Sub26)this.aClass702_1744.method8181(-125129343)) {
            if(!var9.method9495()) {
               ++var6;
            }
         }

         var8 = new Class526_Sub26[var6];
         var6 = 0;

         for(var9 = (Class526_Sub26)this.aClass702_1744.method8206((byte)110); var9 != null; var9 = (Class526_Sub26)this.aClass702_1744.method8181(459915678)) {
            if(!var9.method9495()) {
               var8[var6++] = var9;
            }
         }

         while(var5 < var6) {
            for(int var13 = 0; var13 < var6; ++var13) {
               Class526_Sub26 var10 = var8[var13];
               if(var10.method9491() == var7) {
                  int var11 = var10.method9493();

                  for(int var12 = 0; var12 < var11; ++var12) {
                     this.aClass174_Sub2_1737.method8607(0, 0);
                     var10.method9513(var12, this.aClass124_Sub1Array1734[var3], this.aClass124_Sub1_1733, var2, var1);
                     if(var12 == var11 - 1 && var5 == var6 - 1) {
                        this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)(0 + this.anInt1735));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt1732, this.anInt1730);
                        OpenGL.glTexCoord2f(0.0F, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt1732, this.anInt1730 + var2);
                        OpenGL.glTexCoord2f((float)(0 + var1), (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.anInt1732 + var1, this.anInt1730 + var2);
                        OpenGL.glTexCoord2f((float)(0 + var1), (float)(0 + this.anInt1735));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.anInt1732 + var1, this.anInt1730);
                        OpenGL.glEnd();
                     } else {
                        this.aClass184_Sub2_Sub2_1729.method10454(var4);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)this.anInt1735);
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, var2);
                        OpenGL.glTexCoord2f((float)var1, (float)(this.anInt1735 - var2));
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                        OpenGL.glVertex2i(var1, var2);
                        OpenGL.glTexCoord2f((float)var1, (float)this.anInt1735);
                        OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                        OpenGL.glVertex2i(var1, 0);
                        OpenGL.glEnd();
                     }

                     var10.method9489(var12);
                     var4 = var4 + 1 & 1;
                     var3 = var3 + 1 & 1;
                  }

                  ++var5;
               }
            }

            ++var7;
         }

         this.aBool1736 = false;
         var8 = null;
      }
   }

   boolean method1859() {
      if(this.aBool1739) {
         if(this.aClass526_Sub21_Sub1_1745 != null) {
            this.aClass526_Sub21_Sub1_1745.method140();
            this.aClass526_Sub21_Sub1_1745 = null;
         }

         if(this.aClass124_Sub1_1733 != null) {
            this.aClass124_Sub1_1733.method1493();
            this.aClass124_Sub1_1733 = null;
         }
      }

      if(this.aBool1738) {
         if(this.aClass526_Sub21_Sub1_1748 != null) {
            this.aClass526_Sub21_Sub1_1748.method140();
            this.aClass526_Sub21_Sub1_1748 = null;
         }

         if(this.aClass124_Sub1Array1734[0] != null) {
            this.aClass124_Sub1Array1734[0].method1493();
            this.aClass124_Sub1Array1734[0] = null;
         }

         if(this.aClass124_Sub1Array1734[1] != null) {
            this.aClass124_Sub1Array1734[1].method1493();
            this.aClass124_Sub1Array1734[1] = null;
         }
      }

      if(this.aBool1739) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         if(this.aBool1746) {
            this.aClass124_Sub1_1733 = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         } else if(this.aClass526_Sub21_Sub1_1745 == null) {
            this.aClass526_Sub21_Sub1_1745 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1684, Class166.aClass166_1889, this.anInt1743, this.anInt1735);
         }

         this.aBool1739 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1738) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass526_Sub21_Sub1_1748 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1737, Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735, this.aClass174_Sub2_1737.anInt9612);
         }

         this.aClass124_Sub1Array1734[0] = new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735);
         this.aClass124_Sub1Array1734[1] = this.anInt1742 > 1?new Class124_Sub1(this.aClass174_Sub2_1737, '\u84f5', Class144.aClass144_1680, this.aClass166_1728, this.anInt1743, this.anInt1735):null;
         this.aBool1738 = false;
         this.aBool1740 = true;
         this.aBool1741 = true;
      }

      if(this.aBool1740) {
         if(this.aClass184_Sub2_Sub2_1747 != null) {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1747, (short)128);
            this.aClass184_Sub2_Sub2_1747.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1747.method8465(0, this.aClass526_Sub21_Sub1_1748);
            this.aClass184_Sub2_Sub2_1747.method8476(this.aClass526_Sub21_Sub1_1745);
            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1747, (byte)0);
         } else {
            this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1729, (short)128);
            this.aClass184_Sub2_Sub2_1729.method8476((Interface23)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(1, (Interface21)null);
            this.aClass184_Sub2_Sub2_1729.method8465(0, this.aClass124_Sub1Array1734[0].method8334(0));
            this.aClass184_Sub2_Sub2_1729.method8465(1, this.anInt1742 > 1?this.aClass124_Sub1Array1734[1].method8334(0):null);
            if(this.aBool1746) {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass124_Sub1_1733.method8333(0));
            } else {
               this.aClass184_Sub2_Sub2_1729.method8476(this.aClass526_Sub21_Sub1_1745);
            }

            this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1729, (byte)0);
         }

         this.aBool1740 = false;
         this.aBool1741 = true;
      }

      if(this.aBool1741) {
         this.aClass174_Sub2_1737.method2623(this.aClass184_Sub2_Sub2_1731, (short)128);
         this.aBool1741 = !this.aClass184_Sub2_Sub2_1731.method8466();
         this.aClass174_Sub2_1737.method2456(this.aClass184_Sub2_Sub2_1731, (byte)0);
      }

      return !this.aBool1741;
   }

   void method1860() {
      this.aClass184_Sub2_Sub2_1729 = null;
      this.aClass184_Sub2_Sub2_1747 = null;
      this.aClass184_Sub2_Sub2_1731 = null;
      this.aClass526_Sub21_Sub1_1745 = null;
      this.aClass124_Sub1_1733 = null;
      this.aClass124_Sub1Array1734 = null;
      this.aClass526_Sub21_Sub1_1748 = null;
      if(!this.aClass702_1744.method8209(-962752599)) {
         for(Class526 var1 = this.aClass702_1744.method8206((byte)66); var1 != this.aClass702_1744.aClass526_8788; var1 = var1.aClass526_7157) {
            ((Class526_Sub26)var1).method9486();
         }
      }

      this.anInt1735 = 1;
      this.anInt1743 = 1;
   }

   void method1861() {
      int var1 = 0;
      boolean var2 = false;
      Class166 var3 = Class166.aClass166_1884;

      for(Class526_Sub26 var4 = (Class526_Sub26)this.aClass702_1744.method8206((byte)121); var4 != null; var4 = (Class526_Sub26)this.aClass702_1744.method8181(921303966)) {
         Class166 var5 = var4.method9498();
         if(var5.anInt1891 * 1990758583 > var3.anInt1891 * 1990758583) {
            var3 = var5;
         }

         var2 |= var4.method9492();
         var1 += var4.method9493();
      }

      if(var3 != this.aClass166_1728) {
         this.aClass166_1728 = var3;
         this.aBool1738 = true;
      }

      int var6 = this.anInt1742 > 2?2:this.anInt1742;
      int var7 = var1 > 2?2:var1;
      if(var6 != var7) {
         this.aBool1738 = true;
         this.aBool1740 = true;
      }

      if(var2 != this.aBool1746) {
         this.aBool1746 = var2;
         this.aBool1739 = true;
      }

      this.anInt1742 = var1;
   }
}
