package p218w3;

import J3.x;
import K9.AbstractC0405x;
import K9.H;
import K9.p0;
import N9.AbstractC0419l;
import N9.k0;
import R9.e;
import Y2.a;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import p151p.C1256n;
import p198u3.d;
import p251z9.j;
import z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1256n f23652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f23653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f23654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P9.d f23655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f23656e;

    public c(C1256n c1256n, d dVar, x xVar) {
        j.e(dVar, "bookmarksModel");
        j.e(xVar, "preferencesStore");
        this.f23652a = c1256n;
        this.f23653b = dVar;
        this.f23654c = xVar;
        p0 p0VarE = AbstractC0405x.e();
        e eVar = H.f5322a;
        this.f23655d = AbstractC0405x.b(a.Z(p0VarE, R9.d.f7436t));
        this.f23656e = AbstractC0419l.c(b.f24784b);
    }

    public final void a(int i10, int i11, BookmarkType bookmarkType) {
        AbstractC0405x.x(this.f23655d, null, new b(this, i11, null, 1), 3);
        z3.a aVar = new z3.a(i10, i11, bookmarkType);
        k0 k0Var = this.f23656e;
        k0Var.getClass();
        k0Var.n(null, aVar);
    }
}
