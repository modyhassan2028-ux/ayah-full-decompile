package D0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1137f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1139i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f1144o;

    public v(long j, long j10, long j11, boolean z10, float f3, long j12, long j13, boolean z11, boolean z12, int i10, long j14) {
        this.f1132a = j;
        this.f1133b = j10;
        this.f1134c = j11;
        this.f1135d = z10;
        this.f1136e = f3;
        this.f1137f = j12;
        this.g = j13;
        this.f1138h = z11;
        this.f1139i = i10;
        this.j = j14;
        this.f1141l = 0L;
        this.f1142m = z12;
        this.f1143n = z12;
    }

    public final void a() {
        v vVar = this.f1144o;
        if (vVar == null) {
            this.f1142m = true;
            this.f1143n = true;
        } else if (vVar != null) {
            vVar.a();
        }
    }

    public final boolean b() {
        v vVar = this.f1144o;
        if (vVar != null) {
            return vVar.b();
        }
        return this.f1142m || this.f1143n;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f1132a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f1133b);
        sb.append(", position=");
        sb.append((Object) p171r0.c.j(this.f1134c));
        sb.append(", pressed=");
        sb.append(this.f1135d);
        sb.append(", pressure=");
        sb.append(this.f1136e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f1137f);
        sb.append(", previousPosition=");
        sb.append((Object) p171r0.c.j(this.g));
        sb.append(", previousPressed=");
        sb.append(this.f1138h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f1139i;
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
        sb.append(", historical=");
        Object obj = this.f1140k;
        if (obj == null) {
            obj = p120l9.r.f19440r;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) p171r0.c.j(this.j));
        sb.append(')');
        return sb.toString();
    }

    public v(long j, long j10, long j11, boolean z10, float f3, long j12, long j13, boolean z11, int i10, ArrayList arrayList, long j14, long j15) {
        this(j, j10, j11, z10, f3, j12, j13, z11, false, i10, j14);
        this.f1140k = arrayList;
        this.f1141l = j15;
    }
}
