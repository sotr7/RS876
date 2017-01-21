package com.jagex;

import com.jagex.Class43;
import com.jagex.Class466;
import com.jagex.Class681;
import com.jagex.OutputStream_Sub1;
import com.jagex.client;
import java.io.IOException;
import java.io.OutputStream;

public class Class544 implements Runnable {
   public static Class466 aClass466_7248;
   IOException anIOException7247;
   int anInt7240 = 0;
   int anInt7245 = 0;
   boolean aBool7244;
   OutputStream anOutputStream7241;
   int anInt7242;
   byte[] aByteArray7246;
   Thread aThread7243;

   boolean method6494(int var1) {
      if(this.aBool7244) {
         try {
            this.anOutputStream7241.close();
            if(this.anIOException7247 == null) {
               this.anIOException7247 = new IOException("");
            }
         } catch (IOException var3) {
            if(this.anIOException7247 == null) {
               this.anIOException7247 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void method6495() {
      do {
         int var2;
         synchronized(this) {
            while(true) {
               if(null != this.anIOException7247) {
                  return;
               }

               if(this.anInt7240 * 204040395 <= -1262791567 * this.anInt7245) {
                  var2 = this.anInt7245 * -1262791567 - 204040395 * this.anInt7240;
               } else {
                  var2 = this.anInt7242 * 1058884027 - 204040395 * this.anInt7240 + -1262791567 * this.anInt7245;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.anOutputStream7241.flush();
               } catch (IOException var10) {
                  this.anIOException7247 = var10;
                  return;
               }

               if(this.method6494(1532858854)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if(204040395 * this.anInt7240 + var2 <= 1058884027 * this.anInt7242) {
               this.anOutputStream7241.write(this.aByteArray7246, 204040395 * this.anInt7240, var2);
            } else {
               int var13 = 1058884027 * this.anInt7242 - 204040395 * this.anInt7240;
               this.anOutputStream7241.write(this.aByteArray7246, 204040395 * this.anInt7240, var13);
               this.anOutputStream7241.write(this.aByteArray7246, 0, var2 - var13);
            }
         } catch (IOException var9) {
            IOException var1 = var9;
            synchronized(this) {
               this.anIOException7247 = var1;
               return;
            }
         }

         synchronized(this) {
            this.anInt7240 = -409355037 * ((204040395 * this.anInt7240 + var2) % (1058884027 * this.anInt7242));
         }
      } while(!this.method6494(2094967739));

   }

   boolean method6496() {
      if(this.aBool7244) {
         try {
            this.anOutputStream7241.close();
            if(this.anIOException7247 == null) {
               this.anIOException7247 = new IOException("");
            }
         } catch (IOException var2) {
            if(this.anIOException7247 == null) {
               this.anIOException7247 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method6497(byte[] var1, int var2, int var3, int var4) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if(this.anIOException7247 != null) {
               throw new IOException(this.anIOException7247.toString());
            } else {
               int var6;
               if(204040395 * this.anInt7240 <= -1262791567 * this.anInt7245) {
                  var6 = 204040395 * this.anInt7240 + (this.anInt7242 * 1058884027 - this.anInt7245 * -1262791567) - 1;
               } else {
                  var6 = 204040395 * this.anInt7240 - -1262791567 * this.anInt7245 - 1;
               }

               if(var6 < var3) {
                  throw new IOException("");
               } else {
                  if(this.anInt7245 * -1262791567 + var3 <= 1058884027 * this.anInt7242) {
                     System.arraycopy(var1, var2, this.aByteArray7246, -1262791567 * this.anInt7245, var3);
                  } else {
                     int var7 = 1058884027 * this.anInt7242 - -1262791567 * this.anInt7245;
                     System.arraycopy(var1, var2, this.aByteArray7246, -1262791567 * this.anInt7245, var7);
                     System.arraycopy(var1, var2 + var7, this.aByteArray7246, 0, var3 - var7);
                  }

                  this.anInt7245 = -211948399 * ((this.anInt7245 * -1262791567 + var3) % (1058884027 * this.anInt7242));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method6498(int var1) {
      synchronized(this) {
         this.aBool7244 = true;
         this.notifyAll();
      }

      try {
         this.aThread7243.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   void method6499(int var1) {
      this.anOutputStream7241 = new OutputStream_Sub1();
   }

   Class544(OutputStream var1, int var2) {
      this.anOutputStream7241 = var1;
      this.anInt7242 = -1834151053 * (1 + var2);
      this.aByteArray7246 = new byte[1058884027 * this.anInt7242];
      this.aThread7243 = new Thread(this);
      this.aThread7243.setDaemon(true);
      this.aThread7243.start();
   }

   public void method6500() {
      do {
         int var2;
         synchronized(this) {
            while(true) {
               if(null != this.anIOException7247) {
                  return;
               }

               if(this.anInt7240 * 204040395 <= -1262791567 * this.anInt7245) {
                  var2 = this.anInt7245 * -1262791567 - 204040395 * this.anInt7240;
               } else {
                  var2 = this.anInt7242 * 1058884027 - 204040395 * this.anInt7240 + -1262791567 * this.anInt7245;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.anOutputStream7241.flush();
               } catch (IOException var10) {
                  this.anIOException7247 = var10;
                  return;
               }

               if(this.method6494(1332403572)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if(204040395 * this.anInt7240 + var2 <= 1058884027 * this.anInt7242) {
               this.anOutputStream7241.write(this.aByteArray7246, 204040395 * this.anInt7240, var2);
            } else {
               int var13 = 1058884027 * this.anInt7242 - 204040395 * this.anInt7240;
               this.anOutputStream7241.write(this.aByteArray7246, 204040395 * this.anInt7240, var13);
               this.anOutputStream7241.write(this.aByteArray7246, 0, var2 - var13);
            }
         } catch (IOException var9) {
            IOException var1 = var9;
            synchronized(this) {
               this.anIOException7247 = var1;
               return;
            }
         }

         synchronized(this) {
            this.anInt7240 = -409355037 * ((204040395 * this.anInt7240 + var2) % (1058884027 * this.anInt7242));
         }
      } while(!this.method6494(1324420470));

   }

   public void run() {
      do {
         int var2;
         synchronized(this) {
            while(true) {
               if(null != this.anIOException7247) {
                  return;
               }

               if(this.anInt7240 * 204040395 <= -1262791567 * this.anInt7245) {
                  var2 = this.anInt7245 * -1262791567 - 204040395 * this.anInt7240;
               } else {
                  var2 = this.anInt7242 * 1058884027 - 204040395 * this.anInt7240 + -1262791567 * this.anInt7245;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.anOutputStream7241.flush();
               } catch (IOException var10) {
                  this.anIOException7247 = var10;
                  return;
               }

               if(this.method6494(1947545336)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if(204040395 * this.anInt7240 + var2 <= 1058884027 * this.anInt7242) {
               this.anOutputStream7241.write(this.aByteArray7246, 204040395 * this.anInt7240, var2);
            } else {
               int var13 = 1058884027 * this.anInt7242 - 204040395 * this.anInt7240;
               this.anOutputStream7241.write(this.aByteArray7246, 204040395 * this.anInt7240, var13);
               this.anOutputStream7241.write(this.aByteArray7246, 0, var2 - var13);
            }
         } catch (IOException var9) {
            IOException var1 = var9;
            synchronized(this) {
               this.anIOException7247 = var1;
               return;
            }
         }

         synchronized(this) {
            this.anInt7240 = -409355037 * ((204040395 * this.anInt7240 + var2) % (1058884027 * this.anInt7242));
         }
      } while(!this.method6494(1619499125));

   }

   void method6501() {
      synchronized(this) {
         this.aBool7244 = true;
         this.notifyAll();
      }

      try {
         this.aThread7243.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   void method6502() {
      synchronized(this) {
         this.aBool7244 = true;
         this.notifyAll();
      }

      try {
         this.aThread7243.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   void method6503() {
      synchronized(this) {
         this.aBool7244 = true;
         this.notifyAll();
      }

      try {
         this.aThread7243.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   void method6504() {
      synchronized(this) {
         this.aBool7244 = true;
         this.notifyAll();
      }

      try {
         this.aThread7243.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   void method6505() {
      this.anOutputStream7241 = new OutputStream_Sub1();
   }

   static final void method6506(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      var0.aClass392_8632.anIntArray4091[var2] = var3;
   }

   static final void method6507(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(2 == 2029719417 * client.anInt11288 && var2 < -17244221 * client.anInt11130) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = client.aClass50Array11290[var2].aString660;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static void method6508(int var0) {
      Class43.aClass292_Sub1_458 = null;
      Class43.aBool457 = false;
   }

   public static final int method6509(int var0, int var1, int var2, int var3) {
      if(var2 > 243) {
         var1 >>= 4;
      } else if(var2 > 217) {
         var1 >>= 3;
      } else if(var2 > 192) {
         var1 >>= 2;
      } else if(var2 > 179) {
         var1 >>= 1;
      }

      return (var2 >> 1) + (var1 >> 5 << 7) + ((var0 & 255) >> 2 << 10);
   }
}
