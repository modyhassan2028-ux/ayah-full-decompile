package p237y4;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f24631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f24632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24633t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, c cVar2) {
        super(cVar2);
        this.f24632s = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24631r = obj;
        this.f24633t |= Integer.MIN_VALUE;
        return this.f24632s.a(this);
    }
}
