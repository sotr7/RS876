package com.jagex;

import java.io.IOException;
import java.util.Arrays;

public class PacketFrameDecoder {
	public int[] anIntArray4091;
	public int anInt4092;
	public Class526_Sub21_Sub12 aClass526_Sub21_Sub12_4093;

	static final void method4791(Class681 var0, int var1) {
		String var2 = (String) var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
		Class111 var3 = Class452_Sub4.method9295((byte) 91);
		OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4196,
				var3.aClass14_1342, -1786406759);
		var4.out.writeByte(0, -898127768);
		int var5 = var4.out.pos * 301018015;
		var4.out.method9616(var2, 849792374);
		var4.out.writeShort(-1382935785 * var0.aClass392_8632.anInt4092,
				-805078716);
		var0.aClass392_8632.aClass526_Sub21_Sub12_4093.method10673(var4.out,
				var0.aClass392_8632.anIntArray4091, 177609252);
		var4.out.method9678(301018015 * var4.out.pos - var5, (byte) -18);
		var3.write(var4, (byte) 1);
	}

	public static void method4792(Class68 var0, int var1) {
		Class709.method8305(new Class576(var0), 1685072587);
	}

	static final boolean method4793(Class111 connection, byte var1)
			throws IOException {
		Connection var2 = connection.method1364(-1184311292);
		Buffer buffer = connection.buffer;
		if (null == var2) {
			return false;
		} else {
			int id;
			if (null == connection.CURRENT_FRAME) {
				if (connection.aBool1343) {
					if (!var2.method6727(1, -1804365894)) {
						return false;
					}

					var2.read(connection.buffer.buffer, 0, 1, -1514390292);
					connection.anInt1347 += -639668449;
					connection.anInt1349 = 0;
					connection.aBool1343 = false;
				}

				buffer.pos = 0;
				if (buffer.nextIsSmart(-1202651945)) {
					if (!var2.method6727(1, -2024484907)) {
						return false;
					}

					var2.read(connection.buffer.buffer, 1, 1, -1515717437);
					connection.anInt1347 += -639668449;
					connection.anInt1349 = 0;
				}

				connection.aBool1343 = true;
				IncomingFrame[] var4 = Class326.method4193((byte) 32);
				id = buffer.readEncryptedSmart((byte) -102);
				if (id < 0 || id >= var4.length) {
					throw new IOException(id + " " + 301018015 * buffer.pos);
				}

				connection.CURRENT_FRAME = var4[id];
				connection.currentFrame = -1866476257
						* connection.CURRENT_FRAME.size;
			}

			if (-1 == connection.currentFrame * -1225783061) {
				if (!var2.method6727(1, -994937144)) {
					return false;
				}

				var2.read(buffer.buffer, 0, 1, -1510290089);
				connection.currentFrame = (buffer.buffer[0] & 255)
						* -2062655549;
				connection.anInt1347 += -639668449;
				connection.anInt1349 = 0;
			}

			if (-1225783061 * connection.currentFrame == -2) {
				if (!var2.method6727(2, -161137082)) {
					return false;
				}

				var2.read(buffer.buffer, 0, 2, -803917554);
				buffer.pos = 0;
				connection.currentFrame = buffer.readUnsignedShort(346455599)
						* -2062655549;
				connection.anInt1347 += -1279336898;
				connection.anInt1349 = 0;
			}

			if (connection.currentFrame * -1225783061 > 0) {
				if (!var2.method6727(connection.currentFrame * -1225783061,
						-1734562760)) {
					return false;
				}

				buffer.pos = 0;
				var2.read(buffer.buffer, 0, connection.currentFrame
						* -1225783061, -911673821);
				connection.anInt1347 += connection.currentFrame * 849607029;
				connection.anInt1349 = 0;
			}

			connection.aClass420_1352 = connection.aClass420_1351;
			connection.aClass420_1351 = connection.aClass420_1348;
			connection.aClass420_1348 = connection.CURRENT_FRAME;

			int clickThrough;
			if (IncomingFrame.GRAND_EXCHANGE == connection.CURRENT_FRAME) {
				clickThrough = buffer.readUnsignedByte(2029373227);
				id = buffer.readUnsignedByte(-1230665757);
				if (buffer.readUnsignedByte(42757790) == 0) { // force remove
					client.aClass492ArrayArray11265[clickThrough][id] = new Class492();
				} else {
					buffer.pos -= 801976415;
					client.aClass492ArrayArray11265[clickThrough][id] = new Class492(
							buffer, (Class97_Sub1) null);
				}

				client.anInt11234 = -1925156257 * client.anInt11214;
				connection.CURRENT_FRAME = null;
				return true;
			} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4711) {
				if (!client.aBool11302) {
					try {
						clickThrough = buffer.readByteC((byte) 8);
						id = buffer.readUnsignedByte128((byte) 36);
						client.aClass216_11301.method2969(id, 1517212089)
								.method3059(clickThrough, 1026071656);
					} catch (RuntimeException var44) {
						Class375.method4671((String) null, var44, (byte) 14);
						Class604.method7103(connection, -285397623);
					}
				}

				connection.CURRENT_FRAME = null;
				return true;
			} else if (connection.CURRENT_FRAME == IncomingFrame.PLAYER_HEAD_ON_INTERFACE) {
				clickThrough = buffer.readIntV2((byte) 127);
				Class28.method729((byte) 1);
				Class487.method5860(clickThrough, 3, -1204447689
						* client.localPlayerIndex, 0, (byte) 12);
				connection.CURRENT_FRAME = null;
				return true;
			} else {
				int var8;
				int hash;
				int var10;
				int var13;
				boolean var64;
				boolean var73;
				int var78;
				if (IncomingFrame.SLOT_CONTAINER_UPDATE == connection.CURRENT_FRAME) {
					clickThrough = buffer.readUnsignedShort(584670675);
					id = buffer.readUnsignedByte(1364406171);
					var73 = (id & 1) != 0;
					var64 = 0 != (id & 2);
					Class163_Sub6.method9003(clickThrough, var73, (byte) 81);
					var8 = buffer.readUnsignedShort(1054324061);

					for (hash = 0; hash < var8; ++hash) {
						var10 = buffer.readUnsignedShort(1325350201);
						var78 = buffer.readUnsignedByte(104322488);
						if (255 == var78) {
							var78 = buffer.readInt((byte) 5);
						}

						Class2 var119 = null;
						if (var64) {
							var13 = buffer.readUnsignedByte(2136034849);
							if (var13 > 0) {
								var119 = new Class2(
										Class476.aClass97_Sub1_Sub2_5386);

								while (var13-- > 0) {
									Class424 var137 = Class476.aClass97_Sub1_Sub2_5386
											.method8370(buffer, -1407475282);
									var119.method27(
											1602756037 * var137.anInt4793,
											var137.anObject4794, 172204199);
								}
							}
						}

						Class526_Sub10.method9363(clickThrough, hash,
								var10 - 1, var78, var119, var73, -1766938107);
					}

					client.anIntArray11129[(client.anInt11220 += 1236360113)
							* -1051062959 - 1 & 63] = clickThrough;
					connection.CURRENT_FRAME = null;
					return true;
				} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4612) {
					Class601.method7093(buffer.readString(557125919), 157872667);
					connection.CURRENT_FRAME = null;
					return true;
				} else {
					int var6;
					int var59;
					if (IncomingFrame.aClass420_4595 == connection.CURRENT_FRAME) {
						clickThrough = buffer
								.readUnsignedShort128((short) 14166);
						id = buffer.readUnsignedShort128((short) 6333);
						var6 = buffer.readIntV2((byte) 58);
						var59 = buffer.readUnsignedShort128((short) 24435);
						Class28.method729((byte) 1);
						Class487.method5860(var6, 7, id << 16 | clickThrough,
								var59, (byte) 12);
						connection.CURRENT_FRAME = null;
						return true;
					} else {
						String var57;
						String var61;
						if (IncomingFrame.PRIVATE_MESSAGE == connection.CURRENT_FRAME) {
							var61 = buffer.readString(408677911);
							var57 = Class415.method4931(
									Class431.method5064(buffer, -485494199),
									2014288430);
							Class177.method2659(6, 0, var61, var61, var61,
									var57, (Class415) null, 452509066);
							connection.CURRENT_FRAME = null;
							return true;
						} else if (connection.CURRENT_FRAME == IncomingFrame.CS2_SCRIPT_PACKET) {
							var61 = buffer.readString(518654980);
							Object[] var176 = new Object[var61.length() + 1];

							for (var6 = var61.length() - 1; var6 >= 0; --var6) {
								if (var61.charAt(var6) == 115) {
									var176[var6 + 1] = buffer
											.readString(-1416371733);
								} else {
									var176[var6 + 1] = new Integer(
											buffer.readInt((byte) 5));
								}
							}

							var176[0] = new Integer(buffer.readInt((byte) 5));

							System.out.println("sendExecuteScript: "
									+ Arrays.toString(var176));

							Class28.method729((byte) 1);
							Class526_Sub39 var175 = new Class526_Sub39();
							var175.anObjectArray10701 = var176;
							Class270.method3594(var175, -567636363);
							connection.CURRENT_FRAME = null;
							return true;
						} else {
							byte var65;
							if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4523) {
								if (!client.aBool11302) {
									try {
										var65 = buffer.writeByte128(-560354904);
										id = buffer
												.readUnsignedByte(-2102896066);
										var6 = buffer.readIntV2((byte) 116);
										client.aClass216_11301.method2969(id,
												1517212089).method3061(var6,
												var65, -1631909439);
									} catch (RuntimeException var45) {
										Class375.method4671((String) null,
												var45, (byte) 25);
										Class604.method7103(connection,
												-424259283);
									}
								}

								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.SET_PLAYER_INTERFACE == connection.CURRENT_FRAME) {
								clickThrough = buffer
										.readUnsignedByte128((byte) 36);
								id = buffer
										.readUnsignedShortLE128((short) 5888);
								var6 = buffer.readIntLE(-461489698);
								var59 = buffer.readInt((byte) 5);
								var8 = buffer.readUnsignedShort(1937669997);
								hash = buffer.readInt((byte) 5);
								var10 = buffer.readIntV1(-630628485);
								var78 = buffer.readIntV2((byte) 35);

								Class28.method729((byte) 1);
								IncomingFrame.method4983(var6,
										new Class526_Sub38_Sub3(var8,
												clickThrough, id), new int[] {
												var59, var10, hash, var78 },
										false, (short) -26767);
								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.aClass420_4640 == connection.CURRENT_FRAME) {
								Class497.anInt5567 = buffer
										.method9628(-1969319997) * -921164325;
								client.aBool11161 = buffer
										.readUnsignedByte(1649810309) == 1;
								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.RESET_NIS_VARS == connection.CURRENT_FRAME) {
								Class538.aClass149_Sub1_7225
										.method8351((byte) 0);
								connection.CURRENT_FRAME = null;
								return false;
							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4687) { // TODO
																									// Find
																									// out
																									// what
																									// this
																									// is.
								clickThrough = buffer
										.readUnsignedByte(1869718993);
								id = buffer.readBigSmart((byte) 61);

								if (null != client.aClass536Array11019[clickThrough]) {
									client.aClass536Array11019[clickThrough]
											.method6406(client.aClass505_11204
													.method6072(190328147),
													(byte) 3);
									client.aClass536Array11019[clickThrough] = null;
								}

								if (id != -1) {
									client.aClass536Array11019[clickThrough] = new Class536(
											Class554.aClass174_7475, buffer, id);
								}

								connection.CURRENT_FRAME = null;
								return true;
							} else if (connection.CURRENT_FRAME == IncomingFrame.PLAYER_OPTION) {
								var61 = buffer.readString(-1499127626);
								id = buffer.readUnsigned128Byte((byte) -41);
								var6 = buffer.readUnsignedByte128((byte) 36);
								var59 = buffer.readUnsignedShort(1363927488);
								if (var59 == '\uffff') {
									var59 = -1;
								}

								if (id >= 1 && id <= 8) {
									if (var61.equalsIgnoreCase("null")) {
										var61 = null;
									}

									client.aStringArray11158[id - 1] = var61;
									client.anIntArray11168[id - 1] = var59;
									client.aBoolArray11170[id - 1] = 0 == var6;
								}

								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.aClass420_4706 == connection.CURRENT_FRAME) {
								clickThrough = buffer
										.readUnsignedShortLE128((short) 5888);
								id = buffer.readUnsignedLEShort((byte) 126);
								Class28.method729((byte) 1);
								Class471.method5634(id, clickThrough, 0,
										-238649033);
								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.CUTSCENE == connection.CURRENT_FRAME) {
								clickThrough = buffer
										.readUnsignedShort(1748341369);
								client.anInt11075 = 1730876415;
								client.anInt11072 = clickThrough * 238438937;
								client.anInt11073 = 0;
								Class310.aClass466_3382.method5537(-1498975703
										* client.anInt11072, (byte) 80);
								Class114.method1400(1992807157);
								Class304.method4018(-1786438448);
								id = buffer.readUnsignedShort(1632795880);
								client.anInt11077 = id * 2145180011;
								var6 = buffer.readUnsignedByte(396912089);
								Class322.aClass526_Sub36_3457 = new RSByteBuffer(
										var6);
								Class322.aClass526_Sub36_3457.method9619(
										buffer.buffer, 301018015 * buffer.pos,
										var6, 1670210198);
								buffer.pos += var6 * 801976415;
								connection.CURRENT_FRAME = null;
								return false;
							} else if (IncomingFrame.aClass420_4622 == connection.CURRENT_FRAME) {
								client.aClass618_11164 = (Class618) Class561
										.findIdentifiable(Class618
												.method7323(2115283841), buffer
												.readUnsignedByte(-1934560649),
												(byte) -27);
								if (null == client.aClass618_11164) {
									client.aClass618_11164 = Class618.aClass618_8104;
								}

								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.aClass420_4581 == connection.CURRENT_FRAME) {
								if (!client.aBool11302) {
									try {
										clickThrough = buffer
												.readUnsigned128Byte((byte) -13);
										id = buffer
												.readUnsignedByte128((byte) 36);
										client.aClass216_11301.method2969(id,
												1517212089).method3063(
												clickThrough, -1402914305);
									} catch (RuntimeException var46) {
										Class375.method4671((String) null,
												var46, (byte) 121);
										Class604.method7103(connection,
												-1060277271);
									}
								}

								connection.CURRENT_FRAME = null;
								return true;
							} else if (IncomingFrame.aClass420_4565 == connection.CURRENT_FRAME) {
								Class246.method3392(Class422.aClass422_4733,
										830998279);
								connection.CURRENT_FRAME = null;
								return true;
							} else {
								byte var87;
								if (IncomingFrame.aClass420_4617 == connection.CURRENT_FRAME) {
									clickThrough = buffer
											.readUnsignedByte(1476350017);
									clickThrough = -clickThrough - 2;
									var87 = buffer.readByte((byte) 59);
									Class639_Sub1_Sub2_Sub1_Sub1 var172 = (Class639_Sub1_Sub2_Sub1_Sub1) client.aMap11156
											.get(Integer.valueOf(clickThrough));
									if (var172 == null) {
										var172 = new Class639_Sub1_Sub2_Sub1_Sub1(
												(Class549) null);
										var172.index = clickThrough * 1016367843;
										client.aMap11156.put(
												Integer.valueOf(clickThrough),
												var172);
									}

									var172.method10976(buffer, var87,
											(byte) -71);
									connection.CURRENT_FRAME = null;
									return true;
								} else if (IncomingFrame.aClass420_4686 == connection.CURRENT_FRAME) {
									clickThrough = buffer.readIntV1(-630628485);
									if (Class94.anInt1156 * 1267003723 != clickThrough) {
										Class94.anInt1156 = clickThrough * 1178996835;
										Class636.method7566(
												Class581.aClass581_7753, -1,
												-1, 739592530);
									}

									connection.CURRENT_FRAME = null;
									return true;
								} else if (IncomingFrame.aClass420_4561 == connection.CURRENT_FRAME) {
									clickThrough = buffer
											.readUnsignedShort(1633565962);
									Class570.aClass231_7657.method3237(
											clickThrough, -1718038134);
									connection.CURRENT_FRAME = null;
									return true;
								} else if (connection.CURRENT_FRAME == IncomingFrame.HIDE_ICOMPONENT) {
									clickThrough = buffer.readInt((byte) 5);
									id = buffer.readUnsignedByte128((byte) 36);

									int interfaceId = clickThrough >> 16;
									int componentId = clickThrough & 0xFFFF;

									System.out
											.println("player.getPackets().sendHideIComponent("
													+ interfaceId
													+ ", "
													+ componentId
													+ ", "
													+ (id == 1) + ");");

									Class28.method729((byte) 1);
									Class199_Sub16.method9021(clickThrough, id,
											1256665609);
									connection.CURRENT_FRAME = null;
									return true;
								} else if (connection.CURRENT_FRAME == IncomingFrame.SET_TARGET) {
									client.anInt11000 = buffer
											.readShortLE128(742342165)
											* -588618759;
									connection.CURRENT_FRAME = null;
									return true;
								} else {
									byte var83;
									if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4631) {
										if (!client.aBool11302) {
											try {
												for (var65 = buffer
														.readByte((byte) 36); -1 != var65; var65 = buffer
														.readByte((byte) 67)) {
													for (var87 = buffer
															.readByte((byte) 84); var87 != -1; var87 = buffer
															.readByte((byte) 23)) {
														for (var83 = buffer
																.readByte((byte) 70); -1 != var83; var83 = buffer
																.readByte((byte) 82)) {
															client.aClass216_11301
																	.method2969(
																			var65,
																			1517212089)
																	.method3082(
																			var87,
																			var83,
																			Integer.valueOf(buffer
																					.readInt((byte) 5)),
																			(byte) 2);
														}
													}
												}
											} catch (RuntimeException var54) {
												Class375.method4671(
														(String) null, var54,
														(byte) 84);
												Class604.method7103(connection,
														-2033580758);
											}
										}

										connection.CURRENT_FRAME = null;
										return true;
									} else {
										boolean var58;
										String var63;
										String var67;
										byte[] var178;
										if (connection.CURRENT_FRAME == IncomingFrame.OPEN_URL) {
											if (Class710.aBool8850
													&& Class499.aFrame5603 != null) {
												Class551.method6647(
														Class230.preferences.aClass711_Sub7_10637
																.method9899((byte) 5),
														-1, -1, false,
														-1003129228);
											}

											var178 = new byte[-1225783061
													* connection.currentFrame
													- 1];
											var58 = buffer
													.readUnsignedByte(-1723267020) == 1;
											buffer.readEncrypted(
													var178,
													0,
													-1225783061
															* connection.currentFrame
															- 1, -557328877);
											RSByteBuffer var171 = new RSByteBuffer(
													var178);
											var63 = var171
													.readString(2021735705);
											if (var58) {
												var67 = var171
														.readString(1634659150);
												if (var67.length() == 0) {
													var67 = var63;
												}

												if (!client.aBool10981
														|| Class222.aString2308
																.startsWith("mac")
														|| !Class232
																.method3261(
																		var63,
																		1,
																		Class413.aClass413_4449
																				.method4911(-1975659751),
																		-1514081739)) {
													Class438.openJSURL(var67,
															true,
															client.aBool10997,
															568943885);
												}
											} else {
												Class438.openJSURL(var63, true,
														client.aBool10997,
														1114437886);
											}

											connection.CURRENT_FRAME = null;
											return true;
										} else {
											boolean var68;
											if (connection.CURRENT_FRAME == IncomingFrame.FRIEND_CHAT_LIST) {
												client.anInt11231 = -488772589
														* client.anInt11214;
												if (0 == -1225783061
														* connection.currentFrame) {
													client.aString11017 = null;
													client.aString11264 = null;
													Class11.anInt145 = 0;
													Class655.aClass107Array8488 = null;
													connection.CURRENT_FRAME = null;
													return true;
												} else {
													client.aString11264 = buffer
															.readString(-1911352642);
													var68 = buffer
															.readUnsignedByte(1678045951) == 1;
													if (var68) {
														buffer.readString(-166495036);
													}

													client.aString11017 = buffer
															.readString(-371980641);
													Class313_Sub1.aByte10012 = buffer
															.readByte((byte) 46);
													id = buffer
															.readUnsignedByte(-1263107182);
													if (id == 255) {
														connection.CURRENT_FRAME = null;
														return true;
													} else {
														Class11.anInt145 = id * 2102881055;
														Class107[] var170 = new Class107[100];

														for (var59 = 0; var59 < Class11.anInt145
																* -190820129; ++var59) {
															var170[var59] = new Class107();
															var170[var59].aString1310 = buffer
																	.readString(1051962301);
															var68 = buffer
																	.readUnsignedByte(623438987) == 1;
															if (var68) {
																var170[var59].aString1311 = buffer
																		.readString(-1414753675);
															} else {
																var170[var59].aString1311 = var170[var59].aString1310;
															}

															var170[var59].aString1312 = Class81
																	.method1164(
																			var170[var59].aString1311,
																			Class583.aClass82_7781,
																			(byte) 1);
															var170[var59].anInt1313 = buffer
																	.readUnsignedShort(1552556276) * 538336499;
															var170[var59].aByte1315 = buffer
																	.readByte((byte) 13);
															var170[var59].aString1314 = buffer
																	.readString(1479058011);
															if (var170[var59].aString1311
																	.equals(Class451.localPlayer.aString12161)) {
																Class397.aByte4127 = var170[var59].aByte1315;
															}
														}

														var64 = false;
														hash = Class11.anInt145
																* -190820129;

														while (hash > 0) {
															var64 = true;
															--hash;

															for (var10 = 0; var10 < hash; ++var10) {
																if (var170[var10].aString1312
																		.compareTo(var170[var10 + 1].aString1312) > 0) {
																	Class107 var126 = var170[var10];
																	var170[var10] = var170[1 + var10];
																	var170[1 + var10] = var126;
																	var64 = false;
																}
															}

															if (var64) {
																break;
															}
														}

														Class655.aClass107Array8488 = var170;
														connection.CURRENT_FRAME = null;
														return true;
													}
												}
											} else {
												long var15;
												long var17;
												long var19;
												int var21;
												LinkableObject var95;
												Class415 var97;
												boolean var106;
												String var123;
												int var133;
												if (connection.CURRENT_FRAME == IncomingFrame.CLAN_CHAT_MESSAGE) {
													var68 = buffer
															.readUnsignedByte(-1256721100) == 1;
													var57 = buffer
															.readString(-1220390849);
													var15 = buffer
															.readUnsignedShort(1735257744);
													var17 = buffer
															.read24BitInt(742041327);
													var97 = (Class415) Class561
															.findIdentifiable(
																	Class415.method4930(417021430),
																	buffer.readUnsignedByte(-567217255),
																	(byte) -16);
													var19 = (var15 << 32)
															+ var17;
													var106 = false;
													var95 = null;
													Class526_Sub9 var136 = var68 ? Class318_Sub2.aClass526_Sub9_10065
															: Class673.aClass526_Sub9_8581;
													if (null == var136) {
														var106 = true;
													} else {
														var21 = 0;

														while (true) {
															if (var21 >= 100) {
																if (var97.aBool4474) {
																	if ((!client.aBool11161 || client.aBool11162)
																			&& !client.aBool11004) {
																		if (Class590
																				.method7011(
																						var57,
																						249782944)) {
																			var106 = true;
																		}
																	} else {
																		var106 = true;
																	}
																}
																break;
															}

															if (client.aLongArray11165[var21] == var19) {
																var106 = true;
																break;
															}

															++var21;
														}
													}

													if (!var106) {
														client.aLongArray11165[client.anInt11262
																* -1662656037] = var19;
														client.anInt11262 = 75575891 * ((1 + client.anInt11262
																* -1662656037) % 100);
														var123 = Class415
																.method4931(
																		Class431.method5064(
																				buffer,
																				-1345943661),
																		1531767885);
														var133 = var68 ? 41
																: 44;
														if (var97.anInt4476
																* -665210955 != -1) {
															Class503.method6041(
																	var133,
																	0,
																	Class199_Sub13
																			.method9016(
																					var97.anInt4476
																							* -665210955,
																					16711935)
																			+ var57,
																	Class199_Sub13
																			.method9016(
																					var97.anInt4476
																							* -665210955,
																					16711935)
																			+ var57,
																	var57,
																	var123,
																	var136.aString10403,
																	-1, var97,
																	948861035);
														} else {
															Class503.method6041(
																	var133,
																	0,
																	var57,
																	var57,
																	var57,
																	var123,
																	var136.aString10403,
																	-1, var97,
																	-1895854821);
														}
													}

													connection.CURRENT_FRAME = null;
													return true;
												} else if (IncomingFrame.aClass420_4578 == connection.CURRENT_FRAME) {
													if (Class710.aBool8850
															&& Class499.aFrame5603 != null) {
														Class551.method6647(
																Class230.preferences.aClass711_Sub7_10637
																		.method9899((byte) 69),
																-1, -1, false,
																1214354987);
													}

													var178 = new byte[-1225783061
															* connection.currentFrame];
													buffer.readEncrypted(
															var178,
															0,
															-1225783061
																	* connection.currentFrame,
															-861234800);
													var57 = Class448
															.method5334(
																	var178,
																	0,
																	connection.currentFrame
																			* -1225783061,
																	-1459866971);
													Class438.openJSURL(var57,
															true,
															client.aBool10997,
															363034575);
													connection.CURRENT_FRAME = null;
													return true;
												} else {
													long var23;
													long var25;
													String var60;
													Class415 var82;
													boolean var132;
													String var144;
													if (connection.CURRENT_FRAME == IncomingFrame.FRIEND_CHAT_MESSAGE) {
														var68 = buffer
																.readUnsignedByte(1043229287) == 1;
														var57 = buffer
																.readString(-1459586804);
														var60 = var57;
														if (var68) {
															var60 = buffer
																	.readString(-1113613936);
														}

														var63 = buffer
																.readString(1635233373);
														var17 = buffer
																.readUnsignedShort(1480962936);
														var23 = buffer
																.read24BitInt(742041327);
														var82 = (Class415) Class561
																.findIdentifiable(
																		Class415.method4930(474935552),
																		buffer.readUnsignedByte(365328944),
																		(byte) -105);
														var25 = var23
																+ (var17 << 32);
														var132 = false;
														var133 = 0;

														while (true) {
															if (var133 >= 100) {
																if (var82.aBool4474) {
																	if ((!client.aBool11161 || client.aBool11162)
																			&& !client.aBool11004) {
																		if (Class590
																				.method7011(
																						var60,
																						-1491271335)) {
																			var132 = true;
																		}
																	} else {
																		var132 = true;
																	}
																}
																break;
															}

															if (var25 == client.aLongArray11165[var133]) {
																var132 = true;
																break;
															}

															++var133;
														}

														if (!var132) {
															client.aLongArray11165[client.anInt11262
																	* -1662656037] = var25;
															client.anInt11262 = (1 + client.anInt11262
																	* -1662656037) % 100 * 75575891;
															var144 = Class415
																	.method4931(
																			Class431.method5064(
																					buffer,
																					-538677627),
																			632161579);
															if (-665210955
																	* var82.anInt4476 != -1) {
																Class503.method6041(
																		9,
																		0,
																		Class199_Sub13
																				.method9016(
																						var82.anInt4476
																								* -665210955,
																						16711935)
																				+ var57,
																		Class199_Sub13
																				.method9016(
																						-665210955
																								* var82.anInt4476,
																						16711935)
																				+ var60,
																		var57,
																		var144,
																		var63,
																		-1,
																		var82,
																		-1160217127);
															} else {
																Class503.method6041(
																		9,
																		0,
																		var57,
																		var60,
																		var57,
																		var144,
																		var63,
																		-1,
																		var82,
																		-683238631);
															}
														}

														connection.CURRENT_FRAME = null;
														return true;
													} else if (connection.CURRENT_FRAME == IncomingFrame.SET_NPC_INTERFACE) {
														clickThrough = buffer
																.readUnsignedShortLE128((short) 5888);
														id = buffer
																.readUnsignedShort128((short) 2239);
														var6 = buffer
																.readIntV1(-630628485);
														var59 = buffer
																.readIntV1(-630628485);
														var8 = buffer
																.readIntV1(-630628485);
														hash = buffer
																.readIntV1(-630628485);
														var10 = buffer
																.readByteC((byte) 8);
														var78 = buffer
																.readIntV2((byte) 71);
														Class28.method729((byte) 1);
														IncomingFrame
																.method4983(
																		hash,
																		new Class526_Sub38_Sub1(
																				id,
																				var10,
																				clickThrough),
																		new int[] {
																				var78,
																				var8,
																				var59,
																				var6 },
																		false,
																		(short) -5616);
														connection.CURRENT_FRAME = null;
														return true;
													} else if (IncomingFrame.aClass420_4692 == connection.CURRENT_FRAME) {
														Class195.aClass292_Sub1_2182
																.method9123(
																		buffer,
																		connection.currentFrame
																				* -1225783061,
																		-1777732940);
														client.anInt11238 = -743587149
																* client.anInt11214;
														connection.CURRENT_FRAME = null;
														return true;
													} else if (IncomingFrame.aClass420_4614 == connection.CURRENT_FRAME) {
														Class300.anInt3254 = (buffer
																.readByte((byte) 62) << 3) * 1499537771;
														Class130.anInt1618 = (buffer
																.read128Byte((byte) -102) << 3)
																* -1789279365;
														Class711.anInt8858 = buffer
																.readUnsigned128Byte((byte) -77)
																* -2050331237;
														Class596 var177 = client.aClass505_11204
																.method6128(1939177834);

														for (Class526_Sub20 var173 = (Class526_Sub20) client.aClass20_11259
																.method638(1588990496); var173 != null; var173 = (Class526_Sub20) client.aClass20_11259
																.method639(-2095602831)) {
															var6 = (int) (var173.aLong7156
																	* -6805155999452426801L >> 28 & 3L);
															var59 = (int) (-6805155999452426801L
																	* var173.aLong7156 & 16383L);
															var8 = var59
																	- var177.localX
																	* -814686591;
															hash = (int) (-6805155999452426801L
																	* var173.aLong7156 >> 14 & 16383L);
															var10 = hash
																	- -845789331
																	* var177.localY;
															if (var6 == 1728196755 * Class711.anInt8858
																	&& var8 >= 381658035 * Class130.anInt1618
																	&& var8 < 8 + Class130.anInt1618 * 381658035
																	&& var10 >= Class300.anInt3254 * 76546883
																	&& var10 < Class300.anInt3254 * 76546883 + 8) {
																var173.method6332(-1949449864);
																if (var8 >= 0
																		&& var10 >= 0
																		&& var8 < client.aClass505_11204
																				.method6056(-1746741811)
																		&& var10 < client.aClass505_11204
																				.method6057(126749238)) {
																	Class646.method7691(
																			1728196755 * Class711.anInt8858,
																			var8,
																			var10,
																			-1933488108);
																}
															}
														}

														Class526_Sub1 var174;
														for (var174 = (Class526_Sub1) Class526_Sub1.aClass702_10311
																.method8206((byte) 88); var174 != null; var174 = (Class526_Sub1) Class526_Sub1.aClass702_10311
																.method8181(-326905441)) {
															if (195793035 * var174.anInt10301 >= 381658035 * Class130.anInt1618
																	&& var174.anInt10301 * 195793035 < 8 + 381658035 * Class130.anInt1618
																	&& 64888215 * var174.anInt10298 >= 76546883 * Class300.anInt3254
																	&& var174.anInt10298 * 64888215 < 76546883 * Class300.anInt3254 + 8
																	&& var174.anInt10306
																			* -1761255799 == 1728196755 * Class711.anInt8858) {
																var174.aBool10310 = true;
															}
														}

														for (var174 = (Class526_Sub1) Class526_Sub1.aClass702_10309
																.method8206((byte) 89); null != var174; var174 = (Class526_Sub1) Class526_Sub1.aClass702_10309
																.method8181(182008285)) {
															if (var174.anInt10301 * 195793035 >= 381658035 * Class130.anInt1618
																	&& var174.anInt10301 * 195793035 < 8 + Class130.anInt1618 * 381658035
																	&& 64888215 * var174.anInt10298 >= 76546883 * Class300.anInt3254
																	&& var174.anInt10298 * 64888215 < 8 + Class300.anInt3254 * 76546883
																	&& var174.anInt10306
																			* -1761255799 == Class711.anInt8858 * 1728196755) {
																var174.aBool10310 = true;
															}
														}

														connection.CURRENT_FRAME = null;
														return true;
													} else if (IncomingFrame.HINTICON == connection.CURRENT_FRAME) {
														clickThrough = buffer
																.readUnsignedByte(-472650063);
														id = clickThrough >> 5;
														var6 = clickThrough & 31;
														if (0 == var6) {
															client.aClass113Array11018[id] = null;
															connection.CURRENT_FRAME = null;
															return true;
														} else {
															Class113 var140 = new Class113();
															var140.anInt1367 = var6 * 1765667441;
															var140.anInt1360 = buffer
																	.readUnsignedByte(807498170)
																	* -235515051;
															if (-236252675
																	* var140.anInt1360 >= 0
																	&& -236252675
																			* var140.anInt1360 < Class294.aClass153Array3188.length) {
																if (1 != var140.anInt1367
																		* -941650287
																		&& -941650287
																				* var140.anInt1367 != 10) {
																	if (var140.anInt1367
																			* -941650287 >= 2
																			&& -941650287
																					* var140.anInt1367 <= 6) {
																		if (2 == var140.anInt1367
																				* -941650287) {
																			var140.anInt1363 = -47729408;
																			var140.anInt1365 = 1464976640;
																		}

																		if (3 == var140.anInt1367
																				* -941650287) {
																			var140.anInt1363 = 0;
																			var140.anInt1365 = 1464976640;
																		}

																		if (4 == var140.anInt1367
																				* -941650287) {
																			var140.anInt1363 = -95458816;
																			var140.anInt1365 = 1464976640;
																		}

																		if (-941650287
																				* var140.anInt1367 == 5) {
																			var140.anInt1363 = -47729408;
																			var140.anInt1365 = 0;
																		}

																		if (6 == -941650287
																				* var140.anInt1367) {
																			var140.anInt1363 = -47729408;
																			var140.anInt1365 = -1365014016;
																		}

																		var140.anInt1367 = -763632414;
																		var140.anInt1362 = buffer
																				.readUnsignedByte(-1565616545)
																				* -1132355257;
																		Class596 var124 = client.aClass505_11204
																				.method6128(1934246672);
																		var140.anInt1363 += (buffer
																				.readUnsignedShort(138988208)
																				- -814686591
																				* var124.localX << 9)
																				* -906156107;
																		var140.anInt1365 += (buffer
																				.readUnsignedShort(776668099)
																				- var124.localY
																				* -845789331 << 9)
																				* -396930619;
																		var140.anInt1364 = (buffer
																				.readUnsignedByte(618741773) << 2) * 1858271609;
																		var140.anInt1368 = buffer
																				.readUnsignedShort(1198983404)
																				* -1596719355;
																	}
																} else {
																	var140.anInt1361 = buffer
																			.readUnsignedShort(1106688840)
																			* -105088939;
																	var140.anInt1359 = buffer
																			.readUnsignedShort(1041412273) * 882254151;
																	buffer.pos += -1087061636;
																}

																var140.anInt1366 = buffer
																		.readInt((byte) 5) * 741863463;
																client.aClass113Array11018[id] = var140;
															}

															connection.CURRENT_FRAME = null;
															return true;
														}
													} else if (IncomingFrame.IGNORE_LIST == connection.CURRENT_FRAME) {
														while (buffer.pos * 301018015 < connection.currentFrame
																* -1225783061) {
															clickThrough = buffer
																	.readUnsignedByte(364880411);
															var58 = 1 == (clickThrough & 1);
															var60 = buffer
																	.readString(-1489777697);
															var63 = buffer
																	.readString(-700429370);
															var67 = buffer
																	.readString(-1527676453);

															for (hash = 0; hash < client.anInt11218
																	* -87727903; ++hash) {
																Class25 var117 = client.aClass25Array11169[hash];
																if (var58) {
																	if (var63
																			.equals(var117.aString243)) {
																		var117.aString243 = var60;
																		var117.aString245 = var63;
																		var60 = null;
																		break;
																	}
																} else if (var60
																		.equals(var117.aString243)) {
																	var117.aString243 = var60;
																	var117.aString245 = var63;
																	var117.aString244 = var67;
																	var60 = null;
																	break;
																}
															}

															if (var60 != null
																	&& client.anInt11218
																			* -87727903 < 400) {
																Class25 var111 = new Class25();
																client.aClass25Array11169[client.anInt11218
																		* -87727903] = var111;
																var111.aString243 = var60;
																var111.aString245 = var63;
																var111.aString244 = var67;
																var111.aBool242 = (clickThrough & 2) == 2;
																client.anInt11218 += -1316494559;
															}
														}

														client.anInt11246 = client.anInt11214 * 1211622781;
														connection.CURRENT_FRAME = null;
														return true;
													} else if (IncomingFrame.CS2_VAR_STRING_SMALL == connection.CURRENT_FRAME) {
														clickThrough = buffer
																.readUnsignedShort(1370355502);
														var57 = buffer
																.readString(1914996604);

														System.out
																.println("player.getPackets().sendCSVarString("
																		+ clickThrough
																		+ ", "
																		+ var57
																		+ ")");

														Class28.method729((byte) 1);
														Class114.method1401(
																clickThrough,
																var57,
																1960946563);
														connection.CURRENT_FRAME = null;
														return true;
													} else if (IncomingFrame.ICOMPONENT_TEXT == connection.CURRENT_FRAME) {
														clickThrough = buffer
																.readInt((byte) 5);
														var57 = buffer
																.readString(-1806364234);
														Class28.method729((byte) 1);
														Class231.method3256(
																clickThrough,
																var57,
																(byte) -43);
														connection.CURRENT_FRAME = null;
														return true;
													} else if (IncomingFrame.CLAN_INFO == connection.CURRENT_FRAME) {
														client.anInt11197 = client.anInt11214 * 1458373147;
														var68 = buffer
																.readUnsignedByte(-1541016187) == 1;
														if (connection.currentFrame
																* -1225783061 == 1) {
															if (var68) {
																Class603.aClass348_7890 = null;
															} else {
																Class325_Sub2.aClass348_10028 = null;
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else {
															if (var68) {
																Class603.aClass348_7890 = new Class348(
																		buffer);
															} else {
																Class325_Sub2.aClass348_10028 = new Class348(
																		buffer);
															}

															connection.CURRENT_FRAME = null;
															return true;
														}
													} else {
														long var27;
														Class526_Sub24 var107;
														Class526_Sub24 var113;
														if (IncomingFrame.aClass420_4538 == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readIntLE(783270541);
															id = buffer
																	.readUnsignedShort(55832832);
															var6 = buffer
																	.readUnsignedShort(354590133);
															if ('\uffff' == var6) {
																var6 = -1;
															}

															var59 = buffer
																	.readUnsignedShort(908771103);
															if (var59 == '\uffff') {
																var59 = -1;
															}

															Class28.method729((byte) 1);

															for (var8 = var59; var8 <= var6; ++var8) {
																var27 = ((long) clickThrough << 32)
																		+ var8;
																var113 = (Class526_Sub24) client.aClass20_11087
																		.get(var27);
																if (var113 == null) {
																	if (-1 == var8) {
																		var107 = new Class526_Sub24(
																				Class221.method3095(
																						clickThrough,
																						(byte) 63).aClass526_Sub24_2486.anInt10547
																						* -798296491,
																				id);
																	} else {
																		var107 = new Class526_Sub24(
																				0,
																				id);
																	}
																} else {
																	var107 = new Class526_Sub24(
																			-798296491
																					* var113.anInt10547,
																			id);
																	var113.method6332(-1949449864);
																}

																client.aClass20_11087
																		.put(var107,
																				var27);
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4629 == connection.CURRENT_FRAME) {
															Class246.method3392(
																	Class422.aClass422_4724,
																	830998279);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4530) {
															clickThrough = buffer
																	.readUnsignedByte(802638707);
															Class709 var169 = (Class709) Class561
																	.findIdentifiable(
																			Class572.method6912((byte) 2),
																			clickThrough,
																			(byte) -8);
															if (var169 == null) {
																var169 = Class709.aClass709_8845;
															}

															Class408.method4888(
																	var169,
																	-475195746);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.ROOT_INTERFACE_PACKET == connection.CURRENT_FRAME) {
															buffer.readByteC((byte) 8);
															clickThrough = buffer
																	.readIntV2((byte) 68);
															id = buffer
																	.readIntV2((byte) 62);
															var6 = buffer
																	.readUnsignedShort(250011589);
															var59 = buffer
																	.readIntLE(260151584);
															var8 = buffer
																	.readIntV1(-630628485);
															Class28.method729((byte) 1);
															int[] var105 = new int[] {
																	id, var59,
																	var8,
																	clickThrough };
															client.anInt11186 = -1056082607
																	* var6;
															Class595.method7043(
																	var6,
																	var105,
																	675856481);
															Class474.method5652(
																	false,
																	(short) 31753);
															Class107.method1346(
																	-327748687
																			* client.anInt11186,
																	var105,
																	(byte) 8);

															for (var10 = 0; var10 < 111; ++var10) {
																client.aBoolArray11236[var10] = true;
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.PLAY_SOUND_EFFECT) {
															clickThrough = buffer
																	.readUnsignedShort(438076442);
															if ('\uffff' == clickThrough) {
																clickThrough = -1;
															}

															id = buffer
																	.readUnsignedByte(-1559440370);
															var6 = buffer
																	.readUnsignedShort(35669122);
															var59 = buffer
																	.readUnsignedByte(-1645294991);
															Class570.aClass231_7657
																	.method3246(
																			Class188.aClass188_2142,
																			clickThrough,
																			id,
																			var59,
																			Class187.aClass187_2131
																					.method2723(-2001704164),
																			Class204.aClass204_2219,
																			0.0F,
																			0.0F,
																			(Class446) null,
																			0,
																			256,
																			var6,
																			-652271631);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.RESET_CAMERA) {
															Class28.method729((byte) 1);
															Class418.method4974(
																	Class397.method4824((byte) 1),
																	(byte) 112);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4715 == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readUnsigned128Byte((byte) -77);
															id = buffer
																	.readUnsignedShort(667176896);
															var6 = buffer
																	.readInt((byte) 5);
															var59 = buffer
																	.readUnsignedShort(792243122);
															Class28.method729((byte) 1);
															Class539_Sub1
																	.method9251(
																			var6,
																			clickThrough,
																			var59,
																			id,
																			-2032341391);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4701) {
															clickThrough = buffer
																	.readUnsignedShort(1800011085);
															if (clickThrough == '\uffff') {
																clickThrough = -1;
															}

															id = buffer
																	.readUnsignedByte(-1932249294);
															var6 = buffer
																	.readUnsignedShort(922333480);
															var59 = buffer
																	.readUnsignedByte(-1678564310);
															var8 = buffer
																	.readUnsignedShort(1538867146);
															hash = buffer
																	.readUnsignedShort(395965262);
															Class482 var112 = Class570.aClass231_7657
																	.method3232(
																			Class188.aClass188_2142,
																			Class570.aClass231_7657,
																			clickThrough,
																			id,
																			var59,
																			Class187.aClass187_2124
																					.method2723(-1866901098),
																			Class204.aClass204_2219,
																			0.0F,
																			0.0F,
																			(Class446) null,
																			0,
																			var8,
																			false,
																			(byte) 13);
															if (var112 != null) {
																Class570.aClass231_7657
																		.method3192(
																				var112,
																				hash,
																				var6,
																				(byte) -39);
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4545 == connection.CURRENT_FRAME) {
															buffer.pos += 980503140;
															if (buffer
																	.method9652(-1621865704)) {
																Class598.method7074(
																		buffer,
																		buffer.pos * 301018015 - 28,
																		-1568471618);
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.ITEM_ICOMPONENT == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readInt((byte) 5);
															id = buffer
																	.readIntLE(-153611547);
															var6 = buffer
																	.readUnsignedShort128((short) 4068);
															if ('\uffff' == var6) {
																var6 = -1;
															}

															Class28.method729((byte) 1);
															Class23.method695(
																	clickThrough,
																	var6, id,
																	(byte) -71); // uid,
																					// size,
																					// amount
															Class11 var127 = (Class11) Class448_Sub1.aClass40_Sub1_10233
																	.method89(
																			var6,
																			-1980672093);
															Class77.method1134(
																	clickThrough,
																	-1031428353
																			* var127.anInt90,
																	var127.anInt71 * 791675893,
																	var127.anInt84 * 1347714149,
																	(byte) -16);
															Class59.method1036(
																	clickThrough,
																	56338811 * var127.anInt141,
																	-1116392745
																			* var127.anInt121,
																	var127.anInt87 * 469399953,
																	185233573);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4569) {
															clickThrough = buffer
																	.readInt((byte) 5);
															id = buffer
																	.readUnsignedShort(248714490);
															Class28.method729((byte) 1);
															Class539_Sub6
																	.method9313(
																			id,
																			clickThrough,
																			(byte) -70);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.SET_SPRITE) {
															clickThrough = buffer
																	.readIntLE(1009117714);
															id = buffer
																	.readInt((byte) 5);
															Class28.method729((byte) 1);
															InterfaceDef inter = Class221
																	.method3095(
																			id,
																			(byte) 32);
															inter.spriteArchive = clickThrough * 1343949111;
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.CS_VAR_2_PACKET) {
															clickThrough = buffer
																	.readIntLE(1842691479);
															id = buffer
																	.readUnsignedLEShort((byte) 62);

															System.out
																	.println("player.getPackets().sendCSVarInteger("
																			+ id
																			+ ", "
																			+ clickThrough
																			+ ")");

															Class28.method729((byte) 1);
															Class547_Sub1
																	.method9565(
																			id,
																			clickThrough,
																			1194023769);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4624) {
															if (!client.aBool11302) {
																try {
																	clickThrough = buffer
																			.readIntV1(-630628485);
																	id = buffer
																			.readUnsignedByte128((byte) 36);
																	var83 = buffer
																			.readByteC(-2087725885);
																	client.aClass216_11301
																			.method2969(
																					id,
																					1517212089)
																			.method3058(
																					clickThrough,
																					var83,
																					-732204736);
																} catch (RuntimeException var47) {
																	Class375.method4671(
																			(String) null,
																			var47,
																			(byte) 49);
																	Class604.method7103(
																			connection,
																			-710687612);
																}
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4684 == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readUnsignedShort(304231701);
															id = buffer
																	.readUnsignedShort(1880476529);
															Class570.aClass231_7657
																	.method3198(
																			clickThrough,
																			id,
																			-889078236);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.CLAN_CHANNEL) {
															client.anInt11233 = client.anInt11214
																	* -1765588999;
															var68 = buffer
																	.readUnsignedByte(740027695) == 1;
															if (1 == connection.currentFrame
																	* -1225783061) {
																if (var68) {
																	Class318_Sub2.aClass526_Sub9_10065 = null;
																} else {
																	Class673.aClass526_Sub9_8581 = null;
																}

																connection.CURRENT_FRAME = null;
																return true;
															} else {
																if (var68) {
																	Class318_Sub2.aClass526_Sub9_10065 = new Class526_Sub9(
																			buffer);
																} else {
																	Class673.aClass526_Sub9_8581 = new Class526_Sub9(
																			buffer);
																}

																connection.CURRENT_FRAME = null;
																return true;
															}
														} else if (IncomingFrame.SYSTEM_UPDATE == connection.CURRENT_FRAME) {
															if (Class385
																	.method4746(
																			-558705405
																					* client.anInt11038,
																			(byte) 34)) {
																client.anInt11159 = (int) (buffer
																		.readUnsignedShort(1535757901) * 2.5F) * 1427836259;
															} else {
																client.anInt11159 = buffer
																		.readUnsignedShort(1283878075)
																		* -114585190;
															}

															client.anInt11235 = -1386702209
																	* client.anInt11214;
															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4705 == connection.CURRENT_FRAME) {
															if (-1 != client.anInt11186
																	* -327748687) {
																Class458.method5419(
																		client.anInt11186
																				* -327748687,
																		0,
																		(byte) 10);
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4553) {
															client.anInt11237 = 1363982633 * client.anInt11214;
															clickThrough = buffer.pos * 301018015;
															id = buffer
																	.readUnsignedShort(535573313);
															var73 = buffer
																	.readUnsignedByte(-911977913) == 1;
															Class218 var125 = Class566.aClass223_7610
																	.method3122(
																			id,
																			(byte) 126);
															Class2 var108 = var125
																	.method3025((byte) -101);
															if (null == var108
																	|| var73) {
																var125.method3006(
																		client.anInterface28_11266,
																		1946562337);
																var108 = var125
																		.method3025((byte) -127);
															}

															while (connection.currentFrame
																	* -1225783061
																	- (301018015 * buffer.pos - clickThrough) > 0) {
																Class424 var103 = Class506.aClass97_Sub1_Sub1_5698
																		.method8370(
																				buffer,
																				1095597004);
																var108.method27(
																		var103.anInt4793 * 1602756037,
																		var103.anObject4794,
																		172204199);
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4527 == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readShort(-1645805687);
															id = buffer
																	.readShort(-1318485968);
															var6 = buffer
																	.readIntLE(1739076198);
															Class28.method729((byte) 1);
															Class37_Sub1
																	.method9583(
																			var6,
																			id,
																			clickThrough,
																			(byte) -79);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.NPC_ON_INTERFACE == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readIntV1(-630628485);
															id = buffer
																	.readIntV2((byte) 106);
															Class28.method729((byte) 1);
															Class487.method5860(
																	clickThrough,
																	2, id, -1,
																	(byte) 12);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4575) {
															var68 = buffer
																	.readUnsignedByte(-940044029) == 1;
															if (var68) {
																Class418.method4974(
																		2,
																		(byte) 81);
															} else {
																Class418.method4974(
																		1,
																		(byte) 69);
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4681) {
															Class246.method3392(
																	Class422.aClass422_4726,
																	830998279);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4535) {
															if (!client.aBool11302) {
																try {
																	clickThrough = buffer
																			.readIntLE(1682490193);
																	var87 = buffer
																			.read128Byte((byte) -86);
																	client.aClass216_11301
																			.method2970(
																					new Class221(
																							clickThrough),
																					var87,
																					-1732784617);
																} catch (RuntimeException var48) {
																	Class375.method4671(
																			(String) null,
																			var48,
																			(byte) 78);
																	Class604.method7103(
																			connection,
																			-1174629789);
																}
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.PLAY_MUSIC == connection.CURRENT_FRAME) {
															clickThrough = buffer
																	.readUnsignedByte128((byte) 36);
															id = buffer
																	.readUnsignedShort128((short) 8664);
															if (id == '\uffff') {
																id = -1;
															}

															Class570.aClass231_7657
																	.method3236(
																			id,
																			clickThrough,
																			877911551);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4526) {
															clickThrough = buffer
																	.readUnsignedShort(1623472627);
															id = buffer
																	.readUnsignedShort(1330441857);
															var6 = buffer
																	.readUnsignedShort(922246493);
															Class570.aClass231_7657
																	.method3197(
																			clickThrough,
																			id,
																			var6,
																			(byte) 124);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (connection.CURRENT_FRAME == IncomingFrame.PROJECTILE_TORSO_FOCUS) {
															Class246.method3392(
																	Class422.aClass422_4737,
																	830998279);
															connection.CURRENT_FRAME = null;
															return true;
														} else if (IncomingFrame.aClass420_4702 == connection.CURRENT_FRAME) {
															if (!client.aBool11302) {
																try {
																	clickThrough = buffer
																			.readByteC((byte) 8);
																	id = buffer
																			.readUnsignedByte128((byte) 36);
																	var6 = buffer
																			.readUnsignedByte(-640330850);
																	client.aClass216_11301
																			.method2969(
																					var6,
																					1517212089)
																			.method3075(
																					id,
																					clickThrough,
																					(byte) -126);
																} catch (RuntimeException var49) {
																	Class375.method4671(
																			(String) null,
																			var49,
																			(byte) 107);
																	Class604.method7103(
																			connection,
																			-1489979082);
																}
															}

															connection.CURRENT_FRAME = null;
															return true;
														} else {
															Buffer connectionBuffer;
															if (connection.CURRENT_FRAME == IncomingFrame.CONSTRUCTED_MAP) {
																connectionBuffer = new Buffer(
																		connection.currentFrame
																				* -1225783061);
																System.arraycopy(
																		connection.buffer.buffer,
																		connection.buffer.pos * 301018015,
																		connectionBuffer.buffer,
																		0,
																		-1225783061
																				* connection.currentFrame);
																Class684.method8044((byte) -58);
																if (Class230.preferences.aClass711_Sub25_10626
																		.method10074((byte) -124) == 1) {
																	Class297.aClass517_3235
																			.method6217(
																					new Class509(
																							Class502.CONSTRUCTED,
																							connectionBuffer),
																					1618112224);
																} else {
																	client.aClass505_11204
																			.method6120(
																					new Class509(
																							Class502.CONSTRUCTED,
																							connectionBuffer),
																					(byte) 1);
																}

																connection.CURRENT_FRAME = null;
																return false;
															} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4603) {
																clickThrough = buffer
																		.readUnsignedShort(1334671533);
																Class570.aClass231_7657
																		.method3195(
																				clickThrough,
																				1650671156);
																connection.CURRENT_FRAME = null;
																return true;
															} else if (IncomingFrame.SKILLS_UPDATE == connection.CURRENT_FRAME) {
																clickThrough = buffer
																		.readUnsignedByte(-69372546);
																id = buffer
																		.readIntLE(1788111938);
																var6 = buffer
																		.readUnsigned128Byte((byte) -87);
																Class109.aClass607_1322
																		.method7133(
																				var6,
																				-1534240839);
																Class242.aClass94_2456.aClass625Array1152[var6]
																		.method7429(
																				id,
																				337509595);
																Class242.aClass94_2456.aClass625Array1152[var6]
																		.method7432(
																				clickThrough,
																				-1959614349);
																client.anIntArray11221[(client.anInt11222 += 196288619) * 942443587 - 1 & 63] = var6;
																connection.CURRENT_FRAME = null;
																return true;
															} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4696) {
																client.anInt11052 = client.anInt11214 * 1732341749;
																Class232 var167 = new Class232(
																		buffer,
																		client.anInterface28_11266);
																var167.method3259(
																		Class566.aClass223_7610,
																		(byte) 0);
																connection.CURRENT_FRAME = null;
																return true;
															} else if (connection.CURRENT_FRAME == IncomingFrame.SPRITE_ON_INTERFACE) {
																clickThrough = buffer
																		.readInt((byte) 5);
																id = buffer
																		.readIntV1(-630628485);
																Class28.method729((byte) 1);
																Class425.method5009(
																		clickThrough,
																		id,
																		(byte) 7);
																connection.CURRENT_FRAME = null;
																return true;
															} else if (connection.CURRENT_FRAME == IncomingFrame.CLOSE_INTERFACE) {
																clickThrough = buffer
																		.readIntV2((byte) 99);
																Class28.method729((byte) 1);
																Class526_Sub38 var151 = (Class526_Sub38) client.aClass20_11187
																		.get(clickThrough);
																if (null != var151) {
																	Class710.method8307(
																			var151,
																			true,
																			false,
																			(byte) 0);
																}

																if (null != client.aClass245_11213) {
																	Class526_Sub31
																			.method9555(
																					client.aClass245_11213,
																					(byte) 10);
																	client.aClass245_11213 = null;
																}

																connection.CURRENT_FRAME = null;
																return true;
															} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4560) {
																for (clickThrough = 0; clickThrough < client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154.length; ++clickThrough) {
																	if (null != client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[clickThrough]) {
																		client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[clickThrough].anIntArray11935 = null;
																		client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[clickThrough].aClass704_11915
																				.method8246(
																						-1,
																						(byte) -47);
																	}
																}

																for (clickThrough = 0; clickThrough < client.anInt11051 * 2027369339; ++clickThrough) {
																	((Class639_Sub1_Sub2_Sub1) client.aClass526_Sub7Array11050[clickThrough].anObject10399).anIntArray11935 = null;
																	((Class639_Sub1_Sub2_Sub1) client.aClass526_Sub7Array11050[clickThrough].anObject10399).aClass704_11915
																			.method8246(
																					-1,
																					(byte) -108);
																}

																connection.CURRENT_FRAME = null;
																return true;
															} else if (IncomingFrame.aClass420_4642 == connection.CURRENT_FRAME) {
																var61 = buffer
																		.readString(-1684032700);
																id = buffer
																		.readUnsignedShort(1885628470);
																var6 = buffer
																		.readUnsignedShort(1127787659);
																var59 = buffer
																		.readUnsignedShort(37052019);
																Class16.aClass6_179.address = var61;
																Class16.aClass6_179.id = id
																		* -1052717481;
																Class16.aClass6_179.port = var6 * 1408805223;
																Class16.aClass6_179.securePort = 1633433681 * var59;
																connection.CURRENT_FRAME = null;
																return true;
															} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4669) {
																Class146.method1697((byte) 32);
																connection.CURRENT_FRAME = null;
																return false;
															} else {
																int var14;
																long var29;
																long var31;
																boolean var75;
																if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4697) {
																	var68 = buffer
																			.readUnsignedByte(-997018181) == 1;
																	var29 = buffer
																			.readUnsignedShort(2048063714);
																	var31 = buffer
																			.read24BitInt(742041327);
																	var27 = (var29 << 32)
																			+ var31;
																	var75 = false;
																	Class526_Sub9 var115 = var68 ? Class318_Sub2.aClass526_Sub9_10065
																			: Class673.aClass526_Sub9_8581;
																	if (null == var115) {
																		var75 = true;
																	} else {
																		for (var13 = 0; var13 < 100; ++var13) {
																			if (var27 == client.aLongArray11165[var13]) {
																				var75 = true;
																				break;
																			}
																		}
																	}

																	if (!var75) {
																		client.aLongArray11165[client.anInt11262
																				* -1662656037] = var27;
																		client.anInt11262 = (-1662656037
																				* client.anInt11262 + 1) % 100 * 75575891;
																		String var121 = Class431
																				.method5064(
																						buffer,
																						-2021482596);
																		var14 = var68 ? 43
																				: 46;
																		Class503.method6041(
																				var14,
																				0,
																				"",
																				"",
																				"",
																				var121,
																				var115.aString10403,
																				-1,
																				(Class415) null,
																				1758468099);
																	}

																	connection.CURRENT_FRAME = null;
																	return true;
																} else if (IncomingFrame.aClass420_4621 == connection.CURRENT_FRAME) {
																	client.anInt11197 = client.anInt11214 * 1458373147;
																	var68 = buffer
																			.readUnsignedByte(-1597001394) == 1;
																	Class342 var149 = new Class342(
																			buffer);
																	Class348 var147;
																	if (var68) {
																		var147 = Class603.aClass348_7890;
																	} else {
																		var147 = Class325_Sub2.aClass348_10028;
																	}

																	var149.method4425(
																			var147,
																			(byte) -7);
																	connection.CURRENT_FRAME = null;
																	return true;
																} else {
																	boolean var77;
																	Class415 var96;
																	if (IncomingFrame.aClass420_4587 == connection.CURRENT_FRAME) {
																		var61 = buffer
																				.readString(-227368841);
																		var29 = buffer
																				.readUnsignedShort(110667828);
																		var31 = buffer
																				.read24BitInt(742041327);
																		var96 = (Class415) Class561
																				.findIdentifiable(
																						Class415.method4930(-1120602393),
																						buffer.readUnsignedByte(-42064009),
																						(byte) -38);
																		var77 = buffer
																				.readUnsignedByte(-492184555) == 1;
																		var19 = var31
																				+ (var29 << 32);
																		var106 = false;
																		if (null == Class566.aClass223_7610) {
																			var106 = true;
																		} else {
																			var14 = 0;

																			while (true) {
																				if (var14 >= 100) {
																					if (var96.aBool4474) {
																						if ((!client.aBool11161 || client.aBool11162)
																								&& !client.aBool11004) {
																							if (Class590
																									.method7011(
																											var61,
																											-1286139344)) {
																								var106 = true;
																							}
																						} else {
																							var106 = true;
																						}
																					}
																					break;
																				}

																				if (client.aLongArray11165[var14] == var19) {
																					var106 = true;
																					break;
																				}

																				++var14;
																			}
																		}

																		if (!var106) {
																			client.aLongArray11165[client.anInt11262
																					* -1662656037] = var19;
																			client.anInt11262 = (client.anInt11262
																					* -1662656037 + 1) % 100 * 75575891;
																			String var134 = Class415
																					.method4931(
																							Class431.method5064(
																									buffer,
																									1593568572),
																							772145241);
																			var21 = var77 ? 22
																					: 24;
																			if (-1 != -665210955
																					* var96.anInt4476) {
																				Class503.method6041(
																						var21,
																						0,
																						Class199_Sub13
																								.method9016(
																										-665210955
																												* var96.anInt4476,
																										16711935)
																								+ var61,
																						Class199_Sub13
																								.method9016(
																										var96.anInt4476
																												* -665210955,
																										16711935)
																								+ var61,
																						var61,
																						var134,
																						Class566.aClass223_7610
																								.method3111(1302921413),
																						-1,
																						var96,
																						311514592);
																			} else {
																				Class503.method6041(
																						var21,
																						0,
																						var61,
																						var61,
																						var61,
																						var134,
																						Class566.aClass223_7610
																								.method3111(1654058928),
																						-1,
																						var96,
																						-1446850014);
																			}
																		}

																		connection.CURRENT_FRAME = null;
																		return true;
																	} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4597) {
																		Class414.aClass149_4465 = new Class149(
																				Class52.aClass97_Sub1_Sub2_665);
																		connection.CURRENT_FRAME = null;
																		return true;
																	} else if (connection.CURRENT_FRAME == IncomingFrame.WEIGHT) {
																		client.anInt11191 = buffer
																				.readShort((byte) 1)
																				* -1770662489;
																		client.anInt11235 = client.anInt11214
																				* -1386702209;
																		connection.CURRENT_FRAME = null;
																		return true;
																	} else if (connection.CURRENT_FRAME == IncomingFrame.ICOMPONENT_SETTINGS) {
																		clickThrough = buffer
																				.readUnsignedShortLE128((short) 5888);
																		if ('\uffff' == clickThrough) {
																			clickThrough = -1;
																		}

																		id = buffer
																				.readIntV2((byte) 102);
																		var6 = buffer
																				.readUnsignedShort(1160193046);
																		if (var6 == '\uffff') {
																			var6 = -1;
																		}

																		var59 = buffer
																				.readIntV2((byte) 54);

																		System.out
																				.println("player.getPackets().sendIComponentSettings("
																						+ (id >> 16)
																						+ ", "
																						+ (id & 0XFFFF)
																						+ ", "
																						+ var6
																						+ ", "
																						+ clickThrough
																						+ ", "
																						+ var59
																						+ ");");

																		Class28.method729((byte) 1);

																		for (var8 = var6; var8 <= clickThrough; ++var8) {
																			var27 = var8
																					+ ((long) id << 32);
																			var113 = (Class526_Sub24) client.aClass20_11087
																					.get(var27);
																			if (var113 == null) {
																				if (-1 == var8) {
																					var107 = new Class526_Sub24(
																							var59,
																							Class221.method3095(
																									id,
																									(byte) 46).aClass526_Sub24_2486.anInt10548 * 1231358729);
																				} else {
																					var107 = new Class526_Sub24(
																							var59,
																							-1);
																				}
																			} else {
																				var107 = new Class526_Sub24(
																						var59,
																						1231358729 * var113.anInt10548);
																				var113.method6332(-1949449864);
																			}

																			client.aClass20_11087
																					.put(var107,
																							var27);
																		}

																		connection.CURRENT_FRAME = null;
																		return true;
																	} else {
																		int var12;
																		if (IncomingFrame.PLAY_OBJECT_ANIMATION == connection.CURRENT_FRAME) {
																			clickThrough = buffer
																					.readIntV1(-630628485);
																			id = clickThrough >> 28 & 3;
																			var6 = clickThrough >> 14 & 16383;
																			var59 = clickThrough & 16383;
																			var8 = buffer
																					.readByteC((byte) 8);
																			hash = buffer
																					.readIntLE(-249108151);
																			var10 = buffer
																					.readUnsignedByte128((byte) 36);
																			var78 = var10 >> 2;
																			var12 = var10 & 3;
																			var13 = client.anIntArray11071[var78];
																			Class596 var128 = client.aClass505_11204
																					.method6128(2018703583);
																			var6 -= -814686591
																					* var128.localX;
																			var59 -= var128.localY
																					* -845789331;
																			Class698.method8160(
																					id,
																					var6,
																					var59,
																					var13,
																					var78,
																					var12,
																					hash,
																					var8,
																					-1291993438);
																			connection.CURRENT_FRAME = null;
																			return true;
																		} else if (IncomingFrame.HUD_FLAG == connection.CURRENT_FRAME) {
																			clickThrough = buffer
																					.readByteC((byte) 8);
																			id = buffer
																					.readUnsigned128Byte((byte) -17);
																			if (255 == id) {
																				id = -1;
																				clickThrough = -1;
																			}

																			Class526_Sub21_Sub8
																					.method10580(
																							id,
																							clickThrough,
																							(byte) 64);
																			connection.CURRENT_FRAME = null;
																			return true;
																		} else if (IncomingFrame.aClass420_4688 == connection.CURRENT_FRAME) {
																			Class570.aClass231_7657
																					.method3213(-2135039249);
																			connection.CURRENT_FRAME = null;
																			return true;
																		} else {
																			Class596 var143;
																			if (IncomingFrame.aClass420_4704 == connection.CURRENT_FRAME) {
																				clickThrough = buffer
																						.readIntLE(-352591406);
																				Class28.method729((byte) 1);
																				if (clickThrough == -1) {
																					Class277.anInt3029 = -1852613725;
																					Class576.anInt7740 = 1775818497;
																				} else {
																					var143 = client.aClass505_11204
																							.method6128(2056085831);
																					var6 = clickThrough >> 14 & 16383;
																					var59 = clickThrough & 16383;
																					var6 -= var143.localX
																							* -814686591;
																					if (var6 < 0) {
																						var6 = 0;
																					} else if (var6 >= client.aClass505_11204
																							.method6056(-1746741811)) {
																						var6 = client.aClass505_11204
																								.method6056(-1746741811);
																					}

																					var59 -= -845789331
																							* var143.localY;
																					if (var59 < 0) {
																						var59 = 0;
																					} else if (var59 >= client.aClass505_11204
																							.method6057(126749238)) {
																						var59 = client.aClass505_11204
																								.method6057(126749238);
																					}

																					Class277.anInt3029 = ((var6 << 9) + 256) * 1852613725;
																					Class576.anInt7740 = -1775818497
																							* ((var59 << 9) + 256);
																				}

																				connection.CURRENT_FRAME = null;
																				return true;
																			} else if (IncomingFrame.REFRESH_WORLD_LIST == connection.CURRENT_FRAME) {
																				var68 = buffer
																						.readUnsignedByte(738632831) == 1;
																				byte[] var148 = new byte[connection.currentFrame
																						* -1225783061
																						- 1];
																				buffer.writeBytes(
																						var148,
																						0,
																						-1225783061
																								* connection.currentFrame
																								- 1,
																						-1650854615);
																				Class74.method1113(
																						var68,
																						var148,
																						-1332789884);
																				connection.CURRENT_FRAME = null;
																				return true;
																			} else {
																				long var33;
																				boolean var104;
																				if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4667) {
																					var61 = buffer
																							.readString(1885685820);
																					var29 = buffer
																							.readUnsignedShort(1552997933);
																					var31 = buffer
																							.read24BitInt(742041327);
																					var96 = (Class415) Class561
																							.findIdentifiable(
																									Class415.method4930(-1843356191),
																									buffer.readUnsignedByte(-1763963785),
																									(byte) -13);
																					var77 = buffer
																							.readUnsignedByte(-1408382483) == 1;
																					var78 = buffer
																							.readUnsignedShort(1961569341);
																					var33 = (var29 << 32)
																							+ var31;
																					var104 = false;
																					if (Class566.aClass223_7610 == null) {
																						var104 = true;
																					} else {
																						var21 = 0;

																						while (true) {
																							if (var21 >= 100) {
																								if (var96.aBool4474
																										&& Class590
																												.method7011(
																														var61,
																														-261154360)) {
																									var104 = true;
																								}
																								break;
																							}

																							if (var33 == client.aLongArray11165[var21]) {
																								var104 = true;
																								break;
																							}

																							++var21;
																						}
																					}

																					if (!var104) {
																						client.aLongArray11165[client.anInt11262
																								* -1662656037] = var33;
																						client.anInt11262 = 75575891 * ((1 + client.anInt11262
																								* -1662656037) % 100);
																						var123 = Class277.aClass56_3028
																								.method994(
																										var78,
																										(byte) 0)
																								.method10677(
																										buffer,
																										(byte) -99);
																						var133 = var77 ? 23
																								: 25;
																						if (var96.anInt4476
																								* -665210955 != -1) {
																							Class503.method6041(
																									var133,
																									0,
																									Class199_Sub13
																											.method9016(
																													var96.anInt4476
																															* -665210955,
																													16711935)
																											+ var61,
																									Class199_Sub13
																											.method9016(
																													var96.anInt4476
																															* -665210955,
																													16711935)
																											+ var61,
																									var61,
																									var123,
																									Class566.aClass223_7610
																											.method3111(-73527036),
																									var78,
																									var96,
																									417608115);
																						} else {
																							Class503.method6041(
																									var133,
																									0,
																									var61,
																									var61,
																									var61,
																									var123,
																									Class566.aClass223_7610
																											.method3111(926552263),
																									var78,
																									var96,
																									-1438321370);
																						}
																					}

																					connection.CURRENT_FRAME = null;
																					return true;
																				} else {
																					boolean var62;
																					boolean var74;
																					String var86;
																					if (connection.CURRENT_FRAME == IncomingFrame.PUBLIC_MESSAGE) {
																						clickThrough = buffer
																								.readUnsignedShort(688983713);
																						Class639_Sub1_Sub2_Sub1_Sub1 var146;
																						if (-1204447689
																								* client.localPlayerIndex == clickThrough) {
																							var146 = Class451.localPlayer;
																						} else {
																							var146 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[clickThrough];
																						}

																						if (var146 == null) {
																							connection.CURRENT_FRAME = null;
																							return true;
																						} else {
																							var6 = buffer
																									.readUnsignedShort(520228506);
																							Class415 var109 = (Class415) Class561
																									.findIdentifiable(
																											Class415.method4930(-566648475),
																											buffer.readUnsignedByte(1804117795),
																											(byte) -84);
																							var62 = (var6 & '\u8000') != 0;
																							if (null != var146.aString12161
																									&& null != var146.aClass633_12181) {
																								var74 = false;
																								if (var109.aBool4474) {
																									if (var62
																											|| (!client.aBool11161 || client.aBool11162)
																											&& !client.aBool11004) {
																										if (Class590
																												.method7011(
																														var146.aString12161,
																														-1750366482)) {
																											var74 = true;
																										}
																									} else {
																										var74 = true;
																									}
																								}

																								if (!var74) {
																									var78 = -1;
																									if (var62) {
																										var6 &= 32767;
																										PacketFrameDecoder var101 = Class535
																												.method6404(
																														buffer,
																														(short) 18290);
																										var78 = var101.anInt4092
																												* -1382935785;
																										var86 = var101.aClass526_Sub21_Sub12_4093
																												.method10677(
																														buffer,
																														(byte) -4);
																									} else {
																										var86 = Class415
																												.method4931(
																														Class431.method5064(
																																buffer,
																																1064948601),
																														1882424974);
																									}

																									var146.method10974(
																											var86.trim(),
																											var6 >> 8,
																											var6 & 255,
																											(byte) 114);
																									if (var109.aBool4477) {
																										var12 = var62 ? 17
																												: 1;
																									} else {
																										var12 = var62 ? 17
																												: 2;
																									}

																									if (var109.anInt4476
																											* -665210955 != -1) {
																										Class503.method6041(
																												var12,
																												0,
																												Class199_Sub13
																														.method9016(
																																var109.anInt4476
																																		* -665210955,
																																16711935)
																														+ var146.method10977(
																																true,
																																(byte) 95),
																												Class199_Sub13
																														.method9016(
																																var109.anInt4476
																																		* -665210955,
																																16711935)
																														+ var146.method10969(
																																false,
																																-1069084590),
																												var146.aString12175,
																												var86,
																												(String) null,
																												var78,
																												var109,
																												101735022);
																									} else {
																										Class503.method6041(
																												var12,
																												0,
																												var146.method10977(
																														true,
																														(byte) 42),
																												var146.method10969(
																														false,
																														-1513157818),
																												var146.aString12175,
																												var86,
																												(String) null,
																												var78,
																												var109,
																												-764538436);
																									}
																								}
																							}

																							connection.CURRENT_FRAME = null;
																							return true;
																						}
																					} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4574) {
																						client.anInt11233 = -1765588999
																								* client.anInt11214;
																						var68 = buffer
																								.readUnsignedByte(-335289390) == 1;
																						Class340 var145 = new Class340(
																								buffer);
																						Class526_Sub9 var141;
																						if (var68) {
																							var141 = Class318_Sub2.aClass526_Sub9_10065;
																						} else {
																							var141 = Class673.aClass526_Sub9_8581;
																						}

																						var145.method4412(
																								var141,
																								1277792993);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4542 == connection.CURRENT_FRAME) {
																						clickThrough = buffer
																								.readUnsignedShort(541812517);
																						Class570.aClass231_7657
																								.method3193(
																										clickThrough,
																										(byte) 61);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4598 == connection.CURRENT_FRAME) {
																						clickThrough = buffer
																								.readUnsignedShort(1882860516);
																						Class463.method5479(
																								clickThrough,
																								-1727488709);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4602 == connection.CURRENT_FRAME) {
																						clickThrough = buffer
																								.readUnsigned128Byte((byte) -51);
																						id = buffer
																								.readIntV2((byte) 117);
																						var6 = buffer
																								.readUnsignedLEShort((byte) 19);
																						var59 = buffer
																								.method9666(-224360779);
																						LinkableObject var100 = (LinkableObject) client.npcs
																								.get(var6);
																						if (null != var100) {
																							NPC var89 = (NPC) var100.anObject10399;
																							if (null == var89.aClass305_12186) {
																								var89.aClass305_12186 = new Class305(
																										var89.def);
																							}

																							var89.aClass305_12186.anIntArray3281[clickThrough] = id;
																							var89.aClass305_12186.aShortArray3282[clickThrough] = (short) var59;
																						}

																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.ANIMATION_ON_INTERFACE == connection.CURRENT_FRAME) {
																						clickThrough = buffer
																								.readIntV2((byte) 92);
																						id = buffer
																								.readIntV2((byte) 28);
																						Class28.method729((byte) 1);
																						Class593.method7033(
																								id,
																								clickThrough,
																								-1186706709);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4712 == connection.CURRENT_FRAME) {
																						if (!client.aBool11302) {
																							try {
																								clickThrough = buffer
																										.readByteC((byte) 8);
																								var58 = buffer
																										.readUnsigned128Byte((byte) -63) == 1;
																								var6 = buffer
																										.readUnsigned128Byte((byte) -5);
																								client.aClass216_11301
																										.method2969(
																												var6,
																												1517212089)
																										.method3055(
																												clickThrough,
																												var58,
																												990273904);
																							} catch (RuntimeException var50) {
																								Class375.method4671(
																										(String) null,
																										var50,
																										(byte) 101);
																								Class604.method7103(
																										connection,
																										-1617310933);
																							}
																						}

																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4709 == connection.CURRENT_FRAME) {
																						client.anInt11052 = 1732341749 * client.anInt11214;
																						if (-1225783061
																								* connection.currentFrame == 0) {
																							Class566.aClass223_7610 = null;
																						} else {
																							Class566.aClass223_7610 = new Class223(
																									0L,
																									buffer,
																									true,
																									client.anInterface28_11266);
																						}

																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.CAMERA_SHAKE == connection.CURRENT_FRAME) {
																						clickThrough = buffer
																								.readByteC((byte) 8);// d
																						id = buffer
																								.readUnsignedByte128((byte) 36); // slot
																						var6 = buffer
																								.readUnsignedShort(661967247); // e
																						var59 = buffer
																								.readUnsignedByte(-275935504); // b
																						var8 = buffer
																								.readByteC((byte) 8);// c
																						Class28.method729((byte) 1);
																						client.aBoolArray11263[id] = true;
																						client.anIntArray11270[id] = var59; // b
																						client.anIntArray11005[id] = var8; // c
																						client.anIntArray11272[id] = clickThrough; // d
																						client.anIntArray11273[id] = var6;// e
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.REMOVE_OBJECT == connection.CURRENT_FRAME) {
																						Class246.method3392(
																								Class422.aClass422_4731,
																								830998279);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4534) {
																						clickThrough = buffer
																								.readUnsignedShort(458777222);
																						if ('\uffff' == clickThrough) {
																							clickThrough = -1;
																						}

																						id = buffer
																								.readUnsignedByte(1519207368);
																						var6 = buffer
																								.readUnsignedShort(1244978303);
																						var59 = buffer
																								.readUnsignedByte(917915107);
																						var8 = buffer
																								.readUnsignedShort(126003554);
																						Class570.aClass231_7657
																								.method3246(
																										Class188.aClass188_2142,
																										clickThrough,
																										id,
																										var59,
																										Class187.aClass187_2124
																												.method2723(-1921293336),
																										Class204.aClass204_2219,
																										0.0F,
																										0.0F,
																										(Class446) null,
																										0,
																										var8,
																										var6,
																										451766967);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4671) {
																						if (!client.aBool11302) {
																							try {
																								clickThrough = buffer
																										.readUnsignedByte128((byte) 36);
																								id = buffer
																										.readUnsigned128Byte((byte) -121);
																								var6 = buffer
																										.readUnsignedByte128((byte) 36);
																								client.aClass216_11301
																										.method2969(
																												var6,
																												1517212089)
																										.method3078(
																												id,
																												clickThrough,
																												-1265469842);
																							} catch (RuntimeException var51) {
																								Class375.method4671(
																										(String) null,
																										var51,
																										(byte) 41);
																								Class604.method7103(
																										connection,
																										-1559579000);
																							}
																						}

																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4690) {
																						clickThrough = buffer
																								.readIntLE(1933714388);
																						var58 = buffer
																								.readUnsignedByte128((byte) 36) == 1;
																						Class28.method729((byte) 1);
																						Class526_Sub23_Sub7
																								.method10564(
																										clickThrough,
																										var58,
																										(short) 9632);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4620) {
																						var61 = buffer
																								.readString(-1160766901);
																						Class176.method2655(
																								var61,
																								-1423746299);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4562 == connection.CURRENT_FRAME) {
																						Class246.method3392(
																								Class422.aClass422_4729,
																								830998279);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.AUDIO_RESET == connection.CURRENT_FRAME) {
																						Class570.aClass231_7657
																								.method3200(
																										Class187.aClass187_2131
																												.method2723(-2122819570),
																										-1669777229);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.SET_TILE_INTERFACE == connection.CURRENT_FRAME) {
																						clickThrough = buffer
																								.readUnsignedShort(1912539273);
																						var143 = new Class596(
																								buffer.readInt((byte) 5));
																						var6 = buffer
																								.readInt((byte) 5);
																						var59 = buffer
																								.readIntLE(1091784841);
																						var8 = buffer
																								.readUnsignedShort(945273103);
																						hash = buffer
																								.readIntV1(-630628485);
																						var10 = buffer
																								.readUnsignedByte128((byte) 36);
																						var78 = buffer
																								.readIntLE(-624998985);
																						var12 = buffer
																								.readIntV1(-630628485);
																						Class28.method729((byte) 1);
																						IncomingFrame
																								.method4983(
																										var78,
																										new Class526_Sub38_Sub2(
																												var8,
																												var10,
																												new Class664(
																														var143,
																														clickThrough)),
																										new int[] {
																												hash,
																												var12,
																												var6,
																												var59 },
																										false,
																										(short) -909);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.GAMEBAR_UPDATE == connection.CURRENT_FRAME) {
																						client.publicChatStatus = buffer
																								.readByteC((byte) 8) * 68831625;
																						client.publicTradeStatus = buffer
																								.readByteC((byte) 8) * 1544740565;
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4717) {
																						client.anInt11288 = 1817127625;
																						client.anInt11246 = 1211622781 * client.anInt11214;
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.DECODE_LOOKS == connection.CURRENT_FRAME) {
																						var65 = buffer
																								.readByte((byte) 64);
																						Class451.localPlayer
																								.method10976(
																										buffer,
																										var65,
																										(byte) -65);
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (IncomingFrame.aClass420_4531 == connection.CURRENT_FRAME) {
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else if (connection.CURRENT_FRAME == IncomingFrame.CAMERA_POSITION) {
																						clickThrough = buffer
																								.readUnsigned128Byte((byte) -44);
																						id = buffer
																								.readUnsignedByte(1516007557);
																						var6 = buffer
																								.readByteC((byte) 8);
																						var59 = buffer
																								.readUnsignedShort128((short) 23518) << 2;
																						var8 = buffer
																								.readByteC((byte) 8);
																						Class28.method729((byte) 1);
																						Class645.method7671(
																								clickThrough,
																								var8,
																								var59,
																								var6,
																								id,
																								true,
																								-1813701813);
																						// moveLocalX,
																						// moveLocalY,
																						// moveZ,
																						// speed1,
																						// speed2
																						connection.CURRENT_FRAME = null;
																						return true;
																					} else {
																						Class415 var91;
																						if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4649) {
																							var68 = buffer
																									.readUnsignedByte(2048200515) == 1;
																							var57 = buffer
																									.readString(242933682);
																							var60 = var57;
																							if (var68) {
																								var60 = buffer
																										.readString(-188457006);
																							}

																							var31 = buffer
																									.readUnsignedShort(1639625966);
																							var27 = buffer
																									.read24BitInt(742041327);
																							var91 = (Class415) Class561
																									.findIdentifiable(
																											Class415.method4930(-2098273512),
																											buffer.readUnsignedByte(-2011840925),
																											(byte) -113);
																							var33 = (var31 << 32)
																									+ var27;
																							var104 = false;
																							var21 = 0;

																							while (true) {
																								if (var21 >= 100) {
																									if (var91.aBool4474) {
																										if ((!client.aBool11161 || client.aBool11162)
																												&& !client.aBool11004) {
																											if (Class590
																													.method7011(
																															var60,
																															1924052018)) {
																												var104 = true;
																											}
																										} else {
																											var104 = true;
																										}
																									}
																									break;
																								}

																								if (client.aLongArray11165[var21] == var33) {
																									var104 = true;
																									break;
																								}

																								++var21;
																							}

																							if (!var104) {
																								client.aLongArray11165[-1662656037
																										* client.anInt11262] = var33;
																								client.anInt11262 = (1 + client.anInt11262
																										* -1662656037) % 100 * 75575891;
																								var123 = Class415
																										.method4931(
																												Class431.method5064(
																														buffer,
																														1615486492),
																												-247455757);
																								var133 = var91.aBool4477 ? 7
																										: 3;
																								if (-1 != var91.anInt4476
																										* -665210955) {
																									Class503.method6041(
																											var133,
																											0,
																											Class199_Sub13
																													.method9016(
																															var91.anInt4476
																																	* -665210955,
																															16711935)
																													+ var57,
																											Class199_Sub13
																													.method9016(
																															var91.anInt4476
																																	* -665210955,
																															16711935)
																													+ var60,
																											var57,
																											var123,
																											(String) null,
																											-1,
																											var91,
																											468513815);
																								} else {
																									Class503.method6041(
																											var133,
																											0,
																											var57,
																											var60,
																											var57,
																											var123,
																											(String) null,
																											-1,
																											var91,
																											1104812899);
																								}
																							}

																							connection.CURRENT_FRAME = null;
																							return true;
																						} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4588) {
																							clickThrough = buffer
																									.readUnsignedByte(475144867);
																							clickThrough = -clickThrough - 2;
																							client.aMap11156
																									.remove(Integer
																											.valueOf(clickThrough));
																							connection.CURRENT_FRAME = null;
																							return true;
																						} else if (IncomingFrame.aClass420_4555 == connection.CURRENT_FRAME) {
																							connection.CURRENT_FRAME = null;
																							return false;
																						} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4675) {
																							clickThrough = buffer
																									.readInt((byte) 5);
																							Class546.aClass49_7271 = new Class49(
																									clickThrough);
																							Thread var142 = new Thread(
																									Class546.aClass49_7271);
																							var142.setPriority(1);
																							var142.start();
																							connection.CURRENT_FRAME = null;
																							return true;
																						} else if (connection.CURRENT_FRAME == IncomingFrame.LOGOUT_TO_LOBBY) {
																							Class460_Sub1
																									.logout(Class32.aBool358,
																											-1730576285);
																							connection.CURRENT_FRAME = null;
																							return false;
																						} else if (connection.CURRENT_FRAME == IncomingFrame.CAMERA_LOOK) {
																							clickThrough = buffer
																									.readUnsigned128Byte((byte) -85);
																							id = buffer
																									.readUnsignedShort(359596837) << 2;
																							var6 = buffer
																									.readUnsigned128Byte((byte) -30);
																							var59 = buffer
																									.readByteC((byte) 8);
																							var8 = buffer
																									.readByteC((byte) 8);
																							Class28.method729((byte) 1);
																							Class605_Sub1
																									.method9745(
																											var6,
																											clickThrough,
																											id,
																											var8,
																											var59,
																											(byte) -50);
																							// viewLocalX,
																							// viewLocalY,
																							// viewZ,
																							// speed1,
																							// speed2
																							connection.CURRENT_FRAME = null;
																							return true;
																						} else if (IncomingFrame.aClass420_4653 == connection.CURRENT_FRAME) {
																							Class246.method3392(
																									Class422.aClass422_4736,
																									830998279);
																							connection.CURRENT_FRAME = null;
																							return true;
																						} else if (IncomingFrame.OTHER_PLAYER_ON_INTERFACE == connection.CURRENT_FRAME) {
																							clickThrough = buffer
																									.readUnsignedShortLE128((short) 5888);
																							id = buffer
																									.readIntV2((byte) 116);
																							var6 = buffer
																									.readIntLE(-2561236);
																							Class28.method729((byte) 1);
																							Class487.method5860(
																									var6,
																									5,
																									clickThrough,
																									id,
																									(byte) 12); // inter,
																												// index,
																												// display
																												// chars
																							connection.CURRENT_FRAME = null;
																							return true;
																						} else {
																							int var35;
																							if (IncomingFrame.CLAN_CHAT_MESSAGE_QUICK == connection.CURRENT_FRAME) {
																								var68 = buffer
																										.readUnsignedByte(-53878535) == 1;
																								var57 = buffer
																										.readString(-2046367506);
																								var15 = buffer
																										.readUnsignedShort(2140701319);
																								var17 = buffer
																										.read24BitInt(742041327);
																								var97 = (Class415) Class561
																										.findIdentifiable(
																												Class415.method4930(-1848220510),
																												buffer.readUnsignedByte(-1918828545),
																												(byte) -40);
																								var78 = buffer
																										.readUnsignedShort(1464668997);
																								var33 = (var15 << 32)
																										+ var17;
																								var104 = false;
																								var123 = null;
																								Class526_Sub9 var138 = var68 ? Class318_Sub2.aClass526_Sub9_10065
																										: Class673.aClass526_Sub9_8581;
																								if (null == var138) {
																									var104 = true;
																								} else {
																									var133 = 0;

																									while (true) {
																										if (var133 >= 100) {
																											if (var97.aBool4474
																													&& Class590
																															.method7011(
																																	var57,
																																	-421394563)) {
																												var104 = true;
																											}
																											break;
																										}

																										if (client.aLongArray11165[var133] == var33) {
																											var104 = true;
																											break;
																										}

																										++var133;
																									}
																								}

																								if (!var104) {
																									client.aLongArray11165[-1662656037
																											* client.anInt11262] = var33;
																									client.anInt11262 = 75575891 * ((1 + -1662656037
																											* client.anInt11262) % 100);
																									var144 = Class277.aClass56_3028
																											.method994(
																													var78,
																													(byte) 0)
																											.method10677(
																													buffer,
																													(byte) -22);
																									var35 = var68 ? 42
																											: 45;
																									if (-665210955
																											* var97.anInt4476 != -1) {
																										Class503.method6041(
																												var35,
																												0,
																												Class199_Sub13
																														.method9016(
																																var97.anInt4476
																																		* -665210955,
																																16711935)
																														+ var57,
																												Class199_Sub13
																														.method9016(
																																-665210955
																																		* var97.anInt4476,
																																16711935)
																														+ var57,
																												var57,
																												var144,
																												var138.aString10403,
																												var78,
																												var97,
																												265933928);
																									} else {
																										Class503.method6041(
																												var35,
																												0,
																												var57,
																												var57,
																												var57,
																												var144,
																												var138.aString10403,
																												var78,
																												var97,
																												-1954077573);
																									}
																								}

																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.aClass420_4646 == connection.CURRENT_FRAME) {
																								clickThrough = buffer
																										.readInt((byte) 5);
																								id = buffer
																										.readInt((byte) 5);
																								OutFrameBuffer var120 = Class115
																										.method1414(
																												OutFrame.aClass405_4262,
																												connection.aClass14_1342,
																												-567331129);
																								var120.out
																										.writeInt(
																												clickThrough,
																												-357564953);
																								var120.out
																										.writeIntV1(
																												id,
																												581455421);
																								var120.out
																										.write128Byte(
																												-421428705
																														* Class499.anInt5627,
																												-1806446539);
																								connection
																										.write(var120,
																												(byte) 96);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.STAMINA == connection.CURRENT_FRAME) {
																								client.anInt11190 = buffer
																										.readUnsignedByte(685639076)
																										* -954231757;
																								client.anInt11235 = -1386702209
																										* client.anInt11214;
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.aClass420_4660 == connection.CURRENT_FRAME) {
																								clickThrough = buffer
																										.readUnsignedByte(1543304382);
																								id = buffer
																										.readUnsignedLEShort((byte) 50);
																								var73 = (clickThrough & 1) == 1;
																								Class158.method1873(
																										id,
																										var73,
																										1589978353);
																								client.anIntArray11129[(client.anInt11220 += 1236360113)
																										* -1051062959
																										- 1
																										& 63] = id;
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.CS_VAR_1_PACKET == connection.CURRENT_FRAME) {
																								clickThrough = buffer
																										.readUnsignedShortLE128((short) 5888);
																								var87 = buffer
																										.writeByte128(-1630702178);

																								System.out
																										.println("player.getPackets().sendCSVarInteger("
																												+ clickThrough
																												+ ", "
																												+ var87
																												+ ")");

																								Class28.method729((byte) 1);
																								Class547_Sub1
																										.method9565(
																												clickThrough,
																												var87,
																												-737593846);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.REMOVE_GROUND_ITEM) {
																								Class246.method3392(
																										Class422.aClass422_4732,
																										830998279);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.aClass420_4528 == connection.CURRENT_FRAME) {
																								clickThrough = buffer
																										.readUnsignedShort128((short) 26199);
																								id = buffer
																										.readIntV1(-630628485);
																								var6 = buffer
																										.readUnsignedShortLE128((short) 5888);
																								var59 = buffer
																										.readUnsignedShort(1368829593);
																								Class28.method729((byte) 1);
																								Class77.method1134(
																										id,
																										var59,
																										clickThrough,
																										var6,
																										(byte) 12);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4550) {
																								clickThrough = buffer
																										.readUnsignedByte(1115934);
																								Class703 var130 = (Class703) Class561
																										.findIdentifiable(
																												Class478.method5666((byte) 1),
																												clickThrough,
																												(byte) -4);
																								if (var130 == null) {
																									var130 = Class703.aClass703_8792;
																								}

																								Class568_Sub1
																										.method9553(
																												var130,
																												1122150432);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4662) {
																								clickThrough = buffer
																										.readIntLE(202690707);
																								id = buffer
																										.readUnsignedShort128((short) 5499);
																								var6 = buffer
																										.readIntV2((byte) 65);
																								Class28.method729((byte) 1);
																								Class487.method5860(
																										var6,
																										3,
																										id,
																										clickThrough,
																										(byte) 12);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4580) {
																								clickThrough = buffer
																										.readUnsignedShort(997989537);
																								if (clickThrough == '\uffff') {
																									clickThrough = -1;
																								}

																								id = buffer
																										.readUnsignedByte(189718988);
																								var6 = buffer
																										.readUnsignedShort(1931144843);
																								var59 = buffer
																										.readUnsignedByte(-1598666235);
																								var8 = buffer
																										.readUnsignedShort(1105322454);
																								Class570.aClass231_7657
																										.method3246(
																												Class188.aClass188_2142,
																												clickThrough,
																												id,
																												var59,
																												Class187.aClass187_2124
																														.method2723(-1902284696),
																												Class204.aClass204_2219,
																												0.0F,
																												0.0F,
																												(Class446) null,
																												0,
																												var8,
																												var6,
																												-390428400);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4677) {
																								clickThrough = buffer
																										.readIntV1(-630628485);
																								id = buffer
																										.readIntV1(-630628485);
																								Class28.method729((byte) 1);
																								Class380_Sub1
																										.method9144(
																												clickThrough,
																												id,
																												-450362143);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.MODEL_ON_ICOMPONENT == connection.CURRENT_FRAME) {
																								clickThrough = buffer
																										.readInt((byte) 5);
																								id = buffer
																										.readIntV1(-630628485);
																								Class28.method729((byte) 1);
																								Class487.method5860(
																										id,
																										1,
																										clickThrough,
																										-1,
																										(byte) 12);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4637) {
																								var68 = buffer
																										.readUnsigned128Byte((byte) -47) == 1;
																								id = buffer
																										.readIntLE(139655386);
																								Class28.method729((byte) 1);
																								Class526_Sub8
																										.method9342(
																												id,
																												var68,
																												609034863);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.PLAYER_UNDER_NPC_PRIORITY_PACKET == connection.CURRENT_FRAME) {
																								clickThrough = buffer
																										.readUnsigned128Byte((byte) -69);
																								Class28.method729((byte) 1);
																								client.anInt11149 = clickThrough * 1637975425;
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4556) {
																								Class246.method3392(
																										Class422.aClass422_4727,
																										830998279);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4691) {
																								Class246.method3392(
																										Class422.aClass422_4735,
																										830998279);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.MOVE_INTERFACE) {
																								clickThrough = buffer
																										.readInt((byte) 5);
																								id = buffer
																										.readIntV2((byte) 122);
																								Class28.method729((byte) 1);
																								Class526_Sub38 var110 = (Class526_Sub38) client.aClass20_11187
																										.get(clickThrough);
																								Class526_Sub38 var92 = (Class526_Sub38) client.aClass20_11187
																										.get(id);
																								if (null != var92) {
																									Class710.method8307(
																											var92,
																											var110 == null
																													|| var110.anInt10684
																															* -870147923 != var92.anInt10684
																															* -870147923,
																											false,
																											(byte) -82);
																								}

																								if (var110 != null) {
																									var110.method6332(-1949449864);
																									client.aClass20_11187
																											.put(var110,
																													id);
																								}

																								InterfaceDef var88 = Class221
																										.method3095(
																												clickThrough,
																												(byte) -26);
																								if (var88 != null) {
																									Class526_Sub31
																											.method9555(
																													var88,
																													(byte) 10);
																								}

																								var88 = Class221
																										.method3095(
																												id,
																												(byte) 59);
																								if (var88 != null) {
																									Class526_Sub31
																											.method9555(
																													var88,
																													(byte) 10);
																									Class526_Sub9
																											.method9361(
																													Class315_Sub1.aClass243Array10033[var88.uid * 919258769 >>> 16],
																													var88,
																													true,
																													(byte) 82);
																								}

																								if (-1 != client.anInt11186
																										* -327748687) {
																									Class458.method5419(
																											client.anInt11186
																													* -327748687,
																											1,
																											(byte) 10);
																								}

																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.STATIC_REGION == connection.CURRENT_FRAME) {
																								connectionBuffer = new Buffer(
																										-1225783061
																												* connection.currentFrame);
																								System.arraycopy(
																										connection.buffer.buffer,
																										301018015 * connection.buffer.pos,
																										connectionBuffer.buffer,
																										0,
																										-1225783061
																												* connection.currentFrame);
																								Class684.method8044((byte) -6);
																								if (Class230.preferences.aClass711_Sub25_10626
																										.method10074((byte) -128) == 1) {
																									Class297.aClass517_3235
																											.method6217(
																													new Class509(
																															Class502.STATIC,
																															connectionBuffer),
																													841771785);
																								} else {
																									client.aClass505_11204
																											.method6120(
																													new Class509(
																															Class502.STATIC,
																															connectionBuffer),
																													(byte) 1);
																								}

																								connection.CURRENT_FRAME = null;
																								return false;
																							} else if (IncomingFrame.aClass420_4665 == connection.CURRENT_FRAME) {
																								var68 = buffer
																										.readUnsignedByte(-282111327) == 1;
																								var57 = buffer
																										.readString(1650063475);
																								var60 = var57;
																								if (var68) {
																									var60 = buffer
																											.readString(-1924994039);
																								}

																								var31 = buffer
																										.readUnsignedShort(1439719444);
																								var27 = buffer
																										.read24BitInt(742041327);
																								var91 = (Class415) Class561
																										.findIdentifiable(
																												Class415.method4930(-997869816),
																												buffer.readUnsignedByte(523752052),
																												(byte) -6);
																								var12 = buffer
																										.readUnsignedShort(1296761823);
																								var25 = (var31 << 32)
																										+ var27;
																								var132 = false;
																								var133 = 0;

																								while (true) {
																									if (var133 >= 100) {
																										if (var91.aBool4474
																												&& Class590
																														.method7011(
																																var60,
																																-1982713879)) {
																											var132 = true;
																										}
																										break;
																									}

																									if (var25 == client.aLongArray11165[var133]) {
																										var132 = true;
																										break;
																									}

																									++var133;
																								}

																								if (!var132) {
																									client.aLongArray11165[-1662656037
																											* client.anInt11262] = var25;
																									client.anInt11262 = 75575891 * ((1 + -1662656037
																											* client.anInt11262) % 100);
																									var144 = Class277.aClass56_3028
																											.method994(
																													var12,
																													(byte) 0)
																											.method10677(
																													buffer,
																													(byte) -3);
																									if (-1 != -665210955
																											* var91.anInt4476) {
																										Class503.method6041(
																												18,
																												0,
																												Class199_Sub13
																														.method9016(
																																var91.anInt4476
																																		* -665210955,
																																16711935)
																														+ var57,
																												Class199_Sub13
																														.method9016(
																																var91.anInt4476
																																		* -665210955,
																																16711935)
																														+ var60,
																												var57,
																												var144,
																												(String) null,
																												var12,
																												var91,
																												-2012592790);
																									} else {
																										Class503.method6041(
																												18,
																												0,
																												var57,
																												var60,
																												var57,
																												var144,
																												(String) null,
																												var12,
																												var91,
																												991480661);
																									}
																								}

																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.aClass420_4539 == connection.CURRENT_FRAME) {
																								Class414.aClass149_4465 = null;
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.VAR_NIS == connection.CURRENT_FRAME) {
																								if (Class414.aClass149_4465 == null) {
																									Class414.aClass149_4465 = new Class149(
																											Class52.aClass97_Sub1_Sub2_665);
																								}

																								Class424 var118 = Class52.aClass97_Sub1_Sub2_665
																										.method8370(
																												buffer,
																												1049988275);
																								Class414.aClass149_4465.anInterface4_1715
																										.method27(
																												var118.anInt4793 * 1602756037,
																												var118.anObject4794,
																												172204199);
																								client.anIntArray11227[(client.anInt11228 += -2114395793)
																										* -917004913
																										- 1
																										& 63] = 1602756037 * var118.anInt4793;
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.CONSOLE_MESSAGE == connection.CURRENT_FRAME) {
																								var61 = buffer
																										.readString(323525033);
																								Class639_Sub1_Sub2_Sub2
																										.developerConsole(
																												var61,
																												false,
																												false,
																												(byte) -70);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4685) {
																								clickThrough = buffer
																										.readUnsignedByte(236516700);
																								Class688 var116 = (Class688) Class561
																										.findIdentifiable(
																												Class158.method1870(309349415),
																												clickThrough,
																												(byte) -96);
																								if (var116 == null) {
																									var116 = Class688.aClass688_8687;
																								}

																								Class668.method7962(
																										var116,
																										-8279613);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (IncomingFrame.aClass420_4577 == connection.CURRENT_FRAME) {
																								Class711.anInt8858 = buffer
																										.readUnsignedByte128((byte) 36)
																										* -2050331237;
																								Class300.anInt3254 = (buffer
																										.writeByte128(-1538596381) << 3) * 1499537771;
																								Class130.anInt1618 = (buffer
																										.writeByte128(159535520) << 3)
																										* -1789279365;

																								while (buffer.pos * 301018015 < connection.currentFrame
																										* -1225783061) {
																									Class422 var114 = Class306
																											.method4036(-1785099989)[buffer
																											.readUnsignedByte(-193322355)];
																									Class246.method3392(
																											var114,
																											830998279);
																								}

																								connection.CURRENT_FRAME = null;
																								return true;
																							} else if (connection.CURRENT_FRAME == IncomingFrame.FRIENDS_STATUS) {
																								Class539_Sub6.aClass698_10363 = Class317
																										.method4103(
																												buffer.readUnsignedByte(84968392),
																												1415741854);
																								connection.CURRENT_FRAME = null;
																								return true;
																							} else {
																								boolean var22;
																								int var38;
																								if (connection.CURRENT_FRAME == IncomingFrame.GRAPHIC_ON_TILE) {
																									clickThrough = buffer
																											.readUnsignedByte128((byte) 36);
																									id = buffer
																											.readByteC((byte) 8);
																									var6 = buffer
																											.readUnsignedShort(1939780489);
																									if ('\uffff' == var6) {
																										var6 = -1;
																									}

																									var59 = buffer
																											.readUnsignedShort128((short) 16915);
																									var8 = buffer
																											.readUnsignedShortLE128((short) 5888);
																									hash = buffer
																											.readIntV2((byte) 70);
																									var10 = clickThrough & 7;
																									var78 = clickThrough >> 3 & 15;
																									if (var78 == 15) {
																										var78 = -1;
																									}

																									boolean var94 = 1 == (clickThrough >> 7 & 1);
																									int var155;
																									int var158;
																									if (0 != hash >> 30) {
																										Class596 var99 = client.aClass505_11204
																												.method6128(1942203536);
																										var14 = hash >> 28 & 3;
																										var21 = (hash >> 14 & 16383)
																												- -814686591
																												* var99.localX;
																										var133 = (hash & 16383)
																												- var99.localY
																												* -845789331;
																										if (var21 >= 0
																												&& var133 >= 0
																												&& var21 < client.aClass505_11204
																														.method6056(-1746741811)
																												&& var133 < client.aClass505_11204
																														.method6057(126749238)) {
																											if (var6 == -1) {
																												Class526_Sub21_Sub8 var154 = (Class526_Sub21_Sub8) client.aClass20_11160
																														.get(var21 << 16
																																| var133);
																												if (var154 != null) {
																													var154.aClass639_Sub1_Sub2_Sub6_11665
																															.method10952(-1414380463);
																													var154.method6332(-1949449864);
																												}
																											} else {
																												var35 = 256 + 512 * var21;
																												var155 = 512 * var133 + 256;
																												var158 = var14;
																												if (var14 < 3
																														&& client.aClass505_11204
																																.method6094(
																																		(byte) -73)
																																.method5614(
																																		var21,
																																		var133,
																																		271210214)) {
																													var158 = var14 + 1;
																												}

																												Class639_Sub1_Sub2_Sub6 var160 = new Class639_Sub1_Sub2_Sub6(
																														client.aClass505_11204
																																.method6072(-1336112427),
																														var6,
																														var8,
																														var14,
																														var158,
																														var35,
																														Class387.method4762(
																																var35,
																																var155,
																																var14,
																																1581555179)
																																- var59,
																														var155,
																														var21,
																														var21,
																														var133,
																														var133,
																														var10,
																														var94,
																														0);
																												client.aClass20_11160
																														.put(new Class526_Sub21_Sub8(
																																var160),
																																var21 << 16
																																		| var133);
																											}
																										}
																									} else {
																										Class670 var162;
																										Class206 var163;
																										Class206 var164;
																										if (hash >> 29 != 0) {
																											var13 = hash & '\uffff';
																											var95 = (LinkableObject) client.npcs
																													.get(var13);
																											if (null != var95) {
																												NPC var129 = (NPC) var95.anObject10399;
																												Class510 var139 = var129.aClass510Array11906[id];
																												if ('\uffff' == var6) {
																													var6 = -1;
																												}

																												boolean var156 = true;
																												var155 = var139.anInt6980 * 901715121;
																												if (-1 != var6
																														&& var155 != -1) {
																													if (var155 == var6) {
																														var162 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var6,
																																		-1094916225);
																														if (var162.aBool8552
																																&& var162.anInt8550 * 1305328919 != -1) {
																															var163 = (Class206) Class388.aClass40_Sub15_4063
																																	.method89(
																																			var162.anInt8550 * 1305328919,
																																			387413553);
																															int var165 = var163.anInt2238 * 1945727809;
																															if (var165 != 0
																																	&& 2 != var165) {
																																if (1 == var165) {
																																	var156 = true;
																																}
																															} else {
																																var156 = false;
																															}
																														}
																													} else {
																														var162 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var6,
																																		-1144992227);
																														Class670 var161 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var155,
																																		-1595074458);
																														if (-1 != var162.anInt8550 * 1305328919
																																&& 1305328919 * var161.anInt8550 != -1) {
																															var164 = (Class206) Class388.aClass40_Sub15_4063
																																	.method89(
																																			1305328919 * var162.anInt8550,
																																			-608744610);
																															Class206 var168 = (Class206) Class388.aClass40_Sub15_4063
																																	.method89(
																																			var161.anInt8550 * 1305328919,
																																			-841883794);
																															if (345143167 * var164.anInt2234 < var168.anInt2234 * 345143167) {
																																var156 = false;
																															}
																														}
																													}
																												}

																												if (var156) {
																													var139.anInt6980 = 2069804113 * var6;
																													var139.anInt6983 = var59
																															* -2102835649;
																													var139.anInt6981 = var78
																															* -338309057;
																													if (-1 != var6) {
																														var162 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var6,
																																		131513177);
																														var38 = var162.aBool8552 ? 0
																																: 2;
																														if (var94) {
																															var38 = 1;
																														}

																														var139.aClass704_6979
																																.method8225(
																																		var162.anInt8550 * 1305328919,
																																		var8,
																																		var38,
																																		false,
																																		-1862544712);
																													} else {
																														var139.aClass704_6979
																																.method8246(
																																		-1,
																																		(byte) -51);
																													}
																												}
																											}
																										} else if (hash >> 28 != 0) {
																											var13 = hash & '\uffff';
																											Class639_Sub1_Sub2_Sub1_Sub1 var98;
																											if (-1204447689
																													* client.localPlayerIndex == var13) {
																												var98 = Class451.localPlayer;
																											} else {
																												var98 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var13];
																											}

																											if (null != var98) {
																												Class510 var131 = var98.aClass510Array11906[id];
																												if ('\uffff' == var6) {
																													var6 = -1;
																												}

																												var22 = true;
																												var35 = 901715121 * var131.anInt6980;
																												Class670 var159;
																												if (var6 != -1
																														&& -1 != var35) {
																													if (var6 == var35) {
																														var159 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var6,
																																		-1144671174);
																														if (var159.aBool8552
																																&& var159.anInt8550 * 1305328919 != -1) {
																															Class206 var166 = (Class206) Class388.aClass40_Sub15_4063
																																	.method89(
																																			1305328919 * var159.anInt8550,
																																			357993076);
																															var38 = 1945727809 * var166.anInt2238;
																															if (var38 != 0
																																	&& var38 != 2) {
																																if (1 == var38) {
																																	var22 = true;
																																}
																															} else {
																																var22 = false;
																															}
																														}
																													} else {
																														var159 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var6,
																																		378714208);
																														var162 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var35,
																																		-1507404219);
																														if (1305328919 * var159.anInt8550 != -1
																																&& 1305328919 * var162.anInt8550 != -1) {
																															var163 = (Class206) Class388.aClass40_Sub15_4063
																																	.method89(
																																			var159.anInt8550 * 1305328919,
																																			-1462648201);
																															var164 = (Class206) Class388.aClass40_Sub15_4063
																																	.method89(
																																			1305328919 * var162.anInt8550,
																																			-1414506068);
																															if (var163.anInt2234 * 345143167 < var164.anInt2234 * 345143167) {
																																var22 = false;
																															}
																														}
																													}
																												}

																												if (var22) {
																													var131.anInt6980 = var6 * 2069804113;
																													var131.anInt6983 = var59
																															* -2102835649;
																													var131.anInt6981 = var78
																															* -338309057;
																													var131.anInt6982 = -1597807015
																															* var10;
																													if (var6 != -1) {
																														var159 = (Class670) Class689.aClass40_Sub12_8692
																																.method89(
																																		var6,
																																		-662945259);
																														var158 = var159.aBool8552 ? 0
																																: 2;
																														if (var94) {
																															var158 = 1;
																														}

																														var131.aClass704_6979
																																.method8225(
																																		var159.anInt8550 * 1305328919,
																																		var8,
																																		var158,
																																		false,
																																		474261826);
																													} else {
																														var131.aClass704_6979
																																.method8246(
																																		-1,
																																		(byte) -21);
																													}
																												}
																											}
																										}
																									}

																									connection.CURRENT_FRAME = null;
																									return true;
																								} else if (connection.CURRENT_FRAME == IncomingFrame.NPC_UPDATE) {
																									Class199_Sub17
																											.processNPCUpdate(
																													client.aClass505_11204.renderDistance * 2132832219,
																													-566071088);
																									connection.CURRENT_FRAME = null;
																									return true;
																								} else if (connection.CURRENT_FRAME == IncomingFrame.ROTATE_CAMERA) {
																									clickThrough = buffer
																											.readUnsignedByte(-1831505396);
																									id = buffer
																											.readUnsignedShort128((short) 2783);
																									Class242.aClass94_2456.aClass600_1154
																											.method7083(
																													(Class317) Class5.aClass40_Sub2_28
																															.method89(
																																	id,
																																	-1248776783),
																													clickThrough,
																													829213903);
																									connection.CURRENT_FRAME = null;
																									return true;
																								} else if (connection.CURRENT_FRAME == IncomingFrame.FADE_MAP) {
																									Class105.anInt1304 = buffer
																											.readUnsignedByte(-200790667)
																											* -565285947;
																									connection.CURRENT_FRAME = null;
																									return true;
																								} else if (connection.CURRENT_FRAME == IncomingFrame.CHUNK_STREAM) {
																									Class711.anInt8858 = buffer
																											.readByteC((byte) 8)
																											* -2050331237;
																									Class130.anInt1618 = (buffer
																											.readByte((byte) 59) << 3)
																											* -1789279365;
																									Class300.anInt3254 = (buffer
																											.writeByte128(-263003440) << 3) * 1499537771;
																									connection.CURRENT_FRAME = null;
																									return true;
																								} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4525) {
																									Class28.method729((byte) 1);
																									Class602.method7098((byte) 19);
																									connection.CURRENT_FRAME = null;
																									return true;
																								} else {
																									boolean var36;
																									if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4632) {
																										clickThrough = buffer
																												.readUnsigned128Byte((byte) -71);
																										if (clickThrough == 255) {
																											clickThrough = -1;
																										}

																										id = buffer
																												.readShortLE128(742342165);
																										var83 = buffer
																												.writeByte128(1133532864);
																										var59 = buffer
																												.readUnsignedShort(1908352015);
																										var8 = buffer
																												.readUnsignedByte(1124126423);
																										byte var84 = buffer
																												.read128Byte((byte) -79);
																										var10 = buffer
																												.readShort((byte) 1);
																										var78 = buffer
																												.readUnsignedShortLE128((short) 5888);
																										var12 = buffer
																												.readUnsigned128Byte((byte) -61);
																										var13 = buffer
																												.readByteC((byte) 8) * 4;
																										var14 = buffer
																												.readUnsignedLEShort((byte) 32);
																										var21 = buffer
																												.readUnsignedLEShort((byte) 121);
																										var133 = buffer
																												.readUnsignedShort(60003552);
																										var35 = buffer
																												.readUnsignedShort(1543513238);
																										var36 = 0 != (var12 & 1);
																										boolean var157 = (var12 & 2) != 0;
																										var38 = var157 ? var12 >> 2
																												: -1;
																										if (var157) {
																											var8 = (byte) var8;
																										} else {
																											var8 *= 4;
																										}

																										Class596 var39 = client.aClass505_11204
																												.method6128(2092574523);
																										int var40 = var14
																												- var39.localX
																												* -1629373182;
																										int var41 = var35
																												- -1691578662
																												* var39.localY;
																										var6 = var83
																												+ var40;
																										hash = var84
																												+ var41;
																										if (var40 >= 0
																												&& var41 >= 0
																												&& var40 < client.aClass505_11204
																														.method6056(-1746741811) * 2
																												&& var41 < client.aClass505_11204
																														.method6056(-1746741811) * 2
																												&& var6 >= 0
																												&& hash >= 0
																												&& var6 < client.aClass505_11204
																														.method6057(126749238) * 2
																												&& hash < client.aClass505_11204
																														.method6057(126749238) * 2
																												&& '\uffff' != var78) {
																											var40 = 256 * var40;
																											var41 = 256 * var41;
																											var6 *= 256;
																											hash *= 256;
																											var8 <<= 2;
																											var13 <<= 2;
																											var21 <<= 2;
																											Class293.method3955(
																													var78,
																													id,
																													var10,
																													var38,
																													var8,
																													var13,
																													var40,
																													var41,
																													var6,
																													hash,
																													var59,
																													var133,
																													clickThrough,
																													var21,
																													var36,
																													0,
																													-621583415);
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.LOBBY_INFO_PACKET == connection.CURRENT_FRAME) {
																										Class242.aClass94_2456.aClass600_1154
																												.method7081((byte) -3);
																										client.anInt11216 += 856091840;
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4658) {
																										int[] var102 = new int[4];

																										for (id = 0; id < 4; ++id) {
																											var102[id] = buffer
																													.readInt((byte) 5);
																										}

																										id = buffer
																												.readUnsignedShortLE128((short) 5888);
																										var6 = buffer
																												.readUnsigned128Byte((byte) -80);
																										LinkableObject var90 = (LinkableObject) client.npcs
																												.get(id);
																										if (null != var90) {
																											Class581.method6971(
																													(Class639_Sub1_Sub2_Sub1) var90.anObject10399,
																													var102,
																													var6,
																													true,
																													(byte) 0);
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4643 == connection.CURRENT_FRAME) {
																										clickThrough = buffer
																												.readIntV1(-630628485);
																										id = buffer
																												.readUnsignedShort(1957772851);
																										Class28.method729((byte) 1);
																										Class56.method998(
																												clickThrough,
																												id,
																												(byte) 64);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4645) {
																										clickThrough = buffer
																												.readUnsignedShort(2063666030);
																										id = buffer
																												.readUnsignedShort(1312418513);
																										var6 = buffer
																												.readUnsignedShort(397905935);
																										Class28.method729((byte) 1);
																										if (Class315_Sub1.aClass243Array10033[clickThrough] != null) {
																											for (var59 = id; var59 < var6; ++var59) {
																												var8 = buffer
																														.read24BitInt(742041327);
																												if (var59 < Class315_Sub1.aClass243Array10033[clickThrough].aClass245Array2459.length
																														&& Class315_Sub1.aClass243Array10033[clickThrough].aClass245Array2459[var59] != null) {
																													Class315_Sub1.aClass243Array10033[clickThrough].aClass245Array2459[var59].anInt2495 = var8 * 449444993;
																												}
																											}
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.CONTAINER_UPDATE) {
																										clickThrough = buffer
																												.readUnsignedShort(1070493461);
																										id = buffer
																												.readUnsignedByte(-1080716607);
																										var73 = 0 != (id & 1);

																										Class2 var81;
																										for (var64 = 0 != (id & 2); 301018015 * buffer.pos < connection.currentFrame
																												* -1225783061; Class526_Sub10
																												.method9363(
																														clickThrough,
																														var8,
																														hash - 1,
																														var10,
																														var81,
																														var73,
																														-1766938107)) {
																											var8 = buffer
																													.readSmart(-123685287);
																											hash = buffer
																													.readUnsignedShort(689358232);
																											var10 = 0;
																											var81 = null;
																											if (hash != 0) {
																												var10 = buffer
																														.readUnsignedByte(-1719355768);
																												if (255 == var10) {
																													var10 = buffer
																															.readInt((byte) 5);
																												}

																												if (var64) {
																													var12 = buffer
																															.readUnsignedByte(-1930272532);
																													if (var12 > 0) {
																														var81 = new Class2(
																																Class476.aClass97_Sub1_Sub2_5386);

																														while (var12-- > 0) {
																															Class424 var93 = Class476.aClass97_Sub1_Sub2_5386
																																	.method8370(
																																			buffer,
																																			-668922391);
																															var81.method27(
																																	var93.anInt4793 * 1602756037,
																																	var93.anObject4794,
																																	172204199);
																														}
																													}
																												}
																											}
																										}

																										client.anIntArray11129[(client.anInt11220 += 1236360113)
																												* -1051062959
																												- 1
																												& 63] = clickThrough;
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4543) {
																										clickThrough = buffer
																												.readIntV2((byte) 36);
																										id = buffer
																												.readByteC((byte) 8);
																										var6 = buffer
																												.readUnsigned128Byte((byte) -103);
																										var59 = buffer
																												.readIntLE(1125294126);
																										var8 = buffer
																												.readUnsigned128Byte((byte) -12);
																										hash = clickThrough >> 28;
																										var10 = clickThrough >> 14 & 16383;
																										var78 = clickThrough & 16383;
																										Class570.aClass231_7657
																												.method3211(
																														var59,
																														var6,
																														true,
																														hash,
																														var10 << 9,
																														var78 << 9,
																														var8 << 9,
																														id << 9,
																														1087861148);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4682 == connection.CURRENT_FRAME) {
																										var61 = buffer
																												.readString(-2044909129);
																										var73 = buffer
																												.readUnsignedByte(521386249) == 1;
																										if (var73) {
																											var57 = buffer
																													.readString(847106901);
																										} else {
																											var57 = var61;
																										}

																										var59 = buffer
																												.readUnsignedShort(1572646901);
																										byte var70 = buffer
																												.readByte((byte) 104);
																										var74 = false;
																										if (var70 == -128) {
																											var74 = true;
																										}

																										if (var74) {
																											if (0 == -190820129
																													* Class11.anInt145) {
																												connection.CURRENT_FRAME = null;
																												return true;
																											}

																											var77 = false;

																											for (var10 = 0; var10 < -190820129
																													* Class11.anInt145
																													&& (!Class655.aClass107Array8488[var10].aString1311
																															.equals(var57) || var59 != Class655.aClass107Array8488[var10].anInt1313 * 1746541627); ++var10) {
																												;
																											}

																											if (var10 < Class11.anInt145
																													* -190820129) {
																												while (var10 < Class11.anInt145
																														* -190820129
																														- 1) {
																													Class655.aClass107Array8488[var10] = Class655.aClass107Array8488[1 + var10];
																													++var10;
																												}

																												Class11.anInt145 -= 2102881055;
																												Class655.aClass107Array8488[-190820129
																														* Class11.anInt145] = null;
																											}
																										} else {
																											var86 = buffer
																													.readString(157718);
																											Class107 var76 = new Class107();
																											var76.aString1310 = var61;
																											var76.aString1311 = var57;
																											var76.aString1312 = Class81
																													.method1164(
																															var76.aString1311,
																															Class583.aClass82_7781,
																															(byte) 1);
																											var76.anInt1313 = 538336499 * var59;
																											var76.aByte1315 = var70;
																											var76.aString1314 = var86;

																											for (var12 = -190820129
																													* Class11.anInt145
																													- 1; var12 >= 0; --var12) {
																												var13 = Class655.aClass107Array8488[var12].aString1312
																														.compareTo(var76.aString1312);
																												if (var13 == 0) {
																													Class655.aClass107Array8488[var12].anInt1313 = var59 * 538336499;
																													Class655.aClass107Array8488[var12].aByte1315 = var70;
																													Class655.aClass107Array8488[var12].aString1314 = var86;
																													if (var57
																															.equals(Class451.localPlayer.aString12161)) {
																														Class397.aByte4127 = var70;
																													}

																													client.anInt11231 = client.anInt11214
																															* -488772589;
																													connection.CURRENT_FRAME = null;
																													return true;
																												}

																												if (var13 < 0) {
																													break;
																												}
																											}

																											if (-190820129
																													* Class11.anInt145 >= Class655.aClass107Array8488.length) {
																												connection.CURRENT_FRAME = null;
																												return true;
																											}

																											for (var13 = -190820129
																													* Class11.anInt145
																													- 1; var13 > var12; --var13) {
																												Class655.aClass107Array8488[var13 + 1] = Class655.aClass107Array8488[var13];
																											}

																											if (-190820129
																													* Class11.anInt145 == 0) {
																												Class655.aClass107Array8488 = new Class107[100];
																											}

																											Class655.aClass107Array8488[var12 + 1] = var76;
																											Class11.anInt145 += 2102881055;
																											if (var57
																													.equals(Class451.localPlayer.aString12161)) {
																												Class397.aByte4127 = var70;
																											}
																										}

																										client.anInt11231 = client.anInt11214
																												* -488772589;
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4594 == connection.CURRENT_FRAME) {
																										clickThrough = buffer
																												.readIntV2((byte) 82);
																										if (1278444757 * Class498.anInt5592 != clickThrough) {
																											Class498.anInt5592 = clickThrough
																													* -2074504067;
																											Class636.method7566(
																													Class581.aClass581_7761,
																													-1,
																													-1,
																													710378902);
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4656) {
																										var68 = buffer
																												.readUnsignedByte(2058395430) == 1;
																										Class28.method729((byte) 1);
																										Class457.aBool5160 = var68;
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.LOGOUT == connection.CURRENT_FRAME) {
																										Class460_Sub1
																												.logout(false,
																														-1730576285);
																										connection.CURRENT_FRAME = null;
																										return false;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4608) {
																										clickThrough = buffer
																												.readUnsignedShort(1384565023);
																										id = buffer
																												.readIntV1(-630628485);
																										Class28.method729((byte) 1);
																										Class394.method4809(
																												id,
																												clickThrough,
																												-1002838743);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.VAR_1_PACKET == connection.CURRENT_FRAME) {
																										clickThrough = buffer
																												.readUnsignedShortLE128((short) 5888);
																										var87 = buffer
																												.readByteC(-2087725885);

																										System.out
																												.println("player.getPackets().sendVar("
																														+ clickThrough
																														+ ", "
																														+ var87
																														+ ")");

																										Class242.aClass94_2456.aClass600_1154
																												.method7082(
																														(Class143) Class506.aClass97_Sub1_Sub1_5698
																																.method89(
																																		clickThrough,
																																		-163265324),
																														var87,
																														133081195);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.PING_FRAME == connection.CURRENT_FRAME) {
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4638 == connection.CURRENT_FRAME) {
																										clickThrough = buffer
																												.readInt((byte) 5);
																										id = buffer
																												.readUnsignedShort(1368658679);
																										Class242.aClass94_2456.aClass600_1154
																												.method7083(
																														(Class317) Class5.aClass40_Sub2_28
																																.method89(
																																		id,
																																		-1019946428),
																														clickThrough,
																														829213903);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4529) {
																										if (!client.aBool11302) {
																											try {
																												clickThrough = buffer
																														.readUnsignedByte(1132508183);
																												client.aClass216_11301
																														.method2971(
																																clickThrough,
																																-291249165);
																											} catch (RuntimeException var52) {
																												Class375.method4671(
																														(String) null,
																														var52,
																														(byte) 29);
																												Class604.method7103(
																														connection,
																														-816047072);
																											}
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.VAR_2_PACKET) {
																										clickThrough = buffer
																												.readInt((byte) 5);
																										id = buffer
																												.readUnsignedShortLE128((short) 5888);

																										System.out
																												.println("player.getPackets().sendVar("
																														+ id
																														+ ", "
																														+ clickThrough
																														+ ")");

																										Class242.aClass94_2456.aClass600_1154
																												.method7082(
																														(Class143) Class506.aClass97_Sub1_Sub1_5698
																																.method89(
																																		id,
																																		-1042308673),
																														clickThrough,
																														-629679341);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4618) {
																										clickThrough = buffer
																												.readUnsignedByte(2081209508);
																										Class700 var80 = (Class700) Class561
																												.findIdentifiable(
																														Class171.method2157(840726631),
																														clickThrough,
																														(byte) -52);
																										if (var80 == null) {
																											var80 = Class700.aClass700_8776;
																										}

																										Class45.method922(
																												var80,
																												-1625166886);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.GAME_MESSAGE) {
																										clickThrough = buffer
																												.readSmart(-1920151962);
																										id = buffer
																												.readInt((byte) 5);
																										var6 = buffer
																												.readUnsignedByte(217266139);
																										var63 = "";
																										var67 = var63;
																										if (0 != (var6 & 1)) {
																											var63 = buffer
																													.readString(836907276);
																											if ((var6 & 2) != 0) {
																												var67 = buffer
																														.readString(486915206);
																											} else {
																												var67 = var63;
																											}
																										}

																										String var71 = buffer
																												.readString(-1014161303);
																										if (99 == clickThrough) {
																											Class27.method722(
																													var71,
																													-315839031);
																										} else if (98 == clickThrough) {
																											Class144.method1668(
																													var71,
																													-1299802504);
																										} else {
																											if (!var67
																													.equals("")
																													&& Class590
																															.method7011(
																																	var67,
																																	790548205)) {
																												connection.CURRENT_FRAME = null;
																												return true;
																											}

																											Class177.method2659(
																													clickThrough,
																													id,
																													var63,
																													var67,
																													var63,
																													var71,
																													(Class415) null,
																													-1807481738);
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.ADD_GROUND_ITEM == connection.CURRENT_FRAME) {
																										Class246.method3392(
																												Class422.aClass422_4734,
																												830998279);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.PLAYER_UPDATE == connection.CURRENT_FRAME) {
																										// System.out.println("Player update packet.");
																										Class689_Sub3
																												.method10223(
																														buffer,
																														connection.currentFrame
																																* -1225783061,
																														1966078467);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.PLAY_MUSIC_EFFECT == connection.CURRENT_FRAME) {
																										clickThrough = buffer
																												.readUnsignedLEShort((byte) 125);
																										if ('\uffff' == clickThrough) {
																											clickThrough = -1;
																										}

																										Class570.aClass231_7657
																												.method3207(
																														clickThrough,
																														255,
																														1557092978);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.FRIEND_LIST == connection.CURRENT_FRAME) {
																										while (buffer.pos * 301018015 < -1225783061
																												* connection.currentFrame) {
																											var68 = buffer
																													.readUnsignedByte(928542631) == 1;
																											var57 = buffer
																													.readString(1831412337);
																											var60 = buffer
																													.readString(1852763226);
																											var59 = buffer
																													.readUnsignedShort(34734903);
																											var8 = buffer
																													.readUnsignedByte(1685300345);
																											hash = buffer
																													.readUnsignedByte(983201171);
																											var77 = 0 != (hash & 2);
																											var75 = (hash & 1) != 0;
																											String var85 = "";
																											var13 = -1;
																											var14 = 0;
																											if (var59 > 0) {
																												var85 = buffer
																														.readString(166113055);
																												var13 = buffer
																														.readUnsignedByte(787583129);
																												var14 = buffer
																														.readInt((byte) 5);
																											}

																											var123 = buffer
																													.readString(-476242573);

																											for (var133 = 0; var133 < -17244221
																													* client.anInt11130; ++var133) {
																												Class50 var153 = client.aClass50Array11290[var133];
																												if (!var68) {
																													if (var57
																															.equals(var153.aString659)) {
																														if (var59 != var153.anInt653 * 799007287) {
																															var36 = true;

																															for (Class539_Sub4 var37 = (Class539_Sub4) client.aClass686_11048
																																	.method8053((byte) 1); var37 != null; var37 = (Class539_Sub4) client.aClass686_11048
																																	.method8054(-936686157)) {
																																if (var37.aString10341
																																		.equals(var57)) {
																																	if (0 != var59
																																			&& 0 == var37.aShort10343) {
																																		var37.method6448(-1785359533);
																																		var36 = false;
																																	} else if (0 == var59
																																			&& 0 != var37.aShort10343) {
																																		var37.method6448(1092607045);
																																		var36 = false;
																																	}
																																}
																															}

																															if (var36) {
																																client.aClass686_11048
																																		.method8058(
																																				new Class539_Sub4(
																																						var57,
																																						var59),
																																				(byte) -55);
																															}

																															var153.anInt653 = var59 * 469201799;
																														}

																														var153.aString652 = var60;
																														var153.aString654 = var85;
																														var153.anInt655 = var8
																																* -1749629997;
																														var153.anInt656 = -1353341591
																																* var13;
																														var153.aBool651 = var77;
																														var153.aBool658 = var75;
																														var153.aString660 = var123;
																														var153.anInt657 = var14
																																* -1426334217;
																														var57 = null;
																														break;
																													}
																												} else if (var60
																														.equals(var153.aString659)) {
																													var153.aString659 = var57;
																													var153.aString652 = var60;
																													var57 = null;
																													break;
																												}
																											}

																											if (var57 != null
																													&& -17244221
																															* client.anInt11130 < 400) {
																												Class50 var135 = new Class50();
																												client.aClass50Array11290[client.anInt11130
																														* -17244221] = var135;
																												var135.aString659 = var57;
																												var135.aString652 = var60;
																												var135.anInt653 = 469201799 * var59;
																												var135.aString654 = var85;
																												var135.anInt655 = -1749629997
																														* var8;
																												var135.anInt656 = -1353341591
																														* var13;
																												var135.aBool651 = var77;
																												var135.aBool658 = var75;
																												var135.aString660 = var123;
																												var135.anInt657 = -1426334217
																														* var14;
																												client.anInt11130 += 855214315;
																											}
																										}

																										client.anInt11288 = -660712046;
																										client.anInt11246 = client.anInt11214 * 1211622781;
																										var68 = false;
																										id = -17244221
																												* client.anInt11130;

																										while (id > 0) {
																											var68 = true;
																											--id;

																											for (var6 = 0; var6 < id; ++var6) {
																												var64 = false;
																												Class50 var66 = client.aClass50Array11290[var6];
																												Class50 var69 = client.aClass50Array11290[var6 + 1];
																												if (799007287 * var66.anInt653 != -2107114137
																														* Class16.aClass6_171.id
																														&& Class16.aClass6_171.id
																																* -2107114137 == var69.anInt653 * 799007287) {
																													var64 = true;
																												}

																												if (!var64
																														&& var66.anInt653 * 799007287 == 0
																														&& 0 != 799007287 * var69.anInt653) {
																													var64 = true;
																												}

																												if (!var64
																														&& !var66.aBool651
																														&& var69.aBool651) {
																													var64 = true;
																												}

																												if (!var64
																														&& !var66.aBool658
																														&& var69.aBool658) {
																													var64 = true;
																												}

																												if (var64) {
																													Class50 var79 = client.aClass50Array11290[var6];
																													client.aClass50Array11290[var6] = client.aClass50Array11290[1 + var6];
																													client.aClass50Array11290[1 + var6] = var79;
																													var68 = false;
																												}
																											}

																											if (var68) {
																												break;
																											}
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.MESSAGE_FRIENDS_QC == connection.CURRENT_FRAME) {
																										var68 = buffer
																												.readUnsignedByte(892355582) == 1;
																										var57 = buffer
																												.readString(-330878330);
																										var60 = var57;
																										if (var68) {
																											var60 = buffer
																													.readString(-1109225665);
																										}

																										var63 = buffer
																												.readString(1573917974);
																										var17 = buffer
																												.readUnsignedShort(821112561);
																										var23 = buffer
																												.read24BitInt(742041327);
																										var82 = (Class415) Class561
																												.findIdentifiable(
																														Class415.method4930(-4484982),
																														buffer.readUnsignedByte(-411039490),
																														(byte) -46);
																										var13 = buffer
																												.readUnsignedShort(817280756);
																										long var42 = var23
																												+ (var17 << 32);
																										var22 = false;
																										var35 = 0;

																										while (true) {
																											if (var35 >= 100) {
																												if (var82.aBool4474
																														&& Class590
																																.method7011(
																																		var60,
																																		-443388173)) {
																													var22 = true;
																												}
																												break;
																											}

																											if (client.aLongArray11165[var35] == var42) {
																												var22 = true;
																												break;
																											}

																											++var35;
																										}

																										if (!var22) {
																											client.aLongArray11165[-1662656037
																													* client.anInt11262] = var42;
																											client.anInt11262 = (-1662656037
																													* client.anInt11262 + 1) % 100 * 75575891;
																											String var152 = Class277.aClass56_3028
																													.method994(
																															var13,
																															(byte) 0)
																													.method10677(
																															buffer,
																															(byte) -51);
																											if (var82.anInt4476
																													* -665210955 != -1) {
																												Class503.method6041(
																														20,
																														0,
																														Class199_Sub13
																																.method9016(
																																		var82.anInt4476
																																				* -665210955,
																																		16711935)
																																+ var57,
																														Class199_Sub13
																																.method9016(
																																		-665210955
																																				* var82.anInt4476,
																																		16711935)
																																+ var60,
																														var57,
																														var152,
																														var63,
																														var13,
																														var82,
																														-1938857731);
																											} else {
																												Class503.method6041(
																														20,
																														0,
																														var57,
																														var60,
																														var57,
																														var152,
																														var63,
																														var13,
																														var82,
																														-494180285);
																											}
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4524 == connection.CURRENT_FRAME) {
																										var65 = buffer
																												.readByteC(-2087725885);
																										id = buffer
																												.readUnsignedLEShort((byte) 79);
																										Class28.method729((byte) 1);
																										Class539_Sub6
																												.method9313(
																														id,
																														var65,
																														(byte) -126);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4693) {
																										clickThrough = buffer
																												.readUnsignedShortLE128((short) 5888);
																										id = buffer
																												.readUnsignedShort(466683562);
																										var6 = buffer
																												.readIntV1(-630628485);
																										client.aClass505_11204
																												.method6072(
																														829509566)
																												.method6604(
																														clickThrough,
																														var6,
																														id,
																														(byte) 61);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (connection.CURRENT_FRAME == IncomingFrame.QC_PRIVATE_MESSAGE) {
																										var61 = buffer
																												.readString(-1946580340);
																										id = buffer
																												.readUnsignedShort(1195334865);
																										var60 = Class277.aClass56_3028
																												.method994(
																														id,
																														(byte) 0)
																												.method10677(
																														buffer,
																														(byte) -82);
																										Class503.method6041(
																												19,
																												0,
																												var61,
																												var61,
																												var61,
																												var60,
																												(String) null,
																												id,
																												(Class415) null,
																												-1425894040);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.OPEN_INTERFACE == connection.CURRENT_FRAME) {
																										clickThrough = buffer
																												.readUnsignedByte128((byte) 36);
																										id = buffer
																												.readUnsignedShort128((short) 7362);
																										var6 = buffer
																												.readIntV2((byte) 119);
																										var59 = buffer
																												.readIntV2((byte) 109);
																										var8 = buffer
																												.readIntLE(1356590481);
																										hash = buffer
																												.readIntLE(657690548);
																										var10 = buffer
																												.readIntLE(1853579064);
																										Class28.method729((byte) 1);

																										int interfaceId = hash >> 16;
																										int componentId = hash & 0xFFFF;

																										System.out
																												.println("player.getPackets().sendInterface("
																														+ (clickThrough == 1)
																														+ ", "
																														+ interfaceId
																														+ ", "
																														+ componentId
																														+ ", "
																														+ id
																														+ ");");

																										IncomingFrame
																												.method4983(
																														hash,
																														new Class526_Sub38(
																																id,
																																clickThrough),
																														new int[] {
																																var6,
																																var8,
																																var10,
																																var59 },
																														false,
																														(short) -15239);
																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4576 == connection.CURRENT_FRAME) {
																										if (!client.aBool11302) {
																											try {
																												clickThrough = buffer
																														.readUnsignedByte(-1426081092);
																												id = buffer
																														.readUnsignedByte128((byte) 36);
																												var6 = buffer
																														.readByteC((byte) 8);
																												client.aClass216_11301
																														.method2969(
																																var6,
																																1517212089)
																														.method3082(
																																clickThrough,
																																id,
																																(Object) null,
																																(byte) 2);
																											} catch (RuntimeException var53) {
																												Class375.method4671(
																														(String) null,
																														var53,
																														(byte) 13);
																												Class604.method7103(
																														connection,
																														-1542275634);
																											}
																										}

																										connection.CURRENT_FRAME = null;
																										return true;
																									} else if (IncomingFrame.aClass420_4541 != connection.CURRENT_FRAME) {
																										if (IncomingFrame.aClass420_4707 == connection.CURRENT_FRAME) {
																											Class704.method8265(
																													buffer,
																													connection.currentFrame
																															* -1225783061,
																													(byte) -42);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (IncomingFrame.CS_VAR_STRING_LARGE == connection.CURRENT_FRAME) {
																											var61 = buffer
																													.readString(-1923136882);
																											id = buffer
																													.readUnsignedLEShort((byte) 2);

																											System.out
																													.println("player.getPackets().sendCSVarString("
																															+ id
																															+ ", "
																															+ var61
																															+ ")");

																											Class28.method729((byte) 1);
																											Class114.method1401(
																													id,
																													var61,
																													1960946563);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.ADD_OBJECT) {
																											Class246.method3392(
																													Class422.aClass422_4738,
																													830998279);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.SET_OBJECT_INTERFACE) {
																											clickThrough = buffer
																													.readUnsigned128Byte((byte) -14);
																											id = buffer
																													.readIntV2((byte) 19);
																											var6 = buffer
																													.readUnsignedByte128((byte) 36);
																											var59 = var6 >> 2;
																											var8 = var6 & 3;
																											hash = buffer
																													.readIntV2((byte) 46);
																											var10 = buffer
																													.readIntV2((byte) 90);
																											Class596 var72 = new Class596(
																													buffer.readIntLE(580836270));
																											var12 = buffer
																													.readUnsignedLEShort((byte) 67);
																											var13 = buffer
																													.readInt((byte) 5);
																											var14 = buffer
																													.readIntLE(1631069007);
																											var21 = buffer
																													.readIntLE(1415160217);
																											Class28.method729((byte) 1);
																											IncomingFrame
																													.method4983(
																															hash,
																															new Class526_Sub38_Sub4(
																																	var12,
																																	clickThrough,
																																	new Class672(
																																			var72,
																																			var59,
																																			var8,
																																			var21)),
																															new int[] {
																																	id,
																																	var14,
																																	var10,
																																	var13 },
																															false,
																															(short) -30039);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4589) {
																											Class570.aClass231_7657
																													.method3239(
																															buffer.readUnsignedShort(1843987734),
																															-2147483647);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (IncomingFrame.PLAYER_ON_INTERFACE == connection.CURRENT_FRAME) {
																											clickThrough = buffer
																													.readUnsigned128Byte((byte) -15);
																											clickThrough = -clickThrough - 2;
																											id = buffer
																													.readIntLE(574501883);
																											Class28.method729((byte) 1);
																											Class487.method5860(
																													id,
																													5,
																													clickThrough,
																													0,
																													(byte) 12);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4585) {
																											clickThrough = buffer
																													.readIntLE(-176695646);
																											Class28.method729((byte) 1);
																											Class487.method5860(
																													clickThrough,
																													5,
																													-1204447689
																															* client.localPlayerIndex,
																													0,
																													(byte) 12);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4532) {
																											clickThrough = buffer
																													.readUnsignedByte(-1318364734);
																											id = buffer
																													.readUnsignedShortLE128((short) 5888);
																											var6 = buffer
																													.readIntV1(-630628485);
																											var59 = buffer
																													.readUnsignedShort(840859505);
																											Class28.method729((byte) 1);
																											Class325_Sub3
																													.method9132(
																															var6,
																															clickThrough,
																															id,
																															var59,
																															1628015707);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.PROJECTILE_BODY_TARGET) {
																											Class246.method3392(
																													Class422.aClass422_4725,
																													830998279);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.aClass420_4619) {
																											Class246.method3392(
																													Class422.aClass422_4730,
																													830998279);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (IncomingFrame.aClass420_4533 == connection.CURRENT_FRAME) {
																											Class637 var56 = new Class637();
																											var58 = var56
																													.method7569(
																															buffer,
																															1568348346);
																											client.aClass505_11204
																													.method6100(
																															(byte) -21)
																													.method7364(
																															client.aClass505_11204,
																															var58 ? var56
																																	: null,
																															var56.method7585(-2110864949),
																															(byte) -52);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (connection.CURRENT_FRAME == IncomingFrame.PLAY_MUSIC_EFFECT_WITH_VOLUME) {
																											clickThrough = buffer
																													.readUnsignedShortLE128((short) 5888);
																											if ('\uffff' == clickThrough) {
																												clickThrough = -1;
																											}

																											id = buffer
																													.readByteC((byte) 8);
																											Class570.aClass231_7657
																													.method3214(
																															clickThrough,
																															id,
																															(byte) -75);
																											connection.CURRENT_FRAME = null;
																											return true;
																										} else if (IncomingFrame.aClass420_4695 == connection.CURRENT_FRAME) {
																											clickThrough = buffer
																													.readUnsignedShort(1408281115);
																											var57 = buffer
																													.readString(-1007995716);
																											var6 = buffer
																													.readUnsignedShort(1074719318);
																											var59 = buffer
																													.readUnsignedShort(1679438222);
																											var62 = buffer
																													.readUnsignedByte(-1679032209) == 1;
																											Class519.aClass6_7046 = Class16.aClass6_171;
																											Class16.aBool168 = var62;
																											Class298.method3982(
																													clickThrough,
																													var57,
																													var6,
																													var59,
																													1456820573);
																											var2 = null;
																											Class593.method7031(
																													19,
																													(byte) 58);
																											connection.CURRENT_FRAME = null;
																											return false;
																										} else if (IncomingFrame.SET_MOUSE == connection.CURRENT_FRAME) {
																											Class220.aString2297 = connection.currentFrame
																													* -1225783061 > 2 ? buffer
																													.readString(430502347)
																													: Class45.aClass45_471
																															.method920(
																																	Class26.aClass673_247,
																																	-827840379);
																											client.anInt11171 = (-1225783061
																													* connection.currentFrame > 0 ? buffer
																													.readUnsignedShort(1079157381)
																													: -1)
																													* -1812441095;
																											if (client.anInt11171 * 1231338057 == '\uffff') {
																												client.anInt11171 = 1812441095;
																											}

																											connection.CURRENT_FRAME = null;
																											return true;
																										} else {
																											Class375.method4671(
																													(null != connection.CURRENT_FRAME ? 1119796895 * connection.CURRENT_FRAME.id
																															: -1)
																															+ Class64.aString738
																															+ (null != connection.aClass420_1351 ? 1119796895 * connection.aClass420_1351.id
																																	: -1)
																															+ Class64.aString738
																															+ (null != connection.aClass420_1352 ? connection.aClass420_1352.id * 1119796895
																																	: -1)
																															+ " "
																															+ -1225783061
																															* connection.currentFrame,
																													new RuntimeException(),
																													(byte) 80);
																											Class460_Sub1
																													.logout(false,
																															-1730576285);
																											return true;
																										}
																									} else {
																										client.aClass216_11301
																												.method2972(-924842201);
																										clickThrough = buffer
																												.readUnsignedByte(363608344);

																										for (id = 0; id < clickThrough; ++id) {
																											var6 = buffer
																													.readInt((byte) 5);
																											Class221 var7 = new Class221(
																													var6);
																											client.aClass216_11301
																													.method2967(
																															var7,
																															2036571919);
																											var8 = buffer
																													.readUnsignedByte(1452795639);

																											for (hash = 0; hash < var8; ++hash) {
																												var7.method3060(
																														buffer.readInt((byte) 5),
																														2109910830);
																											}

																											hash = buffer
																													.readUnsignedByte(982256777);

																											for (var10 = 0; var10 < hash; ++var10) {
																												var7.method3054(
																														buffer.readInt((byte) 5),
																														(byte) -35);
																											}

																											for (var10 = 0; var10 < var8; ++var10) {
																												byte var11 = buffer
																														.readByte((byte) 116);
																												var7.method3056(
																														var10,
																														var11,
																														(byte) 0);

																												for (var12 = 0; var12 < hash; ++var12) {
																													if (buffer
																															.readUnsignedByte(-863967435) == 0) {
																														var7.method3082(
																																var10,
																																var12,
																																(Object) null,
																																(byte) 2);
																													} else {
																														var7.method3082(
																																var10,
																																var12,
																																Integer.valueOf(buffer
																																		.readInt((byte) 5)),
																																(byte) 2);
																													}
																												}
																											}
																										}

																										client.aBool11302 = false;
																										connection.CURRENT_FRAME = null;
																										return true;
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
