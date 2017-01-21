package com.jagex;

import com.jagex.Class113;
import com.jagex.Class174;
import com.jagex.Class237;
import com.jagex.InterfaceDef;
import com.jagex.Class446;
import com.jagex.Class513_Sub1;
import com.jagex.LinkableObject;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class8;
import com.jagex.InputStream_Sub1;
import com.jagex.client;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class554 implements Runnable {
   public static Class174 aClass174_7475;
   IOException anIOException7469;
   int anInt7468 = 0;
   int anInt7472 = 0;
   InputStream anInputStream7473;
   int anInt7474;
   byte[] aByteArray7471;
   Thread aThread7470;

   public void method6671() {
      while(true) {
         int var2;
         synchronized(this) {
            while(true) {
               if(this.anIOException7469 != null) {
                  return;
               }

               if(0 == 112816971 * this.anInt7472) {
                  var2 = -18804423 * this.anInt7474 - -1314027967 * this.anInt7468 - 1;
               } else if(this.anInt7472 * 112816971 <= -1314027967 * this.anInt7468) {
                  var2 = -18804423 * this.anInt7474 - -1314027967 * this.anInt7468;
               } else {
                  var2 = 112816971 * this.anInt7472 - -1314027967 * this.anInt7468 - 1;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var1;
         try {
            var1 = this.anInputStream7473.read(this.aByteArray7471, -1314027967 * this.anInt7468, var2);
            if(-1 == var1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.anIOException7469 = var3;
               return;
            }
         }

         synchronized(this) {
            this.anInt7468 = 739609025 * ((-1314027967 * this.anInt7468 + var1) % (this.anInt7474 * -18804423));
         }
      }
   }

   boolean method6672(int var1, int var2) throws IOException {
      if(var1 > 0 && var1 < -18804423 * this.anInt7474) {
         synchronized(this) {
            int var4;
            if(this.anInt7472 * 112816971 <= -1314027967 * this.anInt7468) {
               var4 = this.anInt7468 * -1314027967 - this.anInt7472 * 112816971;
            } else {
               var4 = -18804423 * this.anInt7474 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
            }

            if(var4 < var1) {
               if(null != this.anIOException7469) {
                  throw new IOException(this.anIOException7469.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   Class554(InputStream var1, int var2) {
      this.anInputStream7473 = var1;
      this.anInt7474 = (var2 + 1) * -2106946295;
      this.aByteArray7471 = new byte[this.anInt7474 * -18804423];
      this.aThread7470 = new Thread(this);
      this.aThread7470.setDaemon(true);
      this.aThread7470.start();
   }

   int method6673(int var1) throws IOException {
      synchronized(this) {
         int var3;
         if(112816971 * this.anInt7472 <= -1314027967 * this.anInt7468) {
            var3 = this.anInt7468 * -1314027967 - 112816971 * this.anInt7472;
         } else {
            var3 = this.anInt7474 * -18804423 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
         }

         if(null != this.anIOException7469) {
            throw new IOException(this.anIOException7469.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   int method6674(byte[] var1, int var2, int var3, int var4) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if(112816971 * this.anInt7472 <= this.anInt7468 * -1314027967) {
               var6 = this.anInt7468 * -1314027967 - this.anInt7472 * 112816971;
            } else {
               var6 = this.anInt7468 * -1314027967 + (this.anInt7474 * -18804423 - this.anInt7472 * 112816971);
            }

            if(var3 > var6) {
               var3 = var6;
            }

            if(0 == var3 && this.anIOException7469 != null) {
               throw new IOException(this.anIOException7469.toString());
            } else {
               if(112816971 * this.anInt7472 + var3 <= -18804423 * this.anInt7474) {
                  System.arraycopy(this.aByteArray7471, this.anInt7472 * 112816971, var1, var2, var3);
               } else {
                  int var7 = -18804423 * this.anInt7474 - this.anInt7472 * 112816971;
                  System.arraycopy(this.aByteArray7471, 112816971 * this.anInt7472, var1, var2, var7);
                  System.arraycopy(this.aByteArray7471, 0, var1, var7 + var2, var3 - var7);
               }

               this.anInt7472 = (112816971 * this.anInt7472 + var3) % (this.anInt7474 * -18804423) * -1624441245;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method6675(byte var1) {
      synchronized(this) {
         if(null == this.anIOException7469) {
            this.anIOException7469 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.aThread7470.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   void method6676(byte var1) {
      this.anInputStream7473 = new InputStream_Sub1();
   }

   public void method6677() {
      while(true) {
         int var2;
         synchronized(this) {
            while(true) {
               if(this.anIOException7469 != null) {
                  return;
               }

               if(0 == 112816971 * this.anInt7472) {
                  var2 = -18804423 * this.anInt7474 - -1314027967 * this.anInt7468 - 1;
               } else if(this.anInt7472 * 112816971 <= -1314027967 * this.anInt7468) {
                  var2 = -18804423 * this.anInt7474 - -1314027967 * this.anInt7468;
               } else {
                  var2 = 112816971 * this.anInt7472 - -1314027967 * this.anInt7468 - 1;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var1;
         try {
            var1 = this.anInputStream7473.read(this.aByteArray7471, -1314027967 * this.anInt7468, var2);
            if(-1 == var1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.anIOException7469 = var3;
               return;
            }
         }

         synchronized(this) {
            this.anInt7468 = 739609025 * ((-1314027967 * this.anInt7468 + var1) % (this.anInt7474 * -18804423));
         }
      }
   }

   public void run() {
      while(true) {
         int var2;
         synchronized(this) {
            while(true) {
               if(this.anIOException7469 != null) {
                  return;
               }

               if(0 == 112816971 * this.anInt7472) {
                  var2 = -18804423 * this.anInt7474 - -1314027967 * this.anInt7468 - 1;
               } else if(this.anInt7472 * 112816971 <= -1314027967 * this.anInt7468) {
                  var2 = -18804423 * this.anInt7474 - -1314027967 * this.anInt7468;
               } else {
                  var2 = 112816971 * this.anInt7472 - -1314027967 * this.anInt7468 - 1;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var1;
         try {
            var1 = this.anInputStream7473.read(this.aByteArray7471, -1314027967 * this.anInt7468, var2);
            if(-1 == var1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.anIOException7469 = var3;
               return;
            }
         }

         synchronized(this) {
            this.anInt7468 = 739609025 * ((-1314027967 * this.anInt7468 + var1) % (this.anInt7474 * -18804423));
         }
      }
   }

   boolean method6678(int var1) throws IOException {
      if(var1 > 0 && var1 < -18804423 * this.anInt7474) {
         synchronized(this) {
            int var3;
            if(this.anInt7472 * 112816971 <= -1314027967 * this.anInt7468) {
               var3 = this.anInt7468 * -1314027967 - this.anInt7472 * 112816971;
            } else {
               var3 = -18804423 * this.anInt7474 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
            }

            if(var3 < var1) {
               if(null != this.anIOException7469) {
                  throw new IOException(this.anIOException7469.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   boolean method6679(int var1) throws IOException {
      if(var1 > 0 && var1 < -18804423 * this.anInt7474) {
         synchronized(this) {
            int var3;
            if(this.anInt7472 * 112816971 <= -1314027967 * this.anInt7468) {
               var3 = this.anInt7468 * -1314027967 - this.anInt7472 * 112816971;
            } else {
               var3 = -18804423 * this.anInt7474 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
            }

            if(var3 < var1) {
               if(null != this.anIOException7469) {
                  throw new IOException(this.anIOException7469.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method6680() throws IOException {
      synchronized(this) {
         int var2;
         if(112816971 * this.anInt7472 <= -1314027967 * this.anInt7468) {
            var2 = this.anInt7468 * -1314027967 - 112816971 * this.anInt7472;
         } else {
            var2 = this.anInt7474 * -18804423 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
         }

         if(null != this.anIOException7469) {
            throw new IOException(this.anIOException7469.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int method6681() throws IOException {
      synchronized(this) {
         int var2;
         if(112816971 * this.anInt7472 <= -1314027967 * this.anInt7468) {
            var2 = this.anInt7468 * -1314027967 - 112816971 * this.anInt7472;
         } else {
            var2 = this.anInt7474 * -18804423 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
         }

         if(null != this.anIOException7469) {
            throw new IOException(this.anIOException7469.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int method6682() throws IOException {
      synchronized(this) {
         int var2;
         if(112816971 * this.anInt7472 <= -1314027967 * this.anInt7468) {
            var2 = this.anInt7468 * -1314027967 - 112816971 * this.anInt7472;
         } else {
            var2 = this.anInt7474 * -18804423 - this.anInt7472 * 112816971 + this.anInt7468 * -1314027967;
         }

         if(null != this.anIOException7469) {
            throw new IOException(this.anIOException7469.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   void method6683() {
      synchronized(this) {
         if(null == this.anIOException7469) {
            this.anIOException7469 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.aThread7470.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   static final void method6684(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class8.aClass547_45.method6534(985103137);
   }

   static void method6685(int var0, int var1, InterfaceDef var2, Class237 var3, int var4, int var5, byte var6) {
      Class113[] var7 = client.aClass113Array11018;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         Class113 var9 = var7[var8];
         if(var9 != null && -941650287 * var9.anInt1367 != 0 && client.anInt11012 % 20 < 10) {
            int var13;
            if(var9.anInt1367 * -941650287 == 1) {
               LinkableObject var10 = (LinkableObject)client.npcs.get((long)(1579992317 * var9.anInt1361));
               if(null != var10) {
                  NPC var11 = (NPC)var10.anObject10399;
                  Class446 var12 = var11.method7635().aClass446_4816;
                  var13 = (int)var12.aFloat4917 / 128 - var0 / 128;
                  int var14 = (int)var12.aFloat4919 / 128 - var1 / 128;
                  Class513_Sub1.method9299(var2, var3, var4, var5, var13, var14, -236252675 * var9.anInt1360, 360000L);
               }
            }

            if(2 == -941650287 * var9.anInt1367) {
               int var17 = 998231709 * var9.anInt1363 / 128 - var0 / 128;
               int var19 = 1251476749 * var9.anInt1365 / 128 - var1 / 128;
               long var15 = (long)(-1408633395 * var9.anInt1368 << 7);
               var15 *= var15;
               Class513_Sub1.method9299(var2, var3, var4, var5, var17, var19, -236252675 * var9.anInt1360, var15);
            }

            if(-941650287 * var9.anInt1367 == 10 && var9.anInt1361 * 1579992317 >= 0 && 1579992317 * var9.anInt1361 < client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154.length) {
               Class639_Sub1_Sub2_Sub1_Sub1 var18 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var9.anInt1361 * 1579992317];
               if(null != var18) {
                  Class446 var20 = var18.method7635().aClass446_4816;
                  int var21 = (int)var20.aFloat4917 / 128 - var0 / 128;
                  var13 = (int)var20.aFloat4919 / 128 - var1 / 128;
                  Class513_Sub1.method9299(var2, var3, var4, var5, var21, var13, var9.anInt1360 * -236252675, 360000L);
               }
            }
         }
      }

   }
}
