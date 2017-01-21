package com.jagex;

import com.jagex.Class106;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class375;
import com.jagex.Class554;
import com.jagex.Class557;
import com.jagex.Class604;
import com.jagex.Class679;
import com.jagex.Class681;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class55 implements Runnable {
   static Class604[] aClass604Array672;
   Queue aQueue669 = new LinkedList();
   Thread aThread670 = new Thread(this);
   volatile boolean aBool671;

   public void method984() {
      while(!this.aBool671) {
         try {
            Class106 var2;
            synchronized(this) {
               var2 = (Class106)this.aQueue669.poll();
               if(var2 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                     ;
                  }
                  continue;
               }
            }

            try {
               URLConnection var1 = var2.anURL1308.openConnection();
               var1.setConnectTimeout(30000);
               int var3 = var1.getContentLength();
               if(var3 >= 0) {
                  byte[] var4 = new byte[var3];
                  (new DataInputStream(var1.getInputStream())).readFully(var4);
                  var2.aByteArray1309 = var4;
               }

               var2.aBool1307 = true;
            } catch (IOException var6) {
               var2.aBool1307 = true;
            }
         } catch (Exception var8) {
            Class375.method4671((String)null, var8, (byte)111);
         }
      }

   }

   public void run() {
      while(!this.aBool671) {
         try {
            Class106 var2;
            synchronized(this) {
               var2 = (Class106)this.aQueue669.poll();
               if(var2 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                     ;
                  }
                  continue;
               }
            }

            try {
               URLConnection var1 = var2.anURL1308.openConnection();
               var1.setConnectTimeout(30000);
               int var3 = var1.getContentLength();
               if(var3 >= 0) {
                  byte[] var4 = new byte[var3];
                  (new DataInputStream(var1.getInputStream())).readFully(var4);
                  var2.aByteArray1309 = var4;
               }

               var2.aBool1307 = true;
            } catch (IOException var6) {
               var2.aBool1307 = true;
            }
         } catch (Exception var8) {
            Class375.method4671((String)null, var8, (byte)16);
         }
      }

   }

   Class106 method985(URL var1, int var2) {
      Class106 var3 = new Class106(var1);
      synchronized(this) {
         this.aQueue669.add(var3);
         this.notify();
         return var3;
      }
   }

   public void method986() {
      while(!this.aBool671) {
         try {
            Class106 var2;
            synchronized(this) {
               var2 = (Class106)this.aQueue669.poll();
               if(var2 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                     ;
                  }
                  continue;
               }
            }

            try {
               URLConnection var1 = var2.anURL1308.openConnection();
               var1.setConnectTimeout(30000);
               int var3 = var1.getContentLength();
               if(var3 >= 0) {
                  byte[] var4 = new byte[var3];
                  (new DataInputStream(var1.getInputStream())).readFully(var4);
                  var2.aByteArray1309 = var4;
               }

               var2.aBool1307 = true;
            } catch (IOException var6) {
               var2.aBool1307 = true;
            }
         } catch (Exception var8) {
            Class375.method4671((String)null, var8, (byte)24);
         }
      }

   }

   Class55() {
      this.aThread670.setPriority(1);
      this.aThread670.start();
   }

   void method987(int var1) {
      this.aBool671 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.aThread670.join();
      } catch (InterruptedException var5) {
         ;
      }

   }

   void method988() {
      this.aBool671 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.aThread670.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   void method989() {
      this.aBool671 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.aThread670.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   void method990() {
      this.aBool671 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.aThread670.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   void method991() {
      this.aBool671 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.aThread670.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   static final void method992(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class557.method6710(var3, var4, var0, -1040566742);
   }

   static final void method993(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(!Class554.aClass174_7475.method2242()) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 3;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub33_10608.method8313(var2, -2095898687);
      }

   }
}
