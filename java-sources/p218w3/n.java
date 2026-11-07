package p218w3;

import C4.g;
import J3.x;
import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;
import p174r3.c;
import p174r3.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f23703h = AbstractC0813f2.K("verse");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f23704i = AbstractC0813f2.L("body", "heading", "footnote", "poem", "reference");
    public static final List j = AbstractC0813f2.L("body", "heading", "footnote", "poem");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f23706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.c f23707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f23708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f23709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f23710f;
    public final g g;

    public n(Context context, c cVar, D3.c cVar2, x xVar, l lVar) {
        j.e(cVar, "bookModel");
        j.e(cVar2, "bookSource");
        j.e(xVar, "preferencesStore");
        j.e(lVar, "bookRepository");
        this.f23705a = context;
        this.f23706b = cVar;
        this.f23707c = cVar2;
        this.f23708d = xVar;
        this.f23709e = lVar;
        g gVar = new g(xVar.f4314i, this, 27);
        this.f23710f = gVar;
        this.g = gVar;
    }
}
