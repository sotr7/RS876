package com.jagex;

import com.jagex.Class238;
import com.jagex.Class27;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.IOException_Sub1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;

public class Class27_Sub1 extends Class27 {
   static final String aString10970 = "java.net.useSystemProxies";
   ProxySelector aProxySelector10971 = ProxySelector.getDefault();

   public Socket method719(short var1) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
      if(!var2) {
         System.setProperty("java.net.useSystemProxies", "true");
      }

      boolean var3 = 443 == -1674168277 * this.anInt249;

      List var4;
      List var5;
      try {
         var4 = this.aProxySelector10971.select(new URI((var3?"https":"http") + "://" + this.aString248));
         var5 = this.aProxySelector10971.select(new URI((var3?"http":"https") + "://" + this.aString248));
      } catch (URISyntaxException var15) {
         return this.method720((short)21089);
      }

      var4.addAll(var5);
      Object[] var6 = var4.toArray();
      IOException_Sub1 var7 = null;
      Object[] var8 = var6;

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Object var10 = var8[var9];
         Proxy var11 = (Proxy)var10;

         try {
            Socket var12 = this.method10275(var11, (short)12446);
            if(var12 != null) {
               return var12;
            }
         } catch (IOException_Sub1 var13) {
            var7 = var13;
         } catch (IOException var14) {
            ;
         }
      }

      if(null != var7) {
         throw var7;
      } else {
         return this.method720((short)6566);
      }
   }

   Socket method10275(Proxy var1, short var2) throws IOException {
      if(var1.type() == Type.DIRECT) {
         return this.method720((short)14704);
      } else {
         SocketAddress var3 = var1.address();
         if(!(var3 instanceof InetSocketAddress)) {
            return null;
         } else {
            InetSocketAddress var4 = (InetSocketAddress)var3;
            if(var1.type() == Type.HTTP) {
               String var15 = null;

               try {
                  Class var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                  Method var7 = var6.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                  var7.setAccessible(true);
                  Object var8 = var7.invoke((Object)null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                  if(null != var8) {
                     Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                     var9.setAccessible(true);
                     if(((Boolean)var9.invoke(var8, new Object[0])).booleanValue()) {
                        Method var10 = var6.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        Method var11 = var6.getDeclaredMethod("getHeaderValue", new Class[]{URL.class, String.class});
                        var11.setAccessible(true);
                        String var12 = (String)var10.invoke(var8, new Object[0]);
                        String var13 = (String)var11.invoke(var8, new Object[]{new URL("https://" + this.aString248 + "/"), "https"});
                        var15 = var12 + ": " + var13;
                     }
                  }
               } catch (Exception var14) {
                  ;
               }

               return this.method10276(var4.getHostName(), var4.getPort(), var15, 1190475889);
            } else if(var1.type() == Type.SOCKS) {
               Socket var5 = new Socket(var1);
               var5.connect(new InetSocketAddress(this.aString248, this.anInt249 * -1674168277));
               return var5;
            } else {
               return null;
            }
         }
      }
   }

   Socket method10276(String var1, int var2, String var3, int var4) throws IOException {
      Socket var5 = new Socket(var1, var2);
      var5.setSoTimeout(10000);
      OutputStream var6 = var5.getOutputStream();
      if(null == var3) {
         var6.write(("CONNECT " + this.aString248 + ":" + -1674168277 * this.anInt249 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
      } else {
         var6.write(("CONNECT " + this.aString248 + ":" + this.anInt249 * -1674168277 + " HTTP/1.0\n" + var3 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
      }

      var6.flush();
      BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
      String var8 = var7.readLine();
      if(null != var8) {
         label52: {
            if(!var8.startsWith("HTTP/1.0 200") && !var8.startsWith("HTTP/1.1 200")) {
               if(!var8.startsWith("HTTP/1.0 407") && !var8.startsWith("HTTP/1.1 407")) {
                  break label52;
               }

               int var9 = 0;
               String var10 = "proxy-authenticate: ";

               for(var8 = var7.readLine(); null != var8 && var9 < 50; ++var9) {
                  if(var8.toLowerCase().startsWith(var10)) {
                     var8 = var8.substring(var10.length()).trim();
                     int var11 = var8.indexOf(32);
                     if(var11 != -1) {
                        var8 = var8.substring(0, var11);
                     }

                     throw new IOException_Sub1(var8);
                  }

                  var8 = var7.readLine();
               }

               throw new IOException_Sub1("");
            }

            return var5;
         }
      }

      var6.close();
      var7.close();
      var5.close();
      return null;
   }

   public Socket method721() throws IOException {
      boolean var1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
      if(!var1) {
         System.setProperty("java.net.useSystemProxies", "true");
      }

      boolean var2 = 443 == -1674168277 * this.anInt249;

      List var3;
      List var4;
      try {
         var3 = this.aProxySelector10971.select(new URI((var2?"https":"http") + "://" + this.aString248));
         var4 = this.aProxySelector10971.select(new URI((var2?"http":"https") + "://" + this.aString248));
      } catch (URISyntaxException var14) {
         return this.method720((short)14358);
      }

      var3.addAll(var4);
      Object[] var5 = var3.toArray();
      IOException_Sub1 var6 = null;
      Object[] var7 = var5;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         Object var9 = var7[var8];
         Proxy var10 = (Proxy)var9;

         try {
            Socket var11 = this.method10275(var10, (short)1590);
            if(var11 != null) {
               return var11;
            }
         } catch (IOException_Sub1 var12) {
            var6 = var12;
         } catch (IOException var13) {
            ;
         }
      }

      if(null != var6) {
         throw var6;
      } else {
         return this.method720((short)27761);
      }
   }

   public static Class526_Sub35 method10277(int var0) {
      if(null != Class525_Sub1.aClass702_7106 && null != Class525_Sub1.aClass695_10709) {
         for(Class526_Sub35 var1 = (Class526_Sub35)Class525_Sub1.aClass695_10709.next(); var1 != null; var1 = (Class526_Sub35)Class525_Sub1.aClass695_10709.next()) {
            Class238 var2 = (Class238)Class525_Sub1.aClass40_Sub6_7088.method89(-1572922363 * var1.anInt10664, -653248464);
            if(null != var2 && var2.aBool2434 && var2.method3302(Class525_Sub1.anInterface17_7091, Class525_Sub1.anInterface19_7090, -1497792229)) {
               return var1;
            }
         }

         return null;
      } else {
         return null;
      }
   }
}
