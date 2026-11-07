package p057f4;

import android.content.Context;
import android.graphics.Bitmap;
import p046e4.a;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f16216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f16217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f16218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f16220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ L5.c f16221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16222x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(L5.c cVar, c cVar2) {
        super(cVar2);
        this.f16221w = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f16220v = obj;
        this.f16222x |= Integer.MIN_VALUE;
        return L5.c.j(this.f16221w, null, 0, null, this);
    }
}
