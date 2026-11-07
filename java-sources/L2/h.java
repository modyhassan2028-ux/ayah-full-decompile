package L2;

import H9.p;
import H9.v;
import java.util.ArrayList;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5485d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public h(String str, boolean z10, List list, List list2) {
        j.e(str, "name");
        this.f5482a = str;
        this.f5483b = z10;
        this.f5484c = list;
        this.f5485d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list2.add("ASC");
            }
        }
        this.f5485d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str = hVar.f5482a;
            if (this.f5483b == hVar.f5483b && this.f5484c.equals(hVar.f5484c) && j.a(this.f5485d, hVar.f5485d)) {
                String str2 = this.f5482a;
                return v.R0(str2, "index_", false) ? v.R0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5482a;
        return this.f5485d.hashCode() + ((this.f5484c.hashCode() + ((((v.R0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f5483b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f5482a);
        sb.append("',\n            |   unique = '");
        sb.append(this.f5483b);
        sb.append("',\n            |   columns = {");
        p.H0(m.l0(this.f5484c, ",", null, null, null, 62));
        p.H0("},");
        y yVar = y.f19095a;
        sb.append(yVar);
        sb.append("\n            |   orders = {");
        p.H0(m.l0(this.f5485d, ",", null, null, null, 62));
        p.H0(" }");
        sb.append(yVar);
        sb.append("\n            |}\n        ");
        return p.H0(p.J0(sb.toString()));
    }
}
