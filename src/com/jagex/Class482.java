package com.jagex;

import com.jagex.Class165;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class32;
import com.jagex.Class361;
import com.jagex.Class387;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class461;
import com.jagex.Class475;
import com.jagex.Class478;
import com.jagex.Class479;
import com.jagex.Class495;
import com.jagex.Class526_Sub21_Sub4;
import com.jagex.LinkableObject;
import com.jagex.Class590;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class639_Sub1_Sub2_Sub4;
import com.jagex.Class645;
import com.jagex.Class681;
import com.jagex.Class682;
import com.jagex.Interface56;
import com.jagex.Interface70;
import com.jagex.client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class482 {
   public static int anInt5484;
   Class478 aClass478_5466;
   boolean aBool5468;
   Interface56 anInterface56_5476;
   Object anObject5474;
   float aFloat5475;
   int anInt5482;
   Object anObject5481;
   int anInt5472;
   float aFloat5471;
   boolean aBool5480;
   int anInt5479;
   boolean aBool5473;
   int anInt5467;
   Interface70 anInterface70_5469;
   Class446 aClass446_5465;
   float aFloat5477;
   float aFloat5478;
   Class361 aClass361_5483;
   List aList5470;

   public Class478 method5765(int var1) {
      return this.aClass478_5466;
   }

   public void method5766() {
      if(Class478.aClass478_5395 != this.aClass478_5466 && Class478.aClass478_5396 != this.aClass478_5466) {
         this.method5770(0, -938617916);
      }

      Iterator var1 = this.aList5470.iterator();

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2138406178) != this) {
            var1.remove();
         } else {
            var2.method5724(301018015);
         }
      }

      this.method5809((byte)67);
      this.aClass478_5466 = Class478.aClass478_5389;
   }

   public void method5767() {
      Iterator var1 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5395;

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2141897747) == this) {
            var2.method5681((short)8448);
         }
      }

   }

   public float method5768() {
      return this.aFloat5478;
   }

   public void method5769(int var1) {
      if(Class478.aClass478_5397 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5389 && Class478.aClass478_5390 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5392) {
         if((Class478.aClass478_5391 == this.aClass478_5466 || Class478.aClass478_5393 == this.aClass478_5466) && !this.aBool5468) {
            this.aBool5468 = true;
         } else if(this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5391.anInt5399 || 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5395.anInt5399 * 12115005) {
            this.aClass478_5466 = Class478.aClass478_5391;
            this.aBool5468 = true;
         }
      }
   }

   public void method5770(int var1, int var2) {
      if(this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
         if(12115005 * this.aClass478_5466.anInt5399 < Class478.aClass478_5394.anInt5399 * 12115005) {
            this.aClass478_5466 = Class478.aClass478_5395;
            this.aBool5468 = false;
         } else {
            Iterator var3;
            Class479 var4;
            if(var1 <= 0) {
               var3 = this.aList5470.iterator();

               while(var3.hasNext()) {
                  var4 = (Class479)var3.next();
                  if(var4.method5705(2145422124) != this) {
                     var3.remove();
                  } else {
                     var4.method5680(-200345854);
                  }
               }

               this.aClass478_5466 = Class478.aClass478_5395;
               this.aBool5468 = false;
            } else {
               this.aClass478_5466 = Class478.aClass478_5392;
               var3 = this.aList5470.iterator();

               while(var3.hasNext()) {
                  var4 = (Class479)var3.next();
                  if(var4.method5705(2132510922) != this) {
                     var3.remove();
                  } else {
                     var4.method5676(0.0F, var1, (byte)-103);
                  }
               }
            }

         }
      }
   }

   public void method5771(int var1) {
      Iterator var2 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5395;

      while(var2.hasNext()) {
         Class479 var3 = (Class479)var2.next();
         if(var3.method5705(2136306976) == this) {
            var3.method5681((short)8448);
         }
      }

   }

   public void method5772(byte var1) {
      Iterator var2 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5391;

      while(var2.hasNext()) {
         Class479 var3 = (Class479)var2.next();
         if(var3.method5705(2137921811) == this) {
            var3.method5693((byte)2);
         }
      }

   }

   public void method5773(Interface56 var1, int var2) {
      this.anInterface56_5476 = var1;
   }

   public void method5774(byte var1) {
      if(this.aClass478_5466 == Class478.aClass478_5391) {
         Class590 var2 = this.anInterface70_5469.method443(-1209071306);
         if(var2 == Class590.aClass590_7805) {
            this.aClass478_5466 = Class478.aClass478_5393;
         }
      }

      boolean var3;
      if(Class478.aClass478_5393 == this.aClass478_5466 && this.aBool5468) {
         Class479 var6 = this.aClass361_5483.method4612(this.anInterface70_5469.method448(1841664797), -1496755144);
         if(var6 != null) {
            var3 = this.anInterface70_5469.method465(-1653274348);
            Class495 var4 = new Class495(this);
            boolean var5 = var6.method5678(var3?null:this.anInterface70_5469.method446(0, (byte)0), var3?var4:null, -776441955 * this.anInt5472, this.anInt5482 * 573814113 > 0?0.0F:this.aFloat5475, false, this.aBool5473, this.anInt5467 * 646234605, this.aFloat5471, this, 1094722505);
            if(var5) {
               this.aClass478_5466 = Class478.aClass478_5394;
               var6.method5708(this.anInterface56_5476, 2085900915);
               var6.method5676(this.aFloat5475, this.anInt5482 * 573814113, (byte)-77);
               var6.method5679(-1843302257);
               this.aList5470.add(var6);
               this.aBool5468 = false;
            } else {
               if(var6.method5670(-844793101) == Class475.aClass475_5383) {
                  this.aClass478_5466 = Class478.aClass478_5396;
               }

               var6.method5724(301018015);
            }
         }
      }

      Iterator var7 = this.aList5470.iterator();
      var3 = true;

      while(true) {
         while(var7.hasNext()) {
            Class479 var8 = (Class479)var7.next();
            if(var8.method5705(2147145873) != this) {
               var7.remove();
            } else {
               if(Class478.aClass478_5392 == this.aClass478_5466) {
                  if(var8.method5677(1333049379) == 0.0F) {
                     var8.method5680(-200345854);
                  } else {
                     var3 = false;
                  }
               }

               if(!var8.method5675(182214513) && !var8.method5672((byte)-3)) {
                  var3 = false;
               } else {
                  var8.method5724(301018015);
                  var7.remove();
               }
            }
         }

         if(var3 && 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5394.anInt5399 * 12115005 && this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
            if(Class478.aClass478_5392 == this.aClass478_5466) {
               this.aClass478_5466 = Class478.aClass478_5395;
            } else {
               this.aClass478_5466 = Class478.aClass478_5396;
            }
         }

         return;
      }
   }

   public Object method5775(int var1) {
      return this.anObject5474;
   }

   public void method5776(Object var1, int var2) {
      this.anObject5474 = var1;
   }

   public void method5777(float var1, int var2, int var3) {
      this.aFloat5475 = var1;
      int var4 = 0;
      Iterator var5 = this.aList5470.iterator();

      while(var5.hasNext()) {
         Class479 var6 = (Class479)var5.next();
         if(var6.method5705(2142852531) != this) {
            this.aList5470.remove(var6);
         } else {
            var6.method5676(this.aFloat5475, var2, (byte)-16);
            ++var4;
         }
      }

      if(var4 == 0) {
         this.anInt5482 = 571715233 * var2;
      }

   }

   public void method5778(Object var1, byte var2) {
      this.anObject5481 = var1;
   }

   public Object method5779(byte var1) {
      return this.anObject5481;
   }

   public int method5780(int var1) {
      return this.anInt5472 * -776441955;
   }

   public void method5781(int var1, byte var2) {
      this.anInt5472 = var1 * 242257589;
   }

   public void method5782(boolean var1, int var2) {
   }

   public void method5783(float var1) {
      if(var1 >= 0.0F) {
         this.aFloat5471 = var1;
      }
   }

   public Class446 method5784(int var1) {
      return this.aClass446_5465;
   }

   public float method5785(short var1) {
      return this.aFloat5477;
   }

   public void method5786(int var1) {
      if(this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
         if(12115005 * this.aClass478_5466.anInt5399 < Class478.aClass478_5394.anInt5399 * 12115005) {
            this.aClass478_5466 = Class478.aClass478_5395;
            this.aBool5468 = false;
         } else {
            Iterator var2;
            Class479 var3;
            if(var1 <= 0) {
               var2 = this.aList5470.iterator();

               while(var2.hasNext()) {
                  var3 = (Class479)var2.next();
                  if(var3.method5705(2145520585) != this) {
                     var2.remove();
                  } else {
                     var3.method5680(-200345854);
                  }
               }

               this.aClass478_5466 = Class478.aClass478_5395;
               this.aBool5468 = false;
            } else {
               this.aClass478_5466 = Class478.aClass478_5392;
               var2 = this.aList5470.iterator();

               while(var2.hasNext()) {
                  var3 = (Class479)var2.next();
                  if(var3.method5705(2147021773) != this) {
                     var2.remove();
                  } else {
                     var3.method5676(0.0F, var1, (byte)-14);
                  }
               }
            }

         }
      }
   }

   public void method5787() {
      if(this.aClass478_5466 == Class478.aClass478_5391) {
         Class590 var1 = this.anInterface70_5469.method443(-993708229);
         if(var1 == Class590.aClass590_7805) {
            this.aClass478_5466 = Class478.aClass478_5393;
         }
      }

      boolean var2;
      if(Class478.aClass478_5393 == this.aClass478_5466 && this.aBool5468) {
         Class479 var5 = this.aClass361_5483.method4612(this.anInterface70_5469.method448(243285587), -1533125070);
         if(var5 != null) {
            var2 = this.anInterface70_5469.method465(-1865082783);
            Class495 var3 = new Class495(this);
            boolean var4 = var5.method5678(var2?null:this.anInterface70_5469.method446(0, (byte)0), var2?var3:null, -776441955 * this.anInt5472, this.anInt5482 * 573814113 > 0?0.0F:this.aFloat5475, false, this.aBool5473, this.anInt5467 * 646234605, this.aFloat5471, this, 209982038);
            if(var4) {
               this.aClass478_5466 = Class478.aClass478_5394;
               var5.method5708(this.anInterface56_5476, 1830619104);
               var5.method5676(this.aFloat5475, this.anInt5482 * 573814113, (byte)-68);
               var5.method5679(-388579159);
               this.aList5470.add(var5);
               this.aBool5468 = false;
            } else {
               if(var5.method5670(507224250) == Class475.aClass475_5383) {
                  this.aClass478_5466 = Class478.aClass478_5396;
               }

               var5.method5724(301018015);
            }
         }
      }

      Iterator var6 = this.aList5470.iterator();
      var2 = true;

      while(true) {
         while(var6.hasNext()) {
            Class479 var7 = (Class479)var6.next();
            if(var7.method5705(2139559132) != this) {
               var6.remove();
            } else {
               if(Class478.aClass478_5392 == this.aClass478_5466) {
                  if(var7.method5677(882880448) == 0.0F) {
                     var7.method5680(-200345854);
                  } else {
                     var2 = false;
                  }
               }

               if(!var7.method5675(182214513) && !var7.method5672((byte)-58)) {
                  var2 = false;
               } else {
                  var7.method5724(301018015);
                  var6.remove();
               }
            }
         }

         if(var2 && 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5394.anInt5399 * 12115005 && this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
            if(Class478.aClass478_5392 == this.aClass478_5466) {
               this.aClass478_5466 = Class478.aClass478_5395;
            } else {
               this.aClass478_5466 = Class478.aClass478_5396;
            }
         }

         return;
      }
   }

   public void method5788(float var1) {
      if(var1 >= 0.0F) {
         this.aFloat5471 = var1;
      }
   }

   public void method5789(int var1, boolean var2, int var3) {
      this.aBool5480 = var2;
      this.anInt5479 = var1 * -1784350195;
   }

   public boolean method5790(int var1) {
      this.aBool5480 = false;
      return -256318267 * this.anInt5479 != 0;
   }

   public float method5791(int var1) {
      return this.aFloat5478;
   }

   public void method5792() {
      if(this.aClass478_5466 == Class478.aClass478_5391) {
         Class590 var1 = this.anInterface70_5469.method443(-882123586);
         if(var1 == Class590.aClass590_7805) {
            this.aClass478_5466 = Class478.aClass478_5393;
         }
      }

      boolean var2;
      if(Class478.aClass478_5393 == this.aClass478_5466 && this.aBool5468) {
         Class479 var5 = this.aClass361_5483.method4612(this.anInterface70_5469.method448(-1239865483), -1642864401);
         if(var5 != null) {
            var2 = this.anInterface70_5469.method465(-1442726631);
            Class495 var3 = new Class495(this);
            boolean var4 = var5.method5678(var2?null:this.anInterface70_5469.method446(0, (byte)0), var2?var3:null, -776441955 * this.anInt5472, this.anInt5482 * 573814113 > 0?0.0F:this.aFloat5475, false, this.aBool5473, this.anInt5467 * 646234605, this.aFloat5471, this, -1619631248);
            if(var4) {
               this.aClass478_5466 = Class478.aClass478_5394;
               var5.method5708(this.anInterface56_5476, 1871697889);
               var5.method5676(this.aFloat5475, this.anInt5482 * 573814113, (byte)-75);
               var5.method5679(-2103678761);
               this.aList5470.add(var5);
               this.aBool5468 = false;
            } else {
               if(var5.method5670(179591711) == Class475.aClass475_5383) {
                  this.aClass478_5466 = Class478.aClass478_5396;
               }

               var5.method5724(301018015);
            }
         }
      }

      Iterator var6 = this.aList5470.iterator();
      var2 = true;

      while(true) {
         while(var6.hasNext()) {
            Class479 var7 = (Class479)var6.next();
            if(var7.method5705(2134784754) != this) {
               var6.remove();
            } else {
               if(Class478.aClass478_5392 == this.aClass478_5466) {
                  if(var7.method5677(-628441114) == 0.0F) {
                     var7.method5680(-200345854);
                  } else {
                     var2 = false;
                  }
               }

               if(!var7.method5675(182214513) && !var7.method5672((byte)-40)) {
                  var2 = false;
               } else {
                  var7.method5724(301018015);
                  var6.remove();
               }
            }
         }

         if(var2 && 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5394.anInt5399 * 12115005 && this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
            if(Class478.aClass478_5392 == this.aClass478_5466) {
               this.aClass478_5466 = Class478.aClass478_5395;
            } else {
               this.aClass478_5466 = Class478.aClass478_5396;
            }
         }

         return;
      }
   }

   public void method5793(boolean var1, int var2, int var3) {
      this.aBool5473 = var1;
      this.anInt5467 = var2 * 79938533;
   }

   public void method5794(float var1, byte var2) {
      if(var1 >= 0.0F) {
         this.aFloat5471 = var1;
      }
   }

   void method5795() {
      this.anInterface70_5469 = null;
      this.aClass478_5466 = Class478.aClass478_5390;
      this.aBool5468 = false;
      this.aList5470.clear();
      this.anObject5474 = null;
      this.aClass446_5465 = null;
      this.anInt5472 = -242257589;
      this.aBool5473 = false;
      this.anInt5467 = 0;
      this.aFloat5475 = 0.0F;
      this.anInterface56_5476 = null;
      this.aFloat5477 = 0.0F;
      this.aFloat5478 = 0.0F;
      this.anInt5479 = 0;
      this.aBool5480 = false;
      this.anObject5481 = null;
      this.anInt5482 = 0;
      this.aFloat5471 = 1.0F;
   }

   void method5796() {
      this.anInterface70_5469 = null;
      this.aClass478_5466 = Class478.aClass478_5390;
      this.aBool5468 = false;
      this.aList5470.clear();
      this.anObject5474 = null;
      this.aClass446_5465 = null;
      this.anInt5472 = -242257589;
      this.aBool5473 = false;
      this.anInt5467 = 0;
      this.aFloat5475 = 0.0F;
      this.anInterface56_5476 = null;
      this.aFloat5477 = 0.0F;
      this.aFloat5478 = 0.0F;
      this.anInt5479 = 0;
      this.aBool5480 = false;
      this.anObject5481 = null;
      this.anInt5482 = 0;
      this.aFloat5471 = 1.0F;
   }

   public void method5797(Class446 var1, short var2) {
      this.aClass446_5465 = var1;
   }

   public void method5798() {
      Iterator var1 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5391;

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2146006116) == this) {
            var2.method5693((byte)27);
         }
      }

   }

   public void method5799() {
      if(Class478.aClass478_5397 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5389 && Class478.aClass478_5390 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5392) {
         if((Class478.aClass478_5391 == this.aClass478_5466 || Class478.aClass478_5393 == this.aClass478_5466) && !this.aBool5468) {
            this.aBool5468 = true;
         } else if(this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5391.anInt5399 || 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5395.anInt5399 * 12115005) {
            this.aClass478_5466 = Class478.aClass478_5391;
            this.aBool5468 = true;
         }
      }
   }

   public void method5800() {
      if(Class478.aClass478_5397 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5389 && Class478.aClass478_5390 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5392) {
         if((Class478.aClass478_5391 == this.aClass478_5466 || Class478.aClass478_5393 == this.aClass478_5466) && !this.aBool5468) {
            this.aBool5468 = true;
         } else if(this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5391.anInt5399 || 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5395.anInt5399 * 12115005) {
            this.aClass478_5466 = Class478.aClass478_5391;
            this.aBool5468 = true;
         }
      }
   }

   public void method5801(int var1) {
      if(this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
         if(12115005 * this.aClass478_5466.anInt5399 < Class478.aClass478_5394.anInt5399 * 12115005) {
            this.aClass478_5466 = Class478.aClass478_5395;
            this.aBool5468 = false;
         } else {
            Iterator var2;
            Class479 var3;
            if(var1 <= 0) {
               var2 = this.aList5470.iterator();

               while(var2.hasNext()) {
                  var3 = (Class479)var2.next();
                  if(var3.method5705(2137247670) != this) {
                     var2.remove();
                  } else {
                     var3.method5680(-200345854);
                  }
               }

               this.aClass478_5466 = Class478.aClass478_5395;
               this.aBool5468 = false;
            } else {
               this.aClass478_5466 = Class478.aClass478_5392;
               var2 = this.aList5470.iterator();

               while(var2.hasNext()) {
                  var3 = (Class479)var2.next();
                  if(var3.method5705(2139912139) != this) {
                     var2.remove();
                  } else {
                     var3.method5676(0.0F, var1, (byte)-11);
                  }
               }
            }

         }
      }
   }

   public void method5802() {
      if(Class478.aClass478_5395 != this.aClass478_5466 && Class478.aClass478_5396 != this.aClass478_5466) {
         this.method5770(0, -938617916);
      }

      Iterator var1 = this.aList5470.iterator();

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2139590689) != this) {
            var1.remove();
         } else {
            var2.method5724(301018015);
         }
      }

      this.method5809((byte)35);
      this.aClass478_5466 = Class478.aClass478_5389;
   }

   public void method5803() {
      Iterator var1 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5391;

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2137798334) == this) {
            var2.method5693((byte)28);
         }
      }

   }

   public void method5804(float var1, byte var2) {
      this.aFloat5478 = var1;
   }

   public void method5805(int var1) {
      if(!this.aBool5468) {
         if(this.aClass478_5466 != Class478.aClass478_5397 && Class478.aClass478_5389 != this.aClass478_5466 && Class478.aClass478_5390 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5392) {
            if(this.aClass478_5466.anInt5399 * 12115005 <= Class478.aClass478_5398.anInt5399 * 12115005 || 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5395.anInt5399 * 12115005) {
               this.aClass478_5466 = Class478.aClass478_5391;
            }
         }
      }
   }

   public void method5806() {
      Iterator var1 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5395;

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2138641196) == this) {
            var2.method5681((short)8448);
         }
      }

   }

   public void method5807(byte var1) {
      if(Class478.aClass478_5395 != this.aClass478_5466 && Class478.aClass478_5396 != this.aClass478_5466) {
         this.method5770(0, -938617916);
      }

      Iterator var2 = this.aList5470.iterator();

      while(var2.hasNext()) {
         Class479 var3 = (Class479)var2.next();
         if(var3.method5705(2140223674) != this) {
            var2.remove();
         } else {
            var3.method5724(301018015);
         }
      }

      this.method5809((byte)21);
      this.aClass478_5466 = Class478.aClass478_5389;
   }

   public void method5808() {
      if(this.aClass478_5466 == Class478.aClass478_5391) {
         Class590 var1 = this.anInterface70_5469.method443(-305195568);
         if(var1 == Class590.aClass590_7805) {
            this.aClass478_5466 = Class478.aClass478_5393;
         }
      }

      boolean var2;
      if(Class478.aClass478_5393 == this.aClass478_5466 && this.aBool5468) {
         Class479 var5 = this.aClass361_5483.method4612(this.anInterface70_5469.method448(-762572601), -1708084021);
         if(var5 != null) {
            var2 = this.anInterface70_5469.method465(-1564672727);
            Class495 var3 = new Class495(this);
            boolean var4 = var5.method5678(var2?null:this.anInterface70_5469.method446(0, (byte)0), var2?var3:null, -776441955 * this.anInt5472, this.anInt5482 * 573814113 > 0?0.0F:this.aFloat5475, false, this.aBool5473, this.anInt5467 * 646234605, this.aFloat5471, this, -1083431007);
            if(var4) {
               this.aClass478_5466 = Class478.aClass478_5394;
               var5.method5708(this.anInterface56_5476, 1768873081);
               var5.method5676(this.aFloat5475, this.anInt5482 * 573814113, (byte)-16);
               var5.method5679(5942958);
               this.aList5470.add(var5);
               this.aBool5468 = false;
            } else {
               if(var5.method5670(1635912301) == Class475.aClass475_5383) {
                  this.aClass478_5466 = Class478.aClass478_5396;
               }

               var5.method5724(301018015);
            }
         }
      }

      Iterator var6 = this.aList5470.iterator();
      var2 = true;

      while(true) {
         while(var6.hasNext()) {
            Class479 var7 = (Class479)var6.next();
            if(var7.method5705(2133984313) != this) {
               var6.remove();
            } else {
               if(Class478.aClass478_5392 == this.aClass478_5466) {
                  if(var7.method5677(-94193729) == 0.0F) {
                     var7.method5680(-200345854);
                  } else {
                     var2 = false;
                  }
               }

               if(!var7.method5675(182214513) && !var7.method5672((byte)-1)) {
                  var2 = false;
               } else {
                  var7.method5724(301018015);
                  var6.remove();
               }
            }
         }

         if(var2 && 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5394.anInt5399 * 12115005 && this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
            if(Class478.aClass478_5392 == this.aClass478_5466) {
               this.aClass478_5466 = Class478.aClass478_5395;
            } else {
               this.aClass478_5466 = Class478.aClass478_5396;
            }
         }

         return;
      }
   }

   void method5809(byte var1) {
      this.anInterface70_5469 = null;
      this.aClass478_5466 = Class478.aClass478_5390;
      this.aBool5468 = false;
      this.aList5470.clear();
      this.anObject5474 = null;
      this.aClass446_5465 = null;
      this.anInt5472 = -242257589;
      this.aBool5473 = false;
      this.anInt5467 = 0;
      this.aFloat5475 = 0.0F;
      this.anInterface56_5476 = null;
      this.aFloat5477 = 0.0F;
      this.aFloat5478 = 0.0F;
      this.anInt5479 = 0;
      this.aBool5480 = false;
      this.anObject5481 = null;
      this.anInt5482 = 0;
      this.aFloat5471 = 1.0F;
   }

   public void method5810(int var1) {
      if(-256318267 * this.anInt5479 > -1 && !this.aBool5480) {
         this.anInt5479 -= -1784350195;
      }

      if(-256318267 * this.anInt5479 == 0) {
         this.method5769(-2126182436);
      }

   }

   public void method5811(Interface70 var1, byte var2) {
      this.anInterface70_5469 = var1;
      this.aFloat5475 = 0.0F;
      this.aClass478_5466 = Class478.aClass478_5398;
   }

   public void method5812(float var1, byte var2) {
      this.aFloat5477 = var1;
   }

   public int method5813() {
      return this.anInt5472 * -776441955;
   }

   public void method5814(int var1) {
      this.anInt5472 = var1 * 242257589;
   }

   public void method5815(int var1) {
      this.anInt5472 = var1 * 242257589;
   }

   public void method5816() {
      if(!this.aBool5468) {
         if(this.aClass478_5466 != Class478.aClass478_5397 && Class478.aClass478_5389 != this.aClass478_5466 && Class478.aClass478_5390 != this.aClass478_5466 && this.aClass478_5466 != Class478.aClass478_5392) {
            if(this.aClass478_5466.anInt5399 * 12115005 <= Class478.aClass478_5398.anInt5399 * 12115005 || 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5395.anInt5399 * 12115005) {
               this.aClass478_5466 = Class478.aClass478_5391;
            }
         }
      }
   }

   public float method5817() {
      return this.aFloat5478;
   }

   public float method5818() {
      return this.aFloat5478;
   }

   public float method5819() {
      return this.aFloat5478;
   }

   public Interface70 method5820(int var1) {
      return this.anInterface70_5469;
   }

   public Class482(Class361 var1) {
      this.aClass478_5466 = Class478.aClass478_5390;
      this.aBool5468 = false;
      this.anInt5482 = 0;
      this.aClass361_5483 = var1;
      this.aList5470 = new ArrayList();
   }

   public void method5821() {
      if(-256318267 * this.anInt5479 > -1 && !this.aBool5480) {
         this.anInt5479 -= -1784350195;
      }

      if(-256318267 * this.anInt5479 == 0) {
         this.method5769(-2127746055);
      }

   }

   public void method5822() {
      if(this.aClass478_5466 == Class478.aClass478_5391) {
         Class590 var1 = this.anInterface70_5469.method443(-1135783788);
         if(var1 == Class590.aClass590_7805) {
            this.aClass478_5466 = Class478.aClass478_5393;
         }
      }

      boolean var2;
      if(Class478.aClass478_5393 == this.aClass478_5466 && this.aBool5468) {
         Class479 var5 = this.aClass361_5483.method4612(this.anInterface70_5469.method448(1133493409), -1798704511);
         if(var5 != null) {
            var2 = this.anInterface70_5469.method465(-2062245216);
            Class495 var3 = new Class495(this);
            boolean var4 = var5.method5678(var2?null:this.anInterface70_5469.method446(0, (byte)0), var2?var3:null, -776441955 * this.anInt5472, this.anInt5482 * 573814113 > 0?0.0F:this.aFloat5475, false, this.aBool5473, this.anInt5467 * 646234605, this.aFloat5471, this, 352552408);
            if(var4) {
               this.aClass478_5466 = Class478.aClass478_5394;
               var5.method5708(this.anInterface56_5476, 1498260870);
               var5.method5676(this.aFloat5475, this.anInt5482 * 573814113, (byte)2);
               var5.method5679(-1989204065);
               this.aList5470.add(var5);
               this.aBool5468 = false;
            } else {
               if(var5.method5670(2111102910) == Class475.aClass475_5383) {
                  this.aClass478_5466 = Class478.aClass478_5396;
               }

               var5.method5724(301018015);
            }
         }
      }

      Iterator var6 = this.aList5470.iterator();
      var2 = true;

      while(true) {
         while(var6.hasNext()) {
            Class479 var7 = (Class479)var6.next();
            if(var7.method5705(2144669322) != this) {
               var6.remove();
            } else {
               if(Class478.aClass478_5392 == this.aClass478_5466) {
                  if(var7.method5677(-2129785201) == 0.0F) {
                     var7.method5680(-200345854);
                  } else {
                     var2 = false;
                  }
               }

               if(!var7.method5675(182214513) && !var7.method5672((byte)-26)) {
                  var2 = false;
               } else {
                  var7.method5724(301018015);
                  var6.remove();
               }
            }
         }

         if(var2 && 12115005 * this.aClass478_5466.anInt5399 >= Class478.aClass478_5394.anInt5399 * 12115005 && this.aClass478_5466.anInt5399 * 12115005 < 12115005 * Class478.aClass478_5395.anInt5399) {
            if(Class478.aClass478_5392 == this.aClass478_5466) {
               this.aClass478_5466 = Class478.aClass478_5395;
            } else {
               this.aClass478_5466 = Class478.aClass478_5396;
            }
         }

         return;
      }
   }

   public void method5823() {
      Iterator var1 = this.aList5470.iterator();
      this.aClass478_5466 = Class478.aClass478_5395;

      while(var1.hasNext()) {
         Class479 var2 = (Class479)var1.next();
         if(var2.method5705(2133193714) == this) {
            var2.method5681((short)8448);
         }
      }

   }

   public void method5824(float var1) {
      if(var1 >= 0.0F) {
         this.aFloat5471 = var1;
      }
   }

   static final void method5825(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-14);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class461.method5471(var3, var4, var0, (byte)-55);
   }

   static final void method5826(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-34);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2510 * -99858407;
   }

   static final void method5827(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class165.method1931(var2, false, -86865730);
   }

   static final void method5828(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class32.anInt345 * 1197569659;
   }

   static final void method5829(Class681 var0, int var1) {
      boolean var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class682.method8033(var2, -1656927104);
   }

   static final void method5830(int var0) {
      for(Class526_Sub21_Sub4 var1 = (Class526_Sub21_Sub4)client.aClass702_11173.method8206((byte)108); var1 != null; var1 = (Class526_Sub21_Sub4)client.aClass702_11173.method8181(337560496)) {
         Class639_Sub1_Sub2_Sub4 var2 = var1.aClass639_Sub1_Sub2_Sub4_11620;
         if(client.anInt11012 > var2.anInt12111 * -1422153107) {
            var1.method6332(-1949449864);
            var2.method10930((byte)75);
         } else if(client.anInt11012 >= 154873325 * var2.anInt12110) {
            var2.method10926((byte)-5);
            Class446 var5;
            if(1116936527 * var2.anInt12115 > 0) {
               if(client.anInt11073 * 378016543 == 4) {
                  Class639_Sub1_Sub2_Sub1 var3 = Class645.aClass207Array8445[1116936527 * var2.anInt12115 - 1].method2913((byte)114);
                  if(null != var3) {
                     Class446 var4 = var3.method7635().aClass446_4816;
                     if((int)var4.aFloat4917 >= 0 && (int)var4.aFloat4917 < client.aClass505_11204.method6056(-1746741811) * 512 && (int)var4.aFloat4919 >= 0 && (int)var4.aFloat4919 < client.aClass505_11204.method6057(126749238) * 512) {
                        var2.method10925((int)var4.aFloat4917, (int)var4.aFloat4919, Class387.method4762((int)var4.aFloat4917, (int)var4.aFloat4919, var3.aByte10827, 1548543661) - var2.anInt12109 * -1629748697, client.anInt11012, -2018253597);
                     }
                  }
               } else {
                  LinkableObject var6 = (LinkableObject)client.npcs.get((long)(1116936527 * var2.anInt12115 - 1));
                  if(var6 != null) {
                     NPC var8 = (NPC)var6.anObject10399;
                     var5 = var8.method7635().aClass446_4816;
                     if((int)var5.aFloat4917 >= 0 && (int)var5.aFloat4917 < client.aClass505_11204.method6056(-1746741811) * 512 && (int)var5.aFloat4919 >= 0 && (int)var5.aFloat4919 < client.aClass505_11204.method6057(126749238) * 512) {
                        var2.method10925((int)var5.aFloat4917, (int)var5.aFloat4919, Class387.method4762((int)var5.aFloat4917, (int)var5.aFloat4919, var2.aByte10827, 1620936522) - var2.anInt12109 * -1629748697, client.anInt11012, 1299491626);
                     }
                  }
               }
            }

            if(var2.anInt12115 * 1116936527 < 0) {
               int var9 = -(1116936527 * var2.anInt12115) - 1;
               Class639_Sub1_Sub2_Sub1_Sub1 var7;
               if(var9 == client.localPlayerIndex * -1204447689) {
                  var7 = Class451.localPlayer;
               } else {
                  var7 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var9];
               }

               if(null != var7) {
                  var5 = var7.method7635().aClass446_4816;
                  if((int)var5.aFloat4917 >= 0 && (int)var5.aFloat4917 < client.aClass505_11204.method6056(-1746741811) * 512 && (int)var5.aFloat4919 >= 0 && (int)var5.aFloat4919 < client.aClass505_11204.method6057(126749238) * 512) {
                     var2.method10925((int)var5.aFloat4917, (int)var5.aFloat4919, Class387.method4762((int)var5.aFloat4917, (int)var5.aFloat4919, var2.aByte10827, 1316930896) - -1629748697 * var2.anInt12109, client.anInt11012, -523179697);
                  }
               }
            }

            var2.method10927(101025109 * client.anInt11225, 375364053);
            client.aClass505_11204.method6072(-1553098802).method6579(var2, true, 65536);
         }
      }

   }
}
