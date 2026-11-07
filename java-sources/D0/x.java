package D0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1153f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1155i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f1156k;

    public x(long j, long j10, long j11, long j12, boolean z10, float f3, int i10, boolean z11, ArrayList arrayList, long j13, long j14) {
        this.f1148a = j;
        this.f1149b = j10;
        this.f1150c = j11;
        this.f1151d = j12;
        this.f1152e = z10;
        this.f1153f = f3;
        this.g = i10;
        this.f1154h = z11;
        this.f1155i = arrayList;
        this.j = j13;
        this.f1156k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return u.d(this.f1148a, xVar.f1148a) && this.f1149b == xVar.f1149b && p171r0.c.b(this.f1150c, xVar.f1150c) && p171r0.c.b(this.f1151d, xVar.f1151d) && this.f1152e == xVar.f1152e && Float.compare(this.f1153f, xVar.f1153f) == 0 && this.g == xVar.g && this.f1154h == xVar.f1154h && this.f1155i.equals(xVar.f1155i) && p171r0.c.b(this.j, xVar.j) && p171r0.c.b(this.f1156k, xVar.f1156k);
    }

    public final int hashCode() {
        long j = this.f1148a;
        long j10 = this.f1149b;
        return p171r0.c.f(this.f1156k) + ((p171r0.c.f(this.j) + ((this.f1155i.hashCode() + ((((p123m2.c.n((((p171r0.c.f(this.f1151d) + ((p171r0.c.f(this.f1150c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31) + (this.f1152e ? 1231 : 1237)) * 31, this.f1153f, 31) + this.g) * 31) + (this.f1154h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f1148a + ')'));
        sb.append(", uptime=");
        sb.append(this.f1149b);
        sb.append(", positionOnScreen=");
        sb.append((Object) p171r0.c.j(this.f1150c));
        sb.append(", position=");
        sb.append((Object) p171r0.c.j(this.f1151d));
        sb.append(", down=");
        sb.append(this.f1152e);
        sb.append(", pressure=");
        sb.append(this.f1153f);
        sb.append(", type=");
        int i10 = this.g;
        if (i10 == 1) {
            str = "Touch";
        } else if (i10 == 2) {
            str = "Mouse";
        } else if (i10 != 3) {
            str = i10 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", activeHover=");
        sb.append(this.f1154h);
        sb.append(", historical=");
        sb.append(this.f1155i);
        sb.append(", scrollDelta=");
        sb.append((Object) p171r0.c.j(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) p171r0.c.j(this.f1156k));
        sb.append(')');
        return sb.toString();
    }
}
