package com.jagex;

import com.jagex.Class149;
import com.jagex.Class255;
import com.jagex.Class265;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub29;
import com.jagex.Class526_Sub29_Sub2;
import com.jagex.Class547;
import com.jagex.Class702;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class547_Sub1 extends Class547 implements MouseListener, MouseMotionListener, MouseWheelListener {
   static final int anInt10584 = 4;
   static final int anInt10585 = 2;
   static final int anInt10587 = 1;
   Component aComponent10593;
   int anInt10582;
   int anInt10590;
   int anInt10583;
   int anInt10586;
   int anInt10589;
   Class702 aClass702_10588 = new Class702();
   Class702 aClass702_10592 = new Class702();
   int anInt10591;
   boolean aBool10594;

   public boolean method6547(int var1) {
      return (this.anInt10589 * -868298409 & 2) != 0;
   }

   void method9557(Component var1, int var2) {
      this.method9559(1795802667);
      this.aComponent10593 = var1;
      this.aComponent10593.addMouseListener(this);
      this.aComponent10593.addMouseMotionListener(this);
      this.aComponent10593.addMouseWheelListener(this);
   }

   public boolean method6523(int var1) {
      return (this.anInt10589 * -868298409 & 1) != 0;
   }

   void method9558(int var1, int var2, short var3) {
      this.anInt10582 = -554588459 * var1;
      this.anInt10590 = var2 * -588026079;
      if(this.aBool10594) {
         this.method9561(-1, var1, var2, 0, -447234504);
      }

   }

   public Class526_Sub29 method6529(byte var1) {
      return (Class526_Sub29)this.aClass702_10588.method8177((short)9846);
   }

   public Class526_Sub29 method6528() {
      return (Class526_Sub29)this.aClass702_10588.method8177((short)-4827);
   }

   public int method6540() {
      return this.anInt10583 * -748926587;
   }

   public boolean method6525(int var1) {
      return 0 != (this.anInt10589 * -868298409 & 4);
   }

   public synchronized void method6522(int var1) {
      this.anInt10583 = -1522775399 * this.anInt10582;
      this.anInt10586 = this.anInt10590 * -1198323669;
      this.anInt10589 = this.anInt10591 * -1652360241;
      Class702 var2 = this.aClass702_10588;
      this.aClass702_10588 = this.aClass702_10592;
      this.aClass702_10592 = var2;
      this.aClass702_10592.method8188(2034655331);
   }

   public boolean method6539() {
      return (this.anInt10589 * -868298409 & 2) != 0;
   }

   public int method6531(int var1) {
      return -386554589 * this.anInt10586;
   }

   public void method6530(int var1) {
      this.method9559(-447886224);
   }

   public synchronized void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public synchronized void mouseEntered(MouseEvent var1) {
      this.method9558(var1.getX(), var1.getY(), (short)-13681);
   }

   void method9559(int var1) {
      if(null != this.aComponent10593) {
         this.aComponent10593.removeMouseWheelListener(this);
         this.aComponent10593.removeMouseMotionListener(this);
         this.aComponent10593.removeMouseListener(this);
         this.aComponent10593 = null;
         this.anInt10589 = 0;
         this.anInt10586 = 0;
         this.anInt10583 = 0;
         this.anInt10591 = 0;
         this.anInt10590 = 0;
         this.anInt10582 = 0;
         this.aClass702_10588 = null;
         this.aClass702_10592 = null;
      }
   }

   int method9560(MouseEvent var1, int var2) {
      return var1.getButton() == 1?(var1.isMetaDown()?4:1):(var1.getButton() == 2?2:(var1.getButton() == 3?4:0));
   }

   public synchronized void mousePressed(MouseEvent var1) {
      int var2 = this.method9560(var1, 16711935);
      if(1 == var2) {
         this.method9561(0, var1.getX(), var1.getY(), var1.getClickCount(), -1172575770);
      } else if(4 == var2) {
         this.method9561(2, var1.getX(), var1.getY(), var1.getClickCount(), -1682195785);
      } else if(var2 == 2) {
         this.method9561(1, var1.getX(), var1.getY(), var1.getClickCount(), -155846832);
      }

      this.anInt10591 = -666069527 * (this.anInt10591 * 1731826265 | var2);
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public synchronized void mouseReleased(MouseEvent var1) {
      int var2 = this.method9560(var1, 16711935);
      if((this.anInt10591 * 1731826265 & var2) == 0) {
         var2 = this.anInt10591 * 1731826265;
      }

      if(0 != (var2 & 1)) {
         this.method9561(3, var1.getX(), var1.getY(), var1.getClickCount(), -655097325);
      }

      if(0 != (var2 & 4)) {
         this.method9561(5, var1.getX(), var1.getY(), var1.getClickCount(), 976618038);
      }

      if((var2 & 2) != 0) {
         this.method9561(4, var1.getX(), var1.getY(), var1.getClickCount(), -1986992150);
      }

      this.anInt10591 = -666069527 * (this.anInt10591 * 1731826265 & ~var2);
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public synchronized void mouseDragged(MouseEvent var1) {
      this.method9558(var1.getX(), var1.getY(), (short)-27703);
   }

   public synchronized void mouseMoved(MouseEvent var1) {
      this.method9558(var1.getX(), var1.getY(), (short)-24363);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getWheelRotation();
      this.method9561(6, var2, var3, var4, -758439190);
      var1.consume();
   }

   public synchronized void method6535() {
      this.anInt10583 = -1522775399 * this.anInt10582;
      this.anInt10586 = this.anInt10590 * -1198323669;
      this.anInt10589 = this.anInt10591 * -1652360241;
      Class702 var1 = this.aClass702_10588;
      this.aClass702_10588 = this.aClass702_10592;
      this.aClass702_10592 = var1;
      this.aClass702_10592.method8188(-1018261382);
   }

   Class547_Sub1(Component var1, boolean var2) {
      this.method9557(var1, -677616388);
      this.aBool10594 = var2;
   }

   public boolean method6537() {
      return (this.anInt10589 * -868298409 & 1) != 0;
   }

   public synchronized void mouseExited(MouseEvent var1) {
      this.method9558(var1.getX(), var1.getY(), (short)-3449);
   }

   public int method6534(int var1) {
      return this.anInt10583 * -748926587;
   }

   void method9561(int var1, int var2, int var3, int var4, int var5) {
      Class526_Sub29_Sub2 var6 = Class149.method1750(var1, var2, var3, Class255.time((byte)24), var4, 1174675349);
      this.aClass702_10592.method8176(var6, -762175405);
   }

   public int method6536() {
      return this.anInt10583 * -748926587;
   }

   public int method6527() {
      return this.anInt10583 * -748926587;
   }

   public int method6542() {
      return -386554589 * this.anInt10586;
   }

   public int method6543() {
      return -386554589 * this.anInt10586;
   }

   public Class526_Sub29 method6538() {
      return (Class526_Sub29)this.aClass702_10588.method8177((short)3818);
   }

   public void method6521() {
      this.method9559(-1710884091);
   }

   void method9562() {
      if(null != this.aComponent10593) {
         this.aComponent10593.removeMouseWheelListener(this);
         this.aComponent10593.removeMouseMotionListener(this);
         this.aComponent10593.removeMouseListener(this);
         this.aComponent10593 = null;
         this.anInt10589 = 0;
         this.anInt10586 = 0;
         this.anInt10583 = 0;
         this.anInt10591 = 0;
         this.anInt10590 = 0;
         this.anInt10582 = 0;
         this.aClass702_10588 = null;
         this.aClass702_10592 = null;
      }
   }

   void method9563() {
      if(null != this.aComponent10593) {
         this.aComponent10593.removeMouseWheelListener(this);
         this.aComponent10593.removeMouseMotionListener(this);
         this.aComponent10593.removeMouseListener(this);
         this.aComponent10593 = null;
         this.anInt10589 = 0;
         this.anInt10586 = 0;
         this.anInt10583 = 0;
         this.anInt10591 = 0;
         this.anInt10590 = 0;
         this.anInt10582 = 0;
         this.aClass702_10588 = null;
         this.aClass702_10592 = null;
      }
   }

   void method9564(int var1, int var2) {
      this.anInt10582 = -554588459 * var1;
      this.anInt10590 = var2 * -588026079;
      if(this.aBool10594) {
         this.method9561(-1, var1, var2, 0, 686624481);
      }

   }

   public Class526_Sub29 method6546() {
      return (Class526_Sub29)this.aClass702_10588.method8177((short)19281);
   }

   public void method6544() {
      this.method9559(2007953748);
   }

   public synchronized void method6541() {
      this.anInt10583 = -1522775399 * this.anInt10582;
      this.anInt10586 = this.anInt10590 * -1198323669;
      this.anInt10589 = this.anInt10591 * -1652360241;
      Class702 var1 = this.aClass702_10588;
      this.aClass702_10588 = this.aClass702_10592;
      this.aClass702_10592 = var1;
      this.aClass702_10592.method8188(1479100925);
   }

   public boolean method6524() {
      return (this.anInt10589 * -868298409 & 2) != 0;
   }

   public Class526_Sub29 method6548() {
      return (Class526_Sub29)this.aClass702_10588.method8177((short)-5102);
   }

   static void method9565(int var0, int var1, int var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(1, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = 1693201951 * var1;
   }
}
