package L2;

import E2.C0140p;
import H9.p;
import com.google.android.gms.internal.measurement.B1;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import p120l9.m;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f5489d;

    public i(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        j.e(abstractSet, "foreignKeys");
        this.f5486a = str;
        this.f5487b = map;
        this.f5488c = abstractSet;
        this.f5489d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f5486a.equals(iVar.f5486a) || !this.f5487b.equals(iVar.f5487b) || !j.a(this.f5488c, iVar.f5488c)) {
            return false;
        }
        Set set2 = this.f5489d;
        if (set2 == null || (set = iVar.f5489d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f5488c.hashCode() + ((this.f5487b.hashCode() + (this.f5486a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f5486a);
        sb.append("',\n            |    columns = {");
        sb.append(B1.x(m.y0(this.f5487b.values(), new C0140p(5))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(B1.x(this.f5488c));
        sb.append("\n            |    indices = {");
        Set set = this.f5489d;
        sb.append(B1.x(set != null ? m.y0(set, new C0140p(6)) : r.f19440r));
        sb.append("\n            |}\n        ");
        return p.J0(sb.toString());
    }
}
