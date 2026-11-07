package p090i5;

import B.f;
import N9.InterfaceC0416i;
import java.util.List;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f16755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f16756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f16757v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f16755t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f16753r = obj;
        this.f16754s |= Integer.MIN_VALUE;
        return this.f16755t.b(null, this);
    }
}
