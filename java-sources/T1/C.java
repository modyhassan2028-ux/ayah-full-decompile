package T1;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class C extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileInputStream f7572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f7574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7575v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d5, q9.c cVar) {
        super(cVar);
        this.f7574u = d5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7573t = obj;
        this.f7575v |= Integer.MIN_VALUE;
        return D.a(this.f7574u, this);
    }
}
