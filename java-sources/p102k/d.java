package p102k;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f18859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18861c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        int i10 = (int) ((f3 * this.f18861c) + 0.5f);
        int i11 = this.f18860b;
        int[] iArr = this.f18859a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.f18861c : 0.0f);
    }
}
