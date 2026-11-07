package p214w;

import p223x.InterfaceC1435y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1435y f23444a;

    public I(InterfaceC1435y interfaceC1435y) {
        this.f23444a = interfaceC1435y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return Float.compare(0.0f, 0.0f) == 0 && j.a(this.f23444a, ((I) obj).f23444a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23444a.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f23444a + ')';
    }
}
