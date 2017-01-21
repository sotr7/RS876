package com.jagex;

import com.jagex.Class185;
import com.jagex.Class307;
import com.jagex.Class414;
import com.jagex.Class466;
import com.jagex.Class497;
import com.jagex.Class501;
import com.jagex.Class526_Sub24;
import com.jagex.Class534;
import com.jagex.Exception_Sub3;
import com.jagex.Exception_Sub7;
import com.jagex.Interface61;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class520 implements Interface61 {
   Hashtable aHashtable7049 = new Hashtable();
   Hashtable aHashtable7050 = new Hashtable();
   Class466 aClass466_7047;
   String aString7048;

   public Class520(Class466 var1) {
      this.aClass466_7047 = var1;
      String var2 = "";
      if(!Class497.aString5565.startsWith("win") && !Class497.aString5565.startsWith("windows 7")) {
         if(Class497.aString5565.startsWith("linux")) {
            var2 = var2 + "linux/";
         } else if(Class497.aString5565.startsWith("mac")) {
            var2 = var2 + "macos/";
         }
      } else {
         var2 = var2 + "windows/";
      }

      if(!Class497.aString5564.startsWith("amd64") && !Class497.aString5564.startsWith("x86_64")) {
         if(!Class497.aString5564.startsWith("i386") && !Class497.aString5564.startsWith("i486") && !Class497.aString5564.startsWith("i586") && !Class497.aString5564.startsWith("x86")) {
            if(Class497.aString5564.startsWith("ppc")) {
               var2 = var2 + "ppc/";
            } else {
               var2 = var2 + "universal/";
            }
         } else {
            var2 = var2 + "x86/";
         }
      } else {
         var2 = var2 + "x86_64/";
      }

      this.aString7048 = var2;
   }

   void method6245(String var1, File var2, byte var3) {
      this.aHashtable7049.put(var1, var2);
   }

   public boolean method397(String var1, byte var2) {
      return this.aHashtable7049.containsKey(var1);
   }

   public void method403(String var1, byte var2) throws Exception_Sub7 {
      this.method6246(var1, Class534.class, -2084492228);
   }

   void method6246(String var1, Class var2, int var3) throws Exception_Sub7 {
      Class var4 = (Class)this.aHashtable7050.get(var1);
      if(null != var4 && var4.getClassLoader() != var2.getClassLoader()) {
         throw new Exception_Sub7(1, var1);
      } else {
         File var5 = null;
         if(null == var5) {
            var5 = (File)this.aHashtable7049.get(var1);
         }

         if(var5 != null) {
            try {
               var5 = new File(var5.getCanonicalPath());
               Class var6 = Class.forName("java.lang.Runtime");
               Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
               Method var8 = var7.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
               Method var9 = var6.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
               var8.invoke(var9, new Object[]{Boolean.TRUE});
               var9.invoke(Runtime.getRuntime(), new Object[]{var2, var5.getPath()});
               var8.invoke(var9, new Object[]{Boolean.FALSE});
               this.aHashtable7050.put(var1, var2);
            } catch (NoSuchMethodException var10) {
               System.load(var5.getPath());
               this.aHashtable7050.put(var1, Class534.class);
            } catch (Throwable var11) {
               throw new Exception_Sub7(3, var1, var11);
            }

         } else {
            throw new Exception_Sub7(4, var1);
         }
      }
   }

   public boolean method398(int var1) {
      Hashtable var2 = new Hashtable();
      Enumeration var3 = this.aHashtable7050.keys();

      while(var3.hasMoreElements()) {
         String var4 = (String)var3.nextElement();
         var2.put(var4, this.aHashtable7050.get(var4));
      }

      try {
         Class var25 = Class.forName("java.lang.reflect.AccessibleObject");
         Class var5 = Class.forName("java.lang.ClassLoader");
         Field var6 = var5.getDeclaredField("nativeLibraries");
         Method var7 = var25.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
         var7.invoke(var6, new Object[]{Boolean.TRUE});

         try {
            var3 = this.aHashtable7050.keys();

            while(var3.hasMoreElements()) {
               String var8 = (String)var3.nextElement();

               try {
                  File var9 = (File)this.aHashtable7049.get(var8);
                  Class var10 = (Class)this.aHashtable7050.get(var8);
                  Vector var11 = (Vector)var6.get(var10.getClassLoader());

                  for(int var12 = 0; var12 < var11.size(); ++var12) {
                     try {
                        Object var13 = var11.elementAt(var12);
                        Field var14 = var13.getClass().getDeclaredField("name");
                        var7.invoke(var14, new Object[]{Boolean.TRUE});

                        try {
                           String var15 = (String)var14.get(var13);
                           if(null != var15 && var15.equalsIgnoreCase(var9.getCanonicalPath())) {
                              Field var16 = var13.getClass().getDeclaredField("handle");
                              Method var17 = var13.getClass().getDeclaredMethod("finalize", new Class[0]);
                              var7.invoke(var16, new Object[]{Boolean.TRUE});
                              var7.invoke(var17, new Object[]{Boolean.TRUE});

                              try {
                                 var17.invoke(var13, new Object[0]);
                                 var16.set(var13, new Integer(0));
                                 var2.remove(var8);
                              } catch (Throwable var19) {
                                 ;
                              }

                              var7.invoke(var17, new Object[]{Boolean.FALSE});
                              var7.invoke(var16, new Object[]{Boolean.FALSE});
                           }
                        } catch (Throwable var20) {
                           ;
                        }

                        var7.invoke(var14, new Object[]{Boolean.FALSE});
                     } catch (Throwable var21) {
                        ;
                     }
                  }
               } catch (Throwable var22) {
                  ;
               }
            }
         } catch (Throwable var23) {
            ;
         }

         var7.invoke(var6, new Object[]{Boolean.FALSE});
      } catch (Throwable var24) {
         ;
      }

      this.aHashtable7050 = var2;
      return this.aHashtable7050.isEmpty();
   }

   public void method400(String var1) throws Exception_Sub7 {
      this.method6246(var1, Class534.class, -988346306);
   }

   public boolean method406(String var1) {
      return this.aHashtable7049.containsKey(var1);
   }

   public void method402(String var1) throws Exception_Sub7 {
      this.method6246(var1, Class534.class, -1942330633);
   }

   public void method396(String var1) throws Exception_Sub7 {
      this.method6246(var1, Class534.class, 1048063479);
   }

   public boolean method404(String var1) {
      return this.aHashtable7049.containsKey(var1);
   }

   public boolean method405(String var1) {
      return this.aHashtable7049.containsKey(var1);
   }

   public boolean method407(String var1) {
      return this.aHashtable7049.containsKey(var1);
   }

   public boolean method401() {
      Hashtable var1 = new Hashtable();
      Enumeration var2 = this.aHashtable7050.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.put(var3, this.aHashtable7050.get(var3));
      }

      try {
         Class var24 = Class.forName("java.lang.reflect.AccessibleObject");
         Class var4 = Class.forName("java.lang.ClassLoader");
         Field var5 = var4.getDeclaredField("nativeLibraries");
         Method var6 = var24.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
         var6.invoke(var5, new Object[]{Boolean.TRUE});

         try {
            var2 = this.aHashtable7050.keys();

            while(var2.hasMoreElements()) {
               String var7 = (String)var2.nextElement();

               try {
                  File var8 = (File)this.aHashtable7049.get(var7);
                  Class var9 = (Class)this.aHashtable7050.get(var7);
                  Vector var10 = (Vector)var5.get(var9.getClassLoader());

                  for(int var11 = 0; var11 < var10.size(); ++var11) {
                     try {
                        Object var12 = var10.elementAt(var11);
                        Field var13 = var12.getClass().getDeclaredField("name");
                        var6.invoke(var13, new Object[]{Boolean.TRUE});

                        try {
                           String var14 = (String)var13.get(var12);
                           if(null != var14 && var14.equalsIgnoreCase(var8.getCanonicalPath())) {
                              Field var15 = var12.getClass().getDeclaredField("handle");
                              Method var16 = var12.getClass().getDeclaredMethod("finalize", new Class[0]);
                              var6.invoke(var15, new Object[]{Boolean.TRUE});
                              var6.invoke(var16, new Object[]{Boolean.TRUE});

                              try {
                                 var16.invoke(var12, new Object[0]);
                                 var15.set(var12, new Integer(0));
                                 var1.remove(var7);
                              } catch (Throwable var18) {
                                 ;
                              }

                              var6.invoke(var16, new Object[]{Boolean.FALSE});
                              var6.invoke(var15, new Object[]{Boolean.FALSE});
                           }
                        } catch (Throwable var19) {
                           ;
                        }

                        var6.invoke(var13, new Object[]{Boolean.FALSE});
                     } catch (Throwable var20) {
                        ;
                     }
                  }
               } catch (Throwable var21) {
                  ;
               }
            }
         } catch (Throwable var22) {
            ;
         }

         var6.invoke(var5, new Object[]{Boolean.FALSE});
      } catch (Throwable var23) {
         ;
      }

      this.aHashtable7050 = var1;
      return this.aHashtable7050.isEmpty();
   }

   public int method6247(String var1, int var2) throws Exception_Sub3 {
      if(this.aHashtable7049.containsKey(var1)) {
         return 100;
      } else {
         String var3 = Class414.method4929(var1, -1458942022);
         if(null == var3) {
            throw new Exception_Sub3(1, var1);
         } else {
            String var4 = null;
            if(var4 == null) {
               var4 = this.aString7048 + var3;
               if(null == this.aClass466_7047 || !this.aClass466_7047.method5549(var4, "", 71019068)) {
                  throw new Exception_Sub3(2, var1);
               }
            }

            if(!this.aClass466_7047.method5552(var4, (byte)-79)) {
               return this.aClass466_7047.method5553(var4, 1586399550);
            } else {
               byte[] var5 = this.aClass466_7047.method5550(var4, "", 2107490387);
               if(var5 == null) {
                  throw new Exception_Sub3(3, var1);
               } else {
                  File var6 = null;

                  try {
                     var6 = Class526_Sub24.method9481(var3, -725922394);
                  } catch (RuntimeException var11) {
                     throw new Exception_Sub3(4, var1, var11);
                  }

                  if(null == var6) {
                     throw new Exception_Sub3(5, var1);
                  } else {
                     boolean var7 = true;
                     byte[] var8 = Class185.method2716(var6, -835007918);
                     if(var8 != null && var8.length == var5.length) {
                        for(int var9 = 0; var9 < var8.length; ++var9) {
                           if(var8[var9] != var5[var9]) {
                              var7 = false;
                              break;
                           }
                        }
                     } else {
                        var7 = false;
                     }

                     if(!var7) {
                        try {
                           FileOutputStream var12 = new FileOutputStream(var6);
                           var12.write(var5, 0, var5.length);
                           var12.close();
                        } catch (Throwable var10) {
                           throw new Exception_Sub3(6, var1, var10);
                        }
                     }

                     this.method6245(var1, var6, (byte)0);
                     return 100;
                  }
               }
            }
         }
      }
   }

   public void method399(String var1) throws Exception_Sub7 {
      this.method6246(var1, Class534.class, -744284779);
   }

   public static Interface61 method6248(int var0) {
      if(null == Class501.anInterface61_5632) {
         throw new IllegalStateException("");
      } else {
         return Class501.anInterface61_5632;
      }
   }

   public static Class307 method6249(int var0, byte var1) {
      return var0 == Class307.aClass307_3293.anInt3298 * 1371368727?Class307.aClass307_3293:(var0 == 1371368727 * Class307.aClass307_3297.anInt3298?Class307.aClass307_3297:(var0 == Class307.aClass307_3294.anInt3298 * 1371368727?Class307.aClass307_3294:(var0 == Class307.aClass307_3295.anInt3298 * 1371368727?Class307.aClass307_3295:(var0 == 1371368727 * Class307.aClass307_3296.anInt3298?Class307.aClass307_3296:null))));
   }
}
