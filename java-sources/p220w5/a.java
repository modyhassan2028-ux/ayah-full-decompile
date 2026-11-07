package p220w5;

import N9.InterfaceC0416i;
import java.util.List;
import p207v2.C1384w;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1384w f23731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f23732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f23733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23734w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1384w c1384w, p150o9.c cVar) {
        super(cVar);
        this.f23731t = c1384w;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23729r = obj;
        this.f23730s |= Integer.MIN_VALUE;
        return this.f23731t.b(null, this);
    }
}
