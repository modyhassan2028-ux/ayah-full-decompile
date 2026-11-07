package p037d6;

import B.f;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f15695t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f15695t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f15693r = obj;
        this.f15694s |= Integer.MIN_VALUE;
        return this.f15695t.b(null, this);
    }
}
