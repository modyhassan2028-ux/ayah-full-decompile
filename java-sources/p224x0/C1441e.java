package p224x0;

import G0.a;
import java.util.ArrayList;
import p123m2.c;
import p180s0.L;
import p180s0.q;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1441e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24210f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24212i;
    public final C1440d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24213k;

    public C1441e(String str, float f3, float f7, float f10, float f11, long j, int i10, boolean z10, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        long j10 = (i11 & 32) != 0 ? q.g : j;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        this.f24205a = str;
        this.f24206b = f3;
        this.f24207c = f7;
        this.f24208d = f10;
        this.f24209e = f11;
        this.f24210f = j10;
        this.g = i12;
        this.f24211h = z10;
        ArrayList arrayList = new ArrayList();
        this.f24212i = arrayList;
        C1440d c1440d = new C1440d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = c1440d;
        arrayList.add(c1440d);
    }

    public static void a(C1441e c1441e, ArrayList arrayList, L l10) {
        if (c1441e.f24213k) {
            a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C1440d) c.q(1, c1441e.f24212i)).j.add(new J("", arrayList, 0, l10, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C1442f b() {
        if (this.f24213k) {
            a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f24212i;
            if (arrayList.size() <= 1) {
                C1440d c1440d = this.j;
                C1442f c1442f = new C1442f(this.f24205a, this.f24206b, this.f24207c, this.f24208d, this.f24209e, new F(c1440d.f24197a, c1440d.f24198b, c1440d.f24199c, c1440d.f24200d, c1440d.f24201e, c1440d.f24202f, c1440d.g, c1440d.f24203h, c1440d.f24204i, c1440d.j), this.f24210f, this.g, this.f24211h);
                this.f24213k = true;
                return c1442f;
            }
            if (this.f24213k) {
                a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C1440d c1440d2 = (C1440d) arrayList.remove(arrayList.size() - 1);
            ((C1440d) c.q(1, arrayList)).j.add(new F(c1440d2.f24197a, c1440d2.f24198b, c1440d2.f24199c, c1440d2.f24200d, c1440d2.f24201e, c1440d2.f24202f, c1440d2.g, c1440d2.f24203h, c1440d2.f24204i, c1440d2.j));
        }
    }
}
