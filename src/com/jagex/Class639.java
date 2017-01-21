package com.jagex;

import com.jagex.Class430;
import com.jagex.Class433;
import com.jagex.Class440;
import com.jagex.Class445;
import com.jagex.Class446;

public class Class639 {
   Class430 aClass430_8332 = new Class430();
   Class430 aClass430_8330 = new Class430();
   boolean aBool8334 = true;
   Class430 aClass430_8333 = new Class430();
   boolean aBool8340 = true;
   Class445 aClass445_8335;
   boolean aBool8336;
   protected boolean aBool8337;
   Class639 aClass639_8338;
   Class639 aClass639_8331;
   Class639 aClass639_8339;

   final void method7616() {
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

      if(this.aClass639_8339 != null) {
         this.aClass639_8339.method7624();
      }

   }

   Class639() {
      new Class433();
      new Class433();
      this.aClass445_8335 = new Class445();
      this.aBool8336 = true;
      this.aBool8337 = true;
      this.aClass639_8338 = null;
      this.aClass639_8331 = null;
      this.aClass639_8339 = null;
   }

   final void method7617(Class430 var1) {
      this.aClass430_8332.method5055(var1);
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

   }

   public final void method7618(float var1, float var2, float var3) {
      this.aClass430_8332.aClass446_4816.method5266(var1, var2, var3);
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

   }

   final void method7619(Class430 var1) {
      if(this.aClass639_8338 != null) {
         Class430 var2 = new Class430(var1);
         var2.method5058(this.aClass639_8338.method7625());
         this.method7617(var2);
      } else {
         this.method7617(var1);
      }

   }

   final void method7620() {
      this.aBool8334 = true;
      this.aBool8340 = true;
      this.aBool8336 = true;
      this.aBool8337 = true;
   }

   public final Class430 method7621() {
      return this.aClass430_8332;
   }

   public final void method7622() {
      Class639 var1;
      if(this.aClass639_8338 != null) {
         var1 = this.aClass639_8338.aClass639_8331;
         if(var1 == this) {
            this.aClass639_8338.aClass639_8331 = this.aClass639_8339;
         } else {
            while(var1.aClass639_8339 != this) {
               var1 = var1.aClass639_8339;
            }

            var1.aClass639_8339 = this.aClass639_8339;
         }
      }

      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
         var1 = this.aClass639_8331;

         while(true) {
            var1.aClass430_8332.method5058(this.aClass430_8332);
            var1.aClass639_8338 = this.aClass639_8338;
            if(var1.aClass639_8339 == null) {
               var1.aClass639_8339 = this.aClass639_8338.aClass639_8331;
               this.aClass639_8338.aClass639_8331 = this.aClass639_8331;
               break;
            }

            var1 = var1.aClass639_8339;
         }
      }

      this.aClass639_8338 = null;
      this.aClass639_8339 = null;
      this.aClass639_8331 = null;
   }

   final Class445 method7623() {
      if(this.aBool8336) {
         this.aBool8336 = false;
         this.aClass445_8335.method5218(this.method7635());
      }

      return this.aClass445_8335;
   }

   final void method7624() {
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

      if(this.aClass639_8339 != null) {
         this.aClass639_8339.method7624();
      }

   }

   final Class430 method7625() {
      if(this.aBool8340) {
         this.aBool8340 = false;
         this.aClass430_8333.method5055(this.method7635());
         this.aClass430_8333.method5056();
      }

      return this.aClass430_8330;
   }

   public final void method7626(Class440 var1) {
      this.aClass430_8332.aClass440_4817.method5166(var1);
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

   }

   public final void method7627(float var1, float var2, float var3) {
      this.aClass430_8332.aClass446_4816.method5266(var1, var2, var3);
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

   }

   public final void method7628(float var1, float var2, float var3) {
      this.aClass430_8332.aClass446_4816.method5266(var1, var2, var3);
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

   }

   public final void method7629() {
      Class639 var1;
      if(this.aClass639_8338 != null) {
         var1 = this.aClass639_8338.aClass639_8331;
         if(var1 == this) {
            this.aClass639_8338.aClass639_8331 = this.aClass639_8339;
         } else {
            while(var1.aClass639_8339 != this) {
               var1 = var1.aClass639_8339;
            }

            var1.aClass639_8339 = this.aClass639_8339;
         }
      }

      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
         var1 = this.aClass639_8331;

         while(true) {
            var1.aClass430_8332.method5058(this.aClass430_8332);
            var1.aClass639_8338 = this.aClass639_8338;
            if(var1.aClass639_8339 == null) {
               var1.aClass639_8339 = this.aClass639_8338.aClass639_8331;
               this.aClass639_8338.aClass639_8331 = this.aClass639_8331;
               break;
            }

            var1 = var1.aClass639_8339;
         }
      }

      this.aClass639_8338 = null;
      this.aClass639_8339 = null;
      this.aClass639_8331 = null;
   }

   final void method7630() {
      this.aBool8334 = true;
      this.aBool8340 = true;
      this.aBool8336 = true;
      this.aBool8337 = true;
   }

   final void method7631() {
      this.aBool8334 = true;
      this.aBool8340 = true;
      this.aBool8336 = true;
      this.aBool8337 = true;
   }

   public final void method7632(Class446 var1) {
      this.aClass430_8332.aClass446_4816.method5267(var1);
      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
      }

   }

   public final void method7633() {
      Class639 var1;
      if(this.aClass639_8338 != null) {
         var1 = this.aClass639_8338.aClass639_8331;
         if(var1 == this) {
            this.aClass639_8338.aClass639_8331 = this.aClass639_8339;
         } else {
            while(var1.aClass639_8339 != this) {
               var1 = var1.aClass639_8339;
            }

            var1.aClass639_8339 = this.aClass639_8339;
         }
      }

      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
         var1 = this.aClass639_8331;

         while(true) {
            var1.aClass430_8332.method5058(this.aClass430_8332);
            var1.aClass639_8338 = this.aClass639_8338;
            if(var1.aClass639_8339 == null) {
               var1.aClass639_8339 = this.aClass639_8338.aClass639_8331;
               this.aClass639_8338.aClass639_8331 = this.aClass639_8331;
               break;
            }

            var1 = var1.aClass639_8339;
         }
      }

      this.aClass639_8338 = null;
      this.aClass639_8339 = null;
      this.aClass639_8331 = null;
   }

   public final void method7634() {
      Class639 var1;
      if(this.aClass639_8338 != null) {
         var1 = this.aClass639_8338.aClass639_8331;
         if(var1 == this) {
            this.aClass639_8338.aClass639_8331 = this.aClass639_8339;
         } else {
            while(var1.aClass639_8339 != this) {
               var1 = var1.aClass639_8339;
            }

            var1.aClass639_8339 = this.aClass639_8339;
         }
      }

      this.method7620();
      if(this.aClass639_8331 != null) {
         this.aClass639_8331.method7624();
         var1 = this.aClass639_8331;

         while(true) {
            var1.aClass430_8332.method5058(this.aClass430_8332);
            var1.aClass639_8338 = this.aClass639_8338;
            if(var1.aClass639_8339 == null) {
               var1.aClass639_8339 = this.aClass639_8338.aClass639_8331;
               this.aClass639_8338.aClass639_8331 = this.aClass639_8331;
               break;
            }

            var1 = var1.aClass639_8339;
         }
      }

      this.aClass639_8338 = null;
      this.aClass639_8339 = null;
      this.aClass639_8331 = null;
   }

   public final Class430 method7635() {
      if(this.aBool8334) {
         this.aBool8334 = false;
         this.aClass430_8330.method5055(this.aClass430_8332);
         if(this.aClass639_8338 != null) {
            this.aClass430_8330.method5058(this.aClass639_8338.method7635());
         }
      }

      return this.aClass430_8330;
   }
}
