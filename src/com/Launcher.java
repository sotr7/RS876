package com;

import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Launcher extends Applet implements AppletStub {

	/**
	 * @author: Kyle Friz
	 * @author: Allen Kinzalow
	 * @author: Major
	 * @author: Pax M
	 */

	/**
	 * An generated serial UID.
	 */
	private static final long serialVersionUID = 1670498001014004354L;

	/**
	 * Gson.
	 */
	private static Gson gson;

	/**
	 * Reader.
	 */
	private static BufferedReader reader;

	/**
	 * JsonObject.
	 */
	private static JsonObject jsonObject;

	/**
	 * Web reader.
	 */
	private static BufferedReader webReader;

	/**
	 * WebJsonObject.
	 */
	private static JsonObject webJsonObject;

	/**
	 * Path location
	 */
	private static String location = System.getProperty("user.home")
			+ "/jagexcache/nocturne/properties.json";

	/**
	 * Connecting to Nocturne or localhost
	 */
	public static boolean connectNocturne = true;

	/**
	 * Selects the IP
	 */
	public static String HOST_ADDRESS = connectNocturne ? "192.99.38.108"
			: "127.0.0.1";

	/**
	 * Whether or not to dump info such as vars
	 */
	public static boolean DUMP = !connectNocturne;

	/**
	 * The parameters of the client.
	 */
	private Properties map = new Properties();

	/**
	 * The current frame of the client application.
	 */
	public JFrame nocturneFrame = null;

	/**
	 * The main entry point of the current application.
	 * 
	 * @param args
	 *            The command line arguments.
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public static void main(String... args) throws MalformedURLException,
			IOException {
		gson = new GsonBuilder().setLenient().create();
		if (!new File(location).exists())
			createProperties(true);
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(location)));
			jsonObject = gson.fromJson(reader, JsonObject.class);

			webReader = new BufferedReader(new InputStreamReader(new URL(
					"http://nocturne3.org/configuration.json").openStream()));
			webJsonObject = gson.fromJson(webReader, JsonObject.class);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error loading properties");
		}
		Launcher nocturne = new Launcher();
		if (jsonObject.get("firstTime").getAsBoolean())
			createProperties(false);
		nocturne.setParamters();
		nocturne.openFrame();
		nocturne.startClient();
		nocturne.nocturneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InputStream imageStream = Launcher.class
				.getResourceAsStream("favicon.png");
		BufferedImage bufferedImage = ImageIO.read(imageStream);
		nocturne.nocturneFrame.setIconImage(bufferedImage);
		nocturne.nocturneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Starts the actual client.
	 */
	private void startClient() {
		try {
			Class<?> client_class = Class.forName("com.jagex.client");

			Object v_client = client_class.getConstructor().newInstance();
			client_class.getSuperclass()
					.getMethod("supplyApplet", Applet.class)
					.invoke(v_client, this);
			client_class.getMethod("init").invoke(v_client);
			client_class.getMethod("start").invoke(v_client);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create properties
	 *
	 * @param b
	 * @throws IOException
	 */
	private static void createProperties(boolean b) throws IOException {
		new File(System.getProperty("user.home") + "/jagexcache/nocturne")
				.mkdirs();
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(location), "utf-8"))) {
			writer.write("/* Copyright © 2017 Nocturne */\n");
			writer.write("/* @author: Pax M */\n");
			writer.write("/* These are the the variables that changes the gameplay, please don't modify these */\n");
			writer.write("");
			writer.write("{\n");
			writer.write("	/* Whetever or not the message to login using your forum credentials is active or not */\n");
			writer.write("	\"firstTime\": " + b + ",\n\n");
			writer.write("	/* The current version of the client and cache */\n");
			writer.write("	\"version\": "
					+ webJsonObject.get("version").getAsDouble() + "\n");
			writer.write("}");
			System.out.println("Successfully created properties.json (" + b
					+ ")");
		}
	}

	/**
	 * Opens the actual frame application.
	 */
	private void openFrame() throws IOException {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth() / 2 + 100;
		int height = gd.getDisplayMode().getHeight() - 150;

		nocturneFrame = new JFrame("Nocturne - 876");
		nocturneFrame.add(this);
		nocturneFrame.setVisible(true);
		nocturneFrame.setMinimumSize(new Dimension(width / 2, height / 2));
		nocturneFrame.setSize(new Dimension(width, height));
		nocturneFrame.setLocationRelativeTo(null);
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 * 
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	private void setParamters() throws MalformedURLException, IOException {
		map.put("44", "43594");
		map.put("45", ".runescape.com");
		map.put("46", "1016377029");
		map.put("47", "true");
		map.put("48", HOST_ADDRESS);
		map.put("49", "0");
		map.put("50", "43594");
		map.put("51", "43594");
		map.put("52", "43594");
		map.put("10", "http://" + HOST_ADDRESS);
		map.put("11", "");
		map.put("12",
				"halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
		map.put("13", "0");
		map.put("14", "http://" + HOST_ADDRESS);
		map.put("15", "");
		map.put("-1", "N485gvjJSjUF06hj3*AiQA");
		map.put("17", "0");
		map.put("18", "1");
		map.put("0", "d6EmilV2mm9Qh2E1YQJU*w");
		map.put("1", "true");
		map.put("2", "1200");
		map.put("3", "Ymi9Liy-EKAQPDzvIFDOawIZao205SgIjSoemJvZ5wo");
		map.put("4", "43594");
		map.put("5", "false");
		map.put("6", HOST_ADDRESS);
		map.put("7", "225");
		map.put("8", "true");
		map.put("9", "43594");
		map.put("20", "0");
		map.put("22", "fngDR7vSeguoCXAGiQM*DFVGv6SrfUbb");
		map.put("23", "1241012674");
		map.put("25", "false");
		map.put("26", HOST_ADDRESS);
		map.put("27", "0");
		map.put("28", "0");
		map.put("29", "false");
		map.put("30",
				"3F110CFC079B70003DDFA581F69AF06E8D34A1418C593CC61BBE7C986041C46BC75A1074E9BCBCC0C15E5034192981D2");
		map.put("31", "15493010");
		map.put("32",
				"http://services.runescape.com/m=gamelogspecs/clientstats?data=");
		map.put("33", "43594");
		map.put("34", "");
		map.put("35", "0");
		map.put("36", "1140");
		map.put("37", "0");
		map.put("38", "43594");
		map.put("39", "57027");
		map.put("40", "false");
		map.put("41", "0");
		map.put("42", "");
		map.put("43", "false");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String paramName) {
		return (String) map.get(paramName);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://" + HOST_ADDRESS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + HOST_ADDRESS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static BigInteger getUpdateModulus() {
		return new BigInteger(
				"7871143687424538864202557352915826277422468068412262873090751715633185803551126047872098304035825036280420995543699421150200902637147867439970995255532811");
	}

	public static BigInteger getUpdateExponent() {
		return new BigInteger("65537");
	}

	public static BigInteger getLoginModulus() {
		return new BigInteger(
				"7871143687424538864202557352915826277422468068412262873090751715633185803551126047872098304035825036280420995543699421150200902637147867439970995255532811");
	}

	public static BigInteger getLoginExponent() {
		return new BigInteger("65537");
	}

	public final class InnerPackDecrypter implements Closeable {

		/**
		 * The key returned if an empty (i.e. {@code length == 0} string is
		 * decrypted.
		 */
		private final byte[] EMPTY_KEY = new byte[0];

		/**
		 * The encoded secret key for the AES block cipher.
		 */
		private final String encodedSecret;

		/**
		 * The encoded initialisation vector for the AES block cipher.
		 */
		private final String encodedVector;

		/**
		 * The input stream to the {@code inner.pack.gz} file.
		 */
		private final InputStream input;

		/**
		 * The gamepack jar file.
		 */
		private final JarFile jar;

		/**
		 * Creates the inner pack decrypter.
		 *
		 * @param gamepack
		 *            The {@link Path} to the gamepack jar.
		 * @param secret
		 *            The encoded secret key.
		 * @param vector
		 *            The encoded initialisation vector.
		 * @throws IOException
		 *             If the path to the gamepack is invalid.
		 */
		public InnerPackDecrypter(String gamePack, String secret, String vector)
				throws IOException {
			this.encodedSecret = secret;
			this.encodedVector = vector;
			this.jar = new JarFile(new File(gamePack));

			ZipEntry archive = jar.getEntry("inner.pack.gz");
			this.input = new BufferedInputStream(jar.getInputStream(archive));
		}

		@Override
		public void close() throws IOException {
			input.close();
			jar.close();
		}

		/**
		 * Decrypts the {@code inner.pack.gz} archive using the AES cipher. The
		 * decrypted data is then un-gzipped and unpacked from the pack200
		 * format, before finally being split into a {@link ByteBuffer} per
		 * class. The data is then returned as a {@link Map} of class names to
		 * byte buffers.
		 *
		 * @return The map of class names to the byte buffers containing their
		 *         data.
		 * @throws NoSuchAlgorithmException
		 *             If the current system does not have an AES
		 *             implementation.
		 * @throws NoSuchPaddingException
		 *             If the current system does not support the specified
		 *             padding scheme.
		 * @throws InvalidKeyException
		 *             If the secret key is invalid.
		 * @throws InvalidAlgorithmParameterException
		 *             If the initialisation vector is invalid.
		 * @throws IOException
		 *             If there is an error reading from or writing to any of
		 *             the various streams used.
		 * @throws IllegalBlockSizeException
		 *             If AES is unable to process the input data provided.
		 * @throws BadPaddingException
		 *             If the data lacks the appropriate padding bytes.
		 */
		public Map<String, ByteBuffer> decrypt()
				throws NoSuchAlgorithmException, NoSuchPaddingException,
				InvalidKeyException, InvalidAlgorithmParameterException,
				IOException, IllegalBlockSizeException, BadPaddingException {
			int secretKeySize = getKeySize(encodedSecret.length());
			int vectorSize = getKeySize(encodedVector.length());

			byte[] secretKey = secretKeySize == 0 ? EMPTY_KEY : decodeBase64(
					encodedSecret, secretKeySize);
			byte[] initialisationVector = vectorSize == 0 ? EMPTY_KEY
					: decodeBase64(encodedVector, vectorSize);

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec secret = new SecretKeySpec(secretKey, "AES");
			IvParameterSpec vector = new IvParameterSpec(initialisationVector);

			// Initialise the cipher.
			cipher.init(Cipher.DECRYPT_MODE, secret, vector);

			byte[] buffer = new byte[5 * 1024 * 1024];
			int read = 0, in = 0;

			while (read < buffer.length
					&& (in = input.read(buffer, read, buffer.length - read)) != -1) {
				read += in;
			}

			System.out.println("Decrypting the archive.");

			// Decrypt the inner.pack.gz file.
			byte[] decrypted = cipher.doFinal(buffer, 0, read);
			ByteArrayOutputStream bos = new ByteArrayOutputStream(
					5 * 1024 * 1024);

			// Un-gzip and unpack the jar file contained in the archive, and
			// write the decompressed data out.
			try (JarOutputStream jos = new JarOutputStream(bos);
					GZIPInputStream gzip = new GZIPInputStream(
							new ByteArrayInputStream(decrypted))) {
				Pack200.newUnpacker().unpack(gzip, jos);
			}

			Map<String, ByteBuffer> classes = new HashMap<>();

			// Iterate through the jar entries from the stream, read and wrap
			// them, and add them to the map.
			try (JarInputStream jis = new JarInputStream(
					new ByteArrayInputStream(bos.toByteArray()))) {
				for (JarEntry entry = jis.getNextJarEntry(); entry != null; entry = jis
						.getNextJarEntry()) {
					String name = entry.getName();
					if (!name.endsWith(".class")) {
						System.out.println(name);
						continue;
					}

					read = in = 0;
					while (read < buffer.length
							&& (in = jis.read(buffer, read, buffer.length
									- read)) != -1) {
						read += in;
					}

					ByteBuffer data = ByteBuffer.allocate(read);
					data.put(buffer, 0, read).flip();
					classes.put(name, data);
				}
			}

			return classes;
		}

		/**
		 * Decodes the base64 string into a valid secret key or initialisation
		 * vector.
		 *
		 * @param string
		 *            The string.
		 * @param size
		 *            The size of the key, in bytes.
		 * @return The key, as a byte array.
		 */
		private byte[] decodeBase64(String string, int size) {
			// JaGex's implementation uses * and - instead of + and /, so
			// replace them.
			String valid = string.replaceAll("\\*", "\\+").replaceAll("-", "/");
			return Base64.getDecoder().decode(valid);
		}

		/**
		 * Gets the key size for a string of the specified length.
		 *
		 * @param length
		 *            The length of the string.
		 * @return The key size.
		 */
		private int getKeySize(int length) {
			if (length == 0) {
				return 0;
			}

			return 3 * (int) Math.floor((length - 1) / 4) + 1;
		}

	}

}
