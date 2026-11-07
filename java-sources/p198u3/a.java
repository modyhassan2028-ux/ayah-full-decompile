package p198u3;

import B.f;
import N9.InterfaceC0416i;
import java.util.List;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f22880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f22881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f22882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22883w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f22880t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22878r = obj;
        this.f22879s |= Integer.MIN_VALUE;
        return this.f22880t.b(null, this);
    }
}
