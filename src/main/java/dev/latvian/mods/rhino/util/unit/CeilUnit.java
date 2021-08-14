package dev.latvian.mods.rhino.util.unit;

public class CeilUnit extends Func1Unit {
	public static int ceil(float f) {
		int i = (int) f;
		return f > (float) i ? i + 1 : i;
	}

	public CeilUnit(Unit u) {
		super(u);
	}

	@Override
	public float get() {
		return ceil(unit.get());
	}

	@Override
	public String toString() {
		return fString("ceil", unit);
	}
}