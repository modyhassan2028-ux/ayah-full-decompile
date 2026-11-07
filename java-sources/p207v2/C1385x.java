package p207v2;

import G5.b;
import q9.c;

/* JADX INFO: renamed from: v2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1385x extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f23311t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385x(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f23311t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23309r = obj;
        this.f23310s |= Integer.MIN_VALUE;
        return this.f23311t.b(null, this);
    }
}
