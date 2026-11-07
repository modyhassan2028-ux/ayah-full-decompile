package p057f4;

import android.content.Context;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f16199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f16201t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16202u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f16201t = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f16200s = obj;
        this.f16202u |= Integer.MIN_VALUE;
        return this.f16201t.b(null, this);
    }
}
