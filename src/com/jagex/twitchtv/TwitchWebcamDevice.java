package com.jagex.twitchtv;

import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import java.util.LinkedList;

public class TwitchWebcamDevice {
   private LinkedList aLinkedList1139 = new LinkedList();
   public int anInt1137;
   public int anInt1138;
   public String aString1135;
   public String aString1136;

   public TwitchWebcamDevice(int var1, int var2, String var3, String var4) {
      this.anInt1137 = var1 * 1258960713;
      this.anInt1138 = 596468431 * var2;
      this.aString1135 = var3;
      this.aString1136 = var4;
   }

   public void AddCapability(int var1, int var2, int var3, int var4, int var5) {
      this.aLinkedList1139.add(new TwitchWebcamDeviceCapability(var1, var2, var3, var4, var5));
   }

   public TwitchWebcamDeviceCapability method1240(int var1) {
      return var1 >= 0 && var1 < this.aLinkedList1139.size()?(TwitchWebcamDeviceCapability)this.aLinkedList1139.get(var1):null;
   }

   public TwitchWebcamDeviceCapability method1241(int var1) {
      for(int var2 = 0; var2 < this.aLinkedList1139.size(); ++var2) {
         if(((TwitchWebcamDeviceCapability)this.aLinkedList1139.get(var2)).anInt1147 * -1476702293 == var1) {
            return (TwitchWebcamDeviceCapability)this.aLinkedList1139.get(var2);
         }
      }

      return null;
   }

   public int method1242() {
      return this.aLinkedList1139.size();
   }

   public int method1243() {
      return this.aLinkedList1139.size();
   }

   public int method1244() {
      return this.aLinkedList1139.size();
   }

   public int method1245() {
      return this.aLinkedList1139.size();
   }
}
