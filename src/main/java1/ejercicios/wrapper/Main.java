package ejercicios.wrapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////////////////////////////////////////////////////////////////////
		
		byte datoByte = 2;// tipo primitivo
		Byte datoByteWrapper = 2;
		;// tipo wrapper
		System.out.println("primitivo " + datoByte);
		System.out.println("Wrapper " + datoByteWrapper);
		// convertido byte
		byte datoByte1 = 4;
		Byte datoConvertido = datoByte1;
		System.out.println("convertido byte " + datoConvertido);
		// conversion 2
		Byte datoConvertido2 = 20;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println(" short byte " + datoByte2);
		
		//////////////////////////////////////////////////////////////////////////

		short datoShort = 1;// tipo primitivo
		Short datoShortWrapper = 1;// tipo wrapper
		System.out.println("primitivo " + datoShort);
		System.out.println("Wrapper " + datoShortWrapper);
		// conversiones short
		short datoShort1 = 15;
		Short datoConvertidoS = datoShort1;
		System.out.println("convertido short " + datoConvertidoS);
		// conversion 2
		Short datoConvertido4 = 2;
		short datoShort2 = datoConvertido4.shortValue();
		System.out.println(" short convertido " + datoShort2);
		
		////////////////////////////////////////////////////////////////////////////

		int edad = 40;// tipo primitivo
		Integer edadwrapper = 48;// tipo wrapper
		System.out.println("primitivo " + edad);
		System.out.println("Wrapper " + edadwrapper);
		// conversiones int
		int datoint1 = 4;
		Integer datoConvertido3 = datoint1;
		System.out.println("convertido byte " + datoConvertido4);
		//// conversion 2
		Integer datoConvertido0 = 20;
		int datoint2 = datoConvertido0.intValue();
		System.out.println(" int convertido " + datoint2);

		///////////////////////////////////////////////////////////////////////////
		long valorGrande = 125L;// tipo primitivo
		Long valorGrandeWrapper = 12346L;// tipo wrapper
		System.out.println("primitivo " + valorGrande);
		System.out.println("Wrapper " + valorGrandeWrapper);
		// conversiones long
		long datoLong2 = 4;
		Long datoConvertido5 = datoLong2;
		System.out.println("convertido long " + datoConvertido5);
		// conversion 2
		Long datoConvertido12 = 20L;
		long datoLong1 = datoConvertido12.longValue();
		System.out.println(" long convertido " + datoLong1);

		///////////////////////////////////////////////////////////////////////////
		boolean N = true;// tipo primitivo
		Boolean MWrapper = false;// tipo wrapper
		System.out.println("primitivo " + N);
		System.out.println("Wrapper " + MWrapper);
		// conversiones boolean
		boolean datoBooleano = true;
		Boolean datoConvertido6 = datoBooleano;
		System.out.println("convertido boolean " + datoConvertido6);
		// conversion 2
		Boolean datoConvertido13 = true;
		boolean datoBooleano1 = datoConvertido13.booleanValue();
		System.out.println("convertido boolean " + datoBooleano1);

		///////////////////////////////////////////////////////////////////////////

		float flotante = 1.4f;// tipo primitivo
		Float flotanteWrapper = 1.52f;// tipo wrapper
		System.out.println("primitivo " + flotante);
		System.out.println("Wrapper " + flotanteWrapper);
		// conversiones float
		float datoFlotante = 1.255f;
		Float datoConvertido7 = datoFlotante;
		System.out.println("convertido float " + datoConvertido7);
		// conversion 2
		Float datoConvertido14 = 1.25f;
		float datoFlotante1 = datoConvertido14.floatValue();
		System.out.println("convertido float " + datoFlotante1);

		//////////////////////////////////////////////////////////////////////////

		double double1 = 1.234;// tipo primitivo
		Double double1Wrapper = 15.255;// tipo wrapper
		System.out.println("primitivo " + double1);
		System.out.println("Wrapper " + double1Wrapper);
		// conversiones float
		double datoDouble = 1.255;
		Double datoConvertido8 = datoDouble;
		System.out.println("convertido double " + datoConvertido8);
		// conversion 2
		Double datoConvertido15 = 1.25;
		double datoDouble1 = datoConvertido15.doubleValue();
		System.out.println("convertido double " + datoDouble1);
		
		/////////////////////////////////////////////////////////////////////////

		char M = 'd';// tipo primitivo
		Character JWrapper = 'R';// tipo wrapper
		System.out.println("primitivo " + M);
		System.out.println("Wrapper " + JWrapper);
		// conversiones char
		char datoChar = 'w';
		Character datoConvertido9 = datoChar;
		System.out.println("convertido char " + datoConvertido9);
		// conversion 2
		Character datoConvertido16 = 'e';
		char datoChar1 = datoConvertido16.charValue();
		System.out.println("convertido char " + datoChar1);
	}

}
