package p174r3;

import java.util.List;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f21524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f21525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f21526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f21527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21528v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, c cVar) {
        super(cVar);
        this.f21527u = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21526t = obj;
        this.f21528v |= Integer.MIN_VALUE;
        return l.a(this.f21527u, this);
    }
}
