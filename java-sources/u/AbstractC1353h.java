package u;

/* JADX INFO: renamed from: u.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1353h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f22729a;

    static {
        long[] jArr = M.f22699a;
        int iE = M.e(0);
        int iMax = iE > 0 ? Math.max(7, M.d(iE)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p120l9.l.g0(jArr, -9187201950435737472L);
        }
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        float[] fArr = new float[iMax];
        f22729a = new float[0];
    }
}
