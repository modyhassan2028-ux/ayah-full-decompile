package J0;

/* JADX INFO: renamed from: J0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279d implements I0.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4061r;

    public static final int a(long j, int i10) {
        int i11 = A0.f3874b;
        return ((int) (j >> (i10 * 15))) & 32767;
    }

    public static long c(int i10, int i11, int i12, int i13) {
        return (((long) (i11 & 32767)) << 15) | ((long) (i10 & 32767)) | (((long) (i12 & 32767)) << 30) | (((long) (i13 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [y9.a, z9.k] */
    @Override // I0.e
    public Object Z(I0.f fVar) {
        return fVar.f3661a.invoke();
    }

    public int b() {
        switch (this.f4061r) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }
}
