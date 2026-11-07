package O;

import p180s0.C1303l;

/* JADX INFO: renamed from: O.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439g extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f6371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f6372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6373t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439g(long j, p241y9.a aVar, boolean z10) {
        super(1);
        this.f6371r = j;
        this.f6372s = aVar;
        this.f6373t = z10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p152p0.c cVar = (p152p0.c) obj;
        return cVar.a(new F.q(this.f6372s, this.f6373t, B9.a.q(cVar, Float.intBitsToFloat((int) (cVar.f20809r.b() >> 32)) / 2.0f), new C1303l(this.f6371r, 5)));
    }
}
