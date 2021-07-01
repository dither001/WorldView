package main;

/*
 * Based directly upon the TimeUnit class from the *.time package.
 */
public enum LengthUnit {

	NANOMETERS(LengthUnit.NANO_SCALE), 
	MILLIMETERS(LengthUnit.MILLI_SCALE), 
	METERS(LengthUnit.METER_SCALE),
	KILOMETERS(LengthUnit.KILO_SCALE);

	private static final long NANO_SCALE = 1L;
	private static final long MICRO_SCALE = 1000L * NANO_SCALE;
	private static final long MILLI_SCALE = 1000L * MICRO_SCALE;
	private static final long METER_SCALE = 1000L * MILLI_SCALE;
	private static final long KILO_SCALE = 1000L * METER_SCALE;

	private final long scale;
	private final long maxNanos;
//    private final long maxMicros;
	private final long maxMillis;
	private final long maxMeters;
//	private final long microRatio;
	private final int milliRatio; // fits in 32 bits
	private final int meterRatio; // fits in 32 bits

	private LengthUnit(long s) {
		this.scale = s;
		this.maxNanos = Long.MAX_VALUE / s;
//		long ur = (s >= MICRO_SCALE) ? (s / MICRO_SCALE) : (MICRO_SCALE / s);
//		this.microRatio = ur;
//        this.maxMicros = Long.MAX_VALUE / ur;
		long mr = (s >= MILLI_SCALE) ? (s / MILLI_SCALE) : (MILLI_SCALE / s);
		this.milliRatio = (int) mr;
		this.maxMillis = Long.MAX_VALUE / mr;
		long sr = (s >= METER_SCALE) ? (s / METER_SCALE) : (METER_SCALE / s);
		this.meterRatio = (int) sr;
		this.maxMeters = Long.MAX_VALUE / sr;
	}
}
