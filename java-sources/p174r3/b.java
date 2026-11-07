package p174r3;

import B.f;
import N9.InterfaceC0416i;
import java.util.List;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f21509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f21511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f21512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f21513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f21511t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21509r = obj;
        this.f21510s |= Integer.MIN_VALUE;
        return this.f21511t.b(null, this);
    }
}
