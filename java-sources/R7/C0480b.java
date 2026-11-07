package R7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: R7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0480b implements InterfaceC0482d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0482d f7288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7289b;

    public C0480b(float f3, InterfaceC0482d interfaceC0482d) {
        while (interfaceC0482d instanceof C0480b) {
            interfaceC0482d = ((C0480b) interfaceC0482d).f7288a;
            f3 += ((C0480b) interfaceC0482d).f7289b;
        }
        this.f7288a = interfaceC0482d;
        this.f7289b = f3;
    }

    @Override // R7.InterfaceC0482d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f7288a.a(rectF) + this.f7289b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0480b)) {
            return false;
        }
        C0480b c0480b = (C0480b) obj;
        return this.f7288a.equals(c0480b.f7288a) && this.f7289b == c0480b.f7289b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7288a, Float.valueOf(this.f7289b)});
    }
}
