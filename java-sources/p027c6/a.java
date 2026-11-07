package p027c6;

import p134n3.f;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f13494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13495u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f13494t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f13493s = obj;
        this.f13495u |= Integer.MIN_VALUE;
        return this.f13494t.a(null, null, null, this);
    }
}
