package p207v2;

import F4.f;
import q9.c;

/* JADX INFO: renamed from: v2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1380s extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1381t f23287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f23288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1381t f23290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23291v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380s(C1381t c1381t, c cVar) {
        super(cVar);
        this.f23290u = c1381t;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23289t = obj;
        this.f23291v |= Integer.MIN_VALUE;
        return C1381t.a(this.f23290u, null, this);
    }
}
