package R7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: R7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0479a implements InterfaceC0482d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7287a;

    public C0479a(float f3) {
        this.f7287a = f3;
    }

    @Override // R7.InterfaceC0482d
    public final float a(RectF rectF) {
        return this.f7287a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0479a) && this.f7287a == ((C0479a) obj).f7287a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f7287a)});
    }
}
