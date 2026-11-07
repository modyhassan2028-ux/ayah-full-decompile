package F2;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: F2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0156a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R2.b f2253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f2254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2256f;
    public final r g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f2257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f2258i;
    public final Intent j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f2261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f2263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f2264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f2265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f2266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Q2.b f2268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p150o9.h f2269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2271w;

    public C0156a(Context context, String str, R2.b bVar, s sVar, List list, boolean z10, r rVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z13, Q2.b bVar2, p150o9.h hVar) {
        p251z9.j.e(context, "context");
        p251z9.j.e(sVar, "migrationContainer");
        p251z9.j.e(executor, "queryExecutor");
        p251z9.j.e(executor2, "transactionExecutor");
        p251z9.j.e(list2, "typeConverters");
        p251z9.j.e(list3, "autoMigrationSpecs");
        this.f2251a = context;
        this.f2252b = str;
        this.f2253c = bVar;
        this.f2254d = sVar;
        this.f2255e = list;
        this.f2256f = z10;
        this.g = rVar;
        this.f2257h = executor;
        this.f2258i = executor2;
        this.j = intent;
        this.f2259k = z11;
        this.f2260l = z12;
        this.f2261m = set;
        this.f2262n = str2;
        this.f2263o = file;
        this.f2264p = callable;
        this.f2265q = list2;
        this.f2266r = list3;
        this.f2267s = z13;
        this.f2268t = bVar2;
        this.f2269u = hVar;
        this.f2270v = intent != null;
        this.f2271w = true;
    }
}
