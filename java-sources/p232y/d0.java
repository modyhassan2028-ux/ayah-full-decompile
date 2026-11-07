package p232y;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends b0 {
    @Override // p232y.b0, p232y.Z
    public final void a(long j, long j10) {
        if (!Float.isNaN(Float.NaN)) {
            this.f24477a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            this.f24477a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            this.f24477a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
