package L2;

import H9.p;
import java.util.ArrayList;
import p110k9.y;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5481e;

    public g(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        j.e(str, "referenceTable");
        j.e(str2, "onDelete");
        j.e(str3, "onUpdate");
        this.f5477a = str;
        this.f5478b = str2;
        this.f5479c = str3;
        this.f5480d = arrayList;
        this.f5481e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j.a(this.f5477a, gVar.f5477a) && j.a(this.f5478b, gVar.f5478b) && j.a(this.f5479c, gVar.f5479c) && this.f5480d.equals(gVar.f5480d)) {
            return this.f5481e.equals(gVar.f5481e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5481e.hashCode() + ((this.f5480d.hashCode() + p245z2.a.x(this.f5479c, p245z2.a.x(this.f5478b, this.f5477a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f5477a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f5478b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f5479c);
        sb.append("',\n            |   columnNames = {");
        p.H0(m.l0(m.x0(this.f5480d), ",", null, null, null, 62));
        p.H0("},");
        y yVar = y.f19095a;
        sb.append(yVar);
        sb.append("\n            |   referenceColumnNames = {");
        p.H0(m.l0(m.x0(this.f5481e), ",", null, null, null, 62));
        p.H0(" }");
        sb.append(yVar);
        sb.append("\n            |}\n        ");
        return p.H0(p.J0(sb.toString()));
    }
}
