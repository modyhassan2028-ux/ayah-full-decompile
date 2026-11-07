package u;

/* JADX INFO: renamed from: u.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1354i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f22730a = new s(0);

    public static final s a(int... iArr) {
        s sVar = new s(iArr.length);
        int i10 = sVar.f22758b;
        if (i10 < 0) {
            p204v.a.d("");
            throw null;
        }
        if (iArr.length == 0) {
            return sVar;
        }
        sVar.b(iArr.length + i10);
        int[] iArr2 = sVar.f22757a;
        int i11 = sVar.f22758b;
        if (i10 != i11) {
            p120l9.l.W(iArr.length + i10, i10, i11, iArr2, iArr2);
        }
        p120l9.l.a0(i10, 0, 12, iArr, iArr2);
        sVar.f22758b += iArr.length;
        return sVar;
    }
}
