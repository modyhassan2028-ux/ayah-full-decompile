package R1;

import J1.g;
import R7.f;
import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f7196a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f7197b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f7199d;

    public b(boolean z10, f fVar) {
        this.f7198c = z10;
        this.f7199d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f7199d.getClass();
        Rect rect = this.f7196a;
        ((g) obj).f(rect);
        Rect rect2 = this.f7197b;
        ((g) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.f7198c;
        if (i12 < i13) {
            return z10 ? 1 : -1;
        }
        if (i12 > i13) {
            return z10 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z10 ? 1 : -1;
        }
        if (i16 > i17) {
            return z10 ? -1 : 1;
        }
        return 0;
    }
}
