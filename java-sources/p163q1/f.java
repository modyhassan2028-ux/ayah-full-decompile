package p163q1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f21258d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21260f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f21255a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21256b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21257c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21259e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21261h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f21262i = null;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f21263k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f21264l = new ArrayList();

    public f(m mVar) {
        this.f21258d = mVar;
    }

    @Override // p163q1.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f21264l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (!((f) obj).j) {
                return;
            }
        }
        this.f21257c = true;
        m mVar = this.f21255a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f21256b) {
            this.f21258d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.j) {
            g gVar = this.f21262i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f21260f = this.f21261h * gVar.g;
                }
            }
            d(fVar.g + this.f21260f);
        }
        m mVar2 = this.f21255a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(m mVar) {
        this.f21263k.add(mVar);
        if (this.j) {
            mVar.a(mVar);
        }
    }

    public final void c() {
        this.f21264l.clear();
        this.f21263k.clear();
        this.j = false;
        this.g = 0;
        this.f21257c = false;
        this.f21256b = false;
    }

    public void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i10;
        ArrayList arrayList = this.f21263k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21258d.f21272b.f20870Y);
        sb.append(":");
        switch (this.f21259e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f21264l.size());
        sb.append(":d=");
        sb.append(this.f21263k.size());
        sb.append(">");
        return sb.toString();
    }
}
