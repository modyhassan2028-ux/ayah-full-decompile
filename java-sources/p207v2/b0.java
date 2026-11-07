package p207v2;

import android.support.v4.media.session.p;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Iterator;
import java.util.List;
import p017b7.d;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f23208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f23209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23210d;

    public b0(List list, Integer num, d dVar, int i10) {
        this.f23207a = list;
        this.f23208b = num;
        this.f23209c = dVar;
        this.f23210d = i10;
    }

    public final Z a(int i10) {
        List list = this.f23207a;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Z) it.next()).f23195r.isEmpty()) {
                int size = i10 - this.f23210d;
                int i11 = 0;
                while (i11 < AbstractC0813f2.E(list) && size > AbstractC0813f2.E(((Z) list.get(i11)).f23195r)) {
                    size -= ((Z) list.get(i11)).f23195r.size();
                    i11++;
                }
                return size < 0 ? (Z) m.f0(list) : (Z) list.get(i11);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return j.a(this.f23207a, b0Var.f23207a) && j.a(this.f23208b, b0Var.f23208b) && j.a(this.f23209c, b0Var.f23209c) && this.f23210d == b0Var.f23210d;
    }

    public final int hashCode() {
        int iHashCode = this.f23207a.hashCode();
        Integer num = this.f23208b;
        return this.f23209c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0) + this.f23210d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.f23207a);
        sb.append(", anchorPosition=");
        sb.append(this.f23208b);
        sb.append(", config=");
        sb.append(this.f23209c);
        sb.append(", leadingPlaceholderCount=");
        return p.A(sb, this.f23210d, ')');
    }
}
