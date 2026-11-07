package R7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: R7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0481c implements InterfaceC0482d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7290a;

    public C0481c(float f3) {
        this.f7290a = f3;
    }

    @Override // R7.InterfaceC0482d
    public final float a(RectF rectF) {
        return Math.min(this.f7290a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0481c) && this.f7290a == ((C0481c) obj).f7290a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f7290a)});
    }
}
