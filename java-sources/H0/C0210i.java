package H0;

/* JADX INFO: renamed from: H0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0210i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3202a;

    public long a(long j, long j10) {
        float fMin = Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L);
        int i10 = Z.f3181a;
        return jFloatToRawIntBits;
    }

    public String toString() {
        switch (this.f3202a) {
            case 2:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
