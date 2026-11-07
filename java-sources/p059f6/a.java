package p059f6;

import j$.time.LocalDate;
import j$.time.chrono.HijrahDate;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LocalDate f16227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HijrahDate f16228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f16230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f16231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16232w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f16231v = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f16230u = obj;
        this.f16232w |= Integer.MIN_VALUE;
        return this.f16231v.a(null, this);
    }
}
