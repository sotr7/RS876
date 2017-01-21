package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class526_Sub21_Sub5;

public class Class526_Sub21_Sub5_Sub1 extends Class526_Sub21_Sub5 {
   static final int anInt12038 = 16;
   int anInt12040;
   int anInt12041;
   int anInt12037;
   int anInt12042;
   byte[] aByteArray12039;

   boolean method10870(int var1, int var2) {
      return this.aByteArray12039.length >= var1 * var2;
   }

   void method10871(int var1, int var2, int var3, int var4) {
      this.anInt12040 = var1;
      this.anInt12041 = var2;
      this.anInt12037 = var3 - var1;
      this.anInt12042 = var4 - var2;
   }

   boolean method10872(int var1, int var2) {
      return this.aByteArray12039.length >= var1 * var2;
   }

   void method10873() {
      int var1 = -1;

      for(int var2 = this.aByteArray12039.length - 8; var1 < var2; this.aByteArray12039[var1] = 0) {
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
      }

      while(var1 < this.aByteArray12039.length - 1) {
         ++var1;
         this.aByteArray12039[var1] = 0;
      }

   }

   static final void method10874(byte[] var0, int var1, int var2, int var3, int var4) {
      if(var3 < var4) {
         var1 += var3;
         var2 = var4 - var3 >> 2;

         while(true) {
            --var2;
            if(var2 < 0) {
               var2 = var4 - var3 & 3;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     return;
                  }

                  var0[var1++] = 1;
               }
            }

            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
         }
      }
   }

   void method10875(int var1, int var2, int var3, int var4) {
      this.anInt12040 = var1;
      this.anInt12041 = var2;
      this.anInt12037 = var3 - var1;
      this.anInt12042 = var4 - var2;
   }

   Class526_Sub21_Sub5_Sub1(Class174_Sub3 var1, int var2, int var3) {
      this.aByteArray12039 = new byte[var2 * var3];
   }

   boolean method10876(int var1, int var2) {
      return this.aByteArray12039.length >= var1 * var2;
   }

   boolean method10877(int var1, int var2) {
      return this.aByteArray12039.length >= var1 * var2;
   }

   void method10878(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var2 != var1) {
         var7 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var8 = 0;
      if(var3 != var2) {
         var8 = (var6 - var5 << 16) / (var3 - var2);
      }

      int var9 = 0;
      if(var3 != var1) {
         var9 = (var4 - var6 << 16) / (var1 - var3);
      }

      if(var1 <= var2 && var1 <= var3) {
         if(var2 < var3) {
            var6 = var4 <<= 16;
            if(var1 < 0) {
               var6 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var5 <<= 16;
            if(var2 < 0) {
               var5 -= var8 * var2;
               var2 = 0;
            }

            if((var1 == var2 || var9 >= var7) && (var1 != var2 || var9 <= var8)) {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var5 >> 16, var6 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var4 >> 16, var6 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            } else {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var6 >> 16, var5 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var6 >> 16, var4 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            }
         } else {
            var5 = var4 <<= 16;
            if(var1 < 0) {
               var5 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var6 <<= 16;
            if(var3 < 0) {
               var6 -= var8 * var3;
               var3 = 0;
            }

            if((var1 == var3 || var9 >= var7) && (var1 != var3 || var8 <= var7)) {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var4 >> 16, var6 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var4 >> 16, var5 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            } else {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var6 >> 16, var4 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var5 >> 16, var4 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            }
         }
      } else if(var2 <= var3) {
         if(var3 < var1) {
            var4 = var5 <<= 16;
            if(var2 < 0) {
               var4 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var6 <<= 16;
            if(var3 < 0) {
               var6 -= var9 * var3;
               var3 = 0;
            }

            if(var2 != var3 && var7 < var8 || var2 == var3 && var7 > var9) {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var4 >> 16, var6 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var4 >> 16, var5 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            } else {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var6 >> 16, var4 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            }
         } else {
            var6 = var5 <<= 16;
            if(var2 < 0) {
               var6 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if(var1 < 0) {
               var4 -= var9 * var1;
               var1 = 0;
            }

            if(var7 < var8) {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var4 >> 16, var5 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var6 >> 16, var5 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            } else {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var5 >> 16, var4 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var5 >> 16, var6 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            }
         }
      } else if(var1 < var2) {
         var5 = var6 <<= 16;
         if(var3 < 0) {
            var5 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var4 <<= 16;
         if(var1 < 0) {
            var4 -= var7 * var1;
            var1 = 0;
         }

         if(var8 < var9) {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var5 >> 16, var4 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var5 >> 16, var6 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         } else {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var4 >> 16, var5 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var6 >> 16, var5 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         }
      } else {
         var4 = var6 <<= 16;
         if(var3 < 0) {
            var4 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var5 <<= 16;
         if(var2 < 0) {
            var5 -= var7 * var2;
            var2 = 0;
         }

         if(var8 < var9) {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var5 >> 16, var6 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var4 >> 16, var6 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         } else {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var6 >> 16, var5 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var6 >> 16, var4 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         }
      }
   }

   void method10879() {
      int var1 = -1;

      for(int var2 = this.aByteArray12039.length - 8; var1 < var2; this.aByteArray12039[var1] = 0) {
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
      }

      while(var1 < this.aByteArray12039.length - 1) {
         ++var1;
         this.aByteArray12039[var1] = 0;
      }

   }

   void method10880(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var2 != var1) {
         var7 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var8 = 0;
      if(var3 != var2) {
         var8 = (var6 - var5 << 16) / (var3 - var2);
      }

      int var9 = 0;
      if(var3 != var1) {
         var9 = (var4 - var6 << 16) / (var1 - var3);
      }

      if(var1 <= var2 && var1 <= var3) {
         if(var2 < var3) {
            var6 = var4 <<= 16;
            if(var1 < 0) {
               var6 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var5 <<= 16;
            if(var2 < 0) {
               var5 -= var8 * var2;
               var2 = 0;
            }

            if((var1 == var2 || var9 >= var7) && (var1 != var2 || var9 <= var8)) {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var5 >> 16, var6 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var4 >> 16, var6 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            } else {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var6 >> 16, var5 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var6 >> 16, var4 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            }
         } else {
            var5 = var4 <<= 16;
            if(var1 < 0) {
               var5 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var6 <<= 16;
            if(var3 < 0) {
               var6 -= var8 * var3;
               var3 = 0;
            }

            if((var1 == var3 || var9 >= var7) && (var1 != var3 || var8 <= var7)) {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var4 >> 16, var6 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var4 >> 16, var5 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            } else {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var1, 0, var6 >> 16, var4 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var1, 0, var5 >> 16, var4 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt12037;
               }
            }
         }
      } else if(var2 <= var3) {
         if(var3 < var1) {
            var4 = var5 <<= 16;
            if(var2 < 0) {
               var4 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var6 <<= 16;
            if(var3 < 0) {
               var6 -= var9 * var3;
               var3 = 0;
            }

            if(var2 != var3 && var7 < var8 || var2 == var3 && var7 > var9) {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var4 >> 16, var6 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var4 >> 16, var5 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            } else {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var6 >> 16, var4 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            }
         } else {
            var6 = var5 <<= 16;
            if(var2 < 0) {
               var6 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if(var1 < 0) {
               var4 -= var9 * var1;
               var1 = 0;
            }

            if(var7 < var8) {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var4 >> 16, var5 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var6 >> 16, var5 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            } else {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt12037;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method10874(this.aByteArray12039, var2, 0, var5 >> 16, var4 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt12037;
                     }
                  }

                  method10874(this.aByteArray12039, var2, 0, var5 >> 16, var6 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt12037;
               }
            }
         }
      } else if(var1 < var2) {
         var5 = var6 <<= 16;
         if(var3 < 0) {
            var5 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var4 <<= 16;
         if(var1 < 0) {
            var4 -= var7 * var1;
            var1 = 0;
         }

         if(var8 < var9) {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var5 >> 16, var4 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var5 >> 16, var6 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         } else {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var4 >> 16, var5 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var6 >> 16, var5 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         }
      } else {
         var4 = var6 <<= 16;
         if(var3 < 0) {
            var4 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var5 <<= 16;
         if(var2 < 0) {
            var5 -= var7 * var2;
            var2 = 0;
         }

         if(var8 < var9) {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var5 >> 16, var6 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var4 >> 16, var6 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         } else {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt12037;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method10874(this.aByteArray12039, var3, 0, var6 >> 16, var5 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt12037;
                  }
               }

               method10874(this.aByteArray12039, var3, 0, var6 >> 16, var4 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt12037;
            }
         }
      }
   }

   static final void method10881(byte[] var0, int var1, int var2, int var3, int var4) {
      if(var3 < var4) {
         var1 += var3;
         var2 = var4 - var3 >> 2;

         while(true) {
            --var2;
            if(var2 < 0) {
               var2 = var4 - var3 & 3;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     return;
                  }

                  var0[var1++] = 1;
               }
            }

            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
         }
      }
   }

   void method10882() {
      int var1 = -1;

      for(int var2 = this.aByteArray12039.length - 8; var1 < var2; this.aByteArray12039[var1] = 0) {
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
         this.aByteArray12039[var1] = 0;
         ++var1;
      }

      while(var1 < this.aByteArray12039.length - 1) {
         ++var1;
         this.aByteArray12039[var1] = 0;
      }

   }
}
