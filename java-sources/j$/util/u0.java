package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f18605a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f18606b = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p0 f18607c = new p0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f18608d = new n0();

    public static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }
}
