package p009aa;

import Da.r;
import java.util.LinkedHashMap;
import p110k9.b;
import q9.a;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f11248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f11249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinkedHashMap f11250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f11252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f11253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11254x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, a aVar) {
        super(aVar);
        this.f11253w = rVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f11252v = obj;
        this.f11254x |= Integer.MIN_VALUE;
        return r.a(this.f11253w, null, this);
    }
}
