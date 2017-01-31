package com.jagex;

import com.jagex.Class103;
import com.jagex.Class107;
import com.jagex.Class199_Sub22;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class380_Sub1;
import com.jagex.Class40_Sub17;
import com.jagex.Class458;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.Buffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class526_Sub9;
import com.jagex.Class595;
import com.jagex.Class641;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class710;
import com.jagex.Interface40;
import com.jagex.client;

public class IncomingFrame {
	public static IncomingFrame aClass420_4702 = new IncomingFrame(0, 3);
	public static IncomingFrame aClass420_4524 = new IncomingFrame(1, 3);
	public static IncomingFrame aClass420_4528 = new IncomingFrame(2, 10);
	public static IncomingFrame SET_SPRITE = new IncomingFrame(3, 8);
	public static IncomingFrame aClass420_4527 = new IncomingFrame(4, 8);
	public static IncomingFrame SKILLS_UPDATE = new IncomingFrame(5, 6);
	public static IncomingFrame ADD_OBJECT = new IncomingFrame(6, 6);
	public static IncomingFrame aClass420_4530 = new IncomingFrame(7, 1);
	public static IncomingFrame OPEN_INTERFACE = new IncomingFrame(8, 23);
	public static IncomingFrame PLAY_MUSIC_EFFECT = new IncomingFrame(9, 2);
	public static IncomingFrame aClass420_4533 = new IncomingFrame(10, -1);
	public static IncomingFrame aClass420_4534 = new IncomingFrame(11, 8);
	public static IncomingFrame aClass420_4535 = new IncomingFrame(12, 5);
	public static IncomingFrame SET_PLAYER_INTERFACE = new IncomingFrame(13, 25);
	public static IncomingFrame CONTAINER_UPDATE = new IncomingFrame(14, -2);
	public static IncomingFrame SPRITE_ON_INTERFACE = new IncomingFrame(15, 8);
	public static IncomingFrame aClass420_4539 = new IncomingFrame(16, 0);
	public static IncomingFrame MESSAGE_FRIENDS_QC = new IncomingFrame(17, -1);
	public static IncomingFrame aClass420_4717 = new IncomingFrame(18, 0);
	public static IncomingFrame aClass420_4542 = new IncomingFrame(19, 2);
	public static IncomingFrame aClass420_4543 = new IncomingFrame(20, 11);
	public static IncomingFrame GAMEBAR_UPDATE = new IncomingFrame(21, 2);
	public static IncomingFrame aClass420_4545 = new IncomingFrame(22, 28);
	public static IncomingFrame FRIEND_CHAT_LIST = new IncomingFrame(23, -2);
	public static IncomingFrame aClass420_4653 = new IncomingFrame(24, 7);
	public static IncomingFrame WEIGHT = new IncomingFrame(25, 2);
	public static IncomingFrame REMOVE_GROUND_ITEM = new IncomingFrame(26, 5);
	public static IncomingFrame CAMERA_SHAKE = new IncomingFrame(27, 6);
	public static IncomingFrame QC_PRIVATE_MESSAGE = new IncomingFrame(28, -1);
	public static IncomingFrame STAMINA = new IncomingFrame(29, 1);
	public static IncomingFrame aClass420_4553 = new IncomingFrame(30, -2);
	public static IncomingFrame PLAY_MUSIC_EFFECT_WITH_VOLUME = new IncomingFrame(31, 3);
	public static IncomingFrame aClass420_4555 = new IncomingFrame(32, 0);
	public static IncomingFrame aClass420_4556 = new IncomingFrame(33, 10);
	public static IncomingFrame ICOMPONENT_TEXT = new IncomingFrame(34, -2);
	public static IncomingFrame PUBLIC_MESSAGE = new IncomingFrame(35, -1);
	public static IncomingFrame SET_OBJECT_INTERFACE = new IncomingFrame(36, 32);
	public static IncomingFrame aClass420_4560 = new IncomingFrame(37, 0);
	public static IncomingFrame aClass420_4561 = new IncomingFrame(38, 2);
	public static IncomingFrame NPC_UPDATE = new IncomingFrame(39, -2);
	public static IncomingFrame RESET_CAMERA = new IncomingFrame(40, 0);
	public static IncomingFrame CS_VAR_1_PACKET = new IncomingFrame(41, 3);
	public static IncomingFrame aClass420_4565 = new IncomingFrame(42, -1);
	public static IncomingFrame GAME_MESSAGE = new IncomingFrame(43, -1);
	public static IncomingFrame CLAN_CHAT_MESSAGE_QUICK = new IncomingFrame(44, -1);
	public static IncomingFrame CS2_SCRIPT_PACKET = new IncomingFrame(45, -2);
	public static IncomingFrame aClass420_4529 = new IncomingFrame(46, 1);
	public static IncomingFrame aClass420_4525 = new IncomingFrame(47, 0);
	public static IncomingFrame CLOSE_INTERFACE = new IncomingFrame(48, 4);
	public static IncomingFrame aClass420_4531 = new IncomingFrame(49, -2);
	public static IncomingFrame CAMERA_POSITION = new IncomingFrame(50, 6);
	public static IncomingFrame aClass420_4574 = new IncomingFrame(51, -2);
	public static IncomingFrame aClass420_4696 = new IncomingFrame(52, -2);
	public static IncomingFrame aClass420_4576 = new IncomingFrame(53, 3);
	public static IncomingFrame PLAYER_UPDATE = new IncomingFrame(54, -2);
	public static IncomingFrame aClass420_4578 = new IncomingFrame(55, -2);
	public static IncomingFrame CS2_VAR_STRING_SMALL = new IncomingFrame(56, -1);
	public static IncomingFrame CS_VAR_STRING_LARGE = new IncomingFrame(57, -2);
	public static IncomingFrame aClass420_4581 = new IncomingFrame(58, 2);
	public static IncomingFrame aClass420_4622 = new IncomingFrame(59, 1);
	public static IncomingFrame SYSTEM_UPDATE = new IncomingFrame(60, 2);
	public static IncomingFrame PLAYER_UNDER_NPC_PRIORITY_PACKET = new IncomingFrame(61, 1);
	public static IncomingFrame aClass420_4562 = new IncomingFrame(62, 6);
	public static IncomingFrame CUTSCENE = new IncomingFrame(63, -2);
	public static IncomingFrame aClass420_4587 = new IncomingFrame(64, -1);
	public static IncomingFrame aClass420_4588 = new IncomingFrame(65, 1);
	public static IncomingFrame STATIC_REGION = new IncomingFrame(66, -2);
	public static IncomingFrame VAR_NIS = new IncomingFrame(67, -1);
	public static IncomingFrame aClass420_4597 = new IncomingFrame(68, 0);
	public static IncomingFrame FRIEND_CHAT_MESSAGE = new IncomingFrame(69, -1);
	public static IncomingFrame PLAY_MUSIC = new IncomingFrame(70, 3);
	public static IncomingFrame aClass420_4594 = new IncomingFrame(71, 4);
	public static IncomingFrame aClass420_4704 = new IncomingFrame(72, 4);
	public static IncomingFrame ROOT_INTERFACE_PACKET = new IncomingFrame(73, 19);
	public static IncomingFrame FRIENDS_STATUS = new IncomingFrame(74, 1);
	public static IncomingFrame aClass420_4598 = new IncomingFrame(75, 2);
	public static IncomingFrame PLAY_SOUND_EFFECT = new IncomingFrame(76, 6);
	public static IncomingFrame aClass420_4577 = new IncomingFrame(77, -2);
	public static IncomingFrame IGNORE_LIST = new IncomingFrame(78, -2);
	public static IncomingFrame aClass420_4585 = new IncomingFrame(79, 4);
	public static IncomingFrame aClass420_4523 = new IncomingFrame(80, 6);
	public static IncomingFrame LOBBY_INFO_PACKET = new IncomingFrame(81, 0);
	public static IncomingFrame GRAPHIC_ON_TILE = new IncomingFrame(82, 12);
	public static IncomingFrame PRIVATE_MESSAGE = new IncomingFrame(83, -2);
	public static IncomingFrame PLAYER_OPTION = new IncomingFrame(84, -1);
	public static IncomingFrame aClass420_4608 = new IncomingFrame(85, 6);
	public static IncomingFrame aClass420_4645 = new IncomingFrame(86, -1);
	public static IncomingFrame CS_VAR_2_PACKET = new IncomingFrame(87, 6);
	public static IncomingFrame aClass420_4658 = new IncomingFrame(88, 19);
	public static IncomingFrame CONSOLE_MESSAGE = new IncomingFrame(89, -1);
	public static IncomingFrame CLAN_CHAT_MESSAGE = new IncomingFrame(90, -1);
	public static IncomingFrame aClass420_4614 = new IncomingFrame(91, 3);
	public static IncomingFrame ANIMATION_ON_INTERFACE = new IncomingFrame(92, 8);
	public static IncomingFrame SET_MOUSE = new IncomingFrame(93, -1);
	public static IncomingFrame aClass420_4617 = new IncomingFrame(94, -2);
	public static IncomingFrame aClass420_4618 = new IncomingFrame(95, 1);
	public static IncomingFrame aClass420_4619 = new IncomingFrame(96, 3);
	public static IncomingFrame aClass420_4620 = new IncomingFrame(97, -1);
	public static IncomingFrame aClass420_4621 = new IncomingFrame(98, -2);
	public static IncomingFrame CLAN_CHANNEL = new IncomingFrame(99, -2);
	public static IncomingFrame AUDIO_RESET = new IncomingFrame(100, 0);
	public static IncomingFrame aClass420_4688 = new IncomingFrame(101, 0);
	public static IncomingFrame ROTATE_CAMERA = new IncomingFrame(102, 3);
	public static IncomingFrame REMOVE_OBJECT = new IncomingFrame(103, 2);
	public static IncomingFrame NPC_ON_INTERFACE = new IncomingFrame(104, 8);
	public static IncomingFrame aClass420_4575 = new IncomingFrame(105, 1);
	public static IncomingFrame aClass420_4629 = new IncomingFrame(106, 7);
	public static IncomingFrame aClass420_4595 = new IncomingFrame(107, 10);
	public static IncomingFrame aClass420_4569 = new IncomingFrame(108, 6);
	public static IncomingFrame ITEM_ICOMPONENT = new IncomingFrame(109, 10);
	public static IncomingFrame PROJECTILE_TORSO_FOCUS = new IncomingFrame(110, 18);
	public static IncomingFrame HUD_FLAG = new IncomingFrame(111, 2);
	public static IncomingFrame PROJECTILE_BODY_TARGET = new IncomingFrame(112, 21);
	public static IncomingFrame FRIEND_LIST = new IncomingFrame(113, -2);
	public static IncomingFrame aClass420_4637 = new IncomingFrame(114, 5);
	public static IncomingFrame aClass420_4638 = new IncomingFrame(115, 6);
	public static IncomingFrame SET_NPC_INTERFACE = new IncomingFrame(116, 25);
	public static IncomingFrame aClass420_4640 = new IncomingFrame(117, 4);
	public static IncomingFrame aClass420_4681 = new IncomingFrame(118, -1);
	public static IncomingFrame aClass420_4642 = new IncomingFrame(119, -1);
	public static IncomingFrame aClass420_4643 = new IncomingFrame(120, 6);
	static IncomingFrame aClass420_4644 = new IncomingFrame(121, -2);
	public static IncomingFrame aClass420_4589 = new IncomingFrame(122, 2);
	public static IncomingFrame aClass420_4646 = new IncomingFrame(123, 8);
	public static IncomingFrame ICOMPONENT_SETTINGS = new IncomingFrame(124, 12);
	public static IncomingFrame MOVE_INTERFACE = new IncomingFrame(125, 8);
	public static IncomingFrame aClass420_4649 = new IncomingFrame(126, -2);
	public static IncomingFrame aClass420_4603 = new IncomingFrame(127, 2);
	public static IncomingFrame VAR_2_PACKET = new IncomingFrame(128, 6);
	public static IncomingFrame HINTICON = new IncomingFrame(129, 14);
	public static IncomingFrame OPEN_URL = new IncomingFrame(130, -2);
	public static IncomingFrame GRAND_EXCHANGE = new IncomingFrame(131, 21);
	public static IncomingFrame aClass420_4580 = new IncomingFrame(132, 8);
	public static IncomingFrame aClass420_4656 = new IncomingFrame(133, 1);
	public static IncomingFrame HIDE_ICOMPONENT = new IncomingFrame(134, 5);
	public static IncomingFrame aClass420_4538 = new IncomingFrame(135, 10);
	public static IncomingFrame aClass420_4695 = new IncomingFrame(136, -1);
	public static IncomingFrame aClass420_4660 = new IncomingFrame(137, 3);
	public static IncomingFrame aClass420_4631 = new IncomingFrame(138, -2);
	public static IncomingFrame aClass420_4662 = new IncomingFrame(139, 10);
	public static IncomingFrame SLOT_CONTAINER_UPDATE = new IncomingFrame(140, -2);
	public static IncomingFrame aClass420_4665 = new IncomingFrame(141, -1);
	public static IncomingFrame VAR_1_PACKET = new IncomingFrame(142, 3);
	public static IncomingFrame aClass420_4675 = new IncomingFrame(143, 4);
	public static IncomingFrame aClass420_4667 = new IncomingFrame(144, -1);
	public static IncomingFrame aClass420_4632 = new IncomingFrame(145, 22);
	public static IncomingFrame aClass420_4669 = new IncomingFrame(146, 0);
	public static IncomingFrame RESET_NIS_VARS = new IncomingFrame(147, 0);
	public static IncomingFrame aClass420_4671 = new IncomingFrame(148, 3);
	public static IncomingFrame REFRESH_WORLD_LIST = new IncomingFrame(149, -2);
	public static IncomingFrame LOGOUT = new IncomingFrame(150, 0);
	public static IncomingFrame aClass420_4690 = new IncomingFrame(151, 5);
	public static IncomingFrame aClass420_4686 = new IncomingFrame(152, 4);
	public static IncomingFrame OTHER_PLAYER_ON_INTERFACE = new IncomingFrame(153, 10);
	public static IncomingFrame aClass420_4677 = new IncomingFrame(154, 8);
	public static IncomingFrame aClass420_4550 = new IncomingFrame(155, 1);
	public static IncomingFrame aClass420_4624 = new IncomingFrame(156, 6);
	public static IncomingFrame CHUNK_STREAM = new IncomingFrame(157, 3);
	public static IncomingFrame PLAY_OBJECT_ANIMATION = new IncomingFrame(158, 10);
	public static IncomingFrame aClass420_4682 = new IncomingFrame(159, -1);
	public static IncomingFrame PLAYER_HEAD_ON_INTERFACE = new IncomingFrame(160, 4);
	public static IncomingFrame aClass420_4684 = new IncomingFrame(161, 4);
	public static IncomingFrame aClass420_4685 = new IncomingFrame(162, 1);
	public static IncomingFrame aClass420_4526 = new IncomingFrame(163, 6);
	public static IncomingFrame aClass420_4687 = new IncomingFrame(164, -2);
	public static IncomingFrame FADE_MAP = new IncomingFrame(165, 1);
	public static IncomingFrame aClass420_4612 = new IncomingFrame(166, -1);
	public static IncomingFrame aClass420_4602 = new IncomingFrame(167, 9);
	public static IncomingFrame aClass420_4691 = new IncomingFrame(168, 5);
	public static IncomingFrame aClass420_4692 = new IncomingFrame(169, -2);
	public static IncomingFrame aClass420_4693 = new IncomingFrame(170, 8);
	public static IncomingFrame MODEL_ON_ICOMPONENT = new IncomingFrame(171, 8);
	public static IncomingFrame SET_TILE_INTERFACE = new IncomingFrame(172, 29);
	public static IncomingFrame CONSTRUCTED_MAP = new IncomingFrame(173, -2);
	public static IncomingFrame aClass420_4697 = new IncomingFrame(174, -1);
	public static IncomingFrame aClass420_4532 = new IncomingFrame(175, 9);
	public static IncomingFrame PING_FRAME = new IncomingFrame(176, 0);
	public static IncomingFrame CAMERA_LOOK = new IncomingFrame(177, 6);
	public static IncomingFrame aClass420_4701 = new IncomingFrame(178, 10);
	public static IncomingFrame aClass420_4541 = new IncomingFrame(179, -2);
	public static IncomingFrame DECODE_LOOKS = new IncomingFrame(180, -2);
	public static IncomingFrame LOGOUT_TO_LOBBY = new IncomingFrame(181, 0);
	public static IncomingFrame aClass420_4705 = new IncomingFrame(182, 0);
	public static IncomingFrame aClass420_4706 = new IncomingFrame(183, 4);
	public static IncomingFrame aClass420_4707 = new IncomingFrame(184, -2);
	public static IncomingFrame PLAYER_ON_INTERFACE = new IncomingFrame(185, 5);
	public static IncomingFrame aClass420_4709 = new IncomingFrame(186, -2);
	public static IncomingFrame SET_TARGET = new IncomingFrame(187, 2);
	public static IncomingFrame aClass420_4711 = new IncomingFrame(188, 2);
	public static IncomingFrame aClass420_4712 = new IncomingFrame(189, 3);
	public static IncomingFrame CLAN_INFO = new IncomingFrame(190, -2);
	public static IncomingFrame ADD_GROUND_ITEM = new IncomingFrame(191, 7);
	public static IncomingFrame aClass420_4715 = new IncomingFrame(192, 9);
	public int id;
	public int size;

	IncomingFrame(int var1, int var2) {
		this.id = var1 * -1235690145;
		this.size = var2 * 1666981085;
	}

	public static void method4980(int var0, int var1, float var2, Interface40 var3, byte var4) {
		if (null != Class641.aClass361_8348) {
			Class641.aClass361_8348.method4617((byte) 106).method4577(var0, var1, var2, var3, 1738971127);
		}

	}

	static final void method4981(Class681 var0, byte var1) {
		if (Class380_Sub1.aClass269_10121.method3577(-1965000841) > 0) {
			String var2 = (String) var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
			String var3 = Class380_Sub1.aClass269_10121.method3581(var2, (byte) -13);
			var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3;
		}

	}

	static void method4982(int var0) {
		Class103.anInt1270 = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			Class103.aClass526_Sub36Array1268[var1] = null;
			Class103.aClass526_Sub36Array1264[var1] = null;
			Class103.aByteArray1267[var1] = MovementDirection.WALKING.id;
			Class103.aClass70Array1274[var1] = null;
		}

	}

	public static final Class526_Sub38 method4983(int var0, Class526_Sub38 var1, int[] var2, boolean var3, short var4) {
		Class526_Sub38 var5 = (Class526_Sub38) client.aClass20_11187.get((long) var0);
		if (null != var5) {
			Class710.method8307(var5, var5.anInt10684 * -870147923 != var1.anInt10684 * -870147923, var3, (byte) -103);
		}

		client.aClass20_11187.put(var1, (long) var0);
		Class595.method7043(var1.anInt10684 * -870147923, var2, 675856481);
		InterfaceDef var6 = Class221.method3095(var0, (byte) 70);
		if (null != var6) {
			Class526_Sub31.method9555(var6, (byte) 10);
		}

		if (null != client.aClass245_11213) {
			Class526_Sub31.method9555(client.aClass245_11213, (byte) 10);
			client.aClass245_11213 = null;
		}

		if (var6 != null) {
			Class526_Sub9.method9361(Class315_Sub1.aClass243Array10033[919258769 * var6.uid >>> 16], var6, !var3,
					(byte) 27);
		}

		if (!var3) {
			Class107.method1346(var1.anInt10684 * -870147923, var2, (byte) 109);
		}

		if (!var3 && -1 != client.anInt11186 * -327748687) {
			Class458.method5419(client.anInt11186 * -327748687, 1, (byte) 10);
		}

		return var1;
	}

	static final void method4984(Class681 var0, int var1) {
		Class679 var2 = var0.aBool8628 ? var0.aClass679_8631 : var0.aClass679_8621;
		InterfaceDef var3 = var2.aClass245_8600;
		Class243 var4 = var2.aClass243_8599;
		Class40_Sub17.method10295(var3, var4, var0, 696124212);
	}

	public static OutFrameBuffer method4985(int var0) {
		OutFrameBuffer var1 = Class199_Sub22.method9037(31936227);
		var1.aClass405_10554 = null;
		var1.anInt10559 = 0;
		var1.out = new Buffer(5000);
		return var1;
	}
}
