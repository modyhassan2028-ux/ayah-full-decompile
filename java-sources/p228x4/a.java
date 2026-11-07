package p228x4;

import J0.C0280d0;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p246z4.a f24374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p124m3.a f24375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0280d0 f24377u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24378v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0280d0 c0280d0, c cVar) {
        super(cVar);
        this.f24377u = c0280d0;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24376t = obj;
        this.f24378v |= Integer.MIN_VALUE;
        return this.f24377u.i(this);
    }
}
