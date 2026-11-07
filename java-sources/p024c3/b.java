package p024c3;

import android.graphics.Rect;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13447d;

    public b(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f13444a = i10;
        this.f13445b = i11;
        this.f13446c = i12;
        this.f13447d = i13;
    }

    public final Rect a() {
        return new Rect(this.f13444a, this.f13445b, this.f13446c, this.f13447d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) obj;
        return this.f13444a == bVar.f13444a && this.f13445b == bVar.f13445b && this.f13446c == bVar.f13446c && this.f13447d == bVar.f13447d;
    }

    public final int hashCode() {
        return (((((this.f13444a * 31) + this.f13445b) * 31) + this.f13446c) * 31) + this.f13447d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f13444a);
        sb.append(',');
        sb.append(this.f13445b);
        sb.append(',');
        sb.append(this.f13446c);
        sb.append(',');
        return a.E(sb, this.f13447d, "] }");
    }
}
