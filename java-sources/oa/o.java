package oa;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20454b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.c f20456d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f20455c = p120l9.s.f19441r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final na.b f20457e = new na.b(this, android.support.v4.media.session.p.B(new StringBuilder(), la.e.f19452b, " ConnectionPool connection closer"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f20458f = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(o.class, Map.class, "c");
    }

    public o(na.d dVar, TimeUnit timeUnit, e eVar, ka.g gVar) {
        this.f20453a = eVar;
        this.f20454b = timeUnit.toNanos(5L);
        this.f20456d = dVar.d();
    }

    public final int a(n nVar, long j) {
        TimeZone timeZone = la.e.f19451a;
        ArrayList arrayList = nVar.f20451s;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + nVar.f20438d.f19285a.f19104h + " was leaked. Did you forget to close a response body?";
                ua.e eVar = ua.e.f22996a;
                ua.e.f22996a.k(((k) reference).f20419a, str);
                arrayList.remove(i10);
                if (arrayList.isEmpty()) {
                    nVar.f20452t = j - this.f20454b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
