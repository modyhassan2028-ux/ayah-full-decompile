package p072ga;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f16363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f16364f;
    public final AbstractC0813f2 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f16365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p083ha.b f16366i;

    public b(int i10, float f3, float f7, List list, List list2, List list3, AbstractC0813f2 abstractC0813f2, g gVar, p083ha.b bVar) {
        this.f16359a = i10;
        this.f16360b = f3;
        this.f16361c = f7;
        this.f16362d = list;
        this.f16363e = list2;
        this.f16364f = list3;
        this.g = abstractC0813f2;
        this.f16365h = gVar;
        this.f16366i = bVar;
    }

    public static b a(b bVar, int i10, float f3, float f7, ArrayList arrayList, p083ha.b bVar2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = bVar.f16359a;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            f3 = bVar.f16360b;
        }
        return new b(i12, f3, (i11 & 8) != 0 ? bVar.f16361c : f7, bVar.f16362d, bVar.f16363e, (i11 & 128) != 0 ? bVar.f16364f : arrayList, bVar.g, bVar.f16365h, (i11 & 8192) != 0 ? bVar.f16366i : bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16359a == bVar.f16359a && Float.compare(this.f16360b, bVar.f16360b) == 0 && Float.compare(this.f16361c, bVar.f16361c) == 0 && Float.compare(0.9f, 0.9f) == 0 && this.f16362d.equals(bVar.f16362d) && this.f16363e.equals(bVar.f16363e) && this.f16364f.equals(bVar.f16364f) && this.g.equals(bVar.g) && this.f16365h.equals(bVar.f16365h) && this.f16366i.equals(bVar.f16366i);
    }

    public final int hashCode() {
        return this.f16366i.hashCode() + ((this.f16365h.hashCode() + ((this.g.hashCode() + ((((((this.f16364f.hashCode() + ((this.f16363e.hashCode() + ((this.f16362d.hashCode() + c.n(c.n(c.n((8370 + this.f16359a) * 31, this.f16360b, 31), this.f16361c, 31), 0.9f, 31)) * 31)) * 31)) * 31) + ((int) 2000)) * 31) + 1) * 31)) * 961)) * 31);
    }

    public final String toString() {
        return "Party(angle=270, spread=" + this.f16359a + ", speed=" + this.f16360b + ", maxSpeed=" + this.f16361c + ", damping=0.9, size=" + this.f16362d + ", colors=" + this.f16363e + ", shapes=" + this.f16364f + ", timeToLive=2000, fadeOutEnabled=true, position=" + this.g + ", delay=0, rotation=" + this.f16365h + ", emitter=" + this.f16366i + ")";
    }
}
