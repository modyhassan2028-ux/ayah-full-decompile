package p161p9;

import p110k9.a;
import p150o9.h;
import p241y9.e;
import p251z9.j;
import p251z9.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f21164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p150o9.c f21165t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p150o9.c cVar, h hVar, e eVar, p150o9.c cVar2) {
        super(cVar, hVar);
        this.f21164s = eVar;
        this.f21165t = cVar2;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21163r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f21163r = 2;
            a.e(obj);
            return obj;
        }
        this.f21163r = 1;
        a.e(obj);
        e eVar = this.f21164s;
        j.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        y.b(2, eVar);
        return eVar.invoke(this.f21165t, this);
    }
}
