package p207v2;

import E5.e;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class B extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f23112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23113t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(e eVar, p150o9.c cVar) {
        super(cVar);
        this.f23112s = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23111r = obj;
        this.f23113t |= Integer.MIN_VALUE;
        return this.f23112s.a(null, this);
    }
}
