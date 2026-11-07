package O3;

import B.f;
import N9.InterfaceC0416i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f6459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f6460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f6461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6462w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6459t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6457r = obj;
        this.f6458s |= Integer.MIN_VALUE;
        return this.f6459t.b(null, this);
    }
}
