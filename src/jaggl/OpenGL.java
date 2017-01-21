package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {
   long peer;
   public static final int anInt904 = 5120;
   public static final int anInt905 = 5121;
   public static final int anInt906 = 5122;
   public static final int anInt907 = 5123;
   public static final int anInt908 = 5124;
   public static final int anInt909 = 5125;
   public static final int anInt910 = 5126;
   public static final int anInt911 = 0;
   public static final int anInt912 = 1;
   public static final int anInt913 = 2;
   public static final int anInt914 = 3;
   public static final int anInt915 = 4;
   public static final int anInt916 = 5;
   public static final int anInt917 = 6;
   public static final int anInt918 = 7;
   public static final int anInt919 = 5888;
   public static final int anInt920 = 5889;
   public static final int anInt921 = 5890;
   public static final int anInt922 = 2832;
   public static final int anInt923 = 2834;
   public static final int anInt924 = 6913;
   public static final int anInt925 = 6914;
   public static final int anInt926 = 1028;
   public static final int anInt927 = 1029;
   public static final int anInt928 = 2884;
   public static final int anInt929 = 4864;
   public static final int anInt930 = 515;
   public static final int anInt931 = 516;
   public static final int anInt932 = 2929;
   public static final int anInt933 = 6402;
   public static final int anInt934 = 2896;
   public static final int anInt935 = 16384;
   public static final int anInt936 = 16385;
   public static final int anInt937 = 16386;
   public static final int anInt938 = 4615;
   public static final int anInt939 = 4616;
   public static final int anInt940 = 4617;
   public static final int anInt941 = 4608;
   public static final int anInt942 = 4609;
   public static final int anInt943 = 4611;
   public static final int anInt944 = 5634;
   public static final int anInt945 = 2899;
   public static final int anInt946 = 1032;
   public static final int anInt947 = 7425;
   public static final int anInt948 = 2903;
   public static final int anInt949 = 260;
   public static final int anInt950 = 3008;
   public static final int anInt951 = 3042;
   public static final int anInt952 = 0;
   public static final int anInt953 = 1;
   public static final int anInt954 = 768;
   public static final int anInt955 = 769;
   public static final int anInt956 = 770;
   public static final int anInt957 = 771;
   public static final int anInt958 = 774;
   public static final int anInt959 = 2912;
   public static final int anInt960 = 2917;
   public static final int anInt961 = 2914;
   public static final int anInt962 = 2918;
   public static final int anInt963 = 2915;
   public static final int anInt964 = 2916;
   public static final int anInt965 = 9729;
   public static final int anInt966 = 7681;
   public static final int anInt967 = 6406;
   public static final int anInt968 = 6409;
   public static final int anInt969 = 6410;
   public static final int anInt970 = 6144;
   public static final int anInt971 = 6407;
   public static final int anInt972 = 6408;
   public static final int anInt973 = 2982;
   public static final int anInt974 = 3156;
   public static final int anInt975 = 4353;
   public static final int anInt976 = 3089;
   public static final int anInt977 = 3348;
   public static final int anInt978 = 3349;
   public static final int anInt979 = 3352;
   public static final int anInt980 = 3353;
   public static final int anInt981 = 3354;
   public static final int anInt982 = 3355;
   public static final int anInt983 = 3317;
   public static final int anInt984 = 3314;
   public static final int anInt985 = 8960;
   public static final int anInt986 = 8704;
   public static final int anInt987 = 3552;
   public static final int anInt988 = 3553;
   public static final int anInt989 = 10242;
   public static final int anInt990 = 10243;
   public static final int anInt991 = 10240;
   public static final int anInt992 = 10241;
   public static final int anInt993 = 8705;
   public static final int anInt994 = 3168;
   public static final int anInt995 = 3169;
   public static final int anInt996 = 9472;
   public static final int anInt997 = 9984;
   public static final int anInt998 = 9987;
   public static final int anInt999 = 9217;
   public static final int anInt1000 = 9473;
   public static final int anInt1001 = 9216;
   public static final int anInt1002 = 9474;
   public static final int anInt1003 = 8448;
   public static final int anInt1004 = 9728;
   public static final int anInt1005 = 10497;
   public static final int anInt1006 = 8192;
   public static final int anInt1007 = 8193;
   public static final int anInt1008 = 8194;
   public static final int anInt1009 = 8195;
   public static final int anInt1010 = 3170;
   public static final int anInt1011 = 3171;
   public static final int anInt1012 = 7936;
   public static final int anInt1013 = 7937;
   public static final int anInt1014 = 7938;
   private static final int anInt1015 = 7939;
   public static final int anInt1016 = 256;
   public static final int anInt1017 = 1024;
   public static final int anInt1018 = 2048;
   public static final int anInt1019 = 16384;
   public static final int anInt1020 = 32830;
   public static final int anInt1021 = 32834;
   public static final int anInt1022 = 32852;
   public static final int anInt1023 = 32859;
   public static final int anInt1024 = 32884;
   public static final int anInt1025 = 32885;
   public static final int anInt1026 = 32886;
   public static final int anInt1027 = 32888;
   public static final int anInt1028 = 32879;
   public static final int anInt1029 = 33639;
   public static final int anInt1030 = 32993;
   public static final int anInt1031 = 33071;
   public static final int anInt1032 = 33984;
   public static final int anInt1033 = 33985;
   public static final int anInt1034 = 34018;
   public static final int anInt1035 = 32925;
   public static final int anInt1036 = 32926;
   public static final int anInt1037 = 34065;
   public static final int anInt1038 = 34066;
   public static final int anInt1039 = 34067;
   public static final int anInt1040 = 34069;
   public static final int anInt1041 = 34070;
   public static final int anInt1042 = 34071;
   public static final int anInt1043 = 34072;
   public static final int anInt1044 = 34073;
   public static final int anInt1045 = 34074;
   public static final int anInt1046 = 34160;
   public static final int anInt1047 = 34161;
   public static final int anInt1048 = 34162;
   public static final int anInt1049 = 34176;
   public static final int anInt1050 = 34178;
   public static final int anInt1051 = 34184;
   public static final int anInt1052 = 34186;
   public static final int anInt1053 = 34192;
   public static final int anInt1054 = 34200;
   public static final int anInt1055 = 34163;
   public static final int anInt1056 = 34165;
   public static final int anInt1057 = 34023;
   public static final int anInt1058 = 34166;
   public static final int anInt1059 = 34167;
   public static final int anInt1060 = 34168;
   public static final int anInt1061 = 34479;
   public static final int anInt1062 = 33189;
   public static final int anInt1063 = 33190;
   public static final int anInt1064 = 33191;
   public static final int anInt1065 = 34895;
   public static final int anInt1066 = 35000;
   public static final int anInt1067 = 35001;
   public static final int anInt1068 = 35041;
   public static final int anInt1069 = 34466;
   public static final int anInt1070 = 34467;
   public static final int anInt1071 = 34929;
   public static final int anInt1072 = 34930;
   public static final int anInt1073 = 35632;
   public static final int anInt1074 = 35633;
   public static final int anInt1075 = 35724;
   public static final int anInt1076 = 35051;
   public static final int anInt1077 = 34336;
   public static final int anInt1078 = 34379;
   public static final int anInt1079 = 34933;
   public static final int anInt1080 = 34820;
   public static final int anInt1081 = 34962;
   public static final int anInt1082 = 34963;
   public static final int anInt1083 = 35040;
   public static final int anInt1084 = 35044;
   public static final int anInt1085 = 35713;
   public static final int anInt1086 = 35714;
   public static final int anInt1087 = 35716;
   public static final int anInt1088 = 35633;
   public static final int anInt1089 = 35632;
   public static final int anInt1090 = 34037;
   public static final int anInt1091 = 5131;
   public static final int anInt1092 = 34836;
   public static final int anInt1093 = 34837;
   public static final int anInt1094 = 34838;
   public static final int anInt1095 = 34840;
   public static final int anInt1096 = 34841;
   public static final int anInt1097 = 34842;
   public static final int anInt1098 = 34843;
   public static final int anInt1099 = 34844;
   public static final int anInt1100 = 34846;
   public static final int anInt1101 = 34847;
   public static final int anInt1102 = 33777;
   public static final int anInt1103 = 33779;
   public static final int anInt1104 = 36053;
   public static final int anInt1105 = 36064;
   public static final int anInt1106 = 36096;
   public static final int anInt1107 = 36160;
   public static final int anInt1108 = 36161;
   public static final int anInt1109 = 36008;
   public static final int anInt1110 = 36219;
   public static final int anInt1111 = 37143;
   public static final int anInt1112 = 37147;
   public static final int anInt1113 = 37149;
   private Hashtable aHashtable901;
   private Thread aThread902;
   private static Hashtable aHashtable903 = new Hashtable();

   public native long init(Canvas var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public boolean method1219(String var1) {
      if(this.aHashtable901 == null) {
         this.aHashtable901 = new Hashtable();
         String var2 = glGetString(7939);
         int var3 = 0;

         while(true) {
            int var4 = var2.indexOf(32, var3);
            if(var4 == -1) {
               String var6 = var2.substring(var3).trim();
               if(var6.length() != 0) {
                  this.aHashtable901.put(var6, var6);
               }
               break;
            }

            String var5 = var2.substring(var3, var4).trim();
            if(var5.length() != 0) {
               this.aHashtable901.put(var5, var5);
            }

            var3 = 1 + var4;
         }
      }

      return this.aHashtable901.containsKey(var1);
   }

   public synchronized boolean method1220() {
      Thread var1 = Thread.currentThread();
      if(this.attachPeer()) {
         OpenGL var2 = (OpenGL)aHashtable903.put(var1, this);
         if(null != var2) {
            var2.aThread902 = null;
         }

         this.aThread902 = var1;
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean method1221() {
      if(this.aThread902 != Thread.currentThread()) {
         return false;
      } else {
         this.detachPeer();
         aHashtable903.remove(this.aThread902);
         this.aThread902 = null;
         return true;
      }
   }

   private native boolean attachPeer();

   private native void detachPeer();

   public native long prepareSurface(Canvas var1);

   public native void surfaceResized(long var1);

   public native void releaseSurface(Canvas var1, long var2);

   public native boolean setSurface(long var1);

   public native void swapBuffers(long var1);

   public native void setSwapInterval(int var1);

   public native void release();

   public static native void glEnable(int var0);

   public static native void glDisable(int var0);

   public static native void glCullFace(int var0);

   public static native void glPushAttrib(int var0);

   public static native void glPopAttrib();

   public static native void glShadeModel(int var0);

   public static native void glHint(int var0, int var1);

   public static native void glFinish();

   public static native void glFlush();

   public static native void glClear(int var0);

   public static native void glClearColor(float var0, float var1, float var2, float var3);

   public static native void glClearDepth(float var0);

   public static native void glDepthFunc(int var0);

   public static native void glDepthMask(boolean var0);

   public static native void glDepthRange(float var0, float var1);

   public static native void glAlphaFunc(int var0, float var1);

   public static native void glColorMask(boolean var0, boolean var1, boolean var2, boolean var3);

   public static native void glReadBuffer(int var0);

   public static native void glDrawBuffer(int var0);

   public static native void glDrawBuffersARB(int var0, int[] var1, int var2);

   public static native void glMatrixMode(int var0);

   public static native void glPushMatrix();

   public static native void glPopMatrix();

   public static native void glLoadIdentity();

   public static native void glOrtho(double var0, double var2, double var4, double var6, double var8, double var10);

   public static native void glFrustum(double var0, double var2, double var4, double var6, double var8, double var10);

   public static native void glTranslatef(float var0, float var1, float var2);

   public static native void glRotatef(float var0, float var1, float var2, float var3);

   public static native void glScalef(float var0, float var1, float var2);

   public static native void glLoadMatrixf(float[] var0, int var1);

   public static native void glMultMatrixf(float[] var0, int var1);

   public static native void glViewport(int var0, int var1, int var2, int var3);

   public static native void glScissor(int var0, int var1, int var2, int var3);

   public static native int glGenLists(int var0);

   public static native void glDeleteLists(int var0, int var1);

   public static native void glNewList(int var0, int var1);

   public static native void glEndList();

   public static native void glCallList(int var0);

   public static native void glBegin(int var0);

   public static native void glVertex2i(int var0, int var1);

   public static native void glVertex2f(float var0, float var1);

   public static native void glVertex3f(float var0, float var1, float var2);

   public static native void glNormal3f(float var0, float var1, float var2);

   public static native void glColor3f(float var0, float var1, float var2);

   public static native void glColor4f(float var0, float var1, float var2, float var3);

   public static native void glColor3ub(byte var0, byte var1, byte var2);

   public static native void glColor4ub(byte var0, byte var1, byte var2, byte var3);

   public static native void glTexCoord2i(int var0, int var1);

   public static native void glTexCoord3i(int var0, int var1, int var2);

   public static native void glTexCoord2f(float var0, float var1);

   public static native void glTexCoord3f(float var0, float var1, float var2);

   public static native void glMultiTexCoord2i(int var0, int var1, int var2);

   public static native void glMultiTexCoord3i(int var0, int var1, int var2, int var3);

   public static native void glMultiTexCoord2f(int var0, float var1, float var2);

   public static native void glRasterPos2i(int var0, int var1);

   public static native void glEnd();

   public static native void glEnableClientState(int var0);

   public static native void glDisableClientState(int var0);

   public static native void glClientActiveTexture(int var0);

   public static native void glVertexPointer(int var0, int var1, int var2, long var3);

   public static native void glNormalPointer(int var0, int var1, long var2);

   public static native void glColorPointer(int var0, int var1, int var2, long var3);

   public static native void glTexCoordPointer(int var0, int var1, int var2, long var3);

   public static native void glVertexAttribPointer(int var0, int var1, int var2, boolean var3, int var4, long var5);

   public static native void glEnableVertexAttribArray(int var0);

   public static native void glDisableVertexAttribArray(int var0);

   public static native void glBindAttribLocation(int var0, int var1, String var2);

   public static native int glGetAttribLocation(int var0, String var1);

   public static native void glGenBuffersARB(int var0, int[] var1, int var2);

   public static native void glBindBufferARB(int var0, int var1);

   public static native void glBufferDataARBa(int var0, int var1, long var2, int var4);

   public static native void glBufferDataARBub(int var0, int var1, byte[] var2, int var3, int var4);

   public static native void glBufferSubDataARBa(int var0, int var1, int var2, long var3);

   public static native void glBufferSubDataARBub(int var0, int var1, int var2, byte[] var3, int var4);

   public static native long glMapBufferARB(int var0, int var1);

   public static native boolean glUnmapBufferARB(int var0);

   public static native void glDeleteBuffersARB(int var0, int[] var1, int var2);

   public static native void glLineWidth(float var0);

   public static native void glPointSize(float var0);

   public static native void glPolygonMode(int var0, int var1);

   public static native void glDrawArrays(int var0, int var1, int var2);

   public static native void glDrawElements(int var0, int var1, int var2, long var3);

   public static native void glGenTextures(int var0, int[] var1, int var2);

   public static native void glDeleteTextures(int var0, int[] var1, int var2);

   public static native void glActiveTexture(int var0);

   public static native void glBindTexture(int var0, int var1);

   public static native void glTexEnvi(int var0, int var1, int var2);

   public static native void glTexEnvf(int var0, int var1, float var2);

   public static native void glTexEnvfv(int var0, int var1, float[] var2, int var3);

   public static native void glTexGeni(int var0, int var1, int var2);

   public static native void glTexGenfv(int var0, int var1, float[] var2, int var3);

   public static native void glTexParameterf(int var0, int var1, float var2);

   public static native void glTexParameteri(int var0, int var1, int var2);

   public static native void glGetTexImagei(int var0, int var1, int var2, int var3, int[] var4, int var5);

   public static native void glGetTexImageub(int var0, int var1, int var2, int var3, byte[] var4, int var5);

   public static native float glGetTexLevelParameterfv(int var0, int var1, int var2);

   public static native int glGetTexLevelParameteriv(int var0, int var1, int var2);

   public static native void glGetTexImage(int var0, int var1, int var2, int var3, byte[] var4);

   public static native void glTexImage1Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8);

   public static native void glCopyTexImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public static native void glCopyTexSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public static native void glTexImage2Di(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9);

   public static native void glTexImage2Df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9);

   public static native void glTexImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9);

   public static native void glTexSubImage2Di(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9);

   public static native void glTexSubImage2Df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9);

   public static native void glTexSubImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9);

   public static native void glCopyTexSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public static native void glTexImage3Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte[] var9, int var10);

   public static native void glCompressedTexImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8);

   public static native void glCopyPixels(int var0, int var1, int var2, int var3, int var4);

   public static native void glReadPixelsi(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6, int var7);

   public static native void glReadPixelsub(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7);

   public static native void glDrawPixelsi(int var0, int var1, int var2, int var3, int[] var4, int var5);

   public static native void glDrawPixelsub(int var0, int var1, int var2, int var3, byte[] var4, int var5);

   public static native void glPixelZoom(float var0, float var1);

   public static native void glPixelStorei(int var0, int var1);

   public static native void glPixelTransferf(int var0, float var1);

   public static native void glColorMaterial(int var0, int var1);

   public static native void glLightf(int var0, int var1, float var2);

   public static native void glLightfv(int var0, int var1, float[] var2, int var3);

   public static native void glLightModelfv(int var0, float[] var1, int var2);

   public static native void glMaterialfv(int var0, int var1, float[] var2, int var3);

   public static native void glFogi(int var0, int var1);

   public static native void glFogf(int var0, float var1);

   public static native void glFogfv(int var0, float[] var1, int var2);

   public static native void glBlendFunc(int var0, int var1);

   public static native void glBlendFuncSeparate(int var0, int var1, int var2, int var3);

   public static native void glBlendColor(float var0, float var1, float var2, float var3);

   public static native void glGenFramebuffersEXT(int var0, int[] var1, int var2);

   public static native void glDeleteFramebuffersEXT(int var0, int[] var1, int var2);

   public static native void glBindFramebufferEXT(int var0, int var1);

   public static native void glFramebufferTexture2DEXT(int var0, int var1, int var2, int var3, int var4);

   public static native void glFramebufferTexture3DEXT(int var0, int var1, int var2, int var3, int var4, int var5);

   public static native void glFramebufferRenderbufferEXT(int var0, int var1, int var2, int var3);

   public static native int glCheckFramebufferStatusEXT(int var0);

   public static native void glBlitFramebufferEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   public static native void glGenerateMipmapEXT(int var0);

   public static native void glGenRenderbuffersEXT(int var0, int[] var1, int var2);

   public static native void glDeleteRenderbuffersEXT(int var0, int[] var1, int var2);

   public static native void glBindRenderbufferEXT(int var0, int var1);

   public static native void glRenderbufferStorageEXT(int var0, int var1, int var2, int var3);

   public static native void glRenderbufferStorageMultisampleEXT(int var0, int var1, int var2, int var3, int var4);

   public static native int glGenProgramARB();

   public static native void glDeleteProgramARB(int var0);

   public static native void glBindProgramARB(int var0, int var1);

   public static native void glProgramStringARB(int var0, int var1, String var2);

   public static native void glProgramRawARB(int var0, int var1, byte[] var2);

   public static native void glProgramLocalParameter4fARB(int var0, int var1, float var2, float var3, float var4, float var5);

   public static native void glProgramLocalParameter4fvARB(int var0, int var1, float[] var2, int var3);

   public static native void glGetProgramivARB(int var0, int var1, int[] var2, int var3);

   public static native int glCreateProgram();

   public static native int glCreateShader(int var0);

   public static native void glDeleteProgram(int var0);

   public static native void glDeleteShader(int var0);

   public static native void glShaderSource(int var0, String var1);

   public static native void glCompileShader(int var0);

   public static native void glAttachShader(int var0, int var1);

   public static native void glDetachShader(int var0, int var1);

   public static native void glLinkProgram(int var0);

   public static native void glUseProgram(int var0);

   public static native int glGetUniformLocation(int var0, String var1);

   public static native void glUniform1i(int var0, int var1);

   public static native void glUniform1f(int var0, float var1);

   public static native void glUniform2f(int var0, float var1, float var2);

   public static native void glUniform3f(int var0, float var1, float var2, float var3);

   public static native void glUniform4f(int var0, float var1, float var2, float var3, float var4);

   public static native void glUniform1fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform2fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform3fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform4fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniformMatrix2fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glUniformMatrix3fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glUniformMatrix4fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glGetProgramiv(int var0, int var1, int[] var2, int var3);

   public static native void glGetShaderiv(int var0, int var1, int[] var2, int var3);

   public static native void glGetProgramInfoLog(int var0, int var1, int[] var2, int var3, byte[] var4, int var5);

   public static native void glGetShaderInfoLog(int var0, int var1, int[] var2, int var3, byte[] var4, int var5);

   public static native int glGetError();

   public static native String glGetString(int var0);

   public static native void glGetFloatv(int var0, float[] var1, int var2);

   public static native void glGetIntegerv(int var0, int[] var1, int var2);

   public static native void glStencilFunc(int var0, int var1, int var2);

   public static native void glStencilOp(int var0, int var1, int var2);

   public static native long glFenceSync(int var0, int var1);

   public static native boolean glIsSync(long var0);

   public static native void glDeleteSync(long var0);

   public static native int glClientWaitSync(long var0, int var2, int var3);

   public static native void glWaitSync(long var0, int var2, int var3);

   public synchronized boolean method1222() {
      Thread var1 = Thread.currentThread();
      if(this.attachPeer()) {
         OpenGL var2 = (OpenGL)aHashtable903.put(var1, this);
         if(null != var2) {
            var2.aThread902 = null;
         }

         this.aThread902 = var1;
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean method1223() {
      Thread var1 = Thread.currentThread();
      if(this.attachPeer()) {
         OpenGL var2 = (OpenGL)aHashtable903.put(var1, this);
         if(null != var2) {
            var2.aThread902 = null;
         }

         this.aThread902 = var1;
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean method1224() {
      if(this.aThread902 != Thread.currentThread()) {
         return false;
      } else {
         this.detachPeer();
         aHashtable903.remove(this.aThread902);
         this.aThread902 = null;
         return true;
      }
   }

   public synchronized boolean method1225() {
      if(this.aThread902 != Thread.currentThread()) {
         return false;
      } else {
         this.detachPeer();
         aHashtable903.remove(this.aThread902);
         this.aThread902 = null;
         return true;
      }
   }

   public synchronized boolean method1226() {
      if(this.aThread902 != Thread.currentThread()) {
         return false;
      } else {
         this.detachPeer();
         aHashtable903.remove(this.aThread902);
         this.aThread902 = null;
         return true;
      }
   }
}
