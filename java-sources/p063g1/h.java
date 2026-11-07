package p063g1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }
}
