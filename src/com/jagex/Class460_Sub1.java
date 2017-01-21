package com.jagex;

import com.jagex.Class111;
import com.jagex.Class158;
import com.jagex.Class201;
import com.jagex.Class219;
import com.jagex.Class255;
import com.jagex.Class281;
import com.jagex.Class315_Sub1;
import com.jagex.Class325;
import com.jagex.Class348;
import com.jagex.Class457;
import com.jagex.Class460;
import com.jagex.Class492;
import com.jagex.PaddedResourceRequest;
import com.jagex.RSByteBuffer;
import com.jagex.Class53;
import com.jagex.Class544;
import com.jagex.Connection;
import com.jagex.Class571;
import com.jagex.Class593;
import com.jagex.Class633;
import com.jagex.Class662;
import com.jagex.client;
import java.io.IOException;
import java.util.Iterator;

public class Class460_Sub1 extends Class460 {
	Connection connection;

	void method9302() {
		if (this.connection != null) {
			try {
				this.outgoing.pos = 0;
				this.outgoing.writeByte(6, 882184223);
				this.outgoing.writeTriByte(4, -2087642772);
				this.outgoing.writeShort(0, -805078716);
				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, 1491602651);
			} catch (IOException var4) {
				try {
					this.connection.stop((short) -1973);
				} catch (Exception var3) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	public void method5437(int var1) {
		if (this.connection != null) {
			this.connection.method6729(-1380708557);
		}

	}

	public void init(Object connection, boolean loggedIn, int var3) {
		if (null != this.connection) {
			try {
				this.connection.stop((short) -19034);
			} catch (Exception var8) {
				;
			}

			this.connection = null;
		}
		this.connection = (Connection) connection;

		this.sendMagic((byte) 58);
		this.sendLoginState(loggedIn, (short) 859);

		this.header.pos = 0;
		this.meta.pos = 0;
		this.current = null;

		while (true) {
			PaddedResourceRequest head = (PaddedResourceRequest) this.waitingPriorities.poll(1001759089);
			if (head == null) {
				while (true) {
					head = (PaddedResourceRequest) this.waitingExtras.poll(1651265985);
					if (head == null) {
						if (this.encryptionKey != 0) {
							try {
								this.outgoing.pos = 0;
								this.outgoing.writeByte(4, 193207338);
								this.outgoing.writeByte(this.encryptionKey, 1466118338);
								this.outgoing.writeInt(0, -357564953);

								this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, 1010548701);
							} catch (IOException var7) {
								try {
									this.connection.stop((short) -1445);
								} catch (Exception var6) {
									;
								}

								this.connection = null;
								this.errors += 975219635;
								this.status = -985634730;
							}
						}

						this.latency = 0;
						this.lastAttempt = Class255.time((byte) 24) * -3983396954105291943L;
						return;
					}

					head.buffer = null;
					this.aClass696_5180.offer(head, (byte) -61);
				}
			}

			head.buffer = null;
			this.aClass696_5185.offer(head, (byte) -59);
		}
	}

	void sendMagic(byte var1) {
		if (this.connection != null) {
			try {
				this.outgoing.pos = 0;

				this.outgoing.writeByte(6, 382521569);
				this.outgoing.writeTriByte(4, -1415265630);
				this.outgoing.writeShort(0, -805078716);

				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, 577936067);
			} catch (IOException var5) {
				try {
					this.connection.stop((short) -20238);
				} catch (Exception var4) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	public void sendLoginState(boolean loggedIn, short var2) {
		if (null != this.connection) {
			try {
				this.outgoing.pos = 0;
				this.outgoing.writeByte(loggedIn ? 2 : 3, -113056587);
				this.outgoing.write40(0L);

				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -1678065406);
			} catch (IOException var6) {
				try {
					this.connection.stop((short) -15381);
				} catch (Exception var5) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	public void method5435(int var1) {
		if (this.connection != null) {
			try {
				this.outgoing.pos = 0;
				this.outgoing.writeByte(7, -1573113374);
				this.outgoing.write40(0L);
				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -1824033884);
			} catch (IOException var5) {
				try {
					this.connection.stop((short) -17778);
				} catch (Exception var4) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	public void method5436(int var1) {
		if (null != this.connection) {
			this.connection.stop((short) -4733);
		}

	}

	public void method5450() {
		if (this.connection != null) {
			this.connection.method6729(-1380708557);
		}

	}

	public void method5456() {
		if (null != this.connection) {
			this.connection.stop((short) -10267);
		}

	}

	public boolean pulse(byte var1) {
		int change;
		if (this.connection != null) {
			long var2 = Class255.time((byte) 24);
			change = (int) (var2 - this.lastAttempt * -1632882833761092375L);
			this.lastAttempt = -3983396954105291943L * var2;
			if (change > 200) {
				change = 200;
			}

			this.latency += -76668659 * change;
			if (-1374382651 * this.latency > 30000) {
				try {
					this.connection.stop((short) -25141);
				} catch (Exception var16) {
					;
				}

				this.connection = null;
			}
		}

		if (this.connection == null) {
			return this.priorities(-1575592020) == 0 && this.extras(-1353058697) == 0;
		} else {
			try {
				PaddedResourceRequest request;
				for (request = (PaddedResourceRequest) this.aClass696_5185.method8143((byte) -1); null != request; request = (PaddedResourceRequest) this.aClass696_5185.method8139(68831625)) {
					this.outgoing.pos = 0;
					this.outgoing.writeByte(1, 704981932);
					this.outgoing.write40(2384869564219888641L * request.cachedKey);
					this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, 1427645607);
					this.waitingPriorities.offer(request, (byte) -25);
				}

				for (request = (PaddedResourceRequest) this.aClass696_5180.method8143((byte) -1); null != request; request = (PaddedResourceRequest) this.aClass696_5180.method8139(68831625)) {
					this.outgoing.pos = 0;
					this.outgoing.writeByte(0, -312523794);
					this.outgoing.write40(request.cachedKey * 2384869564219888641L);
					this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -85381491);
					this.waitingExtras.offer(request, (byte) -44);
				}

				for (int in = 0; in < 100; ++in) {
					int available = this.connection.available((short) -31071);
					if (available < 0) {
						throw new IOException();
					}

					if (available == 0) {
						break;
					}

					this.latency = 0;
					int index;
					int format;
					if (null == this.current) {
						change = 5 - 301018015 * this.header.pos;
						if (change > available) {
							change = available;
						}

						this.connection.read(this.header.buffer, 301018015 * this.header.pos, change, -420044934);
						if (this.encryptionKey != 0) {
							for (index = 0; index < change; ++index) {
								this.header.buffer[index + 301018015 * this.header.pos] ^= this.encryptionKey;
							}
						}

						this.header.pos += change * 801976415;

						if (this.header.pos * 301018015 >= 5) {
							this.header.pos = 0;

							index = this.header.readUnsignedByte(1229176536); // type
							format = this.header.readInt((byte) 5);

							boolean extra = (format & Integer.MIN_VALUE) != 0;
							int file = format & Integer.MAX_VALUE;
							long key = ((long) index << 32) + (long) file;
							Iterator iteriator;
							PaddedResourceRequest next;
							if (extra) {
								iteriator = this.waitingExtras.iterator();

								while (iteriator.hasNext()) {
									next = (PaddedResourceRequest) iteriator.next();
									if (next.cachedKey * 2384869564219888641L == key) {
										this.current = next;
										break;
									}
								}
							} else {
								iteriator = this.waitingPriorities.iterator();

								while (iteriator.hasNext()) {
									next = (PaddedResourceRequest) iteriator.next();
									if (key == next.cachedKey * 2384869564219888641L) {
										this.current = next;
										break;
									}
								}
							}

							if (this.current == null) {
								throw new IOException();
							}

							this.currentBlock = -32491537;
							this.header.pos = 0;
							this.meta.pos = 0;
						}
					} else {
						RSByteBuffer buffer = this.current.buffer;
						int size;
						if (buffer == null) {
							index = 5 - this.meta.pos * 301018015;
							if (index > available) {
								index = available;
							}

							this.connection.read(this.meta.buffer, this.meta.pos * 301018015, index, -969677443);
							if (this.encryptionKey != 0) {
								for (format = 0; format < index; ++format) {
									this.meta.buffer[this.meta.pos * 301018015 + format] ^= this.encryptionKey;
								}
							}

							this.meta.pos += 801976415 * index;
							if (this.meta.pos * 301018015 >= 5) {
								this.meta.pos = 0;
								format = this.meta.readUnsignedByte(5437466);
								size = this.meta.readInt((byte) 5);
								byte headerSize = 5;
								if (format != Class457.UNCOMPRESSED.getId()) {
									headerSize = 9;
								}

								buffer = this.current.buffer = new RSByteBuffer(this.current.padding + headerSize + size);
								buffer.writeByte(format, -88041846);
								buffer.writeInt(size, -357564953);
								this.currentBlock += -32491537;
							}
						} else {
							index = buffer.buffer.length - this.current.padding;
							format = 102400 - -1198181557 * this.currentBlock;
							if (format > index - buffer.pos * 301018015) {
								format = index - buffer.pos * 301018015;
							}

							if (format > available) {
								format = available;
							}

							this.connection.read(buffer.buffer, buffer.pos * 301018015, format, -2029960898);
							if (this.encryptionKey != 0) {
								for (size = 0; size < format; ++size) {
									buffer.buffer[size + 301018015 * buffer.pos] ^= this.encryptionKey;
								}
							}

							buffer.pos += format * 801976415;
							this.currentBlock += 1711488611 * format;

							if (buffer.pos * 301018015 == index) {
								this.current.uncache(-1450489630);
								this.current.waiting = false;
								this.current = null;
							} else if (102400 == this.currentBlock * -1198181557) {
								this.currentBlock = 0;
								this.current = null;
							}
						}
					}
				}

				return true;
			} catch (IOException var17) {
				try {
					this.connection.stop((short) -26860);
				} catch (Exception var15) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
				return this.priorities(1266103226) == 0 && this.extras(-148301745) == 0;
			}
		}
	}

	public void method5459(boolean var1) {
		if (null != this.connection) {
			try {
				this.outgoing.pos = 0;
				this.outgoing.writeByte(var1 ? 2 : 3, -1508091080);
				this.outgoing.write40(0L);
				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -882464365);
			} catch (IOException var5) {
				try {
					this.connection.stop((short) -6450);
				} catch (Exception var4) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	public void method5446(boolean var1) {
		if (null != this.connection) {
			try {
				this.outgoing.pos = 0;
				this.outgoing.writeByte(var1 ? 2 : 3, -1497538636);
				this.outgoing.write40(0L);
				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -1334696256);
			} catch (IOException var5) {
				try {
					this.connection.stop((short) -9261);
				} catch (Exception var4) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	public void method5455() {
		if (this.connection != null) {
			try {
				this.outgoing.pos = 0;
				this.outgoing.writeByte(7, 2098210152);
				this.outgoing.write40(0L);
				this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -949336652);
			} catch (IOException var4) {
				try {
					this.connection.stop((short) -18591);
				} catch (Exception var3) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
			}

		}
	}

	void method5444(int var1, int var2, byte var3) {
		try {
			this.connection.stop((short) -11846);
		} catch (Exception var5) {
			;
		}

		this.connection = null;
		this.errors += 975219635;
		this.status = -492817365;
		this.encryptionKey = (byte) ((int) (Math.random() * 255.0D + 1.0D));
		this.anInt5176 = -1045407701 * var1;
		this.anInt5189 = -862227025 * var2;
	}

	public void method5458() {
		if (this.connection != null) {
			this.connection.method6729(-1380708557);
		}

	}

	void method5432(int var1, int var2) {
		try {
			this.connection.stop((short) -31743);
		} catch (Exception var4) {
			;
		}

		this.connection = null;
		this.errors += 975219635;
		this.status = -492817365;
		this.encryptionKey = (byte) ((int) (Math.random() * 255.0D + 1.0D));
		this.anInt5176 = -1045407701 * var1;
		this.anInt5189 = -862227025 * var2;
	}

	public boolean method5449() {
		int var3;
		if (this.connection != null) {
			long var1 = Class255.time((byte) 24);
			var3 = (int) (var1 - this.lastAttempt * -1632882833761092375L);
			this.lastAttempt = -3983396954105291943L * var1;
			if (var3 > 200) {
				var3 = 200;
			}

			this.latency += -76668659 * var3;
			if (-1374382651 * this.latency > 30000) {
				try {
					this.connection.stop((short) -23461);
				} catch (Exception var15) {
					;
				}

				this.connection = null;
			}
		}

		if (this.connection == null) {
			return this.priorities(-1727981071) == 0 && this.extras(-425720320) == 0;
		} else {
			try {
				PaddedResourceRequest var5;
				for (var5 = (PaddedResourceRequest) this.aClass696_5185.method8143((byte) -1); null != var5; var5 = (PaddedResourceRequest) this.aClass696_5185.method8139(68831625)) {
					this.outgoing.pos = 0;
					this.outgoing.writeByte(1, -1314051748);
					this.outgoing.write40(2384869564219888641L * var5.cachedKey);
					this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, 1522243487);
					this.waitingPriorities.offer(var5, (byte) -83);
				}

				for (var5 = (PaddedResourceRequest) this.aClass696_5180.method8143((byte) -1); null != var5; var5 = (PaddedResourceRequest) this.aClass696_5180.method8139(68831625)) {
					this.outgoing.pos = 0;
					this.outgoing.writeByte(0, -2002483922);
					this.outgoing.write40(var5.cachedKey * 2384869564219888641L);
					this.connection.write(this.outgoing.buffer, 0, this.outgoing.buffer.length, -1323847511);
					this.waitingExtras.offer(var5, (byte) -2);
				}

				for (int var18 = 0; var18 < 100; ++var18) {
					int var6 = this.connection.available((short) -19193);
					if (var6 < 0) {
						throw new IOException();
					}

					if (var6 == 0) {
						break;
					}

					this.latency = 0;
					int var4;
					int var7;
					if (null == this.current) {
						var3 = 5 - 301018015 * this.header.pos;
						if (var3 > var6) {
							var3 = var6;
						}

						this.connection.read(this.header.buffer, 301018015 * this.header.pos, var3, -890251490);
						if (this.encryptionKey != 0) {
							for (var4 = 0; var4 < var3; ++var4) {
								this.header.buffer[var4 + 301018015 * this.header.pos] ^= this.encryptionKey;
							}
						}

						this.header.pos += var3 * 801976415;
						if (this.header.pos * 301018015 >= 5) {
							this.header.pos = 0;
							var4 = this.header.readUnsignedByte(522506335);
							var7 = this.header.readInt((byte) 5);
							boolean var8 = (var7 & Integer.MIN_VALUE) != 0;
							int var9 = var7 & Integer.MAX_VALUE;
							long var10 = ((long) var4 << 32) + (long) var9;
							Iterator var12;
							PaddedResourceRequest var13;
							if (var8) {
								var12 = this.waitingExtras.iterator();

								while (var12.hasNext()) {
									var13 = (PaddedResourceRequest) var12.next();
									if (var13.cachedKey * 2384869564219888641L == var10) {
										this.current = var13;
										break;
									}
								}
							} else {
								var12 = this.waitingPriorities.iterator();

								while (var12.hasNext()) {
									var13 = (PaddedResourceRequest) var12.next();
									if (var10 == var13.cachedKey * 2384869564219888641L) {
										this.current = var13;
										break;
									}
								}
							}

							if (this.current == null) {
								throw new IOException();
							}

							this.currentBlock = -32491537;
							this.header.pos = 0;
							this.meta.pos = 0;
						}
					} else {
						RSByteBuffer var17 = this.current.buffer;
						int var19;
						if (var17 == null) {
							var4 = 5 - this.meta.pos * 301018015;
							if (var4 > var6) {
								var4 = var6;
							}

							this.connection.read(this.meta.buffer, this.meta.pos * 301018015, var4, -2011055692);
							if (this.encryptionKey != 0) {
								for (var7 = 0; var7 < var4; ++var7) {
									this.meta.buffer[this.meta.pos * 301018015 + var7] ^= this.encryptionKey;
								}
							}

							this.meta.pos += 801976415 * var4;
							if (this.meta.pos * 301018015 >= 5) {
								this.meta.pos = 0;
								var7 = this.meta.readUnsignedByte(2126607478);
								var19 = this.meta.readInt((byte) 5);
								byte var20 = 5;
								if (var7 != Class457.UNCOMPRESSED.getId()) {
									var20 = 9;
								}

								var17 = this.current.buffer = new RSByteBuffer(this.current.padding + var20 + var19);
								var17.writeByte(var7, -1018143676);
								var17.writeInt(var19, -357564953);
								this.currentBlock += -32491537;
							}
						} else {
							var4 = var17.buffer.length - this.current.padding;
							var7 = 102400 - -1198181557 * this.currentBlock;
							if (var7 > var4 - var17.pos * 301018015) {
								var7 = var4 - var17.pos * 301018015;
							}

							if (var7 > var6) {
								var7 = var6;
							}

							this.connection.read(var17.buffer, var17.pos * 301018015, var7, -1506714719);
							if (this.encryptionKey != 0) {
								for (var19 = 0; var19 < var7; ++var19) {
									var17.buffer[var19 + 301018015 * var17.pos] ^= this.encryptionKey;
								}
							}

							var17.pos += var7 * 801976415;
							this.currentBlock += 1711488611 * var7;
							if (var17.pos * 301018015 == var4) {
								this.current.uncache(-181059076);
								this.current.waiting = false;
								this.current = null;
							} else if (102400 == this.currentBlock * -1198181557) {
								this.currentBlock = 0;
								this.current = null;
							}
						}
					}
				}

				return true;
			} catch (IOException var16) {
				try {
					this.connection.stop((short) -23296);
				} catch (Exception var14) {
					;
				}

				this.connection = null;
				this.errors += 975219635;
				this.status = -985634730;
				return this.priorities(1127553095) == 0 && this.extras(-2113128401) == 0;
			}
		}
	}

	static final void method9304(int var0, int var1, int var2, boolean var3, int var4) {
		if (Class348.method4525(var0, (int[]) null, -1377047027)) {
			Class281.method3712(Class315_Sub1.aClass243Array10033[var0].aClass245Array2459, -1, var1, var2, var3, -873263682);
		}
	}

	public static final void logout(boolean var0, int var1) {
		Class111[] var2 = client.aClass111Array11061;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class111 var4 = var2[var3];

			try {
				var4.method1365((byte) -80);
			} catch (IOException var7) {
				;
			}

			var4.method1369(1572616876);
		}

		Class219.method3036(-1900798662);
		Class633.method7528((byte) -2);
		Class571.method6896(false, 1359375858);
		client.aClass505_11204.method6074(-2010966002);
		client.aClass505_11204.method6073(-2116153604);
		client.aClass505_11204.method6104((byte) 78);
		Class325.method4182(26407976);
		Class544.method6508(-1451954583);
		Class201.method2878(true, 1346327841);
		Class662.method7944(-898614246);
		Class158.method1874(-1423020474);
		client.localPlayerIndex = 817102969;
		if (var0) {
			Class593.method7031(4, (byte) 16);
		} else {
			Class593.method7031(16, (byte) 27);

			try {
				Class53.method968(Class492.anApplet5526, "loggedout", 1179748939);
			} catch (Throwable var6) {
				;
			}
		}

	}

	@Override
	public boolean method5426() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean method5441() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean method5448() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void method5451(Object var1, boolean var2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method5452(Object var1, boolean var2) {
		// TODO Auto-generated method stub

	}
}
