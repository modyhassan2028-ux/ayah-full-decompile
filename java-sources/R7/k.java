package R7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0482d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7336a;

    public k(float f3) {
        this.f7336a = f3;
    }

    @Override // R7.InterfaceC0482d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f7336a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f7336a == ((k) obj).f7336a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f7336a)});
    }
}
